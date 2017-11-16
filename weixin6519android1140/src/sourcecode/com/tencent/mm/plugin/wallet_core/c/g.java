package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Orders.b;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g
  extends h
{
  public String jNb;
  public String rcl;
  public String rcm;
  public Orders.b rco;
  
  public g(Orders.b paramb, String paramString1, String paramString2, long paramLong)
  {
    GMTrace.i(16143439888384L, 120278);
    this.rco = paramb;
    HashMap localHashMap = new HashMap();
    localHashMap.put("activity_id", paramb.rgN);
    localHashMap.put("award_id", paramb.rib);
    localHashMap.put("send_record_id", paramb.rgQ);
    localHashMap.put("user_record_id", paramb.rgR);
    localHashMap.put("req_key", paramString1);
    localHashMap.put("transaction_id", paramString2);
    localHashMap.put("activity_mch_id", String.valueOf(paramLong));
    x(localHashMap);
    GMTrace.o(16143439888384L, 120278);
  }
  
  public final int Bb()
  {
    GMTrace.i(7035559084032L, 52419);
    GMTrace.o(7035559084032L, 52419);
    return 1589;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7035424866304L, 52418);
    if ((paramJSONObject != null) && (paramInt == 0))
    {
      this.rcl = paramJSONObject.optString("result_code");
      this.jNb = paramJSONObject.optString("result_msg");
      this.rcm = paramJSONObject.optString("alert_wording");
    }
    GMTrace.o(7035424866304L, 52418);
  }
  
  public final int aoD()
  {
    GMTrace.i(7035290648576L, 52417);
    GMTrace.o(7035290648576L, 52417);
    return 1589;
  }
  
  public final String getUri()
  {
    GMTrace.i(7035693301760L, 52420);
    GMTrace.o(7035693301760L, 52420);
    return "/cgi-bin/mmpay-bin/tenpay/sendpayaward";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */