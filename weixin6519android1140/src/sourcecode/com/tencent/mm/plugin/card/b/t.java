package com.tencent.mm.plugin.card.b;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.jp;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class t
{
  public static ArrayList<jp> uQ(String paramString)
  {
    GMTrace.i(5054773854208L, 37661);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(5054773854208L, 37661);
      return null;
    }
    for (;;)
    {
      int i;
      ArrayList localArrayList;
      try
      {
        JSONArray localJSONArray = new JSONObject(paramString).getJSONArray("used_store_list");
        if (localJSONArray != null)
        {
          i = localJSONArray.length();
          if (i != 0) {}
        }
        else
        {
          GMTrace.o(5054773854208L, 37661);
          return null;
        }
        localArrayList = new ArrayList();
        i = 0;
        if (i < localJSONArray.length())
        {
          JSONObject localJSONObject = localJSONArray.getJSONObject(i);
          if (localJSONObject == null)
          {
            paramString = null;
            if (paramString == null) {
              break label297;
            }
            localArrayList.add(paramString);
            break label297;
          }
          paramString = new jp();
          paramString.name = localJSONObject.optString("name");
          paramString.descriptor = localJSONObject.optString("descriptor");
          paramString.jxX = localJSONObject.optString("phone");
          paramString.country = localJSONObject.optString("country");
          paramString.fjk = localJSONObject.optString("province");
          paramString.fjl = localJSONObject.optString("city");
          paramString.gEy = localJSONObject.optString("address");
          paramString.tZw = ((float)localJSONObject.optDouble("distance"));
          paramString.eNR = ((float)localJSONObject.optDouble("longitude"));
          paramString.eMl = ((float)localJSONObject.optDouble("latitude"));
          paramString.jzu = localJSONObject.optString("jump_url");
          paramString.tZx = localJSONObject.optString("app_brand_user_name");
          paramString.tZy = localJSONObject.optString("app_brand_pass");
          continue;
        }
        GMTrace.o(5054773854208L, 37661);
      }
      catch (JSONException paramString)
      {
        w.printErrStackTrace("MicroMsg.ShopInfoItemParser", paramString, "", new Object[0]);
        GMTrace.o(5054773854208L, 37661);
        return null;
      }
      return localArrayList;
      label297:
      i += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\b\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */