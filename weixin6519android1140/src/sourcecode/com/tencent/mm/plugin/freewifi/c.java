package com.tencent.mm.plugin.freewifi;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.wifi.WifiManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class c
{
  public WifiManager aKk;
  public Activity activity;
  public boolean connected;
  public Condition epJ;
  public long guG;
  public Lock lnP;
  public BroadcastReceiver lnS;
  public boolean lnW;
  public String lnX;
  public String ssid;
  
  public c(String paramString1, Activity paramActivity, String paramString2)
  {
    GMTrace.i(7259300036608L, 54086);
    this.connected = false;
    this.lnW = false;
    this.activity = paramActivity;
    this.guG = 30000L;
    this.ssid = paramString1;
    this.lnX = paramString2;
    this.lnP = new ReentrantLock();
    this.epJ = this.lnP.newCondition();
    this.aKk = ((WifiManager)ab.getContext().getSystemService("wifi"));
    GMTrace.o(7259300036608L, 54086);
  }
  
  public final void aAr()
  {
    GMTrace.i(7259434254336L, 54087);
    try
    {
      this.activity.unregisterReceiver(this.lnS);
      GMTrace.o(7259434254336L, 54087);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      GMTrace.o(7259434254336L, 54087);
    }
  }
  
  public static abstract interface a
  {
    public abstract void nM(int paramInt);
    
    public abstract void onSuccess();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */