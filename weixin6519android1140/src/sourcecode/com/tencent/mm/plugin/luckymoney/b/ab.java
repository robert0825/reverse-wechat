package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.messenger.a.a;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class ab
  extends z
{
  long eDr;
  public String eDs;
  public String eYm;
  public String mFr;
  public String mJJ;
  public e mJj;
  public RealnameGuideHelper mJk;
  
  public ab(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    GMTrace.i(9739240996864L, 72563);
    this.mJj = null;
    this.mFr = paramString1;
    this.eYm = paramString2;
    this.eDs = paramString5;
    HashMap localHashMap = new HashMap();
    localHashMap.put("msgType", String.valueOf(paramInt1));
    localHashMap.put("channelId", String.valueOf(paramInt2));
    localHashMap.put("sendId", paramString1);
    if (!bg.nm(paramString2)) {
      localHashMap.put("nativeUrl", URLEncoder.encode(paramString2));
    }
    if (!bg.nm(paramString3))
    {
      localHashMap.put("headImg", URLEncoder.encode(paramString3));
      localHashMap.put("nickName", URLEncoder.encode(bg.nl(paramString4)));
    }
    localHashMap.put("sessionUserName", paramString5);
    localHashMap.put("ver", paramString6);
    localHashMap.put("timingIdentifier", paramString7);
    x(localHashMap);
    GMTrace.o(9739240996864L, 72563);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(9739643650048L, 72566);
    try
    {
      this.mJj = l.B(paramJSONObject);
      if ((paramInt == 0) && (paramJSONObject.has("real_name_info")))
      {
        Object localObject = paramJSONObject.optJSONObject("real_name_info");
        if (localObject != null)
        {
          paramString = ((JSONObject)localObject).optString("guide_flag");
          String str1 = ((JSONObject)localObject).optString("guide_wording");
          String str2 = ((JSONObject)localObject).optString("left_button_wording");
          String str3 = ((JSONObject)localObject).optString("right_button_wording");
          localObject = ((JSONObject)localObject).optString("upload_credit_url");
          this.mJk = new RealnameGuideHelper();
          this.mJk.a(paramString, str1, str2, str3, (String)localObject, 1003);
        }
      }
      this.mJJ = paramJSONObject.optString("SystemMsgContext");
      if ((paramInt == 0) && (!bg.nm(this.mJJ)))
      {
        boolean bool = bg.nm(this.mJj.mIB);
        if (!bool) {
          try
          {
            this.mJJ = this.mJJ.replace("$" + this.mJj.mIB + "$", ((a)h.h(a.class)).fs(this.mJj.mIB));
            n.cO(this.mJJ, this.eDs);
            GMTrace.o(9739643650048L, 72566);
            return;
          }
          catch (Exception paramString)
          {
            w.e("NetSceneLuckyMoneyDetail", "insertLocalSysMsgIfNeed error: %s", new Object[] { paramString.getMessage() });
          }
        }
      }
      GMTrace.o(9739643650048L, 72566);
      return;
    }
    catch (JSONException paramString)
    {
      w.w("NetSceneLuckyMoneyDetail", "parse luckyMoneyDetail fail: " + paramString.getLocalizedMessage());
      GMTrace.o(9739643650048L, 72566);
    }
  }
  
  public final String aoA()
  {
    GMTrace.i(9739509432320L, 72565);
    GMTrace.o(9739509432320L, 72565);
    return "/cgi-bin/mmpay-bin/openwxhb";
  }
  
  public final int getType()
  {
    GMTrace.i(9739375214592L, 72564);
    GMTrace.o(9739375214592L, 72564);
    return 1685;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */