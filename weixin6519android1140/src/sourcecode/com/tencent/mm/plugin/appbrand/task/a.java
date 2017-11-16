package com.tencent.mm.plugin.appbrand.task;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ui.AppBrandInToolsUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.e.g;
import java.util.Iterator;
import java.util.List;

final class a
  extends e
{
  a()
  {
    super(AppBrandInToolsUI.class, null);
    GMTrace.i(20691407601664L, 154163);
    GMTrace.o(20691407601664L, 154163);
  }
  
  final void aai()
  {
    GMTrace.i(20691541819392L, 154164);
    Object localObject = (ActivityManager)ab.getContext().getSystemService("activity");
    if (localObject == null)
    {
      GMTrace.o(20691541819392L, 154164);
      return;
    }
    localObject = ((ActivityManager)localObject).getRunningAppProcesses();
    if (localObject == null)
    {
      GMTrace.o(20691541819392L, 154164);
      return;
    }
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
      if ((ab.getPackageName() + ":tools").equals(localRunningAppProcessInfo.processName)) {
        if (localRunningAppProcessInfo.importance == 100)
        {
          GMTrace.o(20691541819392L, 154164);
          return;
        }
      }
    }
    localObject = new Intent();
    ((Intent)localObject).setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    ((Intent)localObject).putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
    ab.getContext().sendBroadcast((Intent)localObject);
    GMTrace.o(20691541819392L, 154164);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\task\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */