package com.tencent.mm.sandbox.monitor;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sandbox.c;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class ExceptionMonitorService
  extends Service
{
  public static long goZ;
  public static int veN;
  private static ExceptionMonitorService veR;
  private long veO;
  private ae veP;
  private Runnable veQ;
  private long veS;
  
  static
  {
    GMTrace.i(3604417085440L, 26855);
    veN = 0;
    goZ = 0L;
    veR = null;
    GMTrace.o(3604417085440L, 26855);
  }
  
  public ExceptionMonitorService()
  {
    GMTrace.i(3603343343616L, 26847);
    this.veO = 300000L;
    this.veP = new ae();
    this.veQ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3600390553600L, 26825);
        w.d("MicroMsg.CrashMonitorService", "stopSelf");
        ExceptionMonitorService.this.stopSelf();
        GMTrace.o(3600390553600L, 26825);
      }
    };
    GMTrace.o(3603343343616L, 26847);
  }
  
  public static void ei(Context paramContext)
  {
    GMTrace.i(3604282867712L, 26854);
    Object localObject = new Intent(paramContext, CrashUploadAlarmReceiver.class);
    if (PendingIntent.getBroadcast(paramContext, 0, (Intent)localObject, 536870912) == null)
    {
      localObject = PendingIntent.getBroadcast(paramContext, 0, (Intent)localObject, 0);
      paramContext = (AlarmManager)paramContext.getSystemService("alarm");
      long l = bg.Pv() + 1800000L;
      paramContext.set(0, l, (PendingIntent)localObject);
      w.d("MicroMsg.CrashMonitorService", "dkcrash startAlarmMgr pendingIntent:%d %d", new Object[] { Integer.valueOf(((PendingIntent)localObject).hashCode()), Long.valueOf(l) });
    }
    GMTrace.o(3604282867712L, 26854);
  }
  
  private void k(Intent paramIntent)
  {
    GMTrace.i(3604014432256L, 26852);
    if (paramIntent == null)
    {
      GMTrace.o(3604014432256L, 26852);
      return;
    }
    this.veP.removeCallbacks(this.veQ);
    this.veP.postDelayed(this.veQ, this.veO);
    String str3 = paramIntent.getAction();
    w.d("MicroMsg.CrashMonitorService", "dkcrash handleCommand action:" + str3);
    String str2;
    String str1;
    String str4;
    boolean bool;
    try
    {
      str2 = paramIntent.getStringExtra("tag");
      str1 = str2;
      if (str2 == null) {
        str1 = "exception";
      }
      int i = paramIntent.getIntExtra("exceptionPid", 0);
      str1.equals("exception");
      veN = i;
      goZ = paramIntent.getLongExtra("exceptionTime", SystemClock.elapsedRealtime());
      str2 = paramIntent.getStringExtra("exceptionMsg");
      str4 = paramIntent.getStringExtra("userName");
      bool = paramIntent.getBooleanExtra("exceptionWriteSdcard", true);
      w.d("MicroMsg.CrashMonitorService", "dkcrash handleCommand. action=" + str3 + " pid:" + i + " tag=" + str1 + ", userName=" + str4 + ", message" + str2);
      if (bg.nm(str2))
      {
        GMTrace.o(3604014432256L, 26852);
        return;
      }
    }
    catch (Exception paramIntent)
    {
      w.printErrStackTrace("MicroMsg.CrashMonitorService", paramIntent, "", new Object[0]);
      GMTrace.o(3604014432256L, 26852);
      return;
    }
    if (a.a(str4, str1, new b.a(str4, str1, bg.Pu(), str2, bool)) == 0) {
      ei(this);
    }
    if (System.currentTimeMillis() - this.veS > 600000L)
    {
      this.veS = System.currentTimeMillis();
      e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18485941895168L, 137731);
          com.tencent.mm.modelrecovery.a.Km();
          GMTrace.o(18485941895168L, 137731);
        }
      }, "RecoveryWriteLogThread");
    }
    GMTrace.o(3604014432256L, 26852);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(3604148649984L, 26853);
    GMTrace.o(3604148649984L, 26853);
    return null;
  }
  
  public void onCreate()
  {
    GMTrace.i(3603477561344L, 26848);
    super.onCreate();
    veR = this;
    c.f(hashCode(), this);
    this.veP.postDelayed(this.veQ, this.veO);
    GMTrace.o(3603477561344L, 26848);
  }
  
  public void onDestroy()
  {
    GMTrace.i(3603880214528L, 26851);
    super.onDestroy();
    veR = null;
    c.g(hashCode(), this);
    this.veP.removeCallbacks(this.veQ);
    GMTrace.o(3603880214528L, 26851);
  }
  
  public void onStart(Intent paramIntent, int paramInt)
  {
    GMTrace.i(3603611779072L, 26849);
    super.onStart(paramIntent, paramInt);
    k(paramIntent);
    GMTrace.o(3603611779072L, 26849);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    GMTrace.i(3603745996800L, 26850);
    k(paramIntent);
    GMTrace.o(3603745996800L, 26850);
    return 1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\sandbox\monitor\ExceptionMonitorService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */