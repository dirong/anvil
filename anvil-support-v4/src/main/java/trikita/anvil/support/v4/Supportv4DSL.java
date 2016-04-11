package trikita.anvil.support.v4;

import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v4.widget.Space;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.TabHost;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import java.lang.Void;
import trikita.anvil.Anvil;
import trikita.anvil.BaseDSL;

/**
 * DSL for creating views and settings their attributes.
 * This file has been generated by {@code gradle generateSupportv4DSL}.
 * It contains views and their setters from the library support-v4.
 * Please, don't edit it manually unless for debugging.
 */
public final class Supportv4DSL {
  public static BaseDSL.ViewClassResult fragmentTabHost() {
    return BaseDSL.v(FragmentTabHost.class);
  }

  public static Void fragmentTabHost(Anvil.Renderable r) {
    return BaseDSL.v(FragmentTabHost.class, r);
  }

  public static BaseDSL.ViewClassResult pagerTabStrip() {
    return BaseDSL.v(PagerTabStrip.class);
  }

  public static Void pagerTabStrip(Anvil.Renderable r) {
    return BaseDSL.v(PagerTabStrip.class, r);
  }

  public static BaseDSL.ViewClassResult pagerTitleStrip() {
    return BaseDSL.v(PagerTitleStrip.class);
  }

  public static Void pagerTitleStrip(Anvil.Renderable r) {
    return BaseDSL.v(PagerTitleStrip.class, r);
  }

  public static BaseDSL.ViewClassResult viewPager() {
    return BaseDSL.v(ViewPager.class);
  }

  public static Void viewPager(Anvil.Renderable r) {
    return BaseDSL.v(ViewPager.class, r);
  }

  public static BaseDSL.ViewClassResult contentLoadingProgressBar() {
    return BaseDSL.v(ContentLoadingProgressBar.class);
  }

  public static Void contentLoadingProgressBar(Anvil.Renderable r) {
    return BaseDSL.v(ContentLoadingProgressBar.class, r);
  }

  public static BaseDSL.ViewClassResult drawerLayout() {
    return BaseDSL.v(DrawerLayout.class);
  }

  public static Void drawerLayout(Anvil.Renderable r) {
    return BaseDSL.v(DrawerLayout.class, r);
  }

  public static BaseDSL.ViewClassResult nestedScrollView() {
    return BaseDSL.v(NestedScrollView.class);
  }

  public static Void nestedScrollView(Anvil.Renderable r) {
    return BaseDSL.v(NestedScrollView.class, r);
  }

  public static BaseDSL.ViewClassResult slidingPaneLayout() {
    return BaseDSL.v(SlidingPaneLayout.class);
  }

  public static Void slidingPaneLayout(Anvil.Renderable r) {
    return BaseDSL.v(SlidingPaneLayout.class, r);
  }

  public static BaseDSL.ViewClassResult space() {
    return BaseDSL.v(Space.class);
  }

  public static Void space(Anvil.Renderable r) {
    return BaseDSL.v(Space.class, r);
  }

  public static BaseDSL.ViewClassResult swipeRefreshLayout() {
    return BaseDSL.v(SwipeRefreshLayout.class);
  }

  public static Void swipeRefreshLayout(Anvil.Renderable r) {
    return BaseDSL.v(SwipeRefreshLayout.class, r);
  }

  public static Void adapter(PagerAdapter arg) {
    return BaseDSL.attr(AdapterFuncdc294743.instance, arg);
  }

  public static Void backgroundColor(int arg) {
    return BaseDSL.attr(BackgroundColorFunc8567756a.instance, arg);
  }

  public static Void backgroundDrawable(Drawable arg) {
    return BaseDSL.attr(BackgroundDrawableFuncfb47464a.instance, arg);
  }

  public static Void backgroundResource(int arg) {
    return BaseDSL.attr(BackgroundResourceFunc8567756a.instance, arg);
  }

  public static Void colorScheme(int[] arg) {
    return BaseDSL.attr(ColorSchemeFunc5fb6391.instance, arg);
  }

  public static Void colorSchemeColors(int[] arg) {
    return BaseDSL.attr(ColorSchemeColorsFunc5fb6391.instance, arg);
  }

  public static Void colorSchemeResources(int[] arg) {
    return BaseDSL.attr(ColorSchemeResourcesFunc5fb6391.instance, arg);
  }

  public static Void coveredFadeColor(int arg) {
    return BaseDSL.attr(CoveredFadeColorFunc8567756a.instance, arg);
  }

  public static Void currentItem(int arg) {
    return BaseDSL.attr(CurrentItemFunc8567756a.instance, arg);
  }

  public static Void distanceToTriggerSync(int arg) {
    return BaseDSL.attr(DistanceToTriggerSyncFunc8567756a.instance, arg);
  }

  public static Void drawFullUnderline(boolean arg) {
    return BaseDSL.attr(DrawFullUnderlineFunc148d6054.instance, arg);
  }

  public static Void drawerElevation(float arg) {
    return BaseDSL.attr(DrawerElevationFunce0893188.instance, arg);
  }

  public static Void drawerListener(DrawerLayout.DrawerListener arg) {
    return BaseDSL.attr(DrawerListenerFunc17bd5440.instance, arg);
  }

  public static Void drawerLockMode(int arg) {
    return BaseDSL.attr(DrawerLockModeFunc8567756a.instance, arg);
  }

  public static Void fillViewport(boolean arg) {
    return BaseDSL.attr(FillViewportFunc148d6054.instance, arg);
  }

  public static Void gravity(int arg) {
    return BaseDSL.attr(GravityFunc8567756a.instance, arg);
  }

  public static Void nestedScrollingEnabled(boolean arg) {
    return BaseDSL.attr(NestedScrollingEnabledFunc148d6054.instance, arg);
  }

  public static Void nonPrimaryAlpha(float arg) {
    return BaseDSL.attr(NonPrimaryAlphaFunce0893188.instance, arg);
  }

  public static Void offscreenPageLimit(int arg) {
    return BaseDSL.attr(OffscreenPageLimitFunc8567756a.instance, arg);
  }

  public static Void onPageChange(ViewPager.OnPageChangeListener arg) {
    return BaseDSL.attr(OnPageChangeFunc248abe99.instance, arg);
  }

  public static Void onRefresh(SwipeRefreshLayout.OnRefreshListener arg) {
    return BaseDSL.attr(OnRefreshFunc6ab1eac5.instance, arg);
  }

  public static Void onScrollChange(NestedScrollView.OnScrollChangeListener arg) {
    return BaseDSL.attr(OnScrollChangeFunc220ef5fd.instance, arg);
  }

  public static Void onTabChanged(TabHost.OnTabChangeListener arg) {
    return BaseDSL.attr(OnTabChangedFunc2d645be.instance, arg);
  }

  public static Void pageMargin(int arg) {
    return BaseDSL.attr(PageMarginFunc8567756a.instance, arg);
  }

  public static Void pageMarginDrawable(Drawable arg) {
    return BaseDSL.attr(PageMarginDrawableFuncfb47464a.instance, arg);
  }

  public static Void pageMarginDrawable(int arg) {
    return BaseDSL.attr(PageMarginDrawableFunc8567756a.instance, arg);
  }

  public static Void panelSlideListener(SlidingPaneLayout.PanelSlideListener arg) {
    return BaseDSL.attr(PanelSlideListenerFuncf9ef21a7.instance, arg);
  }

  public static Void parallaxDistance(int arg) {
    return BaseDSL.attr(ParallaxDistanceFunc8567756a.instance, arg);
  }

  public static Void progressBackgroundColor(int arg) {
    return BaseDSL.attr(ProgressBackgroundColorFunc8567756a.instance, arg);
  }

  public static Void progressBackgroundColorSchemeColor(int arg) {
    return BaseDSL.attr(ProgressBackgroundColorSchemeColorFunc8567756a.instance, arg);
  }

  public static Void progressBackgroundColorSchemeResource(int arg) {
    return BaseDSL.attr(ProgressBackgroundColorSchemeResourceFunc8567756a.instance, arg);
  }

  public static Void refreshing(boolean arg) {
    return BaseDSL.attr(RefreshingFunc148d6054.instance, arg);
  }

  public static Void scrimColor(int arg) {
    return BaseDSL.attr(ScrimColorFunc8567756a.instance, arg);
  }

  public static Void shadowDrawable(Drawable arg) {
    return BaseDSL.attr(ShadowDrawableFuncfb47464a.instance, arg);
  }

  public static Void shadowDrawableLeft(Drawable arg) {
    return BaseDSL.attr(ShadowDrawableLeftFuncfb47464a.instance, arg);
  }

  public static Void shadowDrawableRight(Drawable arg) {
    return BaseDSL.attr(ShadowDrawableRightFuncfb47464a.instance, arg);
  }

  public static Void shadowResource(int arg) {
    return BaseDSL.attr(ShadowResourceFunc8567756a.instance, arg);
  }

  public static Void shadowResourceLeft(int arg) {
    return BaseDSL.attr(ShadowResourceLeftFunc8567756a.instance, arg);
  }

  public static Void shadowResourceRight(int arg) {
    return BaseDSL.attr(ShadowResourceRightFunc8567756a.instance, arg);
  }

  public static Void size(int arg) {
    return BaseDSL.attr(SizeFunc8567756a.instance, arg);
  }

  public static Void sliderFadeColor(int arg) {
    return BaseDSL.attr(SliderFadeColorFunc8567756a.instance, arg);
  }

  public static Void smoothScrollingEnabled(boolean arg) {
    return BaseDSL.attr(SmoothScrollingEnabledFunc148d6054.instance, arg);
  }

  public static Void statusBarBackground(Drawable arg) {
    return BaseDSL.attr(StatusBarBackgroundFuncfb47464a.instance, arg);
  }

  public static Void statusBarBackground(int arg) {
    return BaseDSL.attr(StatusBarBackgroundFunc8567756a.instance, arg);
  }

  public static Void statusBarBackgroundColor(int arg) {
    return BaseDSL.attr(StatusBarBackgroundColorFunc8567756a.instance, arg);
  }

  public static Void tabIndicatorColor(int arg) {
    return BaseDSL.attr(TabIndicatorColorFunc8567756a.instance, arg);
  }

  public static Void tabIndicatorColorResource(int arg) {
    return BaseDSL.attr(TabIndicatorColorResourceFunc8567756a.instance, arg);
  }

  public static Void textColor(int arg) {
    return BaseDSL.attr(TextColorFunc8567756a.instance, arg);
  }

  public static Void textSpacing(int arg) {
    return BaseDSL.attr(TextSpacingFunc8567756a.instance, arg);
  }

  private static final class AdapterFuncdc294743 implements Anvil.AttrFunc<PagerAdapter> {
    public static final AdapterFuncdc294743 instance = new AdapterFuncdc294743();

    public void apply(View v, final PagerAdapter arg, final PagerAdapter old) {
      if (v instanceof ViewPager) {
        ((ViewPager) v).setAdapter(arg);
      }
    }
  }

  private static final class BackgroundColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final BackgroundColorFunc8567756a instance = new BackgroundColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof PagerTabStrip) {
        ((PagerTabStrip) v).setBackgroundColor(arg);
      }
    }
  }

  private static final class BackgroundDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final BackgroundDrawableFuncfb47464a instance = new BackgroundDrawableFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof PagerTabStrip) {
        ((PagerTabStrip) v).setBackgroundDrawable(arg);
      }
    }
  }

  private static final class BackgroundResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final BackgroundResourceFunc8567756a instance = new BackgroundResourceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof PagerTabStrip) {
        ((PagerTabStrip) v).setBackgroundResource(arg);
      }
    }
  }

  private static final class ColorSchemeFunc5fb6391 implements Anvil.AttrFunc<int[]> {
    public static final ColorSchemeFunc5fb6391 instance = new ColorSchemeFunc5fb6391();

    public void apply(View v, final int[] arg, final int[] old) {
      if (v instanceof SwipeRefreshLayout) {
        ((SwipeRefreshLayout) v).setColorScheme(arg);
      }
    }
  }

  private static final class ColorSchemeColorsFunc5fb6391 implements Anvil.AttrFunc<int[]> {
    public static final ColorSchemeColorsFunc5fb6391 instance = new ColorSchemeColorsFunc5fb6391();

    public void apply(View v, final int[] arg, final int[] old) {
      if (v instanceof SwipeRefreshLayout) {
        ((SwipeRefreshLayout) v).setColorSchemeColors(arg);
      }
    }
  }

  private static final class ColorSchemeResourcesFunc5fb6391 implements Anvil.AttrFunc<int[]> {
    public static final ColorSchemeResourcesFunc5fb6391 instance = new ColorSchemeResourcesFunc5fb6391();

    public void apply(View v, final int[] arg, final int[] old) {
      if (v instanceof SwipeRefreshLayout) {
        ((SwipeRefreshLayout) v).setColorSchemeResources(arg);
      }
    }
  }

  private static final class CoveredFadeColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final CoveredFadeColorFunc8567756a instance = new CoveredFadeColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof SlidingPaneLayout) {
        ((SlidingPaneLayout) v).setCoveredFadeColor(arg);
      }
    }
  }

  private static final class CurrentItemFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final CurrentItemFunc8567756a instance = new CurrentItemFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ViewPager) {
        ((ViewPager) v).setCurrentItem(arg);
      }
    }
  }

  private static final class DistanceToTriggerSyncFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final DistanceToTriggerSyncFunc8567756a instance = new DistanceToTriggerSyncFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof SwipeRefreshLayout) {
        ((SwipeRefreshLayout) v).setDistanceToTriggerSync(arg);
      }
    }
  }

  private static final class DrawFullUnderlineFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final DrawFullUnderlineFunc148d6054 instance = new DrawFullUnderlineFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof PagerTabStrip) {
        ((PagerTabStrip) v).setDrawFullUnderline(arg);
      }
    }
  }

  private static final class DrawerElevationFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final DrawerElevationFunce0893188 instance = new DrawerElevationFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof DrawerLayout) {
        ((DrawerLayout) v).setDrawerElevation(arg);
      }
    }
  }

  private static final class DrawerListenerFunc17bd5440 implements Anvil.AttrFunc<DrawerLayout.DrawerListener> {
    public static final DrawerListenerFunc17bd5440 instance = new DrawerListenerFunc17bd5440();

    public void apply(View v, final DrawerLayout.DrawerListener arg, final DrawerLayout.DrawerListener old) {
      if (v instanceof DrawerLayout) {
        ((DrawerLayout) v).setDrawerListener(arg);
      }
    }
  }

  private static final class DrawerLockModeFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final DrawerLockModeFunc8567756a instance = new DrawerLockModeFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof DrawerLayout) {
        ((DrawerLayout) v).setDrawerLockMode(arg);
      }
    }
  }

  private static final class FillViewportFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final FillViewportFunc148d6054 instance = new FillViewportFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof NestedScrollView) {
        ((NestedScrollView) v).setFillViewport(arg);
      }
    }
  }

  private static final class GravityFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final GravityFunc8567756a instance = new GravityFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof PagerTitleStrip) {
        ((PagerTitleStrip) v).setGravity(arg);
      }
    }
  }

  private static final class NestedScrollingEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final NestedScrollingEnabledFunc148d6054 instance = new NestedScrollingEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof NestedScrollView) {
        ((NestedScrollView) v).setNestedScrollingEnabled(arg);
      }
      if (v instanceof SwipeRefreshLayout) {
        ((SwipeRefreshLayout) v).setNestedScrollingEnabled(arg);
      }
    }
  }

  private static final class NonPrimaryAlphaFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final NonPrimaryAlphaFunce0893188 instance = new NonPrimaryAlphaFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof PagerTitleStrip) {
        ((PagerTitleStrip) v).setNonPrimaryAlpha(arg);
      }
    }
  }

  private static final class OffscreenPageLimitFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final OffscreenPageLimitFunc8567756a instance = new OffscreenPageLimitFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ViewPager) {
        ((ViewPager) v).setOffscreenPageLimit(arg);
      }
    }
  }

  private static final class OnPageChangeFunc248abe99 implements Anvil.AttrFunc<ViewPager.OnPageChangeListener> {
    public static final OnPageChangeFunc248abe99 instance = new OnPageChangeFunc248abe99();

    public void apply(View v, final ViewPager.OnPageChangeListener arg, final ViewPager.OnPageChangeListener old) {
      if (v instanceof ViewPager) {
        if (arg != null) {
          ((ViewPager) v).setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            public void onPageScrollStateChanged(int a0) {
              arg.onPageScrollStateChanged(a0);
              Anvil.render();
            }

            public void onPageScrolled(int a0, float a1, int a2) {
              arg.onPageScrolled(a0, a1, a2);
              Anvil.render();
            }

            public void onPageSelected(int a0) {
              arg.onPageSelected(a0);
              Anvil.render();
            }
          });
        } else {
          ((ViewPager) v).setOnPageChangeListener((ViewPager.OnPageChangeListener) null);
        }
      }
    }
  }

  private static final class OnRefreshFunc6ab1eac5 implements Anvil.AttrFunc<SwipeRefreshLayout.OnRefreshListener> {
    public static final OnRefreshFunc6ab1eac5 instance = new OnRefreshFunc6ab1eac5();

    public void apply(View v, final SwipeRefreshLayout.OnRefreshListener arg, final SwipeRefreshLayout.OnRefreshListener old) {
      if (v instanceof SwipeRefreshLayout) {
        if (arg != null) {
          ((SwipeRefreshLayout) v).setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            public void onRefresh() {
              arg.onRefresh();
              Anvil.render();
            }
          });
        } else {
          ((SwipeRefreshLayout) v).setOnRefreshListener((SwipeRefreshLayout.OnRefreshListener) null);
        }
      }
    }
  }

  private static final class OnScrollChangeFunc220ef5fd implements Anvil.AttrFunc<NestedScrollView.OnScrollChangeListener> {
    public static final OnScrollChangeFunc220ef5fd instance = new OnScrollChangeFunc220ef5fd();

    public void apply(View v, final NestedScrollView.OnScrollChangeListener arg, final NestedScrollView.OnScrollChangeListener old) {
      if (v instanceof NestedScrollView) {
        if (arg != null) {
          ((NestedScrollView) v).setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            public void onScrollChange(NestedScrollView a0, int a1, int a2, int a3, int a4) {
              arg.onScrollChange(a0, a1, a2, a3, a4);
              Anvil.render();
            }
          });
        } else {
          ((NestedScrollView) v).setOnScrollChangeListener((NestedScrollView.OnScrollChangeListener) null);
        }
      }
    }
  }

  private static final class OnTabChangedFunc2d645be implements Anvil.AttrFunc<TabHost.OnTabChangeListener> {
    public static final OnTabChangedFunc2d645be instance = new OnTabChangedFunc2d645be();

    public void apply(View v, final TabHost.OnTabChangeListener arg, final TabHost.OnTabChangeListener old) {
      if (v instanceof FragmentTabHost) {
        if (arg != null) {
          ((FragmentTabHost) v).setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            public void onTabChanged(String a0) {
              arg.onTabChanged(a0);
              Anvil.render();
            }
          });
        } else {
          ((FragmentTabHost) v).setOnTabChangedListener((TabHost.OnTabChangeListener) null);
        }
      }
    }
  }

  private static final class PageMarginFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final PageMarginFunc8567756a instance = new PageMarginFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ViewPager) {
        ((ViewPager) v).setPageMargin(arg);
      }
    }
  }

  private static final class PageMarginDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final PageMarginDrawableFuncfb47464a instance = new PageMarginDrawableFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ViewPager) {
        ((ViewPager) v).setPageMarginDrawable(arg);
      }
    }
  }

  private static final class PageMarginDrawableFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final PageMarginDrawableFunc8567756a instance = new PageMarginDrawableFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ViewPager) {
        ((ViewPager) v).setPageMarginDrawable(arg);
      }
    }
  }

  private static final class PanelSlideListenerFuncf9ef21a7 implements Anvil.AttrFunc<SlidingPaneLayout.PanelSlideListener> {
    public static final PanelSlideListenerFuncf9ef21a7 instance = new PanelSlideListenerFuncf9ef21a7();

    public void apply(View v, final SlidingPaneLayout.PanelSlideListener arg, final SlidingPaneLayout.PanelSlideListener old) {
      if (v instanceof SlidingPaneLayout) {
        ((SlidingPaneLayout) v).setPanelSlideListener(arg);
      }
    }
  }

  private static final class ParallaxDistanceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ParallaxDistanceFunc8567756a instance = new ParallaxDistanceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof SlidingPaneLayout) {
        ((SlidingPaneLayout) v).setParallaxDistance(arg);
      }
    }
  }

  private static final class ProgressBackgroundColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ProgressBackgroundColorFunc8567756a instance = new ProgressBackgroundColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof SwipeRefreshLayout) {
        ((SwipeRefreshLayout) v).setProgressBackgroundColor(arg);
      }
    }
  }

  private static final class ProgressBackgroundColorSchemeColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ProgressBackgroundColorSchemeColorFunc8567756a instance = new ProgressBackgroundColorSchemeColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof SwipeRefreshLayout) {
        ((SwipeRefreshLayout) v).setProgressBackgroundColorSchemeColor(arg);
      }
    }
  }

  private static final class ProgressBackgroundColorSchemeResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ProgressBackgroundColorSchemeResourceFunc8567756a instance = new ProgressBackgroundColorSchemeResourceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof SwipeRefreshLayout) {
        ((SwipeRefreshLayout) v).setProgressBackgroundColorSchemeResource(arg);
      }
    }
  }

  private static final class RefreshingFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final RefreshingFunc148d6054 instance = new RefreshingFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof SwipeRefreshLayout) {
        ((SwipeRefreshLayout) v).setRefreshing(arg);
      }
    }
  }

  private static final class ScrimColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ScrimColorFunc8567756a instance = new ScrimColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof DrawerLayout) {
        ((DrawerLayout) v).setScrimColor(arg);
      }
    }
  }

  private static final class ShadowDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final ShadowDrawableFuncfb47464a instance = new ShadowDrawableFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof SlidingPaneLayout) {
        ((SlidingPaneLayout) v).setShadowDrawable(arg);
      }
    }
  }

  private static final class ShadowDrawableLeftFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final ShadowDrawableLeftFuncfb47464a instance = new ShadowDrawableLeftFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof SlidingPaneLayout) {
        ((SlidingPaneLayout) v).setShadowDrawableLeft(arg);
      }
    }
  }

  private static final class ShadowDrawableRightFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final ShadowDrawableRightFuncfb47464a instance = new ShadowDrawableRightFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof SlidingPaneLayout) {
        ((SlidingPaneLayout) v).setShadowDrawableRight(arg);
      }
    }
  }

  private static final class ShadowResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ShadowResourceFunc8567756a instance = new ShadowResourceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof SlidingPaneLayout) {
        ((SlidingPaneLayout) v).setShadowResource(arg);
      }
    }
  }

  private static final class ShadowResourceLeftFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ShadowResourceLeftFunc8567756a instance = new ShadowResourceLeftFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof SlidingPaneLayout) {
        ((SlidingPaneLayout) v).setShadowResourceLeft(arg);
      }
    }
  }

  private static final class ShadowResourceRightFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ShadowResourceRightFunc8567756a instance = new ShadowResourceRightFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof SlidingPaneLayout) {
        ((SlidingPaneLayout) v).setShadowResourceRight(arg);
      }
    }
  }

  private static final class SizeFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final SizeFunc8567756a instance = new SizeFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof SwipeRefreshLayout) {
        ((SwipeRefreshLayout) v).setSize(arg);
      }
    }
  }

  private static final class SliderFadeColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final SliderFadeColorFunc8567756a instance = new SliderFadeColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof SlidingPaneLayout) {
        ((SlidingPaneLayout) v).setSliderFadeColor(arg);
      }
    }
  }

  private static final class SmoothScrollingEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final SmoothScrollingEnabledFunc148d6054 instance = new SmoothScrollingEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof NestedScrollView) {
        ((NestedScrollView) v).setSmoothScrollingEnabled(arg);
      }
    }
  }

  private static final class StatusBarBackgroundFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final StatusBarBackgroundFuncfb47464a instance = new StatusBarBackgroundFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof DrawerLayout) {
        ((DrawerLayout) v).setStatusBarBackground(arg);
      }
    }
  }

  private static final class StatusBarBackgroundFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final StatusBarBackgroundFunc8567756a instance = new StatusBarBackgroundFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof DrawerLayout) {
        ((DrawerLayout) v).setStatusBarBackground(arg);
      }
    }
  }

  private static final class StatusBarBackgroundColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final StatusBarBackgroundColorFunc8567756a instance = new StatusBarBackgroundColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof DrawerLayout) {
        ((DrawerLayout) v).setStatusBarBackgroundColor(arg);
      }
    }
  }

  private static final class TabIndicatorColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final TabIndicatorColorFunc8567756a instance = new TabIndicatorColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof PagerTabStrip) {
        ((PagerTabStrip) v).setTabIndicatorColor(arg);
      }
    }
  }

  private static final class TabIndicatorColorResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final TabIndicatorColorResourceFunc8567756a instance = new TabIndicatorColorResourceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof PagerTabStrip) {
        ((PagerTabStrip) v).setTabIndicatorColorResource(arg);
      }
    }
  }

  private static final class TextColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final TextColorFunc8567756a instance = new TextColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof PagerTitleStrip) {
        ((PagerTitleStrip) v).setTextColor(arg);
      }
    }
  }

  private static final class TextSpacingFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final TextSpacingFunc8567756a instance = new TextSpacingFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof PagerTabStrip) {
        ((PagerTabStrip) v).setTextSpacing(arg);
      }
      if (v instanceof PagerTitleStrip) {
        ((PagerTitleStrip) v).setTextSpacing(arg);
      }
    }
  }
}
