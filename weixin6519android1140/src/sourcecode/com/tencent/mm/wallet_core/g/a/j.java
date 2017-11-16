package com.tencent.mm.wallet_core.g.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class j
  extends h
{
  public String appId;
  public String eEa;
  public String eHG;
  public int ePH;
  public String jWP;
  public String rse;
  public int scene;
  public String xEk;
  
  public j(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString2)
  {
    GMTrace.i(1517465632768L, 11306);
    this.scene = paramInt1;
    this.ePH = paramInt3;
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", URLEncoder.encode(paramString1));
    localHashMap.put("scene", String.valueOf(paramInt2));
    localHashMap.put("a8key_scene", String.valueOf(paramInt1));
    localHashMap.put("channel", String.valueOf(paramInt3));
    w.d("MicroMsg.NetSceneTenpayNativeAuthen", "sourceType: %d, source: %s", new Object[] { Integer.valueOf(paramInt4), paramString2 });
    if (paramInt4 < 0)
    {
      w.e("MicroMsg.NetSceneTenpayNativeAuthen", "illegal sourceType: %d, source: %s", new Object[] { Integer.valueOf(paramInt4), paramString2 });
      localHashMap.put("source_type", "0");
      localHashMap.put("source", "");
    }
    for (;;)
    {
      x(localHashMap);
      GMTrace.o(1517465632768L, 11306);
      return;
      localHashMap.put("source_type", String.valueOf(paramInt4));
      localHashMap.put("source", paramString2);
    }
  }
  
  public final int Bb()
  {
    GMTrace.i(1518002503680L, 11310);
    GMTrace.o(1518002503680L, 11310);
    return 1694;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(1517734068224L, 11308);
    w.i("MicroMsg.NetSceneTenpayNativeAuthen", "errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    w.d("MicroMsg.NetSceneTenpayNativeAuthen", "json: %s", new Object[] { paramJSONObject.toString() });
    this.eHG = paramJSONObject.optString("reqkey");
    this.appId = paramJSONObject.optString("appid");
    this.rse = paramJSONObject.optString("appsource");
    this.eEa = paramJSONObject.optString("productid");
    this.xEk = paramJSONObject.optString("retcode");
    this.jWP = paramJSONObject.optString("retmsg");
    GMTrace.o(1517734068224L, 11308);
  }
  
  public final int aoD()
  {
    GMTrace.i(1517599850496L, 11307);
    GMTrace.o(1517599850496L, 11307);
    return 127;
  }
  
  public final String getUri()
  {
    GMTrace.i(1517868285952L, 11309);
    GMTrace.o(1517868285952L, 11309);
    return "/cgi-bin/mmpay-bin/tenpay/payauthnative";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\wallet_core\g\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */