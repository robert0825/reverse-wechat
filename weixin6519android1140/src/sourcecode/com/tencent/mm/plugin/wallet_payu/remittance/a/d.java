package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends a
{
  public String eCU;
  public String eMJ;
  public double rhd;
  public int rvd;
  public String toUserName;
  
  public d(double paramDouble, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(7960990318592L, 59314);
    this.rhd = paramDouble;
    this.eCU = paramString1;
    this.toUserName = paramString2;
    this.rvd = paramInt;
    HashMap localHashMap = new HashMap();
    localHashMap.put("total_fee", Math.round(100.0D * paramDouble));
    localHashMap.put("fee_type", paramString1);
    localHashMap.put("to_customer_name", paramString2);
    localHashMap.put("transfer_type", String.valueOf(paramInt));
    x(localHashMap);
    GMTrace.o(7960990318592L, 59314);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7961258754048L, 59316);
    this.eMJ = paramJSONObject.optString("PrepayId");
    GMTrace.o(7961258754048L, 59316);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7961124536320L, 59315);
    GMTrace.o(7961124536320L, 59315);
    return 13;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\remittance\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */