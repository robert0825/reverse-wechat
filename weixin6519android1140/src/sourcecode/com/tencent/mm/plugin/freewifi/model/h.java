package com.tencent.mm.plugin.freewifi.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class h
{
  boolean jkq;
  public a lqs;
  public BroadcastReceiver lqt;
  
  public h()
  {
    GMTrace.i(7130853670912L, 53129);
    this.jkq = false;
    this.lqt = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        int i = 0;
        GMTrace.i(7130451017728L, 53126);
        if ((paramAnonymousContext == null) || (paramAnonymousIntent == null))
        {
          w.e("MicroMsg.FreeWifi.WifiScanReceiver", "context is null or intent null");
          GMTrace.o(7130451017728L, 53126);
          return;
        }
        h.this.jkq = false;
        paramAnonymousContext.unregisterReceiver(h.this.lqt);
        if ("android.net.wifi.SCAN_RESULTS".equals(paramAnonymousIntent.getAction()))
        {
          paramAnonymousContext = (WifiManager)ab.getContext().getSystemService("wifi");
          if (paramAnonymousContext == null)
          {
            w.e("MicroMsg.FreeWifi.WifiScanReceiver", "bran, WifiScanReceiver onReceive, get wifi manager failed");
            GMTrace.o(7130451017728L, 53126);
            return;
          }
        }
        try
        {
          paramAnonymousContext = paramAnonymousContext.getScanResults();
          localh = h.this;
          paramAnonymousIntent = paramAnonymousContext;
          if (paramAnonymousContext != null)
          {
            if (paramAnonymousContext.size() <= 20) {
              paramAnonymousIntent = paramAnonymousContext;
            }
          }
          else
          {
            paramAnonymousContext = new StringBuilder("wifiManager scanResults size = ");
            if (paramAnonymousIntent != null) {
              break label249;
            }
            w.i("MicroMsg.FreeWifi.WifiScanReceiver", i);
            if (h.this.lqs != null) {
              h.this.lqs.aG(paramAnonymousIntent);
            }
            GMTrace.o(7130451017728L, 53126);
            return;
          }
        }
        catch (SecurityException paramAnonymousIntent)
        {
          for (;;)
          {
            h localh;
            paramAnonymousContext = new ArrayList(0);
            w.e("MicroMsg.FreeWifi.WifiScanReceiver", "wifiManager.getScanResults() throws security exception. " + paramAnonymousIntent.getMessage());
            continue;
            Collections.sort(paramAnonymousContext, new h.2(localh));
            paramAnonymousIntent = paramAnonymousContext.subList(0, 20);
            continue;
            label249:
            i = paramAnonymousIntent.size();
          }
        }
      }
    };
    GMTrace.o(7130853670912L, 53129);
  }
  
  public final boolean a(a parama)
  {
    GMTrace.i(7130987888640L, 53130);
    if (this.jkq)
    {
      GMTrace.o(7130987888640L, 53130);
      return false;
    }
    this.jkq = true;
    this.lqs = parama;
    parama = (WifiManager)ab.getContext().getSystemService("wifi");
    if (parama == null)
    {
      w.e("MicroMsg.FreeWifi.WifiScanReceiver", "wifiDetectingTask, get wifi manager failed");
      GMTrace.o(7130987888640L, 53130);
      return false;
    }
    IntentFilter localIntentFilter = new IntentFilter("android.net.wifi.SCAN_RESULTS");
    ab.getContext().registerReceiver(this.lqt, localIntentFilter);
    parama.startScan();
    GMTrace.o(7130987888640L, 53130);
    return true;
  }
  
  public static abstract interface a
  {
    public abstract void aG(List<ScanResult> paramList);
  }
  
  private static final class b
  {
    public static h lqv;
    
    static
    {
      GMTrace.i(7137832992768L, 53181);
      lqv = new h();
      GMTrace.o(7137832992768L, 53181);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */