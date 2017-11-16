package com.tencent.recovery.service;

import android.app.IntentService;
import android.content.Intent;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.model.RecoveryStatusItem;
import com.tencent.recovery.report.RecoveryReporter;
import com.tencent.recovery.util.Util;

public class RecoveryReportService
  extends IntentService
{
  public RecoveryReportService()
  {
    super(RecoveryReportService.class.getName());
  }
  
  private void ap(Intent paramIntent)
  {
    int i = 0;
    for (;;)
    {
      String str2;
      try
      {
        String str1 = paramIntent.getStringExtra("KeyReportType");
        boolean bool = Util.nm(str1);
        if (bool) {
          return;
        }
      }
      catch (Exception localException)
      {
        str2 = null;
        continue;
        String str3 = paramIntent.getStringExtra("KeyReportUploadClassName");
        RecoveryLog.i("Recovery.RecoveryReportService", "handle report intent %s %s", new Object[] { str2, str3 });
        switch (str2.hashCode())
        {
        case -1125171110: 
          RecoveryUploadService.startAlarm(this, str3);
          stopSelf();
          continue;
        }
      }
      finally {}
      if (str2.equals("HandleStatus"))
      {
        break label175;
        if (str2.equals("ProcessStatus"))
        {
          i = 1;
          break label175;
          RecoveryReporter.c(this, str2, paramIntent.getParcelableArrayListExtra("KeyReportItem"));
          continue;
          RecoveryReporter.a(this, str2, (RecoveryStatusItem)paramIntent.getParcelableExtra("KeyReportItem"));
          continue;
        }
      }
      i = -1;
      label175:
      switch (i)
      {
      }
    }
  }
  
  public void onDestroy()
  {
    RecoveryLog.cnj();
    super.onDestroy();
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    ap(paramIntent);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\service\RecoveryReportService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */