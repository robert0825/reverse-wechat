package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class r
  extends q
{
  public r(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    GMTrace.i(9746622971904L, 72618);
    HashMap localHashMap = new HashMap();
    localHashMap.put("appId", paramString1);
    localHashMap.put("timeStamp", paramString2);
    localHashMap.put("nonceStr", paramString3);
    if (paramString4 != null) {
      localHashMap.put("package", URLEncoder.encode(paramString4));
    }
    localHashMap.put("signType", paramString5);
    if (paramString6 != null) {
      localHashMap.put("paySign", URLEncoder.encode(paramString6));
    }
    localHashMap.put("way", "3");
    if (paramString7 != null) {
      localHashMap.put("jsapiH5Url", URLEncoder.encode(paramString7));
    }
    x(localHashMap);
    GMTrace.o(9746622971904L, 72618);
  }
  
  public r(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    GMTrace.i(9746757189632L, 72619);
    HashMap localHashMap = new HashMap();
    localHashMap.put("appId", paramString1);
    localHashMap.put("timeStamp", paramString2);
    localHashMap.put("nonceStr", paramString3);
    if (paramString4 != null) {
      localHashMap.put("package", URLEncoder.encode(paramString4));
    }
    localHashMap.put("signType", paramString5);
    if (paramString6 != null) {
      localHashMap.put("paySign", URLEncoder.encode(paramString6));
    }
    localHashMap.put("way", "4");
    if (paramString7 != null) {
      localHashMap.put("androidSign", URLEncoder.encode(paramString7));
    }
    if (paramString8 != null) {
      localHashMap.put("androidPackage", URLEncoder.encode(paramString8));
    }
    x(localHashMap);
    GMTrace.o(9746757189632L, 72619);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(9747025625088L, 72621);
    GMTrace.o(9747025625088L, 72621);
  }
  
  public final int aoB()
  {
    GMTrace.i(9746891407360L, 72620);
    GMTrace.o(9746891407360L, 72620);
    return 2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */