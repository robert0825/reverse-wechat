package com.tencent.mm.plugin.remittance.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.b.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class p
  extends a
{
  public int jWC;
  public String jWE;
  public String jWF;
  public String omW;
  public String omX;
  
  public p(int paramInt)
  {
    GMTrace.i(10793923903488L, 80421);
    this.jWC = 0;
    this.omW = "";
    this.omX = "";
    w.i("MicroMsg.NetSceneTenpayh5Index", "NetSceneTenpayh5Index create");
    HashMap localHashMap = new HashMap();
    localHashMap.put("wallet_type", String.valueOf(paramInt));
    x(localHashMap);
    GMTrace.o(10793923903488L, 80421);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(10794192338944L, 80423);
    w.i("MicroMsg.NetSceneTenpayh5Index", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      w.i("MicroMsg.NetSceneTenpayh5Index", "NetSceneTransferChargeQuery request error");
      GMTrace.o(10794192338944L, 80423);
      return;
    }
    paramString = new StringBuffer();
    this.jWC = paramJSONObject.optInt("currency");
    this.omW = paramJSONObject.optString("currencyUint");
    this.omX = paramJSONObject.optString("currencyWording");
    this.jWE = paramJSONObject.optString("notice");
    this.jWF = paramJSONObject.optString("notice_url");
    paramString.append("currency:" + this.jWC);
    paramString.append(" currencyuint:" + this.omW);
    paramString.append(" currencywording:" + this.omX);
    paramString.append(" notice:" + this.jWE);
    paramString.append(" notice_url:" + this.jWF);
    w.i("MicroMsg.NetSceneTenpayh5Index", "resp " + paramString.toString());
    GMTrace.o(10794192338944L, 80423);
  }
  
  public final String aoA()
  {
    GMTrace.i(10794460774400L, 80425);
    GMTrace.o(10794460774400L, 80425);
    return "/cgi-bin/mmpay-bin/h5transferoperate";
  }
  
  public final int aoB()
  {
    GMTrace.i(10794058121216L, 80422);
    GMTrace.o(10794058121216L, 80422);
    return 0;
  }
  
  public final int getType()
  {
    GMTrace.i(10794326556672L, 80424);
    GMTrace.o(10794326556672L, 80424);
    return 1574;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */