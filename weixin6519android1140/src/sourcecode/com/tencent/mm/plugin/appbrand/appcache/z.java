package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.gmtrace.GMTrace;
import java.util.Locale;

public final class z
  extends r
{
  z(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    super(str1, str3 + String.format("_%s.wxapkg", new Object[] { str2 }), paramString1, paramString2, paramInt1, paramInt2);
    GMTrace.i(18187307450368L, 135506);
    GMTrace.o(18187307450368L, 135506);
  }
  
  private static String c(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(18187173232640L, 135505);
    paramString1 = String.format(Locale.US, "WxaPage_%s_%d_%d_%d", new Object[] { paramString2, Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramString1.hashCode()) });
    GMTrace.o(18187173232640L, 135505);
    return paramString1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appcache\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */