package com.tencent.mm.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.a.kf;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.ui.widget.SwipeBackLayout.a;
import com.tencent.mm.v.a.h;

public abstract class u
  extends i
  implements View.OnAttachStateChangeListener, com.tencent.mm.ui.i.a
{
  String className;
  public p vKB;
  protected ActionBarActivity vMj;
  public boolean vMk;
  public SwipeBackLayout vMl;
  private u vMm;
  private boolean vMn;
  private com.tencent.mm.ui.i.a vMo;
  private boolean vMp;
  
  public u()
  {
    GMTrace.i(2850516107264L, 21238);
    this.vMk = false;
    this.vKB = new p()
    {
      protected final void VC()
      {
        GMTrace.i(1873679482880L, 13960);
        u.VC();
        GMTrace.o(1873679482880L, 13960);
      }
      
      protected final String aJX()
      {
        GMTrace.i(1873276829696L, 13957);
        String str = u.this.aJX();
        GMTrace.o(1873276829696L, 13957);
        return str;
      }
      
      public final boolean aaS()
      {
        GMTrace.i(1874082136064L, 13963);
        boolean bool = u.this.aaS();
        GMTrace.o(1874082136064L, 13963);
        return bool;
      }
      
      public final void aoK()
      {
        GMTrace.i(1873545265152L, 13959);
        u.this.aoK();
        GMTrace.o(1873545265152L, 13959);
      }
      
      protected final void bH(View paramAnonymousView)
      {
        GMTrace.i(1873142611968L, 13956);
        u.this.bH(paramAnonymousView);
        GMTrace.o(1873142611968L, 13956);
      }
      
      protected final boolean bXl()
      {
        GMTrace.i(1873947918336L, 13962);
        GMTrace.o(1873947918336L, 13962);
        return false;
      }
      
      protected final View bXo()
      {
        GMTrace.i(1873411047424L, 13958);
        View localView = u.this.bXo();
        GMTrace.o(1873411047424L, 13958);
        return localView;
      }
      
      protected final String getClassName()
      {
        GMTrace.i(1873813700608L, 13961);
        String str = u.this.getClass().getName();
        GMTrace.o(1873813700608L, 13961);
        return str;
      }
      
      protected final int getLayoutId()
      {
        GMTrace.i(1873008394240L, 13955);
        int i = u.this.getLayoutId();
        GMTrace.o(1873008394240L, 13955);
        return i;
      }
    };
    this.vMn = false;
    this.vMp = false;
    GMTrace.o(2850516107264L, 21238);
  }
  
  public u(boolean paramBoolean)
  {
    super(paramBoolean);
    GMTrace.i(2850650324992L, 21239);
    this.vMk = false;
    this.vKB = new p()
    {
      protected final void VC()
      {
        GMTrace.i(1873679482880L, 13960);
        u.VC();
        GMTrace.o(1873679482880L, 13960);
      }
      
      protected final String aJX()
      {
        GMTrace.i(1873276829696L, 13957);
        String str = u.this.aJX();
        GMTrace.o(1873276829696L, 13957);
        return str;
      }
      
      public final boolean aaS()
      {
        GMTrace.i(1874082136064L, 13963);
        boolean bool = u.this.aaS();
        GMTrace.o(1874082136064L, 13963);
        return bool;
      }
      
      public final void aoK()
      {
        GMTrace.i(1873545265152L, 13959);
        u.this.aoK();
        GMTrace.o(1873545265152L, 13959);
      }
      
      protected final void bH(View paramAnonymousView)
      {
        GMTrace.i(1873142611968L, 13956);
        u.this.bH(paramAnonymousView);
        GMTrace.o(1873142611968L, 13956);
      }
      
      protected final boolean bXl()
      {
        GMTrace.i(1873947918336L, 13962);
        GMTrace.o(1873947918336L, 13962);
        return false;
      }
      
      protected final View bXo()
      {
        GMTrace.i(1873411047424L, 13958);
        View localView = u.this.bXo();
        GMTrace.o(1873411047424L, 13958);
        return localView;
      }
      
      protected final String getClassName()
      {
        GMTrace.i(1873813700608L, 13961);
        String str = u.this.getClass().getName();
        GMTrace.o(1873813700608L, 13961);
        return str;
      }
      
      protected final int getLayoutId()
      {
        GMTrace.i(1873008394240L, 13955);
        int i = u.this.getLayoutId();
        GMTrace.o(1873008394240L, 13955);
        return i;
      }
    };
    this.vMn = false;
    this.vMp = false;
    GMTrace.o(2850650324992L, 21239);
  }
  
  private void L(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(2858971824128L, 21301);
    if (paramBoolean1 == this.vMp)
    {
      GMTrace.o(2858971824128L, 21301);
      return;
    }
    boolean bool1;
    label83:
    boolean bool2;
    if (this.vMm == null)
    {
      paramBoolean1 = this.vMn;
      if ((!isAdded()) || (this.oD) || (this.mView == null) || (this.mView.getWindowToken() == null) || (this.mView.getVisibility() != 0)) {
        break label350;
      }
      bool1 = true;
      bool2 = getUserVisibleHint();
      if ((!paramBoolean1) || (!bool1) || (!bool2) || (paramBoolean2)) {
        break label356;
      }
    }
    label350:
    label356:
    for (paramBoolean2 = true;; paramBoolean2 = false)
    {
      w.i("MicroMsg.MMFragment", "[filterAndNotifyVisibility] visible = %s parent = %s, super = %s, hint = %s name:%s", new Object[] { Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean1), Boolean.valueOf(bool1), Boolean.valueOf(bool2), getClass().getName() });
      if (paramBoolean2 != this.vMp)
      {
        this.vMp = paramBoolean2;
        paramBoolean1 = this.vMp;
        if (this.vMo != null) {
          this.vMo.ll(paramBoolean1);
        }
        int j = -1;
        Object localObject = this.ol;
        int i = j;
        if (localObject != null)
        {
          i = j;
          if (((Bundle)localObject).containsKey(getClass().getName())) {
            i = ((Bundle)localObject).getInt(getClass().getName());
          }
        }
        w.i("MicroMsg.MMFragment", "[onVisibilityChanged] visible:%s name:%s id:%s", new Object[] { Boolean.valueOf(paramBoolean1), getClass().getName(), Integer.valueOf(i) });
        localObject = new kf();
        ((kf)localObject).eOx.name = getClass().getName();
        ((kf)localObject).eOx.id = i;
        ((kf)localObject).eOx.visible = paramBoolean1;
        com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
      }
      GMTrace.o(2858971824128L, 21301);
      return;
      paramBoolean1 = this.vMm.vMp;
      break;
      bool1 = false;
      break label83;
    }
  }
  
  protected static void VC()
  {
    GMTrace.i(2850784542720L, 21240);
    GMTrace.o(2850784542720L, 21240);
  }
  
  private void lm(boolean paramBoolean)
  {
    GMTrace.i(2858837606400L, 21300);
    this.vMn = paramBoolean;
    L(paramBoolean, false);
    GMTrace.o(2858837606400L, 21300);
  }
  
  public void AW(int paramInt)
  {
    GMTrace.i(2854811074560L, 21270);
    this.vKB.AW(paramInt);
    GMTrace.o(2854811074560L, 21270);
  }
  
  public void Ba(int paramInt)
  {
    GMTrace.i(2856287469568L, 21281);
    this.vKB.Ba(paramInt);
    GMTrace.o(2856287469568L, 21281);
  }
  
  public final void Be(int paramInt)
  {
    GMTrace.i(2855884816384L, 21278);
    p localp = this.vKB;
    p.a locala = localp.Bd(2);
    if ((locala != null) && (locala.vLA != paramInt))
    {
      locala.vLA = paramInt;
      localp.aQ();
    }
    GMTrace.o(2855884816384L, 21278);
  }
  
  public void Bf(int paramInt)
  {
    GMTrace.i(2856153251840L, 21280);
    p localp = this.vKB;
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      localp.vKV = bool;
      localp.bXC();
      GMTrace.o(2856153251840L, 21280);
      return;
    }
  }
  
  public final String Bg(int paramInt)
  {
    GMTrace.i(2857226993664L, 21288);
    String str = bWQ().getString(paramInt);
    GMTrace.o(2857226993664L, 21288);
    return str;
  }
  
  public void Ve(String paramString)
  {
    GMTrace.i(2854676856832L, 21269);
    this.vKB.Ve(paramString);
    GMTrace.o(2854676856832L, 21269);
  }
  
  public final void Vf(String paramString)
  {
    GMTrace.i(2854408421376L, 21267);
    this.vKB.Vf(paramString);
    GMTrace.o(2854408421376L, 21267);
  }
  
  public void Zp()
  {
    GMTrace.i(2851589849088L, 21246);
    GMTrace.o(2851589849088L, 21246);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(2855750598656L, 21277);
    this.vKB.a(paramInt1, paramInt2, paramInt3, paramOnMenuItemClickListener);
    GMTrace.o(2855750598656L, 21277);
  }
  
  public final void a(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(2855616380928L, 21276);
    this.vKB.a(paramInt1, paramInt2, paramOnMenuItemClickListener);
    GMTrace.o(2855616380928L, 21276);
  }
  
  public final void a(ActionBarActivity paramActionBarActivity)
  {
    GMTrace.i(2852395155456L, 21252);
    this.vMj = paramActionBarActivity;
    GMTrace.o(2852395155456L, 21252);
  }
  
  public void a(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(2856019034112L, 21279);
    this.vKB.a(paramOnMenuItemClickListener, 0);
    GMTrace.o(2856019034112L, 21279);
  }
  
  public final void a(boolean paramBoolean, com.tencent.mm.ui.tools.p paramp)
  {
    GMTrace.i(2855482163200L, 21275);
    this.vKB.a(paramBoolean, paramp);
    GMTrace.o(2855482163200L, 21275);
  }
  
  public String aJX()
  {
    GMTrace.i(2853871550464L, 21263);
    GMTrace.o(2853871550464L, 21263);
    return "";
  }
  
  public final void aM()
  {
    GMTrace.i(2851052978176L, 21242);
    View localView;
    if (bXH())
    {
      localView = this.vKB.hqF;
      ViewGroup localViewGroup = (ViewGroup)localView.getParent();
      if (localViewGroup == null) {
        break label128;
      }
      this.vMl = ((SwipeBackLayout)LayoutInflater.from(bWQ()).inflate(a.h.gfR, localViewGroup, false));
      localViewGroup.removeView(localView);
      localViewGroup.addView(this.vMl);
    }
    for (;;)
    {
      this.vMl.addView(localView);
      this.vMl.Hw = localView;
      this.vMl.mM(true);
      this.vMl.xsO = new SwipeBackLayout.a()
      {
        public final void Zp()
        {
          GMTrace.i(3063788077056L, 22827);
          u.this.Zp();
          GMTrace.o(3063788077056L, 22827);
        }
        
        public final void Zq()
        {
          GMTrace.i(3064056512512L, 22829);
          u.this.bXI();
          GMTrace.o(3064056512512L, 22829);
        }
        
        public final void onCancel()
        {
          GMTrace.i(3063922294784L, 22828);
          u.this.bXJ();
          GMTrace.o(3063922294784L, 22828);
        }
      };
      this.mView.addOnAttachStateChangeListener(this);
      GMTrace.o(2851052978176L, 21242);
      return;
      label128:
      this.vMl = ((SwipeBackLayout)LayoutInflater.from(bWQ()).inflate(a.h.gfR, null));
    }
  }
  
  public boolean aaS()
  {
    GMTrace.i(2851455631360L, 21245);
    GMTrace.o(2851455631360L, 21245);
    return false;
  }
  
  public void aoK()
  {
    GMTrace.i(2852260937728L, 21251);
    GMTrace.o(2852260937728L, 21251);
  }
  
  public boolean avJ()
  {
    GMTrace.i(2856421687296L, 21282);
    boolean bool = this.vKB.avJ();
    GMTrace.o(2856421687296L, 21282);
    return bool;
  }
  
  public void bH(View paramView)
  {
    GMTrace.i(2852126720000L, 21250);
    GMTrace.o(2852126720000L, 21250);
  }
  
  public final FragmentActivity bWQ()
  {
    GMTrace.i(2856958558208L, 21286);
    if (this.vKB.vKW != null)
    {
      localObject = this.vKB.vKW;
      GMTrace.o(2856958558208L, 21286);
      return (FragmentActivity)localObject;
    }
    Object localObject = super.aG();
    GMTrace.o(2856958558208L, 21286);
    return (FragmentActivity)localObject;
  }
  
  public final boolean bXH()
  {
    GMTrace.i(2851187195904L, 21243);
    if ((d.et(19)) && (com.tencent.mm.compatible.h.a.tw()))
    {
      boolean bool = bmX();
      GMTrace.o(2851187195904L, 21243);
      return bool;
    }
    GMTrace.o(2851187195904L, 21243);
    return false;
  }
  
  public void bXI()
  {
    GMTrace.i(2851724066816L, 21247);
    GMTrace.o(2851724066816L, 21247);
  }
  
  public void bXJ()
  {
    GMTrace.i(2851858284544L, 21248);
    GMTrace.o(2851858284544L, 21248);
  }
  
  public final Resources bXK()
  {
    GMTrace.i(2856824340480L, 21285);
    Object localObject = super.aG();
    if (localObject == null)
    {
      localObject = ab.getContext().getResources();
      GMTrace.o(2856824340480L, 21285);
      return (Resources)localObject;
    }
    localObject = ((FragmentActivity)localObject).getResources();
    GMTrace.o(2856824340480L, 21285);
    return (Resources)localObject;
  }
  
  public final Resources bXL()
  {
    GMTrace.i(2857092775936L, 21287);
    Resources localResources = bWQ().getResources();
    GMTrace.o(2857092775936L, 21287);
    return localResources;
  }
  
  public View bXo()
  {
    GMTrace.i(2854139985920L, 21265);
    GMTrace.o(2854139985920L, 21265);
    return null;
  }
  
  public final Activity bcT()
  {
    GMTrace.i(2852529373184L, 21253);
    ActionBarActivity localActionBarActivity = this.vKB.vKW;
    GMTrace.o(2852529373184L, 21253);
    return localActionBarActivity;
  }
  
  public boolean bmX()
  {
    GMTrace.i(2851321413632L, 21244);
    GMTrace.o(2851321413632L, 21244);
    return true;
  }
  
  public final void dp(boolean paramBoolean)
  {
    GMTrace.i(2852663590912L, 21254);
    this.vKB.dp(paramBoolean);
    GMTrace.o(2852663590912L, 21254);
  }
  
  public final String e(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(2857361211392L, 21289);
    paramVarArgs = bWQ().getString(paramInt, paramVarArgs);
    GMTrace.o(2857361211392L, 21289);
    return paramVarArgs;
  }
  
  public void finish()
  {
    GMTrace.i(2856555905024L, 21283);
    super.finish();
    int i = bWQ().getIntent().getIntExtra("MMActivity.OverrideEnterAnimation", -1);
    int j = bWQ().getIntent().getIntExtra("MMActivity.OverrideExitAnimation", -1);
    if (i != -1) {
      this.vKB.vKW.overridePendingTransition(i, j);
    }
    GMTrace.o(2856555905024L, 21283);
  }
  
  public abstract int getLayoutId();
  
  public final void le(boolean paramBoolean)
  {
    GMTrace.i(2854945292288L, 21271);
    this.vKB.le(paramBoolean);
    GMTrace.o(2854945292288L, 21271);
  }
  
  public final void lf(boolean paramBoolean)
  {
    GMTrace.i(2855079510016L, 21272);
    this.vKB.a(true, -1, paramBoolean);
    GMTrace.o(2855079510016L, 21272);
  }
  
  public final void lg(boolean paramBoolean)
  {
    GMTrace.i(2855213727744L, 21273);
    this.vKB.b(true, -1, paramBoolean);
    GMTrace.o(2855213727744L, 21273);
  }
  
  public final void lk(boolean paramBoolean)
  {
    GMTrace.i(2855347945472L, 21274);
    this.vKB.b(false, 2, paramBoolean);
    GMTrace.o(2855347945472L, 21274);
  }
  
  public final void ll(boolean paramBoolean)
  {
    GMTrace.i(2858703388672L, 21299);
    L(paramBoolean, false);
    GMTrace.o(2858703388672L, 21299);
  }
  
  public void oM(int paramInt)
  {
    GMTrace.i(2854542639104L, 21268);
    this.vKB.oM(paramInt);
    GMTrace.o(2854542639104L, 21268);
  }
  
  public final void onAttach(Context paramContext)
  {
    GMTrace.i(2858032300032L, 21294);
    super.onAttach(paramContext);
    paramContext = this.oA;
    if ((paramContext != null) && ((paramContext instanceof u)))
    {
      this.vMm = ((u)paramContext);
      this.vMm.vMo = this;
    }
    L(true, false);
    GMTrace.o(2858032300032L, 21294);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2850918760448L, 21241);
    super.onCreate(paramBundle);
    this.vKB.a(bWQ().getBaseContext(), (ActionBarActivity)bWQ());
    GMTrace.o(2850918760448L, 21241);
  }
  
  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    GMTrace.i(2853468897280L, 21260);
    if (!this.vKB.onCreateOptionsMenu(paramMenu)) {
      super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
    }
    GMTrace.o(2853468897280L, 21260);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    GMTrace.i(2851992502272L, 21249);
    aH();
    paramLayoutInflater = this.vKB.hqF;
    GMTrace.o(2851992502272L, 21249);
    return paramLayoutInflater;
  }
  
  public void onDestroy()
  {
    GMTrace.i(2853200461824L, 21258);
    super.onDestroy();
    this.vKB.onDestroy();
    GMTrace.o(2853200461824L, 21258);
  }
  
  public void onDestroyView()
  {
    GMTrace.i(2858300735488L, 21296);
    super.onDestroyView();
    this.mView.removeOnAttachStateChangeListener(this);
    GMTrace.o(2858300735488L, 21296);
  }
  
  public void onDetach()
  {
    GMTrace.i(2858166517760L, 21295);
    if (this.vMm != null) {
      this.vMm.vMo = null;
    }
    super.onDetach();
    L(false, false);
    this.vMm = null;
    GMTrace.o(2858166517760L, 21295);
  }
  
  public final void onHiddenChanged(boolean paramBoolean)
  {
    GMTrace.i(2857763864576L, 21292);
    super.onHiddenChanged(paramBoolean);
    if (!paramBoolean) {}
    for (boolean bool = true;; bool = false)
    {
      L(bool, paramBoolean);
      GMTrace.o(2857763864576L, 21292);
      return;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2852932026368L, 21256);
    if (this.vKB.onKeyDown(paramInt, paramKeyEvent))
    {
      GMTrace.o(2852932026368L, 21256);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2852932026368L, 21256);
    return bool;
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2852797808640L, 21255);
    if (this.vKB.onKeyUp(paramInt, paramKeyEvent))
    {
      GMTrace.o(2852797808640L, 21255);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(2852797808640L, 21255);
    return bool;
  }
  
  public final boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    GMTrace.i(2853737332736L, 21262);
    boolean bool = this.vKB.onOptionsItemSelected(paramMenuItem);
    GMTrace.o(2853737332736L, 21262);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(2853334679552L, 21259);
    long l = System.currentTimeMillis();
    ac.aI(2, this.className);
    super.onPause();
    if (this.vMk) {
      this.vMk = false;
    }
    for (;;)
    {
      w.v("MicroMsg.INIT", "KEVIN MMActivity onPause:" + (System.currentTimeMillis() - l));
      lm(false);
      GMTrace.o(2853334679552L, 21259);
      return;
      this.vKB.onPause();
    }
  }
  
  public final void onPrepareOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(2853603115008L, 21261);
    this.vKB.onPrepareOptionsMenu(paramMenu);
    super.onPrepareOptionsMenu(paramMenu);
    GMTrace.o(2853603115008L, 21261);
  }
  
  public void onResume()
  {
    GMTrace.i(2853066244096L, 21257);
    long l = System.currentTimeMillis();
    ac.aI(1, this.className);
    super.onResume();
    w.v("MicroMsg.INIT", "KEVIN MMActivity super..onResume " + (System.currentTimeMillis() - l));
    this.vKB.onResume();
    w.v("MicroMsg.INIT", "KEVIN MMActivity onResume :" + (System.currentTimeMillis() - l));
    lm(true);
    GMTrace.o(2853066244096L, 21257);
  }
  
  public void onStart()
  {
    GMTrace.i(2857495429120L, 21290);
    this.vKB.onStart();
    super.onStart();
    lm(true);
    GMTrace.o(2857495429120L, 21290);
  }
  
  public void onStop()
  {
    GMTrace.i(2857629646848L, 21291);
    super.onStop();
    lm(false);
    GMTrace.o(2857629646848L, 21291);
  }
  
  public void onViewAttachedToWindow(View paramView)
  {
    GMTrace.i(2858434953216L, 21297);
    L(true, false);
    GMTrace.o(2858434953216L, 21297);
  }
  
  public void onViewDetachedFromWindow(View paramView)
  {
    GMTrace.i(2858569170944L, 21298);
    L(false, false);
    GMTrace.o(2858569170944L, 21298);
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    GMTrace.i(2857898082304L, 21293);
    w.i("MicroMsg.MMFragment", "[setUserVisibleHint] isVisibleToUser:%s name:%s", new Object[] { Boolean.valueOf(paramBoolean), getClass().getName() });
    super.setUserVisibleHint(paramBoolean);
    L(paramBoolean, false);
    GMTrace.o(2857898082304L, 21293);
  }
  
  public void sq(String paramString)
  {
    GMTrace.i(2854274203648L, 21266);
    this.vKB.sq(paramString);
    GMTrace.o(2854274203648L, 21266);
  }
  
  public final void startActivity(Intent paramIntent)
  {
    GMTrace.i(2856690122752L, 21284);
    super.startActivity(paramIntent);
    GMTrace.o(2856690122752L, 21284);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */