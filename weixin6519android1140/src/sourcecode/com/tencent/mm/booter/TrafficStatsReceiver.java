package com.tencent.mm.booter;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bf;
import com.tencent.mm.sdk.platformtools.w;

public class TrafficStatsReceiver
  extends BroadcastReceiver
{
  private long mLastTime;
  
  public TrafficStatsReceiver()
  {
    GMTrace.i(13463514513408L, 100311);
    this.mLastTime = -1L;
    GMTrace.o(13463514513408L, 100311);
  }
  
  public static void aA(Context paramContext)
  {
    GMTrace.i(13463782948864L, 100313);
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    paramContext = PendingIntent.getBroadcast(paramContext, 1, new Intent("com.tencent.mm.TrafficStatsReceiver"), 268435456);
    localAlarmManager.setRepeating(3, SystemClock.elapsedRealtime(), 300000L, paramContext);
    w.i("MicroMsg.TrafficStats", "Register alarm, interval: %d ms", new Object[] { Long.valueOf(300000L) });
    GMTrace.o(13463782948864L, 100313);
  }
  
  public static void aB(Context paramContext)
  {
    GMTrace.i(13463917166592L, 100314);
    ((AlarmManager)paramContext.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(paramContext, 1, new Intent("com.tencent.mm.TrafficStatsReceiver"), 268435456));
    GMTrace.o(13463917166592L, 100314);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(13463648731136L, 100312);
    w.d("MicroMsg.TrafficStats", "onRecieve");
    long l1 = SystemClock.elapsedRealtime();
    bf.update();
    if (this.mLastTime >= 0L)
    {
      long l2 = l1 - this.mLastTime;
      long l3 = bf.bQI() + bf.bQH();
      long l4 = bf.bQG() + bf.bQF();
      long l5 = bf.bQM() + bf.bQL();
      long l6 = bf.bQM() + bf.bQL();
      w.i("MicroMsg.TrafficStats", "Time: %d ms, System - [Mobile: %d, Wifi: %d, Speed: %.2f], WeChat - [Mobile: %d, Wifi: %d, Speed: %.2f]", new Object[] { Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), Double.valueOf((l3 + l4) / (l2 / 1000L)), Long.valueOf(l5), Long.valueOf(l6), Double.valueOf((l5 + l6) / (l2 / 1000L)) });
    }
    this.mLastTime = l1;
    GMTrace.o(13463648731136L, 100312);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\booter\TrafficStatsReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */