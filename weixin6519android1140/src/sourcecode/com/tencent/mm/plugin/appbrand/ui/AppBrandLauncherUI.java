package com.tencent.mm.plugin.appbrand.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.c.c.c;
import com.tencent.mm.plugin.appbrand.c.d.d;
import com.tencent.mm.plugin.appbrand.m;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.h;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.o.j.a;
import com.tencent.mm.plugin.appbrand.widget.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.g;
import java.util.List;

public final class AppBrandLauncherUI
  extends DrawStatusBarActivity
{
  static final int iAN;
  private static final int iAO;
  private String iAP;
  private boolean iAQ;
  private int iAR;
  private boolean iAS;
  private final c.c iAT;
  public d.d iAU;
  private int ipN;
  
  static
  {
    GMTrace.i(10518106472448L, 78366);
    iAN = m.hzU;
    iAO = o.f.hAW;
    GMTrace.o(10518106472448L, 78366);
  }
  
  public AppBrandLauncherUI()
  {
    GMTrace.i(10515690553344L, 78348);
    this.iAQ = false;
    this.iAS = true;
    this.iAT = new c.c()
    {
      public final void Tz()
      {
        GMTrace.i(14343311720448L, 106866);
        c.b(this);
        if (!c.Tx()) {
          AppBrandLauncherUI.this.runOnUiThread(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(14341701107712L, 106854);
              if ((!AppBrandLauncherUI.this.isFinishing()) && (!AppBrandLauncherUI.this.vKD)) {
                AppBrandLauncherUI.this.cw(true);
              }
              GMTrace.o(14341701107712L, 106854);
            }
          });
        }
        GMTrace.o(14343311720448L, 106866);
      }
    };
    GMTrace.o(10515690553344L, 78348);
  }
  
  protected final void VC()
  {
    GMTrace.i(10515958988800L, 78350);
    super.VC();
    getWindow().setSoftInputMode(3);
    GMTrace.o(10515958988800L, 78350);
  }
  
  public final void cw(boolean paramBoolean)
  {
    GMTrace.i(14343043284992L, 106864);
    if (paramBoolean) {}
    for (Object localObject1 = com.tencent.mm.plugin.appbrand.ui.recents.a.class;; localObject1 = b.class)
    {
      localObject2 = super.aR().E(iAO);
      if ((localObject2 == null) || (!((Class)localObject1).isInstance(localObject2))) {
        break;
      }
      GMTrace.o(14343043284992L, 106864);
      return;
    }
    if ((isFinishing()) || (this.vKD))
    {
      GMTrace.o(14343043284992L, 106864);
      return;
    }
    Object localObject2 = super.aR().aV();
    if (paramBoolean) {}
    for (localObject1 = new com.tencent.mm.plugin.appbrand.ui.recents.a();; localObject1 = b.bl(getString(o.i.cRT), getString(o.i.hFr)))
    {
      ((a)localObject1).gRb = this.ipN;
      ((a)localObject1).iAY = this.iAP;
      ((android.support.v4.app.p)localObject2).b(iAO, (Fragment)localObject1);
      ((android.support.v4.app.p)localObject2).commit();
      if ((paramBoolean) && (this.iAU != null)) {
        this.iAU.hMI[4] = "1";
      }
      GMTrace.o(14343043284992L, 106864);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10517569601536L, 78362);
    GMTrace.o(10517569601536L, 78362);
    return -1;
  }
  
  protected final int getStatusBarColor()
  {
    GMTrace.i(10515824771072L, 78349);
    if ((Build.VERSION.SDK_INT >= 23) && (g.b(getWindow())))
    {
      GMTrace.o(10515824771072L, 78349);
      return -1052684;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      i = iAN;
      GMTrace.o(10515824771072L, 78349);
      return i;
    }
    int i = super.getStatusBarColor();
    GMTrace.o(10515824771072L, 78349);
    return i;
  }
  
  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(10516764295168L, 78356);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.iAR = paramInt1;
    if ((paramInt2 == -1) && (paramInt1 == 1))
    {
      String str = paramIntent.getStringExtra("key_session_id");
      paramInt1 = paramIntent.getIntExtra("ftsbizscene", 0);
      w.i("MicroMsg.AppBrandLauncherUI", "onActivityResult oreh report weAppSearchClickStream(13929) statSessionId:%s, StatKeyWordId:%s", new Object[] { str, com.tencent.mm.modelappbrand.b.gqX });
      com.tencent.mm.plugin.report.service.g.ork.i(13929, new Object[] { str, com.tencent.mm.modelappbrand.b.gqX, Integer.valueOf(2), Integer.valueOf(paramInt1) });
    }
    GMTrace.o(10516764295168L, 78356);
  }
  
  public final void onBackPressed()
  {
    GMTrace.i(10517435383808L, 78361);
    finish();
    GMTrace.o(10517435383808L, 78361);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10516093206528L, 78351);
    super.onCreate(paramBundle);
    if (getIntent() == null)
    {
      finish();
      GMTrace.o(10516093206528L, 78351);
      return;
    }
    if (!com.tencent.mm.plugin.appbrand.c.a.Tj())
    {
      finish();
      GMTrace.o(10516093206528L, 78351);
      return;
    }
    this.iAQ = true;
    this.ipN = getIntent().getIntExtra("extra_enter_scene", 1);
    this.iAP = getIntent().getStringExtra("extra_enter_scene_note");
    if (cN().cO() != null) {
      cN().cO().setBackgroundDrawable(new ColorDrawable(-1052684));
    }
    W(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10527233277952L, 78434);
        if ((AppBrandLauncherUI.this.vKD) || (AppBrandLauncherUI.this.isFinishing()))
        {
          GMTrace.o(10527233277952L, 78434);
          return;
        }
        Fragment localFragment = AppBrandLauncherUI.a(AppBrandLauncherUI.this).E(AppBrandLauncherUI.aaC());
        if ((localFragment == null) || (!(localFragment instanceof AppBrandLauncherUI.a)))
        {
          GMTrace.o(10527233277952L, 78434);
          return;
        }
        ((AppBrandLauncherUI.a)localFragment).aaD();
        GMTrace.o(10527233277952L, 78434);
      }
    });
    sq(getResources().getString(o.i.cRT));
    AV(-16777216);
    h.a(this);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(10501597691904L, 78243);
        AppBrandLauncherUI.this.onBackPressed();
        GMTrace.o(10501597691904L, 78243);
        return true;
      }
    }, o.e.hAv);
    int i;
    int j;
    if (com.tencent.mm.plugin.appbrand.j.a.aaf())
    {
      i = b.iAZ;
      j = o.i.eey;
      int k = o.h.cIT;
      paramBundle = com.tencent.mm.svg.a.a.c(ab.getResources(), k);
      if (paramBundle != null) {
        break label390;
      }
      paramBundle = null;
    }
    for (;;)
    {
      Object localObject = new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(10506832183296L, 78282);
          AppBrandLauncherUI.this.startActivityForResult(((com.tencent.mm.plugin.appbrand.compat.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.compat.a.a.class)).bC(AppBrandLauncherUI.this), 1);
          GMTrace.o(10506832183296L, 78282);
          return true;
        }
      };
      this.vKB.a(i - 1, getString(j), paramBundle, (MenuItem.OnMenuItemClickListener)localObject);
      this.vKB.hqF.setBackgroundColor(-1052684);
      paramBundle = new ViewGroup.LayoutParams(-1, -1);
      localObject = new FrameLayout(this);
      ((View)localObject).setId(iAO);
      ((ViewGroup)this.vKB.hqF).addView((View)localObject, paramBundle);
      com.tencent.mm.plugin.report.service.g.ork.a(465L, 0L, 1L, false);
      paramBundle = new Intent();
      paramBundle.setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
      paramBundle.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
      sendBroadcast(paramBundle);
      if (com.tencent.mm.plugin.appbrand.c.d.TC()) {
        this.iAU = new d.d();
      }
      com.tencent.mm.plugin.appbrand.c.d.TE();
      com.tencent.mm.plugin.appbrand.c.a.Tk();
      j.d(this.vKB.hqF, getStatusBarColor(), true);
      GMTrace.o(10516093206528L, 78351);
      return;
      label390:
      paramBundle = paramBundle.mutate();
      paramBundle.setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
    }
  }
  
  protected final void onDestroy()
  {
    GMTrace.i(10516630077440L, 78355);
    Object localObject = (a)super.aR().E(iAO);
    if (localObject != null) {
      ((a)localObject).aaE();
    }
    super.onDestroy();
    c.b(this.iAT);
    c.Ty();
    if (this.iAU != null)
    {
      localObject = this.iAU;
      com.tencent.mm.plugin.report.service.g.ork.i(14113, (Object[])((d.d)localObject).hMI);
      this.iAU = null;
    }
    GMTrace.o(10516630077440L, 78355);
  }
  
  protected final void onPause()
  {
    GMTrace.i(10516495859712L, 78354);
    super.onPause();
    GMTrace.o(10516495859712L, 78354);
  }
  
  protected final void onResume()
  {
    GMTrace.i(10516227424256L, 78352);
    super.onResume();
    getStatusBarColor();
    if (!this.iAQ)
    {
      if (this.iAR != 1) {
        break label147;
      }
      this.ipN = 7;
      this.iAP = "";
      this.iAR = 0;
      a locala = (a)super.aR().E(iAO);
      if (locala != null) {
        locala.gRb = this.ipN;
      }
    }
    this.iAQ = false;
    if ((com.tencent.mm.plugin.appbrand.c.a.Tm()) || (com.tencent.mm.plugin.appbrand.c.a.Tn())) {}
    for (boolean bool = true;; bool = false)
    {
      cw(bool);
      if ((!bool) && (this.iAS))
      {
        c.a(this.iAT);
        if (!c.refresh()) {
          c.b(this.iAT);
        }
      }
      this.iAS = false;
      GMTrace.o(10516227424256L, 78352);
      return;
      label147:
      if (this.iAR == 2)
      {
        this.ipN = 6;
        break;
      }
      if (this.iAR == 3)
      {
        this.ipN = 9;
        break;
      }
      this.ipN = 4;
      break;
    }
  }
  
  public final void setTitle(int paramInt)
  {
    GMTrace.i(10517301166080L, 78360);
    oM(paramInt);
    GMTrace.o(10517301166080L, 78360);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    GMTrace.i(10517166948352L, 78359);
    N(paramCharSequence);
    GMTrace.o(10517166948352L, 78359);
  }
  
  public static abstract class a
    extends Fragment
  {
    public View Hw;
    public int gRb;
    private final ae iAX;
    public String iAY;
    
    public a()
    {
      GMTrace.i(10530186067968L, 78456);
      this.iAX = new ae(Looper.getMainLooper());
      GMTrace.o(10530186067968L, 78456);
    }
    
    public abstract void MP();
    
    public void aaD()
    {
      GMTrace.i(10530454503424L, 78458);
      GMTrace.o(10530454503424L, 78458);
    }
    
    public void aaE()
    {
      GMTrace.i(16342484779008L, 121761);
      GMTrace.o(16342484779008L, 121761);
    }
    
    public final int jz(int paramInt)
    {
      GMTrace.i(10530588721152L, 78459);
      FragmentActivity localFragmentActivity = aG();
      Object localObject = localFragmentActivity;
      if (localFragmentActivity == null) {
        localObject = ab.getContext();
      }
      paramInt = com.tencent.mm.br.a.fromDPToPix((Context)localObject, paramInt);
      GMTrace.o(10530588721152L, 78459);
      return paramInt;
    }
    
    public final void l(Runnable paramRunnable)
    {
      GMTrace.i(16342618996736L, 121762);
      if (paramRunnable != null) {
        this.iAX.post(paramRunnable);
      }
      GMTrace.o(16342618996736L, 121762);
    }
    
    public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
    {
      GMTrace.i(10530722938880L, 78460);
      this.Hw = new FrameLayout(paramViewGroup.getContext());
      MP();
      paramLayoutInflater = this.Hw;
      GMTrace.o(10530722938880L, 78460);
      return paramLayoutInflater;
    }
    
    public final void runOnUiThread(Runnable paramRunnable)
    {
      GMTrace.i(10530857156608L, 78461);
      if (aG() == null)
      {
        GMTrace.o(10530857156608L, 78461);
        return;
      }
      aG().runOnUiThread(paramRunnable);
      GMTrace.o(10530857156608L, 78461);
    }
  }
  
  private static enum b
  {
    static
    {
      GMTrace.i(10506966401024L, 78283);
      iAZ = 1;
      iBa = 2;
      iBb = new int[] { iAZ, iBa };
      GMTrace.o(10506966401024L, 78283);
    }
  }
  
  public static abstract class c<T>
    extends j.a
  {
    public final List<T> iBc;
    public final List<T> iBd;
    
    public c(List<T> paramList1, List<T> paramList2)
    {
      GMTrace.i(10501060820992L, 78239);
      this.iBc = paramList1;
      this.iBd = paramList2;
      GMTrace.o(10501060820992L, 78239);
    }
    
    public final int aaF()
    {
      GMTrace.i(10501195038720L, 78240);
      if (this.iBc == null)
      {
        GMTrace.o(10501195038720L, 78240);
        return 0;
      }
      int i = this.iBc.size();
      GMTrace.o(10501195038720L, 78240);
      return i;
    }
    
    public final int aaG()
    {
      GMTrace.i(10501329256448L, 78241);
      if (this.iBd == null)
      {
        GMTrace.o(10501329256448L, 78241);
        return 0;
      }
      int i = this.iBd.size();
      GMTrace.o(10501329256448L, 78241);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\AppBrandLauncherUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */