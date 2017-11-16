package com.tencent.mm.plugin.wallet_payu.balance.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends a
{
  public String eCU;
  public String eHG;
  public String jVR;
  public String pin;
  public double rhd;
  public String rsW;
  public String rsX;
  public String rsY;
  public String rsZ;
  public int rta;
  public boolean rtb;
  public String rtc;
  public String rtd;
  public boolean rte;
  public String rtf;
  
  public b(String paramString1, String paramString2, String paramString3, double paramDouble, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    GMTrace.i(7934817861632L, 59119);
    this.pin = paramString1;
    this.rsW = paramString2;
    this.eHG = paramString3;
    this.rhd = paramDouble;
    this.eCU = paramString4;
    this.rsX = paramString5;
    this.rsY = paramString6;
    this.rsZ = paramString7;
    HashMap localHashMap = new HashMap();
    localHashMap.put("pin", paramString1);
    localHashMap.put("bind_serial", paramString5);
    localHashMap.put("req_key", paramString3);
    localHashMap.put("fee_type", paramString4);
    localHashMap.put("total_fee", Math.round(100.0D * paramDouble));
    localHashMap.put("bank_type", paramString6);
    localHashMap.put("cvv", paramString2);
    localHashMap.put("dest_bind_serial", paramString7);
    x(localHashMap);
    GMTrace.o(7934817861632L, 59119);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7935086297088L, 59121);
    this.jVR = paramJSONObject.optString("trans_id");
    this.rta = paramJSONObject.optInt("response_result");
    this.rtb = paramJSONObject.optBoolean("redirect");
    this.rtc = paramJSONObject.optString("gateway_reference");
    this.rtd = paramJSONObject.optString("gateway_code");
    this.rte = paramJSONObject.optBoolean("is_force_adjust");
    this.rtf = paramJSONObject.optString("force_adjust_code");
    GMTrace.o(7935086297088L, 59121);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7934952079360L, 59120);
    GMTrace.o(7934952079360L, 59120);
    return 10;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\balance\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */