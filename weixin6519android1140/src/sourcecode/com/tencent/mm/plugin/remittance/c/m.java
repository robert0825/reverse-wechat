package com.tencent.mm.plugin.remittance.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class m
  extends h
{
  public String desc;
  public double jWS;
  public String omA;
  public String omB;
  public String omC;
  public String omD;
  public String omE;
  public String omF;
  public int omG;
  public String omH;
  public String omI;
  public int omJ;
  public String omK;
  public String omL;
  public int omM;
  public int scene;
  public String username;
  
  public m(String paramString, int paramInt)
  {
    GMTrace.i(14570944987136L, 108562);
    this.omC = "";
    this.omD = "";
    this.omE = "";
    this.omF = "";
    this.omH = "";
    this.omI = "";
    HashMap localHashMap = new HashMap();
    localHashMap.put("transfer_url", URLEncoder.encode(paramString));
    x(localHashMap);
    paramString = new HashMap();
    paramString.put("channel", String.valueOf(paramInt));
    ap(paramString);
    GMTrace.o(14570944987136L, 108562);
  }
  
  public final int Bb()
  {
    GMTrace.i(10799426830336L, 80462);
    GMTrace.o(10799426830336L, 80462);
    return 1515;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(10799695265792L, 80464);
    w.d("Micromsg.NetSceneTenpayRemittanceGetUsername", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(10799695265792L, 80464);
      return;
    }
    w.d("Micromsg.NetSceneTenpayRemittanceGetUsername", "json %s", new Object[] { paramJSONObject.toString() });
    this.username = paramJSONObject.optString("user_name");
    this.omA = paramJSONObject.optString("true_name");
    this.jWS = (paramJSONObject.optDouble("fee") / 100.0D);
    this.desc = paramJSONObject.optString("desc");
    this.scene = paramJSONObject.optInt("scene");
    this.omB = URLEncoder.encode(paramJSONObject.optString("transfer_qrcode_id"));
    this.omC = paramJSONObject.optString("f2f_pay_desc");
    this.omD = paramJSONObject.optString("rcvr_desc");
    this.omE = paramJSONObject.optString("payer_desc");
    this.omF = paramJSONObject.optString("rcvr_ticket");
    this.omG = paramJSONObject.optInt("busi_type", 0);
    this.omH = paramJSONObject.optString("mch_name");
    this.omI = paramJSONObject.optString("mch_photo");
    this.omL = paramJSONObject.optString("mch_type", "");
    this.omJ = paramJSONObject.optInt("mch_time", 0);
    this.omK = paramJSONObject.optString("receiver_openid");
    this.omM = paramJSONObject.optInt("get_pay_wifi");
    GMTrace.o(10799695265792L, 80464);
  }
  
  public final int aoD()
  {
    GMTrace.i(10799292612608L, 80461);
    GMTrace.o(10799292612608L, 80461);
    return 0;
  }
  
  public final String getUri()
  {
    GMTrace.i(10799561048064L, 80463);
    GMTrace.o(10799561048064L, 80463);
    return "/cgi-bin/mmpay-bin/transferscanqrcode";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */