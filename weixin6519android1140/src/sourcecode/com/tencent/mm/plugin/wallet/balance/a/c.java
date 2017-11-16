package com.tencent.mm.plugin.wallet.balance.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends h
{
  public String eJQ;
  public String eXD;
  public String eXE;
  public String eXF;
  public String eXG;
  public String eXH;
  public boolean qTi;
  public String qTj;
  public double qTm;
  
  public c(double paramDouble, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(7704097587200L, 57400);
    this.eJQ = null;
    this.qTi = false;
    this.qTj = "";
    HashMap localHashMap = new HashMap();
    this.qTm = Math.round(100.0D * paramDouble);
    localHashMap.put("total_fee", this.qTm);
    localHashMap.put("fee_type", paramString1);
    localHashMap.put("bind_serial", paramString2);
    localHashMap.put("bank_type", paramString3);
    x(localHashMap);
    GMTrace.o(7704097587200L, 57400);
  }
  
  public final int Bb()
  {
    GMTrace.i(7704500240384L, 57403);
    GMTrace.o(7704500240384L, 57403);
    return 1502;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7704366022656L, 57402);
    w.d("Micromsg.NetSceneTenpayBalanceSave", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(7704366022656L, 57402);
      return;
    }
    this.eJQ = paramJSONObject.optString("req_key");
    this.qTi = "1".equals(paramJSONObject.optString("should_alert"));
    this.qTj = paramJSONObject.optString("alert_msg");
    if (paramJSONObject.has("real_name_info"))
    {
      paramString = paramJSONObject.optJSONObject("real_name_info");
      w.i("Micromsg.NetSceneTenpayBalanceSave", "get real_name_info %s", new Object[] { paramString.toString() });
      this.eXD = paramString.optString("guide_flag");
      this.eXE = paramString.optString("guide_wording");
      this.eXF = paramString.optString("left_button_wording");
      this.eXG = paramString.optString("right_button_wording");
      this.eXH = paramString.optString("upload_credit_url");
    }
    GMTrace.o(7704366022656L, 57402);
  }
  
  public final int aoD()
  {
    GMTrace.i(7704231804928L, 57401);
    GMTrace.o(7704231804928L, 57401);
    return 74;
  }
  
  public final String getUri()
  {
    GMTrace.i(7704634458112L, 57404);
    GMTrace.o(7704634458112L, 57404);
    return "/cgi-bin/mmpay-bin/tenpay/genpresave";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */