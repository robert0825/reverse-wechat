package com.tencent.mm.plugin.card.b;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.jv;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class k
{
  public static LinkedList<jv> aK(String paramString, int paramInt)
  {
    GMTrace.i(5046989225984L, 37603);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.CardListItemParser", "parseCardTpInfoItemArray jsonContent is null");
      GMTrace.o(5046989225984L, 37603);
      return null;
    }
    try
    {
      JSONArray localJSONArray = new JSONArray(paramString);
      if (localJSONArray.length() == 0)
      {
        w.e("MicroMsg.CardListItemParser", "parseCardTpInfoItemArray cardItemListJson is null");
        GMTrace.o(5046989225984L, 37603);
        return null;
      }
      LinkedList localLinkedList = new LinkedList();
      int i = 0;
      if (i < localJSONArray.length())
      {
        JSONObject localJSONObject = localJSONArray.optJSONObject(i);
        jv localjv = new jv();
        if (paramInt == 26) {}
        for (paramString = "cardId";; paramString = "card_id")
        {
          localjv.jxF = localJSONObject.optString(paramString);
          localjv.code = localJSONObject.optString("code");
          localLinkedList.add(localjv);
          i += 1;
          break;
        }
      }
      GMTrace.o(5046989225984L, 37603);
      return localLinkedList;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.CardListItemParser", paramString, "", new Object[0]);
      GMTrace.o(5046989225984L, 37603);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */