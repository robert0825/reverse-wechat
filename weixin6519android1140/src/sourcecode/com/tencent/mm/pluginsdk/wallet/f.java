package com.tencent.mm.pluginsdk.wallet;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.lk;
import com.tencent.mm.g.a.lk.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;
import org.json.JSONObject;

public final class f
{
  public String appId;
  public String ePJ;
  public String ePK;
  public int ePL;
  public int ePM;
  public int ePN;
  public String extInfo;
  public String nonceStr;
  public String packageExt;
  public String partnerId;
  public String signType;
  public int tIM;
  public String tIN;
  public int tIO;
  public String timeStamp;
  public String url;
  
  public f(lk paramlk)
  {
    GMTrace.i(1229971259392L, 9164);
    this.tIM = 0;
    this.tIO = 0;
    if ((paramlk == null) || (paramlk.ePI == null))
    {
      GMTrace.o(1229971259392L, 9164);
      return;
    }
    this.appId = paramlk.ePI.appId;
    this.partnerId = paramlk.ePI.partnerId;
    this.signType = paramlk.ePI.signType;
    this.nonceStr = paramlk.ePI.nonceStr;
    this.timeStamp = paramlk.ePI.timeStamp;
    this.packageExt = paramlk.ePI.packageExt;
    this.ePJ = paramlk.ePI.ePJ;
    this.url = paramlk.ePI.url;
    this.ePK = paramlk.ePI.ePK;
    this.ePL = paramlk.ePI.ePL;
    this.ePN = paramlk.ePI.ePN;
    this.ePM = paramlk.ePI.ePM;
    GMTrace.o(1229971259392L, 9164);
  }
  
  public f(Map<String, Object> paramMap)
  {
    GMTrace.i(1229702823936L, 9162);
    this.tIM = 0;
    this.tIO = 0;
    this.appId = ((String)paramMap.get("appId"));
    this.partnerId = ((String)paramMap.get("partnerId"));
    this.signType = ((String)paramMap.get("signType"));
    this.nonceStr = ((String)paramMap.get("nonceStr"));
    this.timeStamp = ((String)paramMap.get("timeStamp"));
    this.packageExt = ((String)paramMap.get("package"));
    this.ePJ = ((String)paramMap.get("paySign"));
    this.url = ((String)paramMap.get("url"));
    this.ePK = ((String)paramMap.get("src_username"));
    this.ePL = bg.getInt((String)paramMap.get("scene"), 0);
    if (this.ePL == 0) {
      this.ePL = bg.getInt((String)paramMap.get("pay_scene"), 0);
    }
    this.ePN = bg.getInt((String)paramMap.get("pay_channel"), 0);
    this.extInfo = bg.nl((String)paramMap.get("ext_info"));
    this.tIN = bg.nl((String)paramMap.get("token"));
    this.tIO = bg.getInt(bg.aq((String)paramMap.get("result_jump_mode"), "0"), 0);
    GMTrace.o(1229702823936L, 9162);
  }
  
  public f(JSONObject paramJSONObject)
  {
    GMTrace.i(1229837041664L, 9163);
    this.tIM = 0;
    this.tIO = 0;
    this.appId = paramJSONObject.optString("appId");
    this.partnerId = paramJSONObject.optString("partnerId");
    this.signType = paramJSONObject.optString("signType");
    this.nonceStr = paramJSONObject.optString("nonceStr");
    this.timeStamp = paramJSONObject.optString("timeStamp");
    this.packageExt = paramJSONObject.optString("package");
    this.ePJ = paramJSONObject.optString("paySign");
    this.url = paramJSONObject.optString("url");
    this.ePK = paramJSONObject.optString("src_username");
    this.ePL = paramJSONObject.optInt("scene", 0);
    if (this.ePL == 0) {
      this.ePL = paramJSONObject.optInt("pay_scene", 0);
    }
    this.ePN = paramJSONObject.optInt("pay_channel", 0);
    this.extInfo = paramJSONObject.optString("ext_info", "");
    this.tIN = paramJSONObject.optString("token", "");
    this.tIO = bg.getInt(paramJSONObject.optString("result_jump_mode", "0"), 0);
    GMTrace.o(1229837041664L, 9163);
  }
  
  public static int dY(int paramInt1, int paramInt2)
  {
    GMTrace.i(14909710532608L, 111086);
    int i;
    if (paramInt1 != 1037) {
      i = paramInt1;
    }
    for (;;)
    {
      if ((i == 1000) || (i == 1018) || (i == 1017) || (i == 1033)) {
        i = 0;
      }
      for (;;)
      {
        w.i("MicroMsg.WalletJsapiData", "parsePayChannelByScene, scene: %s, rawScene: %s, resultChannel: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
        GMTrace.o(14909710532608L, 111086);
        return i;
        if (paramInt2 <= 0) {
          break label488;
        }
        i = paramInt2;
        break;
        if (i == 1019) {
          i = 1;
        } else if (i == 1010) {
          i = 5;
        } else if ((i == 1007) || (i == 1008)) {
          i = 6;
        } else if (i == 1009) {
          i = 7;
        } else if ((i == 1035) || (i == 1020)) {
          i = 8;
        } else if ((i == 1011) || (i == 1047) || (i == 1025)) {
          i = 12;
        } else if ((i == 1012) || (i == 1032) || (i == 1048) || (i == 1050)) {
          i = 13;
        } else if ((i == 1005) || (i == 1027) || (i == 1042) || (i == 1006)) {
          i = 15;
        } else if ((i == 1024) || (i == 1021)) {
          i = 16;
        } else if ((i == 1029) || (i == 1028)) {
          i = 23;
        } else if ((i == 1013) || (i == 1031) || (i == 1049)) {
          i = 24;
        } else if ((i == 1001) || (i == 1003)) {
          i = 25;
        } else if ((i == 1045) || (i == 1046)) {
          i = 26;
        } else if (i == 1022) {
          i = 27;
        } else if (i == 1023) {
          i = 28;
        } else if (i == 1026) {
          i = 29;
        } else if (i == 1039) {
          i = 30;
        } else if ((i == 1034) || (i == 1060)) {
          i = 31;
        } else if ((i == 1014) || (i == 1043) || (i == 1044) || (i == 1036)) {
          i = 32;
        } else {
          i = 0;
        }
      }
      label488:
      i = paramInt1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\wallet\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */