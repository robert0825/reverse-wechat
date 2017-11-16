package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class l
{
  public static e B(JSONObject paramJSONObject)
  {
    GMTrace.i(9735482900480L, 72535);
    e locale = new e();
    if (paramJSONObject != null)
    {
      locale.mIb = paramJSONObject.optInt("hbType");
      locale.eYn = paramJSONObject.optInt("hbStatus");
      locale.mIc = paramJSONObject.optString("statusMess");
      locale.mIe = paramJSONObject.optString("gameMess");
      locale.mIf = paramJSONObject.optString("wishing");
      locale.mIg = paramJSONObject.optString("sendNick");
      locale.mIh = paramJSONObject.optString("sendHeadImg");
      locale.mFr = paramJSONObject.optString("sendId");
      locale.mIi = paramJSONObject.optString("adMessage");
      locale.mIj = paramJSONObject.optString("adUrl");
      locale.eYB = paramJSONObject.optLong("amount");
      locale.mIk = paramJSONObject.optLong("recNum");
      locale.mIl = paramJSONObject.optLong("recAmount");
      locale.jWn = paramJSONObject.optInt("totalNum");
      locale.mIm = paramJSONObject.optLong("totalAmount");
      locale.mIn = paramJSONObject.optString("receiveId");
      locale.mIo = paramJSONObject.optInt("hasWriteAnswer");
      locale.mIp = paramJSONObject.optInt("isSender");
      locale.mIq = paramJSONObject.optInt("isContinue");
      locale.mIr = paramJSONObject.optString("headTitle");
      locale.eYo = paramJSONObject.optInt("receiveStatus");
      locale.mIs = paramJSONObject.optInt("canShare");
      locale.mFw = paramJSONObject.optInt("jumpChange");
      locale.mFy = paramJSONObject.optString("changeWording");
      locale.mFx = paramJSONObject.optString("changeUrl");
      locale.mIy = paramJSONObject.optInt("hbKind");
      locale.mFz = paramJSONObject.optString("externMess");
      locale.mIB = paramJSONObject.optString("sendUserName");
      if ((bg.nm(locale.mIg)) && (!bg.nm(locale.mIB))) {
        locale.mIg = ((com.tencent.mm.plugin.messenger.a.a)h.h(com.tencent.mm.plugin.messenger.a.a.class)).fs(locale.mIB);
      }
      locale.mIt = new a();
      Object localObject = paramJSONObject.optJSONObject("atomicFunc");
      if (localObject != null)
      {
        locale.mIt.fPf = ((JSONObject)localObject).optInt("enable");
        locale.mIt.mHN = ((JSONObject)localObject).optString("fissionContent");
        locale.mIt.mHM = ((JSONObject)localObject).optString("fissionUrl");
      }
      locale.mIu = new LinkedList();
      localObject = paramJSONObject.optJSONArray("operationHeader");
      if (localObject != null)
      {
        int i = 0;
        while (i < ((JSONArray)localObject).length())
        {
          locale.mIu.add(D(((JSONArray)localObject).getJSONObject(i)));
          i += 1;
        }
      }
      locale.mIw = paramJSONObject.optString("watermark");
      locale.mIx = paramJSONObject.optString("context");
      locale.mIA = paramJSONObject.optString("contextMd5");
      locale.resourceId = paramJSONObject.optInt("resourceId");
      locale.mIv = D(paramJSONObject.optJSONObject("operationTail"));
      locale.mIz = C(paramJSONObject);
    }
    GMTrace.o(9735482900480L, 72535);
    return locale;
  }
  
  private static LinkedList<m> C(JSONObject paramJSONObject)
  {
    GMTrace.i(9735617118208L, 72536);
    paramJSONObject = paramJSONObject.optJSONArray("record");
    LinkedList localLinkedList = new LinkedList();
    if (paramJSONObject != null)
    {
      int i = 0;
      while (i < paramJSONObject.length())
      {
        JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
        m localm = new m();
        if (localJSONObject != null)
        {
          localm.mIW = localJSONObject.optString("receiveName");
          localm.mIX = localJSONObject.optString("receiveHeadImg");
          localm.mIJ = localJSONObject.optLong("receiveAmount");
          localm.mIK = localJSONObject.optString("receiveTime");
          localm.mIY = localJSONObject.optString("answer");
          localm.mIn = localJSONObject.optString("receiveId");
          localm.mIZ = localJSONObject.optString("gameTips");
          localm.userName = localJSONObject.optString("userName");
          if ((bg.nm(localm.mIW)) && (!bg.nm(localm.userName))) {
            localm.mIW = ((com.tencent.mm.plugin.messenger.a.a)h.h(com.tencent.mm.plugin.messenger.a.a.class)).fs(localm.userName);
          }
        }
        localLinkedList.add(localm);
        i += 1;
      }
    }
    GMTrace.o(9735617118208L, 72536);
    return localLinkedList;
  }
  
  public static ag D(JSONObject paramJSONObject)
  {
    GMTrace.i(9735751335936L, 72537);
    ag localag = new ag();
    if (paramJSONObject != null)
    {
      localag.fPf = paramJSONObject.optInt("enable", 0);
      localag.content = paramJSONObject.optString("content");
      localag.iconUrl = paramJSONObject.optString("iconUrl");
      localag.type = paramJSONObject.optString("type");
      localag.name = paramJSONObject.optString("name");
      localag.mJW = paramJSONObject.optInt("ossKey");
      localag.mJX = paramJSONObject.optInt("focus");
    }
    GMTrace.o(9735751335936L, 72537);
    return localag;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */