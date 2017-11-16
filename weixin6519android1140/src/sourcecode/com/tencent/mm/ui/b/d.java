package com.tencent.mm.ui.b;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ai;
import android.support.v4.view.am;
import android.support.v4.view.an;
import android.support.v4.view.ao;
import android.support.v4.view.z;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.a.a.k;
import android.support.v7.app.ActionBar;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.view.g;
import android.support.v7.view.h;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
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
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.tencent.gmtrace.GMTrace;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class d
  extends ActionBar
  implements ActionBarOverlayLayout.a
{
  private static final Interpolator Hp;
  private static final Interpolator Hq;
  private static final boolean Hr;
  public u GX;
  b HB;
  b.a HC;
  private int HE;
  public boolean HF;
  public boolean HG;
  public boolean HH;
  private boolean HI;
  private boolean HJ;
  public h HK;
  private boolean HL;
  final am HN;
  final am HO;
  final ao HP;
  private boolean Ha;
  private ArrayList<Object> Hb;
  private Context Hs;
  public ActionBarContainer Hu;
  public ActionBarContextView Hv;
  public View Hw;
  private boolean Hz;
  private Activity mActivity;
  public Context mContext;
  a vXh;
  
  static
  {
    GMTrace.i(3076941414400L, 22925);
    Hp = new AccelerateInterpolator();
    Hq = new DecelerateInterpolator();
    if (Build.VERSION.SDK_INT >= 14) {}
    for (boolean bool = true;; bool = false)
    {
      Hr = bool;
      GMTrace.o(3076941414400L, 22925);
      return;
    }
  }
  
  public d(Activity paramActivity, ViewGroup paramViewGroup)
  {
    GMTrace.i(3070767398912L, 22879);
    this.Hb = new ArrayList();
    this.HE = 0;
    this.HF = true;
    this.HJ = true;
    this.HN = new an()
    {
      public final void q(View paramAnonymousView)
      {
        GMTrace.i(3067948826624L, 22858);
        if ((d.this.HF) && (d.this.Hw != null))
        {
          z.c(d.this.Hw, 0.0F);
          z.c(d.this.Hu, 0.0F);
        }
        d.this.Hu.setVisibility(8);
        d.this.Hu.J(false);
        d.this.HK = null;
        paramAnonymousView = d.this;
        if (paramAnonymousView.HC != null)
        {
          paramAnonymousView.HC.a(paramAnonymousView.HB);
          paramAnonymousView.HB = null;
          paramAnonymousView.HC = null;
        }
        GMTrace.o(3067948826624L, 22858);
      }
    };
    this.HO = new an()
    {
      public final void q(View paramAnonymousView)
      {
        GMTrace.i(3065667125248L, 22841);
        d.this.HK = null;
        d.this.Hu.requestLayout();
        GMTrace.o(3065667125248L, 22841);
      }
    };
    this.HP = new ao()
    {
      public final void bY()
      {
        GMTrace.i(3070633181184L, 22878);
        ((View)d.this.Hu.getParent()).invalidate();
        GMTrace.o(3070633181184L, 22878);
      }
    };
    this.mActivity = paramActivity;
    paramActivity = paramViewGroup.findViewById(a.f.action_bar);
    if ((paramActivity instanceof u)) {}
    for (paramActivity = (u)paramActivity;; paramActivity = ((Toolbar)paramActivity).gX())
    {
      this.GX = paramActivity;
      this.Hv = ((ActionBarContextView)paramViewGroup.findViewById(a.f.action_context_bar));
      this.Hu = ((ActionBarContainer)paramViewGroup.findViewById(a.f.action_bar_container));
      if ((this.GX != null) && (this.Hv != null) && (this.Hu != null)) {
        break label247;
      }
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
      if (!(paramActivity instanceof Toolbar)) {
        break;
      }
    }
    if ("Can't make a decor toolbar out of " + paramActivity != null) {}
    for (paramActivity = paramActivity.getClass().getSimpleName();; paramActivity = "null") {
      throw new IllegalStateException(paramActivity);
    }
    label247:
    this.mContext = this.GX.getContext();
    if ((this.GX.getDisplayOptions() & 0x4) != 0) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        this.Hz = true;
      }
      android.support.v7.view.a.o(this.mContext).de();
      paramActivity = this.mContext.obtainStyledAttributes(null, a.k.ActionBar, a.a.actionBarStyle, 0);
      paramActivity.getBoolean(a.k.ActionBar_hideOnContentScroll, false);
      i = paramActivity.getDimensionPixelSize(a.k.ActionBar_elevation, 0);
      if (i != 0) {
        setElevation(i);
      }
      paramActivity.recycle();
      this.Hw = null;
      GMTrace.o(3070767398912L, 22879);
      return;
    }
  }
  
  private void B(boolean paramBoolean)
  {
    GMTrace.i(3074257059840L, 22905);
    float f2;
    float f1;
    Object localObject1;
    Object localObject2;
    if (a(this.HG, this.HH, this.HI))
    {
      if (!this.HJ)
      {
        this.HJ = true;
        if (this.HK != null) {
          this.HK.cancel();
        }
        this.Hu.setVisibility(0);
        if ((this.HE == 0) && (Hr) && ((this.HL) || (paramBoolean)))
        {
          z.c(this.Hu, 0.0F);
          f2 = -this.Hu.getHeight();
          f1 = f2;
          if (paramBoolean)
          {
            localObject1 = new int[2];
            Object tmp116_114 = localObject1;
            tmp116_114[0] = 0;
            Object tmp120_116 = tmp116_114;
            tmp120_116[1] = 0;
            tmp120_116;
            this.Hu.getLocationInWindow((int[])localObject1);
            f1 = f2 - localObject1[1];
          }
          z.c(this.Hu, f1);
          localObject1 = new h();
          localObject2 = z.V(this.Hu).r(0.0F);
          ((ai)localObject2).a(this.HP);
          ((h)localObject1).a((ai)localObject2);
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
          GMTrace.o(3074257059840L, 22905);
          return;
        }
        z.d(this.Hu, 1.0F);
        z.c(this.Hu, 0.0F);
        if ((this.HF) && (this.Hw != null)) {
          z.c(this.Hw, 0.0F);
        }
        this.HO.q(null);
        GMTrace.o(3074257059840L, 22905);
      }
    }
    else if (this.HJ)
    {
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
          Object tmp431_429 = localObject2;
          tmp431_429[0] = 0;
          Object tmp435_431 = tmp431_429;
          tmp435_431[1] = 0;
          tmp435_431;
          this.Hu.getLocationInWindow((int[])localObject2);
          f1 = f2 - localObject2[1];
        }
        localObject2 = z.V(this.Hu).r(f1);
        ((ai)localObject2).a(this.HP);
        ((h)localObject1).a((ai)localObject2);
        if ((this.HF) && (this.Hw != null)) {
          ((h)localObject1).a(z.V(this.Hw).r(f1));
        }
        ((h)localObject1).c(Hp);
        ((h)localObject1).dj();
        ((h)localObject1).b(this.HN);
        this.HK = ((h)localObject1);
        ((h)localObject1).start();
        GMTrace.o(3074257059840L, 22905);
        return;
      }
      this.HN.q(null);
    }
    GMTrace.o(3074257059840L, 22905);
  }
  
  public static boolean a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    GMTrace.i(3074122842112L, 22904);
    if (paramBoolean3)
    {
      GMTrace.o(3074122842112L, 22904);
      return true;
    }
    if ((paramBoolean1) || (paramBoolean2))
    {
      GMTrace.o(3074122842112L, 22904);
      return false;
    }
    GMTrace.o(3074122842112L, 22904);
    return true;
  }
  
  private void setDisplayOptions(int paramInt1, int paramInt2)
  {
    GMTrace.i(3072512229376L, 22892);
    int i = this.GX.getDisplayOptions();
    if ((paramInt2 & 0x4) != 0) {
      this.Hz = true;
    }
    this.GX.setDisplayOptions(i & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
    GMTrace.o(3072512229376L, 22892);
  }
  
  public final void A(boolean paramBoolean)
  {
    GMTrace.i(3073451753472L, 22899);
    this.HF = paramBoolean;
    GMTrace.o(3073451753472L, 22899);
  }
  
  public final void C(boolean paramBoolean)
  {
    GMTrace.i(3074525495296L, 22907);
    ai localai2;
    ai localai1;
    if (paramBoolean)
    {
      if (!this.HI)
      {
        this.HI = true;
        B(false);
      }
      if (!paramBoolean) {
        break label113;
      }
      localai2 = this.GX.c(8, 100L);
      localai1 = this.Hv.c(0, 200L);
    }
    for (;;)
    {
      h localh = new h();
      localh.a(localai2, localai1);
      localh.start();
      GMTrace.o(3074525495296L, 22907);
      return;
      if (!this.HI) {
        break;
      }
      this.HI = false;
      B(false);
      break;
      label113:
      localai1 = this.GX.c(0, 200L);
      localai2 = this.Hv.c(8, 100L);
    }
  }
  
  public final b a(b.a parama)
  {
    GMTrace.i(3073183318016L, 22897);
    if (this.vXh != null) {
      this.vXh.finish();
    }
    this.Hv.dN();
    parama = new a(this.Hv.getContext(), parama);
    if (parama.dc())
    {
      parama.invalidate();
      this.Hv.c(parama);
      C(true);
      this.Hv.sendAccessibilityEvent(32);
      this.vXh = parama;
      GMTrace.o(3073183318016L, 22897);
      return parama;
    }
    GMTrace.o(3073183318016L, 22897);
    return null;
  }
  
  public final void cI()
  {
    GMTrace.i(3071706923008L, 22886);
    setDisplayOptions(0, 2);
    GMTrace.o(3071706923008L, 22886);
  }
  
  public final void cJ()
  {
    GMTrace.i(3071975358464L, 22888);
    setDisplayOptions(0, 8);
    GMTrace.o(3071975358464L, 22888);
  }
  
  public final void cK()
  {
    GMTrace.i(3072109576192L, 22889);
    setDisplayOptions(16, 16);
    GMTrace.o(3072109576192L, 22889);
  }
  
  public final void cZ()
  {
    GMTrace.i(3073720188928L, 22901);
    if (this.HH)
    {
      this.HH = false;
      B(true);
    }
    GMTrace.o(3073720188928L, 22901);
  }
  
  public final boolean collapseActionView()
  {
    GMTrace.i(3074928148480L, 22910);
    if ((this.GX != null) && (this.GX.hasExpandedActionView()))
    {
      this.GX.collapseActionView();
      GMTrace.o(3074928148480L, 22910);
      return true;
    }
    GMTrace.o(3074928148480L, 22910);
    return false;
  }
  
  public final void da()
  {
    GMTrace.i(3073988624384L, 22903);
    if (!this.HH)
    {
      this.HH = true;
      B(true);
    }
    GMTrace.o(3073988624384L, 22903);
  }
  
  public final void db()
  {
    GMTrace.i(3074793930752L, 22909);
    if (this.HK != null)
    {
      this.HK.cancel();
      this.HK = null;
    }
    GMTrace.o(3074793930752L, 22909);
  }
  
  public final void e(CharSequence paramCharSequence)
  {
    GMTrace.i(3072243793920L, 22890);
    this.GX.e(paramCharSequence);
    GMTrace.o(3072243793920L, 22890);
  }
  
  public final View getCustomView()
  {
    GMTrace.i(3072780664832L, 22894);
    View localView = this.GX.getCustomView();
    GMTrace.o(3072780664832L, 22894);
    return localView;
  }
  
  public final int getDisplayOptions()
  {
    GMTrace.i(3073049100288L, 22896);
    int i = this.GX.getDisplayOptions();
    GMTrace.o(3073049100288L, 22896);
    return i;
  }
  
  public final int getHeight()
  {
    GMTrace.i(3073317535744L, 22898);
    int i = this.Hu.getHeight();
    GMTrace.o(3073317535744L, 22898);
    return i;
  }
  
  public final Context getThemedContext()
  {
    GMTrace.i(3074659713024L, 22908);
    Object localObject;
    int i;
    if (this.Hs == null)
    {
      localObject = new TypedValue();
      this.mContext.getTheme().resolveAttribute(a.a.actionBarWidgetTheme, (TypedValue)localObject, true);
      i = ((TypedValue)localObject).resourceId;
      if (i == 0) {
        break label81;
      }
    }
    label81:
    for (this.Hs = new ContextThemeWrapper(this.mContext, i);; this.Hs = this.mContext)
    {
      localObject = this.Hs;
      GMTrace.o(3074659713024L, 22908);
      return (Context)localObject;
    }
  }
  
  public final CharSequence getTitle()
  {
    GMTrace.i(3072914882560L, 22895);
    CharSequence localCharSequence = this.GX.getTitle();
    GMTrace.o(3072914882560L, 22895);
    return localCharSequence;
  }
  
  public final void hide()
  {
    GMTrace.i(3073854406656L, 22902);
    if (!this.HG)
    {
      this.HG = true;
      B(false);
    }
    GMTrace.o(3073854406656L, 22902);
  }
  
  public final boolean isShowing()
  {
    GMTrace.i(3074391277568L, 22906);
    int i = this.Hu.getHeight();
    if ((this.HJ) && ((i == 0) || (i > 0)))
    {
      GMTrace.o(3074391277568L, 22906);
      return true;
    }
    GMTrace.o(3074391277568L, 22906);
    return false;
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(3071035834368L, 22881);
    paramConfiguration = this.GX.eH().getLayoutParams();
    if (paramConfiguration != null) {
      paramConfiguration.height = com.tencent.mm.compatible.util.a.f(this.mActivity);
    }
    this.GX.eH().setLayoutParams(paramConfiguration);
    GMTrace.o(3071035834368L, 22881);
  }
  
  public final void onWindowVisibilityChanged(int paramInt)
  {
    GMTrace.i(3071170052096L, 22882);
    this.HE = paramInt;
    GMTrace.o(3071170052096L, 22882);
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    GMTrace.i(3072646447104L, 22893);
    this.Hu.l(paramDrawable);
    GMTrace.o(3072646447104L, 22893);
  }
  
  public final void setCustomView(int paramInt)
  {
    GMTrace.i(3071572705280L, 22885);
    setCustomView(LayoutInflater.from(getThemedContext()).inflate(paramInt, this.GX.eH(), false));
    GMTrace.o(3071572705280L, 22885);
  }
  
  public final void setCustomView(View paramView)
  {
    GMTrace.i(3075062366208L, 22911);
    this.GX.setCustomView(paramView);
    GMTrace.o(3075062366208L, 22911);
  }
  
  public final void setDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    GMTrace.i(3071841140736L, 22887);
    if (paramBoolean) {}
    for (int i = 4;; i = 0)
    {
      setDisplayOptions(i, 4);
      GMTrace.o(3071841140736L, 22887);
      return;
    }
  }
  
  public final void setDisplayOptions(int paramInt)
  {
    GMTrace.i(3072378011648L, 22891);
    if ((paramInt & 0x4) != 0) {
      this.Hz = true;
    }
    this.GX.setDisplayOptions(paramInt);
    GMTrace.o(3072378011648L, 22891);
  }
  
  public final void setElevation(float paramFloat)
  {
    GMTrace.i(3070901616640L, 22880);
    z.g(this.Hu, paramFloat);
    GMTrace.o(3070901616640L, 22880);
  }
  
  public final void setIcon(int paramInt)
  {
    GMTrace.i(3075196583936L, 22912);
    this.GX.setIcon(paramInt);
    GMTrace.o(3075196583936L, 22912);
  }
  
  public final void setLogo(Drawable paramDrawable)
  {
    GMTrace.i(3075330801664L, 22913);
    this.GX.setLogo(paramDrawable);
    GMTrace.o(3075330801664L, 22913);
  }
  
  public final void show()
  {
    GMTrace.i(3073585971200L, 22900);
    if (this.HG)
    {
      this.HG = false;
      B(false);
    }
    GMTrace.o(3073585971200L, 22900);
  }
  
  public final void w(boolean paramBoolean)
  {
    GMTrace.i(3075465019392L, 22914);
    if (!this.Hz) {
      setDisplayHomeAsUpEnabled(paramBoolean);
    }
    GMTrace.o(3075465019392L, 22914);
  }
  
  public final void x(boolean paramBoolean)
  {
    GMTrace.i(3071304269824L, 22883);
    this.HL = paramBoolean;
    if ((!paramBoolean) && (this.HK != null)) {
      this.HK.cancel();
    }
    GMTrace.o(3071304269824L, 22883);
  }
  
  public final void y(boolean paramBoolean)
  {
    GMTrace.i(3071438487552L, 22884);
    if (paramBoolean == this.Ha)
    {
      GMTrace.o(3071438487552L, 22884);
      return;
    }
    this.Ha = paramBoolean;
    int j = this.Hb.size();
    int i = 0;
    while (i < j)
    {
      this.Hb.get(i);
      i += 1;
    }
    GMTrace.o(3071438487552L, 22884);
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
      GMTrace.i(3068083044352L, 22859);
      this.HR = paramContext;
      this.HS = parama;
      this$1 = new f(paramContext);
      d.this.Ko = 1;
      this.dn = d.this;
      this.dn.a(this);
      GMTrace.o(3068083044352L, 22859);
    }
    
    public final boolean a(f paramf, MenuItem paramMenuItem)
    {
      GMTrace.i(3070230528000L, 22875);
      if (this.HS != null)
      {
        boolean bool = this.HS.a(this, paramMenuItem);
        GMTrace.o(3070230528000L, 22875);
        return bool;
      }
      GMTrace.o(3070230528000L, 22875);
      return false;
    }
    
    public final void b(f paramf)
    {
      GMTrace.i(3070364745728L, 22876);
      if (this.HS == null)
      {
        GMTrace.o(3070364745728L, 22876);
        return;
      }
      invalidate();
      d.this.Hv.showOverflowMenu();
      GMTrace.o(3070364745728L, 22876);
    }
    
    public final boolean dc()
    {
      GMTrace.i(3068754132992L, 22864);
      this.dn.du();
      try
      {
        boolean bool = this.HS.a(this, this.dn);
        this.dn.dv();
        GMTrace.o(3068754132992L, 22864);
        return bool;
      }
      finally
      {
        this.dn.dv();
      }
    }
    
    public final void finish()
    {
      GMTrace.i(3068485697536L, 22862);
      if (d.this.vXh != this)
      {
        GMTrace.o(3068485697536L, 22862);
        return;
      }
      if (!d.a(d.this.HG, d.this.HH, false))
      {
        d.this.HB = this;
        d.this.HC = this.HS;
      }
      for (;;)
      {
        this.HS = null;
        d.this.C(false);
        d.this.Hv.dM();
        d.this.GX.eH().sendAccessibilityEvent(32);
        d.this.vXh = null;
        GMTrace.o(3068485697536L, 22862);
        return;
        this.HS.a(this);
      }
    }
    
    public final View getCustomView()
    {
      GMTrace.i(3070096310272L, 22874);
      if (this.HT != null)
      {
        View localView = (View)this.HT.get();
        GMTrace.o(3070096310272L, 22874);
        return localView;
      }
      GMTrace.o(3070096310272L, 22874);
      return null;
    }
    
    public final Menu getMenu()
    {
      GMTrace.i(3068351479808L, 22861);
      f localf = this.dn;
      GMTrace.o(3068351479808L, 22861);
      return localf;
    }
    
    public final MenuInflater getMenuInflater()
    {
      GMTrace.i(3068217262080L, 22860);
      g localg = new g(this.HR);
      GMTrace.o(3068217262080L, 22860);
      return localg;
    }
    
    public final CharSequence getSubtitle()
    {
      GMTrace.i(3069693657088L, 22871);
      CharSequence localCharSequence = d.this.Hv.tY;
      GMTrace.o(3069693657088L, 22871);
      return localCharSequence;
    }
    
    public final CharSequence getTitle()
    {
      GMTrace.i(3069559439360L, 22870);
      CharSequence localCharSequence = d.this.Hv.tX;
      GMTrace.o(3069559439360L, 22870);
      return localCharSequence;
    }
    
    public final void invalidate()
    {
      GMTrace.i(3068619915264L, 22863);
      if (d.this.vXh != this)
      {
        GMTrace.o(3068619915264L, 22863);
        return;
      }
      this.dn.du();
      try
      {
        this.HS.b(this, this.dn);
        this.dn.dv();
        GMTrace.o(3068619915264L, 22863);
        return;
      }
      finally
      {
        this.dn.dv();
      }
    }
    
    public final boolean isTitleOptional()
    {
      GMTrace.i(3069962092544L, 22873);
      boolean bool = d.this.Hv.LM;
      GMTrace.o(3069962092544L, 22873);
      return bool;
    }
    
    public final void setCustomView(View paramView)
    {
      GMTrace.i(3068888350720L, 22865);
      d.this.Hv.setCustomView(paramView);
      this.HT = new WeakReference(paramView);
      GMTrace.o(3068888350720L, 22865);
    }
    
    public final void setSubtitle(int paramInt)
    {
      GMTrace.i(3069425221632L, 22869);
      setSubtitle(d.this.mContext.getResources().getString(paramInt));
      GMTrace.o(3069425221632L, 22869);
    }
    
    public final void setSubtitle(CharSequence paramCharSequence)
    {
      GMTrace.i(3069022568448L, 22866);
      d.this.Hv.setSubtitle(paramCharSequence);
      GMTrace.o(3069022568448L, 22866);
    }
    
    public final void setTitle(int paramInt)
    {
      GMTrace.i(3069291003904L, 22868);
      setTitle(d.this.mContext.getResources().getString(paramInt));
      GMTrace.o(3069291003904L, 22868);
    }
    
    public final void setTitle(CharSequence paramCharSequence)
    {
      GMTrace.i(3069156786176L, 22867);
      d.this.Hv.setTitle(paramCharSequence);
      GMTrace.o(3069156786176L, 22867);
    }
    
    public final void setTitleOptionalHint(boolean paramBoolean)
    {
      GMTrace.i(3069827874816L, 22872);
      super.setTitleOptionalHint(paramBoolean);
      d.this.Hv.K(paramBoolean);
      GMTrace.o(3069827874816L, 22872);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */