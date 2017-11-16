package com.tencent.mm.plugin.appbrand.dynamic;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class h
{
  private static final Map<String, WxaWidgetContext> hSI;
  
  static
  {
    GMTrace.i(20779051778048L, 154816);
    hSI = new ConcurrentHashMap();
    GMTrace.o(20779051778048L, 154816);
  }
  
  public static boolean a(String paramString, WxaWidgetContext paramWxaWidgetContext)
  {
    GMTrace.i(20778649124864L, 154813);
    if ((bg.nm(paramString)) || (paramWxaWidgetContext == null))
    {
      GMTrace.o(20778649124864L, 154813);
      return false;
    }
    hSI.put(paramString, paramWxaWidgetContext);
    GMTrace.o(20778649124864L, 154813);
    return true;
  }
  
  public static WxaWidgetContext pI(String paramString)
  {
    GMTrace.i(20778783342592L, 154814);
    if (bg.nm(paramString))
    {
      GMTrace.o(20778783342592L, 154814);
      return null;
    }
    paramString = (WxaWidgetContext)hSI.get(paramString);
    GMTrace.o(20778783342592L, 154814);
    return paramString;
  }
  
  public static WxaWidgetContext pJ(String paramString)
  {
    GMTrace.i(20778917560320L, 154815);
    if (bg.nm(paramString))
    {
      GMTrace.o(20778917560320L, 154815);
      return null;
    }
    paramString = (WxaWidgetContext)hSI.remove(paramString);
    GMTrace.o(20778917560320L, 154815);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */