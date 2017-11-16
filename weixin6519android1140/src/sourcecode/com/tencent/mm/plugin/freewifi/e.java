package com.tencent.mm.plugin.freewifi;

import android.app.Activity;
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

public final class e
{
  private WifiManager aKk;
  private Activity activity;
  public Condition epJ;
  public Lock lnP;
  private BroadcastReceiver lnS;
  private int loc;
  
  public e(Activity paramActivity)
  {
    GMTrace.i(7127766663168L, 53106);
    this.activity = paramActivity;
    this.lnP = new ReentrantLock();
    this.epJ = this.lnP.newCondition();
    this.aKk = ((WifiManager)ab.getContext().getSystemService("wifi"));
    this.loc = 10;
    GMTrace.o(7127766663168L, 53106);
  }
  
  public final void aAr()
  {
    GMTrace.i(7128035098624L, 53108);
    try
    {
      this.activity.unregisterReceiver(this.lnS);
      GMTrace.o(7128035098624L, 53108);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      GMTrace.o(7128035098624L, 53108);
    }
  }
  
  public final int aAt()
  {
    GMTrace.i(7127900880896L, 53107);
    if (3 == this.aKk.getWifiState())
    {
      GMTrace.o(7127900880896L, 53107);
      return 0;
    }
    this.lnS = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(7148973064192L, 53264);
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(paramAnonymousIntent.getAction()))
        {
          int i = paramAnonymousIntent.getIntExtra("wifi_state", 0);
          w.i("MicroMsg.FreeWifi.EnableWifiHelper", "wifi enabled state=" + i);
          if (i == 3) {
            try
            {
              e.this.lnP.lock();
              e.this.epJ.signalAll();
              e.this.aAr();
              e.this.lnP.unlock();
              GMTrace.o(7148973064192L, 53264);
              return;
            }
            finally
            {
              e.this.aAr();
              e.this.lnP.unlock();
            }
          }
        }
        GMTrace.o(7148973064192L, 53264);
      }
    };
    try
    {
      this.lnP.lock();
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
      this.activity.registerReceiver(this.lnS, localIntentFilter);
      this.aKk.setWifiEnabled(true);
      boolean bool = this.epJ.await(this.loc, TimeUnit.SECONDS);
      if (bool)
      {
        aAr();
        this.lnP.unlock();
        GMTrace.o(7127900880896L, 53107);
        return 0;
      }
      aAr();
      this.lnP.unlock();
      GMTrace.o(7127900880896L, 53107);
      return 1;
    }
    catch (InterruptedException localInterruptedException)
    {
      localInterruptedException = localInterruptedException;
      aAr();
      this.lnP.unlock();
      GMTrace.o(7127900880896L, 53107);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */