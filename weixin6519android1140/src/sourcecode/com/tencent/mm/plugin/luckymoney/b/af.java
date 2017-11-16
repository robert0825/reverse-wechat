package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.y.q;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class af
  extends z
{
  public af(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(9741120045056L, 72577);
    HashMap localHashMap = new HashMap();
    localHashMap.put("username", paramString1);
    localHashMap.put("sendId", paramString2);
    localHashMap.put("channelId", "1");
    localHashMap.put("ver", paramString3);
    localHashMap.put("sendUserName", q.zE());
    x(localHashMap);
    GMTrace.o(9741120045056L, 72577);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(9741522698240L, 72580);
    GMTrace.o(9741522698240L, 72580);
  }
  
  public final String aoA()
  {
    GMTrace.i(9741388480512L, 72579);
    GMTrace.o(9741388480512L, 72579);
    return "/cgi-bin/mmpay-bin/sharewxhb";
  }
  
  public final int getType()
  {
    GMTrace.i(9741254262784L, 72578);
    GMTrace.o(9741254262784L, 72578);
    return 1668;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */