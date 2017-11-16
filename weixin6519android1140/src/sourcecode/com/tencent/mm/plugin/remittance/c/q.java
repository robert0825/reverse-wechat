package com.tencent.mm.plugin.remittance.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.b.a.a;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class q
  extends a
{
  public int jWC;
  public String omY;
  public int omZ;
  public String omc;
  public int omi;
  
  public q(double paramDouble, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    GMTrace.i(10796742475776L, 80442);
    this.jWC = 0;
    this.omc = "";
    this.omY = "";
    w.i("MicroMsg.NetSceneTenpayh5Pay", "NetSceneTenpayh5Pay create");
    HashMap localHashMap = new HashMap();
    try
    {
      localHashMap.put("transfer_amount", Math.round(100.0D * paramDouble));
      localHashMap.put("pay_nickname", URLEncoder.encode(paramString1, "utf-8"));
      localHashMap.put("rcvd_username", paramString2);
      localHashMap.put("rcvd_nickname", URLEncoder.encode(paramString3, "utf-8"));
      localHashMap.put("reason", URLEncoder.encode(bg.aq(paramString4, ""), "utf-8"));
      localHashMap.put("currency", String.valueOf(paramInt));
      x(localHashMap);
      GMTrace.o(10796742475776L, 80442);
      return;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        w.e("MicroMsg.NetSceneTenpayh5Pay", "error " + paramString1.getMessage());
      }
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(10797010911232L, 80444);
    w.i("MicroMsg.NetSceneTenpayh5Pay", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      w.i("MicroMsg.NetSceneTenpayh5Pay", "NetSceneTenpayh5Pay request error");
      GMTrace.o(10797010911232L, 80444);
      return;
    }
    paramString = new StringBuffer();
    this.omc = paramJSONObject.optString("payurl");
    this.omY = paramJSONObject.optString("tradeurl");
    this.omi = paramJSONObject.optInt("transfering_num");
    this.omZ = paramJSONObject.optInt("transfering_type");
    paramString.append("payurl:" + this.omc);
    paramString.append(" tradeurl:" + this.omY);
    paramString.append(" transfering_num:" + this.omi);
    paramString.append(" transfering_type:" + this.omZ);
    w.i("MicroMsg.NetSceneTenpayh5Pay", "resp " + paramString.toString());
    GMTrace.o(10797010911232L, 80444);
  }
  
  public final String aoA()
  {
    GMTrace.i(10797279346688L, 80446);
    GMTrace.o(10797279346688L, 80446);
    return "/cgi-bin/mmpay-bin/h5requesttransfer";
  }
  
  public final int aoB()
  {
    GMTrace.i(10796876693504L, 80443);
    GMTrace.o(10796876693504L, 80443);
    return 1;
  }
  
  public final int getType()
  {
    GMTrace.i(10797145128960L, 80445);
    GMTrace.o(10797145128960L, 80445);
    return 1622;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */