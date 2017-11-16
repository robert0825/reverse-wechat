package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.am;
import android.support.v4.view.an;
import android.support.v4.view.ao;
import android.support.v4.view.z;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.a.a.k;
import android.support.v7.view.a;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.view.g;
import android.support.v7.view.h;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.ActionBarOverlayLayout.a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.u;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class n
  extends ActionBar
  implements ActionBarOverlayLayout.a
{
  private static final Interpolator Hp;
  private static final Interpolator Hq;
  private static final boolean Hr;
  public u GX;
  a HA;
  b HB;
  b.a HC;
  private boolean HD;
  private int HE = 0;
  public boolean HF = true;
  public boolean HG;
  public boolean HH;
  private boolean HI;
  private boolean HJ = true;
  public h HK;
  private boolean HL;
  boolean HM;
  final am HN = new an()
  {
    public final void q(View paramAnonymousView)
    {
      if ((n.this.HF) && (n.this.Hw != null))
      {
        z.c(n.this.Hw, 0.0F);
        z.c(n.this.Hu, 0.0F);
      }
      n.this.Hu.setVisibility(8);
      n.this.Hu.J(false);
      n.this.HK = null;
      paramAnonymousView = n.this;
      if (paramAnonymousView.HC != null)
      {
        paramAnonymousView.HC.a(paramAnonymousView.HB);
        paramAnonymousView.HB = null;
        paramAnonymousView.HC = null;
      }
      if (n.this.Ht != null) {
        z.Z(n.this.Ht);
      }
    }
  };
  final am HO = new an()
  {
    public final void q(View paramAnonymousView)
    {
      n.this.HK = null;
      n.this.Hu.requestLayout();
    }
  };
  final ao HP = new ao()
  {
    public final void bY()
    {
      ((View)n.this.Hu.getParent()).invalidate();
    }
  };
  private boolean Ha;
  private ArrayList<Object> Hb = new ArrayList();
  private Context Hs;
  public ActionBarOverlayLayout Ht;
  public ActionBarContainer Hu;
  public ActionBarContextView Hv;
  public View Hw;
  public android.support.v7.widget.ai Hx;
  private int Hy = -1;
  private boolean Hz;
  private ArrayList<Object> jg = new ArrayList();
  private Activity mActivity;
  public Context mContext;
  private Dialog oa;
  
  static
  {
    boolean bool2 = true;
    if (!n.class.desiredAssertionStatus())
    {
      bool1 = true;
      $assertionsDisabled = bool1;
      Hp = new AccelerateInterpolator();
      Hq = new DecelerateInterpolator();
      if (Build.VERSION.SDK_INT < 14) {
        break label56;
      }
    }
    label56:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Hr = bool1;
      return;
      bool1 = false;
      break;
    }
  }
  
  public n(Activity paramActivity, boolean paramBoolean)
  {
    this.mActivity = paramActivity;
    paramActivity = paramActivity.getWindow().getDecorView();
    aJ(paramActivity);
    if (!paramBoolean) {
      this.Hw = paramActivity.findViewById(16908290);
    }
  }
  
  public n(Dialog paramDialog)
  {
    this.oa = paramDialog;
    aJ(paramDialog.getWindow().getDecorView());
  }
  
  private void B(boolean paramBoolean)
  {
    float f2;
    float f1;
    Object localObject1;
    Object localObject2;
    if (a(this.HG, this.HH, this.HI)) {
      if (!this.HJ)
      {
        this.HJ = true;
        if (this.HK != null) {
          this.HK.cancel();
        }
        this.Hu.setVisibility(0);
        if ((this.HE != 0) || (!Hr) || ((!this.HL) && (!paramBoolean))) {
          break label271;
        }
        z.c(this.Hu, 0.0F);
        f2 = -this.Hu.getHeight();
        f1 = f2;
        if (paramBoolean)
        {
          localObject1 = new int[2];
          Object tmp107_105 = localObject1;
          tmp107_105[0] = 0;
          Object tmp111_107 = tmp107_105;
          tmp111_107[1] = 0;
          tmp111_107;
          this.Hu.getLocationInWindow((int[])localObject1);
          f1 = f2 - localObject1[1];
        }
        z.c(this.Hu, f1);
        localObject1 = new h();
        localObject2 = z.V(this.Hu).r(0.0F);
        ((android.support.v4.view.ai)localObject2).a(this.HP);
        ((h)localObject1).a((android.support.v4.view.ai)localObject2);
        if ((this.HF) && (this.Hw != null))
        {
          z.c(this.Hw, f1);
          ((h)localObject1).a(z.V(this.Hw).r(0.0F));
        }
        ((h)localObject1).c(Hq);
        ((h)localObject1).dj();
        ((h)localObject1).b(this.HO);
        this.HK = ((h)localObject1);
        ((h)localObject1).start();
        if (this.Ht != null) {
          z.Z(this.Ht);
        }
      }
    }
    label271:
    while (!this.HJ) {
      for (;;)
      {
        return;
        z.d(this.Hu, 1.0F);
        z.c(this.Hu, 0.0F);
        if ((this.HF) && (this.Hw != null)) {
          z.c(this.Hw, 0.0F);
        }
        this.HO.q(null);
      }
    }
    this.HJ = false;
    if (this.HK != null) {
      this.HK.cancel();
    }
    if ((this.HE == 0) && (Hr) && ((this.HL) || (paramBoolean)))
    {
      z.d(this.Hu, 1.0F);
      this.Hu.J(true);
      localObject1 = new h();
      f2 = -this.Hu.getHeight();
      f1 = f2;
      if (paramBoolean)
      {
        localObject2 = new int[2];
        Object tmp420_418 = localObject2;
        tmp420_418[0] = 0;
        Object tmp424_420 = tmp420_418;
        tmp424_420[1] = 0;
        tmp424_420;
        this.Hu.getLocationInWindow((int[])localObject2);
        f1 = f2 - localObject2[1];
      }
      localObject2 = z.V(this.Hu).r(f1);
      ((android.support.v4.view.ai)localObject2).a(this.HP);
      ((h)localObject1).a((android.support.v4.view.ai)localObject2);
      if ((this.HF) && (this.Hw != null)) {
        ((h)localObject1).a(z.V(this.Hw).r(f1));
      }
      ((h)localObject1).c(Hp);
      ((h)localObject1).dj();
      ((h)localObject1).b(this.HN);
      this.HK = ((h)localObject1);
      ((h)localObject1).start();
      return;
    }
    this.HN.q(null);
  }
  
  public static boolean a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean3) {}
    while ((!paramBoolean1) && (!paramBoolean2)) {
      return true;
    }
    return false;
  }
  
  private void aJ(View paramView)
  {
    this.Ht = ((ActionBarOverlayLayout)paramView.findViewById(a.f.decor_content_parent));
    if (this.Ht != null)
    {
      localObject = this.Ht;
      ((ActionBarOverlayLayout)localObject).Mh = this;
      if (((ActionBarOverlayLayout)localObject).getWindowToken() != null)
      {
        ((ActionBarOverlayLayout)localObject).Mh.onWindowVisibilityChanged(((ActionBarOverlayLayout)localObject).LR);
        if (((ActionBarOverlayLayout)localObject).Ma != 0)
        {
          ((ActionBarOverlayLayout)localObject).onWindowSystemUiVisibilityChanged(((ActionBarOverlayLayout)localObject).Ma);
          z.Z((View)localObject);
        }
      }
    }
    Object localObject = paramView.findViewById(a.f.action_bar);
    if ((localObject instanceof u)) {}
    for (localObject = (u)localObject;; localObject = ((Toolbar)localObject).gX())
    {
      this.GX = ((u)localObject);
      this.Hv = ((ActionBarContextView)paramView.findViewById(a.f.action_context_bar));
      this.Hu = ((ActionBarContainer)paramView.findViewById(a.f.action_bar_container));
      if ((this.GX != null) && (this.Hv != null) && (this.Hu != null)) {
        break label240;
      }
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
      if (!(localObject instanceof Toolbar)) {
        break;
      }
    }
    if ("Can't make a decor toolbar out of " + localObject != null) {}
    for (paramView = localObject.getClass().getSimpleName();; paramView = "null") {
      throw new IllegalStateException(paramView);
    }
    label240:
    this.mContext = this.GX.getContext();
    if ((this.GX.getDisplayOptions() & 0x4) != 0) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        this.Hz = true;
      }
      paramView = a.o(this.mContext);
      paramView.de();
      z(paramView.dd());
      paramView = this.mContext.obtainStyledAttributes(null, a.k.ActionBar, a.a.actionBarStyle, 0);
      if (!paramView.getBoolean(a.k.ActionBar_hideOnContentScroll, false)) {
        break label365;
      }
      if (this.Ht.LW) {
        break;
      }
      throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }
    this.HM = true;
    this.Ht.setHideOnContentScrollEnabled(true);
    label365:
    i = paramView.getDimensionPixelSize(a.k.ActionBar_elevation, 0);
    if (i != 0) {
      setElevation(i);
    }
    paramView.recycle();
  }
  
  private void setDisplayOptions(int paramInt1, int paramInt2)
  {
    int i = this.GX.getDisplayOptions();
    if ((paramInt2 & 0x4) != 0) {
      this.Hz = true;
    }
    this.GX.setDisplayOptions(i & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
  }
  
  private void z(boolean paramBoolean)
  {
    boolean bool = true;
    this.HD = paramBoolean;
    int i;
    label50:
    label83:
    Object localObject;
    if (!this.HD)
    {
      this.GX.b(null);
      this.Hu.a(this.Hx);
      if (this.GX.getNavigationMode() != 2) {
        break label160;
      }
      i = 1;
      if (this.Hx != null)
      {
        if (i == 0) {
          break label165;
        }
        this.Hx.setVisibility(0);
        if (this.Ht != null) {
          z.Z(this.Ht);
        }
      }
      localObject = this.GX;
      if ((this.HD) || (i == 0)) {
        break label177;
      }
      paramBoolean = true;
      label102:
      ((u)localObject).N(paramBoolean);
      localObject = this.Ht;
      if ((this.HD) || (i == 0)) {
        break label182;
      }
    }
    label160:
    label165:
    label177:
    label182:
    for (paramBoolean = bool;; paramBoolean = false)
    {
      ((ActionBarOverlayLayout)localObject).LX = paramBoolean;
      return;
      this.Hu.a(null);
      this.GX.b(this.Hx);
      break;
      i = 0;
      break label50;
      this.Hx.setVisibility(8);
      break label83;
      paramBoolean = false;
      break label102;
    }
  }
  
  public final void A(boolean paramBoolean)
  {
    this.HF = paramBoolean;
  }
  
  public final void C(boolean paramBoolean)
  {
    android.support.v4.view.ai localai2;
    android.support.v4.view.ai localai1;
    if (paramBoolean)
    {
      if (!this.HI)
      {
        this.HI = true;
        if (this.Ht != null) {
          ActionBarOverlayLayout.dO();
        }
        B(false);
      }
      if (!paramBoolean) {
        break label114;
      }
      localai2 = this.GX.c(4, 100L);
      localai1 = this.Hv.c(0, 200L);
    }
    for (;;)
    {
      h localh = new h();
      localh.a(localai2, localai1);
      localh.start();
      return;
      if (!this.HI) {
        break;
      }
      this.HI = false;
      if (this.Ht != null) {
        ActionBarOverlayLayout.dO();
      }
      B(false);
      break;
      label114:
      localai1 = this.GX.c(0, 200L);
      localai2 = this.Hv.c(8, 100L);
    }
  }
  
  public final b a(b.a parama)
  {
    if (this.HA != null) {
      this.HA.finish();
    }
    this.Ht.setHideOnContentScrollEnabled(false);
    this.Hv.dN();
    parama = new a(this.Hv.getContext(), parama);
    if (parama.dc())
    {
      parama.invalidate();
      this.Hv.c(parama);
      C(true);
      this.Hv.sendAccessibilityEvent(32);
      this.HA = parama;
      return parama;
    }
    return null;
  }
  
  public final void cI()
  {
    setDisplayOptions(0, 2);
  }
  
  public final void cJ()
  {
    setDisplayOptions(0, 8);
  }
  
  public final void cK()
  {
    setDisplayOptions(16, 16);
  }
  
  public final void cZ()
  {
    if (this.HH)
    {
      this.HH = false;
      B(true);
    }
  }
  
  public final boolean collapseActionView()
  {
    if ((this.GX != null) && (this.GX.hasExpandedActionView()))
    {
      this.GX.collapseActionView();
      return true;
    }
    return false;
  }
  
  public final void da()
  {
    if (!this.HH)
    {
      this.HH = true;
      B(true);
    }
  }
  
  public final void db()
  {
    if (this.HK != null)
    {
      this.HK.cancel();
      this.HK = null;
    }
  }
  
  public final void e(CharSequence paramCharSequence)
  {
    this.GX.e(paramCharSequence);
  }
  
  public final View getCustomView()
  {
    return this.GX.getCustomView();
  }
  
  public final int getDisplayOptions()
  {
    return this.GX.getDisplayOptions();
  }
  
  public final int getHeight()
  {
    return this.Hu.getHeight();
  }
  
  public final Context getThemedContext()
  {
    int i;
    if (this.Hs == null)
    {
      TypedValue localTypedValue = new TypedValue();
      this.mContext.getTheme().resolveAttribute(a.a.actionBarWidgetTheme, localTypedValue, true);
      i = localTypedValue.resourceId;
      if (i == 0) {
        break label61;
      }
    }
    label61:
    for (this.Hs = new ContextThemeWrapper(this.mContext, i);; this.Hs = this.mContext) {
      return this.Hs;
    }
  }
  
  public final CharSequence getTitle()
  {
    return this.GX.getTitle();
  }
  
  public final void hide()
  {
    if (!this.HG)
    {
      this.HG = true;
      B(false);
    }
  }
  
  public final boolean isShowing()
  {
    int i = this.Hu.getHeight();
    return (this.HJ) && ((i == 0) || (this.Ht.dQ() < i));
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    z(a.o(this.mContext).dd());
  }
  
  public final void onWindowVisibilityChanged(int paramInt)
  {
    this.HE = paramInt;
  }
  
  public final boolean requestFocus()
  {
    ViewGroup localViewGroup = this.GX.eH();
    if ((localViewGroup != null) && (!localViewGroup.hasFocus()))
    {
      localViewGroup.requestFocus();
      return true;
    }
    return false;
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.Hu.l(paramDrawable);
  }
  
  public final void setCustomView(int paramInt)
  {
    setCustomView(LayoutInflater.from(getThemedContext()).inflate(paramInt, this.GX.eH(), false));
  }
  
  public final void setCustomView(View paramView)
  {
    this.GX.setCustomView(paramView);
  }
  
  public final void setDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 4;; i = 0)
    {
      setDisplayOptions(i, 4);
      return;
    }
  }
  
  public final void setDisplayOptions(int paramInt)
  {
    if ((paramInt & 0x4) != 0) {
      this.Hz = true;
    }
    this.GX.setDisplayOptions(paramInt);
  }
  
  public final void setElevation(float paramFloat)
  {
    z.g(this.Hu, paramFloat);
  }
  
  public final void setIcon(int paramInt)
  {
    this.GX.setIcon(paramInt);
  }
  
  public final void setLogo(Drawable paramDrawable)
  {
    this.GX.setLogo(paramDrawable);
  }
  
  public final void show()
  {
    if (this.HG)
    {
      this.HG = false;
      B(false);
    }
  }
  
  public final void w(boolean paramBoolean)
  {
    if (!this.Hz) {
      setDisplayHomeAsUpEnabled(paramBoolean);
    }
  }
  
  public final void x(boolean paramBoolean)
  {
    this.HL = paramBoolean;
    if ((!paramBoolean) && (this.HK != null)) {
      this.HK.cancel();
    }
  }
  
  public final void y(boolean paramBoolean)
  {
    if (paramBoolean == this.Ha) {}
    for (;;)
    {
      return;
      this.Ha = paramBoolean;
      int j = this.Hb.size();
      int i = 0;
      while (i < j)
      {
        this.Hb.get(i);
        i += 1;
      }
    }
  }
  
  public final class a
    extends b
    implements f.a
  {
    private final Context HR;
    private b.a HS;
    private WeakReference<View> HT;
    private final f dn;
    
    public a(Context paramContext, b.a parama)
    {
      this.HR = paramContext;
      this.HS = parama;
      this$1 = new f(paramContext);
      n.this.Ko = 1;
      this.dn = n.this;
      this.dn.a(this);
    }
    
    public final boolean a(f paramf, MenuItem paramMenuItem)
    {
      if (this.HS != null) {
        return this.HS.a(this, paramMenuItem);
      }
      return false;
    }
    
    public final void b(f paramf)
    {
      if (this.HS == null) {
        return;
      }
      invalidate();
      n.this.Hv.showOverflowMenu();
    }
    
    public final boolean dc()
    {
      this.dn.du();
      try
      {
        boolean bool = this.HS.a(this, this.dn);
        return bool;
      }
      finally
      {
        this.dn.dv();
      }
    }
    
    public final void finish()
    {
      if (n.this.HA != this) {
        return;
      }
      if (!n.a(n.this.HG, n.this.HH, false))
      {
        n.this.HB = this;
        n.this.HC = this.HS;
      }
      for (;;)
      {
        this.HS = null;
        n.this.C(false);
        n.this.Hv.dM();
        n.this.GX.eH().sendAccessibilityEvent(32);
        n.this.Ht.setHideOnContentScrollEnabled(n.this.HM);
        n.this.HA = null;
        return;
        this.HS.a(this);
      }
    }
    
    public final View getCustomView()
    {
      if (this.HT != null) {
        return (View)this.HT.get();
      }
      return null;
    }
    
    public final Menu getMenu()
    {
      return this.dn;
    }
    
    public final MenuInflater getMenuInflater()
    {
      return new g(this.HR);
    }
    
    public final CharSequence getSubtitle()
    {
      return n.this.Hv.tY;
    }
    
    public final CharSequence getTitle()
    {
      return n.this.Hv.tX;
    }
    
    public final void invalidate()
    {
      if (n.this.HA != this) {
        return;
      }
      this.dn.du();
      try
      {
        this.HS.b(this, this.dn);
        return;
      }
      finally
      {
        this.dn.dv();
      }
    }
    
    public final boolean isTitleOptional()
    {
      return n.this.Hv.LM;
    }
    
    public final void setCustomView(View paramView)
    {
      n.this.Hv.setCustomView(paramView);
      this.HT = new WeakReference(paramView);
    }
    
    public final void setSubtitle(int paramInt)
    {
      setSubtitle(n.this.mContext.getResources().getString(paramInt));
    }
    
    public final void setSubtitle(CharSequence paramCharSequence)
    {
      n.this.Hv.setSubtitle(paramCharSequence);
    }
    
    public final void setTitle(int paramInt)
    {
      setTitle(n.this.mContext.getResources().getString(paramInt));
    }
    
    public final void setTitle(CharSequence paramCharSequence)
    {
      n.this.Hv.setTitle(paramCharSequence);
    }
    
    public final void setTitleOptionalHint(boolean paramBoolean)
    {
      super.setTitleOptionalHint(paramBoolean);
      n.this.Hv.K(paramBoolean);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\app\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */