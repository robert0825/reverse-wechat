package com.tencent.mm.plugin.card.b;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.model.f;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class i
{
  public static f uB(String paramString)
  {
    GMTrace.i(5045244395520L, 37590);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.CardMallItemParser", "parseCardMallItem jsonContent is null");
      GMTrace.o(5045244395520L, 37590);
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString);
      f localf = new f();
      localf.jyW = paramString.optString("empty_tips");
      localf.jyX = paramString.optString("shoppingmall_title");
      localf.jyY = paramString.optString("shoppingmall_url");
      if (paramString.optInt("is_show") == 0) {}
      for (boolean bool = false;; bool = true)
      {
        localf.jyZ = bool;
        GMTrace.o(5045244395520L, 37590);
        return localf;
      }
      return null;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.CardMallItemParser", paramString, "", new Object[0]);
      GMTrace.o(5045244395520L, 37590);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */