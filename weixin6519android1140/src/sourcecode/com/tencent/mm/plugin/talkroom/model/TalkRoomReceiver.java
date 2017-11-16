package com.tencent.mm.plugin.talkroom.model;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.sdk.platformtools.z.b;

public class TalkRoomReceiver
  extends BroadcastReceiver
{
  public TalkRoomReceiver()
  {
    GMTrace.i(5147249868800L, 38350);
    GMTrace.o(5147249868800L, 38350);
  }
  
  public static void aw(Context paramContext)
  {
    GMTrace.i(5147652521984L, 38353);
    long l2 = z.bPP();
    w.d("MicroMsg.TalkRoomReceiver", "bumper comes, next=" + l2);
    if (l2 > 600000L)
    {
      GMTrace.o(5147652521984L, 38353);
      return;
    }
    long l1 = l2;
    if (l2 < 30000L) {
      l1 = 30000L;
    }
    l2 = SystemClock.elapsedRealtime();
    w.w("MicroMsg.TalkRoomReceiver", "reset bumper, interval:%d, now:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    if (localAlarmManager == null)
    {
      w.e("MicroMsg.TalkRoomReceiver", "keep bumper failed, null am");
      GMTrace.o(5147652521984L, 38353);
      return;
    }
    localAlarmManager.set(2, l1 + l2, PendingIntent.getBroadcast(paramContext, 1, new Intent(paramContext, TalkRoomReceiver.class).putExtra("MMBoot_Bump", true), 268435456));
    GMTrace.o(5147652521984L, 38353);
  }
  
  public static void ax(Context paramContext)
  {
    GMTrace.i(5147786739712L, 38354);
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    if (localAlarmManager == null)
    {
      w.e("MicroMsg.TalkRoomReceiver", "stop bumper failed, null am");
      GMTrace.o(5147786739712L, 38354);
      return;
    }
    paramContext = PendingIntent.getBroadcast(paramContext, 1, new Intent(paramContext, TalkRoomReceiver.class).putExtra("MMBoot_Bump", true), 536870912);
    if (paramContext != null)
    {
      localAlarmManager.cancel(paramContext);
      paramContext.cancel();
    }
    GMTrace.o(5147786739712L, 38354);
  }
  
  protected static void init()
  {
    GMTrace.i(5147384086528L, 38351);
    z.a(new z.b()
    {
      public final void cancel()
      {
        GMTrace.i(5148860481536L, 38362);
        TalkRoomReceiver.ax(ab.getContext());
        GMTrace.o(5148860481536L, 38362);
      }
      
      public final void prepare()
      {
        GMTrace.i(5148726263808L, 38361);
        TalkRoomReceiver.aw(ab.getContext());
        GMTrace.o(5148726263808L, 38361);
      }
    });
    GMTrace.o(5147384086528L, 38351);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(5147518304256L, 38352);
    boolean bool = paramIntent.getBooleanExtra("MMBoot_Bump", false);
    w.i("MicroMsg.TalkRoomReceiver", "[ALARM NOTIFICATION] bump:" + bool);
    aw(paramContext);
    GMTrace.o(5147518304256L, 38352);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\model\TalkRoomReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */