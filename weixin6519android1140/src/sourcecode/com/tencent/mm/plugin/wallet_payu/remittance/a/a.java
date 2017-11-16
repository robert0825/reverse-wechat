package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.wallet_core.e.a.a
{
  public String eCU;
  public String eHG;
  public String eTy;
  public String pin;
  public String qVY;
  public double rhd;
  public int rta;
  public int rva;
  public double rvb;
  public String rvc;
  
  public a(String paramString1, String paramString2, double paramDouble, String paramString3, int paramInt, String paramString4, String paramString5, String paramString6)
  {
    GMTrace.i(7962869366784L, 59328);
    this.eHG = paramString1;
    this.pin = paramString2;
    this.rhd = paramDouble;
    this.eCU = paramString3;
    if (paramInt == 2) {}
    for (int i = 0;; i = paramInt)
    {
      this.rva = i;
      this.eTy = paramString4;
      this.qVY = paramString5;
      HashMap localHashMap = new HashMap();
      localHashMap.put("pin", paramString2);
      localHashMap.put("req_key", paramString1);
      localHashMap.put("total_fee", Math.round(100.0D * paramDouble));
      localHashMap.put("fee_type", paramString3);
      localHashMap.put("transfer_type", String.valueOf(paramInt));
      localHashMap.put("target_username", paramString4);
      localHashMap.put("bind_serial", paramString5);
      localHashMap.put("transfer_qrcode_id", paramString6);
      x(localHashMap);
      GMTrace.o(7962869366784L, 59328);
      return;
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7963137802240L, 59330);
    this.rta = paramJSONObject.optInt("response_result");
    this.rvb = bg.getDouble(paramJSONObject.optString("total_fee"), 0.0D);
    this.rvc = paramJSONObject.optString("fee_type");
    GMTrace.o(7963137802240L, 59330);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7963003584512L, 59329);
    GMTrace.o(7963003584512L, 59329);
    return 14;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\remittance\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */