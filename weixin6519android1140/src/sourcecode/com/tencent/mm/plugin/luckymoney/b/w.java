package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class w
  extends z
{
  public String jWR;
  
  public w(int paramInt1, long paramLong1, long paramLong2, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt3)
  {
    GMTrace.i(9747159842816L, 72622);
    HashMap localHashMap = new HashMap();
    localHashMap.put("totalNum", String.valueOf(paramInt1));
    localHashMap.put("totalAmount", String.valueOf(paramLong1));
    localHashMap.put("perValue", String.valueOf(paramLong2));
    localHashMap.put("hbType", String.valueOf(paramInt2));
    localHashMap.put("wishing", URLEncoder.encode(bg.nl(paramString1)));
    localHashMap.put("currency", String.valueOf(paramInt3));
    if (!bg.nm(paramString3)) {
      localHashMap.put("headImg", URLEncoder.encode(paramString3));
    }
    localHashMap.put("nickName", URLEncoder.encode(bg.nl(paramString4)));
    if (!bg.nm(paramString2)) {
      localHashMap.put("username", URLEncoder.encode(paramString2));
    }
    x(localHashMap);
    GMTrace.o(9747159842816L, 72622);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(9747696713728L, 72626);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneLuckyMoneyH5Request", "NetSceneLuckyMoneyH5Request response errCode=" + paramInt);
    if (paramInt == 0) {
      this.jWR = paramJSONObject.optString("payUrl");
    }
    GMTrace.o(9747696713728L, 72626);
  }
  
  public final String aoA()
  {
    GMTrace.i(9747428278272L, 72624);
    GMTrace.o(9747428278272L, 72624);
    return "/cgi-bin/mmpay-bin/h5requestwxhb";
  }
  
  public final int aoB()
  {
    GMTrace.i(9747562496000L, 72625);
    GMTrace.o(9747562496000L, 72625);
    return 0;
  }
  
  public final int getType()
  {
    GMTrace.i(9747294060544L, 72623);
    GMTrace.o(9747294060544L, 72623);
    return 1645;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */