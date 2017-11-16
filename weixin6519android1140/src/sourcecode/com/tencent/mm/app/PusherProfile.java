package com.tencent.mm.app;

import android.content.Context;
import android.content.res.Configuration;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.app.AppLogic;
import com.tencent.mars.mm.AppCallBack;
import com.tencent.mars.sdt.SdtLogic;
import com.tencent.mm.booter.o;
import com.tencent.mm.booter.q;
import com.tencent.mm.booter.t;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.console.Shell;
import com.tencent.mm.g.a.gi;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class PusherProfile
  extends e
{
  public static final String ess;
  private Shell esT;
  
  static
  {
    GMTrace.i(13040997105664L, 97163);
    ess = ab.getPackageName() + ":push";
    GMTrace.o(13040997105664L, 97163);
  }
  
  public PusherProfile()
  {
    GMTrace.i(13040460234752L, 97159);
    this.esT = new Shell();
    GMTrace.o(13040460234752L, 97159);
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(13040728670208L, 97161);
    GMTrace.o(13040728670208L, 97161);
  }
  
  public final void onCreate()
  {
    GMTrace.i(13040594452480L, 97160);
    Object localObject = ab.getContext();
    AppLogic.setCallBack(new AppCallBack(ab.getContext()));
    k.b(com.tencent.mm.sdk.a.vgM, PusherProfile.class.getClassLoader());
    SdtLogic.setHttpNetcheckCGI("/mmnetcheck");
    localObject = new t(com.tencent.mm.booter.c.av((Context)localObject));
    ((t)localObject).dl("PUSH");
    r.hjx = bg.a(((t)localObject).dm(".com.tencent.mm.debug.test.display_errcode"), false);
    r.hjy = bg.a(((t)localObject).dm(".com.tencent.mm.debug.test.display_msgstate"), false);
    r.hjz = bg.a(((t)localObject).dm(".com.tencent.mm.debug.test.network.simulate_fault"), false);
    r.hjA = bg.a(((t)localObject).dm(".com.tencent.mm.debug.test.network.force_touch"), false);
    r.hjB = bg.a(((t)localObject).dm(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
    r.hjC = bg.a(((t)localObject).dm(".com.tencent.mm.debug.test.crashIsExit"), false);
    r.hjG = bg.a(((t)localObject).dm(".com.tencent.mm.debug.test.album_show_info"), false);
    r.hjH = bg.a(((t)localObject).dm(".com.tencent.mm.debug.test.location_help"), false);
    r.hjK = bg.a(((t)localObject).dm(".com.tencent.mm.debug.test.force_soso"), false);
    r.hjL = bg.a(((t)localObject).dm(".com.tencent.mm.debug.test.simulatePostServerError"), false);
    r.hjM = bg.a(((t)localObject).dm(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
    r.hjN = bg.a(((t)localObject).dm(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
    r.hjQ = bg.a(((t)localObject).dm(".com.tencent.mm.debug.test.filterfpnp"), false);
    r.hjR = bg.a(((t)localObject).dm(".com.tencent.mm.debug.test.testForPull"), false);
    int i = bg.a(((t)localObject).getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
    r.hjO = i;
    if ((i != 4) && (r.hjO > 0))
    {
      com.tencent.mm.storage.v.vpz = r.hjO;
      w.e("MicroMsg.PushDebugger", "cdn thread num " + r.hjO);
    }
    r.hjP = bg.a(((t)localObject).dm(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
    r.hjU = bg.a(((t)localObject).dm(".com.tencent.mm.debug.test.skip_getdns"), false);
    try
    {
      i = Integer.decode(((t)localObject).getString(".com.tencent.mm.debug.log.setversion")).intValue();
      com.tencent.mm.protocal.d.zM(i);
      new StringBuilder("set up test protocal version = ").append(Integer.toHexString(i));
    }
    catch (Exception localException5)
    {
      try
      {
        String str = ((t)localObject).getString(".com.tencent.mm.debug.log.setapilevel");
        if (!bg.nm(str))
        {
          com.tencent.mm.protocal.d.DEVICE_TYPE = "android-" + str;
          com.tencent.mm.protocal.d.tJx = "android-" + str;
          com.tencent.mm.protocal.d.tJz = str;
          b.Ry(str);
          new StringBuilder("set up test protocal apilevel = ").append(com.tencent.mm.protocal.d.DEVICE_TYPE).append(" ").append(b.bPr());
        }
      }
      catch (Exception localException5)
      {
        try
        {
          i = Integer.decode(((t)localObject).getString(".com.tencent.mm.debug.log.setuin")).intValue();
          new StringBuilder("set up test protocal uin old: ").append(com.tencent.mm.protocal.d.tJB).append(" new: ").append(i);
          com.tencent.mm.protocal.d.tJB = i;
        }
        catch (Exception localException5)
        {
          try
          {
            i = Integer.decode(((t)localObject).getString(".com.tencent.mm.debug.log.setchannel")).intValue();
            ((q)localObject).fJG.fIP = i;
          }
          catch (Exception localException5)
          {
            try
            {
              for (;;)
              {
                boolean bool1 = bg.a(((t)localObject).dm(".com.tencent.mm.debug.report.debugmodel"), false);
                boolean bool2 = bg.a(((t)localObject).dm(".com.tencent.mm.debug.report.kvstat"), false);
                boolean bool3 = bg.a(((t)localObject).dm(".com.tencent.mm.debug.report.clientpref"), false);
                boolean bool4 = bg.a(((t)localObject).dm(".com.tencent.mm.debug.report.useraction"), false);
                com.tencent.mm.plugin.report.a.c.a(bool1, bool2, bool3, bool4);
                new StringBuilder("try control report : debugModel[").append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
                a.bv(ess);
                o.onCreate(false);
                com.tencent.mm.bj.d.a("gcm", null, null);
                com.tencent.mm.bj.d.p("gcm", null);
                com.tencent.mm.sdk.b.a.vgX.b(new com.tencent.mm.sdk.b.c() {});
                bg.eJ(ab.getContext());
                GMTrace.o(13040594452480L, 97160);
                return;
                localException2 = localException2;
                w.i("MicroMsg.PushDebugger", "no debugger was got");
                continue;
                localException3 = localException3;
                w.i("MicroMsg.PushDebugger", "no debugger was got");
                continue;
                localException4 = localException4;
                w.i("MicroMsg.PushDebugger", "no debugger was got");
                continue;
                localException5 = localException5;
                w.i("MicroMsg.PushDebugger", "no debugger was got");
              }
            }
            catch (Exception localException1)
            {
              for (;;)
              {
                w.i("MicroMsg.PushDebugger", "no debugger was got");
              }
            }
          }
        }
      }
    }
  }
  
  public final String toString()
  {
    GMTrace.i(13040862887936L, 97162);
    String str = ess;
    GMTrace.o(13040862887936L, 97162);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\app\PusherProfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */