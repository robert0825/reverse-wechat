package com.tencent.mm.plugin.card.b;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.c;
import com.tencent.mm.protocal.c.ki;
import com.tencent.mm.protocal.c.kj;
import com.tencent.mm.protocal.c.kk;
import com.tencent.mm.protocal.c.ys;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class j
{
  public static String a(Context paramContext, int paramInt, CardInfo paramCardInfo)
  {
    GMTrace.i(20573832871936L, 153287);
    switch (paramInt % 10)
    {
    default: 
      GMTrace.o(20573832871936L, 153287);
      return null;
    case 3: 
      paramContext = paramContext.getString(R.l.deb);
      GMTrace.o(20573832871936L, 153287);
      return paramContext;
    case 2: 
      paramContext = paramContext.getString(R.l.dec);
      GMTrace.o(20573832871936L, 153287);
      return paramContext;
    case 1: 
      paramContext = paramContext.getString(R.l.ded);
      GMTrace.o(20573832871936L, 153287);
      return paramContext;
    case 0: 
      paramContext = paramContext.getString(R.l.dee);
      GMTrace.o(20573832871936L, 153287);
      return paramContext;
    }
    paramContext = paramCardInfo.field_label_wording;
    GMTrace.o(20573832871936L, 153287);
    return paramContext;
  }
  
  public static void a(LinkedList<ki> paramLinkedList, int paramInt)
  {
    GMTrace.i(5046318137344L, 37598);
    if (paramLinkedList == null)
    {
      GMTrace.o(5046318137344L, 37598);
      return;
    }
    int j = paramLinkedList.size();
    int i = 0;
    if (i < paramLinkedList.size())
    {
      Object localObject = (ki)paramLinkedList.get(i);
      c localc = al.akn();
      String str1 = ((ki)localObject).eTJ;
      String str2 = ((ki)localObject).jBn;
      int k = ((ki)localObject).jxM;
      if (bg.nm(str1)) {
        w.w("MicroMsg.CardInfoStorage", "cardId null");
      }
      for (;;)
      {
        i += 1;
        break;
        localObject = "update UserCardInfo set stickyIndex=" + ((j - i) * 10 + paramInt) + ", stickyAnnouncement='" + str2 + "', stickyEndTime=" + k + " where card_id='" + str1 + "'";
        localc.fTZ.eZ("UserCardInfo", (String)localObject);
      }
    }
    GMTrace.o(5046318137344L, 37598);
  }
  
  public static void b(LinkedList<ki> paramLinkedList, int paramInt)
  {
    GMTrace.i(19559281065984L, 145728);
    if (paramLinkedList == null)
    {
      GMTrace.o(19559281065984L, 145728);
      return;
    }
    int i = 0;
    if (i < paramLinkedList.size())
    {
      Object localObject = (ki)paramLinkedList.get(i);
      c localc = al.akn();
      String str = ((ki)localObject).eTJ;
      if (((ki)localObject).ubg != null) {}
      for (localObject = ((ki)localObject).ubg;; localObject = "")
      {
        localObject = "update UserCardInfo set stickyIndex=" + paramInt + ", label_wording='" + (String)localObject + "' where card_id='" + str + "'";
        localc.fTZ.eZ("UserCardInfo", (String)localObject);
        i += 1;
        break;
      }
    }
    GMTrace.o(19559281065984L, 145728);
  }
  
  public static ys uC(String paramString)
  {
    GMTrace.i(5046452355072L, 37599);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.CardStickyHelper", "jsonRet null");
      GMTrace.o(5046452355072L, 37599);
      return null;
    }
    ys localys = new ys();
    try
    {
      paramString = new JSONObject(paramString);
      localys.upx = paramString.optString("layout_buff");
      localJSONObject = paramString.getJSONObject("list");
      if (localJSONObject == null) {
        break label367;
      }
      localys.upA = new kk();
      localys.upA.ubi = y(localJSONObject.optJSONObject("expiring_list"));
      localys.upA.ubj = y(localJSONObject.optJSONObject("member_card_list"));
      localys.upA.ubk = y(localJSONObject.optJSONObject("nearby_list"));
      localys.upA.ubl = y(localJSONObject.optJSONObject("label_list"));
      localys.upA.ubm = y(localJSONObject.optJSONObject("first_list"));
      if ((localys.upA.ubm == null) || (localys.upA.ubm.ubh == null)) {
        break label292;
      }
      i = localys.upA.ubm.ubh.size() - 1;
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        JSONObject localJSONObject;
        int i;
        label292:
        boolean bool;
        label367:
        w.printErrStackTrace("MicroMsg.CardStickyHelper", paramString, "", new Object[0]);
        continue;
        i -= 1;
      }
    }
    if (i >= 0)
    {
      paramString = (ki)localys.upA.ubm.ubh.get(i);
      if (!bg.nm(paramString.eTJ))
      {
        paramString = al.akn().tU(paramString.eTJ);
        if ((paramString != null) && (!paramString.ajc())) {
          localys.upA.ubm.ubh.remove(i);
        }
      }
    }
    else
    {
      localys.upB = localJSONObject.optString("red_dot_wording");
      if (localJSONObject.optInt("show_red_dot", 0) == 1) {}
      for (bool = true;; bool = false)
      {
        localys.upC = bool;
        String str = localJSONObject.optString("title");
        paramString = str;
        if (str == null) {
          paramString = "";
        }
        al.aks().putValue("key_card_entrance_tips", paramString);
        localys.upD = localJSONObject.optInt("top_scene", 100);
        GMTrace.o(5046452355072L, 37599);
        return localys;
      }
    }
  }
  
  private static kj y(JSONObject paramJSONObject)
  {
    GMTrace.i(5046586572800L, 37600);
    if (paramJSONObject == null)
    {
      w.w("MicroMsg.CardStickyHelper", "parseLayoutItemList param obj null");
      GMTrace.o(5046586572800L, 37600);
      return null;
    }
    kj localkj = new kj();
    localkj.ubh = new LinkedList();
    for (;;)
    {
      int i;
      try
      {
        JSONArray localJSONArray = paramJSONObject.getJSONArray("item_list");
        i = 0;
        if (i < localJSONArray.length())
        {
          JSONObject localJSONObject = localJSONArray.getJSONObject(i);
          if (localJSONObject == null)
          {
            paramJSONObject = null;
            if ((paramJSONObject == null) || ((paramJSONObject.jxM <= bg.Pu()) && (paramJSONObject.jxM != 0))) {
              break label215;
            }
            localkj.ubh.add(paramJSONObject);
            break label223;
          }
          paramJSONObject = new ki();
          paramJSONObject.jBn = localJSONObject.optString("announcement");
          paramJSONObject.eTJ = localJSONObject.optString("card_id");
          paramJSONObject.jxM = localJSONObject.optInt("end_time", 0);
          paramJSONObject.ubf = localJSONObject.optInt("update_time", 0);
          paramJSONObject.ubg = localJSONObject.optString("label_wording");
          continue;
        }
        w.i("MicroMsg.CardStickyHelper", "item.end_time > Util.nowSecond()");
      }
      catch (JSONException paramJSONObject)
      {
        w.printErrStackTrace("MicroMsg.CardStickyHelper", paramJSONObject, "", new Object[0]);
        GMTrace.o(5046586572800L, 37600);
        return localkj;
      }
      label215:
      label223:
      i += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */