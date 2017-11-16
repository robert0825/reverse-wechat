package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal;

import android.net.wifi.WifiConfiguration;
import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import java.util.List;

public final class b
{
  public static WifiConfiguration a(String paramString, int paramInt, List<WifiConfiguration> paramList)
  {
    GMTrace.i(19822884683776L, 147692);
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        WifiConfiguration localWifiConfiguration = (WifiConfiguration)paramList.next();
        if ((d.qY(localWifiConfiguration.SSID).compareTo(paramString) == 0) && (d.c(localWifiConfiguration) == paramInt))
        {
          GMTrace.o(19822884683776L, 147692);
          return localWifiConfiguration;
        }
      }
    }
    GMTrace.o(19822884683776L, 147692);
    return null;
  }
  
  public static boolean am(String paramString, int paramInt)
  {
    boolean bool = false;
    GMTrace.i(19822750466048L, 147691);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(19822750466048L, 147691);
      return false;
    }
    Object localObject = c.getConfiguredNetworks();
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      bool = false;
      if (((Iterator)localObject).hasNext())
      {
        WifiConfiguration localWifiConfiguration = (WifiConfiguration)((Iterator)localObject).next();
        if ((d.qY(localWifiConfiguration.SSID).compareTo(paramString) != 0) || (d.c(localWifiConfiguration) != paramInt)) {
          break label124;
        }
        bool |= c.removeNetwork(localWifiConfiguration.networkId);
      }
    }
    label124:
    for (;;)
    {
      break;
      if (bool) {
        c.saveConfiguration();
      }
      GMTrace.o(19822750466048L, 147691);
      return bool;
    }
  }
  
  public static int b(WifiConfiguration paramWifiConfiguration)
  {
    GMTrace.i(19822616248320L, 147690);
    if ((paramWifiConfiguration != null) && (paramWifiConfiguration.networkId < 0))
    {
      paramWifiConfiguration.networkId = c.addNetwork(paramWifiConfiguration);
      int i = paramWifiConfiguration.networkId;
      GMTrace.o(19822616248320L, 147690);
      return i;
    }
    GMTrace.o(19822616248320L, 147690);
    return -1;
  }
  
  public static boolean iR(int paramInt)
  {
    GMTrace.i(19823018901504L, 147693);
    boolean bool = false;
    if ((c.removeNetwork(paramInt)) || (c.disableNetwork(paramInt)))
    {
      bool = true;
      c.saveConfiguration();
    }
    GMTrace.o(19823018901504L, 147693);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\wifi\wifisdk\internal\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */