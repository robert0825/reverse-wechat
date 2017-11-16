package com.tencent.mm.plugin.appbrand.launching;

import android.os.HandlerThread;
import android.os.Looper;
import android.support.v4.e.a;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.protocal.c.av;
import com.tencent.mm.protocal.c.md;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public final class e
{
  private static final a<String, e> ipZ;
  public static final android.support.v4.e.h<AppBrandSysConfig, AppBrandLaunchErrorAction> iqg;
  final String appId;
  final int eVi;
  final AppBrandLaunchReferrer hQB;
  final String hQy;
  final int hZb;
  final boolean iqa;
  volatile b iqb;
  volatile android.support.v4.e.h<AppBrandSysConfig, AppBrandLaunchErrorAction> iqc;
  final int iqd;
  final String iqe;
  final int iqf;
  volatile boolean started;
  
  static
  {
    GMTrace.i(17327911337984L, 129103);
    ipZ = new a();
    iqg = android.support.v4.e.h.f(null, null);
    GMTrace.o(17327911337984L, 129103);
  }
  
  public e(AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject, AppBrandLaunchReferrer paramAppBrandLaunchReferrer)
  {
    this(paramAppBrandInitConfig.appId, paramAppBrandInitConfig.hKs, paramAppBrandStatObject.eVi, paramAppBrandStatObject.scene, paramAppBrandInitConfig.hQy, paramAppBrandLaunchReferrer, paramAppBrandInitConfig.hzG, -1, true);
    GMTrace.i(20679864877056L, 154077);
    GMTrace.o(20679864877056L, 154077);
  }
  
  public e(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, AppBrandLaunchReferrer paramAppBrandLaunchReferrer, String paramString3, int paramInt4, boolean paramBoolean)
  {
    GMTrace.i(20679999094784L, 154078);
    this.appId = paramString1;
    this.hZb = paramInt1;
    this.eVi = paramInt2;
    this.iqd = paramInt3;
    this.hQy = paramString2;
    this.hQB = paramAppBrandLaunchReferrer;
    this.iqe = paramString3;
    this.iqf = paramInt4;
    this.iqa = paramBoolean;
    GMTrace.o(20679999094784L, 154078);
  }
  
  static e ra(String paramString)
  {
    GMTrace.i(20679730659328L, 154076);
    synchronized (ipZ)
    {
      paramString = (e)ipZ.remove(paramString);
      GMTrace.o(20679730659328L, 154076);
      return paramString;
    }
  }
  
  public final void Yn()
  {
    GMTrace.i(20680267530240L, 154080);
    if (this.started)
    {
      GMTrace.o(20680267530240L, 154080);
      return;
    }
    this.started = true;
    w.i("MicroMsg.AppBrand.AppLaunchPrepareProcess", "[applaunch] startPrepare in mm %s %d", new Object[] { this.appId, Integer.valueOf(this.hZb) });
    if (this.iqa) {}
    synchronized (ipZ)
    {
      ipZ.put(this.iqe, this);
      ??? = new a(this.iqe);
      long l = TimeUnit.SECONDS.toMillis(300L);
      ((aj)???).z(l, l);
      ??? = com.tencent.mm.sdk.f.e.SV(String.format(Locale.US, "AppLaunchPrepareProcess[%s %d]", new Object[] { this.appId, Integer.valueOf(this.hZb) }));
      ((HandlerThread)???).start();
      new ae(((HandlerThread)???).getLooper()).post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10158671396864L, 75688);
          for (;;)
          {
            try
            {
              e locale = e.this;
              localObject1 = e.this;
              localAppBrandSysConfig = q.pr(((e)localObject1).appId);
              if (localAppBrandSysConfig == null) {
                m.rb(com.tencent.mm.plugin.appbrand.o.d.e(o.i.hGk, new Object[] { "" }));
              }
              if (localAppBrandSysConfig != null) {
                continue;
              }
              w.e("MicroMsg.AppBrand.AppLaunchPrepareProcess", "get null config!!!");
              localObject1 = e.iqg;
              locale.b((android.support.v4.e.h)localObject1);
            }
            catch (Exception localException)
            {
              Object localObject1;
              AppBrandSysConfig localAppBrandSysConfig;
              com.tencent.mm.plugin.appbrand.n.d locald;
              Object localObject3;
              String str;
              Object localObject4;
              Object localObject2;
              int i;
              AppBrandLaunchErrorAction.a locala;
              w.printErrStackTrace("MicroMsg.AppBrand.AppLaunchPrepareProcess", localException, "call() exp ", new Object[0]);
              m.iU(o.i.hFw);
              e.this.b(e.iqg);
              continue;
              boolean bool = false;
              continue;
            }
            localObject1.quit();
            GMTrace.o(10158671396864L, 75688);
            return;
            locald = new com.tencent.mm.plugin.appbrand.n.d();
            localObject3 = localAppBrandSysConfig.appId;
            str = localAppBrandSysConfig.eAr;
            localObject4 = new e.2((e)localObject1, localAppBrandSysConfig.appId, ((e)localObject1).hZb, localAppBrandSysConfig.hRg.hKC, ((e)localObject1).iqd);
            localObject2 = new FutureTask((Callable)localObject4);
            com.tencent.mm.sdk.f.e.post((Runnable)localObject2, ((l)localObject4).getTag());
            localObject4 = new o((String)localObject3, ((e)localObject1).hZb, ((e)localObject1).eVi, ((e)localObject1).iqd, ((e)localObject1).hQy, ((e)localObject1).hQB, ((e)localObject1).iqe, ((e)localObject1).iqf).Yv();
            if (localObject4 == null)
            {
              w.i("MicroMsg.AppBrand.AppLaunchPrepareProcess", "fillConfig username %s, get null launchInfo", new Object[] { localAppBrandSysConfig.eAr });
              i = 0;
              if (i == 0)
              {
                w.i("MicroMsg.AppBrand.AppLaunchPrepareProcess", "fillConfig, false, username %s, appId %s", new Object[] { localAppBrandSysConfig.eAr, localAppBrandSysConfig.appId });
                localObject1 = android.support.v4.e.h.f(null, locald.iGp);
              }
            }
            else
            {
              locala = AppBrandLaunchErrorAction.CREATOR;
              localObject3 = AppBrandLaunchErrorAction.a.a((String)localObject3, ((e)localObject1).hZb, (j)localObject4);
              if (localObject3 != null)
              {
                locald.iGp = localObject3;
                i = 0;
                continue;
              }
              if ((((j)localObject4).field_jsapiInfo == null) || (((j)localObject4).field_jsapiInfo.ucU == null))
              {
                w.e("MicroMsg.AppBrand.AppLaunchPrepareProcess", "fillConfig username %s, get null jsapi_info", new Object[] { localAppBrandSysConfig.eAr });
                i = 0;
                continue;
              }
              if ((((j)localObject4).field_actionsheetInfo == null) || (!((j)localObject4).field_actionsheetInfo.tOV)) {
                continue;
              }
              bool = true;
              localAppBrandSysConfig.hQY = bool;
              localAppBrandSysConfig.hQN = new AppRuntimeApiPermissionBundle(((j)localObject4).field_jsapiInfo);
              localAppBrandSysConfig.hQO = ((j)localObject4).iql;
              localObject2 = (WxaPkgWrappingInfo)((Future)localObject2).get();
              if (localObject2 == null)
              {
                w.i("MicroMsg.AppBrand.AppLaunchPrepareProcess", "fillConfig null app pkg, username %s appId %s", new Object[] { localAppBrandSysConfig.eAr, localAppBrandSysConfig.appId });
                i = 0;
                continue;
              }
              localObject3 = localAppBrandSysConfig.hRg;
              ((WxaPkgWrappingInfo)localObject3).hKB = ((WxaPkgWrappingInfo)localObject2).hKB;
              ((WxaPkgWrappingInfo)localObject3).hKC = ((WxaPkgWrappingInfo)localObject2).hKC;
              ((WxaPkgWrappingInfo)localObject3).hKD = ((WxaPkgWrappingInfo)localObject2).hKD;
              ((WxaPkgWrappingInfo)localObject3).hKE = ((WxaPkgWrappingInfo)localObject2).hKE;
              ((WxaPkgWrappingInfo)localObject3).hKH = ((WxaPkgWrappingInfo)localObject2).hKH;
              ((WxaPkgWrappingInfo)localObject3).hKI = ((WxaPkgWrappingInfo)localObject2).hKI;
              if (localAppBrandSysConfig.hRg.hKB != 0) {
                localAppBrandSysConfig.hRg.hKC = 0;
              }
              w.i("MicroMsg.AppBrand.AppLaunchPrepareProcess", "fillConfig username %s, appId %s, app pkg %s", new Object[] { localAppBrandSysConfig.eAr, localAppBrandSysConfig.appId, localAppBrandSysConfig.hRg });
              localAppBrandSysConfig.hRh = AppBrandGlobalSystemConfig.Uu();
              com.tencent.mm.sdk.f.e.post(new e.3((e)localObject1, str), "AppLaunchPrepareProcess#ExtraWorks");
              w.i("MicroMsg.AppBrand.AppLaunchPrepareProcess", "fillConfig ok username %s, appId %s", new Object[] { localAppBrandSysConfig.eAr, localAppBrandSysConfig.appId });
              i = 1;
              continue;
            }
            w.i("MicroMsg.AppBrand.AppLaunchPrepareProcess", "prepare ok, just go weapp, username %s, appId %s", new Object[] { localAppBrandSysConfig.eAr, localAppBrandSysConfig.appId });
            localObject1 = android.support.v4.e.h.f(localAppBrandSysConfig, null);
          }
        }
      });
      GMTrace.o(20680267530240L, 154080);
      return;
    }
  }
  
  final void a(android.support.v4.e.h<AppBrandSysConfig, AppBrandLaunchErrorAction> paramh)
  {
    GMTrace.i(20680133312512L, 154079);
    this.iqc = paramh;
    if (this.iqb != null)
    {
      this.iqb.a((AppBrandSysConfig)paramh.first, (AppBrandLaunchErrorAction)paramh.second);
      ra(this.iqe);
    }
    GMTrace.o(20680133312512L, 154079);
  }
  
  public final void b(android.support.v4.e.h<AppBrandSysConfig, AppBrandLaunchErrorAction> paramh)
  {
    GMTrace.i(20680401747968L, 154081);
    w.v("MicroMsg.AppBrand.AppLaunchPrepareProcess", "[applaunch] onPrepareDone %s %d in mm process", new Object[] { this.appId, Integer.valueOf(this.hZb) });
    a(paramh);
    paramh = (AppBrandSysConfig)paramh.first;
    String str = this.appId;
    int i = this.hZb;
    int j = this.iqd;
    if (paramh != null) {}
    for (boolean bool = true;; bool = false)
    {
      LaunchBroadCast.a(str, i, j, bool);
      GMTrace.o(20680401747968L, 154081);
      return;
    }
  }
  
  private static final class a
    extends aj
  {
    public a(String paramString)
    {
      super(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(20674496167936L, 154037);
          e.ra(e.a.this);
          GMTrace.o(20674496167936L, 154037);
          return false;
        }
      }, false);
      GMTrace.i(20679596441600L, 154075);
      GMTrace.o(20679596441600L, 154075);
    }
  }
  
  static abstract interface b
  {
    public abstract void Yl();
    
    public abstract void a(AppBrandSysConfig paramAppBrandSysConfig, AppBrandLaunchErrorAction paramAppBrandLaunchErrorAction);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */