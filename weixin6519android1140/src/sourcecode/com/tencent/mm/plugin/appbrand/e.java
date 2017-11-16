package com.tencent.mm.plugin.appbrand;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.ActivityManager.TaskDescription;
import android.content.Context;
import android.content.DialogInterface.OnShowListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.modelappbrand.a.b.b;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.l;
import com.tencent.mm.plugin.appbrand.b.b.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.a.a;
import com.tencent.mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService.a;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.AppBrandJSInterface;
import com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask;
import com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask.1;
import com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask.PrepareParams;
import com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask.a;
import com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask.b;
import com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder.LaunchCheckParams;
import com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder.UpdateTask;
import com.tencent.mm.plugin.appbrand.media.AppBrandMusicClientService;
import com.tencent.mm.plugin.appbrand.page.k;
import com.tencent.mm.plugin.appbrand.page.m;
import com.tencent.mm.plugin.appbrand.page.m.1;
import com.tencent.mm.plugin.appbrand.page.m.a;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController.a;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController.b;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.au;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class e
{
  public boolean gaD;
  public MMActivity hyB;
  public n hyC;
  public String hyD;
  e hyE;
  public AppBrandInitConfig hyF;
  public volatile AppBrandSysConfig hyG;
  public volatile com.tencent.mm.plugin.appbrand.config.a hyH;
  public j hyI;
  public m hyJ;
  FrameLayout hyK;
  public com.tencent.mm.plugin.appbrand.ui.i hyL;
  com.tencent.mm.plugin.appbrand.ui.e hyM;
  public com.tencent.mm.plugin.appbrand.widget.c.b hyN;
  public AppBrandStatObject hyO;
  public AppBrandRemoteTaskController hyP;
  private com.tencent.mm.plugin.appbrand.page.g hyQ;
  private com.tencent.mm.plugin.appbrand.page.f hyR;
  private com.tencent.mm.plugin.appbrand.o.c hyS;
  public g hyT;
  public com.tencent.mm.plugin.appbrand.b.b hyU;
  private int hyV;
  boolean hyW;
  boolean hyX;
  public boolean hyY;
  private int hyZ;
  public boolean hza;
  public boolean hzb;
  public boolean hzc;
  public com.tencent.mm.plugin.appbrand.report.a.e hzd;
  private AppBrandRemoteTaskController.b hze;
  private AppBrandMainProcessService.a hzf;
  Runnable hzg;
  public boolean mFinished;
  Handler mHandler;
  private boolean mPaused;
  
  public e(MMActivity paramMMActivity, n paramn)
  {
    GMTrace.i(20686038892544L, 154123);
    this.hyV = 0;
    this.hze = new AppBrandRemoteTaskController.b()
    {
      public final void finish()
      {
        GMTrace.i(20752610885632L, 154619);
        e.this.finish();
        GMTrace.o(20752610885632L, 154619);
      }
    };
    this.hzf = new AppBrandMainProcessService.a()
    {
      private boolean hzj;
      
      public final void RM()
      {
        GMTrace.i(20688991682560L, 154145);
        if (this.hzj)
        {
          e locale = e.this;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "onReconnected: %s", new Object[] { locale.hyD });
          locale.hyP.ar(locale.hyD, locale.hyF.hKs);
          MMToClientEvent.qc(locale.hyD);
          c.nT(locale.hyD);
          if (!locale.gaD)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandRuntime", "Main Process Restarted, start prepare again");
            locale.RG();
          }
        }
        this.hzj = false;
        GMTrace.o(20688991682560L, 154145);
      }
      
      public final void onDisconnected(String paramAnonymousString)
      {
        GMTrace.i(20689125900288L, 154146);
        this.hzj = true;
        long l1 = e.this.hyP.mTimestamp;
        paramAnonymousString = MultiProcessSharedPreferences.getSharedPreferences(ab.getContext(), "pref_appbrand_process", 4);
        SharedPreferences.Editor localEditor = paramAnonymousString.edit();
        long l2 = paramAnonymousString.getLong("on_wxa_process_connected_time", 0L);
        if (l2 == l1)
        {
          localEditor.remove("on_wxa_process_connected_time");
          localEditor.commit();
          com.tencent.mm.plugin.report.d.oqe.a(365L, 1L, 1L, false);
          com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandReporter", "delete timestamp(%s) and report(%d)", new Object[] { Long.valueOf(l1), Integer.valueOf(365) });
          GMTrace.o(20689125900288L, 154146);
          return;
        }
        com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandReporter", "do not need to report(%d), timestamp(cur : %s, sp : %s)", new Object[] { Long.valueOf(l1), Integer.valueOf(365), Long.valueOf(l1), Long.valueOf(l2) });
        GMTrace.o(20689125900288L, 154146);
      }
    };
    this.hzg = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20768045924352L, 154734);
        com.tencent.mm.plugin.report.service.g.ork.a(369L, 11L, 1L, false);
        GMTrace.o(20768045924352L, 154734);
      }
    };
    this.hyB = paramMMActivity;
    this.hyC = paramn;
    this.mHandler = new Handler();
    this.hyK = new FrameLayout(paramMMActivity);
    this.hyK.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.hyP = new AppBrandRemoteTaskController();
    AppBrandRemoteTaskController localAppBrandRemoteTaskController = this.hyP;
    paramn = paramn.RR();
    AppBrandRemoteTaskController.b localb = this.hze;
    localAppBrandRemoteTaskController.izU = paramMMActivity.getClass().getName();
    localAppBrandRemoteTaskController.hzs = paramn;
    localAppBrandRemoteTaskController.hze = localb;
    this.hyQ = new com.tencent.mm.plugin.appbrand.page.g();
    this.hyR = new com.tencent.mm.plugin.appbrand.page.f();
    this.hyS = new com.tencent.mm.plugin.appbrand.o.c();
    this.hyT = new g();
    GMTrace.o(20686038892544L, 154123);
  }
  
  private void a(Animator paramAnimator, final Runnable paramRunnable)
  {
    GMTrace.i(15530199089152L, 115709);
    paramAnimator.addListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(20682012360704L, 154093);
        if (paramRunnable != null) {
          paramRunnable.run();
        }
        GMTrace.o(20682012360704L, 154093);
      }
    });
    paramAnimator.start();
    GMTrace.o(15530199089152L, 115709);
  }
  
  final void RA()
  {
    GMTrace.i(15528856911872L, 115699);
    this.hzd = new com.tencent.mm.plugin.appbrand.report.a.e(this);
    this.hzd.izb = bg.Pv();
    com.tencent.mm.plugin.appbrand.task.c.a(new com.tencent.mm.plugin.appbrand.task.c.a()
    {
      public final void onReady()
      {
        GMTrace.i(18830478802944L, 140298);
        e.this.hzb = true;
        e.this.hyT.k(2, System.currentTimeMillis() - this.gHW);
        com.tencent.mm.plugin.appbrand.performance.a.a(e.this.hyD, "X5Prepare", this.gHW, System.currentTimeMillis());
        e.this.RH();
        GMTrace.o(18830478802944L, 140298);
      }
    }, false);
    RG();
    if (this.hyL != null) {
      RC();
    }
    String str1 = this.hyF.iconUrl;
    String str2 = this.hyF.eEs;
    Object localObject = this.hyB;
    if (RF())
    {
      localObject = new com.tencent.mm.plugin.appbrand.ui.c((Context)localObject, this);
      ((com.tencent.mm.plugin.appbrand.ui.i)localObject).bm(str1, str2);
      if (RD() != 1023) {
        break label363;
      }
    }
    label363:
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        ((com.tencent.mm.plugin.appbrand.ui.i)localObject).aaK();
      }
      this.hyK.addView(((com.tencent.mm.plugin.appbrand.ui.i)localObject).getView(), -1, -1);
      this.hyL = ((com.tencent.mm.plugin.appbrand.ui.i)localObject);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "appOnCreate: %s, %s", new Object[] { this.hyF.eEs, this.hyF.appId });
      AppBrandMainProcessService.a(this.hzf);
      localObject = this.hyP;
      str1 = this.hyD;
      ((AppBrandRemoteTaskController)localObject).izV = AppBrandRemoteTaskController.a.iAi;
      ((AppBrandRemoteTaskController)localObject).hyD = str1;
      AppBrandMainProcessService.a((MainProcessTask)localObject);
      this.hyP.ar(this.hyD, this.hyF.hKs);
      this.hyU.hKO.ib(3);
      MMToClientEvent.qc(this.hyD);
      c.nV(this.hyD);
      c.nP(this.hyD);
      c.a(this.hyD, c.a.hym);
      com.tencent.mm.plugin.appbrand.jsapi.i.qh(this.hyD);
      AppBrandStickyBannerLogic.a.cz(this.hyF.hQz);
      localObject = this.hyS;
      ((com.tencent.mm.plugin.appbrand.o.c)localObject).appId = this.hyD;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandUserCaptureScreenMonitor", "init");
      au.a(((com.tencent.mm.plugin.appbrand.o.c)localObject).iGr);
      RH();
      this.mHandler.postDelayed(this.hzg, 10000L);
      GMTrace.o(15528856911872L, 115699);
      return;
      localObject = new com.tencent.mm.plugin.appbrand.ui.d((Context)localObject, this);
      break;
    }
  }
  
  public final e RB()
  {
    GMTrace.i(17324824330240L, 129080);
    e locale = this.hyC.b(this);
    GMTrace.o(17324824330240L, 129080);
    return locale;
  }
  
  public final void RC()
  {
    GMTrace.i(18191199764480L, 135535);
    if (this.hyL == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandRuntime", "hideSplash, splash view null");
      GMTrace.o(18191199764480L, 135535);
      return;
    }
    this.hyL.a(this.hyJ.Zs().Zk());
    this.hyL.aaJ();
    this.hyL = null;
    GMTrace.o(18191199764480L, 135535);
  }
  
  public final int RD()
  {
    GMTrace.i(15529259565056L, 115702);
    if (this.hyO == null)
    {
      GMTrace.o(15529259565056L, 115702);
      return 0;
    }
    int i = this.hyO.scene;
    GMTrace.o(15529259565056L, 115702);
    return i;
  }
  
  public final String RE()
  {
    GMTrace.i(18191333982208L, 135536);
    if (this.hyF == null)
    {
      GMTrace.o(18191333982208L, 135536);
      return "";
    }
    if (bg.nm(this.hyF.hQy))
    {
      if (this.hyH == null)
      {
        GMTrace.o(18191333982208L, 135536);
        return "";
      }
      str = this.hyH.Uq();
      GMTrace.o(18191333982208L, 135536);
      return str;
    }
    String str = this.hyF.hQy;
    GMTrace.o(18191333982208L, 135536);
    return str;
  }
  
  public final boolean RF()
  {
    GMTrace.i(17324958547968L, 129081);
    if ((this.hyF == null) || (this.hyF.hQw))
    {
      GMTrace.o(17324958547968L, 129081);
      return true;
    }
    GMTrace.o(17324958547968L, 129081);
    return false;
  }
  
  public final void RG()
  {
    GMTrace.i(15529393782784L, 115703);
    if (!com.tencent.mm.plugin.appbrand.task.c.aao())
    {
      com.tencent.mm.plugin.appbrand.task.c.a(new com.tencent.mm.plugin.appbrand.task.c.a()
      {
        public final void onReady()
        {
          GMTrace.i(20768448577536L, 154737);
          if (!e.this.mFinished) {
            e.this.RG();
          }
          GMTrace.o(20768448577536L, 154737);
        }
      }, false);
      GMTrace.o(15529393782784L, 115703);
      return;
    }
    final long l = System.currentTimeMillis();
    AppBrandPrepareTask localAppBrandPrepareTask = new AppBrandPrepareTask(this.hyB, this);
    localAppBrandPrepareTask.ipG = new AppBrandPrepareTask.b()
    {
      public final void b(AppBrandSysConfig paramAnonymousAppBrandSysConfig)
      {
        GMTrace.i(20752208232448L, 154616);
        if (e.this.hyB.isFinishing())
        {
          GMTrace.o(20752208232448L, 154616);
          return;
        }
        if (paramAnonymousAppBrandSysConfig == null)
        {
          e.this.finish();
          GMTrace.o(20752208232448L, 154616);
          return;
        }
        e.this.hyT.k(1, System.currentTimeMillis() - l);
        com.tencent.mm.plugin.appbrand.performance.a.a(e.this.hyD, "ResourcePrepare", l, System.currentTimeMillis());
        e.this.hyG = paramAnonymousAppBrandSysConfig;
        e.this.hyH = com.tencent.mm.plugin.appbrand.config.a.h(e.this);
        e.this.hyB.runOnUiThread(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20689528553472L, 154149);
            e.this.hza = true;
            e.this.RH();
            GMTrace.o(20689528553472L, 154149);
          }
        });
        GMTrace.o(20752208232448L, 154616);
      }
      
      public final void onDownloadStarted()
      {
        GMTrace.i(20752342450176L, 154617);
        e.this.hzc = true;
        if (e.this.hzd != null) {
          e.this.hzd.izc = true;
        }
        GMTrace.o(20752342450176L, 154617);
      }
    };
    XIPCInvoker.a("com.tencent.mm", localAppBrandPrepareTask.ipF, AppBrandPrepareTask.a.class, new AppBrandPrepareTask.1(localAppBrandPrepareTask));
    com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandPrepareTask", "[applaunch] startPrepare in appbrand %s, %d", new Object[] { localAppBrandPrepareTask.ipF.hyD, Integer.valueOf(localAppBrandPrepareTask.ipF.ipP) });
    GMTrace.o(15529393782784L, 115703);
  }
  
  public final void RH()
  {
    GMTrace.i(15529528000512L, 115704);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "mFinished: %b, ResourceReady: %b, WebViewReady: %b", new Object[] { Boolean.valueOf(this.mFinished), Boolean.valueOf(this.hza), Boolean.valueOf(this.hzb) });
    if ((this.mFinished) || (!this.hza) || (!this.hzb))
    {
      GMTrace.o(15529528000512L, 115704);
      return;
    }
    final Runnable local12 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20755026804736L, 154637);
        e locale = e.this;
        locale.hyH = com.tencent.mm.plugin.appbrand.config.a.h(locale);
        locale.a(locale.hyO, locale.hyF.hQy);
        locale.hyI = com.tencent.mm.plugin.appbrand.task.c.sg(locale.hyD);
        if (locale.hyI == null) {
          locale.hyI = new j();
        }
        Object localObject1 = locale.hyI;
        Object localObject2 = locale.hyB;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandService", "onRuntimeReady, mPreLoadWebView %b", new Object[] { Boolean.valueOf(((j)localObject1).hzQ) });
        ((j)localObject1).mContext = ((Context)localObject2);
        ((j)localObject1).hzM = locale;
        ((j)localObject1).hyD = locale.hyD;
        locale.hyJ = new m(locale.hyB, locale);
        locale.hyJ.iuA = new e.14(locale);
        locale.hyK.addView(locale.hyJ, 0);
        localObject1 = locale.hyK;
        localObject2 = new com.tencent.mm.plugin.appbrand.widget.c.b(locale.hyB);
        locale.hyN = ((com.tencent.mm.plugin.appbrand.widget.c.b)localObject2);
        ((FrameLayout)localObject1).addView((View)localObject2);
        localObject1 = locale.hyJ;
        ((m)localObject1).runOnUiThread(new m.1((m)localObject1, locale.hyF.hQy));
        localObject1 = locale.hyI;
        ((j)localObject1).RX();
        ((j)localObject1).RU();
        localObject2 = com.tencent.mm.plugin.appbrand.appcache.w.a(((j)localObject1).hzM, "app-service.js");
        com.tencent.mm.plugin.report.service.g.ork.a(370L, 9L, 1L, false);
        com.tencent.mm.plugin.appbrand.o.h.a(((j)localObject1).hzO, (String)localObject2, new j.2((j)localObject1));
        ((j)localObject1).RT();
        locale.a(locale.hyG);
        com.tencent.mm.plugin.report.service.g.ork.a(369L, 2L, 1L, false);
        e.this.gaD = true;
        locale = e.this;
        locale.mHandler.removeCallbacks(locale.hzg);
        GMTrace.o(20755026804736L, 154637);
      }
    };
    int i = this.hyV + 1;
    this.hyV = i;
    if (i > 1)
    {
      local12.run();
      GMTrace.o(15529528000512L, 115704);
      return;
    }
    Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
    {
      public final boolean queueIdle()
      {
        GMTrace.i(20682280796160L, 154095);
        Looper.myQueue().removeIdleHandler(this);
        local12.run();
        GMTrace.o(20682280796160L, 154095);
        return false;
      }
    });
    GMTrace.o(15529528000512L, 115704);
  }
  
  public final void RI()
  {
    GMTrace.i(16160082886656L, 120402);
    this.hyZ += 1;
    GMTrace.o(16160082886656L, 120402);
  }
  
  public final void RJ()
  {
    GMTrace.i(16160217104384L, 120403);
    if (this.hyZ == 0)
    {
      GMTrace.o(16160217104384L, 120403);
      return;
    }
    this.hyZ -= 1;
    GMTrace.o(16160217104384L, 120403);
  }
  
  public final boolean RK()
  {
    GMTrace.i(19693364576256L, 146727);
    if ((this.mPaused) && (this.hyZ == 0))
    {
      cleanup();
      GMTrace.o(19693364576256L, 146727);
      return true;
    }
    GMTrace.o(19693364576256L, 146727);
    return false;
  }
  
  final void RL()
  {
    GMTrace.i(17665200488448L, 131616);
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this.hyK, "translationX", new float[] { this.hyK.getWidth(), 0.0F });
    localObjectAnimator.setDuration(250L);
    a(localObjectAnimator, null);
    GMTrace.o(17665200488448L, 131616);
  }
  
  final void a(AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject)
  {
    GMTrace.i(17324421677056L, 129077);
    if ((paramAppBrandInitConfig == null) || (paramAppBrandStatObject == null))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "null current config, ignored");
      GMTrace.o(17324421677056L, 129077);
      return;
    }
    this.hyF = paramAppBrandInitConfig;
    this.hyO = paramAppBrandStatObject;
    this.hyD = paramAppBrandInitConfig.appId;
    this.hyU = new com.tencent.mm.plugin.appbrand.b.b(this);
    paramAppBrandStatObject = this.hyU;
    com.tencent.mm.ipcinvoker.f.en("com.tencent.mm");
    ab.getContext().registerComponentCallbacks(paramAppBrandStatObject.hKQ);
    paramAppBrandStatObject.hKO.start();
    this.hyU.a(new b.a()
    {
      public final void a(com.tencent.mm.plugin.appbrand.b.a paramAnonymousa)
      {
        GMTrace.i(18831149891584L, 140303);
        e locale = e.this;
        HashMap localHashMap = new HashMap();
        switch (com.tencent.mm.plugin.appbrand.page.h.1.hKS[paramAnonymousa.ordinal()])
        {
        default: 
          GMTrace.o(18831149891584L, 140303);
          return;
        case 1: 
          paramAnonymousa = "background";
        }
        for (;;)
        {
          localHashMap.put("status", paramAnonymousa);
          new com.tencent.mm.plugin.appbrand.page.h().r(localHashMap).a(locale.hyI).VR();
          GMTrace.o(18831149891584L, 140303);
          return;
          paramAnonymousa = "active";
          continue;
          paramAnonymousa = "suspend";
        }
      }
    });
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "init %s, config %s, stat %s", new Object[] { this.hyD, this.hyF, this.hyO });
    this.gaD = false;
    this.mPaused = false;
    this.mFinished = false;
    this.hyW = false;
    this.hyX = false;
    this.hyY = false;
    this.hza = false;
    this.hzb = false;
    this.hzc = false;
    this.hyZ = 0;
    com.tencent.mm.pluginsdk.model.w.r("weapp_id", this.hyF.appId);
    com.tencent.mm.pluginsdk.model.w.r("weapp_name", this.hyF.eEs);
    com.tencent.mm.pluginsdk.model.w.r("use_private_classloader", Boolean.valueOf(false));
    a.a(this.hyD, this);
    i.oa(this.hyD);
    this.hyT.k(0, System.currentTimeMillis() - paramAppBrandInitConfig.startTime);
    com.tencent.mm.plugin.report.service.g.ork.a(369L, 1L, 1L, false);
    com.tencent.mm.plugin.appbrand.performance.a.a(this.hyD, "ActivityCreate", this.hyF.startTime, System.currentTimeMillis());
    GMTrace.o(17324421677056L, 129077);
  }
  
  @TargetApi(21)
  final void a(final AppBrandSysConfig paramAppBrandSysConfig)
  {
    GMTrace.i(17664932052992L, 131614);
    if (Build.VERSION.SDK_INT < 21)
    {
      GMTrace.o(17664932052992L, 131614);
      return;
    }
    if (RF())
    {
      GMTrace.o(17664932052992L, 131614);
      return;
    }
    final int i = com.tencent.mm.plugin.appbrand.ui.g.at(this.hyH.hPy.hPP, -16777216);
    this.hyB.setTaskDescription(new ActivityManager.TaskDescription(paramAppBrandSysConfig.eEs, null, i));
    com.tencent.mm.modelappbrand.a.b.CT().a(new b.b()
    {
      public final void j(Bitmap paramAnonymousBitmap)
      {
        GMTrace.i(20768314359808L, 154736);
        e.this.hyB.setTaskDescription(new ActivityManager.TaskDescription(paramAppBrandSysConfig.eEs, paramAnonymousBitmap, i));
        GMTrace.o(20768314359808L, 154736);
      }
    }, paramAppBrandSysConfig.hQJ, null);
    GMTrace.o(17664932052992L, 131614);
  }
  
  final void a(AppBrandStatObject paramAppBrandStatObject, String paramString)
  {
    GMTrace.i(17324690112512L, 129079);
    AppBrandIDKeyBatchReport.ZT().ixZ = 1;
    AppBrandMainProcessService.a(AppBrandIDKeyBatchReport.ZT());
    if (paramAppBrandStatObject == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandRuntime", "statObject is null!");
      GMTrace.o(17324690112512L, 129079);
      return;
    }
    if (paramString != null) {
      paramAppBrandStatObject.iyl = paramString;
    }
    a.a(this.hyF.appId, paramAppBrandStatObject);
    h.f(this).hzG = this.hyF.hzG;
    if (this.hyJ != null) {
      this.hyJ.iuy.Uv();
    }
    this.hyO = paramAppBrandStatObject;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "updateStat %s, scene %d", new Object[] { this.hyD, Integer.valueOf(RD()) });
    GMTrace.o(17324690112512L, 129079);
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.widget.c.a parama)
  {
    GMTrace.i(18191065546752L, 135534);
    if ((parama == null) || (this.mFinished))
    {
      GMTrace.o(18191065546752L, 135534);
      return;
    }
    com.tencent.mm.plugin.appbrand.widget.c.b localb;
    Object localObject;
    if (this.hyN != null)
    {
      localb = this.hyN;
      localObject = localb.iKH;
      if ((((com.tencent.mm.plugin.appbrand.widget.c.c)localObject).iKQ == null) || (!((com.tencent.mm.plugin.appbrand.widget.c.c)localObject).iKQ.isRunning())) {
        break label238;
      }
    }
    label238:
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        localObject = localb.iKH;
        if (((com.tencent.mm.plugin.appbrand.widget.c.c)localObject).iKQ != null) {
          ((com.tencent.mm.plugin.appbrand.widget.c.c)localObject).iKQ.cancel();
        }
      }
      localObject = parama.getContentView();
      if (((View)localObject).getParent() != localb)
      {
        com.tencent.mm.plugin.appbrand.widget.c.b.bN((View)localObject);
        localb.addView((View)localObject, new FrameLayout.LayoutParams(-2, -2, 17));
        if (localb.iKL != parama)
        {
          ((View)localObject).clearAnimation();
          ((View)localObject).startAnimation(AnimationUtils.loadAnimation(localb.getContext(), o.a.hzW));
        }
        localb.iKL = parama;
      }
      ((View)localObject).setOnClickListener(localb.mOnClickListener);
      localb.iKI.add(parama);
      if (parama.iKC != null) {
        parama.iKC.onShow(parama);
      }
      parama.iKG = localb;
      localb.setVisibility(0);
      localb.iKH.a(Color.argb(127, 0, 0, 0), null);
      GMTrace.o(18191065546752L, 135534);
      return;
    }
  }
  
  public final void cleanup()
  {
    GMTrace.i(17325092765696L, 129082);
    if (this.mFinished)
    {
      GMTrace.o(17325092765696L, 129082);
      return;
    }
    this.mFinished = true;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "onDestroy: %s", new Object[] { this.hyD });
    final Object localObject1 = this.hyD;
    if (DebuggerShell.UK()) {
      com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18880810450944L, 140673);
          com.tencent.mm.plugin.appbrand.performance.a.sc(localObject1);
          GMTrace.o(18880810450944L, 140673);
        }
      });
    }
    localObject1 = this.hyP;
    ??? = this.hyD;
    ((AppBrandRemoteTaskController)localObject1).izV = AppBrandRemoteTaskController.a.iAc;
    ((AppBrandRemoteTaskController)localObject1).hyD = ((String)???);
    AppBrandMainProcessService.a((MainProcessTask)localObject1);
    AppBrandMainProcessService.b(this.hzf);
    MMToClientEvent.qd(this.hyD);
    c.nQ(this.hyD);
    c.a(this.hyD, c.a.hyq);
    com.tencent.mm.plugin.appbrand.jsapi.i.qi(this.hyD);
    AppBrandStickyBannerLogic.a.ss(this.hyD);
    a.nN(this.hyD);
    localObject1 = AppBrandMusicClientService.irl;
    ((AppBrandMusicClientService)localObject1).irk.clear();
    ((AppBrandMusicClientService)localObject1).irm = "";
    this.hyB.aLo();
    localObject1 = this.hyU;
    ??? = ((com.tencent.mm.plugin.appbrand.b.b)localObject1).hKO;
    ((com.tencent.mm.plugin.appbrand.b.c)???).hKZ.set(true);
    ((com.tencent.mm.plugin.appbrand.b.c)???).quit();
    ((com.tencent.mm.plugin.appbrand.b.c)???).b(com.tencent.mm.plugin.appbrand.b.a.hKM);
    ab.getContext().unregisterComponentCallbacks(((com.tencent.mm.plugin.appbrand.b.b)localObject1).hKQ);
    for (;;)
    {
      synchronized (((com.tencent.mm.plugin.appbrand.b.b)localObject1).hKP)
      {
        ((com.tencent.mm.plugin.appbrand.b.b)localObject1).hKP.clear();
        if (this.hzd != null) {
          localObject1 = this.hzd;
        }
        try
        {
          ??? = i.od(((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).hzF.hyD);
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).iyz = com.tencent.mm.plugin.appbrand.report.a.bP(ab.getContext());
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).appId = ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).hzF.hyD;
          if (((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).hzF.hyG != null) {
            break label614;
          }
          i = 0;
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).eVc = i;
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).eAu = (((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).hzF.hyF.hKs + 1);
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).scene = ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).hzF.RD();
          if (!((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).izc) {
            break label631;
          }
          i = 1;
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).izd = i;
          if (!((i)???).hzK.get()) {
            break label636;
          }
          i = 1;
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).ize = i;
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).izf = (bg.Pv() - ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).izb);
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).izg = bg.Pv();
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrand.Report.kv_14576", "report|" + ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).toString());
          com.tencent.mm.plugin.report.d.oqe.i(14576, new Object[] { ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).iyz, ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).appId, Integer.valueOf(((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).eVc), Integer.valueOf(((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).eAu), Integer.valueOf(((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).scene), ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).eDA, Integer.valueOf(((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).izd), Integer.valueOf(((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).ize), Long.valueOf(((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).izf), Long.valueOf(((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).izg) });
        }
        catch (Exception localException)
        {
          int i;
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrand.Report.kv_14576", "report exp %s", new Object[] { localException });
          continue;
        }
        this.hzd = null;
        c.nU(this.hyD);
        if (this.hyI != null)
        {
          localObject1 = this.hyI;
          ((j)localObject1).hzO.cleanup();
          ((j)localObject1).hzN.cleanup();
        }
        if (this.hyJ != null)
        {
          this.hyK.removeView(this.hyJ);
          this.hyJ.cleanup();
        }
        a.a(this.hyD, null);
        i.remove(this.hyD);
        this.hyF.startTime = System.currentTimeMillis();
        GMTrace.o(17325092765696L, 129082);
        return;
      }
      label614:
      i = ((com.tencent.mm.plugin.appbrand.report.a.e)localObject2).hzF.hyG.hRg.hKC;
      continue;
      label631:
      i = 0;
      continue;
      label636:
      i = 0;
    }
  }
  
  public final void d(JSONObject paramJSONObject)
  {
    GMTrace.i(17325361201152L, 129084);
    if ((this.hyC.RP() == 1) && (this.hyC.c(this)))
    {
      this.hyC.finish();
      GMTrace.o(17325361201152L, 129084);
      return;
    }
    Object localObject1 = RB();
    int i;
    label120:
    Object localObject2;
    if ((this.hyE == null) || (this.hyE != localObject1))
    {
      localObject1 = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17400657346560L, 129645);
          e.this.hyC.d(e.this);
          GMTrace.o(17400657346560L, 129645);
        }
      };
      paramJSONObject = RB();
      if ((this.hyJ != null) && (this.hyJ.Zs() != null) && (this.hyJ.Zs().iur)) {
        break label335;
      }
      i = 1;
      if (i == 0) {
        break label340;
      }
      localObject2 = ObjectAnimator.ofFloat(this.hyK, "translationX", new float[] { 0.0F, this.hyK.getWidth() });
      ((ObjectAnimator)localObject2).setDuration(250L);
      a((Animator)localObject2, (Runnable)localObject1);
      if (paramJSONObject != null)
      {
        localObject1 = ObjectAnimator.ofFloat(paramJSONObject.hyK, "translationX", new float[] { -(paramJSONObject.hyK.getWidth() * 0.25F), 0.0F });
        ((ObjectAnimator)localObject1).setDuration(250L);
        paramJSONObject.a((Animator)localObject1, null);
      }
    }
    for (;;)
    {
      if (paramJSONObject != null) {
        paramJSONObject.onResume();
      }
      GMTrace.o(17325361201152L, 129084);
      return;
      localObject2 = new AppBrandLaunchReferrer();
      ((AppBrandLaunchReferrer)localObject2).appId = this.hyD;
      ((AppBrandLaunchReferrer)localObject2).hQF = 3;
      if (paramJSONObject == null) {}
      for (paramJSONObject = null;; paramJSONObject = paramJSONObject.toString())
      {
        ((AppBrandLaunchReferrer)localObject2).hQG = paramJSONObject;
        ((e)localObject1).hyF.hQB.a((AppBrandLaunchReferrer)localObject2);
        paramJSONObject = new AppBrandStatObject();
        paramJSONObject.scene = 1038;
        paramJSONObject.eAv = this.hyD;
        ((e)localObject1).hyF.Uv();
        ((e)localObject1).a(paramJSONObject, null);
        break;
      }
      label335:
      i = 0;
      break label120;
      label340:
      ((Runnable)localObject1).run();
    }
  }
  
  public final void finish()
  {
    GMTrace.i(17325226983424L, 129083);
    this.hyB.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20702681890816L, 154247);
        e.this.d(null);
        GMTrace.o(20702681890816L, 154247);
      }
    });
    GMTrace.o(17325226983424L, 129083);
  }
  
  final void h(Runnable paramRunnable)
  {
    GMTrace.i(17665066270720L, 131615);
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.hyK, "translationX", new float[] { 0.0F, -(this.hyK.getWidth() * 0.25F) });
    localObjectAnimator1.setDuration(250L);
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.hyK, "translationX", new float[] { 0.0F });
    localObjectAnimator2.setDuration(0L);
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playSequentially(new Animator[] { localObjectAnimator1, localObjectAnimator2 });
    a(localAnimatorSet, paramRunnable);
    GMTrace.o(17665066270720L, 131615);
  }
  
  public final void onPause()
  {
    GMTrace.i(15529662218240L, 115705);
    if (!this.gaD)
    {
      GMTrace.o(15529662218240L, 115705);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "onPause: %s", new Object[] { this.hyD });
    this.mPaused = true;
    this.hyU.hKO.ib(1);
    com.tencent.mm.plugin.appbrand.page.f localf = this.hyR;
    HashMap localHashMap = new HashMap(1);
    c.c localc = c.nW(this.hyD);
    Object localObject = "hide";
    switch (com.tencent.mm.plugin.appbrand.page.f.1.hLp[localc.ordinal()])
    {
    }
    for (;;)
    {
      localHashMap.put("mode", localObject);
      localf.r(localHashMap).a(this.hyI).VR();
      localObject = this.hyJ;
      if (((m)localObject).iuv.size() != 0)
      {
        ((k)((m)localObject).iuv.getFirst()).Zf();
        ((m)localObject).iuy.b((k)((m)localObject).iuv.peekFirst());
      }
      c.nR(this.hyD);
      c.a(this.hyD, c.a.hyo);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandUserCaptureScreenMonitor", "onPause");
      au.a(null);
      GMTrace.o(15529662218240L, 115705);
      return;
      localObject = "close";
      continue;
      localObject = "back";
      continue;
      localObject = "hide";
      continue;
      localObject = "hang";
      continue;
      localObject = "launchMiniProgram";
    }
  }
  
  public final void onResume()
  {
    GMTrace.i(15529796435968L, 115706);
    if (!this.gaD)
    {
      GMTrace.o(15529796435968L, 115706);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "onResume: %s", new Object[] { this.hyD });
    if ((this.mFinished) || (this.hyW))
    {
      cleanup();
      a(this.hyF, this.hyO);
      RA();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "reload: %s", new Object[] { this.hyD });
      GMTrace.o(15529796435968L, 115706);
      return;
    }
    this.mPaused = false;
    c.nV(this.hyD);
    c.nS(this.hyD);
    c.a(this.hyD, c.a.hyn);
    Object localObject1 = this.hyP;
    Object localObject2 = this.hyD;
    int i = this.hyF.hKs;
    ((AppBrandRemoteTaskController)localObject1).izV = AppBrandRemoteTaskController.a.iAb;
    ((AppBrandRemoteTaskController)localObject1).hyD = ((String)localObject2);
    ((AppBrandRemoteTaskController)localObject1).ipP = i;
    AppBrandMainProcessService.a((MainProcessTask)localObject1);
    localObject1 = this.hyJ;
    if (((m)localObject1).iuv.size() != 0)
    {
      ((k)((m)localObject1).iuv.getFirst()).Ze();
      ((m)localObject1).iuy.c((k)((m)localObject1).iuv.peekFirst());
    }
    this.hyU.hKO.ib(3);
    localObject2 = this.hyQ;
    boolean bool = this.hyX;
    Object localObject3 = new HashMap();
    localObject1 = this.hyO;
    if (localObject1 != null) {
      ((HashMap)localObject3).put("scene", Integer.valueOf(((AppBrandStatObject)localObject1).scene));
    }
    localObject1 = this.hyF.hQB.Uy();
    if (localObject1 != null) {
      ((HashMap)localObject3).put("referrerInfo", localObject1);
    }
    localObject1 = this.hyF.Uw();
    if (localObject1 != null) {
      ((HashMap)localObject3).put("shareInfo", localObject1);
    }
    ((HashMap)localObject3).put("relaunch", Boolean.valueOf(bool));
    ((HashMap)localObject3).put("reLaunch", Boolean.valueOf(bool));
    if (bool)
    {
      localObject1 = RE();
      ((HashMap)localObject3).put("path", com.tencent.mm.plugin.appbrand.n.h.sv((String)localObject1));
      ((HashMap)localObject3).put("query", com.tencent.mm.plugin.appbrand.n.h.sw((String)localObject1));
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandOnAppEnterForegroundEvent", "path: %s, query: %s", new Object[] { ((HashMap)localObject3).get("path"), ((HashMap)localObject3).get("query") });
      com.tencent.mm.plugin.appbrand.o.d.k((Map)localObject3);
      ((com.tencent.mm.plugin.appbrand.page.g)localObject2).r((Map)localObject3).a(this.hyI).VR();
      if (this.hyX) {
        this.hyJ.P(RE(), true);
      }
      localObject1 = this.hyF;
      if (!bg.nm(((AppBrandInitConfig)localObject1).appId))
      {
        localObject2 = a.nK(((AppBrandInitConfig)localObject1).appId);
        if (localObject2 != null)
        {
          localObject3 = a.nL(((AppBrandInitConfig)localObject1).appId);
          if (localObject3 != null) {
            break label576;
          }
        }
      }
    }
    for (;;)
    {
      localObject1 = this.hyS;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandUserCaptureScreenMonitor", "onResume");
      au.a(((com.tencent.mm.plugin.appbrand.o.c)localObject1).iGr);
      a(this.hyG);
      com.tencent.mm.plugin.appbrand.task.c.sf(this.hyD);
      this.hyW = false;
      this.hyX = false;
      GMTrace.o(15529796435968L, 115706);
      return;
      localObject1 = this.hyJ.Zi();
      break;
      label576:
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandTaskUsageRecorder", "updateUsage, appId %s, type %d", new Object[] { ((AppBrandInitConfig)localObject1).appId, Integer.valueOf(((AppBrandInitConfig)localObject1).hKs) });
      String str = h.nZ(((AppBrandInitConfig)localObject1).appId).hzG;
      AppBrandMainProcessService.a(new AppBrandTaskUsageRecorder.UpdateTask(new AppBrandTaskUsageRecorder.LaunchCheckParams((AppBrandInitConfig)localObject1, (AppBrandStatObject)localObject3, ((AppBrandSysConfig)localObject2).hRg.hKC, l.SC().hKC, str)));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */