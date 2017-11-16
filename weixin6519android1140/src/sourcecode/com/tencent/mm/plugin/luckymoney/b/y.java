package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class y
  extends z
{
  public y(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3)
  {
    GMTrace.i(9738704125952L, 72559);
    HashMap localHashMap = new HashMap();
    localHashMap.put("sendId", paramString1);
    localHashMap.put("offset", String.valueOf(paramInt2));
    localHashMap.put("type", String.valueOf(paramInt1));
    localHashMap.put("receiveId", paramString2);
    localHashMap.put("ver", paramString3);
    x(localHashMap);
    GMTrace.o(9738704125952L, 72559);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(9739106779136L, 72562);
    w.i("NetSceneLuckyMoneyMyRecordDelete", "onGYNetEnd");
    GMTrace.o(9739106779136L, 72562);
  }
  
  public final String aoA()
  {
    GMTrace.i(9738972561408L, 72561);
    GMTrace.o(9738972561408L, 72561);
    return "/cgi-bin/mmpay-bin/deletelistwxhb";
  }
  
  public final int getType()
  {
    GMTrace.i(9738838343680L, 72560);
    GMTrace.o(9738838343680L, 72560);
    return 1612;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */