package com.tencent.mm.plugin.offline.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g
  extends h
{
  public g(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(6192940187648L, 46141);
    HashMap localHashMap = new HashMap();
    localHashMap.put("buss_type", paramString1);
    localHashMap.put("method", paramString2);
    if (am.isWifi(ab.getContext())) {
      paramString1 = "wifi";
    }
    for (;;)
    {
      localHashMap.put("network", paramString1);
      localHashMap.put("transactionid", paramString3);
      x(localHashMap);
      GMTrace.o(6192940187648L, 46141);
      return;
      if (am.is3G(ab.getContext())) {
        paramString1 = "3g";
      } else if (am.is2G(ab.getContext())) {
        paramString1 = "2g";
      } else if (am.isWap(ab.getContext())) {
        paramString1 = "wap";
      } else if (am.is4G(ab.getContext())) {
        paramString1 = "4g";
      } else {
        paramString1 = "unknown";
      }
    }
  }
  
  public final int Bb()
  {
    GMTrace.i(6193477058560L, 46145);
    GMTrace.o(6193477058560L, 46145);
    return 1602;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6193208623104L, 46143);
    GMTrace.o(6193208623104L, 46143);
  }
  
  public final int aoD()
  {
    GMTrace.i(6193074405376L, 46142);
    GMTrace.o(6193074405376L, 46142);
    return 122;
  }
  
  public final String getUri()
  {
    GMTrace.i(6193342840832L, 46144);
    GMTrace.o(6193342840832L, 46144);
    return "/cgi-bin/mmpay-bin/tenpay/datareport";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */