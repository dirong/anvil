package trikita.anvilgen

import com.squareup.javapoet.ClassName
import com.squareup.javapoet.MethodSpec
import org.gradle.api.Plugin
import org.gradle.api.Project

public class AnvilGenPlugin implements Plugin<Project> {

    static class BuilderLock {
        def locked = false
    }

    static {
        MethodSpec.Builder.mixin BuilderLock
    }

    @Override
    void apply(Project project) {
        // Add the 'anvilgen' extension object
        project.extensions.create("anvilgen", AnvilGenPluginExtension)

        project.afterEvaluate { generateTasks(it) }
    }

    def generateTasks(Project project) {
        def type = project.anvilgen.type
        if (type == "sdk") {
            // Most practical API versions according to Android Dashboards:
            // - newer than API level 15 (ICS 4.0.3, 97.3% of devices)
            // - newer than API level 19 (KK 4.0.3, 72.7% of devices)
            // - newer than API level 21 (LP 5.0, 38.4% of devices)
            project.task(type: DSLGeneratorTask, "generateSDK21DSL", getSDKClosure(project, 21))
            project.task(type: DSLGeneratorTask, "generateSDK19DSL", getSDKClosure(project, 19))
            project.task(type: DSLGeneratorTask, "generateSDK15DSL", getSDKClosure(project, 15))

            project.task(dependsOn: ["generateSDK15DSL", "generateSDK19DSL", "generateSDK21DSL"], "generateSDKDSL")
        } else {
            def version = project.anvilgen.version
            def camelCaseName = project.anvilgen.camelCaseName
            def libraryName = project.anvilgen.libraryName
            def dependencies = project.anvilgen.dependencies
            project.task(type: DSLGeneratorTask, dependsOn: ["prepareReleaseDependencies"],
                    "generate${camelCaseName}DSL",
                    getSupportClosure(project, camelCaseName, libraryName, version, dependencies))
        }
    }

    def getSDKClosure(project, apiLevel) {
        return {
            taskName = "generateSDK${apiLevel}DSL"
            javadocContains = "It contains views and their setters from API level ${apiLevel}"
            outputDirectory = "sdk${apiLevel}"
            jarFile = getAndroidJar(project, apiLevel)
            dependencies = []
            outputClassName = "DSL"
            packageName = "trikita.anvil"
            superclass = ClassName.get("trikita.anvil", "BaseDSL")
        }
    }

    def getSupportClosure(project, camelCaseName, libraryName, version, rawDeps) {
        return {
            taskName = "generate${camelCaseName}DSL"
            javadocContains = "It contains views and their setters from the library ${libraryName}"
            outputDirectory = "main"
            jarFile = getSupportJar(project, libraryName, version)
            dependencies = getSupportDependencies(project, version, rawDeps)
            outputClassName = "${camelCaseName}DSL"
            packageName = "trikita.anvil." + dashToDot(libraryName)
        }
    }

    def dashToDot(libraryName) {
        if (!libraryName || libraryName.isAllWhitespace()) {
            return ''
        }
        return libraryName.replaceAll("-", ".")
    }

    def getSupportDependencies(project, version, Map<String, List<String>> rawDeps) {
        return rawDeps.collect { entry ->
            entry.value.collect {
                getInternalSupportJar(project, entry.key, version, it ?: "classes")
            }
        }.inject([]) { temp, val ->
            temp.addAll(val)
            temp
        } << getAndroidJar(project, 19)
    }

    def getAndroidJar(project, api) {
        def rootDir = project.rootDir
        def localProperties = new File(rootDir, "local.properties")
        def sdkDir
        if (localProperties.exists()) {
            Properties properties = new Properties()
            localProperties.withInputStream { instr -> properties.load(instr) }
            sdkDir = properties.getProperty('sdk.dir')
        } else {
            sdkDir = System.getenv('ANDROID_HOME')
        }
        return new File(sdkDir + "/platforms/android-" + api + "/android.jar")
    }

    def getSupportJar(project, libraryName, version) {
        return new File(project.buildDir.absoluteFile,
                "intermediates/exploded-aar/com.android.support/$libraryName/$version/jars/classes.jar")
    }

    def getInternalSupportJar(project, libraryName, version, internalJar) {
        return new File(project.buildDir.absoluteFile,
                "intermediates/exploded-aar/com.android.support/$libraryName/$version/jars/${internalJar}.jar")
    }
}
