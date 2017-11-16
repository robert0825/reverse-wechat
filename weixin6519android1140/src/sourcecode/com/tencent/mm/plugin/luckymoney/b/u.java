package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class u
  extends z
{
  long eDr;
  String eDs;
  public e mJj;
  public String mJv;
  
  public u(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3)
  {
    this(paramString1, paramInt1, paramInt2, paramString2, paramString3, "");
    GMTrace.i(9727832489984L, 72478);
    GMTrace.o(9727832489984L, 72478);
  }
  
  public u(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(9728100925440L, 72480);
    this.mJj = null;
    HashMap localHashMap = new HashMap();
    localHashMap.put("sendId", paramString1);
    localHashMap.put("limit", String.valueOf(paramInt1));
    localHashMap.put("offset", String.valueOf(paramInt2));
    if (!bg.nm(paramString2)) {
      localHashMap.put("nativeUrl", URLEncoder.encode(paramString2));
    }
    localHashMap.put("ver", paramString3);
    localHashMap.put("processContent", paramString4);
    x(localHashMap);
    GMTrace.o(9728100925440L, 72480);
  }
  
  public u(String paramString1, int paramInt, String paramString2, long paramLong, String paramString3, String paramString4)
  {
    GMTrace.i(9727966707712L, 72479);
    this.mJj = null;
    HashMap localHashMap = new HashMap();
    localHashMap.put("sendId", paramString1);
    localHashMap.put("limit", "11");
    localHashMap.put("offset", String.valueOf(paramInt));
    if (!bg.nm(paramString2)) {
      localHashMap.put("nativeUrl", URLEncoder.encode(paramString2));
    }
    localHashMap.put("befortTimestamp", String.valueOf(paramLong));
    localHashMap.put("ver", paramString3);
    localHashMap.put("processContent", paramString4);
    x(localHashMap);
    GMTrace.o(9727966707712L, 72479);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(9728503578624L, 72483);
    try
    {
      this.mJj = l.B(paramJSONObject);
      this.mJv = paramJSONObject.optString("processContent");
      GMTrace.o(9728503578624L, 72483);
      return;
    }
    catch (JSONException paramString)
    {
      w.w("MicroMsg.NetSceneLuckyMoneyDetail", "parse luckyMoneyDetail fail: " + paramString.getLocalizedMessage());
      GMTrace.o(9728503578624L, 72483);
    }
  }
  
  public final String aoA()
  {
    GMTrace.i(9728369360896L, 72482);
    GMTrace.o(9728369360896L, 72482);
    return "/cgi-bin/mmpay-bin/qrydetailwxhb";
  }
  
  public final int getType()
  {
    GMTrace.i(9728235143168L, 72481);
    GMTrace.o(9728235143168L, 72481);
    return 1585;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */