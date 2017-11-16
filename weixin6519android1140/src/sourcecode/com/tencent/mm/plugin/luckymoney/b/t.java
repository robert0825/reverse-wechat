package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.w.a;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class t
  extends q
{
  public String eYm;
  public int eYn;
  public int eYo;
  public String mFr;
  public int mIb;
  public String mIc;
  public ag mIv;
  public String mIw;
  public String mJb;
  public String mJc;
  public int mJf;
  public String mJg;
  public String mJh;
  public int mJi;
  public int mJl;
  public String mJm;
  public String mJn;
  public int mJo;
  public String mJp;
  public String mJq;
  public String mJr;
  public String mJs;
  public String mJt;
  public long mJu;
  
  public t(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    GMTrace.i(9736556642304L, 72543);
    this.mJo = 1;
    this.mJp = null;
    this.mJq = null;
    this.mJr = null;
    this.mJs = null;
    this.mJt = null;
    this.mJu = 0L;
    this.eYm = paramString2;
    this.mFr = paramString1;
    this.mJl = paramInt;
    HashMap localHashMap = new HashMap();
    localHashMap.put("sendId", paramString1);
    if (!bg.nm(paramString2)) {
      localHashMap.put("nativeUrl", URLEncoder.encode(paramString2));
    }
    localHashMap.put("way", String.valueOf(paramInt));
    localHashMap.put("channelId", "2");
    localHashMap.put("package", paramString3);
    h.xz();
    long l = ((Long)h.xy().xh().get(w.a.vuf, Long.valueOf(0L))).longValue();
    if (l > 0L)
    {
      if (System.currentTimeMillis() >= l) {
        break label212;
      }
      localHashMap.put("agreeDuty", "0");
    }
    for (;;)
    {
      x(localHashMap);
      GMTrace.o(9736556642304L, 72543);
      return;
      label212:
      paramString1 = new StringBuilder();
      h.xz();
      localHashMap.put("agreeDuty", (Integer)h.xy().xh().get(w.a.vug, Integer.valueOf(1)));
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(9736825077760L, 72545);
    this.mJm = paramJSONObject.optString("spidLogo");
    this.mJn = paramJSONObject.optString("spidWishing");
    this.mJb = paramJSONObject.optString("spidName");
    this.mJm = paramJSONObject.optString("spidLogo");
    this.eYn = paramJSONObject.optInt("hbStatus");
    this.eYo = paramJSONObject.optInt("receiveStatus");
    this.mIc = paramJSONObject.optString("statusMess");
    this.mJc = paramJSONObject.optString("hintMess");
    this.mIw = paramJSONObject.optString("watermark");
    this.mFr = paramJSONObject.optString("sendId");
    this.mJf = paramJSONObject.optInt("focusFlag");
    this.mJg = paramJSONObject.optString("focusWording");
    this.mJh = paramJSONObject.optString("focusAppidUserName");
    this.mJi = paramJSONObject.optInt("isFocus");
    this.mIb = paramJSONObject.optInt("hbType");
    paramString = paramJSONObject.optJSONObject("agree_duty");
    if (paramString != null)
    {
      this.mJp = paramString.optString("agreed_flag", "-1");
      this.mJq = paramString.optString("title", "");
      this.mJr = paramString.optString("service_protocol_wording", "");
      this.mJs = paramString.optString("service_protocol_url", "");
      this.mJt = paramString.optString("button_wording", "");
      this.mJu = paramString.optLong("delay_expired_time", 0L);
    }
    if (this.mJu > 0L)
    {
      h.xz();
      h.xy().xh().a(w.a.vuf, Long.valueOf(System.currentTimeMillis() + this.mJu * 1000L));
    }
    this.mIv = l.D(paramJSONObject.optJSONObject("operationTail"));
    GMTrace.o(9736825077760L, 72545);
  }
  
  public final int aoB()
  {
    GMTrace.i(9736690860032L, 72544);
    GMTrace.o(9736690860032L, 72544);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */