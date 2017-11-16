package com.tencent.mm.plugin.wallet_payu.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends a
{
  public String eMJ;
  public String rtF;
  public String rtG;
  public boolean rue;
  
  public b(String paramString1, String paramString2)
  {
    GMTrace.i(7934280990720L, 59115);
    this.rtF = paramString1;
    this.rtG = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("dial_code", paramString1);
    localHashMap.put("number", paramString2);
    x(localHashMap);
    GMTrace.o(7934280990720L, 59115);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7934549426176L, 59117);
    w.d("MicroMsg.NetScenePayUGenerateOtp", "hy: get NetScenePayUGenerateOtp info. errCode: %d, errMsg:%s, json:%s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject.toString() });
    this.rue = paramJSONObject.optBoolean("has_mobile");
    this.eMJ = paramJSONObject.optString("payu_reference");
    GMTrace.o(7934549426176L, 59117);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7934415208448L, 59116);
    GMTrace.o(7934415208448L, 59116);
    return 12;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */