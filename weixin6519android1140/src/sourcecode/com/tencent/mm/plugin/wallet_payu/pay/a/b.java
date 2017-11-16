package com.tencent.mm.plugin.wallet_payu.pay.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends a
{
  public String eHG;
  public String jVR;
  public int jWT;
  public String pin;
  public String qVY;
  public String rkr;
  public String rsW;
  public String rtc;
  public String rtd;
  public String rtf;
  public boolean ruA;
  public String ruB;
  public String ruC;
  public String ruD;
  public double ruv;
  public String ruw;
  public double rux;
  public String ruy;
  public boolean ruz;
  
  public b(String paramString1, double paramDouble, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    GMTrace.i(7974948962304L, 59418);
    this.eHG = paramString1;
    this.ruv = paramDouble;
    this.ruw = paramString2;
    this.rkr = paramString3;
    this.qVY = paramString4;
    this.rsW = paramString5;
    this.pin = paramString6;
    HashMap localHashMap = new HashMap();
    localHashMap.put("req_key", paramString1);
    localHashMap.put("total_fee", Math.round(100.0D * paramDouble));
    localHashMap.put("fee_type", paramString2);
    localHashMap.put("bank_type", paramString3);
    localHashMap.put("bind_serial", paramString4);
    if (!paramString3.equals("SVA_PAYU")) {
      localHashMap.put("cvv", paramString5);
    }
    localHashMap.put("pin", paramString6);
    x(localHashMap);
    GMTrace.o(7974948962304L, 59418);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7975351615488L, 59421);
    if (paramJSONObject != null)
    {
      this.jVR = paramJSONObject.optString("trans_id");
      this.rux = (paramJSONObject.optDouble("total_fee") / 100.0D);
      this.ruy = paramJSONObject.optString("fee_type");
      this.ruz = paramJSONObject.optBoolean("redirect");
      this.rtc = paramJSONObject.optString("gateway_reference");
      this.rtd = paramJSONObject.optString("gateway_code");
      this.ruB = paramJSONObject.optString("pay_status");
      this.jWT = paramJSONObject.optInt("timestamp");
      this.ruC = paramJSONObject.optString("pay_status_name");
      this.ruD = paramJSONObject.optString("bank_type");
      this.ruA = paramJSONObject.optBoolean("is_force_adjust");
      this.rtf = paramJSONObject.optString("force_adjust_code");
    }
    GMTrace.o(7975351615488L, 59421);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7975083180032L, 59419);
    GMTrace.o(7975083180032L, 59419);
    return 9;
  }
  
  public final boolean isSuccess()
  {
    GMTrace.i(7975217397760L, 59420);
    boolean bool = this.ruB.equals("1");
    GMTrace.o(7975217397760L, 59420);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pay\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */