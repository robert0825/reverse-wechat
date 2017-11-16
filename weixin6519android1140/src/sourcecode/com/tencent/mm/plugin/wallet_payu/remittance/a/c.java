package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends a
{
  public c(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    GMTrace.i(7963272019968L, 59331);
    HashMap localHashMap = new HashMap();
    localHashMap.put("req_key", paramString1);
    localHashMap.put("total_fee", String.valueOf(paramInt));
    localHashMap.put("fee_type", paramString2);
    localHashMap.put("to_customer_name", paramString3);
    x(localHashMap);
    GMTrace.o(7963272019968L, 59331);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7963406237696L, 59332);
    w.d("MicroMsg.NetScenePayURemittanceConfirm", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(7963406237696L, 59332);
      return;
    }
    GMTrace.o(7963406237696L, 59332);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7963540455424L, 59333);
    GMTrace.o(7963540455424L, 59333);
    return 15;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\remittance\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */