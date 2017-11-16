package com.tencent.mm.plugin.card.b;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.model.e;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

public final class h
{
  public static String a(LinkedList<e> paramLinkedList, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(5055042289664L, 37663);
    if (paramLinkedList.size() == 0)
    {
      w.e("MicroMsg.CardListItemParser", "parseCardListItemToJson list == null || list.size() == 0");
      GMTrace.o(5055042289664L, 37663);
      return "";
    }
    w.i("MicroMsg.CardListItemParser", "parseCardListItemToJson is_succ:" + paramBoolean + " scene:" + paramInt);
    JSONStringer localJSONStringer = new JSONStringer();
    if (paramInt == 8) {}
    for (;;)
    {
      e locale;
      try
      {
        localJSONStringer.object();
        localJSONStringer.key("card_list");
        localJSONStringer.array();
        Iterator localIterator = paramLinkedList.iterator();
        if (!localIterator.hasNext()) {
          break label336;
        }
        locale = (e)localIterator.next();
        localJSONStringer.object();
        if (paramInt == 26)
        {
          paramLinkedList = "cardId";
          localJSONStringer.key(paramLinkedList);
          localJSONStringer.value(locale.jxF);
          if (paramInt != 26) {
            break label367;
          }
          paramLinkedList = "cardExt";
          localJSONStringer.key(paramLinkedList);
          if (locale.eTK != null) {
            break label282;
          }
          paramLinkedList = "";
          localJSONStringer.value(paramLinkedList);
          if (paramInt != 26) {
            break label373;
          }
          paramLinkedList = "isSuccess";
          localJSONStringer.key(paramLinkedList);
          if (!paramBoolean) {
            break label299;
          }
          if (paramInt != 26) {
            break label291;
          }
          paramLinkedList = Boolean.valueOf(true);
          localJSONStringer.value(paramLinkedList);
          localJSONStringer.key("code");
          if (locale.code != null) {
            break label327;
          }
          paramLinkedList = "";
          localJSONStringer.value(paramLinkedList);
          localJSONStringer.endObject();
          continue;
        }
        paramLinkedList = "card_id";
      }
      catch (Exception paramLinkedList)
      {
        w.printErrStackTrace("MicroMsg.CardListItemParser", paramLinkedList, "", new Object[0]);
        GMTrace.o(5055042289664L, 37663);
        return "";
      }
      continue;
      label282:
      paramLinkedList = locale.eTK;
      continue;
      label291:
      paramLinkedList = Integer.valueOf(1);
      continue;
      label299:
      if (paramInt == 26) {}
      for (paramLinkedList = Boolean.valueOf(false);; paramLinkedList = Integer.valueOf(0))
      {
        localJSONStringer.value(paramLinkedList);
        break;
      }
      label327:
      paramLinkedList = locale.code;
      continue;
      label336:
      localJSONStringer.endArray();
      if (paramInt == 8) {
        localJSONStringer.endObject();
      }
      paramLinkedList = localJSONStringer.toString();
      GMTrace.o(5055042289664L, 37663);
      return paramLinkedList;
      label367:
      paramLinkedList = "card_ext";
      continue;
      label373:
      paramLinkedList = "is_succ";
    }
  }
  
  public static ArrayList<jn> aI(String paramString, int paramInt)
  {
    GMTrace.i(5054908071936L, 37662);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.CardListItemParser", "parseCardListItemArray jsonContent is null");
      GMTrace.o(5054908071936L, 37662);
      return null;
    }
    if ((paramInt == 8) || (paramInt == 0)) {}
    for (;;)
    {
      try
      {
        paramString = new JSONObject(paramString).optJSONArray("card_list");
        if ((paramString == null) || (paramString.length() == 0))
        {
          w.e("MicroMsg.CardListItemParser", "parseCardListItemArray cardItemListJson is null");
          GMTrace.o(5054908071936L, 37662);
          return null;
          if (paramInt == 26)
          {
            paramString = new JSONArray(paramString);
            continue;
          }
          paramString = new JSONArray(paramString);
          continue;
        }
        ArrayList localArrayList = new ArrayList();
        int i = 0;
        if (i < paramString.length())
        {
          JSONObject localJSONObject = paramString.optJSONObject(i);
          jn localjn = new jn();
          if (paramInt == 26)
          {
            str = "cardId";
            localjn.jxF = localJSONObject.optString(str);
            if (paramInt == 26)
            {
              str = "cardExt";
              localjn.eTK = localJSONObject.optString(str);
              localArrayList.add(localjn);
              i += 1;
              continue;
            }
            str = "card_ext";
            continue;
          }
        }
        else
        {
          GMTrace.o(5054908071936L, 37662);
          return localArrayList;
        }
      }
      catch (JSONException paramString)
      {
        w.printErrStackTrace("MicroMsg.CardListItemParser", paramString, "", new Object[0]);
        GMTrace.o(5054908071936L, 37662);
        return null;
      }
      String str = "card_id";
    }
  }
  
  public static String aJ(String paramString, int paramInt)
  {
    GMTrace.i(5055176507392L, 37664);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.CardListItemParser", "parseCardListItemArray jsonContent is null");
      GMTrace.o(5055176507392L, 37664);
      return null;
    }
    for (;;)
    {
      JSONStringer localJSONStringer;
      JSONObject localJSONObject;
      try
      {
        JSONArray localJSONArray = new JSONObject(paramString).optJSONArray("card_list");
        if ((localJSONArray == null) || (localJSONArray.length() == 0))
        {
          w.e("MicroMsg.CardListItemParser", "parseCardListItemArray cardItemListJson is null");
          GMTrace.o(5055176507392L, 37664);
          return null;
        }
        localJSONStringer = new JSONStringer();
        localJSONStringer.array();
        int i = 0;
        if (i >= localJSONArray.length()) {
          break label372;
        }
        localJSONObject = localJSONArray.optJSONObject(i);
        localJSONStringer.object();
        if (paramInt != 26) {
          break label394;
        }
        paramString = "cardId";
        localJSONStringer.key(paramString);
        localJSONStringer.value(localJSONObject.optString("card_id"));
        if (paramInt != 26) {
          break label400;
        }
        paramString = "cardExt";
        localJSONStringer.key(paramString);
        localJSONStringer.value(localJSONObject.optString("card_ext"));
        if (paramInt != 26) {
          break label406;
        }
        paramString = "isSuccess";
        localJSONStringer.key(paramString);
        if (paramInt == 26)
        {
          if (localJSONObject.optInt("is_succ") == 1)
          {
            localJSONStringer.value(true);
            localJSONStringer.key("code");
            if (TextUtils.isEmpty(localJSONObject.optString("encrypt_code"))) {
              break label356;
            }
            localJSONStringer.value(localJSONObject.optString("encrypt_code"));
            localJSONStringer.endObject();
            StringBuilder localStringBuilder = new StringBuilder("parseJsonToArray item").append(i).append("  is_succ:");
            if (paramInt != 26) {
              break label412;
            }
            paramString = "isSuccess";
            w.i("MicroMsg.CardListItemParser", localJSONObject.optInt(paramString));
            i += 1;
            continue;
          }
          localJSONStringer.value(false);
          continue;
        }
        localJSONStringer.value(localJSONObject.optInt("is_succ"));
      }
      catch (JSONException paramString)
      {
        w.printErrStackTrace("MicroMsg.CardListItemParser", paramString, "", new Object[0]);
        GMTrace.o(5055176507392L, 37664);
        return "";
      }
      continue;
      label356:
      localJSONStringer.value(localJSONObject.optString("code"));
      continue;
      label372:
      localJSONStringer.endArray();
      paramString = localJSONStringer.toString();
      GMTrace.o(5055176507392L, 37664);
      return paramString;
      label394:
      paramString = "card_id";
      continue;
      label400:
      paramString = "card_ext";
      continue;
      label406:
      paramString = "is_succ";
      continue;
      label412:
      paramString = "is_succ";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */