package com.tencent.mm.api;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.n.b;
import com.tencent.mm.sdk.platformtools.bg;

public final class a
{
  public static String bk(String paramString)
  {
    GMTrace.i(20968298774528L, 156226);
    String str = paramString;
    if (bg.nm(paramString)) {
      str = "tempConv";
    }
    paramString = new StringBuilder(b.yV());
    paramString.append(g.n(str.getBytes())).append("/");
    paramString.append("conv/");
    paramString = paramString.toString();
    GMTrace.o(20968298774528L, 156226);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\api\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */