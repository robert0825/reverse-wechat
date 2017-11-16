package com.tencent.mm.plugin.fps_lighter.b;

import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.fm;
import com.tencent.mm.g.a.kf;
import com.tencent.mm.plugin.fps_lighter.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

public final class g
  implements aq
{
  private static ae lnb;
  private static HandlerThread lnc;
  public d lna;
  public b lnd;
  public e lne;
  com.tencent.mm.sdk.b.c<fm> lnf;
  com.tencent.mm.sdk.b.c<kf> lnh;
  
  static
  {
    GMTrace.i(5228854247424L, 38958);
    lnc = new HandlerThread("fps_thread");
    GMTrace.o(5228854247424L, 38958);
  }
  
  public g()
  {
    GMTrace.i(5227377852416L, 38947);
    this.lna = null;
    this.lnf = new com.tencent.mm.sdk.b.c() {};
    this.lnh = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(5227377852416L, 38947);
  }
  
  public static ae OW()
  {
    GMTrace.i(5228585811968L, 38956);
    ae localae = lnb;
    GMTrace.o(5228585811968L, 38956);
    return localae;
  }
  
  public static g aAl()
  {
    GMTrace.i(5228048941056L, 38952);
    g localg2 = (g)at.AK().gZ("plugin.fps_lighter");
    g localg1 = localg2;
    if (localg2 == null)
    {
      w.e("MicroMsg.SubCoreFPSLighter", "not found in MMCore, new one");
      localg1 = new g();
      at.AK().a("plugin.fps_lighter", localg1);
    }
    GMTrace.o(5228048941056L, 38952);
    return localg1;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(5228183158784L, 38953);
    this.lnf.bPu();
    this.lnh.bPu();
    try
    {
      start();
      GMTrace.o(5228183158784L, 38953);
      return;
    }
    catch (NoSuchMethodError localNoSuchMethodError)
    {
      w.printErrStackTrace("MicroMsg.SubCoreFPSLighter", localNoSuchMethodError, "", new Object[0]);
      GMTrace.o(5228183158784L, 38953);
    }
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(5227780505600L, 38950);
    GMTrace.o(5227780505600L, 38950);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(5227646287872L, 38949);
    GMTrace.o(5227646287872L, 38949);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(5227914723328L, 38951);
    w.d("MicroMsg.SubCoreFPSLighter", "[onAccountRelease]");
    stop();
    this.lnf.dead();
    this.lnh.dead();
    GMTrace.o(5227914723328L, 38951);
  }
  
  public final void start()
  {
    GMTrace.i(5228317376512L, 38954);
    if (Build.VERSION.SDK_INT < 16)
    {
      w.w("MicroMsg.SubCoreFPSLighter", "[start] API is low 16");
      GMTrace.o(5228317376512L, 38954);
      return;
    }
    at.AR();
    boolean bool = com.tencent.mm.y.c.xh().getBoolean(w.a.vxc, true);
    if (!bool)
    {
      w.w("MicroMsg.SubCoreFPSLighter", "[start] isValid:%s", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(5228317376512L, 38954);
      return;
    }
    if (!com.tencent.mm.sdk.platformtools.e.vho)
    {
      w.w("MicroMsg.SubCoreFPSLighter", "[start] never open gmtrace when build");
      GMTrace.o(5228317376512L, 38954);
      return;
    }
    if (!com.tencent.mm.protocal.d.tJF)
    {
      w.w("MicroMsg.SubCoreFPSLighter", "is not alpha version");
      GMTrace.o(5228317376512L, 38954);
      return;
    }
    at.AR();
    if (com.tencent.mm.y.c.ww() != 0)
    {
      w.i("MicroMsg.SubCoreFPSLighter", "[start]");
      final c localc = new c();
      Object localObject = com.tencent.mm.y.c.c.Ct().er("100166");
      int i;
      if ((((com.tencent.mm.storage.c)localObject).isValid()) && (((com.tencent.mm.storage.c)localObject).bSg().containsKey("percent")))
      {
        i = bg.getInt((String)((com.tencent.mm.storage.c)localObject).bSg().get("percent"), 100);
        w.i("MicroMsg.SubCoreFPSLighter", "[start] :%s", new Object[] { Integer.valueOf(i) });
      }
      for (localc.lmM = i; localc.lmM > 0; localc.lmM = 100)
      {
        w.i("MicroMsg.SubCoreFPSLighter", "it real open rand:%s", new Object[] { Integer.valueOf(localc.lmM) });
        localc.lmG = true;
        localc.lmF = true;
        GMTrace.init(true);
        if (this.lne == null) {
          this.lne = new e(localc);
        }
        GMTrace.registerHandler(this.lne);
        if (this.lnd == null) {
          this.lnd = new b();
        }
        localObject = this.lnd;
        if (!((b)localObject).isInit)
        {
          ((b)localObject).isInit = true;
          ((b)localObject).lmz = new Timer();
          ((b)localObject).lmz.scheduleAtFixedRate(new b.1((b)localObject), 3600000L, 3600000L);
        }
        if ((lnc == null) || (!lnc.isAlive()))
        {
          localObject = new HandlerThread("analyse_thread");
          lnc = (HandlerThread)localObject;
          ((HandlerThread)localObject).setPriority(1);
          lnc.start();
          lnb = new ae(lnc.getLooper());
        }
        new ae(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(14422231744512L, 107454);
            if (g.this.lna == null) {
              g.this.lna = new d(localc);
            }
            d locald = g.this.lna;
            Context localContext = ab.getContext();
            w.i("MicroMsg.FPSFinder", "[start]");
            Display localDisplay = ((WindowManager)localContext.getSystemService("window")).getDefaultDisplay();
            locald.lmg.lmC = (1000.0F / localDisplay.getRefreshRate());
            locald.lmg.lmB = localDisplay.getRefreshRate();
            w.i("MicroMsg.FPSFinder", "refreshRate %s", new Object[] { Float.valueOf(locald.lmg.lmB) });
            locald.lmN = new f(locald.lmg);
            if (locald.lmg.lmG) {
              locald.lmN.a(new a(locald.lmg));
            }
            if (locald.lmg.lmF) {
              locald.lmN.a(new com.tencent.mm.plugin.fps_lighter.a.b(locald.lmg));
            }
            locald.lmN.c((Application)localContext.getApplicationContext());
            GMTrace.o(14422231744512L, 107454);
          }
        });
        GMTrace.o(5228317376512L, 38954);
        return;
        w.w("MicroMsg.SubCoreFPSLighter", "[start] never has abtest:100166");
      }
      w.i("MicroMsg.SubCoreFPSLighter", "[start] is disable!");
    }
    GMTrace.o(5228317376512L, 38954);
  }
  
  public final void stop()
  {
    GMTrace.i(5228451594240L, 38955);
    if (Build.VERSION.SDK_INT >= 16)
    {
      w.i("MicroMsg.SubCoreFPSLighter", "[stop]");
      Object localObject;
      if (this.lna != null)
      {
        localObject = this.lna;
        Context localContext = ab.getContext();
        w.i("MicroMsg.FPSFinder", "[stop]");
        if (((d)localObject).lmN != null) {
          ((d)localObject).lmN.d((Application)localContext.getApplicationContext());
        }
        if (((d)localObject).lmg.lmG) {
          aAl().lne.stopTrace();
        }
      }
      if (this.lnd != null)
      {
        localObject = this.lnd;
        w.i("MicroMsg.FPSAnalyser", "[stop]");
        ((b)localObject).isInit = false;
        ((b)localObject).lmz.cancel();
      }
      if (lnc != null)
      {
        lnc.quit();
        lnc = null;
      }
      if (this.lne != null)
      {
        this.lne.stopTrace();
        GMTrace.unregisterHandler(this.lne);
      }
    }
    GMTrace.o(5228451594240L, 38955);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(5227512070144L, 38948);
    GMTrace.o(5227512070144L, 38948);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fps_lighter\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */