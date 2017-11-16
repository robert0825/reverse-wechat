package com.tencent.mm.plugin.webview.model;

import android.content.Intent;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.modeltools.f;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONStringer;

public final class ai
{
  public static String Ll(String paramString)
  {
    GMTrace.i(11997454270464L, 89388);
    Object localObject = new File(com.tencent.mm.compatible.util.e.fRZ);
    if (!((File)localObject).mkdirs()) {
      w.i("MicroMsg.WebviewJSSDKUtil", "mkdirs failed.File is exist = " + ((File)localObject).exists());
    }
    if (!((File)localObject).exists()) {
      w.e("MicroMsg.WebviewJSSDKUtil", "camera storage path do not exist.(%s)", new Object[] { com.tencent.mm.compatible.util.e.fRZ });
    }
    localObject = ((File)localObject).getAbsolutePath() + File.separator + paramString + ".jpg";
    w.i("MicroMsg.WebviewJSSDKUtil", "get file path from capture file name : %s == %s", new Object[] { paramString, localObject });
    GMTrace.o(11997454270464L, 89388);
    return (String)localObject;
  }
  
  public static Intent Lm(String paramString)
  {
    GMTrace.i(11997588488192L, 89389);
    Intent localIntent = new Intent("android.media.action.IMAGE_CAPTURE");
    localIntent.putExtra("output", Uri.fromFile(new File(Ll(paramString))));
    GMTrace.o(11997588488192L, 89389);
    return localIntent;
  }
  
  public static String Ln(String paramString)
  {
    GMTrace.i(11997991141376L, 89392);
    w.i("MicroMsg.WebviewJSSDKUtil", "genLocalIdByFilePath, file path is ：%s", new Object[] { paramString });
    if (bg.nm(paramString))
    {
      GMTrace.o(11997991141376L, 89392);
      return null;
    }
    String str = "weixin://resourceid/" + aa.RP(paramString);
    w.i("MicroMsg.WebviewJSSDKUtil", "gen local id by filepath, filepath : %s, localid : %s", new Object[] { paramString, str });
    GMTrace.o(11997991141376L, 89392);
    return str;
  }
  
  public static String Lo(String paramString)
  {
    GMTrace.i(16927674073088L, 126121);
    WebViewJSSDKFileItem localWebViewJSSDKFileItem = f.bCW().Lk(paramString);
    if (localWebViewJSSDKFileItem != null)
    {
      w.i("MicroMsg.WebviewJSSDKUtil", "get local thumb filepath from local id :%s", new Object[] { localWebViewJSSDKFileItem.idL });
      paramString = localWebViewJSSDKFileItem.idL;
      GMTrace.o(16927674073088L, 126121);
      return paramString;
    }
    w.e("MicroMsg.WebviewJSSDKUtil", "fromLocalIdToFilePath, local map not contains the local id : %s", new Object[] { paramString });
    GMTrace.o(16927674073088L, 126121);
    return null;
  }
  
  private static InputStream Lp(String paramString)
  {
    GMTrace.i(11998528012288L, 89396);
    w.i("MicroMsg.WebviewJSSDKUtil", "getDataFromLocalId : %s", new Object[] { paramString });
    if (bg.nm(paramString))
    {
      GMTrace.o(11998528012288L, 89396);
      return null;
    }
    if ((!bg.nm(paramString)) && (com.tencent.mm.a.e.aZ(paramString))) {
      try
      {
        paramString = new FileInputStream(paramString);
        GMTrace.o(11998528012288L, 89396);
        return paramString;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.WebviewJSSDKUtil", "init file input stream error : %s", new Object[] { paramString.getMessage() });
      }
    }
    GMTrace.o(11998528012288L, 89396);
    return null;
  }
  
  public static InputStream Lq(String paramString)
  {
    GMTrace.i(16927808290816L, 126122);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.WebviewJSSDKUtil", "local is is null or nil");
      GMTrace.o(16927808290816L, 126122);
      return null;
    }
    paramString = Lp(paramString);
    GMTrace.o(16927808290816L, 126122);
    return paramString;
  }
  
  public static String Lr(String paramString)
  {
    GMTrace.i(11998662230016L, 89397);
    paramString = "_USER_FOR_WEBVIEW_JSAPI" + o.h(paramString, bg.Pv());
    GMTrace.o(11998662230016L, 89397);
    return paramString;
  }
  
  public static String X(ArrayList<String> paramArrayList)
  {
    GMTrace.i(11998125359104L, 89393);
    if (paramArrayList.size() == 0)
    {
      w.e("MicroMsg.WebviewJSSDKUtil", "data is null");
      GMTrace.o(11998125359104L, 89393);
      return null;
    }
    JSONArray localJSONArray = new JSONArray();
    int i = 0;
    while (i < paramArrayList.size())
    {
      localJSONArray.put((String)paramArrayList.get(i));
      i += 1;
    }
    paramArrayList = localJSONArray.toString();
    GMTrace.o(11998125359104L, 89393);
    return paramArrayList;
  }
  
  public static String Y(ArrayList<String> paramArrayList)
  {
    GMTrace.i(11998259576832L, 89394);
    if (paramArrayList.size() == 0)
    {
      w.e("MicroMsg.WebviewJSSDKUtil", "data is null");
      GMTrace.o(11998259576832L, 89394);
      return "";
    }
    JSONStringer localJSONStringer = new JSONStringer();
    try
    {
      localJSONStringer.array();
      localJSONStringer.object();
      int i = 0;
      while (i < paramArrayList.size())
      {
        String str = (String)paramArrayList.get(i);
        localJSONStringer.key("localId");
        localJSONStringer.value(str);
        i += 1;
      }
      localJSONStringer.endObject();
      localJSONStringer.endArray();
      paramArrayList = localJSONStringer.toString();
      GMTrace.o(11998259576832L, 89394);
      return paramArrayList;
    }
    catch (Exception paramArrayList)
    {
      w.printErrStackTrace("MicroMsg.WebviewJSSDKUtil", paramArrayList, "", new Object[0]);
      GMTrace.o(11998259576832L, 89394);
    }
    return "";
  }
  
  public static String b(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(11998393794560L, 89395);
    if (bg.nm(paramString1))
    {
      w.e("MicroMsg.WebviewJSSDKUtil", "parseVideoItemToJson localId is null");
      GMTrace.o(11998393794560L, 89395);
      return "";
    }
    JSONStringer localJSONStringer = new JSONStringer();
    try
    {
      localJSONStringer.array();
      localJSONStringer.object();
      localJSONStringer.key("localId");
      localJSONStringer.value(paramString1);
      localJSONStringer.key("thumbLocalId");
      localJSONStringer.value(paramString2);
      localJSONStringer.key("duration");
      localJSONStringer.value(String.valueOf(paramInt1));
      localJSONStringer.key("height");
      localJSONStringer.value(String.valueOf(paramInt2));
      localJSONStringer.key("width");
      localJSONStringer.value(String.valueOf(paramInt3));
      localJSONStringer.key("size");
      localJSONStringer.value(String.valueOf(paramInt4));
      localJSONStringer.endObject();
      localJSONStringer.endArray();
      paramString1 = localJSONStringer.toString();
      GMTrace.o(11998393794560L, 89395);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      w.printErrStackTrace("MicroMsg.WebviewJSSDKUtil", paramString1, "", new Object[0]);
      GMTrace.o(11998393794560L, 89395);
    }
    return "";
  }
  
  public static Intent bCq()
  {
    GMTrace.i(11997722705920L, 89390);
    Intent localIntent = new Intent("android.media.action.VIDEO_CAPTURE");
    GMTrace.o(11997722705920L, 89390);
    return localIntent;
  }
  
  public static Intent bCr()
  {
    GMTrace.i(11997856923648L, 89391);
    Intent localIntent = new Intent("android.provider.MediaStore.RECORD_SOUND");
    GMTrace.o(11997856923648L, 89391);
    return localIntent;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */