package com.tencent.mm.plugin.appbrand.n;

import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Map;

public final class h
{
  public static String sv(String paramString)
  {
    GMTrace.i(20014547599360L, 149120);
    String str = Uri.parse("file:///" + paramString).getPath();
    if ((str != null) && (str.startsWith("/"))) {
      paramString = str.substring(1);
    }
    for (;;)
    {
      GMTrace.o(20014547599360L, 149120);
      return paramString;
      paramString = str;
      if (str == null) {
        paramString = "";
      }
    }
  }
  
  public static Map<String, String> sw(String paramString)
  {
    GMTrace.i(20014681817088L, 149121);
    HashMap localHashMap = new HashMap();
    String str1 = Uri.parse("file:///" + paramString).getEncodedQuery();
    if (bg.nm(str1))
    {
      GMTrace.o(20014681817088L, 149121);
      return localHashMap;
    }
    int j = 0;
    int m = str1.length();
    int n = str1.indexOf('&', j);
    int i;
    label88:
    int k;
    String str2;
    if (n != -1)
    {
      i = n;
      int i1 = str1.indexOf('=', j);
      if (i1 <= i)
      {
        k = i1;
        if (i1 != -1) {}
      }
      else
      {
        k = i;
      }
      str2 = Uri.decode(str1.substring(j, k));
      if (k != i) {
        break label166;
      }
    }
    label166:
    for (paramString = "";; paramString = str1.substring(k + 1, i))
    {
      localHashMap.put(str2, paramString);
      if (n == -1) {
        break label179;
      }
      j = n + 1;
      break;
      i = m;
      break label88;
    }
    label179:
    GMTrace.o(20014681817088L, 149121);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\n\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */