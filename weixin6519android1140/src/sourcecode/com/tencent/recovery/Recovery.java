package com.tencent.recovery;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.tencent.recovery.config.Express;
import com.tencent.recovery.crash.DefaultExceptionHandler;
import com.tencent.recovery.handler.RecoveryMessageHandler;
import com.tencent.recovery.log.RecoveryFileLog;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.model.RecoveryStatusItem;
import com.tencent.recovery.option.CommonOptions;
import com.tencent.recovery.option.OptionFactory;
import com.tencent.recovery.option.ProcessOptions;
import com.tencent.recovery.service.RecoveryReportService;
import com.tencent.recovery.util.Util;
import java.util.ArrayList;

public class Recovery
{
  private static Application application;
  public static Context context;
  public static RecoveryMessageHandler xPk;
  public static long xPl;
  private static CommonOptions xPm;
  public static String xPn;
  private static boolean xPo = false;
  public static boolean xPp = false;
  public static int xPq = 0;
  private static Application.ActivityLifecycleCallbacks xPr = new Application.ActivityLifecycleCallbacks()
  {
    public final void onActivityCreated(Activity paramAnonymousActivity, Bundle paramAnonymousBundle)
    {
      if (Recovery.xPp) {}
      while (Recovery.xPk.hasMessages(3)) {
        return;
      }
      Recovery.xPk.removeCallbacksAndMessages(null);
      paramAnonymousActivity = Util.fQ(Recovery.context);
      paramAnonymousBundle = Recovery.context.getSharedPreferences(Recovery.xPn, 0).edit();
      paramAnonymousBundle.putInt("KeyComponentOnCreateForeground", 1);
      paramAnonymousBundle.putInt("KeyComponentOnCreateExceptionType", 4096);
      paramAnonymousBundle.apply();
      paramAnonymousBundle = OptionFactory.jdMethod_do(paramAnonymousActivity, 1);
      Recovery.xPk.sendEmptyMessageDelayed(3, paramAnonymousBundle.itI);
      RecoveryLog.i("Recovery", "%s markActivityOnCreated %s", new Object[] { paramAnonymousActivity, Long.valueOf(System.currentTimeMillis() - Recovery.xPl) });
    }
    
    public final void onActivityDestroyed(Activity paramAnonymousActivity) {}
    
    public final void onActivityPaused(Activity paramAnonymousActivity) {}
    
    public final void onActivityResumed(Activity paramAnonymousActivity) {}
    
    public final void onActivitySaveInstanceState(Activity paramAnonymousActivity, Bundle paramAnonymousBundle) {}
    
    public final void onActivityStarted(Activity paramAnonymousActivity)
    {
      Recovery.xPq += 1;
    }
    
    public final void onActivityStopped(Activity paramAnonymousActivity)
    {
      int i = Recovery.xPq - 1;
      Recovery.xPq = i;
      if (i == 0)
      {
        RecoveryLog.i("Recovery", "%s onActivityStopped: activityForegroundCount is 0", new Object[] { Util.fQ(Recovery.context) });
        Recovery.EW(16);
      }
    }
  };
  
  public static void EW(int paramInt)
  {
    if (context == null) {}
    while (xPp) {
      return;
    }
    cnh();
    Object localObject = Util.fQ(context);
    SharedPreferences localSharedPreferences = context.getSharedPreferences(xPn, 0);
    RecoveryLog.i("Recovery", "%s Recovery.normal %s %d", new Object[] { localObject, Integer.toHexString(paramInt), Long.valueOf(System.currentTimeMillis() - xPl) });
    xPk.removeCallbacksAndMessages(null);
    localObject = localSharedPreferences.edit();
    ((SharedPreferences.Editor)localObject).remove("KeyComponentOnCreateExceptionType");
    ((SharedPreferences.Editor)localObject).putInt("KeyComponentOnCreateNormalType", paramInt);
    ((SharedPreferences.Editor)localObject).apply();
    destroy();
  }
  
  public static void a(Application paramApplication, Context paramContext)
  {
    application = paramApplication;
    context = paramContext;
    xPm = OptionFactory.fN(paramContext);
    if (application != null) {
      application.registerActivityLifecycleCallbacks(xPr);
    }
    String str = Util.fQ(paramContext);
    if (RecoveryLogic.fM(paramContext))
    {
      if (xPm.xPN) {
        RecoveryLog.Kl();
      }
      RecoveryLog.a(new RecoveryFileLog(context));
      cnh();
      RecoveryLog.i("Recovery", "recovery process, no need to do any thing", new Object[0]);
      return;
    }
    RecoveryLog.i("Recovery", "%s attachBaseContext start ============================== %d", new Object[] { str, Long.valueOf(System.currentTimeMillis() - xPl) });
    xPn = "recovery-" + str;
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(xPn, 0);
    Object localObject2 = localSharedPreferences.getString("KeyRecoveryVersion", "");
    Object localObject1 = localSharedPreferences.edit();
    paramApplication = (Application)localObject1;
    if (!((String)localObject2).equals(xPm.clientVersion))
    {
      ((SharedPreferences.Editor)localObject1).clear();
      ((SharedPreferences.Editor)localObject1).putString("KeyRecoveryVersion", xPm.clientVersion);
      ((SharedPreferences.Editor)localObject1).apply();
      RecoveryLog.i("Recovery", "recovery sp version not equal lastVersion %s currentVersion %s", new Object[] { localObject2, xPm.clientVersion });
      paramApplication = localSharedPreferences.edit();
    }
    localObject1 = new RecoveryContext();
    ((RecoveryContext)localObject1).f(localSharedPreferences);
    localObject2 = new RecoveryStatusItem();
    ((RecoveryStatusItem)localObject2).processName = str;
    ((RecoveryStatusItem)localObject2).clientVersion = xPm.clientVersion;
    ((RecoveryStatusItem)localObject2).lOv = xPm.lOv;
    ((RecoveryStatusItem)localObject2).timestamp = System.currentTimeMillis();
    int i;
    if (localSharedPreferences.contains("KeyAppOnCreateExceptionType"))
    {
      RecoveryLog.i("Recovery", "contains KeyAppOnCreateExceptionType", new Object[0]);
      ((RecoveryStatusItem)localObject2).xPu = localSharedPreferences.getInt("KeyAppOnCreateForeground", 17);
      ((RecoveryStatusItem)localObject2).xPx = localSharedPreferences.getInt("KeyAppOnCreateExceptionType", 4096);
      ((RecoveryStatusItem)localObject2).xPw = 1;
      switch (((RecoveryStatusItem)localObject2).xPx)
      {
      default: 
        i = 0;
        label402:
        if (i != 0)
        {
          if (((RecoveryContext)localObject1).xPs.size() > 15) {
            ((RecoveryContext)localObject1).xPs.remove(0);
          }
          ((RecoveryContext)localObject1).xPs.add(localObject2);
          RecoveryLogic.a(paramContext, (RecoveryStatusItem)localObject2, RecoveryReportService.class.getName());
        }
        paramApplication.remove("KeyAppOnCreateForeground");
        paramApplication.remove("KeyAppOnCreateExceptionType");
        paramApplication.remove("KeyAppOnCreateNormalType");
        paramApplication.remove("KeyComponentOnCreateForeground");
        paramApplication.remove("KeyComponentOnCreateExceptionType");
        paramApplication.remove("KeyComponentOnCreateNormalType");
        i = RecoveryLogic.bs(paramContext, str);
        RecoveryLog.i("Recovery", "processStartFlag %s %s", new Object[] { str, Integer.toHexString(i) });
        if (OptionFactory.jdMethod_do(str, i).xPR.dg(((RecoveryContext)localObject1).xPs))
        {
          RecoveryLogic.a(paramContext, xPm, (RecoveryContext)localObject1);
          ((RecoveryContext)localObject1).clear();
          cnh();
        }
        break;
      }
    }
    for (;;)
    {
      ((RecoveryContext)localObject1).a(paramApplication);
      paramApplication.apply();
      RecoveryLog.i("Recovery", "%s attachBaseContext end ============================== %d", new Object[] { str, Long.valueOf(System.currentTimeMillis() - xPl) });
      return;
      if (localSharedPreferences.contains("KeyComponentOnCreateExceptionType"))
      {
        RecoveryLog.i("Recovery", "contains KeyComponentOnCreateExceptionType", new Object[0]);
        ((RecoveryStatusItem)localObject2).xPu = localSharedPreferences.getInt("KeyAppOnCreateForeground", 17);
        ((RecoveryStatusItem)localObject2).xPx = localSharedPreferences.getInt("KeyComponentOnCreateExceptionType", 4096);
        ((RecoveryStatusItem)localObject2).xPw = 16;
        break;
      }
      ((RecoveryContext)localObject1).clear();
      if (localSharedPreferences.contains("KeyAppOnCreateNormalType"))
      {
        if (localSharedPreferences.contains("KeyComponentOnCreateNormalType"))
        {
          RecoveryLog.i("Recovery", "contains KeyComponentOnCreateNormalType", new Object[0]);
          ((RecoveryStatusItem)localObject2).xPu = localSharedPreferences.getInt("KeyAppOnCreateForeground", 17);
          ((RecoveryStatusItem)localObject2).xPx = localSharedPreferences.getInt("KeyComponentOnCreateNormalType", 273);
          ((RecoveryStatusItem)localObject2).xPw = 16;
          break;
        }
        RecoveryLog.i("Recovery", "contains KeyAppOnCreateNormalType", new Object[0]);
        ((RecoveryStatusItem)localObject2).xPu = localSharedPreferences.getInt("KeyAppOnCreateForeground", 17);
        ((RecoveryStatusItem)localObject2).xPx = localSharedPreferences.getInt("KeyAppOnCreateNormalType", 273);
        ((RecoveryStatusItem)localObject2).xPw = 1;
        break;
      }
      RecoveryLog.i("Recovery", "DefaultNormal", new Object[0]);
      ((RecoveryStatusItem)localObject2).xPu = 17;
      ((RecoveryStatusItem)localObject2).xPx = 273;
      ((RecoveryStatusItem)localObject2).xPw = 1;
      break;
      i = 1;
      break label402;
      paramApplication.putInt("KeyAppOnCreateForeground", i);
      paramApplication.putInt("KeyComponentOnCreateForeground", i);
      paramApplication.putInt("KeyAppOnCreateExceptionType", 4096);
    }
  }
  
  public static void cne()
  {
    if (xPp) {}
    while (xPo) {
      return;
    }
    xPo = true;
    Object localObject = Util.fQ(context);
    int i = RecoveryLogic.bs(context, (String)localObject);
    RecoveryLog.i("Recovery", "%s markApplicationOnCreateNormal %d", new Object[] { localObject, Long.valueOf(System.currentTimeMillis() - xPl) });
    SharedPreferences.Editor localEditor = context.getSharedPreferences(xPn, 0).edit();
    localEditor.remove("KeyAppOnCreateExceptionType");
    localEditor.putInt("KeyAppOnCreateNormalType", 256);
    if (RecoveryLogic.bs(context, (String)localObject) == 16)
    {
      localEditor.putInt("KeyComponentOnCreateForeground", i);
      localEditor.putInt("KeyComponentOnCreateExceptionType", 4096);
      localObject = OptionFactory.jdMethod_do((String)localObject, i);
      xPk.sendEmptyMessageDelayed(2, ((ProcessOptions)localObject).itI);
    }
    localEditor.apply();
  }
  
  public static void cnf()
  {
    if (context == null) {}
    while (xPp) {
      return;
    }
    cnh();
    RecoveryLog.i("Recovery", "%s Recovery.crash %d", new Object[] { Util.fQ(context), Long.valueOf(System.currentTimeMillis() - xPl) });
    SharedPreferences.Editor localEditor = context.getSharedPreferences(xPn, 0).edit();
    if (xPo) {
      localEditor.putInt("KeyComponentOnCreateExceptionType", 65536);
    }
    for (;;)
    {
      localEditor.apply();
      destroy();
      return;
      localEditor.putInt("KeyAppOnCreateExceptionType", 65536);
    }
  }
  
  public static void cng()
  {
    if (context == null) {}
    while (xPp) {
      return;
    }
    cnh();
    RecoveryLog.i("Recovery", "%s Recovery.anr %d", new Object[] { Util.fQ(context), Long.valueOf(System.currentTimeMillis() - xPl) });
    SharedPreferences.Editor localEditor = context.getSharedPreferences(xPn, 0).edit();
    if (xPo) {
      localEditor.putInt("KeyComponentOnCreateExceptionType", 1048576);
    }
    for (;;)
    {
      localEditor.apply();
      destroy();
      return;
      localEditor.putInt("KeyAppOnCreateExceptionType", 1048576);
    }
  }
  
  private static void cnh()
  {
    if (context == null) {}
    while (xPp) {
      return;
    }
    RecoveryLog.i("Recovery", "%s markFinalStatus", new Object[] { Util.fQ(context) });
    xPp = true;
  }
  
  private static void destroy()
  {
    if (application != null) {
      application.unregisterActivityLifecycleCallbacks(xPr);
    }
  }
  
  public static void eE()
  {
    RecoveryLog.i("Recovery", "initStatic Run", new Object[0]);
    Thread.setDefaultUncaughtExceptionHandler(new DefaultExceptionHandler(Thread.getDefaultUncaughtExceptionHandler()));
    try
    {
      System.loadLibrary("recovery");
      xPl = System.currentTimeMillis();
      xPk = new RecoveryMessageHandler();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        RecoveryLog.printErrStackTrace("Recovery", localException, "load recovery library", new Object[0]);
      }
    }
  }
  
  public static Context getContext()
  {
    return context;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\Recovery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */