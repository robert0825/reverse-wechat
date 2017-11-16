package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class r
  extends h
{
  public String rcC;
  public String rcp;
  
  public r(o paramo, String paramString)
  {
    GMTrace.i(7028042891264L, 52363);
    HashMap localHashMap = new HashMap();
    localHashMap.put("verify_code", paramo.riG);
    localHashMap.put("token", paramo.token);
    localHashMap.put("passwd", paramo.riF);
    localHashMap.put("relation_key", paramString);
    x(localHashMap);
    GMTrace.o(7028042891264L, 52363);
  }
  
  public final int Bb()
  {
    GMTrace.i(7028579762176L, 52367);
    GMTrace.o(7028579762176L, 52367);
    return 1604;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7028311326720L, 52365);
    if ((paramJSONObject != null) && (paramInt == 0))
    {
      this.rcp = paramJSONObject.optString("token_type");
      this.rcC = paramJSONObject.optString("usertoken");
    }
    GMTrace.o(7028311326720L, 52365);
  }
  
  public final int aoD()
  {
    GMTrace.i(7028177108992L, 52364);
    GMTrace.o(7028177108992L, 52364);
    return 124;
  }
  
  public final String getUri()
  {
    GMTrace.i(7028445544448L, 52366);
    GMTrace.o(7028445544448L, 52366);
    return "/cgi-bin/mmpay-bin/tenpay/webankverifysms";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */