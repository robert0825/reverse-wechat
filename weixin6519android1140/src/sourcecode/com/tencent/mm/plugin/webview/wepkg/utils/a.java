package com.tencent.mm.plugin.webview.wepkg.utils;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public static String Nc(String paramString)
  {
    GMTrace.i(15642270892032L, 116544);
    if (paramString == null)
    {
      GMTrace.o(15642270892032L, 116544);
      return "";
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("url", paramString);
      paramString = URLEncoder.encode(localJSONObject.toString(), "UTF-8");
      GMTrace.o(15642270892032L, 116544);
      return paramString;
    }
    catch (JSONException paramString)
    {
      w.e("MicroMsg.WePkgReport", paramString.getMessage());
      GMTrace.o(15642270892032L, 116544);
      return "";
    }
    catch (UnsupportedEncodingException paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.WePkgReport", paramString.getMessage());
      }
    }
  }
  
  public static void b(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, String paramString5)
  {
    GMTrace.i(16001974403072L, 119224);
    for (;;)
    {
      try
      {
        if (!bg.nm(paramString5)) {
          continue;
        }
        localObject = new JSONObject();
        ((JSONObject)localObject).put("netType", am.eu(ab.getContext()));
        localObject = URLEncoder.encode(((JSONObject)localObject).toString(), "UTF-8");
        paramString5 = (String)localObject;
      }
      catch (Exception localException)
      {
        Object localObject;
        continue;
      }
      g.ork.i(13980, new Object[] { paramString1, paramString2, paramString3, paramString4, Long.valueOf(paramLong1), paramString5, Long.valueOf(paramLong2) });
      GMTrace.o(16001974403072L, 119224);
      return;
      localObject = new JSONObject(URLDecoder.decode(paramString5, "UTF-8"));
      ((JSONObject)localObject).put("netType", am.eu(ab.getContext()));
      localObject = URLEncoder.encode(((JSONObject)localObject).toString(), "UTF-8");
      paramString5 = (String)localObject;
    }
  }
  
  public static String yu(int paramInt)
  {
    GMTrace.i(16002108620800L, 119225);
    Object localObject = new JSONObject();
    try
    {
      ((JSONObject)localObject).put("subCode", paramInt);
      localObject = URLEncoder.encode(((JSONObject)localObject).toString(), "UTF-8");
      GMTrace.o(16002108620800L, 119225);
      return (String)localObject;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      GMTrace.o(16002108620800L, 119225);
      return null;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\utils\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */