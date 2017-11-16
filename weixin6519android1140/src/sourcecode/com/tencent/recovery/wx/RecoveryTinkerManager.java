package com.tencent.recovery.wx;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import com.tencent.recovery.log.RecoveryLog;
import java.util.Iterator;
import java.util.List;

public class RecoveryTinkerManager
{
  private static boolean bc(Context paramContext, String paramString)
  {
    try
    {
      paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses().iterator();
      while (paramContext.hasNext())
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
        if (localRunningAppProcessInfo.processName != null)
        {
          boolean bool = localRunningAppProcessInfo.processName.equals(paramString);
          if (bool) {
            return true;
          }
        }
      }
    }
    catch (Exception paramContext) {}
    return false;
  }
  
  public static int bu(Context paramContext, String paramString)
  {
    if (bc(paramContext, fR(paramContext))) {
      return -2;
    }
    try
    {
      Intent localIntent = new Intent();
      localIntent.setClassName(paramContext, "com.tencent.tinker.lib.service.TinkerPatchService");
      localIntent.putExtra("patch_path_extra", paramString);
      localIntent.putExtra("patch_result_class", "com.tencent.mm.modelrecovery.RecoveryTinkerResultService");
      paramContext.startService(localIntent);
      return 0;
    }
    catch (Throwable paramContext)
    {
      RecoveryLog.e("Recovery.RecoveryTinkerManager", "start patch service fail, exception:" + paramContext, new Object[0]);
    }
    return -1;
  }
  
  private static String fR(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    paramContext = new ComponentName(paramContext, "com.tencent.tinker.lib.service.TinkerPatchService");
    try
    {
      paramContext = localPackageManager.getServiceInfo(paramContext, 0);
      return paramContext.processName;
    }
    catch (Throwable paramContext) {}
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\wx\RecoveryTinkerManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */