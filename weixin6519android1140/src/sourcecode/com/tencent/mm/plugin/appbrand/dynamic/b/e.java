package com.tencent.mm.plugin.appbrand.dynamic.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class e
{
  private static volatile e hTp;
  private Map<String, SoftReference<WxaPkgWrappingInfo>> hOK;
  
  private e()
  {
    GMTrace.i(17726537990144L, 132073);
    this.hOK = new ConcurrentHashMap();
    GMTrace.o(17726537990144L, 132073);
  }
  
  private static e Vb()
  {
    GMTrace.i(17726403772416L, 132072);
    if (hTp == null) {}
    try
    {
      if (hTp == null) {
        hTp = new e();
      }
      e locale = hTp;
      GMTrace.o(17726403772416L, 132072);
      return locale;
    }
    finally {}
  }
  
  public static boolean a(String paramString, WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    GMTrace.i(17726672207872L, 132074);
    if ((paramString == null) || (paramString.length() == 0) || (paramWxaPkgWrappingInfo == null))
    {
      GMTrace.o(17726672207872L, 132074);
      return false;
    }
    Vb().hOK.put(paramString, new SoftReference(paramWxaPkgWrappingInfo));
    GMTrace.o(17726672207872L, 132074);
    return true;
  }
  
  public static WxaPkgWrappingInfo pK(String paramString)
  {
    GMTrace.i(17726806425600L, 132075);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(17726806425600L, 132075);
      return null;
    }
    paramString = (SoftReference)Vb().hOK.get(paramString);
    if (paramString != null)
    {
      paramString = (WxaPkgWrappingInfo)paramString.get();
      GMTrace.o(17726806425600L, 132075);
      return paramString;
    }
    GMTrace.o(17726806425600L, 132075);
    return null;
  }
  
  public static void removeAll()
  {
    GMTrace.i(17726940643328L, 132076);
    Vb().hOK.clear();
    GMTrace.o(17726940643328L, 132076);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */