package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.luckymoney.a.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class v
  extends z
{
  public int jWC;
  public String jWE;
  public String mHY;
  public String mHZ;
  public String mIf;
  public ag mIv;
  public ag mJA;
  public ag mJB;
  public ag mJC;
  public int mJD;
  public LinkedList<k> mJE;
  public String mJw;
  public boolean mJx;
  public int mJy;
  public String mJz;
  
  public v(String paramString)
  {
    GMTrace.i(9743267528704L, 72593);
    this.mJD = 0;
    HashMap localHashMap = new HashMap();
    localHashMap.put("scene", "8");
    localHashMap.put("ver", paramString);
    h.xz();
    localHashMap.put("walletType", String.valueOf(h.xy().xh().get(339975, null)));
    x(localHashMap);
    GMTrace.o(9743267528704L, 72593);
  }
  
  public v(String paramString, byte paramByte)
  {
    GMTrace.i(9743401746432L, 72594);
    this.mJD = 0;
    HashMap localHashMap = new HashMap();
    localHashMap.put("ver", paramString);
    h.xz();
    localHashMap.put("walletType", String.valueOf(h.xy().xh().get(339975, null)));
    x(localHashMap);
    GMTrace.o(9743401746432L, 72594);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(9743804399616L, 72597);
    if (paramInt == 0)
    {
      this.mJy = paramJSONObject.optInt("randomAmount");
      this.mJw = paramJSONObject.optString("randomWishing");
      this.jWE = paramJSONObject.optString("notice");
      this.mJz = paramJSONObject.optString("notice_url");
      boolean bool;
      if (paramJSONObject.optInt("hasCanShareHongBao") == 1) {
        bool = true;
      }
      for (;;)
      {
        this.mJx = bool;
        this.jWC = paramJSONObject.optInt("currency");
        this.mHY = paramJSONObject.optString("currencyUint");
        this.mHZ = paramJSONObject.optString("currencyWording");
        w.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "currency=" + this.jWC + ";currencyUint=" + this.mHY + ";currencyWording=" + this.mHZ);
        paramString = new c();
        paramString.mHS = paramJSONObject.optString("groupHint");
        paramString.mHT = paramJSONObject.optString("personalHint");
        paramString.mHR = (paramJSONObject.optLong("totalAmount", 200000L) / 100.0D);
        paramString.mHQ = paramJSONObject.optInt("totalNum", 100);
        paramString.mHU = (paramJSONObject.optLong("perPersonMaxValue", 20000L) / 100.0D);
        paramString.mHV = (paramJSONObject.optLong("perGroupMaxValue", 20000L) / 100.0D);
        paramString.mHW = (paramJSONObject.optLong("perMinValue", 1L) / 100.0D);
        paramString.mHX = paramJSONObject.optInt("payShowBGFlag");
        paramString.jWC = this.jWC;
        paramString.mHY = this.mHY;
        paramString.mHZ = this.mHZ;
        a.aLP();
        Object localObject = a.aLQ();
        ((d)localObject).mIa = paramString;
        w.i("MicroMsg.LuckyMoneyConfigManager", "setConfig maxTotalAmount:" + ((d)localObject).mIa.mHR + " maxTotalNum:" + ((d)localObject).mIa.mHQ + " perGroupMaxValue:" + ((d)localObject).mIa.mHV + " perMinValue:" + ((d)localObject).mIa.mHW + " perPersonMaxValue:" + ((d)localObject).mIa.mHU);
        try
        {
          paramString = new String(((d)localObject).mIa.toByteArray(), "ISO-8859-1");
          h.xz();
          h.xy().xh().set(356355, paramString);
          h.xz();
          h.xy().xh().kL(true);
          this.mJA = l.D(paramJSONObject.optJSONObject("operationHeader"));
          this.mIv = l.D(paramJSONObject.optJSONObject("operationTail"));
          this.mJB = l.D(paramJSONObject.optJSONObject("operationNext"));
          this.mJC = l.D(paramJSONObject.optJSONObject("operationMiddle"));
          paramInt = paramJSONObject.optInt("sceneSwitch");
          h.xz();
          h.xy().xh().a(w.a.vqv, Integer.valueOf(paramInt));
          w.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "sceneSwitch:" + paramInt);
          this.mJD = paramJSONObject.optInt("scenePicSwitch");
          w.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "scenePicSwitch:" + this.mJD);
          this.mIf = paramJSONObject.optString("wishing");
          w.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "wishing: %s", new Object[] { this.mIf });
          paramString = paramJSONObject.optJSONArray("yearMess");
          if ((paramString != null) && (paramString.length() > 0))
          {
            w.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "yearMessJson length:" + paramString.length());
            this.mJE = new LinkedList();
            paramInt = 0;
            while (paramInt < paramString.length())
            {
              paramJSONObject = paramString.optJSONObject(paramInt);
              localObject = new k();
              ((k)localObject).mIU = paramJSONObject.optInt("yearAmount", 0);
              ((k)localObject).mIV = paramJSONObject.optString("yearWish");
              this.mJE.add(localObject);
              paramInt += 1;
              continue;
              bool = false;
            }
          }
        }
        catch (UnsupportedEncodingException paramString)
        {
          for (;;)
          {
            w.w("MicroMsg.LuckyMoneyConfigManager", "save config exp, " + paramString.getLocalizedMessage());
          }
        }
        catch (IOException paramString)
        {
          for (;;)
          {
            w.w("MicroMsg.LuckyMoneyConfigManager", "save config exp, " + paramString.getLocalizedMessage());
          }
          GMTrace.o(9743804399616L, 72597);
          return;
        }
      }
      w.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "yearMessJson is empty!");
      GMTrace.o(9743804399616L, 72597);
      return;
    }
    w.e("MicroMsg.NetSceneLuckyMoneyGetConfig", "hongbao operation fail, errCode:" + paramInt + ", errMsg:" + paramString);
    GMTrace.o(9743804399616L, 72597);
  }
  
  public final String aoA()
  {
    GMTrace.i(9743670181888L, 72596);
    GMTrace.o(9743670181888L, 72596);
    return "/cgi-bin/mmpay-bin/operationwxhb";
  }
  
  public final int getType()
  {
    GMTrace.i(9743535964160L, 72595);
    GMTrace.o(9743535964160L, 72595);
    return 1554;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */