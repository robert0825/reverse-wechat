package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h
  extends a
{
  public h(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    GMTrace.i(7960050794496L, 59307);
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString1);
    localHashMap.put("total_fee", String.valueOf(paramInt1));
    localHashMap.put("fee_type", paramString2);
    localHashMap.put("receiver_name", paramString3);
    localHashMap.put("invalid_time", String.valueOf(paramInt2));
    x(localHashMap);
    GMTrace.o(7960050794496L, 59307);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7960185012224L, 59308);
    w.d("MicroMsg.NetScenePayURemitttanceRetry", "errCode " + paramInt + " errMsg: " + paramString);
    GMTrace.o(7960185012224L, 59308);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7960319229952L, 59309);
    GMTrace.o(7960319229952L, 59309);
    return 26;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\remittance\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */