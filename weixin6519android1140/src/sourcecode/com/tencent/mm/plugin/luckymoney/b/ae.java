package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.messenger.a.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ae
  extends z
{
  long eDr;
  String eDs;
  public String eYm;
  public int eYn;
  public int eYo;
  public int eqV;
  public String mFr;
  public String mFz;
  public String mIB;
  public int mIb;
  public String mIc;
  public String mIf;
  public String mIh;
  public int mIp;
  public ag mIv;
  public String mIw;
  public int mJD;
  public String mJR;
  public long mJS;
  public long mJT;
  public int mJU;
  public String mJV;
  public int mJo;
  public String mJp;
  public String mJq;
  public String mJr;
  public String mJs;
  public String mJt;
  public long mJu;
  public int msgType;
  
  public ae(int paramInt1, String paramString1, String paramString2, int paramInt2, String paramString3)
  {
    GMTrace.i(9728637796352L, 72484);
    this.mJo = 1;
    this.mJp = null;
    this.mJq = null;
    this.mJr = null;
    this.mJs = null;
    this.mJt = null;
    this.mJu = 0L;
    this.mJD = 0;
    this.msgType = 1;
    this.eqV = paramInt1;
    this.mFr = paramString1;
    this.eYm = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("msgType", "1");
    localHashMap.put("channelId", String.valueOf(paramInt1));
    localHashMap.put("sendId", paramString1);
    localHashMap.put("inWay", String.valueOf(paramInt2));
    localHashMap.put("ver", paramString3);
    h.xz();
    long l = ((Long)h.xy().xh().get(w.a.vuf, Long.valueOf(0L))).longValue();
    if (l > 0L)
    {
      if (System.currentTimeMillis() >= l) {
        break label237;
      }
      localHashMap.put("agreeDuty", "0");
    }
    for (;;)
    {
      if (!bg.nm(paramString2)) {
        localHashMap.put("nativeUrl", URLEncoder.encode(paramString2));
      }
      x(localHashMap);
      GMTrace.o(9728637796352L, 72484);
      return;
      label237:
      paramString1 = new StringBuilder();
      h.xz();
      localHashMap.put("agreeDuty", (Integer)h.xy().xh().get(w.a.vug, Integer.valueOf(1)));
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(9729040449536L, 72487);
    this.mJR = paramJSONObject.optString("sendNick");
    this.mIh = paramJSONObject.optString("sendHeadImg");
    this.eYn = paramJSONObject.optInt("hbStatus");
    this.eYo = paramJSONObject.optInt("receiveStatus");
    this.mIc = paramJSONObject.optString("statusMess");
    this.mIf = paramJSONObject.optString("wishing");
    this.mIp = paramJSONObject.optInt("isSender");
    this.mJS = paramJSONObject.optLong("sceneAmount");
    this.mJT = paramJSONObject.optLong("sceneRecTimeStamp");
    this.mIb = paramJSONObject.optInt("hbType");
    this.mIw = paramJSONObject.optString("watermark");
    this.mFz = paramJSONObject.optString("externMess");
    this.mIB = paramJSONObject.optString("sendUserName");
    if ((!bg.nm(this.mIB)) && (bg.nm(this.mJR))) {
      this.mJR = ((a)h.h(a.class)).fs(this.mIB);
    }
    this.mIv = l.D(paramJSONObject.optJSONObject("operationTail"));
    this.mJD = paramJSONObject.optInt("scenePicSwitch");
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
    w.i("MicroMsg.NetSceneReceiveLuckyMoney", "scenePicSwitch:" + this.mJD);
    this.mJU = paramJSONObject.optInt("preStrainFlag", 1);
    w.i("MicroMsg.NetSceneReceiveLuckyMoney", "preStrainFlag:" + this.mJU);
    h.xz();
    h.xy().xh().a(w.a.vtU, Integer.valueOf(this.mJU));
    this.mJV = paramJSONObject.optString("timingIdentifier");
    GMTrace.o(9729040449536L, 72487);
  }
  
  public final boolean aMj()
  {
    GMTrace.i(9729174667264L, 72488);
    if (this.mIp == 1)
    {
      GMTrace.o(9729174667264L, 72488);
      return true;
    }
    GMTrace.o(9729174667264L, 72488);
    return false;
  }
  
  public final String aoA()
  {
    GMTrace.i(9728906231808L, 72486);
    GMTrace.o(9728906231808L, 72486);
    return "/cgi-bin/mmpay-bin/receivewxhb";
  }
  
  public final int getType()
  {
    GMTrace.i(9728772014080L, 72485);
    GMTrace.o(9728772014080L, 72485);
    return 1581;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */