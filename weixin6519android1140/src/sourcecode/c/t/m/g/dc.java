package c.t.m.g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings.Secure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

final class dc
  extends BroadcastReceiver
{
  private static Handler f;
  private static final Comparator<ScanResult> m = new Comparator() {};
  private volatile boolean a;
  private final cj b;
  private final WifiManager c;
  private long d;
  private HashSet<String> e;
  private List<ScanResult> g;
  private final Runnable h;
  private boolean i;
  private boolean j;
  private long k = 30000L;
  private final Object l = new Object();
  
  public dc(cj paramcj)
  {
    this.b = paramcj;
    this.c = paramcj.c();
    this.e = new HashSet();
    this.i = true;
    this.h = new Runnable()
    {
      public final void run()
      {
        dc.a(dc.this);
        dc.this.b(dc.b(dc.this));
        new StringBuilder("Wifi_Scan_Interval:").append(dc.b(dc.this));
      }
    };
  }
  
  private void a(List<ScanResult> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0)) {
      e();
    }
    for (;;)
    {
      long l1 = this.d;
      dy.a(this.c);
      paramList = new dj(paramList, l1);
      this.b.c(paramList);
      return;
      if (dy.a)
      {
        dy.a = false;
        e();
      }
    }
  }
  
  private boolean c()
  {
    if ((!dy.b(this.b)) || (this.j)) {
      return false;
    }
    return dy.b(this.c);
  }
  
  private void d()
  {
    if (this.e == null) {
      this.e = new HashSet();
    }
    ScanResult localScanResult;
    if (this.e.size() == 0)
    {
      localIterator = this.g.iterator();
      while (localIterator.hasNext())
      {
        localScanResult = (ScanResult)localIterator.next();
        this.e.add(localScanResult.BSSID + localScanResult.level);
      }
      this.d = System.currentTimeMillis();
      a(this.g);
    }
    int n;
    do
    {
      return;
      n = this.e.size();
      if (n != this.g.size())
      {
        this.e.clear();
        localIterator = this.g.iterator();
        while (localIterator.hasNext())
        {
          localScanResult = (ScanResult)localIterator.next();
          this.e.add(localScanResult.BSSID + localScanResult.level);
        }
        this.d = System.currentTimeMillis();
        a(this.g);
        return;
      }
      localIterator = this.g.iterator();
      while (localIterator.hasNext())
      {
        localScanResult = (ScanResult)localIterator.next();
        this.e.add(localScanResult.BSSID + localScanResult.level);
      }
    } while (n == this.e.size());
    this.e.clear();
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext())
    {
      localScanResult = (ScanResult)localIterator.next();
      this.e.add(localScanResult.BSSID + localScanResult.level);
    }
    this.d = System.currentTimeMillis();
    a(this.g);
  }
  
  private void e()
  {
    n = 1;
    i1 = dy.a(this.c);
    if (i1 == 3) {
      b(0L);
    }
    for (;;)
    {
      i1 = n;
      try
      {
        if (Build.VERSION.SDK_INT >= 23)
        {
          int i2 = Settings.Secure.getInt(this.b.a.getContentResolver(), "location_mode");
          i1 = n;
          if (i2 == 0) {
            i1 = 5;
          }
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Message localMessage;
          i1 = n;
        }
      }
      localMessage = new Message();
      localMessage.what = 12999;
      localMessage.arg1 = 12001;
      localMessage.arg2 = i1;
      this.b.c(localMessage);
      return;
      if (i1 == 1)
      {
        i1 = 0;
        n = i1;
        if (!dy.b(this.b))
        {
          if (this.g != null) {
            this.g.clear();
          }
          f.sendEmptyMessage(555);
          n = i1;
        }
      }
      else
      {
        n = -1;
      }
    }
  }
  
  public final void a()
  {
    synchronized (this.l)
    {
      if (!this.a) {
        return;
      }
      this.a = false;
      f.removeCallbacksAndMessages(null);
    }
    try
    {
      this.b.a.unregisterReceiver(this);
      this.e = null;
      if (this.g != null) {
        this.g.clear();
      }
      if (this.e != null) {
        this.e.clear();
      }
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final void a(long paramLong)
  {
    this.k = paramLong;
  }
  
  public final void a(Handler paramHandler, boolean paramBoolean)
  {
    if (this.a) {}
    for (;;)
    {
      return;
      this.a = true;
      this.j = paramBoolean;
      f = paramHandler;
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
      localIntentFilter.addAction("android.net.wifi.SCAN_RESULTS");
      try
      {
        this.b.a.registerReceiver(this, localIntentFilter, null, paramHandler);
        if (this.j) {
          continue;
        }
        b(0L);
        return;
      }
      catch (Exception paramHandler)
      {
        for (;;) {}
      }
    }
  }
  
  public final int b()
  {
    if (c()) {
      return 0;
    }
    return 1;
  }
  
  public final void b(long paramLong)
  {
    Handler localHandler = f;
    Runnable localRunnable = this.h;
    localHandler.removeCallbacks(localRunnable);
    localHandler.postDelayed(localRunnable, paramLong);
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    long l1 = 120000L;
    int n = 1;
    if (paramIntent == null) {
      return;
    }
    for (;;)
    {
      long l2;
      List localList;
      try
      {
        synchronized (this.l)
        {
          if (this.j)
          {
            l2 = ch.a().c("up_daemon_delay");
            if (l2 >= 120000L) {
              break label528;
            }
            new StringBuilder("the daemonLocation,so we delay long time upload:").append(l1).append(",").append(System.currentTimeMillis()).append(",").append(this.d);
            if (System.currentTimeMillis() - this.d >= l1) {
              this.d = System.currentTimeMillis();
            }
          }
          else
          {
            paramContext = paramIntent.getAction();
            if ("android.net.wifi.WIFI_STATE_CHANGED".equals(paramContext)) {
              e();
            }
            if (("android.net.wifi.WIFI_STATE_CHANGED".equals(paramContext)) || ("android.net.wifi.SCAN_RESULTS".equals(paramContext)))
            {
              localList = dy.c(this.c);
              if ((localList == null) || (localList.size() <= 0)) {
                break label504;
              }
              if ((this.i) && (ch.a().d("up_wifis")))
              {
                if ((localList != null) && (localList.size() != 0)) {
                  break label283;
                }
                this.i = false;
              }
              this.g = new ArrayList(localList);
              dd.a(this.g);
              if ((this.g != null) && (this.g.size() > 0))
              {
                Collections.sort(this.g, m);
                d();
              }
            }
            return;
          }
        }
      }
      catch (Exception paramContext)
      {
        paramContext.toString();
        return;
      }
      return;
      label283:
      l1 = System.currentTimeMillis() / 86400000L;
      int i1 = (int)(l1 % 5L);
      try
      {
        l1 = Long.parseLong(this.b.h().a().substring(1));
        n = (int)(l1 % 5L) + 1;
      }
      catch (Exception paramContext)
      {
        SharedPreferences localSharedPreferences;
        boolean bool;
        label504:
        for (;;) {}
      }
      localSharedPreferences = this.b.a.getSharedPreferences("LocationSDK", 0);
      if (i1 == n)
      {
        bool = localSharedPreferences.getBoolean("flag_wf", false);
        if (!bool) {
          try
          {
            Message localMessage = f.obtainMessage(554);
            paramIntent = localMessage.getData();
            paramContext = paramIntent;
            if (paramIntent == null) {
              paramContext = new Bundle();
            }
            paramContext.putString("WIFIS", dy.a(localList));
            localMessage.setData(paramContext);
            f.sendMessageDelayed(localMessage, 3000L);
            localSharedPreferences.edit().putBoolean("flag_wf", true).apply();
          }
          catch (Exception paramContext)
          {
            localSharedPreferences.edit().putBoolean("flag_wf", true).apply();
          }
        }
      }
      else
      {
        localSharedPreferences.edit().putBoolean("flag_wf", false).apply();
        continue;
        if (this.i)
        {
          this.b.c(dj.a);
          continue;
          label528:
          l1 = l2;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */