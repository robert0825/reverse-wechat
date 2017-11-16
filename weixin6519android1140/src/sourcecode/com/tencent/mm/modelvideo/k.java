package com.tencent.mm.modelvideo;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;

public final class k
{
  public static final String Nd()
  {
    GMTrace.i(16387313500160L, 122095);
    String str = h.xy().fYU + "draft/";
    GMTrace.o(16387313500160L, 122095);
    return str;
  }
  
  public static final String ma(String paramString)
  {
    GMTrace.i(329907175424L, 2458);
    if (bg.nm(paramString))
    {
      GMTrace.o(329907175424L, 2458);
      return null;
    }
    paramString = Nd() + paramString;
    GMTrace.o(329907175424L, 2458);
    return paramString;
  }
  
  public static final String mb(String paramString)
  {
    GMTrace.i(330041393152L, 2459);
    if (bg.nm(paramString))
    {
      GMTrace.o(330041393152L, 2459);
      return null;
    }
    paramString = Nd() + paramString + ".thumb";
    GMTrace.o(330041393152L, 2459);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */