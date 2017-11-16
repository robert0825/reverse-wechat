package com.tencent.mm.modelsfs;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class f
{
  public static boolean le(String paramString)
  {
    GMTrace.i(13837713539072L, 103099);
    if (paramString.lastIndexOf(";?enc=") > 0)
    {
      GMTrace.o(13837713539072L, 103099);
      return true;
    }
    GMTrace.o(13837713539072L, 103099);
    return false;
  }
  
  public static String lf(String paramString)
  {
    GMTrace.i(13837981974528L, 103101);
    int i = paramString.lastIndexOf(";?enc=");
    if (i > 0)
    {
      paramString = paramString.substring(0, i);
      GMTrace.o(13837981974528L, 103101);
      return paramString;
    }
    GMTrace.o(13837981974528L, 103101);
    return paramString;
  }
  
  public static long lg(String paramString)
  {
    GMTrace.i(13838116192256L, 103102);
    int i = paramString.lastIndexOf(";?enc=");
    if (i > 0)
    {
      long l = bg.Sz(paramString.substring(i + 6));
      GMTrace.o(13838116192256L, 103102);
      return l;
    }
    GMTrace.o(13838116192256L, 103102);
    return 0L;
  }
  
  public static String lh(String paramString)
  {
    GMTrace.i(13838250409984L, 103103);
    int i = paramString.lastIndexOf(";?enc=");
    if (i > 0)
    {
      paramString = paramString.substring(i + 6).trim();
      GMTrace.o(13838250409984L, 103103);
      return paramString;
    }
    GMTrace.o(13838250409984L, 103103);
    return "";
  }
  
  public static String m(String paramString, long paramLong)
  {
    GMTrace.i(13837847756800L, 103100);
    if (paramLong == 0L)
    {
      paramString = String.format(paramString + ";?enc=%d", new Object[] { Long.valueOf(314159265L) });
      GMTrace.o(13837847756800L, 103100);
      return paramString;
    }
    paramString = String.format(paramString + ";?enc=%d", new Object[] { Long.valueOf(paramLong) });
    GMTrace.o(13837847756800L, 103100);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsfs\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */