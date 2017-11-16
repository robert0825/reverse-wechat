package com.tencent.recovery.service;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.tencent.recovery.RecoveryLogic;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.model.RecoveryData;
import com.tencent.recovery.model.RecoveryHandleItem;
import com.tencent.recovery.model.RecoveryHandleResult;
import com.tencent.recovery.option.CommonOptions;
import com.tencent.recovery.option.OptionFactory;
import com.tencent.recovery.util.Util;
import java.util.ArrayList;

public class RecoveryHandleService
  extends IntentService
{
  private static volatile boolean running;
  
  public RecoveryHandleService()
  {
    super(RecoveryHandleService.class.getName());
  }
  
  public RecoveryHandleResult a(Context paramContext, RecoveryData paramRecoveryData, ArrayList<RecoveryHandleItem> paramArrayList, boolean paramBoolean)
  {
    return new RecoveryHandleResult();
  }
  
  public void a(RecoveryData paramRecoveryData, ArrayList<RecoveryHandleItem> paramArrayList, boolean paramBoolean) {}
  
  public void onCreate()
  {
    RecoveryLog.i("Recovery.RecoveryHandleService", "onCreate", new Object[0]);
    super.onCreate();
  }
  
  public void onDestroy()
  {
    RecoveryLog.i("Recovery.RecoveryHandleService", "onDestroy", new Object[0]);
    RecoveryLog.cnj();
    super.onDestroy();
  }
  
  protected final void onHandleIntent(Intent paramIntent)
  {
    boolean bool = paramIntent.getBooleanExtra("KeyIsRetry", false);
    int i = Util.fP(this);
    String str = paramIntent.getStringExtra("KeyReportUploadClassName");
    Object localObject2 = paramIntent.getStringExtra("KeyReportHandleClassName");
    RecoveryData localRecoveryData = (RecoveryData)paramIntent.getParcelableExtra("KeyRecoveryData");
    if ((localRecoveryData == null) || (localRecoveryData.processName == null))
    {
      RecoveryLog.i("Recovery.RecoveryHandleService", "recoveryData is null %b %d %s %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), str, localObject2 });
      return;
    }
    ArrayList localArrayList = new ArrayList();
    paramIntent = new Intent();
    paramIntent.setClassName(this, (String)localObject2);
    paramIntent = PendingIntent.getService(this, 1000002, paramIntent, 536870912);
    if (paramIntent != null) {
      paramIntent.cancel();
    }
    if (running) {
      RecoveryLog.i("Recovery.RecoveryHandleService", "handle already running", new Object[0]);
    }
    for (;;)
    {
      try
      {
        a(localRecoveryData, localArrayList, bool);
        RecoveryLogic.a(this, localArrayList, str);
        running = false;
        stopSelf();
        return;
      }
      catch (Exception paramIntent)
      {
        RecoveryLog.printErrStackTrace("Recovery.RecoveryHandleService", paramIntent, "alreadyRunning", new Object[0]);
        continue;
      }
      running = true;
      RecoveryLog.i("Recovery.RecoveryHandleService", "try to increase recovery process priority", new Object[0]);
      try
      {
        paramIntent = new Notification();
        if (Build.VERSION.SDK_INT < 18) {
          startForeground(-1119860829, paramIntent);
        }
        for (;;)
        {
          RecoveryLog.i("Recovery.RecoveryHandleService", "start to handle %s's exception uuid: %s threadId: %d", new Object[] { localRecoveryData.processName, localRecoveryData.lOv, Long.valueOf(Thread.currentThread().getId()) });
          paramIntent = new RecoveryHandleResult();
          try
          {
            localObject1 = a(this, localRecoveryData, localArrayList, bool);
            paramIntent = (Intent)localObject1;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              Object localObject1;
              long l;
              RecoveryLog.printErrStackTrace("Recovery.RecoveryHandleService", localException, "handle", new Object[0]);
            }
          }
          if ((paramIntent.xPK) && (!bool))
          {
            localObject1 = new Intent();
            ((Intent)localObject1).setClassName(this, (String)localObject2);
            ((Intent)localObject1).putExtra("KeyReportUploadClassName", str);
            ((Intent)localObject1).putExtra("KeyReportHandleClassName", (String)localObject2);
            ((Intent)localObject1).putExtra("KeyRecoveryData", localRecoveryData);
            ((Intent)localObject1).putExtra("KeyIsRetry", true);
            localObject2 = PendingIntent.getService(this, 1000002, (Intent)localObject1, 536870912);
            if (localObject2 != null) {
              ((PendingIntent)localObject2).cancel();
            }
            localObject2 = OptionFactory.fN(this);
            localObject1 = PendingIntent.getService(this, 1000002, (Intent)localObject1, 0);
            l = System.currentTimeMillis() + ((CommonOptions)localObject2).xPP - 2000L;
            ((AlarmManager)getSystemService("alarm")).set(0, l, (PendingIntent)localObject1);
            RecoveryLog.i("Recovery.RecoveryHandleService", "startAlarm pendingIntent success: %d will retry %s", new Object[] { Integer.valueOf(((PendingIntent)localObject1).hashCode()), Util.fp(l) });
          }
          RecoveryLog.i("Recovery.RecoveryHandleService", "handle recoveryHandleResult %s", new Object[] { paramIntent });
          break;
          startForeground(-1119860829, paramIntent);
          startService(new Intent(this, InnerService.class));
        }
      }
      catch (Throwable paramIntent)
      {
        for (;;)
        {
          RecoveryLog.i("Recovery.RecoveryHandleService", "try to increase recovery process priority error:" + paramIntent, new Object[0]);
        }
      }
    }
  }
  
  public static class InnerService
    extends Service
  {
    public IBinder onBind(Intent paramIntent)
    {
      return null;
    }
    
    public void onCreate()
    {
      super.onCreate();
      try
      {
        startForeground(-1119860829, new Notification());
        stopSelf();
        return;
      }
      catch (Throwable localThrowable)
      {
        for (;;)
        {
          RecoveryLog.e("Recovery.RecoveryHandleService", "InnerService set service for push exception:%s.", new Object[] { localThrowable });
        }
      }
    }
    
    public void onDestroy()
    {
      stopForeground(true);
      super.onDestroy();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\service\RecoveryHandleService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */