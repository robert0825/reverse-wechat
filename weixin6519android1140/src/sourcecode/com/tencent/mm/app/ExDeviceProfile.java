package com.tencent.mm.app;

import android.app.Application;
import android.content.res.Configuration;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.f.a;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class ExDeviceProfile
  extends e
{
  public static final String ess;
  
  static
  {
    GMTrace.i(12963821912064L, 96588);
    ess = ab.getPackageName() + ":exdevice";
    GMTrace.o(12963821912064L, 96588);
  }
  
  public ExDeviceProfile()
  {
    GMTrace.i(12963285041152L, 96584);
    GMTrace.o(12963285041152L, 96584);
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(12963553476608L, 96586);
    w.d("MicroMsg.ExDeviceProfile", "onConfigurationChanged:" + toString());
    GMTrace.o(12963553476608L, 96586);
  }
  
  public final void onCreate()
  {
    GMTrace.i(12963419258880L, 96585);
    w.i("MicroMsg.ExDeviceProfile", "exdevice profile oncreate");
    Object localObject = com.tencent.mm.booter.c.av(this.app.getBaseContext());
    a.at(ab.getContext());
    j.bA(ess);
    k.setupBrokenLibraryHandler();
    localObject = new com.tencent.mm.booter.r((com.tencent.mm.booter.c)localObject);
    ((com.tencent.mm.booter.r)localObject).dl("EXDEVICE");
    com.tencent.mm.platformtools.r.hjx = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.test.display_errcode"), false);
    com.tencent.mm.platformtools.r.hjy = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.test.display_msgstate"), false);
    com.tencent.mm.platformtools.r.hjz = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.test.network.simulate_fault"), false);
    com.tencent.mm.platformtools.r.hjA = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.test.network.force_touch"), false);
    com.tencent.mm.platformtools.r.hjB = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
    com.tencent.mm.platformtools.r.hjC = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.test.crashIsExit"), false);
    com.tencent.mm.platformtools.r.hjG = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.test.album_show_info"), false);
    com.tencent.mm.platformtools.r.hjH = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.test.location_help"), false);
    com.tencent.mm.platformtools.r.hjK = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.test.force_soso"), false);
    com.tencent.mm.platformtools.r.hjL = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.test.simulatePostServerError"), false);
    com.tencent.mm.platformtools.r.hjM = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
    com.tencent.mm.platformtools.r.hjN = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
    com.tencent.mm.platformtools.r.hjQ = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.test.filterfpnp"), false);
    com.tencent.mm.platformtools.r.hjR = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.test.testForPull"), false);
    int i = bg.a(((com.tencent.mm.booter.r)localObject).getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
    com.tencent.mm.platformtools.r.hjO = i;
    if ((i != 4) && (com.tencent.mm.platformtools.r.hjO > 0))
    {
      com.tencent.mm.storage.v.vpz = com.tencent.mm.platformtools.r.hjO;
      w.e("MicroMsg.ExdDebugger", "cdn thread num " + com.tencent.mm.platformtools.r.hjO);
    }
    com.tencent.mm.platformtools.r.hjP = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
    try
    {
      i = Integer.decode(((com.tencent.mm.booter.r)localObject).getString(".com.tencent.mm.debug.log.setversion")).intValue();
      d.zM(i);
      new StringBuilder("set up test protocal version = ").append(Integer.toHexString(i));
    }
    catch (Exception localException3)
    {
      try
      {
        String str = ((com.tencent.mm.booter.r)localObject).getString(".com.tencent.mm.debug.log.setapilevel");
        if (!bg.nm(str))
        {
          d.DEVICE_TYPE = "android-" + str;
          d.tJx = "android-" + str;
          d.tJz = str;
          b.Ry(str);
          new StringBuilder("set up test protocal apilevel = ").append(d.DEVICE_TYPE).append(" ").append(b.bPr());
        }
      }
      catch (Exception localException3)
      {
        try
        {
          i = Integer.decode(((com.tencent.mm.booter.r)localObject).getString(".com.tencent.mm.debug.log.setuin")).intValue();
          new StringBuilder("set up test protocal uin old: ").append(d.tJB).append(" new: ").append(i);
          d.tJB = i;
        }
        catch (Exception localException3)
        {
          try
          {
            for (;;)
            {
              boolean bool1 = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.report.debugmodel"), false);
              boolean bool2 = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.report.kvstat"), false);
              boolean bool3 = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.report.clientpref"), false);
              boolean bool4 = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.report.useraction"), false);
              com.tencent.mm.plugin.report.a.c.a(bool1, bool2, bool3, bool4);
              new StringBuilder("try control report : debugModel[").append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
              com.tencent.mm.platformtools.r.hke = bg.aq(((com.tencent.mm.booter.r)localObject).getString(".com.tencent.mm.debug.jsapi.permission"), "");
              w.d("MicroMsg.ExdDebugger", "Test.jsapiPermission = " + com.tencent.mm.platformtools.r.hke);
              com.tencent.mm.platformtools.r.hkf = bg.aq(((com.tencent.mm.booter.r)localObject).getString(".com.tencent.mm.debug.generalcontrol.permission"), "");
              w.d("MicroMsg.ExdDebugger", "Test.generalCtrl = " + com.tencent.mm.platformtools.r.hkf);
              com.tencent.mm.platformtools.r.hkg = bg.a(((com.tencent.mm.booter.r)localObject).dm(".com.tencent.mm.debug.skiploadurlcheck"), false);
              w.d("MicroMsg.ExdDebugger", "Test.skipLoadUrlCheck = " + com.tencent.mm.platformtools.r.hkg);
              m.a(this.app);
              GMTrace.o(12963419258880L, 96585);
              return;
              localException1 = localException1;
              w.i("MicroMsg.ExdDebugger", "no debugger was got");
              continue;
              localException2 = localException2;
              w.i("MicroMsg.ExdDebugger", "no debugger was got");
              continue;
              localException3 = localException3;
              w.i("MicroMsg.ExdDebugger", "no debugger was got");
            }
          }
          catch (Exception localException4)
          {
            for (;;)
            {
              w.i("MicroMsg.ExdDebugger", "no debugger was got");
            }
          }
        }
      }
    }
  }
  
  public String toString()
  {
    GMTrace.i(12963687694336L, 96587);
    String str = ess;
    GMTrace.o(12963687694336L, 96587);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\app\ExDeviceProfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */