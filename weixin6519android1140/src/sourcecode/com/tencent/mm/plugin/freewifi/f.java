package com.tencent.mm.plugin.freewifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class f
{
  private WifiManager aKk;
  private Context context;
  public Condition epJ;
  public Lock lnP;
  private BroadcastReceiver lnS;
  private int loc;
  
  public f(Context paramContext)
  {
    GMTrace.i(7128571969536L, 53112);
    this.context = paramContext;
    this.lnP = new ReentrantLock();
    this.epJ = this.lnP.newCondition();
    this.aKk = ((WifiManager)ab.getContext().getSystemService("wifi"));
    this.loc = 10;
    GMTrace.o(7128571969536L, 53112);
  }
  
  public final void aAr()
  {
    GMTrace.i(7128840404992L, 53114);
    try
    {
      this.context.unregisterReceiver(this.lnS);
      GMTrace.o(7128840404992L, 53114);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      GMTrace.o(7128840404992L, 53114);
    }
  }
  
  public final int aAt()
  {
    GMTrace.i(7128706187264L, 53113);
    if (3 == this.aKk.getWifiState())
    {
      GMTrace.o(7128706187264L, 53113);
      return 0;
    }
    this.lnS = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(7265071398912L, 54129);
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(paramAnonymousIntent.getAction()))
        {
          int i = paramAnonymousIntent.getIntExtra("wifi_state", 0);
          w.i("MicroMsg.FreeWifi.EnableWifiHelper", "wifi enabled state=" + i);
          if (i == 3) {
            try
            {
              f.this.lnP.lock();
              f.this.epJ.signalAll();
              f.this.aAr();
              f.this.lnP.unlock();
              GMTrace.o(7265071398912L, 54129);
              return;
            }
            finally
            {
              f.this.aAr();
              f.this.lnP.unlock();
            }
          }
        }
        GMTrace.o(7265071398912L, 54129);
      }
    };
    try
    {
      this.lnP.lock();
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
      this.context.registerReceiver(this.lnS, localIntentFilter);
      this.aKk.setWifiEnabled(true);
      boolean bool = this.epJ.await(this.loc, TimeUnit.SECONDS);
      if (bool)
      {
        aAr();
        this.lnP.unlock();
        GMTrace.o(7128706187264L, 53113);
        return 0;
      }
      aAr();
      this.lnP.unlock();
      GMTrace.o(7128706187264L, 53113);
      return 1;
    }
    catch (InterruptedException localInterruptedException)
    {
      localInterruptedException = localInterruptedException;
      aAr();
      this.lnP.unlock();
      GMTrace.o(7128706187264L, 53113);
      return 2;
    }
    finally
    {
      localObject = finally;
      aAr();
      this.lnP.unlock();
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */