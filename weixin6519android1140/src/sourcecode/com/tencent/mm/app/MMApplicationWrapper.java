package com.tencent.mm.app;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.booter.c;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.f.2;
import com.tencent.mm.kernel.b.f.3;
import com.tencent.mm.kernel.b.f.4;
import com.tencent.mm.kernel.b.f.5;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.tinker.loader.app.ApplicationLifeCycle;

public class MMApplicationWrapper
  implements ApplicationLifeCycle
{
  private static final String TAG = "MicroMsg.MMApplicationWrapper";
  public Application app;
  private final MMApplicationLike lifeCycle;
  private f profile;
  private String thisProcess;
  
  public MMApplicationWrapper(MMApplicationLike paramMMApplicationLike, String paramString)
  {
    GMTrace.i(14280497823744L, 106398);
    this.thisProcess = "";
    this.profile = null;
    this.app = paramMMApplicationLike.getApplication();
    this.lifeCycle = paramMMApplicationLike;
    this.thisProcess = paramString;
    GMTrace.o(14280497823744L, 106398);
  }
  
  private void setupXLogDebugger(f paramf)
  {
    GMTrace.i(19122133925888L, 142471);
    c localc = paramf.fJG;
    if (paramf.eR(""))
    {
      localc.dl("MM");
      GMTrace.o(19122133925888L, 142471);
      return;
    }
    if (paramf.eR(":push"))
    {
      localc.dl("PUSH");
      GMTrace.o(19122133925888L, 142471);
      return;
    }
    if (paramf.eR(":tools"))
    {
      localc.dl("TOOL");
      GMTrace.o(19122133925888L, 142471);
      return;
    }
    if (paramf.eR(":sandbox"))
    {
      localc.dl("SANDBOX");
      GMTrace.o(19122133925888L, 142471);
      return;
    }
    if (paramf.eR(":exdevice"))
    {
      localc.dl("EXDEVICE");
      GMTrace.o(19122133925888L, 142471);
      return;
    }
    if (paramf.eR(":patch"))
    {
      localc.dl("PATCH");
      GMTrace.o(19122133925888L, 142471);
      return;
    }
    if (paramf.eR(":appbrand"))
    {
      localc.dl("APPBRAND");
      GMTrace.o(19122133925888L, 142471);
      return;
    }
    if (paramf.eR(":TMAssistantDownloadSDKService"))
    {
      localc.dl("TMSDK");
      GMTrace.o(19122133925888L, 142471);
      return;
    }
    if (paramf.eR(":dexopt")) {
      localc.dl("DEXOPT");
    }
    GMTrace.o(19122133925888L, 142471);
  }
  
  public void onBaseContextAttached(Context paramContext)
  {
    GMTrace.i(14280632041472L, 106399);
    this.profile = new f(this.thisProcess, this.app, this.lifeCycle);
    l.pk();
    k.b("stlport_shared", paramContext.getClassLoader());
    k.b(com.tencent.mm.sdk.a.vgN, paramContext.getClassLoader());
    this.profile.fJG = c.av(this.profile.gap);
    setupXLogDebugger(this.profile);
    com.tencent.mm.splash.a.e(this.app);
    if (!l.bD(this.thisProcess))
    {
      o.a(this.profile);
      o.a(this.app, this.thisProcess, "com.tencent.mm.app.WeChatSplashStartup");
      GMTrace.o(14280632041472L, 106399);
      return;
    }
    w.i("MicroMsg.MMApplicationWrapper", "is plain process. load nothing");
    o.a(this.profile);
    o.pn();
    GMTrace.o(14280632041472L, 106399);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(14281034694656L, 106402);
    if (this.profile != null)
    {
      f localf = this.profile;
      localf.gar.a(new f.5(localf, paramConfiguration));
    }
    GMTrace.o(14281034694656L, 106402);
  }
  
  public void onCreate()
  {
    GMTrace.i(14280766259200L, 106400);
    o.pp();
    GMTrace.o(14280766259200L, 106400);
  }
  
  public void onLowMemory()
  {
    GMTrace.i(14281168912384L, 106403);
    if (this.profile != null)
    {
      f localf = this.profile;
      localf.gar.a(new f.2(localf));
    }
    GMTrace.o(14281168912384L, 106403);
  }
  
  public void onTerminate()
  {
    GMTrace.i(14280900476928L, 106401);
    if (this.profile != null)
    {
      f localf = this.profile;
      localf.gar.a(new f.4(localf));
    }
    GMTrace.o(14280900476928L, 106401);
  }
  
  public void onTrimMemory(int paramInt)
  {
    GMTrace.i(14281303130112L, 106404);
    if (this.profile != null)
    {
      f localf = this.profile;
      localf.gar.a(new f.3(localf, paramInt));
    }
    GMTrace.o(14281303130112L, 106404);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\MMApplicationWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */