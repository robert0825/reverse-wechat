package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h
  extends com.tencent.mm.wallet_core.g.a.h
{
  public h(String paramString)
  {
    GMTrace.i(7022539964416L, 52322);
    HashMap localHashMap = new HashMap();
    localHashMap.put("wallet_tpa_country", paramString);
    x(localHashMap);
    GMTrace.o(7022539964416L, 52322);
  }
  
  public final int Bb()
  {
    GMTrace.i(7022942617600L, 52325);
    GMTrace.o(7022942617600L, 52325);
    return 1663;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7022808399872L, 52324);
    GMTrace.o(7022808399872L, 52324);
  }
  
  public final int aoD()
  {
    GMTrace.i(7022674182144L, 52323);
    GMTrace.o(7022674182144L, 52323);
    return 1663;
  }
  
  public final int getType()
  {
    GMTrace.i(7023211053056L, 52327);
    int i = super.getType();
    GMTrace.o(7023211053056L, 52327);
    return i;
  }
  
  public final String getUri()
  {
    GMTrace.i(7023076835328L, 52326);
    GMTrace.o(7023076835328L, 52326);
    return "/cgi-bin/mmpay-bin/tenpay/setuserwallet";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */