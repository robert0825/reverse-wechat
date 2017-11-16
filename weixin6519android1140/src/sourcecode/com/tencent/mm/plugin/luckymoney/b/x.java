package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class x
  extends z
{
  public g mJF;
  public List<String> mJG;
  public String mJH;
  public String mJI;
  public String mJv;
  
  public x(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(9737227730944L, 72548);
    this.mJI = null;
    HashMap localHashMap = new HashMap();
    localHashMap.put("limit", String.valueOf(paramInt1));
    localHashMap.put("offset", String.valueOf(paramInt2));
    localHashMap.put("type", String.valueOf(paramInt3));
    localHashMap.put("year", paramString1);
    localHashMap.put("ver", paramString2);
    localHashMap.put("processContent", paramString3);
    x(localHashMap);
    GMTrace.o(9737227730944L, 72548);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(9737630384128L, 72551);
    try
    {
      paramString = new g();
      paramString.mIE = paramJSONObject.optInt("recTotalNum");
      paramString.mIF = paramJSONObject.optLong("recTotalAmount");
      paramString.mIG = paramJSONObject.optInt("sendTotalNum");
      paramString.mIH = paramJSONObject.optLong("sendTotalAmount");
      paramString.mIq = paramJSONObject.optInt("isContinue");
      paramString.gRL = paramJSONObject.optInt("gameCount");
      JSONArray localJSONArray = paramJSONObject.optJSONArray("record");
      LinkedList localLinkedList = new LinkedList();
      if (localJSONArray != null)
      {
        paramInt = 0;
        while (paramInt < localJSONArray.length())
        {
          JSONObject localJSONObject = localJSONArray.getJSONObject(paramInt);
          h localh = new h();
          localh.mII = localJSONObject.optString("sendName");
          localh.mIh = localJSONObject.optString("sendHeadImg");
          localh.mIJ = localJSONObject.optLong("receiveAmount");
          localh.mIK = localJSONObject.optString("receiveTime");
          localh.mIb = localJSONObject.optInt("hbType");
          localh.mIL = localJSONObject.optString("sendTitle");
          localh.mIM = localJSONObject.optString("sendTime");
          localh.mIm = localJSONObject.optLong("totalAmount");
          localh.mIN = localJSONObject.optLong("totalNum");
          localh.mIk = localJSONObject.optLong("recNum");
          localh.status = localJSONObject.optInt("status");
          localh.mIO = localJSONObject.optInt("thxCount");
          localh.mIn = localJSONObject.optString("receiveId");
          localh.mFr = localJSONObject.optString("sendId");
          localh.mIy = localJSONObject.optInt("hbKind");
          localLinkedList.add(localh);
          paramInt += 1;
        }
      }
      paramString.mIz = localLinkedList;
      this.mJF = paramString;
      this.mJG = new ArrayList();
      paramString = paramJSONObject.optString("years");
      if (!bg.nm(paramString))
      {
        paramString = paramString.split("\\|");
        if (paramString != null)
        {
          paramInt = 0;
          while (paramInt < paramString.length)
          {
            this.mJG.add(paramString[paramInt]);
            paramInt += 1;
          }
        }
      }
      this.mJH = paramJSONObject.optString("recordYear");
      this.mJI = paramJSONObject.optString("clickedUrl");
      this.mJv = paramJSONObject.optString("processContent");
      GMTrace.o(9737630384128L, 72551);
      return;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.NetSceneLuckyMoneyNormalBase", paramString, "", new Object[0]);
      GMTrace.o(9737630384128L, 72551);
    }
  }
  
  public final boolean aMi()
  {
    GMTrace.i(9737764601856L, 72552);
    if (this.mJF != null)
    {
      if (this.mJF.mIq == 1)
      {
        GMTrace.o(9737764601856L, 72552);
        return true;
      }
      GMTrace.o(9737764601856L, 72552);
      return false;
    }
    GMTrace.o(9737764601856L, 72552);
    return true;
  }
  
  public final String aoA()
  {
    GMTrace.i(9737496166400L, 72550);
    GMTrace.o(9737496166400L, 72550);
    return "/cgi-bin/mmpay-bin/qrylistwxhb";
  }
  
  public final int getType()
  {
    GMTrace.i(9737361948672L, 72549);
    GMTrace.o(9737361948672L, 72549);
    return 1514;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */