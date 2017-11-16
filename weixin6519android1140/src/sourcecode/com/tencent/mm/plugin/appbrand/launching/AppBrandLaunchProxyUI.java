package com.tencent.mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.r;
import java.util.Map;

@com.tencent.mm.ui.base.a(7)
public final class AppBrandLaunchProxyUI
  extends MMBaseActivity
{
  private static boolean ipq;
  private static long ipr;
  private static AppBrandLaunchProxyUI ips;
  private static Runnable ipw;
  private static int mState;
  int hWK;
  private r ipt;
  MMActivity.a vKC;
  
  static
  {
    GMTrace.i(20673422426112L, 154029);
    mState = -1;
    ipq = false;
    ipr = 0L;
    GMTrace.o(20673422426112L, 154029);
  }
  
  public AppBrandLaunchProxyUI()
  {
    GMTrace.i(14430016372736L, 107512);
    this.hWK = 0;
    this.vKC = null;
    GMTrace.o(14430016372736L, 107512);
  }
  
  private static boolean Yh()
  {
    GMTrace.i(20672348684288L, 154021);
    label50:
    for (;;)
    {
      try
      {
        if (!Yi()) {
          if (ipq)
          {
            break label50;
            GMTrace.o(20672348684288L, 154021);
            return bool;
          }
          else
          {
            bool = false;
            continue;
          }
        }
        boolean bool = true;
      }
      finally {}
    }
  }
  
  /* Error */
  private static boolean Yi()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: ldc2_w 79
    //   5: ldc 81
    //   7: invokestatic 50	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: ldc 2
    //   12: monitorenter
    //   13: iload_1
    //   14: istore_0
    //   15: getstatic 52	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:mState	I
    //   18: iconst_1
    //   19: if_icmpeq +12 -> 31
    //   22: getstatic 52	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:mState	I
    //   25: iconst_2
    //   26: if_icmpne +18 -> 44
    //   29: iload_1
    //   30: istore_0
    //   31: ldc 2
    //   33: monitorexit
    //   34: ldc2_w 79
    //   37: ldc 81
    //   39: invokestatic 59	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   42: iload_0
    //   43: ireturn
    //   44: iconst_0
    //   45: istore_0
    //   46: goto -15 -> 31
    //   49: astore_2
    //   50: ldc 2
    //   52: monitorexit
    //   53: aload_2
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   14	32	0	bool1	boolean
    //   1	29	1	bool2	boolean
    //   49	5	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   15	29	49	finally
    //   31	34	49	finally
    //   50	53	49	finally
  }
  
  private static void a(Context paramContext, String paramString1, AppBrandInitConfig paramAppBrandInitConfig, String arg3, AppBrandStatObject paramAppBrandStatObject, AppBrandLaunchReferrer paramAppBrandLaunchReferrer, LaunchParamsOptional paramLaunchParamsOptional)
  {
    Object localObject = null;
    GMTrace.i(20672885555200L, 154025);
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ab.getContext();
    }
    paramAppBrandInitConfig.startTime = bg.Pv();
    paramAppBrandInitConfig.hQy = com.tencent.mm.plugin.appbrand.appcache.a.oj(???);
    paramAppBrandInitConfig.hQB.a(paramAppBrandLaunchReferrer);
    if (paramLaunchParamsOptional == null)
    {
      paramContext = null;
      paramAppBrandInitConfig.gqY = paramContext;
      if (paramLaunchParamsOptional != null) {
        break label160;
      }
    }
    label160:
    for (paramContext = (Context)localObject;; paramContext = paramLaunchParamsOptional.gqZ)
    {
      paramAppBrandInitConfig.gqZ = paramContext;
      b.c(paramAppBrandInitConfig, paramAppBrandStatObject);
      int i = com.tencent.mm.plugin.appbrand.task.d.a(localContext, paramAppBrandInitConfig, paramAppBrandStatObject);
      w.i("MicroMsg.AppBrandLaunchProxyUI", "[applaunch] startAppOnInitConfigGot %s", new Object[] { paramAppBrandInitConfig });
      if (i == 1) {
        new e(paramAppBrandInitConfig, paramAppBrandStatObject, paramAppBrandLaunchReferrer).Yn();
      }
      paramContext = com.tencent.mm.plugin.appbrand.config.e.Ux();
      if ((paramAppBrandInitConfig != null) && (!bg.nm(paramAppBrandInitConfig.appId))) {
        break label169;
      }
      GMTrace.o(20672885555200L, 154025);
      return;
      paramContext = paramLaunchParamsOptional.gqY;
      break;
    }
    label169:
    synchronized (paramContext.hQD)
    {
      paramContext.hQD.put(paramAppBrandInitConfig.appId, paramAppBrandInitConfig);
      if (bg.nm(paramString1)) {
        break label243;
      }
    }
    synchronized (paramContext.hQE)
    {
      paramContext.hQE.put(paramString1, paramAppBrandInitConfig.appId);
      GMTrace.o(20672885555200L, 154025);
      return;
      paramContext = finally;
      throw paramContext;
    }
    label243:
    GMTrace.o(20672885555200L, 154025);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2, AppBrandStatObject paramAppBrandStatObject, LaunchParamsOptional paramLaunchParamsOptional)
  {
    GMTrace.i(15440004775936L, 115037);
    a(paramContext, paramString1, null, paramString2, paramInt1, paramInt2, paramAppBrandStatObject, null, paramLaunchParamsOptional);
    GMTrace.o(15440004775936L, 115037);
  }
  
  private static void a(AppBrandInitConfig paramAppBrandInitConfig, Context paramContext)
  {
    GMTrace.i(20349420830720L, 151615);
    if ((paramContext instanceof AppBrandLaunchProxyUI))
    {
      paramContext = ((AppBrandLaunchProxyUI)paramContext).getIntent().getStringExtra("launch_source_context");
      if ((!paramContext.contains("WebView")) && (!qZ(paramContext).contains(":tools"))) {
        break label76;
      }
    }
    label76:
    for (boolean bool = true;; bool = false)
    {
      paramAppBrandInitConfig.hQx = bool;
      GMTrace.o(20349420830720L, 151615);
      return;
      paramContext = paramContext.getClass().getName();
      break;
    }
  }
  
  public static boolean a(final Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, AppBrandStatObject paramAppBrandStatObject, AppBrandLaunchReferrer paramAppBrandLaunchReferrer, LaunchParamsOptional paramLaunchParamsOptional)
  {
    GMTrace.i(15440138993664L, 115038);
    if (!ab.bPY())
    {
      if (ab.bQc())
      {
        paramContext = new LaunchParcel();
        paramContext.username = paramString1;
        paramContext.appId = paramString2;
        paramContext.hQy = paramString3;
        paramContext.hZb = paramInt1;
        paramContext.version = paramInt2;
        paramContext.ipx = paramAppBrandStatObject;
        paramContext.hQB = paramAppBrandLaunchReferrer;
        paramContext.ipy = paramLaunchParamsOptional;
        paramContext = (IPCBoolean)XIPCInvoker.a("com.tencent.mm", paramContext, g.a.class);
        if ((paramContext != null) && (paramContext.value))
        {
          GMTrace.o(15440138993664L, 115038);
          return true;
        }
      }
      GMTrace.o(15440138993664L, 115038);
      return false;
    }
    if (System.currentTimeMillis() - ipr < 200L)
    {
      w.i("MicroMsg.AppBrandLaunchProxyUI", "start in 200 ms, just return");
      GMTrace.o(15440138993664L, 115038);
      return false;
    }
    ipr = bg.Pv();
    w.v("MicroMsg.AppBrandLaunchProxyUI", "[applaunch] start entered %s %d", new Object[] { paramString2, Integer.valueOf(paramInt1) });
    try
    {
      ipq = false;
      ipw = null;
      mState = -1;
      if ((bg.nm(paramString1)) && (bg.nm(paramString2)))
      {
        GMTrace.o(15440138993664L, 115038);
        return false;
      }
    }
    finally {}
    if (paramContext == null) {
      paramContext = ab.getContext();
    }
    for (;;)
    {
      String str = paramString2;
      if (bg.nm(paramString2)) {
        str = com.tencent.mm.plugin.appbrand.config.e.Ux().pi(paramString1);
      }
      if ((!bg.nm(str)) && (paramInt1 != 2) && (com.tencent.mm.plugin.appbrand.task.d.sn(str)))
      {
        paramString2 = com.tencent.mm.plugin.appbrand.config.e.Ux().pk(str);
        if ((paramString2 != null) && (paramString2.hKs == paramInt1))
        {
          paramString2.hQA = false;
          a(paramString2, paramContext);
          a(paramContext, paramString1, paramString2, paramString3, paramAppBrandStatObject, paramAppBrandLaunchReferrer, paramLaunchParamsOptional);
          GMTrace.o(15440138993664L, 115038);
          return true;
        }
      }
      LaunchParcel localLaunchParcel = new LaunchParcel();
      localLaunchParcel.username = paramString1;
      localLaunchParcel.appId = str;
      if (paramString3 == null) {}
      for (paramString2 = null;; paramString2 = paramString3.trim())
      {
        localLaunchParcel.hQy = paramString2;
        localLaunchParcel.hZb = paramInt1;
        localLaunchParcel.version = paramInt2;
        localLaunchParcel.ipx = paramAppBrandStatObject;
        localLaunchParcel.hQB = paramAppBrandLaunchReferrer;
        localLaunchParcel.ipy = paramLaunchParamsOptional;
        paramString2 = new Intent(paramContext, AppBrandLaunchProxyUI.class);
        if (!(paramContext instanceof Activity)) {
          paramString2.addFlags(268435456);
        }
        com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(21033528590336L, 156712);
            com.tencent.mm.plugin.appbrand.o.d.aby();
            new c(this.yvb, new c.a()
            {
              /* Error */
              public final void b(final AppBrandInitConfig paramAnonymous2AppBrandInitConfig, final AppBrandStatObject paramAnonymous2AppBrandStatObject)
              {
                // Byte code:
                //   0: ldc2_w 39
                //   3: ldc 41
                //   5: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
                //   8: invokestatic 47	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:ey	()Z
                //   11: ifeq +12 -> 23
                //   14: ldc2_w 39
                //   17: ldc 41
                //   19: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
                //   22: return
                //   23: aload_1
                //   24: ifnonnull +15 -> 39
                //   27: invokestatic 50	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:bbV	()V
                //   30: ldc2_w 39
                //   33: ldc 41
                //   35: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
                //   38: return
                //   39: aload_1
                //   40: aload_0
                //   41: getfield 21	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$3$1:yvc	Lcom/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$3;
                //   44: getfield 54	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$3:val$context	Landroid/content/Context;
                //   47: invokestatic 57	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:b	(Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfig;Landroid/content/Context;)V
                //   50: new 13	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$3$1$1
                //   53: dup
                //   54: aload_0
                //   55: aload_1
                //   56: invokespecial 60	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$3$1$1:<init>	(Lcom/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$3$1;Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfig;)V
                //   59: astore_2
                //   60: aload_1
                //   61: getfield 66	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfig:hQx	Z
                //   64: ifne +13 -> 77
                //   67: aload_1
                //   68: getfield 70	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfig:appId	Ljava/lang/String;
                //   71: invokestatic 76	com/tencent/mm/plugin/appbrand/task/d:sn	(Ljava/lang/String;)Z
                //   74: ifeq +18 -> 92
                //   77: aload_2
                //   78: invokeinterface 79 1 0
                //   83: ldc2_w 39
                //   86: ldc 41
                //   88: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
                //   91: return
                //   92: ldc 43
                //   94: monitorenter
                //   95: invokestatic 83	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:Yk	()Lcom/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI;
                //   98: ifnull +35 -> 133
                //   101: aconst_null
                //   102: invokestatic 87	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:aa	(Ljava/lang/Runnable;)Ljava/lang/Runnable;
                //   105: pop
                //   106: new 15	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$3$1$2
                //   109: dup
                //   110: aload_0
                //   111: aload_2
                //   112: invokespecial 90	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$3$1$2:<init>	(Lcom/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$3$1;Ljava/lang/Runnable;)V
                //   115: invokestatic 83	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:Yk	()Lcom/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI;
                //   118: invokevirtual 94	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$3$1$2:a	(Lcom/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI;)V
                //   121: ldc 43
                //   123: monitorexit
                //   124: ldc2_w 39
                //   127: ldc 41
                //   129: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
                //   132: return
                //   133: aload_2
                //   134: invokestatic 87	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:aa	(Ljava/lang/Runnable;)Ljava/lang/Runnable;
                //   137: pop
                //   138: goto -17 -> 121
                //   141: astore_1
                //   142: ldc 43
                //   144: monitorexit
                //   145: aload_1
                //   146: athrow
                // Local variable table:
                //   start	length	slot	name	signature
                //   0	147	0	this	1
                //   0	147	1	paramAnonymous2AppBrandInitConfig	AppBrandInitConfig
                //   0	147	2	paramAnonymous2AppBrandStatObject	AppBrandStatObject
                // Exception table:
                //   from	to	target	type
                //   95	121	141	finally
                //   121	124	141	finally
                //   133	138	141	finally
                //   142	145	141	finally
              }
            }).run();
            GMTrace.o(21033528590336L, 156712);
          }
        });
        w.v("MicroMsg.AppBrandLaunchProxyUI", "start we app with username(%s) and appId(%s) and statObj(%s)", new Object[] { paramString1, str, paramAppBrandStatObject });
        paramContext.startActivity(paramString2);
        GMTrace.o(15440138993664L, 115038);
        return true;
      }
    }
  }
  
  private static String qZ(String paramString)
  {
    GMTrace.i(19676184707072L, 146599);
    if (bg.nm(paramString))
    {
      GMTrace.o(19676184707072L, 146599);
      return "";
    }
    paramString = new ComponentName(ab.getContext(), paramString);
    PackageManager localPackageManager = ab.getContext().getPackageManager();
    if (localPackageManager == null)
    {
      GMTrace.o(19676184707072L, 146599);
      return "";
    }
    try
    {
      Object localObject = localPackageManager.getActivityInfo(paramString, 128);
      if (localObject == null)
      {
        GMTrace.o(19676184707072L, 146599);
        return "";
      }
      localObject = ((ActivityInfo)localObject).processName;
      GMTrace.o(19676184707072L, 146599);
      return (String)localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      try
      {
        paramString = localPackageManager.getServiceInfo(paramString, 128);
        if (paramString == null)
        {
          GMTrace.o(19676184707072L, 146599);
          return "";
        }
        paramString = paramString.processName;
        GMTrace.o(19676184707072L, 146599);
        return paramString;
      }
      catch (PackageManager.NameNotFoundException paramString)
      {
        GMTrace.o(19676184707072L, 146599);
      }
    }
    return "";
  }
  
  public final void finish()
  {
    GMTrace.i(20672617119744L, 154023);
    try
    {
      mState = 1;
      super.finish();
      GMTrace.o(20672617119744L, 154023);
      return;
    }
    finally {}
  }
  
  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(21031649542144L, 156698);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.vKC != null) {
      this.vKC.a(paramInt1, paramInt2, paramIntent);
    }
    this.vKC = null;
    GMTrace.o(21031649542144L, 156698);
  }
  
  /* Error */
  public final void onCreate(final android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: ldc2_w 442
    //   3: ldc_w 444
    //   6: invokestatic 50	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: aload_1
    //   11: invokespecial 446	com/tencent/mm/ui/MMBaseActivity:onCreate	(Landroid/os/Bundle;)V
    //   14: ldc 2
    //   16: monitorenter
    //   17: getstatic 54	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:ipq	Z
    //   20: ifeq +20 -> 40
    //   23: aload_0
    //   24: invokevirtual 386	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:finish	()V
    //   27: ldc 2
    //   29: monitorexit
    //   30: ldc2_w 442
    //   33: ldc_w 444
    //   36: invokestatic 59	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   39: return
    //   40: aload_0
    //   41: putstatic 88	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:ips	Lcom/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI;
    //   44: iconst_0
    //   45: putstatic 52	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:mState	I
    //   48: ldc 2
    //   50: monitorexit
    //   51: aload_0
    //   52: invokevirtual 450	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:getWindow	()Landroid/view/Window;
    //   55: invokestatic 455	com/tencent/mm/plugin/appbrand/ui/g:a	(Landroid/view/Window;)V
    //   58: aload_0
    //   59: invokevirtual 450	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:getWindow	()Landroid/view/Window;
    //   62: iconst_1
    //   63: invokestatic 458	com/tencent/mm/plugin/appbrand/ui/g:a	(Landroid/view/Window;Z)Z
    //   66: pop
    //   67: ldc 2
    //   69: monitorenter
    //   70: getstatic 311	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:ipw	Ljava/lang/Runnable;
    //   73: ifnull +43 -> 116
    //   76: getstatic 311	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:ipw	Ljava/lang/Runnable;
    //   79: astore_1
    //   80: aconst_null
    //   81: putstatic 311	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:ipw	Ljava/lang/Runnable;
    //   84: new 6	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$1
    //   87: dup
    //   88: aload_0
    //   89: aload_1
    //   90: invokespecial 461	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$1:<init>	(Lcom/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI;Ljava/lang/Runnable;)V
    //   93: aload_0
    //   94: invokevirtual 464	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$1:a	(Lcom/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI;)V
    //   97: ldc 2
    //   99: monitorexit
    //   100: ldc2_w 442
    //   103: ldc_w 444
    //   106: invokestatic 59	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   109: return
    //   110: astore_1
    //   111: ldc 2
    //   113: monitorexit
    //   114: aload_1
    //   115: athrow
    //   116: ldc 2
    //   118: monitorexit
    //   119: aload_0
    //   120: getstatic 469	com/tencent/mm/plugin/appbrand/o$i:cUG	I
    //   123: invokevirtual 473	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:getString	(I)Ljava/lang/String;
    //   126: pop
    //   127: aload_0
    //   128: aload_0
    //   129: aload_0
    //   130: getstatic 476	com/tencent/mm/plugin/appbrand/o$i:bKJ	I
    //   133: invokevirtual 473	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:getString	(I)Ljava/lang/String;
    //   136: iconst_1
    //   137: new 8	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$2
    //   140: dup
    //   141: aload_0
    //   142: invokespecial 478	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$2:<init>	(Lcom/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI;)V
    //   145: invokestatic 483	com/tencent/mm/ui/base/h:a	(Landroid/content/Context;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)Lcom/tencent/mm/ui/base/r;
    //   148: putfield 485	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:ipt	Lcom/tencent/mm/ui/base/r;
    //   151: invokestatic 78	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:Yi	()Z
    //   154: ifne +47 -> 201
    //   157: aload_0
    //   158: getfield 485	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:ipt	Lcom/tencent/mm/ui/base/r;
    //   161: ifnull +40 -> 201
    //   164: aload_0
    //   165: getfield 485	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:ipt	Lcom/tencent/mm/ui/base/r;
    //   168: invokevirtual 488	com/tencent/mm/ui/base/r:getWindow	()Landroid/view/Window;
    //   171: ifnull +30 -> 201
    //   174: aload_0
    //   175: getfield 485	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:ipt	Lcom/tencent/mm/ui/base/r;
    //   178: invokevirtual 488	com/tencent/mm/ui/base/r:getWindow	()Landroid/view/Window;
    //   181: invokevirtual 494	android/view/Window:getAttributes	()Landroid/view/WindowManager$LayoutParams;
    //   184: astore_1
    //   185: aload_1
    //   186: fconst_0
    //   187: putfield 500	android/view/WindowManager$LayoutParams:dimAmount	F
    //   190: aload_0
    //   191: getfield 485	com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI:ipt	Lcom/tencent/mm/ui/base/r;
    //   194: invokevirtual 488	com/tencent/mm/ui/base/r:getWindow	()Landroid/view/Window;
    //   197: aload_1
    //   198: invokevirtual 504	android/view/Window:setAttributes	(Landroid/view/WindowManager$LayoutParams;)V
    //   201: ldc2_w 442
    //   204: ldc_w 444
    //   207: invokestatic 59	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   210: return
    //   211: astore_1
    //   212: ldc 2
    //   214: monitorexit
    //   215: aload_1
    //   216: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	217	0	this	AppBrandLaunchProxyUI
    //   0	217	1	paramBundle	android.os.Bundle
    // Exception table:
    //   from	to	target	type
    //   17	30	110	finally
    //   40	51	110	finally
    //   111	114	110	finally
    //   70	100	211	finally
    //   116	119	211	finally
    //   212	215	211	finally
  }
  
  protected final void onDestroy()
  {
    GMTrace.i(14430553243648L, 107516);
    try
    {
      mState = 2;
      ips = null;
      super.onDestroy();
      if (this.ipt != null)
      {
        this.ipt.dismiss();
        this.ipt = null;
      }
      GMTrace.o(14430553243648L, 107516);
      return;
    }
    finally {}
  }
  
  protected final void onResume()
  {
    GMTrace.i(20672482902016L, 154022);
    super.onResume();
    int i = this.hWK + 1;
    this.hWK = i;
    if ((i > 1) || (Yh())) {
      super.finish();
    }
    GMTrace.o(20672482902016L, 154022);
  }
  
  static final class LaunchParcel
    implements Parcelable
  {
    public static final Parcelable.Creator<LaunchParcel> CREATOR;
    String appId;
    AppBrandLaunchReferrer hQB;
    String hQy;
    int hZb;
    AppBrandStatObject ipx;
    LaunchParamsOptional ipy;
    String username;
    int version;
    
    static
    {
      GMTrace.i(14432029638656L, 107527);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(14432029638656L, 107527);
    }
    
    LaunchParcel()
    {
      GMTrace.i(14431761203200L, 107525);
      GMTrace.o(14431761203200L, 107525);
    }
    
    LaunchParcel(Parcel paramParcel)
    {
      GMTrace.i(14431895420928L, 107526);
      this.username = paramParcel.readString();
      this.appId = paramParcel.readString();
      this.version = paramParcel.readInt();
      this.hZb = paramParcel.readInt();
      this.hQy = paramParcel.readString();
      this.ipx = ((AppBrandStatObject)paramParcel.readParcelable(AppBrandStatObject.class.getClassLoader()));
      this.hQB = ((AppBrandLaunchReferrer)paramParcel.readParcelable(AppBrandLaunchReferrer.class.getClassLoader()));
      this.ipy = ((LaunchParamsOptional)paramParcel.readParcelable(LaunchParamsOptional.class.getClassLoader()));
      GMTrace.o(14431895420928L, 107526);
    }
    
    public final int describeContents()
    {
      GMTrace.i(14431492767744L, 107523);
      GMTrace.o(14431492767744L, 107523);
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(14431626985472L, 107524);
      paramParcel.writeString(this.username);
      paramParcel.writeString(this.appId);
      paramParcel.writeInt(this.version);
      paramParcel.writeInt(this.hZb);
      paramParcel.writeString(this.hQy);
      paramParcel.writeParcelable(this.ipx, paramInt);
      paramParcel.writeParcelable(this.hQB, paramInt);
      paramParcel.writeParcelable(this.ipy, paramInt);
      GMTrace.o(14431626985472L, 107524);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\AppBrandLaunchProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */