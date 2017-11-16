package com.d.a.a;

import android.net.wifi.WifiManager;
import android.os.Handler;

final class ac
  extends e
{
  private final WifiManager aKk;
  
  ac(WifiManager paramWifiManager, Handler paramHandler)
  {
    super(paramHandler);
    this.aKk = paramWifiManager;
  }
  
  final void nG()
  {
    this.aKk.startScan();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */