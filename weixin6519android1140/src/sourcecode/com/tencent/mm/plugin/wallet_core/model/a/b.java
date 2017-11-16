package com.tencent.mm.plugin.wallet_core.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  public boolean kRT;
  public Bankcard rkg;
  public String rkh;
  public String rki;
  public boolean rkj;
  public int rkk;
  
  public b(Bankcard paramBankcard)
  {
    GMTrace.i(6900536049664L, 51413);
    this.rkg = paramBankcard;
    try
    {
      paramBankcard = new JSONObject(this.rkg.field_ext_msg);
      this.rkh = paramBankcard.optString("information");
      this.kRT = paramBankcard.optBoolean("verified");
      this.rki = paramBankcard.optString("card_expiry");
      this.rkk = paramBankcard.optInt("cvv_length");
      this.rkj = paramBankcard.optBoolean("is_credit");
      GMTrace.o(6900536049664L, 51413);
      return;
    }
    catch (JSONException paramBankcard)
    {
      w.printErrStackTrace("MicroMsg.BankcardPayUWrapper", paramBankcard, "", new Object[0]);
      GMTrace.o(6900536049664L, 51413);
    }
  }
  
  public static String U(JSONObject paramJSONObject)
  {
    GMTrace.i(6900401831936L, 51412);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("cvv_length", paramJSONObject.optInt("cvv_length"));
      localJSONObject.put("information", paramJSONObject.optString("information"));
      localJSONObject.put("verified", paramJSONObject.optBoolean("verified"));
      localJSONObject.put("card_expiry", paramJSONObject.optString("card_expiry"));
      localJSONObject.put("is_credit", paramJSONObject.optString("bank_type").equals("CREDITCARD_PAYU"));
      paramJSONObject = localJSONObject.toString();
      GMTrace.o(6900401831936L, 51412);
      return paramJSONObject;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.BankcardPayUWrapper", paramJSONObject, "", new Object[0]);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */