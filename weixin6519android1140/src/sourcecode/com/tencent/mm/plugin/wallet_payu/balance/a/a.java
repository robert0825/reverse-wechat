package com.tencent.mm.plugin.wallet_payu.balance.a;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.wallet_core.e.a.a
{
  public String eCU;
  public String eHG;
  public double rhd;
  
  public a(double paramDouble, String paramString)
  {
    GMTrace.i(7935220514816L, 59122);
    this.rhd = paramDouble;
    this.eCU = paramString;
    HashMap localHashMap = new HashMap();
    localHashMap.put("total_fee", Math.round(100.0D * paramDouble));
    localHashMap.put("fee_type", paramString);
    x(localHashMap);
    GMTrace.o(7935220514816L, 59122);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7935488950272L, 59124);
    this.eHG = paramJSONObject.optString("prepayid");
    GMTrace.o(7935488950272L, 59124);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7935354732544L, 59123);
    GMTrace.o(7935354732544L, 59123);
    return 20;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\balance\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */