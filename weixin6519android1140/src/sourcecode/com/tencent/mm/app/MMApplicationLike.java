package com.tencent.mm.app;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.loader.stub.BaseBuildInfo;
import com.tencent.mm.loader.stub.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ai;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.app.ApplicationLifeCycle;
import com.tencent.tinker.loader.app.ApplicationLike;
import com.tencent.tinker.loader.app.DefaultApplicationLike;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import java.lang.reflect.Constructor;
import java.util.HashMap;

public class MMApplicationLike
  extends DefaultApplicationLike
{
  private static final String NO_SPACE_FOR_DEX_PROCESS = ":nospace";
  private static final String TAG = "MicroMsg.MMApplication";
  public static MMApplicationLike applicationLike;
  public static String hash;
  public static long sAppStartTime;
  public long mGetRevTime;
  public String mNewVersionCode;
  public String mOldVersionCode;
  public long mSetRevTime;
  private ApplicationLifeCycle wrapper;
  
  static
  {
    GMTrace.i(14014075633664L, 104413);
    hash = "";
    GMTrace.o(14014075633664L, 104413);
  }
  
  public MMApplicationLike(Application paramApplication, int paramInt, boolean paramBoolean, long paramLong1, long paramLong2, Intent paramIntent)
  {
    super(paramApplication, paramInt, paramBoolean, paramLong1, paramLong2, paramIntent);
    GMTrace.i(14012733456384L, 104403);
    GMTrace.o(14012733456384L, 104403);
  }
  
  private void clearOldDirIfNewVersion()
  {
    GMTrace.i(14013136109568L, 104406);
    long l1 = System.currentTimeMillis();
    com.tencent.mm.sdk.e.a locala = new com.tencent.mm.sdk.e.a(com.tencent.mm.loader.stub.a.ghv + "NowRev.ini");
    this.mOldVersionCode = locala.getValue("NowRev");
    this.mNewVersionCode = BaseBuildInfo.baseRevision();
    long l2 = System.currentTimeMillis();
    this.mGetRevTime = (l2 - l1);
    this.mSetRevTime = 0L;
    if (!this.mNewVersionCode.equals(this.mOldVersionCode))
    {
      ab.vin = true;
      com.tencent.mm.loader.stub.b.g(getApplication().getDir("lib", 0));
      com.tencent.mm.loader.stub.b.g(getApplication().getDir("dex", 0));
      com.tencent.mm.loader.stub.b.g(getApplication().getDir("cache", 0));
      com.tencent.mm.loader.stub.b.g(getApplication().getDir("recover_lib", 0));
      com.tencent.tinker.lib.d.b.d(applicationLike);
      locala.eX("NowRev", this.mNewVersionCode);
      this.mSetRevTime = (System.currentTimeMillis() - l2);
      w.w("MicroMsg.MMApplication", "application hash:%s, %s", new Object[] { hash, new ah().toString() });
    }
    w.i("MicroMsg.MMApplication", "clearOldDirIfNewVersion oldversion:%s, newversion:%s, gettime:%d, settime:%d", new Object[] { this.mOldVersionCode, this.mNewVersionCode, Long.valueOf(this.mGetRevTime), Long.valueOf(this.mSetRevTime) });
    GMTrace.o(14013136109568L, 104406);
  }
  
  public static ApplicationLike getTinkerApplicationLike()
  {
    GMTrace.i(14012599238656L, 104402);
    MMApplicationLike localMMApplicationLike = applicationLike;
    GMTrace.o(14012599238656L, 104402);
    return localMMApplicationLike;
  }
  
  private void setPatchRev(ApplicationLike paramApplicationLike)
  {
    GMTrace.i(14012867674112L, 104404);
    if (paramApplicationLike == null)
    {
      GMTrace.o(14012867674112L, 104404);
      return;
    }
    if ((paramApplicationLike == null) || (paramApplicationLike.getApplication() == null)) {
      throw new TinkerRuntimeException("tinkerApplication is null");
    }
    paramApplicationLike = paramApplicationLike.getTinkerResultIntent();
    if ((paramApplicationLike != null) && (ShareIntentUtil.ar(paramApplicationLike) == 0)) {}
    for (paramApplicationLike = ShareIntentUtil.ax(paramApplicationLike);; paramApplicationLike = null)
    {
      if (paramApplicationLike != null)
      {
        BaseBuildInfo.PATCH_REV = (String)paramApplicationLike.get("patch.rev");
        w.w("MicroMsg.MMApplication", "application set patch rev:%s", new Object[] { BaseBuildInfo.PATCH_REV });
      }
      GMTrace.o(14012867674112L, 104404);
      return;
    }
  }
  
  public Resources getResources(Resources paramResources)
  {
    GMTrace.i(14013672980480L, 104410);
    if (ab.getResources() == null)
    {
      GMTrace.o(14013672980480L, 104410);
      return paramResources;
    }
    paramResources = ab.getResources();
    GMTrace.o(14013672980480L, 104410);
    return paramResources;
  }
  
  public void onBaseContextAttached(Context paramContext)
  {
    GMTrace.i(14013001891840L, 104405);
    super.onBaseContextAttached(paramContext);
    sAppStartTime = getApplicationStartMillisTime();
    applicationLike = this;
    setPatchRev(applicationLike);
    hash = hash + "/" + hashCode();
    ab.kE(false);
    ab.setContext(getApplication());
    String str = d.r(paramContext, Process.myPid());
    w.Al(0);
    Application localApplication = getApplication();
    if (!"com.tencent.mm:cuploader".equals(str))
    {
      ai.a(new h.1(localApplication, str));
      ai.a(new h.2());
    }
    str.endsWith(":nospace");
    clearOldDirIfNewVersion();
    try
    {
      this.wrapper = ((ApplicationLifeCycle)Class.forName(ab.getPackageName() + ".app.MMApplicationWrapper").getConstructor(new Class[] { MMApplicationLike.class, String.class }).newInstance(new Object[] { this, str }));
      this.wrapper.onBaseContextAttached(paramContext);
      GMTrace.o(14013001891840L, 104405);
      return;
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.MMApplication", paramContext, "failed to create application wrapper class", new Object[0]);
      throw new RuntimeException("failed to create application wrapper class", paramContext);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(14013538762752L, 104409);
    w.d("MicroMsg.MMApplication", "configuration changed");
    super.onConfigurationChanged(paramConfiguration);
    if (this.wrapper != null) {
      this.wrapper.onConfigurationChanged(paramConfiguration);
    }
    GMTrace.o(14013538762752L, 104409);
  }
  
  public void onCreate()
  {
    GMTrace.i(14013270327296L, 104407);
    if (this.wrapper != null) {
      this.wrapper.onCreate();
    }
    GMTrace.o(14013270327296L, 104407);
  }
  
  public void onLowMemory()
  {
    GMTrace.i(14013807198208L, 104411);
    super.onLowMemory();
    if (this.wrapper != null) {
      this.wrapper.onLowMemory();
    }
    GMTrace.o(14013807198208L, 104411);
  }
  
  public void onTerminate()
  {
    GMTrace.i(14013404545024L, 104408);
    super.onTerminate();
    if (this.wrapper != null) {
      this.wrapper.onTerminate();
    }
    GMTrace.o(14013404545024L, 104408);
  }
  
  public void onTrimMemory(int paramInt)
  {
    GMTrace.i(14013941415936L, 104412);
    super.onTrimMemory(paramInt);
    if (this.wrapper != null) {
      this.wrapper.onTrimMemory(paramInt);
    }
    GMTrace.o(14013941415936L, 104412);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\MMApplicationLike.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */