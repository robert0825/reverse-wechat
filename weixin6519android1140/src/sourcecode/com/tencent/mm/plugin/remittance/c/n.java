package com.tencent.mm.plugin.remittance.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class n
  extends h
{
  public double jWS;
  public String nEP;
  public int nEZ;
  public String nEr;
  private String omN;
  public int omO;
  public String omP;
  private String omQ;
  public String omR;
  public int omS;
  public String omT;
  public String omU;
  public int omV;
  public int status;
  
  public n(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    GMTrace.i(10797681999872L, 80449);
    this.omN = null;
    this.omN = paramString1;
    this.nEZ = paramInt1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("transfer_id", paramString2);
    localHashMap.put("trans_id", paramString1);
    localHashMap.put("invalid_time", String.valueOf(paramInt2));
    x(localHashMap);
    GMTrace.o(10797681999872L, 80449);
  }
  
  public final int Bb()
  {
    GMTrace.i(10797950435328L, 80451);
    GMTrace.o(10797950435328L, 80451);
    return 1628;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(10798218870784L, 80453);
    w.d("Micromsg.NetSceneTenpayRemittanceQuery", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(10798218870784L, 80453);
      return;
    }
    this.omO = paramJSONObject.optInt("pay_time");
    this.jWS = (paramJSONObject.optDouble("fee") / 100.0D);
    this.nEr = paramJSONObject.optString("fee_type");
    this.status = paramJSONObject.optInt("trans_status");
    this.omQ = paramJSONObject.optString("trans_status_name");
    this.omS = paramJSONObject.optInt("modify_time");
    this.omR = paramJSONObject.optString("payer_name");
    this.omP = paramJSONObject.optString("receiver_name");
    this.nEP = paramJSONObject.optString("refund_bank_type");
    this.omT = paramJSONObject.optString("status_desc");
    this.omU = paramJSONObject.optString("status_supplementary");
    this.omV = paramJSONObject.optInt("delay_confirm_flag");
    GMTrace.o(10798218870784L, 80453);
  }
  
  public final int aoD()
  {
    GMTrace.i(10797816217600L, 80450);
    GMTrace.o(10797816217600L, 80450);
    return 0;
  }
  
  public final String getUri()
  {
    GMTrace.i(10798084653056L, 80452);
    GMTrace.o(10798084653056L, 80452);
    return "/cgi-bin/mmpay-bin/transferquery";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */