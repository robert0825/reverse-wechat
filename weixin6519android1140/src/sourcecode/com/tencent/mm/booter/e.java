package com.tencent.mm.booter;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.aa;
import com.tencent.mm.sdk.platformtools.w;

public final class e
{
  NetworkInfo fIV;
  WifiInfo fIW;
  
  public e()
  {
    GMTrace.i(13464588255232L, 100319);
    this.fIV = null;
    this.fIW = null;
    GMTrace.o(13464588255232L, 100319);
  }
  
  final boolean rl()
  {
    GMTrace.i(13464722472960L, 100320);
    try
    {
      Object localObject = (ConnectivityManager)aa.getContext().getSystemService("connectivity");
      if (localObject == null)
      {
        w.w("MicroMsg.NetworkChangeMgr", "can't get ConnectivityManager");
        this.fIV = null;
        this.fIW = null;
        GMTrace.o(13464722472960L, 100320);
        return false;
      }
      try
      {
        localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
        if (localObject == null)
        {
          w.w("MicroMsg.NetworkChangeMgr", "ActiveNetwork is null, has no network");
          this.fIV = null;
          this.fIW = null;
          GMTrace.o(13464722472960L, 100320);
          return false;
        }
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          w.e("MicroMsg.NetworkChangeMgr", "getActiveNetworkInfo failed.");
          localNetworkInfo = null;
        }
        if (localNetworkInfo.getType() == 1) {}
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label307;
          }
          localWifiInfo = ((WifiManager)aa.getContext().getSystemService("wifi")).getConnectionInfo();
          if ((localWifiInfo == null) || (this.fIW == null) || (!this.fIW.getBSSID().equals(localWifiInfo.getBSSID())) || (!this.fIW.getSSID().equals(localWifiInfo.getSSID())) || (this.fIW.getNetworkId() != localWifiInfo.getNetworkId())) {
            break;
          }
          w.w("MicroMsg.NetworkChangeMgr", "Same Wifi, do not NetworkChanged");
          GMTrace.o(13464722472960L, 100320);
          return false;
        }
        w.d("MicroMsg.NetworkChangeMgr", "New Wifi Info:%s", new Object[] { localWifiInfo });
        w.d("MicroMsg.NetworkChangeMgr", "OldWifi Info:%s", new Object[] { this.fIW });
      }
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        NetworkInfo localNetworkInfo;
        int i;
        w.printErrStackTrace("MicroMsg.NetworkChangeMgr", localException2, "", new Object[0]);
        continue;
        WifiInfo localWifiInfo = null;
      }
    }
    if (i == 0)
    {
      w.d("MicroMsg.NetworkChangeMgr", "New NetworkInfo:%s", new Object[] { localNetworkInfo });
      if (this.fIV != null) {
        w.d("MicroMsg.NetworkChangeMgr", "Old NetworkInfo:%s", new Object[] { this.fIV });
      }
    }
    this.fIV = localNetworkInfo;
    this.fIW = localWifiInfo;
    GMTrace.o(13464722472960L, 100320);
    return true;
    label307:
    if ((this.fIV != null) && (this.fIV.getExtraInfo() != null) && (localNetworkInfo.getExtraInfo() != null) && (this.fIV.getExtraInfo().equals(localNetworkInfo.getExtraInfo())) && (this.fIV.getSubtype() == localNetworkInfo.getSubtype()) && (this.fIV.getType() == localNetworkInfo.getType()))
    {
      w.w("MicroMsg.NetworkChangeMgr", "Same Network, do not NetworkChanged");
      GMTrace.o(13464722472960L, 100320);
      return false;
    }
    if ((this.fIV != null) && (this.fIV.getExtraInfo() == null) && (localNetworkInfo.getExtraInfo() == null) && (this.fIV.getSubtype() == localNetworkInfo.getSubtype()) && (this.fIV.getType() == localNetworkInfo.getType()))
    {
      w.w("MicroMsg.NetworkChangeMgr", "Same Network, do not NetworkChanged");
      GMTrace.o(13464722472960L, 100320);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */