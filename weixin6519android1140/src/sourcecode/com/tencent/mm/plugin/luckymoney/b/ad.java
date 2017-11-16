package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ad
  extends z
{
  public String mFr;
  public String mJK;
  public String mJL;
  
  public ad(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, String paramString6, String paramString7, int paramInt3)
  {
    GMTrace.i(9738167255040L, 72555);
    HashMap localHashMap = new HashMap();
    localHashMap.put("amount", String.valueOf(paramInt1));
    localHashMap.put("wishing", URLEncoder.encode(bg.nl(paramString1)));
    localHashMap.put("sendUserName", paramString4);
    if (!bg.nm(paramString3)) {
      localHashMap.put("username", paramString3);
    }
    if (!bg.nm(paramString2)) {
      localHashMap.put("headImg", URLEncoder.encode(paramString2));
    }
    if (!bg.nm(paramString5)) {
      localHashMap.put("nickName", URLEncoder.encode(bg.nl(paramString5)));
    }
    localHashMap.put("inWay", String.valueOf(paramInt2));
    localHashMap.put("imageId", paramString6);
    localHashMap.put("imageAesKey", paramString7);
    localHashMap.put("imageLength", String.valueOf(paramInt3));
    x(localHashMap);
    GMTrace.o(9738167255040L, 72555);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(9738569908224L, 72558);
    this.mFr = paramJSONObject.optString("sendId");
    this.mJK = paramJSONObject.optString("reqkey");
    this.mJL = paramJSONObject.optString("sendMsgXml");
    GMTrace.o(9738569908224L, 72558);
  }
  
  public final String aoA()
  {
    GMTrace.i(9738301472768L, 72556);
    GMTrace.o(9738301472768L, 72556);
    return "/cgi-bin/mmpay-bin/yearrequestwxhb";
  }
  
  public final int getType()
  {
    GMTrace.i(9738435690496L, 72557);
    GMTrace.o(9738435690496L, 72557);
    return 1643;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */