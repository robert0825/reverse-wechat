package com.tencent.mm.app;

import android.app.Application;
import android.content.res.Configuration;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.booter.q;
import com.tencent.mm.booter.v;
import com.tencent.mm.compatible.d.l;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ai.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;

public class SupportProfile
  extends e
{
  protected static String erD;
  
  static
  {
    GMTrace.i(17617418977280L, 131260);
    erD = "";
    GMTrace.o(17617418977280L, 131260);
  }
  
  public SupportProfile()
  {
    GMTrace.i(17616882106368L, 131256);
    GMTrace.o(17616882106368L, 131256);
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(17617150541824L, 131258);
    GMTrace.o(17617150541824L, 131258);
  }
  
  public final void onCreate()
  {
    GMTrace.i(17617016324096L, 131257);
    erD = ab.vM();
    ClassLoader localClassLoader = SupportProfile.class.getClassLoader();
    com.tencent.mm.f.a.at(ab.getContext());
    j.a(new ai.c()
    {
      public final void a(String paramAnonymousString, Throwable paramAnonymousThrowable)
      {
        GMTrace.i(19131529166848L, 142541);
        g.ork.a(637L, 0L, 1L, false);
        KVCommCrossProcessReceiver.bbU();
        GMTrace.o(19131529166848L, 142541);
      }
    });
    v localv = new v(com.tencent.mm.booter.c.av(this.app.getBaseContext()));
    localv.dl("SUPPORT");
    r.hjx = bg.a(localv.dm(".com.tencent.mm.debug.test.display_errcode"), false);
    r.hjy = bg.a(localv.dm(".com.tencent.mm.debug.test.display_msgstate"), false);
    r.hjz = bg.a(localv.dm(".com.tencent.mm.debug.test.network.simulate_fault"), false);
    r.hjA = bg.a(localv.dm(".com.tencent.mm.debug.test.network.force_touch"), false);
    r.hjB = bg.a(localv.dm(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
    r.hjC = bg.a(localv.dm(".com.tencent.mm.debug.test.crashIsExit"), false);
    r.hjG = bg.a(localv.dm(".com.tencent.mm.debug.test.album_show_info"), false);
    r.hjH = bg.a(localv.dm(".com.tencent.mm.debug.test.location_help"), false);
    r.hjK = bg.a(localv.dm(".com.tencent.mm.debug.test.force_soso"), false);
    r.hjL = bg.a(localv.dm(".com.tencent.mm.debug.test.simulatePostServerError"), false);
    r.hjM = bg.a(localv.dm(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
    r.hjN = bg.a(localv.dm(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
    r.hjQ = bg.a(localv.dm(".com.tencent.mm.debug.test.filterfpnp"), false);
    r.hjR = bg.a(localv.dm(".com.tencent.mm.debug.test.testForPull"), false);
    int i = bg.a(localv.getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
    r.hjO = i;
    if ((i != 4) && (r.hjO > 0))
    {
      com.tencent.mm.storage.v.vpz = r.hjO;
      w.e("SetupSupportDebugger", "cdn thread num " + r.hjO);
    }
    r.hjP = bg.a(localv.dm(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
    r.hkh = bg.a(localv.dm(".com.tencent.mm.debug.forcex5webview"), false);
    r.hke = bg.aq(localv.getString(".com.tencent.mm.debug.jsapi.permission"), "");
    w.d("SetupSupportDebugger", "Test.jsapiPermission = " + r.hke);
    try
    {
      i = Integer.decode(localv.getString(".com.tencent.mm.debug.log.setversion")).intValue();
      d.zM(i);
      new StringBuilder("set up test protocal version = ").append(Integer.toHexString(i));
    }
    catch (Exception localException5)
    {
      try
      {
        String str = localv.getString(".com.tencent.mm.debug.log.setapilevel");
        if (!bg.nm(str))
        {
          d.DEVICE_TYPE = "android-" + str;
          d.tJx = "android-" + str;
          d.tJz = str;
          b.Ry(str);
          new StringBuilder("set up test protocal apilevel = ").append(d.DEVICE_TYPE).append(" ").append(b.bPr());
        }
      }
      catch (Exception localException5)
      {
        try
        {
          i = Integer.decode(localv.getString(".com.tencent.mm.debug.log.setuin")).intValue();
          new StringBuilder("set up test protocal uin old: ").append(d.tJB).append(" new: ").append(i);
          d.tJB = i;
        }
        catch (Exception localException5)
        {
          try
          {
            i = Integer.decode(localv.getString(".com.tencent.mm.debug.log.setchannel")).intValue();
            localv.fJG.fIP = i;
          }
          catch (Exception localException5)
          {
            try
            {
              for (;;)
              {
                boolean bool1 = bg.a(localv.dm(".com.tencent.mm.debug.report.debugmodel"), false);
                boolean bool2 = bg.a(localv.dm(".com.tencent.mm.debug.report.kvstat"), false);
                boolean bool3 = bg.a(localv.dm(".com.tencent.mm.debug.report.clientpref"), false);
                boolean bool4 = bg.a(localv.dm(".com.tencent.mm.debug.report.useraction"), false);
                com.tencent.mm.plugin.report.a.c.a(bool1, bool2, bool3, bool4);
                new StringBuilder("try control report : debugModel[").append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
                j.bA(erD);
                a.bv(erD);
                k.b("wcdb", localClassLoader);
                k.b("wechatcommon", localClassLoader);
                k.b(com.tencent.mm.sdk.a.vgP, localClassLoader);
                k.b("FFmpeg", localClassLoader);
                k.b("wechatpack", localClassLoader);
                i = l.sK();
                if ((i & 0x400) == 0) {
                  break label947;
                }
                w.i("MicroMsg.SupportProfile", "load wechatsight_v7a, core number: %d", new Object[] { Integer.valueOf(i >> 12) });
                k.b("wechatsight_v7a", localClassLoader);
                if (i >> 12 < 4) {
                  break;
                }
                com.tencent.mm.plugin.sight.base.b.oRB = 3;
                com.tencent.mm.plugin.sight.base.b.oRD = 3;
                com.tencent.mm.plugin.sight.base.b.oRE = 544000;
                com.tencent.mm.f.a.at(ab.getContext());
                m.a(this.app);
                MMActivity.eJ(this.app.getBaseContext());
                FileOp.init(false);
                MMBitmapFactory.init();
                GMTrace.o(17617016324096L, 131257);
                return;
                localException2 = localException2;
                w.i("SetupSupportDebugger", "no debugger was got");
                continue;
                localException3 = localException3;
                w.i("SetupSupportDebugger", "no debugger was got");
                continue;
                localException4 = localException4;
                w.i("SetupSupportDebugger", "no debugger was got");
                continue;
                localException5 = localException5;
                w.i("SetupSupportDebugger", "no debugger was got");
              }
            }
            catch (Exception localException1)
            {
              for (;;)
              {
                w.i("SetupSupportDebugger", "no debugger was got");
                continue;
                com.tencent.mm.plugin.sight.base.b.oRB = 1;
                com.tencent.mm.plugin.sight.base.b.oRD = 1;
                com.tencent.mm.plugin.sight.base.b.oRE = 640000;
                continue;
                label947:
                w.i("MicroMsg.SupportProfile", "load wechatsight");
                k.b("wechatsight", localClassLoader);
                com.tencent.mm.plugin.sight.base.b.oRB = 1;
                com.tencent.mm.plugin.sight.base.b.oRD = 1;
                com.tencent.mm.plugin.sight.base.b.oRE = 640000;
              }
            }
          }
        }
      }
    }
  }
  
  public final void onTrimMemory(int paramInt)
  {
    GMTrace.i(17617284759552L, 131259);
    super.onTrimMemory(paramInt);
    w.v("MicroMsg.SupportProfile", "onTrimMemory(l : %d)", new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(17617284759552L, 131259);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\app\SupportProfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */