package com.d.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Handler;
import java.util.List;

final class ab
  extends c
{
  private static ab aKd;
  WifiManager aDQ;
  private final BroadcastReceiver aKe = new BroadcastReceiver()
  {
    public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if (paramAnonymousIntent.getAction().equals("android.net.wifi.SCAN_RESULTS"))
      {
        paramAnonymousContext = ab.this;
        try
        {
          paramAnonymousIntent = paramAnonymousContext.aDQ.getScanResults();
          if ((paramAnonymousIntent == null) || (paramAnonymousIntent.isEmpty())) {
            throw new Exception("WifiScanMsg: null or empty scan result list");
          }
          paramAnonymousContext.c(new ab.a(paramAnonymousIntent));
          return;
        }
        catch (Exception paramAnonymousContext) {}
      }
    }
  };
  private final IntentFilter aKf = new IntentFilter("android.net.wifi.SCAN_RESULTS");
  private ac aKg;
  private long aKh = 10000L;
  
  private boolean isAvailable()
  {
    return this.aDQ != null;
  }
  
  static ab oh()
  {
    if (aKd == null) {
      aKd = new ab();
    }
    return aKd;
  }
  
  final void P(Context paramContext)
  {
    this.aDQ = ((WifiManager)paramContext.getSystemService("wifi"));
  }
  
  final void Q(Context paramContext)
  {
    if (!isAvailable()) {
      return;
    }
    paramContext.unregisterReceiver(this.aKe);
    this.aKg.stop();
  }
  
  final void a(Context paramContext, Handler paramHandler, d.a parama)
  {
    if (!isAvailable()) {
      return;
    }
    paramContext.registerReceiver(this.aKe, this.aKf, null, paramHandler);
    this.aKh = parama.aDL;
    parama = this.aDQ;
    if (paramHandler != null) {}
    for (;;)
    {
      this.aKg = new ac(parama, paramHandler);
      this.aKg.a(this.aKh, 0L);
      return;
      paramHandler = new Handler(paramContext.getMainLooper());
    }
  }
  
  final void a(Handler paramHandler, d.a parama)
  {
    if (parama != null) {}
    for (;;)
    {
      try
      {
        super.a(paramHandler, parama);
        return;
      }
      finally {}
      parama = new d.a(10000L);
    }
  }
  
  final void nC() {}
  
  final void nD()
  {
    if ((!isAvailable()) || (!this.aDI) || (this.aKh >= 90000L)) {
      return;
    }
    this.aKg.a(90000L, 0L);
  }
  
  final void nE()
  {
    if ((!isAvailable()) || (!this.aDI) || (this.aKh >= 90000L)) {
      return;
    }
    this.aKg.a(this.aKh, 0L);
  }
  
  static final class a
    extends p
  {
    final List<ScanResult> aKj;
    
    a(List<ScanResult> paramList)
    {
      super();
      this.aKj = paramList;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */