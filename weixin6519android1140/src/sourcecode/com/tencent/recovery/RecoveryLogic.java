package com.tencent.recovery;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.model.RecoveryData;
import com.tencent.recovery.model.RecoveryHandleItem;
import com.tencent.recovery.model.RecoveryStatusItem;
import com.tencent.recovery.option.CommonOptions;
import com.tencent.recovery.service.RecoveryHandleService;
import com.tencent.recovery.service.RecoveryReportService;
import com.tencent.recovery.service.RecoveryUploadService;
import com.tencent.recovery.util.Util;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecoveryLogic
{
  public static Field xPt = null;
  public static int xPu = 17;
  
  public static void a(Context paramContext, RecoveryStatusItem paramRecoveryStatusItem, String paramString)
  {
    RecoveryLog.i("Recovery.RecoveryLogic", "startReportService %s", new Object[] { "ProcessStatus" });
    Intent localIntent = new Intent(paramContext, RecoveryReportService.class);
    localIntent.putExtra("KeyReportType", "ProcessStatus");
    localIntent.putExtra("KeyReportItem", paramRecoveryStatusItem);
    localIntent.putExtra("KeyReportUploadClassName", paramString);
    paramContext.startService(localIntent);
  }
  
  public static void a(Context paramContext, ArrayList<RecoveryHandleItem> paramArrayList, String paramString)
  {
    RecoveryLog.i("Recovery.RecoveryLogic", "startReportService %s", new Object[] { "HandleStatus" });
    Intent localIntent = new Intent(paramContext, RecoveryReportService.class);
    localIntent.putExtra("KeyReportType", "HandleStatus");
    localIntent.putExtra("KeyReportUploadClassName", paramString);
    localIntent.putParcelableArrayListExtra("KeyReportItem", paramArrayList);
    paramContext.startService(localIntent);
  }
  
  public static boolean a(Context paramContext, CommonOptions paramCommonOptions, RecoveryContext paramRecoveryContext)
  {
    if (paramCommonOptions.xPL == null)
    {
      RecoveryLog.i("Recovery.RecoveryLogic", "startRecoveryProcess not set handle service", new Object[0]);
      return false;
    }
    RecoveryLog.i("Recovery.RecoveryLogic", "startHandleService %s", new Object[] { Util.fQ(paramContext) });
    String str1;
    if (Util.nm(paramCommonOptions.xPM))
    {
      str1 = RecoveryUploadService.class.getName();
      if (!Util.nm(paramCommonOptions.xPL)) {
        break label185;
      }
    }
    label185:
    for (String str2 = RecoveryHandleService.class.getName();; str2 = paramCommonOptions.xPL)
    {
      RecoveryData localRecoveryData = new RecoveryData();
      localRecoveryData.processName = Util.fQ(paramContext);
      localRecoveryData.lOv = paramCommonOptions.lOv;
      localRecoveryData.xPH = paramCommonOptions.xPH;
      localRecoveryData.xPI = paramRecoveryContext.xPs;
      localRecoveryData.clientVersion = paramCommonOptions.clientVersion;
      paramRecoveryContext = new Intent();
      paramRecoveryContext.setClassName(paramContext, paramCommonOptions.xPL);
      paramRecoveryContext.putExtra("KeyReportUploadClassName", str1);
      paramRecoveryContext.putExtra("KeyReportHandleClassName", str2);
      paramRecoveryContext.putExtra("KeyRecoveryData", localRecoveryData);
      paramContext.startService(paramRecoveryContext);
      return true;
      str1 = paramCommonOptions.xPM;
      break;
    }
  }
  
  public static int bs(Context paramContext, String paramString)
  {
    if (xPu != 17) {
      return xPu;
    }
    xPu = 16;
    if (xPt == null) {}
    try
    {
      xPt = ActivityManager.RunningAppProcessInfo.class.getDeclaredField("processState");
      List localList;
      if (xPt != null)
      {
        localList = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
        if ((localList != null) && (!localList.isEmpty())) {
          break label83;
        }
        RecoveryLog.i("Recovery.RecoveryLogic", "can not get running app process", new Object[0]);
      }
      for (;;)
      {
        return xPu;
        label83:
        Iterator localIterator = localList.iterator();
        do
        {
          ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo;
          do
          {
            if (!localIterator.hasNext()) {
              break;
            }
            localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
          } while ((localRunningAppProcessInfo == null) || (localRunningAppProcessInfo.importance != 100) || (localRunningAppProcessInfo.importanceReasonCode != 0));
          try
          {
            int i = xPt.getInt(localRunningAppProcessInfo);
            paramContext = Integer.valueOf(i);
          }
          catch (Exception paramContext)
          {
            for (;;)
            {
              paramContext = null;
            }
            paramContext = new StringBuffer();
            paramString = localList.iterator();
            while (paramString.hasNext())
            {
              localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramString.next();
              if (localRunningAppProcessInfo != null) {
                paramContext.append(localRunningAppProcessInfo.processName + ":" + localRunningAppProcessInfo.importance + " ");
              }
            }
            RecoveryLog.i("Recovery.RecoveryLogic", "foregroundInfo is null %s %s", new Object[] { Integer.valueOf(localList.size()), paramContext.toString() });
          }
        } while ((paramContext == null) || (paramContext.intValue() != 2));
        paramContext = localRunningAppProcessInfo;
        if (paramContext != null)
        {
          RecoveryLog.i("Recovery.RecoveryLogic", "%s %s", new Object[] { paramString, paramContext.processName });
          if (!paramString.equals(paramContext.processName)) {
            continue;
          }
          xPu = 1;
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        continue;
        paramContext = null;
      }
    }
  }
  
  public static boolean cni()
  {
    return fM(Recovery.getContext());
  }
  
  public static boolean fM(Context paramContext)
  {
    String str = Util.fQ(paramContext);
    boolean bool = false;
    if (str.equals(paramContext.getPackageName() + ":recovery")) {
      bool = true;
    }
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\RecoveryLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */