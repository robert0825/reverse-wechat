package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ac
  extends z
{
  public a eTV;
  public int jWn;
  public String mFr;
  public String mJK;
  public String mJL;
  public String mJM;
  public String mJN;
  public String mJO;
  public String mJP;
  public String mJQ;
  
  public ac(int paramInt1, long paramLong1, long paramLong2, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt3)
  {
    GMTrace.i(9745415012352L, 72609);
    this.mJO = "";
    this.mJP = "";
    this.mJQ = "";
    this.jWn = paramInt1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("totalNum", String.valueOf(paramInt1));
    localHashMap.put("totalAmount", String.valueOf(paramLong1));
    localHashMap.put("perValue", String.valueOf(paramLong2));
    localHashMap.put("hbType", String.valueOf(paramInt2));
    localHashMap.put("wishing", URLEncoder.encode(bg.nl(paramString1)));
    localHashMap.put("sendUserName", paramString5);
    if (!bg.nm(paramString3)) {
      localHashMap.put("username", paramString3);
    }
    if (!bg.nm(paramString2))
    {
      localHashMap.put("headImg", URLEncoder.encode(paramString2));
      localHashMap.put("nickName", URLEncoder.encode(bg.nl(paramString6)));
      if (!bg.nm(paramString4)) {
        localHashMap.put("receiveNickName", URLEncoder.encode(paramString4));
      }
    }
    localHashMap.put("inWay", String.valueOf(paramInt3));
    if ((paramInt3 == 0) || (paramInt3 == 1) || (paramInt3 == 7)) {
      localHashMap.put("needSendToMySelf", "0");
    }
    x(localHashMap);
    GMTrace.o(9745415012352L, 72609);
  }
  
  public static a E(JSONObject paramJSONObject)
  {
    GMTrace.i(9745951883264L, 72613);
    a locala = new a();
    locala.eLQ = paramJSONObject.optString("retmsg");
    paramJSONObject = paramJSONObject.optJSONObject("showmess");
    locala.mJO = paramJSONObject.optString("left_button_wording");
    locala.mJP = paramJSONObject.optString("right_button_wording");
    locala.jWz = paramJSONObject.optString("right_button_url");
    GMTrace.o(9745951883264L, 72613);
    return locala;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(9745817665536L, 72612);
    this.mFr = paramJSONObject.optString("sendId");
    this.mJK = paramJSONObject.optString("reqkey");
    this.mJL = paramJSONObject.optString("sendMsgXml");
    this.mJM = paramJSONObject.optString("guide_flag", "0");
    this.mJN = paramJSONObject.optString("guide_wording");
    this.mJO = paramJSONObject.optString("left_button_wording", "");
    this.mJP = paramJSONObject.optString("right_button_wording", "");
    this.mJQ = paramJSONObject.optString("upload_credit_url", "");
    if (paramJSONObject.has("showmess"))
    {
      w.i("MicroMsg.NetSceneLuckyMoneyNormalBase", "has alert item");
      this.eTV = E(paramJSONObject);
    }
    GMTrace.o(9745817665536L, 72612);
  }
  
  public final String aoA()
  {
    GMTrace.i(9745683447808L, 72611);
    GMTrace.o(9745683447808L, 72611);
    return "/cgi-bin/mmpay-bin/requestwxhb";
  }
  
  public final int getType()
  {
    GMTrace.i(9745549230080L, 72610);
    GMTrace.o(9745549230080L, 72610);
    return 1575;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */