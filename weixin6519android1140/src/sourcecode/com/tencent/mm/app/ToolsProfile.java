package com.tencent.mm.app;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.booter.q;
import com.tencent.mm.compatible.d.l;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.pluginsdk.s;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ai.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.b;
import com.tencent.xweb.o;
import com.tencent.xweb.p;
import java.util.Locale;
import java.util.Map;
import org.xwalk.core.WebViewExtensionListener;

public final class ToolsProfile
  extends com.tencent.mm.compatible.loader.e
{
  public static int esX;
  public static final String ess;
  private static Locale locale;
  
  static
  {
    GMTrace.i(13042070847488L, 97171);
    ess = ab.getPackageName() + ":tools";
    esX = 0;
    GMTrace.o(13042070847488L, 97171);
  }
  
  public ToolsProfile()
  {
    GMTrace.i(13041131323392L, 97164);
    GMTrace.o(13041131323392L, 97164);
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(13041399758848L, 97166);
    paramConfiguration = MMActivity.eJ(this.app.getBaseContext());
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ToolsProfile", "onConfigurationChanged, locale = " + locale.toString() + ", n = " + paramConfiguration.toString());
    if (!paramConfiguration.equals(locale))
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ToolsProfile", "language changed, restart process");
      System.exit(-1);
    }
    GMTrace.o(13041399758848L, 97166);
  }
  
  public final void onCreate()
  {
    GMTrace.i(13041265541120L, 97165);
    long l = System.currentTimeMillis();
    Object localObject1 = ToolsProfile.class.getClassLoader();
    com.tencent.mm.f.a.at(ab.getContext());
    j.a(new ai.c()
    {
      public final void a(String paramAnonymousString, Throwable paramAnonymousThrowable)
      {
        GMTrace.i(19129113247744L, 142523);
        KVCommCrossProcessReceiver.bbU();
        GMTrace.o(19129113247744L, 142523);
      }
    });
    j.bA(ess);
    k.setupBrokenLibraryHandler();
    k.b(com.tencent.mm.sdk.a.vgN, ToolsProfile.class.getClassLoader());
    Object localObject2 = new com.tencent.mm.booter.w(com.tencent.mm.booter.c.av(this.app.getBaseContext()));
    ((com.tencent.mm.booter.w)localObject2).dl("TOOL");
    r.hjx = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.test.display_errcode"), false);
    r.hjy = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.test.display_msgstate"), false);
    r.hjz = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.test.network.simulate_fault"), false);
    r.hjA = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.test.network.force_touch"), false);
    r.hjB = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
    r.hjC = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.test.crashIsExit"), false);
    r.hjG = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.test.album_show_info"), false);
    r.hjH = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.test.location_help"), false);
    r.hjK = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.test.force_soso"), false);
    r.hjL = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.test.simulatePostServerError"), false);
    r.hjM = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
    r.hjN = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
    r.hjQ = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.test.filterfpnp"), false);
    r.hjR = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.test.testForPull"), false);
    int i = bg.a(((com.tencent.mm.booter.w)localObject2).getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
    r.hjO = i;
    if ((i != 4) && (r.hjO > 0))
    {
      com.tencent.mm.storage.v.vpz = r.hjO;
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ToolDebugger", "cdn thread num " + r.hjO);
    }
    r.hjP = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
    try
    {
      i = Integer.decode(((com.tencent.mm.booter.w)localObject2).getString(".com.tencent.mm.debug.log.setversion")).intValue();
      com.tencent.mm.protocal.d.zM(i);
      new StringBuilder("set up test protocal version = ").append(Integer.toHexString(i));
    }
    catch (Exception localException4)
    {
      try
      {
        localObject3 = ((com.tencent.mm.booter.w)localObject2).getString(".com.tencent.mm.debug.log.setapilevel");
        if (!bg.nm((String)localObject3))
        {
          com.tencent.mm.protocal.d.DEVICE_TYPE = "android-" + (String)localObject3;
          com.tencent.mm.protocal.d.tJx = "android-" + (String)localObject3;
          com.tencent.mm.protocal.d.tJz = (String)localObject3;
          com.tencent.mm.sdk.a.b.Ry((String)localObject3);
          new StringBuilder("set up test protocal apilevel = ").append(com.tencent.mm.protocal.d.DEVICE_TYPE).append(" ").append(com.tencent.mm.sdk.a.b.bPr());
        }
      }
      catch (Exception localException4)
      {
        try
        {
          i = Integer.decode(((com.tencent.mm.booter.w)localObject2).getString(".com.tencent.mm.debug.log.setuin")).intValue();
          new StringBuilder("set up test protocal uin old: ").append(com.tencent.mm.protocal.d.tJB).append(" new: ").append(i);
          com.tencent.mm.protocal.d.tJB = i;
        }
        catch (Exception localException4)
        {
          try
          {
            i = Integer.decode(((com.tencent.mm.booter.w)localObject2).getString(".com.tencent.mm.debug.log.setchannel")).intValue();
            ((q)localObject2).fJG.fIP = i;
          }
          catch (Exception localException4)
          {
            try
            {
              for (;;)
              {
                boolean bool1 = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.report.debugmodel"), false);
                boolean bool2 = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.report.kvstat"), false);
                boolean bool3 = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.report.clientpref"), false);
                boolean bool4 = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.report.useraction"), false);
                com.tencent.mm.plugin.report.a.c.a(bool1, bool2, bool3, bool4);
                new StringBuilder("try control report : debugModel[").append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
                r.hke = bg.aq(((com.tencent.mm.booter.w)localObject2).getString(".com.tencent.mm.debug.jsapi.permission"), "");
                com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ToolDebugger", "Test.jsapiPermission = " + r.hke);
                r.hkf = bg.aq(((com.tencent.mm.booter.w)localObject2).getString(".com.tencent.mm.debug.generalcontrol.permission"), "");
                com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ToolDebugger", "Test.generalCtrl = " + r.hkf);
                r.hkg = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.skiploadurlcheck"), false);
                com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ToolDebugger", "Test.skipLoadUrlCheck = " + r.hkg);
                r.hkh = bg.a(((com.tencent.mm.booter.w)localObject2).dm(".com.tencent.mm.debug.forcex5webview"), false);
                com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ToolDebugger", "Test.forceX5WebView = " + r.hkh);
                a.bv(ess);
                k.b("wcdb", (ClassLoader)localObject1);
                k.b("wechatcommon", (ClassLoader)localObject1);
                k.b(com.tencent.mm.sdk.a.vgP, (ClassLoader)localObject1);
                k.b("wechatImgTools", (ClassLoader)localObject1);
                k.b("FFmpeg", (ClassLoader)localObject1);
                k.b("wechatpack", (ClassLoader)localObject1);
                i = l.sK();
                if ((i & 0x400) == 0) {
                  break label1211;
                }
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ToolsProfile", "load wechatsight_v7a, core number: %d ", new Object[] { Integer.valueOf(i >> 12) });
                k.b("wechatsight_v7a", (ClassLoader)localObject1);
                if (i >> 12 < 4) {
                  break;
                }
                com.tencent.mm.plugin.sight.base.b.oRB = 3;
                com.tencent.mm.plugin.sight.base.b.oRD = 3;
                com.tencent.mm.plugin.sight.base.b.oRE = 544000;
                SightVideoJNI.registerALL();
                locale = MMActivity.eJ(this.app.getBaseContext());
                m.a(this.app);
                if ((com.tencent.mm.compatible.util.d.et(14)) && (MMApplicationLike.applicationLike != null)) {
                  MMApplicationLike.applicationLike.getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks()
                  {
                    public final void onActivityCreated(Activity paramAnonymousActivity, Bundle paramAnonymousBundle)
                    {
                      GMTrace.i(19133676650496L, 142557);
                      ToolsProfile.esX += 1;
                      GMTrace.o(19133676650496L, 142557);
                    }
                    
                    public final void onActivityDestroyed(Activity paramAnonymousActivity)
                    {
                      GMTrace.i(19133810868224L, 142558);
                      ToolsProfile.esX -= 1;
                      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ToolsProfile", "onActivityDestroyed, after destroy, activityInstanceNum = %d", new Object[] { Integer.valueOf(ToolsProfile.esX) });
                      if (ToolsProfile.esX == 0)
                      {
                        s.bIY();
                        boolean bool = WebView.getCanReboot();
                        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ToolsProfile", "onActivityDestroyed, xwebCanReboot = %b", new Object[] { Boolean.valueOf(bool) });
                        if (bool) {
                          Process.killProcess(Process.myPid());
                        }
                      }
                      GMTrace.o(19133810868224L, 142558);
                    }
                    
                    public final void onActivityPaused(Activity paramAnonymousActivity)
                    {
                      GMTrace.i(19133945085952L, 142559);
                      GMTrace.o(19133945085952L, 142559);
                    }
                    
                    public final void onActivityResumed(Activity paramAnonymousActivity)
                    {
                      GMTrace.i(19134079303680L, 142560);
                      GMTrace.o(19134079303680L, 142560);
                    }
                    
                    public final void onActivitySaveInstanceState(Activity paramAnonymousActivity, Bundle paramAnonymousBundle)
                    {
                      GMTrace.i(19134213521408L, 142561);
                      GMTrace.o(19134213521408L, 142561);
                    }
                    
                    public final void onActivityStarted(Activity paramAnonymousActivity)
                    {
                      GMTrace.i(19134347739136L, 142562);
                      GMTrace.o(19134347739136L, 142562);
                    }
                    
                    public final void onActivityStopped(Activity paramAnonymousActivity)
                    {
                      GMTrace.i(19134481956864L, 142563);
                      GMTrace.o(19134481956864L, 142563);
                    }
                  });
                }
                FileOp.init(false);
                MMBitmapFactory.init();
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ToolsProfile", "start time check toolsprofile use time = " + (System.currentTimeMillis() - l));
                localObject1 = new com.tencent.xweb.util.b()
                {
                  public final void d(String paramAnonymousString1, String paramAnonymousString2)
                  {
                    GMTrace.i(19129784336384L, 142528);
                    com.tencent.mm.sdk.platformtools.w.d(paramAnonymousString1, paramAnonymousString2);
                    GMTrace.o(19129784336384L, 142528);
                  }
                  
                  public final void e(String paramAnonymousString1, String paramAnonymousString2)
                  {
                    GMTrace.i(19129515900928L, 142526);
                    com.tencent.mm.sdk.platformtools.w.e(paramAnonymousString1, paramAnonymousString2);
                    GMTrace.o(19129515900928L, 142526);
                  }
                  
                  public final void i(String paramAnonymousString1, String paramAnonymousString2)
                  {
                    GMTrace.i(19129381683200L, 142525);
                    com.tencent.mm.sdk.platformtools.w.i(paramAnonymousString1, paramAnonymousString2);
                    GMTrace.o(19129381683200L, 142525);
                  }
                  
                  public final void v(String paramAnonymousString1, String paramAnonymousString2)
                  {
                    GMTrace.i(19129918554112L, 142529);
                    com.tencent.mm.sdk.platformtools.w.v(paramAnonymousString1, paramAnonymousString2);
                    GMTrace.o(19129918554112L, 142529);
                  }
                  
                  public final void w(String paramAnonymousString1, String paramAnonymousString2)
                  {
                    GMTrace.i(19129650118656L, 142527);
                    com.tencent.mm.sdk.platformtools.w.w(paramAnonymousString1, paramAnonymousString2);
                    GMTrace.o(19129650118656L, 142527);
                  }
                };
                localObject2 = new o()
                {
                  public final void c(long paramAnonymousLong1, long paramAnonymousLong2)
                  {
                    GMTrace.i(19131260731392L, 142539);
                    com.tencent.mm.sdk.platformtools.w.v("MicroMsg.ToolsProfile", "callback: idkeyStat:577" + ", " + paramAnonymousLong1 + ", 1");
                    g.ork.a(577L, paramAnonymousLong1, 1L, true);
                    GMTrace.o(19131260731392L, 142539);
                  }
                  
                  public final void o(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
                  {
                    GMTrace.i(19131394949120L, 142540);
                    com.tencent.mm.sdk.platformtools.w.v("MicroMsg.ToolsProfile", "callback: idkeyForPair:577" + ", " + paramAnonymousInt1 + ", 1, 577" + ", " + paramAnonymousInt2 + ", " + paramAnonymousInt3);
                    g.ork.a(577, 577, paramAnonymousInt1, paramAnonymousInt2, 1, paramAnonymousInt3, true);
                    GMTrace.o(19131394949120L, 142540);
                  }
                };
                Object localObject3 = new WebViewExtensionListener()
                {
                  public final Object onMiscCallBack(String paramAnonymousString, Object... paramAnonymousVarArgs)
                  {
                    GMTrace.i(19128576376832L, 142519);
                    if ("AddFilterResources".equals(paramAnonymousString)) {
                      com.tencent.mm.svg.a.e.a((Resources)paramAnonymousVarArgs[0], (Map)paramAnonymousVarArgs[1]);
                    }
                    GMTrace.o(19128576376832L, 142519);
                    return null;
                  }
                };
                p.a(ab.getContext(), (com.tencent.xweb.util.b)localObject1, (o)localObject2, (WebViewExtensionListener)localObject3);
                WebView.initWebviewCore(ab.getContext(), MMWebView.xrT, new WebView.b()
                {
                  public final void oR()
                  {
                    GMTrace.i(19128844812288L, 142521);
                    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ToolsProfile", "onCoreInitFinished");
                    GMTrace.o(19128844812288L, 142521);
                  }
                  
                  public final void oS()
                  {
                    GMTrace.i(19128979030016L, 142522);
                    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ToolsProfile", "onCoreInitFailed");
                    GMTrace.o(19128979030016L, 142522);
                  }
                });
                GMTrace.o(13041265541120L, 97165);
                return;
                localException1 = localException1;
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ToolDebugger", "no debugger was got");
                continue;
                localException2 = localException2;
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ToolDebugger", "no debugger was got");
                continue;
                localException3 = localException3;
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ToolDebugger", "no debugger was got");
                continue;
                localException4 = localException4;
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ToolDebugger", "no debugger was got");
              }
            }
            catch (Exception localException5)
            {
              for (;;)
              {
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ToolDebugger", "no debugger was got");
                continue;
                com.tencent.mm.plugin.sight.base.b.oRB = 1;
                com.tencent.mm.plugin.sight.base.b.oRD = 1;
                com.tencent.mm.plugin.sight.base.b.oRE = 640000;
                continue;
                label1211:
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ToolsProfile", "load wechatsight");
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
  
  public final String toString()
  {
    GMTrace.i(13041533976576L, 97167);
    String str = ess;
    GMTrace.o(13041533976576L, 97167);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\app\ToolsProfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */