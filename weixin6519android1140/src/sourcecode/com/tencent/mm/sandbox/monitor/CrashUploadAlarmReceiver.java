package com.tencent.mm.sandbox.monitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class CrashUploadAlarmReceiver
  extends BroadcastReceiver
{
  public CrashUploadAlarmReceiver()
  {
    GMTrace.i(3600524771328L, 26826);
    GMTrace.o(3600524771328L, 26826);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(3600658989056L, 26827);
    w.d("MicroMsg.CrashUploadAlarmReceiver", "dkcrash AlarmReceiver.onReceive");
    if (a.bOI() == 0) {
      ExceptionMonitorService.ei(paramContext);
    }
    GMTrace.o(3600658989056L, 26827);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\sandbox\monitor\CrashUploadAlarmReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */