package com.tencent.d.a.c;

public final class f
{
  public static long ft(long paramLong)
  {
    return (System.nanoTime() - paramLong) / 1000L / 1000L;
  }
  
  public static String nl(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  public static boolean nm(String paramString)
  {
    return (paramString == null) || (paramString.length() <= 0);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\d\a\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */