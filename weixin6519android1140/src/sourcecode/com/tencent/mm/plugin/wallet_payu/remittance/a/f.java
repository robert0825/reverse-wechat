package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends a
{
  public int eHz;
  public int eQl;
  public double jWS;
  public String nEr;
  private String omN;
  public int omO;
  public int rve;
  public int rvf;
  public int status;
  
  public f(String paramString1, String paramString2, int paramInt)
  {
    this(paramString1, paramString2, paramInt, 1, 0);
    GMTrace.i(7960453447680L, 59310);
    GMTrace.o(7960453447680L, 59310);
  }
  
  public f(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(7960587665408L, 59311);
    this.omN = null;
    this.omN = paramString1;
    this.eHz = 1;
    this.eQl = paramInt3;
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString1);
    localHashMap.put("receiver_name", paramString2);
    localHashMap.put("invalid_time", String.valueOf(paramInt1));
    x(localHashMap);
    GMTrace.o(7960587665408L, 59311);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7960721883136L, 59312);
    w.d("MicroMsg.NetScenePayURemittanceQuery", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(7960721883136L, 59312);
      return;
    }
    this.omO = paramJSONObject.optInt("pay_time");
    this.jWS = (paramJSONObject.optDouble("total_fee") / 100.0D);
    this.nEr = paramJSONObject.optString("fee_type");
    this.status = paramJSONObject.optInt("pay_status");
    this.rve = paramJSONObject.optInt("refund_time");
    this.rvf = paramJSONObject.optInt("receive_time");
    GMTrace.o(7960721883136L, 59312);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7960856100864L, 59313);
    GMTrace.o(7960856100864L, 59313);
    return 25;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\remittance\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */