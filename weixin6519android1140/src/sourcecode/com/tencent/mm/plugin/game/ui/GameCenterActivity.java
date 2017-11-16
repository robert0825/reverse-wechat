package com.tencent.mm.plugin.game.ui;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.content.a;
import android.support.v7.app.ActionBar;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowInsets;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.plugin.game.c.ce;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.5;
import com.tencent.mm.ui.p.a;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.v.a.k;
import java.util.LinkedList;

public abstract class GameCenterActivity
  extends GameBaseActivity
{
  protected ActionBar FM;
  protected int iDc;
  protected View lUG;
  protected View lUH;
  protected int lUI;
  protected String lUJ;
  private ce lUK;
  
  public GameCenterActivity()
  {
    GMTrace.i(19277289619456L, 143627);
    this.lUI = 0;
    this.lUJ = null;
    GMTrace.o(19277289619456L, 143627);
  }
  
  private boolean aGx()
  {
    GMTrace.i(19278094925824L, 143633);
    if ((!bg.nm(this.lUJ)) && (this.lUJ.equals("black")))
    {
      GMTrace.o(19278094925824L, 143633);
      return true;
    }
    GMTrace.o(19278094925824L, 143633);
    return false;
  }
  
  @TargetApi(21)
  private void setStatusBarColor(int paramInt)
  {
    GMTrace.i(19277960708096L, 143632);
    if ((this.iDc <= 0) || (com.tencent.mm.compatible.util.d.eu(21)))
    {
      GMTrace.o(19277960708096L, 143632);
      return;
    }
    getWindow().setStatusBarColor(0);
    ViewGroup.LayoutParams localLayoutParams;
    if (this.lUH == null)
    {
      this.lUH = new View(this);
      this.lUH.setId(R.h.bCz);
      localLayoutParams = new ViewGroup.LayoutParams(-1, this.iDc);
      ((ViewGroup)findViewById(16908290)).addView(this.lUH, localLayoutParams);
    }
    for (;;)
    {
      this.lUH.setBackgroundColor(paramInt);
      GMTrace.o(19277960708096L, 143632);
      return;
      localLayoutParams = this.lUH.getLayoutParams();
      if (localLayoutParams.height != this.iDc)
      {
        localLayoutParams.height = this.iDc;
        this.lUH.setLayoutParams(localLayoutParams);
      }
    }
  }
  
  protected final void VC()
  {
    GMTrace.i(19277558054912L, 143629);
    aq(5);
    aq(9);
    setProgressBarIndeterminateVisibility(false);
    GMTrace.o(19277558054912L, 143629);
  }
  
  public final void a(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(19278497579008L, 143636);
    if (!com.tencent.mm.compatible.util.d.et(21))
    {
      super.a(paramInt1, paramInt2, paramOnMenuItemClickListener);
      GMTrace.o(19278497579008L, 143636);
      return;
    }
    Drawable localDrawable = a.b(this, paramInt2);
    if (localDrawable == null)
    {
      GMTrace.o(19278497579008L, 143636);
      return;
    }
    if (aGx()) {
      localDrawable.setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
    }
    for (;;)
    {
      a(paramInt1, getString(a.k.ggi), localDrawable, paramOnMenuItemClickListener);
      GMTrace.o(19278497579008L, 143636);
      return;
      localDrawable.clearColorFilter();
    }
  }
  
  public final void a(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(19278363361280L, 143635);
    if ((com.tencent.mm.compatible.util.d.et(21)) && (aGx()))
    {
      p localp = this.vKB;
      int i = p.b.vLF;
      p.a locala = new p.a();
      locala.vLz = paramInt;
      locala.text = paramString;
      locala.textColor = -16777216;
      locala.orU = paramOnMenuItemClickListener;
      locala.lit = null;
      locala.vLE = i;
      localp.Bc(locala.vLz);
      localp.vKZ.add(locala);
      new ae().postDelayed(new p.5(localp), 200L);
      GMTrace.o(19278363361280L, 143635);
      return;
    }
    super.a(paramInt, paramString, paramOnMenuItemClickListener);
    GMTrace.o(19278363361280L, 143635);
  }
  
  public final void a(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(20360426684416L, 151697);
    w.i("MicroMsg.GameCenterActivity", "setBackBtn");
    super.a(paramOnMenuItemClickListener, 0);
    if ((com.tencent.mm.compatible.util.d.et(21)) && (aGx()))
    {
      w.i("MicroMsg.GameCenterActivity", "setBackBtn, setBackBtnColorFilter");
      bXs();
    }
    GMTrace.o(20360426684416L, 151697);
  }
  
  public final void a(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt)
  {
    GMTrace.i(20360292466688L, 151696);
    w.i("MicroMsg.GameCenterActivity", "setBackBtn");
    super.a(paramOnMenuItemClickListener, paramInt);
    if ((com.tencent.mm.compatible.util.d.et(21)) && (aGx()))
    {
      w.i("MicroMsg.GameCenterActivity", "setBackBtn, setBackBtnColorFilter");
      bXs();
    }
    GMTrace.o(20360292466688L, 151696);
  }
  
  @TargetApi(21)
  protected final void a(ViewGroup paramViewGroup, WindowInsets paramWindowInsets)
  {
    GMTrace.i(19277826490368L, 143631);
    if (this.iDc == paramWindowInsets.getSystemWindowInsetTop())
    {
      GMTrace.o(19277826490368L, 143631);
      return;
    }
    this.iDc = paramWindowInsets.getSystemWindowInsetTop();
    aGw();
    Object localObject = paramViewGroup;
    if ((paramViewGroup instanceof SwipeBackLayout)) {
      localObject = paramViewGroup.getChildAt(0);
    }
    int i = R.h.action_bar_container;
    if (i > 0)
    {
      paramViewGroup = ((View)localObject).findViewById(i);
      if (paramViewGroup != null)
      {
        localObject = (ViewGroup.MarginLayoutParams)paramViewGroup.getLayoutParams();
        ((ViewGroup.MarginLayoutParams)localObject).topMargin = paramWindowInsets.getSystemWindowInsetTop();
        paramViewGroup.setLayoutParams((ViewGroup.LayoutParams)localObject);
        paramViewGroup.requestLayout();
      }
    }
    w.i("MicroMsg.GameCenterActivity", "setInitialStatusBarStyle");
    if (com.tencent.mm.compatible.util.d.et(21))
    {
      if (this.lUI != 0)
      {
        if (this.FM != null) {
          this.FM.setBackgroundDrawable(new ColorDrawable(this.lUI));
        }
        if (aGx())
        {
          w.i("MicroMsg.GameCenterActivity", "setBackBtnColorFilter");
          bXs();
        }
        int j = this.lUI;
        boolean bool = aGx();
        if ((Build.VERSION.SDK_INT >= 23) && (!h.tE()))
        {
          setStatusBarColor(j);
          paramViewGroup = getWindow();
          i = paramViewGroup.getDecorView().getSystemUiVisibility();
          if (bool) {
            i |= 0x2000;
          }
          for (;;)
          {
            paramViewGroup.getDecorView().setSystemUiVisibility(i);
            GMTrace.o(19277826490368L, 143631);
            return;
            i &= 0xDFFF;
          }
        }
        if (Build.VERSION.SDK_INT >= 21)
        {
          i = j;
          if (bool) {
            i = com.tencent.mm.plugin.webview.ui.tools.d.k(j, 0.78F);
          }
          setStatusBarColor(i);
        }
        GMTrace.o(19277826490368L, 143631);
        return;
      }
      setStatusBarColor(getResources().getColor(R.e.aPb));
    }
    GMTrace.o(19277826490368L, 143631);
  }
  
  protected final void aGw()
  {
    GMTrace.i(19277692272640L, 143630);
    if (this.lUG == null)
    {
      GMTrace.o(19277692272640L, 143630);
      return;
    }
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.lUG.getLayoutParams();
    int j = this.iDc;
    if (this.FM != null) {}
    for (int i = this.FM.getHeight();; i = 0)
    {
      i += j;
      if (i != localMarginLayoutParams.topMargin)
      {
        localMarginLayoutParams.topMargin = i;
        this.lUG.setLayoutParams(localMarginLayoutParams);
      }
      GMTrace.o(19277692272640L, 143630);
      return;
    }
  }
  
  public final void oM(int paramInt)
  {
    GMTrace.i(19278229143552L, 143634);
    super.oM(paramInt);
    if ((com.tencent.mm.compatible.util.d.et(21)) && (aGx())) {
      AV(-16777216);
    }
    GMTrace.o(19278229143552L, 143634);
  }
  
  /* Error */
  public void onCreate(final android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: ldc2_w 390
    //   3: ldc_w 392
    //   6: invokestatic 33	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: aload_1
    //   11: invokespecial 394	com/tencent/mm/plugin/game/ui/GameBaseActivity:onCreate	(Landroid/os/Bundle;)V
    //   14: aload_0
    //   15: aload_0
    //   16: invokevirtual 400	android/support/v7/app/AppCompatActivity:cN	()Landroid/support/v7/app/d;
    //   19: invokevirtual 406	android/support/v7/app/d:cO	()Landroid/support/v7/app/ActionBar;
    //   22: putfield 313	com/tencent/mm/plugin/game/ui/GameCenterActivity:FM	Landroid/support/v7/app/ActionBar;
    //   25: aload_0
    //   26: invokestatic 412	com/tencent/mm/plugin/game/model/g:aFi	()Lcom/tencent/mm/plugin/game/model/g;
    //   29: invokevirtual 416	com/tencent/mm/plugin/game/model/g:aFk	()Lcom/tencent/mm/plugin/game/c/ce;
    //   32: putfield 418	com/tencent/mm/plugin/game/ui/GameCenterActivity:lUK	Lcom/tencent/mm/plugin/game/c/ce;
    //   35: aload_0
    //   36: getfield 418	com/tencent/mm/plugin/game/ui/GameCenterActivity:lUK	Lcom/tencent/mm/plugin/game/c/ce;
    //   39: ifnull +28 -> 67
    //   42: aload_0
    //   43: aload_0
    //   44: getfield 418	com/tencent/mm/plugin/game/ui/GameCenterActivity:lUK	Lcom/tencent/mm/plugin/game/c/ce;
    //   47: getfield 423	com/tencent/mm/plugin/game/c/ce:gjg	Ljava/lang/String;
    //   50: invokestatic 429	com/tencent/mm/plugin/game/d/c:parseColor	(Ljava/lang/String;)I
    //   53: putfield 35	com/tencent/mm/plugin/game/ui/GameCenterActivity:lUI	I
    //   56: aload_0
    //   57: aload_0
    //   58: getfield 418	com/tencent/mm/plugin/game/ui/GameCenterActivity:lUK	Lcom/tencent/mm/plugin/game/c/ce;
    //   61: getfield 432	com/tencent/mm/plugin/game/c/ce:lSU	Ljava/lang/String;
    //   64: putfield 37	com/tencent/mm/plugin/game/ui/GameCenterActivity:lUJ	Ljava/lang/String;
    //   67: aload_0
    //   68: aload_0
    //   69: getfield 197	com/tencent/mm/ui/MMActivity:vKB	Lcom/tencent/mm/ui/p;
    //   72: getfield 435	com/tencent/mm/ui/p:hqF	Landroid/view/View;
    //   75: putfield 373	com/tencent/mm/plugin/game/ui/GameCenterActivity:lUG	Landroid/view/View;
    //   78: aload_0
    //   79: getfield 373	com/tencent/mm/plugin/game/ui/GameCenterActivity:lUG	Landroid/view/View;
    //   82: ifnull +35 -> 117
    //   85: aload_0
    //   86: invokevirtual 292	com/tencent/mm/plugin/game/ui/GameCenterActivity:aGw	()V
    //   89: aload_0
    //   90: invokevirtual 80	com/tencent/mm/plugin/game/ui/GameCenterActivity:getWindow	()Landroid/view/Window;
    //   93: invokevirtual 340	android/view/Window:getDecorView	()Landroid/view/View;
    //   96: checkcast 111	android/view/ViewGroup
    //   99: iconst_0
    //   100: invokevirtual 297	android/view/ViewGroup:getChildAt	(I)Landroid/view/View;
    //   103: checkcast 111	android/view/ViewGroup
    //   106: new 6	com/tencent/mm/plugin/game/ui/GameCenterActivity$1
    //   109: dup
    //   110: aload_0
    //   111: invokespecial 438	com/tencent/mm/plugin/game/ui/GameCenterActivity$1:<init>	(Lcom/tencent/mm/plugin/game/ui/GameCenterActivity;)V
    //   114: invokevirtual 442	android/view/ViewGroup:addOnLayoutChangeListener	(Landroid/view/View$OnLayoutChangeListener;)V
    //   117: bipush 21
    //   119: invokestatic 149	com/tencent/mm/compatible/util/d:et	(I)Z
    //   122: ifeq +68 -> 190
    //   125: aload_0
    //   126: invokevirtual 80	com/tencent/mm/plugin/game/ui/GameCenterActivity:getWindow	()Landroid/view/Window;
    //   129: invokevirtual 340	android/view/Window:getDecorView	()Landroid/view/View;
    //   132: checkcast 111	android/view/ViewGroup
    //   135: iconst_0
    //   136: invokevirtual 297	android/view/ViewGroup:getChildAt	(I)Landroid/view/View;
    //   139: checkcast 111	android/view/ViewGroup
    //   142: astore_1
    //   143: aload_1
    //   144: new 8	com/tencent/mm/plugin/game/ui/GameCenterActivity$2
    //   147: dup
    //   148: aload_0
    //   149: aload_1
    //   150: invokespecial 445	com/tencent/mm/plugin/game/ui/GameCenterActivity$2:<init>	(Lcom/tencent/mm/plugin/game/ui/GameCenterActivity;Landroid/view/ViewGroup;)V
    //   153: invokevirtual 449	android/view/ViewGroup:setOnApplyWindowInsetsListener	(Landroid/view/View$OnApplyWindowInsetsListener;)V
    //   156: ldc2_w 390
    //   159: ldc_w 392
    //   162: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   165: return
    //   166: astore_1
    //   167: ldc_w 261
    //   170: ldc_w 451
    //   173: iconst_1
    //   174: anewarray 453	java/lang/Object
    //   177: dup
    //   178: iconst_0
    //   179: aload_1
    //   180: invokevirtual 457	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   183: aastore
    //   184: invokestatic 461	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   187: goto -70 -> 117
    //   190: aload_0
    //   191: invokevirtual 80	com/tencent/mm/plugin/game/ui/GameCenterActivity:getWindow	()Landroid/view/Window;
    //   194: invokevirtual 340	android/view/Window:getDecorView	()Landroid/view/View;
    //   197: checkcast 111	android/view/ViewGroup
    //   200: iconst_1
    //   201: invokevirtual 464	android/view/ViewGroup:setFitsSystemWindows	(Z)V
    //   204: ldc2_w 390
    //   207: ldc_w 392
    //   210: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   213: return
    //   214: astore_1
    //   215: ldc_w 261
    //   218: ldc_w 466
    //   221: iconst_1
    //   222: anewarray 453	java/lang/Object
    //   225: dup
    //   226: iconst_0
    //   227: aload_1
    //   228: invokevirtual 457	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   231: aastore
    //   232: invokestatic 461	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   235: ldc2_w 390
    //   238: ldc_w 392
    //   241: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   244: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	245	0	this	GameCenterActivity
    //   0	245	1	paramBundle	android.os.Bundle
    // Exception table:
    //   from	to	target	type
    //   67	117	166	java/lang/Exception
    //   117	165	214	java/lang/Exception
    //   190	204	214	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameCenterActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */