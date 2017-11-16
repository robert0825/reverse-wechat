package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends a
{
  public String desc;
  public double jWS;
  public int jWT;
  public String omA;
  public String omB;
  public int scene;
  public String username;
  
  public e(String paramString)
  {
    GMTrace.i(7962064060416L, 59322);
    HashMap localHashMap = new HashMap();
    localHashMap.put("transfer_url", paramString);
    x(localHashMap);
    GMTrace.o(7962064060416L, 59322);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7962198278144L, 59323);
    w.d("MicroMsg.NetScenePayURemittanceGetUsername", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(7962198278144L, 59323);
      return;
    }
    this.username = paramJSONObject.optString("user_name");
    this.omA = paramJSONObject.optString("true_name");
    this.jWS = (paramJSONObject.optDouble("fee") / 100.0D);
    this.desc = paramJSONObject.optString("desc");
    this.scene = paramJSONObject.optInt("scene");
    this.omB = paramJSONObject.optString("transfer_qrcode_id");
    this.jWT = paramJSONObject.optInt("time_stamp");
    GMTrace.o(7962198278144L, 59323);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7962332495872L, 59324);
    GMTrace.o(7962332495872L, 59324);
    return 24;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\remittance\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */