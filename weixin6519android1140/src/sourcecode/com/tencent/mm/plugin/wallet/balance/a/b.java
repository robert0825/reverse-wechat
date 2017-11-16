package com.tencent.mm.plugin.wallet.balance.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.aa;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends h
{
  public int eCx;
  public String eJQ;
  public String eXD;
  public String eXE;
  public String eXF;
  public String eXG;
  public String eXH;
  public double oml;
  public double omw;
  public boolean qTi;
  public String qTj;
  public com.tencent.mm.plugin.wallet_core.model.b qTk;
  public com.tencent.mm.plugin.wallet_core.model.b qTl;
  public double qTm;
  
  public b(double paramDouble, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(7703426498560L, 57395);
    this.eJQ = null;
    this.qTi = false;
    this.qTj = "";
    this.oml = 0.0D;
    this.omw = 0.0D;
    this.eCx = 0;
    HashMap localHashMap = new HashMap();
    this.qTm = Math.round(100.0D * paramDouble);
    localHashMap.put("total_fee", this.qTm);
    localHashMap.put("fee_type", paramString1);
    localHashMap.put("bank_type", paramString2);
    localHashMap.put("operation", String.valueOf(paramInt));
    x(localHashMap);
    GMTrace.o(7703426498560L, 57395);
  }
  
  public final int Bb()
  {
    GMTrace.i(7703829151744L, 57398);
    GMTrace.o(7703829151744L, 57398);
    return 1503;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7703694934016L, 57397);
    w.d("Micromsg.NetSceneTenpayBalanceFetch", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(7703694934016L, 57397);
      return;
    }
    this.eJQ = paramJSONObject.optString("req_key");
    this.qTi = "1".equals(paramJSONObject.optString("should_alert"));
    this.qTj = paramJSONObject.optString("alert_msg");
    this.oml = (paramJSONObject.optDouble("charge_fee", 0.0D) / 100.0D);
    this.omw = (paramJSONObject.optDouble("total_fee", 0.0D) / 100.0D);
    paramString = paramJSONObject.optJSONObject("first_fetch_info");
    if (paramString != null)
    {
      w.i("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), first_fetch_info is valid");
      this.qTk = aa.a(paramString, false);
      paramString = paramJSONObject.optJSONObject("need_charge_fee_info");
      if (paramString == null) {
        break label332;
      }
      w.i("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), need_charge_fee_info is valid");
      this.qTl = aa.a(paramString, false);
    }
    for (;;)
    {
      this.eCx = paramJSONObject.optInt("operation", 0);
      w.i("Micromsg.NetSceneTenpayBalanceFetch", "charge_fee:" + this.oml + " total_fee:" + this.omw + " operation:" + this.eCx);
      if (paramJSONObject.has("real_name_info"))
      {
        paramString = paramJSONObject.optJSONObject("real_name_info");
        w.i("Micromsg.NetSceneTenpayBalanceFetch", "get real_name_info %s", new Object[] { paramString.toString() });
        this.eXD = paramString.optString("guide_flag");
        this.eXE = paramString.optString("guide_wording");
        this.eXF = paramString.optString("left_button_wording");
        this.eXG = paramString.optString("right_button_wording");
        this.eXH = paramString.optString("upload_credit_url");
      }
      GMTrace.o(7703694934016L, 57397);
      return;
      w.e("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), first_fetch_info is null");
      break;
      label332:
      w.e("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), need_charge_fee_info is null");
    }
  }
  
  public final int aoD()
  {
    GMTrace.i(7703560716288L, 57396);
    GMTrace.o(7703560716288L, 57396);
    return 75;
  }
  
  public final String getUri()
  {
    GMTrace.i(7703963369472L, 57399);
    GMTrace.o(7703963369472L, 57399);
    return "/cgi-bin/mmpay-bin/tenpay/genprefetch";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */