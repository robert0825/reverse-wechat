package com.tencent.mm.booter;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.os.Process;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.aa;
import com.tencent.mm.network.aa.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.z;

public final class MMReceivers
{
  public static class AlarmReceiver
    extends BroadcastReceiver
  {
    public AlarmReceiver()
    {
      GMTrace.i(13457743151104L, 100268);
      GMTrace.o(13457743151104L, 100268);
    }
    
    public static void aw(Context paramContext)
    {
      GMTrace.i(13458011586560L, 100270);
      long l2 = z.bPP();
      w.d("MicroMsg.AlarmReceiver", "bumper comes, next=" + l2);
      if (l2 > 1860000L)
      {
        GMTrace.o(13458011586560L, 100270);
        return;
      }
      long l1 = l2;
      if (l2 < 30000L) {
        l1 = 30000L;
      }
      w.w("MicroMsg.AlarmReceiver", "reset bumper, interval=" + l1);
      AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
      if (localAlarmManager == null)
      {
        w.e("MicroMsg.AlarmReceiver", "keep bumper failed, null am");
        GMTrace.o(13458011586560L, 100270);
        return;
      }
      paramContext = PendingIntent.getBroadcast(paramContext, 1, new Intent(paramContext, AlarmReceiver.class).putExtra("MMBoot_Bump", true), 268435456);
      localAlarmManager.set(0, l1 + System.currentTimeMillis(), paramContext);
      GMTrace.o(13458011586560L, 100270);
    }
    
    public static void ax(Context paramContext)
    {
      GMTrace.i(13458145804288L, 100271);
      AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
      if (localAlarmManager == null)
      {
        w.e("MicroMsg.AlarmReceiver", "stop bumper failed, null am");
        GMTrace.o(13458145804288L, 100271);
        return;
      }
      paramContext = PendingIntent.getBroadcast(paramContext, 1, new Intent(paramContext, AlarmReceiver.class).putExtra("MMBoot_Bump", true), 536870912);
      if (paramContext != null)
      {
        localAlarmManager.cancel(paramContext);
        paramContext.cancel();
      }
      GMTrace.o(13458145804288L, 100271);
    }
    
    public static void ay(Context paramContext)
    {
      GMTrace.i(13458280022016L, 100272);
      w.w("MicroMsg.AlarmReceiver", "keep awaker");
      AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
      if (localAlarmManager == null)
      {
        w.e("MicroMsg.AlarmReceiver", "keep awaker failed, null am");
        GMTrace.o(13458280022016L, 100272);
        return;
      }
      if (aa.OT()) {}
      for (int i = 300000;; i = 900000)
      {
        paramContext = PendingIntent.getBroadcast(paramContext, 0, new Intent(paramContext, AlarmReceiver.class), 268435456);
        localAlarmManager.setRepeating(0, System.currentTimeMillis() + i, i, paramContext);
        GMTrace.o(13458280022016L, 100272);
        return;
      }
    }
    
    public static void az(Context paramContext)
    {
      GMTrace.i(13458414239744L, 100273);
      w.w("MicroMsg.AlarmReceiver", "stop awaker");
      AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
      if (localAlarmManager == null)
      {
        w.e("MicroMsg.AlarmReceiver", "keep awaker failed, null am");
        GMTrace.o(13458414239744L, 100273);
        return;
      }
      paramContext = PendingIntent.getBroadcast(paramContext, 0, new Intent(paramContext, AlarmReceiver.class), 536870912);
      if (paramContext != null)
      {
        localAlarmManager.cancel(paramContext);
        paramContext.cancel();
      }
      GMTrace.o(13458414239744L, 100273);
    }
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(13457877368832L, 100269);
      if ((paramContext == null) || (paramIntent == null))
      {
        GMTrace.o(13457877368832L, 100269);
        return;
      }
      boolean bool = paramIntent.getBooleanExtra("MMBoot_Bump", false);
      w.i("MicroMsg.AlarmReceiver", "[ALARM NOTIFICATION] bump:" + bool);
      if (bool)
      {
        aw(paramContext);
        GMTrace.o(13457877368832L, 100269);
        return;
      }
      if (!b.r(paramContext, "alarm"))
      {
        az(paramContext);
        w.bPM();
      }
      GMTrace.o(13457877368832L, 100269);
    }
  }
  
  @JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
  public static class BootReceiver
    extends BroadcastReceiver
  {
    public BootReceiver()
    {
      GMTrace.i(13455595667456L, 100252);
      GMTrace.o(13455595667456L, 100252);
    }
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(13455729885184L, 100253);
      if (paramContext == null)
      {
        GMTrace.o(13455729885184L, 100253);
        return;
      }
      new StringBuilder("system booted, pid=").append(Process.myPid());
      if (!b.r(paramContext, "auto"))
      {
        MMReceivers.AlarmReceiver.az(paramContext);
        w.bPM();
      }
      GMTrace.o(13455729885184L, 100253);
    }
  }
  
  @JgClassChecked(author=20, fComment="checked", lastDate="20140819", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
  public static class ConnectionReceiver
    extends BroadcastReceiver
  {
    public ConnectionReceiver()
    {
      GMTrace.i(13459219546112L, 100279);
      GMTrace.o(13459219546112L, 100279);
    }
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(13459353763840L, 100280);
      if (paramContext == null)
      {
        GMTrace.o(13459353763840L, 100280);
        return;
      }
      w.i("MicroMsg.ConnectionReceiver", "onReceive threadID: " + Thread.currentThread().getId());
      if (!b.r(paramContext, "connection"))
      {
        MMReceivers.AlarmReceiver.az(paramContext);
        w.bPM();
        GMTrace.o(13459353763840L, 100280);
        return;
      }
      if (aa.OX() == null)
      {
        GMTrace.o(13459353763840L, 100280);
        return;
      }
      paramIntent = (ConnectivityManager)paramContext.getSystemService("connectivity");
      paramContext = null;
      try
      {
        paramIntent = paramIntent.getActiveNetworkInfo();
        paramContext = paramIntent;
      }
      catch (Exception paramIntent)
      {
        for (;;)
        {
          w.e("MicroMsg.ConnectionReceiver", "getActiveNetworkInfo failed. exception: %s", new Object[] { paramIntent.getMessage() });
          continue;
          paramIntent = paramContext.getState();
        }
        w.i("MicroMsg.ConnectionReceiver", "NetworkAvailable: true");
        paramIntent = aa.OX();
        paramContext.getTypeName();
        paramContext.getSubtypeName();
        paramIntent.aD(true);
        GMTrace.o(13459353763840L, 100280);
      }
      if ((paramContext == null) || (paramContext.getState() != NetworkInfo.State.CONNECTED)) {
        if (paramContext == null)
        {
          paramIntent = "null";
          w.i("MicroMsg.ConnectionReceiver", "NetworkAvailable: false, state:%s", new Object[] { paramIntent });
          paramIntent = aa.OX();
          if (paramContext != null) {
            paramContext.getTypeName();
          }
          if (paramContext != null) {
            paramContext.getSubtypeName();
          }
          paramIntent.aD(false);
          GMTrace.o(13459353763840L, 100280);
          return;
        }
      }
    }
  }
  
  public static class ExdeviceProcessReceiver
    extends BroadcastReceiver
  {
    private static MMReceivers.a fIS;
    
    static
    {
      GMTrace.i(13456535191552L, 100259);
      fIS = null;
      GMTrace.o(13456535191552L, 100259);
    }
    
    public ExdeviceProcessReceiver()
    {
      GMTrace.i(13456132538368L, 100256);
      GMTrace.o(13456132538368L, 100256);
    }
    
    public static void a(MMReceivers.a parama)
    {
      GMTrace.i(13456266756096L, 100257);
      fIS = parama;
      GMTrace.o(13456266756096L, 100257);
    }
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(13456400973824L, 100258);
      if (fIS != null) {
        fIS.onReceive(paramContext, paramIntent);
      }
      GMTrace.o(13456400973824L, 100258);
    }
  }
  
  public static class SandBoxProcessReceiver
    extends BroadcastReceiver
  {
    private static MMReceivers.a fIS;
    
    static
    {
      GMTrace.i(13457608933376L, 100267);
      fIS = null;
      GMTrace.o(13457608933376L, 100267);
    }
    
    public SandBoxProcessReceiver()
    {
      GMTrace.i(13457206280192L, 100264);
      GMTrace.o(13457206280192L, 100264);
    }
    
    public static void a(MMReceivers.a parama)
    {
      GMTrace.i(13457340497920L, 100265);
      fIS = parama;
      GMTrace.o(13457340497920L, 100265);
    }
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(13457474715648L, 100266);
      if (fIS != null) {
        fIS.onReceive(paramContext, paramIntent);
      }
      GMTrace.o(13457474715648L, 100266);
    }
  }
  
  public static class ToolsProcessReceiver
    extends BroadcastReceiver
  {
    private static MMReceivers.a fIS;
    
    static
    {
      GMTrace.i(13461501247488L, 100296);
      fIS = null;
      GMTrace.o(13461501247488L, 100296);
    }
    
    public ToolsProcessReceiver()
    {
      GMTrace.i(13461098594304L, 100293);
      GMTrace.o(13461098594304L, 100293);
    }
    
    public static void a(MMReceivers.a parama)
    {
      GMTrace.i(13461232812032L, 100294);
      fIS = parama;
      GMTrace.o(13461232812032L, 100294);
    }
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(13461367029760L, 100295);
      if (fIS != null) {
        fIS.onReceive(paramContext, paramIntent);
      }
      GMTrace.o(13461367029760L, 100295);
    }
  }
  
  public static abstract interface a
  {
    public abstract void onReceive(Context paramContext, Intent paramIntent);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\MMReceivers.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */