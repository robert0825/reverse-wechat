package com.tencent.mm.plugin.wallet_payu.pay.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends a
{
  public Orders opK;
  private String qYK;
  
  public c(String paramString)
  {
    this(paramString, 0);
    GMTrace.i(7974412091392L, 59414);
    GMTrace.o(7974412091392L, 59414);
  }
  
  public c(String paramString, int paramInt)
  {
    GMTrace.i(7974546309120L, 59415);
    this.opK = null;
    this.qYK = null;
    this.qYK = paramString;
    paramString = new HashMap();
    paramString.put("req_key", this.qYK);
    paramString.put("query_scene", String.valueOf(paramInt));
    x(paramString);
    GMTrace.o(7974546309120L, 59415);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7974814744576L, 59417);
    this.opK = Orders.Q(paramJSONObject);
    if (this.opK != null) {
      this.opK.eHG = this.qYK;
    }
    GMTrace.o(7974814744576L, 59417);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7974680526848L, 59416);
    GMTrace.o(7974680526848L, 59416);
    return 8;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pay\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */