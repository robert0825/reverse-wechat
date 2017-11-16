package com.tencent.mm.plugin.offline.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class n
  extends com.tencent.mm.wallet_core.g.a.h
{
  public static String nAK;
  public static String nBc;
  private int jWs;
  private String jWt;
  public int nAA;
  public String nAB;
  public String nBd;
  public String nBe;
  public String nBf;
  
  static
  {
    GMTrace.i(6196027195392L, 46164);
    nAK = "";
    nBc = "";
    GMTrace.o(6196027195392L, 46164);
  }
  
  public n(String paramString, int paramInt)
  {
    GMTrace.i(6195356106752L, 46159);
    this.jWs = -1;
    this.jWt = "";
    this.nAA = -1;
    this.nAB = "";
    this.nBd = "";
    this.nBe = "";
    this.nBf = "";
    HashMap localHashMap = new HashMap();
    localHashMap.put("device_id", p.ta());
    localHashMap.put("timestamp", paramString);
    localHashMap.put("scene", String.valueOf(paramInt));
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(p.ta());
    localStringBuilder.append("&");
    localStringBuilder.append(paramString);
    localHashMap.put("sign", aa.RP(localStringBuilder.toString()));
    paramString = new StringBuilder();
    com.tencent.mm.kernel.h.xz();
    localHashMap.put("code_ver", com.tencent.mm.kernel.h.xy().xh().get(w.a.vpI, ""));
    x(localHashMap);
    GMTrace.o(6195356106752L, 46159);
  }
  
  public final int Bb()
  {
    GMTrace.i(6195758759936L, 46162);
    GMTrace.o(6195758759936L, 46162);
    return 568;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6195624542208L, 46161);
    if (paramJSONObject != null)
    {
      nAK = paramJSONObject.optString("limit_fee");
      nBc = paramJSONObject.optString("is_show_order_detail");
      paramString = paramJSONObject.optString("pay_amount");
      String str1 = paramJSONObject.optString("pay_number");
      String str2 = paramJSONObject.optString("card_logos");
      k.aVi();
      k.ai(196629, nAK);
      k.aVi();
      k.ai(196641, nBc);
      k.aVi();
      k.ai(196645, paramString);
      k.aVi();
      k.ai(196646, str1);
      a.Em(str2);
      this.jWs = paramJSONObject.optInt("retcode");
      this.jWt = paramJSONObject.optString("retmsg");
      this.nAA = paramJSONObject.optInt("wx_error_type");
      this.nAB = paramJSONObject.optString("wx_error_msg");
      this.nBd = paramJSONObject.optString("get_code_flag");
      this.nBe = paramJSONObject.optString("micropay_pause_flag");
      this.nBf = paramJSONObject.optString("micropay_pause_word");
    }
    GMTrace.o(6195624542208L, 46161);
  }
  
  public final int aoD()
  {
    GMTrace.i(6195490324480L, 46160);
    GMTrace.o(6195490324480L, 46160);
    return 49;
  }
  
  public final String getUri()
  {
    GMTrace.i(6195892977664L, 46163);
    GMTrace.o(6195892977664L, 46163);
    return "/cgi-bin/mmpay-bin/tenpay/offlinequeryuser";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */