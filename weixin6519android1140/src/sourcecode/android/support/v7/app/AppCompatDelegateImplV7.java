package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.u;
import android.support.v4.view.ae;
import android.support.v4.view.ai;
import android.support.v4.view.an;
import android.support.v4.view.ap;
import android.support.v4.view.z;
import android.support.v7.a.a.a;
import android.support.v7.a.a.c;
import android.support.v7.a.a.f;
import android.support.v7.a.a.h;
import android.support.v7.a.a.j;
import android.support.v7.a.a.k;
import android.support.v7.view.b.a;
import android.support.v7.view.d;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.view.menu.e.a;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.view.menu.l.a;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.AppCompatSeekBar;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ContentFrameLayout.a;
import android.support.v7.widget.am;
import android.support.v7.widget.ar;
import android.support.v7.widget.at;
import android.support.v7.widget.x;
import android.support.v7.widget.x.a;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;

class AppCompatDelegateImplV7
  extends e
  implements android.support.v4.view.k, f.a
{
  private TextView EN;
  android.support.v7.widget.t Gb;
  private a Gc;
  private d Gd;
  android.support.v7.view.b Ge;
  ActionBarContextView Gf;
  PopupWindow Gg;
  Runnable Gh;
  ai Gi = null;
  private boolean Gj;
  ViewGroup Gk;
  private View Gl;
  private boolean Gm;
  private boolean Gn;
  private boolean Go;
  private PanelFeatureState[] Gp;
  private PanelFeatureState Gq;
  private boolean Gr;
  public boolean Gs;
  public int Gt;
  private final Runnable Gu = new Runnable()
  {
    public final void run()
    {
      if ((AppCompatDelegateImplV7.this.Gt & 0x1) != 0) {
        AppCompatDelegateImplV7.this.av(0);
      }
      if ((AppCompatDelegateImplV7.this.Gt & 0x1000) != 0) {
        AppCompatDelegateImplV7.this.av(108);
      }
      AppCompatDelegateImplV7.this.Gs = false;
      AppCompatDelegateImplV7.this.Gt = 0;
    }
  };
  private boolean Gv;
  private j Gw;
  private Rect gs;
  private Rect gt;
  
  AppCompatDelegateImplV7(Context paramContext, Window paramWindow, c paramc)
  {
    super(paramContext, paramWindow, paramc);
  }
  
  private void a(PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    int k = -1;
    if ((paramPanelFeatureState.Dg) || (this.FS)) {}
    Object localObject1;
    int i;
    label115:
    label120:
    label124:
    label126:
    Object localObject2;
    label266:
    do
    {
      do
      {
        for (;;)
        {
          return;
          if (paramPanelFeatureState.GB == 0)
          {
            localObject1 = this.mContext;
            if ((((Context)localObject1).getResources().getConfiguration().screenLayout & 0xF) != 4) {
              break label115;
            }
            i = 1;
            if (((Context)localObject1).getApplicationInfo().targetSdkVersion < 11) {
              break label120;
            }
          }
          for (int j = 1;; j = 0)
          {
            if ((i != 0) && (j != 0)) {
              break label124;
            }
            localObject1 = this.Et.getCallback();
            if ((localObject1 == null) || (((Window.Callback)localObject1).onMenuOpened(paramPanelFeatureState.GB, paramPanelFeatureState.GF))) {
              break label126;
            }
            a(paramPanelFeatureState, true);
            return;
            i = 0;
            break;
          }
        }
        localObject1 = (WindowManager)this.mContext.getSystemService("window");
      } while ((localObject1 == null) || (!b(paramPanelFeatureState, paramKeyEvent)));
      if ((paramPanelFeatureState.GC != null) && (!paramPanelFeatureState.GL)) {
        break label826;
      }
      if (paramPanelFeatureState.GC != null) {
        break label581;
      }
      localObject2 = cU();
      TypedValue localTypedValue = new TypedValue();
      paramKeyEvent = ((Context)localObject2).getResources().newTheme();
      paramKeyEvent.setTo(((Context)localObject2).getTheme());
      paramKeyEvent.resolveAttribute(a.a.actionBarPopupTheme, localTypedValue, true);
      if (localTypedValue.resourceId != 0) {
        paramKeyEvent.applyStyle(localTypedValue.resourceId, true);
      }
      paramKeyEvent.resolveAttribute(a.a.panelMenuListTheme, localTypedValue, true);
      if (localTypedValue.resourceId == 0) {
        break;
      }
      paramKeyEvent.applyStyle(localTypedValue.resourceId, true);
      localObject2 = new d((Context)localObject2, 0);
      ((Context)localObject2).getTheme().setTo(paramKeyEvent);
      paramPanelFeatureState.GH = ((Context)localObject2);
      paramKeyEvent = ((Context)localObject2).obtainStyledAttributes(a.k.AppCompatTheme);
      paramPanelFeatureState.background = paramKeyEvent.getResourceId(a.k.AppCompatTheme_panelBackground, 0);
      paramPanelFeatureState.windowAnimations = paramKeyEvent.getResourceId(a.k.AppCompatTheme_android_windowAnimationStyle, 0);
      paramKeyEvent.recycle();
      paramPanelFeatureState.GC = new c(paramPanelFeatureState.GH);
      paramPanelFeatureState.gravity = 81;
    } while (paramPanelFeatureState.GC == null);
    label359:
    if (paramPanelFeatureState.GE != null)
    {
      paramPanelFeatureState.GD = paramPanelFeatureState.GE;
      i = 1;
      label376:
      if (i == 0) {
        break label799;
      }
      if (paramPanelFeatureState.GD == null) {
        break label821;
      }
      if (paramPanelFeatureState.GE == null) {
        break label801;
      }
      i = 1;
      label396:
      if (i == 0) {
        break label824;
      }
      paramKeyEvent = paramPanelFeatureState.GD.getLayoutParams();
      if (paramKeyEvent != null) {
        break label862;
      }
      paramKeyEvent = new ViewGroup.LayoutParams(-2, -2);
    }
    label581:
    label796:
    label799:
    label801:
    label821:
    label824:
    label826:
    label862:
    for (;;)
    {
      i = paramPanelFeatureState.background;
      paramPanelFeatureState.GC.setBackgroundResource(i);
      localObject2 = paramPanelFeatureState.GD.getParent();
      if ((localObject2 != null) && ((localObject2 instanceof ViewGroup))) {
        ((ViewGroup)localObject2).removeView(paramPanelFeatureState.GD);
      }
      paramPanelFeatureState.GC.addView(paramPanelFeatureState.GD, paramKeyEvent);
      if (!paramPanelFeatureState.GD.hasFocus()) {
        paramPanelFeatureState.GD.requestFocus();
      }
      i = -2;
      for (;;)
      {
        paramPanelFeatureState.GJ = false;
        paramKeyEvent = new WindowManager.LayoutParams(i, -2, paramPanelFeatureState.x, paramPanelFeatureState.y, 1002, 8519680, -3);
        paramKeyEvent.gravity = paramPanelFeatureState.gravity;
        paramKeyEvent.windowAnimations = paramPanelFeatureState.windowAnimations;
        ((WindowManager)localObject1).addView(paramPanelFeatureState.GC, paramKeyEvent);
        paramPanelFeatureState.Dg = true;
        return;
        paramKeyEvent.applyStyle(a.j.Theme_AppCompat_CompactMenu, true);
        break label266;
        if ((!paramPanelFeatureState.GL) || (paramPanelFeatureState.GC.getChildCount() <= 0)) {
          break label359;
        }
        paramPanelFeatureState.GC.removeAllViews();
        break label359;
        if (paramPanelFeatureState.GF != null)
        {
          if (this.Gd == null) {
            this.Gd = new d();
          }
          paramKeyEvent = this.Gd;
          if (paramPanelFeatureState.GF == null) {}
          for (paramKeyEvent = null;; paramKeyEvent = paramKeyEvent.JZ)
          {
            paramPanelFeatureState.GD = ((View)paramKeyEvent);
            if (paramPanelFeatureState.GD == null) {
              break label796;
            }
            i = 1;
            break;
            if (paramPanelFeatureState.GG == null)
            {
              paramPanelFeatureState.GG = new android.support.v7.view.menu.e(paramPanelFeatureState.GH, a.h.abc_list_menu_item_layout);
              paramPanelFeatureState.GG.dm = paramKeyEvent;
              paramPanelFeatureState.GF.a(paramPanelFeatureState.GG);
            }
            paramKeyEvent = paramPanelFeatureState.GG;
            localObject2 = paramPanelFeatureState.GC;
            if (paramKeyEvent.JZ == null)
            {
              paramKeyEvent.JZ = ((ExpandedMenuView)paramKeyEvent.CJ.inflate(a.h.abc_expanded_menu_layout, (ViewGroup)localObject2, false));
              if (paramKeyEvent.Kc == null) {
                paramKeyEvent.Kc = new e.a(paramKeyEvent);
              }
              paramKeyEvent.JZ.setAdapter(paramKeyEvent.Kc);
              paramKeyEvent.JZ.setOnItemClickListener(paramKeyEvent);
            }
          }
        }
        i = 0;
        break label376;
        break;
        if (paramPanelFeatureState.GG.getAdapter().getCount() > 0)
        {
          i = 1;
          break label396;
        }
        i = 0;
        break label396;
        break;
        if (paramPanelFeatureState.GE != null)
        {
          paramKeyEvent = paramPanelFeatureState.GE.getLayoutParams();
          if (paramKeyEvent != null)
          {
            i = k;
            if (paramKeyEvent.width == -1) {
              continue;
            }
          }
        }
        i = -2;
      }
    }
  }
  
  private boolean a(PanelFeatureState paramPanelFeatureState, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.isSystem()) {}
    while (((!paramPanelFeatureState.GI) && (!b(paramPanelFeatureState, paramKeyEvent))) || (paramPanelFeatureState.GF == null)) {
      return false;
    }
    return paramPanelFeatureState.GF.performShortcut(paramInt, paramKeyEvent, 1);
  }
  
  private boolean b(PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    if (this.FS) {
      return false;
    }
    if (paramPanelFeatureState.GI) {
      return true;
    }
    if ((this.Gq != null) && (this.Gq != paramPanelFeatureState)) {
      a(this.Gq, false);
    }
    Window.Callback localCallback = this.Et.getCallback();
    if (localCallback != null) {
      paramPanelFeatureState.GE = localCallback.onCreatePanelView(paramPanelFeatureState.GB);
    }
    int i;
    label89:
    Context localContext;
    TypedValue localTypedValue;
    Resources.Theme localTheme;
    Object localObject1;
    if ((paramPanelFeatureState.GB == 0) || (paramPanelFeatureState.GB == 108))
    {
      i = 1;
      if ((i != 0) && (this.Gb != null)) {
        this.Gb.dU();
      }
      if ((paramPanelFeatureState.GE != null) || ((i != 0) && ((this.FM instanceof k)))) {
        break label624;
      }
      if ((paramPanelFeatureState.GF != null) && (!paramPanelFeatureState.GM)) {
        break label494;
      }
      if (paramPanelFeatureState.GF == null)
      {
        localContext = this.mContext;
        if (((paramPanelFeatureState.GB != 0) && (paramPanelFeatureState.GB != 108)) || (this.Gb == null)) {
          break label652;
        }
        localTypedValue = new TypedValue();
        localTheme = localContext.getTheme();
        localTheme.resolveAttribute(a.a.actionBarTheme, localTypedValue, true);
        if (localTypedValue.resourceId == 0) {
          break label471;
        }
        localObject1 = localContext.getResources().newTheme();
        ((Resources.Theme)localObject1).setTo(localTheme);
        ((Resources.Theme)localObject1).applyStyle(localTypedValue.resourceId, true);
        ((Resources.Theme)localObject1).resolveAttribute(a.a.actionBarWidgetTheme, localTypedValue, true);
        label256:
        Object localObject2 = localObject1;
        if (localTypedValue.resourceId != 0)
        {
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject2 = localContext.getResources().newTheme();
            ((Resources.Theme)localObject2).setTo(localTheme);
          }
          ((Resources.Theme)localObject2).applyStyle(localTypedValue.resourceId, true);
        }
        if (localObject2 == null) {
          break label652;
        }
        localObject1 = new d(localContext, 0);
        ((Context)localObject1).getTheme().setTo((Resources.Theme)localObject2);
      }
    }
    for (;;)
    {
      localObject1 = new f((Context)localObject1);
      ((f)localObject1).a(this);
      paramPanelFeatureState.e((f)localObject1);
      if (paramPanelFeatureState.GF == null) {
        break;
      }
      if ((i != 0) && (this.Gb != null))
      {
        if (this.Gc == null) {
          this.Gc = new a();
        }
        this.Gb.a(paramPanelFeatureState.GF, this.Gc);
      }
      paramPanelFeatureState.GF.du();
      if (!localCallback.onCreatePanelMenu(paramPanelFeatureState.GB, paramPanelFeatureState.GF))
      {
        paramPanelFeatureState.e(null);
        if ((i == 0) || (this.Gb == null)) {
          break;
        }
        this.Gb.a(null, this.Gc);
        return false;
        i = 0;
        break label89;
        label471:
        localTheme.resolveAttribute(a.a.actionBarWidgetTheme, localTypedValue, true);
        localObject1 = null;
        break label256;
      }
      paramPanelFeatureState.GM = false;
      label494:
      paramPanelFeatureState.GF.du();
      if (paramPanelFeatureState.GN != null)
      {
        paramPanelFeatureState.GF.f(paramPanelFeatureState.GN);
        paramPanelFeatureState.GN = null;
      }
      if (!localCallback.onPreparePanel(0, paramPanelFeatureState.GE, paramPanelFeatureState.GF))
      {
        if ((i != 0) && (this.Gb != null)) {
          this.Gb.a(null, this.Gc);
        }
        paramPanelFeatureState.GF.dv();
        return false;
      }
      if (paramKeyEvent != null)
      {
        i = paramKeyEvent.getDeviceId();
        if (KeyCharacterMap.load(i).getKeyboardType() == 1) {
          break label646;
        }
      }
      label624:
      label646:
      for (boolean bool = true;; bool = false)
      {
        paramPanelFeatureState.GK = bool;
        paramPanelFeatureState.GF.setQwertyMode(paramPanelFeatureState.GK);
        paramPanelFeatureState.GF.dv();
        paramPanelFeatureState.GI = true;
        paramPanelFeatureState.GJ = false;
        this.Gq = paramPanelFeatureState;
        return true;
        i = -1;
        break;
      }
      label652:
      localObject1 = localContext;
    }
  }
  
  private void cV()
  {
    Object localObject1;
    if (!this.Gj)
    {
      localObject1 = this.mContext.obtainStyledAttributes(a.k.AppCompatTheme);
      if (!((TypedArray)localObject1).hasValue(a.k.AppCompatTheme_windowActionBar))
      {
        ((TypedArray)localObject1).recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
      }
      if (((TypedArray)localObject1).getBoolean(a.k.AppCompatTheme_windowNoTitle, false))
      {
        requestWindowFeature(1);
        if (((TypedArray)localObject1).getBoolean(a.k.AppCompatTheme_windowActionBarOverlay, false)) {
          requestWindowFeature(109);
        }
        if (((TypedArray)localObject1).getBoolean(a.k.AppCompatTheme_windowActionModeOverlay, false)) {
          requestWindowFeature(10);
        }
        this.FQ = ((TypedArray)localObject1).getBoolean(a.k.AppCompatTheme_android_windowIsFloating, false);
        ((TypedArray)localObject1).recycle();
        this.Et.getDecorView();
        localObject1 = LayoutInflater.from(this.mContext);
        if (this.FR) {
          break label459;
        }
        if (!this.FQ) {
          break label288;
        }
        localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(a.h.abc_dialog_title_material, null);
        this.FO = false;
        this.FN = false;
      }
    }
    for (;;)
    {
      if (localObject1 == null)
      {
        throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.FN + ", windowActionBarOverlay: " + this.FO + ", android:windowIsFloating: " + this.FQ + ", windowActionModeOverlay: " + this.FP + ", windowNoTitle: " + this.FR + " }");
        if (!((TypedArray)localObject1).getBoolean(a.k.AppCompatTheme_windowActionBar, false)) {
          break;
        }
        requestWindowFeature(108);
        break;
        label288:
        if (!this.FN) {
          break label1134;
        }
        localObject1 = new TypedValue();
        this.mContext.getTheme().resolveAttribute(a.a.actionBarTheme, (TypedValue)localObject1, true);
        if (((TypedValue)localObject1).resourceId != 0) {}
        for (localObject1 = new d(this.mContext, ((TypedValue)localObject1).resourceId);; localObject1 = this.mContext)
        {
          localObject1 = (ViewGroup)LayoutInflater.from((Context)localObject1).inflate(a.h.abc_screen_toolbar, null);
          this.Gb = ((android.support.v7.widget.t)((ViewGroup)localObject1).findViewById(a.f.decor_content_parent));
          this.Gb.b(this.Et.getCallback());
          if (this.FO) {
            this.Gb.aA(109);
          }
          if (this.Gm) {
            this.Gb.aA(2);
          }
          if (this.Gn) {
            this.Gb.aA(5);
          }
          break;
        }
        label459:
        if (this.FP) {}
        for (localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(a.h.abc_screen_simple_overlay_action_mode, null);; localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(a.h.abc_screen_simple, null))
        {
          if (Build.VERSION.SDK_INT < 21) {
            break label521;
          }
          z.b((View)localObject1, new android.support.v4.view.t()
          {
            public final ap a(View paramAnonymousView, ap paramAnonymousap)
            {
              int i = paramAnonymousap.getSystemWindowInsetTop();
              int j = AppCompatDelegateImplV7.this.aw(i);
              ap localap = paramAnonymousap;
              if (i != j) {
                localap = paramAnonymousap.e(paramAnonymousap.getSystemWindowInsetLeft(), j, paramAnonymousap.getSystemWindowInsetRight(), paramAnonymousap.getSystemWindowInsetBottom());
              }
              return z.a(paramAnonymousView, localap);
            }
          });
          break;
        }
        label521:
        ((x)localObject1).a(new x.a()
        {
          public final void d(Rect paramAnonymousRect)
          {
            paramAnonymousRect.top = AppCompatDelegateImplV7.this.aw(paramAnonymousRect.top);
          }
        });
        continue;
      }
      if (this.Gb == null) {
        this.EN = ((TextView)((ViewGroup)localObject1).findViewById(a.f.title));
      }
      at.bx((View)localObject1);
      Object localObject2 = (ContentFrameLayout)((ViewGroup)localObject1).findViewById(a.f.action_bar_activity_content);
      ViewGroup localViewGroup = (ViewGroup)this.Et.findViewById(16908290);
      if (localViewGroup != null)
      {
        while (localViewGroup.getChildCount() > 0)
        {
          View localView = localViewGroup.getChildAt(0);
          localViewGroup.removeViewAt(0);
          ((ContentFrameLayout)localObject2).addView(localView);
        }
        localViewGroup.setId(-1);
        ((ContentFrameLayout)localObject2).setId(16908290);
        if ((localViewGroup instanceof FrameLayout)) {
          ((FrameLayout)localViewGroup).setForeground(null);
        }
      }
      this.Et.setContentView((View)localObject1);
      ((ContentFrameLayout)localObject2).PO = new ContentFrameLayout.a()
      {
        public final void onDetachedFromWindow()
        {
          Object localObject = AppCompatDelegateImplV7.this;
          if (((AppCompatDelegateImplV7)localObject).Gb != null) {
            ((AppCompatDelegateImplV7)localObject).Gb.dV();
          }
          if (((AppCompatDelegateImplV7)localObject).Gg != null)
          {
            ((AppCompatDelegateImplV7)localObject).Et.getDecorView().removeCallbacks(((AppCompatDelegateImplV7)localObject).Gh);
            if (!((AppCompatDelegateImplV7)localObject).Gg.isShowing()) {}
          }
          try
          {
            ((AppCompatDelegateImplV7)localObject).Gg.dismiss();
            ((AppCompatDelegateImplV7)localObject).Gg = null;
            ((AppCompatDelegateImplV7)localObject).cW();
            localObject = ((AppCompatDelegateImplV7)localObject).au(0);
            if ((localObject != null) && (((AppCompatDelegateImplV7.PanelFeatureState)localObject).GF != null)) {
              ((AppCompatDelegateImplV7.PanelFeatureState)localObject).GF.close();
            }
            return;
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            for (;;) {}
          }
        }
      };
      this.Gk = ((ViewGroup)localObject1);
      if ((this.FJ instanceof Activity)) {}
      for (localObject1 = ((Activity)this.FJ).getTitle();; localObject1 = this.tX)
      {
        if (!TextUtils.isEmpty((CharSequence)localObject1)) {
          f((CharSequence)localObject1);
        }
        localObject1 = (ContentFrameLayout)this.Gk.findViewById(16908290);
        localObject2 = this.Et.getDecorView();
        int i = ((View)localObject2).getPaddingLeft();
        int j = ((View)localObject2).getPaddingTop();
        int k = ((View)localObject2).getPaddingRight();
        int m = ((View)localObject2).getPaddingBottom();
        ((ContentFrameLayout)localObject1).PN.set(i, j, k, m);
        if (z.aj((View)localObject1)) {
          ((ContentFrameLayout)localObject1).requestLayout();
        }
        localObject2 = this.mContext.obtainStyledAttributes(a.k.AppCompatTheme);
        i = a.k.AppCompatTheme_windowMinWidthMajor;
        if (((ContentFrameLayout)localObject1).PH == null) {
          ((ContentFrameLayout)localObject1).PH = new TypedValue();
        }
        ((TypedArray)localObject2).getValue(i, ((ContentFrameLayout)localObject1).PH);
        i = a.k.AppCompatTheme_windowMinWidthMinor;
        if (((ContentFrameLayout)localObject1).PI == null) {
          ((ContentFrameLayout)localObject1).PI = new TypedValue();
        }
        ((TypedArray)localObject2).getValue(i, ((ContentFrameLayout)localObject1).PI);
        if (((TypedArray)localObject2).hasValue(a.k.AppCompatTheme_windowFixedWidthMajor))
        {
          i = a.k.AppCompatTheme_windowFixedWidthMajor;
          if (((ContentFrameLayout)localObject1).PJ == null) {
            ((ContentFrameLayout)localObject1).PJ = new TypedValue();
          }
          ((TypedArray)localObject2).getValue(i, ((ContentFrameLayout)localObject1).PJ);
        }
        if (((TypedArray)localObject2).hasValue(a.k.AppCompatTheme_windowFixedWidthMinor))
        {
          i = a.k.AppCompatTheme_windowFixedWidthMinor;
          if (((ContentFrameLayout)localObject1).PK == null) {
            ((ContentFrameLayout)localObject1).PK = new TypedValue();
          }
          ((TypedArray)localObject2).getValue(i, ((ContentFrameLayout)localObject1).PK);
        }
        if (((TypedArray)localObject2).hasValue(a.k.AppCompatTheme_windowFixedHeightMajor))
        {
          i = a.k.AppCompatTheme_windowFixedHeightMajor;
          if (((ContentFrameLayout)localObject1).PL == null) {
            ((ContentFrameLayout)localObject1).PL = new TypedValue();
          }
          ((TypedArray)localObject2).getValue(i, ((ContentFrameLayout)localObject1).PL);
        }
        if (((TypedArray)localObject2).hasValue(a.k.AppCompatTheme_windowFixedHeightMinor))
        {
          i = a.k.AppCompatTheme_windowFixedHeightMinor;
          if (((ContentFrameLayout)localObject1).PM == null) {
            ((ContentFrameLayout)localObject1).PM = new TypedValue();
          }
          ((TypedArray)localObject2).getValue(i, ((ContentFrameLayout)localObject1).PM);
        }
        ((TypedArray)localObject2).recycle();
        ((ContentFrameLayout)localObject1).requestLayout();
        this.Gj = true;
        localObject1 = au(0);
        if ((!this.FS) && ((localObject1 == null) || (((PanelFeatureState)localObject1).GF == null))) {
          invalidatePanelMenu(108);
        }
        return;
      }
      label1134:
      localObject1 = null;
    }
  }
  
  private void cX()
  {
    if (this.Gj) {
      throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }
  }
  
  private void invalidatePanelMenu(int paramInt)
  {
    this.Gt |= 1 << paramInt;
    if (!this.Gs)
    {
      z.a(this.Et.getDecorView(), this.Gu);
      this.Gs = true;
    }
  }
  
  public final PanelFeatureState a(Menu paramMenu)
  {
    PanelFeatureState[] arrayOfPanelFeatureState = this.Gp;
    int i;
    int j;
    if (arrayOfPanelFeatureState != null)
    {
      i = arrayOfPanelFeatureState.length;
      j = 0;
    }
    for (;;)
    {
      if (j >= i) {
        break label57;
      }
      PanelFeatureState localPanelFeatureState = arrayOfPanelFeatureState[j];
      if ((localPanelFeatureState != null) && (localPanelFeatureState.GF == paramMenu))
      {
        return localPanelFeatureState;
        i = 0;
        break;
      }
      j += 1;
    }
    label57:
    return null;
  }
  
  View a(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if ((this.FJ instanceof LayoutInflater.Factory))
    {
      paramString = ((LayoutInflater.Factory)this.FJ).onCreateView(paramString, paramContext, paramAttributeSet);
      if (paramString != null) {
        return paramString;
      }
    }
    return null;
  }
  
  public final void a(int paramInt, PanelFeatureState paramPanelFeatureState, Menu paramMenu)
  {
    Object localObject1 = paramPanelFeatureState;
    Object localObject2 = paramMenu;
    if (paramMenu == null)
    {
      PanelFeatureState localPanelFeatureState = paramPanelFeatureState;
      if (paramPanelFeatureState == null)
      {
        localPanelFeatureState = paramPanelFeatureState;
        if (paramInt >= 0)
        {
          localPanelFeatureState = paramPanelFeatureState;
          if (paramInt < this.Gp.length) {
            localPanelFeatureState = this.Gp[paramInt];
          }
        }
      }
      localObject1 = localPanelFeatureState;
      localObject2 = paramMenu;
      if (localPanelFeatureState != null)
      {
        localObject2 = localPanelFeatureState.GF;
        localObject1 = localPanelFeatureState;
      }
    }
    if ((localObject1 != null) && (!((PanelFeatureState)localObject1).Dg)) {}
    while (this.FS) {
      return;
    }
    this.FJ.onPanelClosed(paramInt, (Menu)localObject2);
  }
  
  public final void a(PanelFeatureState paramPanelFeatureState, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramPanelFeatureState.GB == 0) && (this.Gb != null) && (this.Gb.isOverflowMenuShowing())) {
      c(paramPanelFeatureState.GF);
    }
    do
    {
      return;
      WindowManager localWindowManager = (WindowManager)this.mContext.getSystemService("window");
      if ((localWindowManager != null) && (paramPanelFeatureState.Dg) && (paramPanelFeatureState.GC != null))
      {
        localWindowManager.removeView(paramPanelFeatureState.GC);
        if (paramBoolean) {
          a(paramPanelFeatureState.GB, paramPanelFeatureState, null);
        }
      }
      paramPanelFeatureState.GI = false;
      paramPanelFeatureState.GJ = false;
      paramPanelFeatureState.Dg = false;
      paramPanelFeatureState.GD = null;
      paramPanelFeatureState.GL = true;
    } while (this.Gq != paramPanelFeatureState);
    this.Gq = null;
  }
  
  public final boolean a(f paramf, MenuItem paramMenuItem)
  {
    Window.Callback localCallback = this.Et.getCallback();
    if ((localCallback != null) && (!this.FS))
    {
      paramf = a(paramf.dB());
      if (paramf != null) {
        return localCallback.onMenuItemSelected(paramf.GB, paramMenuItem);
      }
    }
    return false;
  }
  
  public final void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    cV();
    ((ViewGroup)this.Gk.findViewById(16908290)).addView(paramView, paramLayoutParams);
    this.FJ.onContentChanged();
  }
  
  final void ar(int paramInt)
  {
    Object localObject;
    if (paramInt == 108)
    {
      localObject = cO();
      if (localObject != null) {
        ((ActionBar)localObject).y(false);
      }
    }
    do
    {
      do
      {
        return;
      } while (paramInt != 0);
      localObject = au(paramInt);
    } while (!((PanelFeatureState)localObject).Dg);
    a((PanelFeatureState)localObject, false);
  }
  
  final boolean as(int paramInt)
  {
    if (paramInt == 108)
    {
      ActionBar localActionBar = cO();
      if (localActionBar != null) {
        localActionBar.y(true);
      }
      return true;
    }
    return false;
  }
  
  final PanelFeatureState au(int paramInt)
  {
    Object localObject2 = this.Gp;
    Object localObject1;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (localObject2.length > paramInt) {}
    }
    else
    {
      localObject1 = new PanelFeatureState[paramInt + 1];
      if (localObject2 != null) {
        System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
      }
      this.Gp = ((PanelFeatureState[])localObject1);
    }
    localObject2 = localObject1[paramInt];
    if (localObject2 == null)
    {
      localObject2 = new PanelFeatureState(paramInt);
      localObject1[paramInt] = localObject2;
      return (PanelFeatureState)localObject2;
    }
    return (PanelFeatureState)localObject2;
  }
  
  public final void av(int paramInt)
  {
    PanelFeatureState localPanelFeatureState = au(paramInt);
    if (localPanelFeatureState.GF != null)
    {
      Bundle localBundle = new Bundle();
      localPanelFeatureState.GF.e(localBundle);
      if (localBundle.size() > 0) {
        localPanelFeatureState.GN = localBundle;
      }
      localPanelFeatureState.GF.du();
      localPanelFeatureState.GF.clear();
    }
    localPanelFeatureState.GM = true;
    localPanelFeatureState.GL = true;
    if (((paramInt == 108) || (paramInt == 0)) && (this.Gb != null))
    {
      localPanelFeatureState = au(0);
      if (localPanelFeatureState != null)
      {
        localPanelFeatureState.GI = false;
        b(localPanelFeatureState, null);
      }
    }
  }
  
  public final int aw(int paramInt)
  {
    int j = 1;
    int k = 1;
    int m = 0;
    Object localObject1;
    Object localObject2;
    int i;
    if ((this.Gf != null) && ((this.Gf.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
    {
      localObject1 = (ViewGroup.MarginLayoutParams)this.Gf.getLayoutParams();
      if (this.Gf.isShown())
      {
        if (this.gs == null)
        {
          this.gs = new Rect();
          this.gt = new Rect();
        }
        localObject2 = this.gs;
        Rect localRect = this.gt;
        ((Rect)localObject2).set(0, paramInt, 0, 0);
        at.a(this.Gk, (Rect)localObject2, localRect);
        if (localRect.top == 0)
        {
          i = paramInt;
          if (((ViewGroup.MarginLayoutParams)localObject1).topMargin == i) {
            break label355;
          }
          ((ViewGroup.MarginLayoutParams)localObject1).topMargin = paramInt;
          if (this.Gl != null) {
            break label279;
          }
          this.Gl = new View(this.mContext);
          this.Gl.setBackgroundColor(this.mContext.getResources().getColor(a.c.abc_input_method_navigation_guard));
          this.Gk.addView(this.Gl, -1, new ViewGroup.LayoutParams(-1, paramInt));
          i = 1;
          label201:
          if (this.Gl == null) {
            break label317;
          }
          label208:
          j = paramInt;
          if (!this.FP)
          {
            j = paramInt;
            if (k != 0) {
              j = 0;
            }
          }
          paramInt = j;
          j = i;
          i = k;
          label233:
          if (j != 0) {
            this.Gf.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          }
        }
      }
    }
    for (;;)
    {
      if (this.Gl != null)
      {
        localObject1 = this.Gl;
        if (i == 0) {
          break label342;
        }
      }
      label279:
      label317:
      label342:
      for (i = m;; i = 8)
      {
        ((View)localObject1).setVisibility(i);
        return paramInt;
        i = 0;
        break;
        localObject2 = this.Gl.getLayoutParams();
        if (((ViewGroup.LayoutParams)localObject2).height != paramInt)
        {
          ((ViewGroup.LayoutParams)localObject2).height = paramInt;
          this.Gl.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        }
        i = 1;
        break label201;
        k = 0;
        break label208;
        if (((ViewGroup.MarginLayoutParams)localObject1).topMargin == 0) {
          break label348;
        }
        ((ViewGroup.MarginLayoutParams)localObject1).topMargin = 0;
        i = 0;
        break label233;
      }
      label348:
      j = 0;
      i = 0;
      break label233;
      label355:
      i = 0;
      break label201;
      i = 0;
    }
  }
  
  public final void b(f paramf)
  {
    if ((this.Gb != null) && (this.Gb.dS()) && ((!ae.b(ViewConfiguration.get(this.mContext))) || (this.Gb.dT())))
    {
      paramf = this.Et.getCallback();
      if (!this.Gb.isOverflowMenuShowing()) {
        if ((paramf != null) && (!this.FS))
        {
          if ((this.Gs) && ((this.Gt & 0x1) != 0))
          {
            this.Et.getDecorView().removeCallbacks(this.Gu);
            this.Gu.run();
          }
          PanelFeatureState localPanelFeatureState = au(0);
          if ((localPanelFeatureState.GF != null) && (!localPanelFeatureState.GM) && (paramf.onPreparePanel(0, localPanelFeatureState.GE, localPanelFeatureState.GF)))
          {
            paramf.onMenuOpened(108, localPanelFeatureState.GF);
            this.Gb.showOverflowMenu();
          }
        }
      }
      do
      {
        return;
        this.Gb.hideOverflowMenu();
      } while (this.FS);
      paramf.onPanelClosed(108, au(0).GF);
      return;
    }
    paramf = au(0);
    paramf.GL = true;
    a(paramf, false);
    a(paramf, null);
  }
  
  public final void c(f paramf)
  {
    if (this.Go) {
      return;
    }
    this.Go = true;
    this.Gb.dV();
    Window.Callback localCallback = this.Et.getCallback();
    if ((localCallback != null) && (!this.FS)) {
      localCallback.onPanelClosed(108, paramf);
    }
    this.Go = false;
  }
  
  public final void cP()
  {
    cV();
  }
  
  public final void cQ()
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.mContext);
    if (localLayoutInflater.getFactory() == null)
    {
      android.support.v4.view.h.a(localLayoutInflater, this);
      return;
    }
    android.support.v4.view.h.a(localLayoutInflater);
  }
  
  public final void cT()
  {
    cV();
    if ((!this.FN) || (this.FM != null)) {}
    for (;;)
    {
      return;
      if ((this.FJ instanceof Activity)) {
        this.FM = new n((Activity)this.FJ, this.FO);
      }
      while (this.FM != null)
      {
        this.FM.w(this.Gv);
        return;
        if ((this.FJ instanceof Dialog)) {
          this.FM = new n((Dialog)this.FJ);
        }
      }
    }
  }
  
  public final void cW()
  {
    if (this.Gi != null) {
      this.Gi.cancel();
    }
  }
  
  final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 82) && (this.FJ.dispatchKeyEvent(paramKeyEvent))) {}
    int i;
    label180:
    do
    {
      int j;
      do
      {
        do
        {
          return true;
          j = paramKeyEvent.getKeyCode();
          if (paramKeyEvent.getAction() == 0) {}
          for (i = 1; i != 0; i = 0) {
            switch (j)
            {
            default: 
              if (Build.VERSION.SDK_INT < 11) {
                onKeyShortcut(j, paramKeyEvent);
              }
              return false;
            }
          }
        } while (paramKeyEvent.getRepeatCount() != 0);
        localPanelFeatureState = au(0);
      } while (localPanelFeatureState.Dg);
      b(localPanelFeatureState, paramKeyEvent);
      return true;
      if ((paramKeyEvent.getFlags() & 0x80) != 0) {}
      for (bool = true;; bool = false)
      {
        this.Gr = bool;
        break;
      }
      switch (j)
      {
      default: 
        return false;
      }
    } while (this.Ge != null);
    PanelFeatureState localPanelFeatureState = au(0);
    if ((this.Gb != null) && (this.Gb.dS()) && (!ae.b(ViewConfiguration.get(this.mContext)))) {
      if (!this.Gb.isOverflowMenuShowing())
      {
        if ((this.FS) || (!b(localPanelFeatureState, paramKeyEvent))) {
          break label483;
        }
        bool = this.Gb.showOverflowMenu();
      }
    }
    label268:
    while (bool)
    {
      paramKeyEvent = (AudioManager)this.mContext.getSystemService("audio");
      if (paramKeyEvent == null) {
        break;
      }
      paramKeyEvent.playSoundEffect(0);
      return true;
      bool = this.Gb.hideOverflowMenu();
      continue;
      if ((!localPanelFeatureState.Dg) && (!localPanelFeatureState.GJ)) {
        break label345;
      }
      bool = localPanelFeatureState.Dg;
      a(localPanelFeatureState, true);
    }
    label345:
    if (localPanelFeatureState.GI)
    {
      if (!localPanelFeatureState.GM) {
        break label489;
      }
      localPanelFeatureState.GI = false;
    }
    label483:
    label489:
    for (boolean bool = b(localPanelFeatureState, paramKeyEvent);; bool = true)
    {
      if (bool)
      {
        a(localPanelFeatureState, paramKeyEvent);
        bool = true;
        break label268;
        bool = this.Gr;
        this.Gr = false;
        paramKeyEvent = au(0);
        if ((paramKeyEvent != null) && (paramKeyEvent.Dg))
        {
          if (bool) {
            break;
          }
          a(paramKeyEvent, true);
          return true;
        }
        if (this.Ge != null)
        {
          this.Ge.finish();
          i = 1;
        }
        while (i != 0)
        {
          return true;
          paramKeyEvent = cO();
          if ((paramKeyEvent != null) && (paramKeyEvent.collapseActionView())) {
            i = 1;
          } else {
            i = 0;
          }
        }
        break label180;
      }
      bool = false;
      break label268;
    }
  }
  
  final void f(CharSequence paramCharSequence)
  {
    if (this.Gb != null) {
      this.Gb.e(paramCharSequence);
    }
    do
    {
      return;
      if (this.FM != null)
      {
        this.FM.e(paramCharSequence);
        return;
      }
    } while (this.EN == null);
    this.EN.setText(paramCharSequence);
  }
  
  public final View findViewById(int paramInt)
  {
    cV();
    return this.Et.findViewById(paramInt);
  }
  
  public final void invalidateOptionsMenu()
  {
    ActionBar localActionBar = cO();
    if ((localActionBar != null) && (localActionBar.cL())) {
      return;
    }
    invalidatePanelMenu(0);
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    if ((this.FN) && (this.Gj))
    {
      ActionBar localActionBar = cO();
      if (localActionBar != null) {
        localActionBar.onConfigurationChanged(paramConfiguration);
      }
    }
    cR();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    if (((this.FJ instanceof Activity)) && (u.b((Activity)this.FJ) != null))
    {
      paramBundle = this.FM;
      if (paramBundle == null) {
        this.Gv = true;
      }
    }
    else
    {
      return;
    }
    paramBundle.w(true);
  }
  
  public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    int j = 0;
    Object localObject1 = a(paramString, paramContext, paramAttributeSet);
    if (localObject1 != null)
    {
      paramString = (String)localObject1;
      return paramString;
    }
    boolean bool1;
    label34:
    int i;
    label79:
    Object localObject2;
    boolean bool2;
    if (Build.VERSION.SDK_INT < 21)
    {
      bool1 = true;
      if (this.Gw == null) {
        this.Gw = new j();
      }
      if (!bool1) {
        break label425;
      }
      localObject1 = (ViewParent)paramView;
      if (localObject1 != null) {
        break label361;
      }
      i = 0;
      if (i == 0) {
        break label425;
      }
      i = 1;
      localObject2 = this.Gw;
      bool2 = ar.hb();
      if ((i == 0) || (paramView == null)) {
        break label845;
      }
    }
    label248:
    label251:
    label320:
    label361:
    label425:
    label845:
    for (paramView = paramView.getContext();; paramView = paramContext)
    {
      paramView = j.a(paramView, paramAttributeSet, bool1, true);
      localObject1 = paramView;
      if (bool2) {
        localObject1 = am.q(paramView);
      }
      paramView = null;
      switch (paramString.hashCode())
      {
      default: 
        i = -1;
        switch (i)
        {
        default: 
          if ((paramView == null) && (paramContext != localObject1)) {
            paramView = ((j)localObject2).a((Context)localObject1, paramString, paramAttributeSet);
          }
          break;
        }
        break;
      }
      for (;;)
      {
        paramString = paramView;
        if (paramView == null) {
          break;
        }
        j.a(paramView, paramAttributeSet);
        return paramView;
        bool1 = false;
        break label34;
        localObject2 = this.Et.getDecorView();
        for (;;)
        {
          if (localObject1 == null)
          {
            i = 1;
            break;
          }
          if ((localObject1 == localObject2) || (!(localObject1 instanceof View)) || (z.al((View)localObject1)))
          {
            i = 0;
            break;
          }
          localObject1 = ((ViewParent)localObject1).getParent();
        }
        i = 0;
        break label79;
        if (!paramString.equals("TextView")) {
          break label248;
        }
        i = j;
        break label251;
        if (!paramString.equals("ImageView")) {
          break label248;
        }
        i = 1;
        break label251;
        if (!paramString.equals("Button")) {
          break label248;
        }
        i = 2;
        break label251;
        if (!paramString.equals("EditText")) {
          break label248;
        }
        i = 3;
        break label251;
        if (!paramString.equals("Spinner")) {
          break label248;
        }
        i = 4;
        break label251;
        if (!paramString.equals("ImageButton")) {
          break label248;
        }
        i = 5;
        break label251;
        if (!paramString.equals("CheckBox")) {
          break label248;
        }
        i = 6;
        break label251;
        if (!paramString.equals("RadioButton")) {
          break label248;
        }
        i = 7;
        break label251;
        if (!paramString.equals("CheckedTextView")) {
          break label248;
        }
        i = 8;
        break label251;
        if (!paramString.equals("AutoCompleteTextView")) {
          break label248;
        }
        i = 9;
        break label251;
        if (!paramString.equals("MultiAutoCompleteTextView")) {
          break label248;
        }
        i = 10;
        break label251;
        if (!paramString.equals("RatingBar")) {
          break label248;
        }
        i = 11;
        break label251;
        if (!paramString.equals("SeekBar")) {
          break label248;
        }
        i = 12;
        break label251;
        paramView = new AppCompatTextView((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatImageView((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatButton((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatEditText((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatSpinner((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatImageButton((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatCheckBox((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatRadioButton((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatCheckedTextView((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatAutoCompleteTextView((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatMultiAutoCompleteTextView((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatRatingBar((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatSeekBar((Context)localObject1, paramAttributeSet);
        break label320;
      }
    }
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    if (this.FM != null) {
      this.FM.onDestroy();
    }
  }
  
  final boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    Object localObject = cO();
    if ((localObject != null) && (((ActionBar)localObject).onKeyShortcut(paramInt, paramKeyEvent))) {}
    boolean bool;
    do
    {
      do
      {
        return true;
        if ((this.Gq == null) || (!a(this.Gq, paramKeyEvent.getKeyCode(), paramKeyEvent))) {
          break;
        }
      } while (this.Gq == null);
      this.Gq.GJ = true;
      return true;
      if (this.Gq != null) {
        break;
      }
      localObject = au(0);
      b((PanelFeatureState)localObject, paramKeyEvent);
      bool = a((PanelFeatureState)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent);
      ((PanelFeatureState)localObject).GI = false;
    } while (bool);
    return false;
  }
  
  public final void onPostResume()
  {
    ActionBar localActionBar = cO();
    if (localActionBar != null) {
      localActionBar.x(true);
    }
  }
  
  public final void onStop()
  {
    ActionBar localActionBar = cO();
    if (localActionBar != null) {
      localActionBar.x(false);
    }
  }
  
  public final boolean requestWindowFeature(int paramInt)
  {
    int i;
    if (paramInt == 8) {
      i = 108;
    }
    while ((this.FR) && (i == 108))
    {
      return false;
      i = paramInt;
      if (paramInt == 9) {
        i = 109;
      }
    }
    if ((this.FN) && (i == 1)) {
      this.FN = false;
    }
    switch (i)
    {
    default: 
      return this.Et.requestFeature(i);
    case 108: 
      cX();
      this.FN = true;
      return true;
    case 109: 
      cX();
      this.FO = true;
      return true;
    case 10: 
      cX();
      this.FP = true;
      return true;
    case 2: 
      cX();
      this.Gm = true;
      return true;
    case 5: 
      cX();
      this.Gn = true;
      return true;
    }
    cX();
    this.FR = true;
    return true;
  }
  
  public final void setContentView(int paramInt)
  {
    cV();
    ViewGroup localViewGroup = (ViewGroup)this.Gk.findViewById(16908290);
    localViewGroup.removeAllViews();
    LayoutInflater.from(this.mContext).inflate(paramInt, localViewGroup);
    this.FJ.onContentChanged();
  }
  
  public final void setContentView(View paramView)
  {
    cV();
    ViewGroup localViewGroup = (ViewGroup)this.Gk.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView);
    this.FJ.onContentChanged();
  }
  
  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    cV();
    ViewGroup localViewGroup = (ViewGroup)this.Gk.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView, paramLayoutParams);
    this.FJ.onContentChanged();
  }
  
  private static final class PanelFeatureState
  {
    boolean Dg;
    int GB;
    ViewGroup GC;
    View GD;
    View GE;
    f GF;
    android.support.v7.view.menu.e GG;
    Context GH;
    boolean GI;
    boolean GJ;
    public boolean GK;
    boolean GL;
    boolean GM;
    Bundle GN;
    int background;
    int gravity;
    int windowAnimations;
    int x;
    int y;
    
    PanelFeatureState(int paramInt)
    {
      this.GB = paramInt;
      this.GL = false;
    }
    
    final void e(f paramf)
    {
      if (paramf == this.GF) {}
      do
      {
        return;
        if (this.GF != null) {
          this.GF.b(this.GG);
        }
        this.GF = paramf;
      } while ((paramf == null) || (this.GG == null));
      paramf.a(this.GG);
    }
    
    private static class SavedState
      implements Parcelable
    {
      public static final Parcelable.Creator<SavedState> CREATOR = android.support.v4.os.b.a(new android.support.v4.os.c() {});
      boolean Dg;
      int GB;
      Bundle ie;
      
      public static SavedState a(Parcel paramParcel, ClassLoader paramClassLoader)
      {
        boolean bool = true;
        SavedState localSavedState = new SavedState();
        localSavedState.GB = paramParcel.readInt();
        if (paramParcel.readInt() == 1) {}
        for (;;)
        {
          localSavedState.Dg = bool;
          if (localSavedState.Dg) {
            localSavedState.ie = paramParcel.readBundle(paramClassLoader);
          }
          return localSavedState;
          bool = false;
        }
      }
      
      public int describeContents()
      {
        return 0;
      }
      
      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        paramParcel.writeInt(this.GB);
        if (this.Dg) {}
        for (paramInt = 1;; paramInt = 0)
        {
          paramParcel.writeInt(paramInt);
          if (this.Dg) {
            paramParcel.writeBundle(this.ie);
          }
          return;
        }
      }
    }
  }
  
  private final class a
    implements l.a
  {
    public a() {}
    
    public final void a(f paramf, boolean paramBoolean)
    {
      AppCompatDelegateImplV7.this.c(paramf);
    }
    
    public final boolean d(f paramf)
    {
      Window.Callback localCallback = AppCompatDelegateImplV7.this.Et.getCallback();
      if (localCallback != null) {
        localCallback.onMenuOpened(108, paramf);
      }
      return true;
    }
  }
  
  final class b
    implements b.a
  {
    private b.a Gz;
    
    public b(b.a parama)
    {
      this.Gz = parama;
    }
    
    public final void a(android.support.v7.view.b paramb)
    {
      this.Gz.a(paramb);
      if (AppCompatDelegateImplV7.this.Gg != null) {
        AppCompatDelegateImplV7.this.Et.getDecorView().removeCallbacks(AppCompatDelegateImplV7.this.Gh);
      }
      if (AppCompatDelegateImplV7.this.Gf != null)
      {
        AppCompatDelegateImplV7.this.cW();
        AppCompatDelegateImplV7.this.Gi = z.V(AppCompatDelegateImplV7.this.Gf).p(0.0F);
        AppCompatDelegateImplV7.this.Gi.a(new an()
        {
          public final void q(View paramAnonymousView)
          {
            AppCompatDelegateImplV7.this.Gf.setVisibility(8);
            if (AppCompatDelegateImplV7.this.Gg != null) {
              AppCompatDelegateImplV7.this.Gg.dismiss();
            }
            for (;;)
            {
              AppCompatDelegateImplV7.this.Gf.removeAllViews();
              AppCompatDelegateImplV7.this.Gi.a(null);
              AppCompatDelegateImplV7.this.Gi = null;
              return;
              if ((AppCompatDelegateImplV7.this.Gf.getParent() instanceof View)) {
                z.Z((View)AppCompatDelegateImplV7.this.Gf.getParent());
              }
            }
          }
        });
      }
      AppCompatDelegateImplV7.this.Ge = null;
    }
    
    public final boolean a(android.support.v7.view.b paramb, Menu paramMenu)
    {
      return this.Gz.a(paramb, paramMenu);
    }
    
    public final boolean a(android.support.v7.view.b paramb, MenuItem paramMenuItem)
    {
      return this.Gz.a(paramb, paramMenuItem);
    }
    
    public final boolean b(android.support.v7.view.b paramb, Menu paramMenu)
    {
      return this.Gz.b(paramb, paramMenu);
    }
  }
  
  private final class c
    extends ContentFrameLayout
  {
    public c(Context paramContext)
    {
      super();
    }
    
    public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      return (AppCompatDelegateImplV7.this.dispatchKeyEvent(paramKeyEvent)) || (super.dispatchKeyEvent(paramKeyEvent));
    }
    
    public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
      if (paramMotionEvent.getAction() == 0)
      {
        int i = (int)paramMotionEvent.getX();
        int j = (int)paramMotionEvent.getY();
        if ((i < -5) || (j < -5) || (i > getWidth() + 5) || (j > getHeight() + 5)) {}
        for (i = 1; i != 0; i = 0)
        {
          paramMotionEvent = AppCompatDelegateImplV7.this;
          paramMotionEvent.a(paramMotionEvent.au(0), true);
          return true;
        }
      }
      return super.onInterceptTouchEvent(paramMotionEvent);
    }
    
    public final void setBackgroundResource(int paramInt)
    {
      setBackgroundDrawable(android.support.v7.widget.h.ex().a(getContext(), paramInt, false));
    }
  }
  
  private final class d
    implements l.a
  {
    public d() {}
    
    public final void a(f paramf, boolean paramBoolean)
    {
      f localf = paramf.dB();
      if (localf != paramf) {}
      for (int i = 1;; i = 0)
      {
        AppCompatDelegateImplV7 localAppCompatDelegateImplV7 = AppCompatDelegateImplV7.this;
        if (i != 0) {
          paramf = localf;
        }
        paramf = localAppCompatDelegateImplV7.a(paramf);
        if (paramf != null)
        {
          if (i == 0) {
            break;
          }
          AppCompatDelegateImplV7.this.a(paramf.GB, paramf, localf);
          AppCompatDelegateImplV7.this.a(paramf, true);
        }
        return;
      }
      AppCompatDelegateImplV7.this.a(paramf, paramBoolean);
    }
    
    public final boolean d(f paramf)
    {
      if ((paramf == null) && (AppCompatDelegateImplV7.this.FN))
      {
        Window.Callback localCallback = AppCompatDelegateImplV7.this.Et.getCallback();
        if ((localCallback != null) && (!AppCompatDelegateImplV7.this.FS)) {
          localCallback.onMenuOpened(108, paramf);
        }
      }
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\app\AppCompatDelegateImplV7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */