package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.gmtrace.GMTrace;
import java.util.List;

public final class c
{
  public static WifiManager aDQ;
  
  public static int addNetwork(WifiConfiguration paramWifiConfiguration)
  {
    GMTrace.i(19819126587392L, 147664);
    int i;
    try
    {
      i = aDQ.addNetwork(paramWifiConfiguration);
      GMTrace.o(19819126587392L, 147664);
      return i;
    }
    catch (Throwable paramWifiConfiguration)
    {
      paramWifiConfiguration.toString();
      i = d.ipg;
      GMTrace.o(19819126587392L, 147664);
    }
    return i;
  }
  
  public static boolean disableNetwork(int paramInt)
  {
    GMTrace.i(19819529240576L, 147667);
    try
    {
      boolean bool = aDQ.disableNetwork(paramInt);
      GMTrace.o(19819529240576L, 147667);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.toString();
      GMTrace.o(19819529240576L, 147667);
    }
    return false;
  }
  
  public static List<WifiConfiguration> getConfiguredNetworks()
  {
    GMTrace.i(19818992369664L, 147663);
    try
    {
      List localList = aDQ.getConfiguredNetworks();
      GMTrace.o(19818992369664L, 147663);
      return localList;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.toString();
      GMTrace.o(19818992369664L, 147663);
    }
    return null;
  }
  
  public static WifiInfo getConnectionInfo()
  {
    GMTrace.i(19819797676032L, 147669);
    try
    {
      WifiInfo localWifiInfo = aDQ.getConnectionInfo();
      GMTrace.o(19819797676032L, 147669);
      return localWifiInfo;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.toString();
      GMTrace.o(19819797676032L, 147669);
    }
    return null;
  }
  
  public static List<ScanResult> getScanResults()
  {
    GMTrace.i(19819931893760L, 147670);
    try
    {
      List localList = aDQ.getScanResults();
      GMTrace.o(19819931893760L, 147670);
      return localList;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.toString();
      GMTrace.o(19819931893760L, 147670);
    }
    return null;
  }
  
  public static boolean iS(int paramInt)
  {
    GMTrace.i(19819395022848L, 147666);
    try
    {
      boolean bool = aDQ.enableNetwork(paramInt, true);
      GMTrace.o(19819395022848L, 147666);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.toString();
      GMTrace.o(19819395022848L, 147666);
    }
    return false;
  }
  
  public static boolean isWifiEnabled()
  {
    GMTrace.i(19820200329216L, 147672);
    try
    {
      boolean bool = aDQ.isWifiEnabled();
      GMTrace.o(19820200329216L, 147672);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.toString();
      GMTrace.o(19820200329216L, 147672);
    }
    return false;
  }
  
  public static boolean removeNetwork(int paramInt)
  {
    GMTrace.i(19819260805120L, 147665);
    try
    {
      boolean bool = aDQ.removeNetwork(paramInt);
      GMTrace.o(19819260805120L, 147665);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.toString();
      GMTrace.o(19819260805120L, 147665);
    }
    return false;
  }
  
  public static boolean saveConfiguration()
  {
    GMTrace.i(19820066111488L, 147671);
    try
    {
      boolean bool = aDQ.saveConfiguration();
      GMTrace.o(19820066111488L, 147671);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.toString();
      GMTrace.o(19820066111488L, 147671);
    }
    return false;
  }
  
  public static boolean startScan()
  {
    GMTrace.i(19819663458304L, 147668);
    try
    {
      boolean bool = aDQ.startScan();
      GMTrace.o(19819663458304L, 147668);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.toString();
      GMTrace.o(19819663458304L, 147668);
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\wifi\wifisdk\internal\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */