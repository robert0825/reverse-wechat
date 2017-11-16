package com.tencent.mm.sdk.platformtools;

import android.app.ActivityManager;
import android.app.ActivityManager.AppTask;
import android.app.ActivityManager.RecentTaskInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PowerManager;
import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import java.util.List;

public final class l
{
  private static BroadcastReceiver lnS;
  public static int vhy;
  public static int vhz;
  
  static
  {
    GMTrace.i(13905761927168L, 103606);
    lnS = null;
    vhy = 0;
    vhz = -1;
    GMTrace.o(13905761927168L, 103606);
  }
  
  public static String bs(Context paramContext)
  {
    GMTrace.i(21020241035264L, 156613);
    if (!cR(paramContext))
    {
      GMTrace.o(21020241035264L, 156613);
      return "";
    }
    try
    {
      paramContext = (ActivityManager)paramContext.getSystemService("activity");
      if (Build.VERSION.SDK_INT >= 23)
      {
        paramContext = paramContext.getAppTasks();
        if ((paramContext == null) || (paramContext.size() <= 0))
        {
          GMTrace.o(21020241035264L, 156613);
          return "";
        }
        paramContext = paramContext.iterator();
        if (paramContext.hasNext())
        {
          paramContext = ((ActivityManager.AppTask)paramContext.next()).getTaskInfo().topActivity;
          if (paramContext == null)
          {
            GMTrace.o(21020241035264L, 156613);
            return null;
          }
          paramContext = paramContext.getClassName();
          GMTrace.o(21020241035264L, 156613);
          return paramContext;
        }
      }
      else
      {
        paramContext = ((ActivityManager.RunningTaskInfo)paramContext.getRunningTasks(1).get(0)).topActivity.getClassName();
        GMTrace.o(21020241035264L, 156613);
        return paramContext;
      }
    }
    catch (Exception paramContext)
    {
      w.e("MicroMsg.GreenManUtil", "getTopActivityName Exception:%s stack:%s", new Object[] { paramContext.getMessage(), bg.f(paramContext) });
      GMTrace.o(21020241035264L, 156613);
    }
    return "";
  }
  
  public static boolean cR(Context paramContext)
  {
    GMTrace.i(13904956620800L, 103600);
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    if (paramContext == null)
    {
      GMTrace.o(13904956620800L, 103600);
      return false;
    }
    paramContext = paramContext.iterator();
    while (paramContext.hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
      if ((localRunningAppProcessInfo.importance == 100) && (localRunningAppProcessInfo.processName.startsWith("com.tencent.mm")))
      {
        GMTrace.o(13904956620800L, 103600);
        return true;
      }
    }
    GMTrace.o(13904956620800L, 103600);
    return false;
  }
  
  public static boolean eo(Context paramContext)
  {
    GMTrace.i(13904688185344L, 103598);
    try
    {
      paramContext = (PowerManager)paramContext.getSystemService("power");
      if (Build.VERSION.SDK_INT >= 20)
      {
        bool = paramContext.isInteractive();
        GMTrace.o(13904688185344L, 103598);
        return bool;
      }
      boolean bool = paramContext.isScreenOn();
      GMTrace.o(13904688185344L, 103598);
      return bool;
    }
    catch (Exception paramContext)
    {
      w.e("MicroMsg.GreenManUtil", "isScreenOn ERROR use isScreenOn e:%s", new Object[] { bg.f(paramContext) });
      GMTrace.o(13904688185344L, 103598);
    }
    return false;
  }
  
  /* Error */
  public static boolean ep(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc 2
    //   4: monitorenter
    //   5: ldc2_w 175
    //   8: ldc -79
    //   10: invokestatic 22	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   13: getstatic 24	com/tencent/mm/sdk/platformtools/l:lnS	Landroid/content/BroadcastReceiver;
    //   16: ifnonnull +50 -> 66
    //   19: new 6	com/tencent/mm/sdk/platformtools/l$1
    //   22: dup
    //   23: invokespecial 180	com/tencent/mm/sdk/platformtools/l$1:<init>	()V
    //   26: putstatic 24	com/tencent/mm/sdk/platformtools/l:lnS	Landroid/content/BroadcastReceiver;
    //   29: aload_0
    //   30: getstatic 24	com/tencent/mm/sdk/platformtools/l:lnS	Landroid/content/BroadcastReceiver;
    //   33: new 182	android/content/IntentFilter
    //   36: dup
    //   37: ldc -72
    //   39: invokespecial 187	android/content/IntentFilter:<init>	(Ljava/lang/String;)V
    //   42: invokevirtual 191	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   45: astore_0
    //   46: aload_0
    //   47: ldc -63
    //   49: iconst_m1
    //   50: invokevirtual 199	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   53: putstatic 28	com/tencent/mm/sdk/platformtools/l:vhz	I
    //   56: aload_0
    //   57: ldc -55
    //   59: iconst_0
    //   60: invokevirtual 199	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   63: putstatic 26	com/tencent/mm/sdk/platformtools/l:vhy	I
    //   66: getstatic 28	com/tencent/mm/sdk/platformtools/l:vhz	I
    //   69: iconst_2
    //   70: if_icmpeq +32 -> 102
    //   73: getstatic 26	com/tencent/mm/sdk/platformtools/l:vhy	I
    //   76: iconst_1
    //   77: if_icmpeq +25 -> 102
    //   80: getstatic 26	com/tencent/mm/sdk/platformtools/l:vhy	I
    //   83: iconst_2
    //   84: if_icmpeq +18 -> 102
    //   87: getstatic 60	android/os/Build$VERSION:SDK_INT	I
    //   90: bipush 17
    //   92: if_icmplt +25 -> 117
    //   95: getstatic 26	com/tencent/mm/sdk/platformtools/l:vhy	I
    //   98: iconst_4
    //   99: if_icmpne +18 -> 117
    //   102: ldc2_w 175
    //   105: ldc -79
    //   107: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   110: iconst_1
    //   111: istore_1
    //   112: ldc 2
    //   114: monitorexit
    //   115: iload_1
    //   116: ireturn
    //   117: ldc2_w 175
    //   120: ldc -79
    //   122: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   125: goto -13 -> 112
    //   128: astore_0
    //   129: ldc 2
    //   131: monitorexit
    //   132: aload_0
    //   133: athrow
    //   134: astore_0
    //   135: goto -69 -> 66
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	138	0	paramContext	Context
    //   1	115	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   5	29	128	finally
    //   29	66	128	finally
    //   66	102	128	finally
    //   102	110	128	finally
    //   117	125	128	finally
    //   29	66	134	java/lang/Throwable
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */