package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class aa
  extends z
{
  public String mIf;
  public String mIn;
  
  public aa(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(9735885553664L, 72538);
    this.mIn = paramString3;
    this.mIf = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("sendId", paramString1);
    localHashMap.put("receiveId", paramString3);
    localHashMap.put("wishing", URLEncoder.encode(bg.nl(paramString2)));
    localHashMap.put("ver", paramString4);
    x(localHashMap);
    GMTrace.o(9735885553664L, 72538);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(9736288206848L, 72541);
    GMTrace.o(9736288206848L, 72541);
  }
  
  public final String aoA()
  {
    GMTrace.i(9736153989120L, 72540);
    GMTrace.o(9736153989120L, 72540);
    return "/cgi-bin/mmpay-bin/wishwxhb";
  }
  
  public final int getType()
  {
    GMTrace.i(9736019771392L, 72539);
    GMTrace.o(9736019771392L, 72539);
    return 1682;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */