package com.b.a;

import java.io.IOException;

public final class a
{
  public static final h aat = new c("null");
  public static final h aau = new c("true");
  public static final h aav = new c("false");
  
  public static h H(float paramFloat)
  {
    if ((Float.isInfinite(paramFloat)) || (Float.isNaN(paramFloat))) {
      throw new IllegalArgumentException("Infinite and NaN values not permitted in JSON");
    }
    return new d(x(Float.toString(paramFloat)));
  }
  
  public static h ab(boolean paramBoolean)
  {
    if (paramBoolean) {
      return aau;
    }
    return aav;
  }
  
  public static h bL(int paramInt)
  {
    return new d(Integer.toString(paramInt, 10));
  }
  
  public static h d(double paramDouble)
  {
    if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble))) {
      throw new IllegalArgumentException("Infinite and NaN values not permitted in JSON");
    }
    return new d(x(Double.toString(paramDouble)));
  }
  
  public static h g(long paramLong)
  {
    return new d(Long.toString(paramLong, 10));
  }
  
  public static h u(String paramString)
  {
    if (paramString == null) {
      return aat;
    }
    return new g(paramString);
  }
  
  public static h w(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException("string is null");
    }
    h localh;
    try
    {
      paramString = new f(paramString);
      paramString.hz();
      paramString.hy();
      localh = paramString.hv();
      paramString.hy();
      if (!paramString.hC()) {
        throw paramString.A("Unexpected character");
      }
    }
    catch (IOException paramString)
    {
      throw new RuntimeException(paramString);
    }
    return localh;
  }
  
  private static String x(String paramString)
  {
    String str = paramString;
    if (paramString.endsWith(".0")) {
      str = paramString.substring(0, paramString.length() - 2);
    }
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */