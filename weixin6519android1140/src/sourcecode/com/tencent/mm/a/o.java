package com.tencent.mm.a;

import com.tencent.gmtrace.GMTrace;

public final class o
  extends Number
{
  private int uin;
  
  public o(int paramInt)
  {
    GMTrace.i(13862946471936L, 103287);
    this.uin = 0;
    this.uin = paramInt;
    GMTrace.o(13862946471936L, 103287);
  }
  
  public o(long paramLong)
  {
    GMTrace.i(13863080689664L, 103288);
    this.uin = 0;
    this.uin = ((int)(0xFFFFFFFFFFFFFFFF & paramLong));
    GMTrace.o(13863080689664L, 103288);
  }
  
  public static int bj(String paramString)
  {
    GMTrace.i(13863214907392L, 103289);
    try
    {
      int i = new o(Long.valueOf(paramString).longValue()).intValue();
      GMTrace.o(13863214907392L, 103289);
      return i;
    }
    catch (Exception paramString)
    {
      GMTrace.o(13863214907392L, 103289);
    }
    return 0;
  }
  
  public static String getString(int paramInt)
  {
    GMTrace.i(13864020213760L, 103295);
    String str = new o(paramInt).toString();
    GMTrace.o(13864020213760L, 103295);
    return str;
  }
  
  public final double doubleValue()
  {
    GMTrace.i(13863349125120L, 103290);
    double d = this.uin | 0L;
    GMTrace.o(13863349125120L, 103290);
    return d + 0.0D;
  }
  
  public final float floatValue()
  {
    GMTrace.i(13863483342848L, 103291);
    float f = (float)((this.uin | 0L) + 0.0D);
    GMTrace.o(13863483342848L, 103291);
    return f;
  }
  
  public final int intValue()
  {
    GMTrace.i(13863617560576L, 103292);
    int i = this.uin;
    GMTrace.o(13863617560576L, 103292);
    return i;
  }
  
  public final long longValue()
  {
    GMTrace.i(13863751778304L, 103293);
    long l = this.uin;
    GMTrace.o(13863751778304L, 103293);
    return l & 0xFFFFFFFF;
  }
  
  public final String toString()
  {
    GMTrace.i(13863885996032L, 103294);
    long l = this.uin;
    GMTrace.o(13863885996032L, 103294);
    return String.valueOf(l & 0xFFFFFFFF);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */