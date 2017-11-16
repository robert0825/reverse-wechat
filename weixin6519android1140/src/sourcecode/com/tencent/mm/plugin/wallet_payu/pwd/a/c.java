package com.tencent.mm.plugin.wallet_payu.pwd.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends a
{
  public String token;
  
  public c(String paramString)
  {
    GMTrace.i(7956158480384L, 59278);
    this.token = "";
    HashMap localHashMap = new HashMap();
    localHashMap.put("pin", paramString);
    x(localHashMap);
    GMTrace.o(7956158480384L, 59278);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7956426915840L, 59280);
    w.d("MicroMsg.NetScenePayUCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    this.token = paramJSONObject.optString("payu_reference");
    GMTrace.o(7956426915840L, 59280);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7956292698112L, 59279);
    GMTrace.o(7956292698112L, 59279);
    return 3;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pwd\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */