package com.tencent.mm.plugin.wallet_payu.create.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.wallet_core.e.a.a
{
  public String eMJ;
  public String pin;
  public String rtF;
  public String rtG;
  public String rtH;
  public String rtI;
  public String rtJ;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    GMTrace.i(7943273578496L, 59182);
    this.rtF = paramString1;
    this.rtG = paramString2;
    this.pin = paramString3;
    this.rtI = paramString4;
    this.rtH = paramString4;
    this.rtJ = paramString6;
    HashMap localHashMap = new HashMap();
    localHashMap.put("dial_code", paramString1);
    localHashMap.put("number", paramString2);
    localHashMap.put("pin", paramString3);
    localHashMap.put("secret_question_id", paramString4);
    localHashMap.put("secret_question_answer", paramString5);
    localHashMap.put("payu_reference", paramString6);
    x(localHashMap);
    GMTrace.o(7943273578496L, 59182);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7943542013952L, 59184);
    w.d("MicroMsg.NetScenePayUCreateUser", "hy: get NetScenePayUCreateUser info. errCode: %d, errMsg:%s, json:%s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject.toString() });
    this.eMJ = paramJSONObject.optString("payu_reference");
    GMTrace.o(7943542013952L, 59184);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7943407796224L, 59183);
    GMTrace.o(7943407796224L, 59183);
    return 5;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\create\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */