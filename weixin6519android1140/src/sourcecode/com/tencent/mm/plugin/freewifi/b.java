package com.tencent.mm.plugin.freewifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class b
{
  private WifiManager aKk;
  private Context context;
  public Condition epJ;
  private long guG;
  public Lock lnP;
  public boolean lnQ;
  public boolean lnR;
  private BroadcastReceiver lnS;
  public String ssid;
  
  public b(String paramString, Context paramContext)
  {
    GMTrace.i(7258628947968L, 54081);
    this.lnQ = false;
    this.lnR = false;
    this.guG = 15000L;
    this.ssid = paramString;
    this.lnP = new ReentrantLock();
    this.epJ = this.lnP.newCondition();
    this.aKk = ((WifiManager)paramContext.getSystemService("wifi"));
    this.context = paramContext;
    GMTrace.o(7258628947968L, 54081);
  }
  
  private void aAr()
  {
    GMTrace.i(7258897383424L, 54083);
    try
    {
      this.context.unregisterReceiver(this.lnS);
      GMTrace.o(7258897383424L, 54083);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      GMTrace.o(7258897383424L, 54083);
    }
  }
  
  public final int aAs()
  {
    GMTrace.i(7258763165696L, 54082);
    if ((((ConnectivityManager)this.context.getSystemService("connectivity")).getNetworkInfo(1).isConnected()) && (this.ssid.equals(d.aAY())))
    {
      GMTrace.o(7258763165696L, 54082);
      return 0;
    }
    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
      throw new RuntimeException("ConnectNetworkHelper组件不能在主线程中运行。");
    }
    this.lnS = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(7265339834368L, 54131);
        if (paramAnonymousIntent.getAction().equals("android.net.wifi.STATE_CHANGE"))
        {
          paramAnonymousContext = (NetworkInfo)paramAnonymousIntent.getParcelableExtra("networkInfo");
          if (paramAnonymousContext != null) {
            w.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "WifiManager.NETWORK_STATE_CHANGED_ACTION broadcastReceiver, targetssid=%s, Utils.getConnectedWifiSsid(TAG)=%s,networkInfo.isConnected()=%b, networkInfo.isConnectedOrConnecting()=%b, networkInfo.getExtraInfo()=%s, networkInfo.getType()=%d, networkInfo.toString()=%s", new Object[] { b.this.ssid, m.ys("MicroMsg.FreeWifi.ConnectNetworkHelper"), Boolean.valueOf(paramAnonymousContext.isConnected()), Boolean.valueOf(paramAnonymousContext.isConnectedOrConnecting()), paramAnonymousContext.getExtraInfo(), Integer.valueOf(paramAnonymousContext.getType()), paramAnonymousContext.toString() });
          }
          if ((paramAnonymousContext != null) && (paramAnonymousContext.isConnected()) && (paramAnonymousContext.getType() == 1) && (b.this.ssid.equals(m.yq(paramAnonymousContext.getExtraInfo())))) {
            try
            {
              b.this.lnP.lock();
              b.this.lnQ = true;
              w.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "WifiManager.NETWORK_STATE_CHANGED_ACTION broadcastreceiver signal connected state.");
              b.this.epJ.signalAll();
              b.this.lnP.unlock();
              GMTrace.o(7265339834368L, 54131);
              return;
            }
            finally
            {
              b.this.lnP.unlock();
            }
          }
          GMTrace.o(7265339834368L, 54131);
          return;
        }
        if (paramAnonymousIntent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))
        {
          paramAnonymousContext = (NetworkInfo)paramAnonymousIntent.getParcelableExtra("networkInfo");
          if (paramAnonymousContext != null) {
            w.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "ConnectivityManager.CONNECTIVITY_ACTION broadcastReceiver, targetssid=%s, Utils.getConnectedWifiSsid(TAG)=%s,networkInfo.isConnected()=%b, networkInfo.isConnectedOrConnecting()=%b, networkInfo.getExtraInfo()=%s, networkInfo.getType()=%d, networkInfo.toString()=%s", new Object[] { b.this.ssid, m.ys("MicroMsg.FreeWifi.ConnectNetworkHelper"), Boolean.valueOf(paramAnonymousContext.isConnected()), Boolean.valueOf(paramAnonymousContext.isConnectedOrConnecting()), paramAnonymousContext.getExtraInfo(), Integer.valueOf(paramAnonymousContext.getType()), paramAnonymousContext.toString() });
          }
          if ((paramAnonymousContext != null) && (paramAnonymousContext.isConnected()) && (paramAnonymousContext.getType() == 1) && (b.this.ssid.equals(m.yq(paramAnonymousContext.getExtraInfo())))) {
            try
            {
              b.this.lnP.lock();
              b.this.lnR = true;
              w.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "ConnectivityManager.CONNECTIVITY_ACTION broadcastreceiver signal connected state.");
              b.this.epJ.signalAll();
              b.this.lnP.unlock();
              GMTrace.o(7265339834368L, 54131);
              return;
            }
            finally
            {
              b.this.lnP.unlock();
            }
          }
        }
        GMTrace.o(7265339834368L, 54131);
      }
    };
    try
    {
      this.lnP.lock();
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
      localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
      this.context.registerReceiver(this.lnS, localIntentFilter);
      if (!this.aKk.isWifiEnabled())
      {
        i = new f(this.context).aAt();
        w.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "enable ret = " + i);
        if (i != 0)
        {
          aAr();
          this.lnP.unlock();
          GMTrace.o(7258763165696L, 54082);
          return i;
        }
      }
      int i = d.yz(this.ssid);
      if (i != 0)
      {
        aAr();
        aAr();
        this.lnP.unlock();
        GMTrace.o(7258763165696L, 54082);
        return i;
      }
      boolean bool1 = false;
      boolean bool2;
      for (;;)
      {
        try
        {
          if (this.lnQ)
          {
            bool2 = bool1;
            if (this.lnR) {
              break;
            }
          }
          long l = System.currentTimeMillis();
          bool1 = this.epJ.await(this.guG, TimeUnit.MILLISECONDS);
          bool2 = bool1;
          if (!bool1) {
            break;
          }
          l = System.currentTimeMillis() - l;
          this.guG -= l;
          w.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "costMillis=" + l + "; left timeout=" + this.guG);
          if (this.guG > 0L)
          {
            l = this.guG;
            this.guG = l;
          }
          else
          {
            l = 3000L;
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          w.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "desc=ConnectNetworkHelper encounter interrupted exception. msg=%s", new Object[] { localInterruptedException.getMessage() });
          aAr();
          this.lnP.unlock();
          GMTrace.o(7258763165696L, 54082);
          return -17;
        }
      }
      if (!bool2)
      {
        aAr();
        this.lnP.unlock();
        GMTrace.o(7258763165696L, 54082);
        return -16;
      }
      aAr();
      this.lnP.unlock();
      GMTrace.o(7258763165696L, 54082);
      return 0;
    }
    finally
    {
      aAr();
      this.lnP.unlock();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */