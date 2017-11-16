package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public final class ak
{
  private static Map<String, String> rFw;
  
  static
  {
    GMTrace.i(12013694615552L, 89509);
    rFw = new HashMap();
    GMTrace.o(12013694615552L, 89509);
  }
  
  public static void clear()
  {
    GMTrace.i(12013560397824L, 89508);
    rFw.clear();
    GMTrace.o(12013560397824L, 89508);
  }
  
  public static void eh(String paramString1, String paramString2)
  {
    GMTrace.i(12013291962368L, 89506);
    w.i("MicroMsg.WebviewSharedUrlCache", "rawurl:[%s], shareUrl:[%s]", new Object[] { paramString1, paramString2 });
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      w.e("MicroMsg.WebviewSharedUrlCache", "rawurl is null or share url is null");
      GMTrace.o(12013291962368L, 89506);
      return;
    }
    if (rFw.containsKey(paramString1))
    {
      w.i("MicroMsg.WebviewSharedUrlCache", "has add this rawurl");
      GMTrace.o(12013291962368L, 89506);
      return;
    }
    rFw.put(paramString1, paramString2);
    GMTrace.o(12013291962368L, 89506);
  }
  
  public static String zA(String paramString)
  {
    GMTrace.i(12013426180096L, 89507);
    w.i("MicroMsg.WebviewSharedUrlCache", "rawUrl:[%s]", new Object[] { paramString });
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.WebviewSharedUrlCache", "rawUrl is null");
      GMTrace.o(12013426180096L, 89507);
      return null;
    }
    String str2 = (String)rFw.get(paramString);
    String str1 = str2;
    int i;
    if (bg.nm(str2))
    {
      i = paramString.indexOf("#");
      if (i >= 0) {
        break label112;
      }
    }
    label112:
    for (str1 = paramString;; str1 = paramString.substring(0, i))
    {
      str1 = (String)rFw.get(str1);
      if (!bg.nm(str1)) {
        break;
      }
      GMTrace.o(12013426180096L, 89507);
      return paramString;
    }
    GMTrace.o(12013426180096L, 89507);
    return str1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */