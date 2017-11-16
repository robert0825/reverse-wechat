package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g
  extends a
{
  public g(String paramString1, String paramString2)
  {
    GMTrace.i(7962466713600L, 59325);
    HashMap localHashMap = new HashMap();
    localHashMap.put("receiver_user_name", paramString1);
    localHashMap.put("transfer_qrcode_id", paramString2);
    x(localHashMap);
    GMTrace.o(7962466713600L, 59325);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7962600931328L, 59326);
    w.d("MicroMsg.NetScenePayURemittanceSendCancelMsg", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(7962600931328L, 59326);
      return;
    }
    GMTrace.o(7962600931328L, 59326);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7962735149056L, 59327);
    GMTrace.o(7962735149056L, 59327);
    return 27;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\remittance\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */