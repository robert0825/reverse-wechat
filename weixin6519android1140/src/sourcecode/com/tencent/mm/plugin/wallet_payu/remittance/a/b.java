package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends a
{
  public b(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    GMTrace.i(7961392971776L, 59317);
    HashMap localHashMap = new HashMap();
    localHashMap.put("req_key", paramString1);
    localHashMap.put("total_fee", String.valueOf(paramInt));
    localHashMap.put("fee_type", paramString2);
    localHashMap.put("to_customer_name", paramString3);
    x(localHashMap);
    GMTrace.o(7961392971776L, 59317);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7961527189504L, 59318);
    w.d("MicroMsg", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(7961527189504L, 59318);
      return;
    }
    GMTrace.o(7961527189504L, 59318);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7961661407232L, 59319);
    GMTrace.o(7961661407232L, 59319);
    return 16;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\remittance\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */