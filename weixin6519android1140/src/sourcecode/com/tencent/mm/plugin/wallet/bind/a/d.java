package com.tencent.mm.plugin.wallet.bind.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends h
{
  public d(String paramString1, String paramString2)
  {
    GMTrace.i(7677119823872L, 57199);
    HashMap localHashMap = new HashMap();
    localHashMap.put("bank_type", paramString1);
    localHashMap.put("bind_serial", paramString2);
    localHashMap.put("expired_flag", "1");
    x(localHashMap);
    GMTrace.o(7677119823872L, 57199);
  }
  
  public d(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(7676985606144L, 57198);
    HashMap localHashMap = new HashMap();
    localHashMap.put("bank_type", paramString1);
    localHashMap.put("bind_serial", paramString2);
    localHashMap.put("passwd", paramString3);
    x(localHashMap);
    GMTrace.o(7676985606144L, 57198);
  }
  
  public final int Bb()
  {
    GMTrace.i(7677522477056L, 57202);
    GMTrace.o(7677522477056L, 57202);
    return 473;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7677388259328L, 57201);
    GMTrace.o(7677388259328L, 57201);
  }
  
  public final int aoD()
  {
    GMTrace.i(7677254041600L, 57200);
    GMTrace.o(7677254041600L, 57200);
    return 14;
  }
  
  public final String getUri()
  {
    GMTrace.i(7677656694784L, 57203);
    GMTrace.o(7677656694784L, 57203);
    return "/cgi-bin/mmpay-bin/tenpay/unbind";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\bind\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */