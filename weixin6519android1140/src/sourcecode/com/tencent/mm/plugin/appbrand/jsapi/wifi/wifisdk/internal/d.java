package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import com.tencent.gmtrace.GMTrace;
import java.util.BitSet;

public final class d
{
  public static int ipg;
  
  static
  {
    GMTrace.i(19822213595136L, 147687);
    ipg = -1;
    GMTrace.o(19822213595136L, 147687);
  }
  
  public static int a(ScanResult paramScanResult)
  {
    GMTrace.i(19822079377408L, 147686);
    if ((paramScanResult == null) || (paramScanResult.capabilities == null))
    {
      GMTrace.o(19822079377408L, 147686);
      return -1;
    }
    if (paramScanResult.capabilities.contains("WEP"))
    {
      GMTrace.o(19822079377408L, 147686);
      return 1;
    }
    if (paramScanResult.capabilities.contains("PSK"))
    {
      GMTrace.o(19822079377408L, 147686);
      return 2;
    }
    if (paramScanResult.capabilities.contains("EAP"))
    {
      GMTrace.o(19822079377408L, 147686);
      return 3;
    }
    GMTrace.o(19822079377408L, 147686);
    return 0;
  }
  
  public static int c(WifiConfiguration paramWifiConfiguration)
  {
    GMTrace.i(19821945159680L, 147685);
    if (paramWifiConfiguration.allowedKeyManagement.get(1))
    {
      GMTrace.o(19821945159680L, 147685);
      return 2;
    }
    if ((paramWifiConfiguration.allowedKeyManagement.get(2)) || (paramWifiConfiguration.allowedKeyManagement.get(3)))
    {
      GMTrace.o(19821945159680L, 147685);
      return 3;
    }
    if (paramWifiConfiguration.wepKeys[0] != null)
    {
      GMTrace.o(19821945159680L, 147685);
      return 1;
    }
    GMTrace.o(19821945159680L, 147685);
    return 0;
  }
  
  public static String qY(String paramString)
  {
    GMTrace.i(19821810941952L, 147684);
    if (paramString == null)
    {
      GMTrace.o(19821810941952L, 147684);
      return "";
    }
    int i = paramString.length();
    if ((i > 1) && (paramString.charAt(0) == '"') && (paramString.charAt(i - 1) == '"'))
    {
      paramString = paramString.substring(1, i - 1);
      GMTrace.o(19821810941952L, 147684);
      return paramString;
    }
    GMTrace.o(19821810941952L, 147684);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\wifi\wifisdk\internal\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */