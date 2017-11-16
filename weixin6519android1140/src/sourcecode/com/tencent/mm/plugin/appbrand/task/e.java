package com.tencent.mm.plugin.appbrand.task;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

class e
{
  final String iAp;
  final Class iAq;
  private final Class iAr;
  final LinkedHashMap<String, Integer> iAs;
  final LinkedHashMap<String, AppBrandRemoteTaskController> iAt;
  
  e(Class paramClass1, Class paramClass2)
  {
    GMTrace.i(17273687375872L, 128699);
    this.iAs = new LinkedHashMap();
    this.iAt = new LinkedHashMap();
    this.iAp = paramClass1.getName();
    this.iAq = paramClass1;
    this.iAr = paramClass2;
    GMTrace.o(17273687375872L, 128699);
  }
  
  final void a(String paramString, int paramInt, AppBrandRemoteTaskController paramAppBrandRemoteTaskController)
  {
    GMTrace.i(17273955811328L, 128701);
    this.iAs.put(paramString, Integer.valueOf(paramInt));
    this.iAt.put(paramString, paramAppBrandRemoteTaskController);
    GMTrace.o(17273955811328L, 128701);
  }
  
  void aai()
  {
    GMTrace.i(20689662771200L, 154150);
    if (!this.iAs.isEmpty())
    {
      GMTrace.o(20689662771200L, 154150);
      return;
    }
    Object localObject2 = (ActivityManager)ab.getContext().getSystemService("activity");
    Object localObject1 = ab.getContext().getPackageManager();
    if ((localObject2 == null) || (localObject1 == null))
    {
      GMTrace.o(20689662771200L, 154150);
      return;
    }
    try
    {
      localObject1 = ((PackageManager)localObject1).getActivityInfo(new ComponentName(ab.getContext(), this.iAq), 128).processName;
      localObject2 = ((ActivityManager)localObject2).getRunningAppProcesses();
      if (localObject2 == null)
      {
        GMTrace.o(20689662771200L, 154150);
        return;
      }
    }
    catch (Exception localException)
    {
      GMTrace.o(20689662771200L, 154150);
      return;
    }
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject2).next();
      if (localRunningAppProcessInfo.processName.equals(localException))
      {
        Process.killProcess(localRunningAppProcessInfo.pid);
        GMTrace.o(20689662771200L, 154150);
        return;
      }
    }
    GMTrace.o(20689662771200L, 154150);
  }
  
  final AppBrandRemoteTaskController sp(String paramString)
  {
    GMTrace.i(17274090029056L, 128702);
    paramString = (AppBrandRemoteTaskController)this.iAt.get(paramString);
    GMTrace.o(17274090029056L, 128702);
    return paramString;
  }
  
  final void yg()
  {
    GMTrace.i(17273821593600L, 128700);
    if (this.iAr == null)
    {
      GMTrace.o(17273821593600L, 128700);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(ab.getContext(), this.iAr);
    ab.getContext().sendBroadcast(localIntent);
    GMTrace.o(17273821593600L, 128700);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\task\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */