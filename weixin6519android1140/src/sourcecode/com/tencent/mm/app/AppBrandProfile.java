package com.tencent.mm.app;

import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.booter.q;
import com.tencent.mm.compatible.d.l;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ai.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.b;
import com.tencent.xweb.o;
import java.util.Map;
import org.xwalk.core.WebViewExtensionListener;

public class AppBrandProfile
  extends com.tencent.mm.compatible.loader.e
{
  protected static String erD;
  
  static
  {
    GMTrace.i(13005026754560L, 96895);
    erD = "";
    GMTrace.o(13005026754560L, 96895);
  }
  
  public AppBrandProfile()
  {
    GMTrace.i(13004489883648L, 96891);
    GMTrace.o(13004489883648L, 96891);
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(13004758319104L, 96893);
    GMTrace.o(13004758319104L, 96893);
  }
  
  public final void onCreate()
  {
    GMTrace.i(13004624101376L, 96892);
    erD = ab.vM();
    Object localObject1 = AppBrandProfile.class.getClassLoader();
    com.tencent.mm.f.a.at(ab.getContext());
    j.a(new ai.c()
    {
      public final void a(String paramAnonymousString, Throwable paramAnonymousThrowable)
      {
        GMTrace.i(19132066037760L, 142545);
        g.ork.a(365L, 3L, 1L, false);
        KVCommCrossProcessReceiver.bbU();
        GMTrace.o(19132066037760L, 142545);
      }
    });
    Object localObject2 = new com.tencent.mm.booter.p(com.tencent.mm.booter.c.av(this.app.getBaseContext()));
    Object localObject3 = erD.replace(ab.getPackageName() + ":appbrand", "");
    ((com.tencent.mm.booter.p)localObject2).dl("APPBRAND" + (String)localObject3);
    r.hjx = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.test.display_errcode"), false);
    r.hjy = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.test.display_msgstate"), false);
    r.hjz = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.test.network.simulate_fault"), false);
    r.hjA = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.test.network.force_touch"), false);
    r.hjB = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
    r.hjC = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.test.crashIsExit"), false);
    r.hjG = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.test.album_show_info"), false);
    r.hjH = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.test.location_help"), false);
    r.hjK = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.test.force_soso"), false);
    r.hjL = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.test.simulatePostServerError"), false);
    r.hjM = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
    r.hjN = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
    r.hjQ = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.test.filterfpnp"), false);
    r.hjR = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.test.testForPull"), false);
    int i = bg.a(((com.tencent.mm.booter.p)localObject2).getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
    r.hjO = i;
    if ((i != 4) && (r.hjO > 0))
    {
      com.tencent.mm.storage.v.vpz = r.hjO;
      w.e("MicroMsg.AppBDebugger", "cdn thread num " + r.hjO);
    }
    r.hjP = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
    r.hkh = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.forcex5webview"), false);
    r.hke = bg.aq(((com.tencent.mm.booter.p)localObject2).getString(".com.tencent.mm.debug.jsapi.permission"), "");
    w.d("MicroMsg.AppBDebugger", "Test.jsapiPermission = " + r.hke);
    try
    {
      i = Integer.decode(((com.tencent.mm.booter.p)localObject2).getString(".com.tencent.mm.debug.log.setversion")).intValue();
      d.zM(i);
      new StringBuilder("set up test protocal version = ").append(Integer.toHexString(i));
    }
    catch (Exception localException5)
    {
      try
      {
        localObject3 = ((com.tencent.mm.booter.p)localObject2).getString(".com.tencent.mm.debug.log.setapilevel");
        if (!bg.nm((String)localObject3))
        {
          d.DEVICE_TYPE = "android-" + (String)localObject3;
          d.tJx = "android-" + (String)localObject3;
          d.tJz = (String)localObject3;
          com.tencent.mm.sdk.a.b.Ry((String)localObject3);
          new StringBuilder("set up test protocal apilevel = ").append(d.DEVICE_TYPE).append(" ").append(com.tencent.mm.sdk.a.b.bPr());
        }
      }
      catch (Exception localException5)
      {
        try
        {
          i = Integer.decode(((com.tencent.mm.booter.p)localObject2).getString(".com.tencent.mm.debug.log.setuin")).intValue();
          new StringBuilder("set up test protocal uin old: ").append(d.tJB).append(" new: ").append(i);
          d.tJB = i;
        }
        catch (Exception localException5)
        {
          try
          {
            i = Integer.decode(((com.tencent.mm.booter.p)localObject2).getString(".com.tencent.mm.debug.log.setchannel")).intValue();
            ((q)localObject2).fJG.fIP = i;
          }
          catch (Exception localException5)
          {
            try
            {
              for (;;)
              {
                boolean bool1 = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.report.debugmodel"), false);
                boolean bool2 = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.report.kvstat"), false);
                boolean bool3 = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.report.clientpref"), false);
                boolean bool4 = bg.a(((com.tencent.mm.booter.p)localObject2).dm(".com.tencent.mm.debug.report.useraction"), false);
                com.tencent.mm.plugin.report.a.c.a(bool1, bool2, bool3, bool4);
                new StringBuilder("try control report : debugModel[").append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
                j.bA(erD);
                a.bv(erD);
                k.b("wcdb", (ClassLoader)localObject1);
                k.b("wechatcommon", (ClassLoader)localObject1);
                k.b(com.tencent.mm.sdk.a.vgP, (ClassLoader)localObject1);
                k.b("FFmpeg", (ClassLoader)localObject1);
                k.b("wechatpack", (ClassLoader)localObject1);
                i = l.sK();
                if ((i & 0x400) == 0) {
                  break label1055;
                }
                w.i("MicroMsg.AppBrandProfile", "load wechatsight_v7a, core number: %d", new Object[] { Integer.valueOf(i >> 12) });
                k.b("wechatsight_v7a", (ClassLoader)localObject1);
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
                localObject1 = new com.tencent.xweb.util.b()
                {
                  public final void d(String paramAnonymousString1, String paramAnonymousString2)
                  {
                    GMTrace.i(19130858078208L, 142536);
                    w.d(paramAnonymousString1, paramAnonymousString2);
                    GMTrace.o(19130858078208L, 142536);
                  }
                  
                  public final void e(String paramAnonymousString1, String paramAnonymousString2)
                  {
                    GMTrace.i(19130589642752L, 142534);
                    w.e(paramAnonymousString1, paramAnonymousString2);
                    GMTrace.o(19130589642752L, 142534);
                  }
                  
                  public final void i(String paramAnonymousString1, String paramAnonymousString2)
                  {
                    GMTrace.i(19130455425024L, 142533);
                    w.i(paramAnonymousString1, paramAnonymousString2);
                    GMTrace.o(19130455425024L, 142533);
                  }
                  
                  public final void v(String paramAnonymousString1, String paramAnonymousString2)
                  {
                    GMTrace.i(19130992295936L, 142537);
                    w.v(paramAnonymousString1, paramAnonymousString2);
                    GMTrace.o(19130992295936L, 142537);
                  }
                  
                  public final void w(String paramAnonymousString1, String paramAnonymousString2)
                  {
                    GMTrace.i(19130723860480L, 142535);
                    w.w(paramAnonymousString1, paramAnonymousString2);
                    GMTrace.o(19130723860480L, 142535);
                  }
                };
                localObject2 = new o()
                {
                  public final void c(long paramAnonymousLong1, long paramAnonymousLong2)
                  {
                    GMTrace.i(19132334473216L, 142547);
                    w.v("MicroMsg.AppBrandProfile", "callback: idkeyStat:577" + ", " + paramAnonymousLong1 + ", 1");
                    g.ork.a(577L, paramAnonymousLong1, 1L, true);
                    GMTrace.o(19132334473216L, 142547);
                  }
                  
                  public final void o(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
                  {
                    GMTrace.i(19132468690944L, 142548);
                    w.v("MicroMsg.AppBrandProfile", "callback: idkeyForPair:577" + ", " + paramAnonymousInt1 + ", 1, 577" + ", " + paramAnonymousInt2 + ", " + paramAnonymousInt3);
                    g.ork.a(577, 577, paramAnonymousInt1, paramAnonymousInt2, 1, paramAnonymousInt3, true);
                    GMTrace.o(19132468690944L, 142548);
                  }
                };
                localObject3 = new WebViewExtensionListener()
                {
                  public final Object onMiscCallBack(String paramAnonymousString, Object... paramAnonymousVarArgs)
                  {
                    GMTrace.i(19132737126400L, 142550);
                    if ("AddFilterResources".equals(paramAnonymousString)) {
                      com.tencent.mm.svg.a.e.a((Resources)paramAnonymousVarArgs[0], (Map)paramAnonymousVarArgs[1]);
                    }
                    GMTrace.o(19132737126400L, 142550);
                    return null;
                  }
                };
                com.tencent.xweb.p.a(ab.getContext(), (com.tencent.xweb.util.b)localObject1, (o)localObject2, (WebViewExtensionListener)localObject3);
                WebView.initWebviewCore(ab.getContext(), MMWebView.xrT, new WebView.b()
                {
                  public final void oR()
                  {
                    GMTrace.i(19131797602304L, 142543);
                    w.i("MicroMsg.AppBrandProfile", "onCoreInitFinished");
                    GMTrace.o(19131797602304L, 142543);
                  }
                  
                  public final void oS()
                  {
                    GMTrace.i(19131931820032L, 142544);
                    w.i("MicroMsg.AppBrandProfile", "onCoreInitFailed");
                    GMTrace.o(19131931820032L, 142544);
                  }
                });
                GMTrace.o(13004624101376L, 96892);
                return;
                localException2 = localException2;
                w.i("MicroMsg.AppBDebugger", "no debugger was got");
                continue;
                localException3 = localException3;
                w.i("MicroMsg.AppBDebugger", "no debugger was got");
                continue;
                localException4 = localException4;
                w.i("MicroMsg.AppBDebugger", "no debugger was got");
                continue;
                localException5 = localException5;
                w.i("MicroMsg.AppBDebugger", "no debugger was got");
              }
            }
            catch (Exception localException1)
            {
              for (;;)
              {
                w.i("MicroMsg.AppBDebugger", "no debugger was got");
                continue;
                com.tencent.mm.plugin.sight.base.b.oRB = 1;
                com.tencent.mm.plugin.sight.base.b.oRD = 1;
                com.tencent.mm.plugin.sight.base.b.oRE = 640000;
                continue;
                label1055:
                w.i("MicroMsg.AppBrandProfile", "load wechatsight");
                k.b("wechatsight", (ClassLoader)localObject1);
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
    GMTrace.i(13004892536832L, 96894);
    super.onTrimMemory(paramInt);
    w.v("MicroMsg.AppBrandProfile", "onTrimMemory(l : %d)", new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(13004892536832L, 96894);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\app\AppBrandProfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */