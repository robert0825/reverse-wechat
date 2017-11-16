package com.tencent.mm.plugin.wallet_payu.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.wallet_core.e.a.a
{
  public String eMJ;
  public String rub;
  public boolean ruc;
  public String rud;
  
  public a(String paramString1, String paramString2)
  {
    GMTrace.i(7933609902080L, 59110);
    this.rub = paramString1;
    this.eMJ = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("otp", paramString1);
    localHashMap.put("payu_reference", paramString2);
    x(localHashMap);
    GMTrace.o(7933609902080L, 59110);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7933878337536L, 59112);
    w.d("MicroMsg.NetScenePayUComfirmOtp", "hy: get NetScenePayUCreateUser info. errCode: %d, errMsg:%s, json:%s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject.toString() });
    this.ruc = paramJSONObject.optBoolean("verified");
    this.rud = paramJSONObject.optString("payu_reference");
    GMTrace.o(7933878337536L, 59112);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7933744119808L, 59111);
    GMTrace.o(7933744119808L, 59111);
    return 4;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */