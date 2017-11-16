package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class s
  extends q
{
  public long eYB;
  public int eYn;
  public int eYo;
  public int jWn;
  public String mFr;
  public String mIc;
  public a mIt;
  public String mJb;
  public String mJc;
  public int mJd;
  public String mJe;
  public int mJf;
  public String mJg;
  public String mJh;
  public int mJi;
  public e mJj;
  public RealnameGuideHelper mJk;
  
  public s(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4)
  {
    GMTrace.i(9725819224064L, 72463);
    this.mJj = null;
    this.mFr = paramString1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("sendId", paramString1);
    if (!bg.nm(paramString2)) {
      localHashMap.put("nativeUrl", URLEncoder.encode(paramString2));
    }
    localHashMap.put("way", String.valueOf(paramInt));
    localHashMap.put("channelId", "2");
    localHashMap.put("package", paramString3);
    localHashMap.put("sessionUserName", paramString4);
    x(localHashMap);
    GMTrace.o(9725819224064L, 72463);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(9726087659520L, 72465);
    this.mJb = paramJSONObject.optString("spidName");
    this.eYn = paramJSONObject.optInt("hbStatus");
    this.eYo = paramJSONObject.optInt("receiveStatus");
    this.mIc = paramJSONObject.optString("statusMess");
    this.mJc = paramJSONObject.optString("hintMess");
    this.eYB = paramJSONObject.optLong("amount");
    this.mJd = paramJSONObject.optInt("recNum");
    this.jWn = paramJSONObject.optInt("totalNum");
    this.mIt = new a();
    paramString = paramJSONObject.optJSONObject("atomicFunc");
    if (paramString != null)
    {
      this.mIt.fPf = paramString.optInt("enable");
      this.mIt.mHN = paramString.optString("fissionContent");
      this.mIt.mHM = paramString.optString("fissionUrl");
    }
    this.mJf = paramJSONObject.optInt("focusFlag");
    this.mJg = paramJSONObject.optString("focusWording");
    this.mJh = paramJSONObject.optString("focusAppidUserName");
    this.mJi = paramJSONObject.optInt("isFocus");
    this.mJe = paramJSONObject.optString("smallHbButtonMess");
    try
    {
      this.mJj = l.B(paramJSONObject);
      this.mJj.mIh = paramJSONObject.optString("spidLogo");
      this.mJj.mIg = paramJSONObject.optString("spidName");
      this.mJj.mIf = paramJSONObject.optString("spidWishing");
      if ((paramInt == 0) && (paramJSONObject.has("real_name_info")))
      {
        Object localObject = paramJSONObject.optJSONObject("real_name_info");
        if (localObject != null)
        {
          paramString = ((JSONObject)localObject).optString("guide_flag");
          paramJSONObject = ((JSONObject)localObject).optString("guide_wording");
          String str1 = ((JSONObject)localObject).optString("left_button_wording");
          String str2 = ((JSONObject)localObject).optString("right_button_wording");
          localObject = ((JSONObject)localObject).optString("upload_credit_url");
          this.mJk = new RealnameGuideHelper();
          this.mJk.a(paramString, paramJSONObject, str1, str2, (String)localObject, 1005);
        }
      }
      GMTrace.o(9726087659520L, 72465);
      return;
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        w.w("MicroMsg.NetSceneLuckyMoneyBusiBase", "parse luckyMoneyDetail fail: " + paramString.getLocalizedMessage());
      }
    }
  }
  
  public final int aoB()
  {
    GMTrace.i(9725953441792L, 72464);
    GMTrace.o(9725953441792L, 72464);
    return 1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */