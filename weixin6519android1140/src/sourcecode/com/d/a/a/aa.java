package com.d.a.a;

import java.util.TimeZone;

final class aa
{
  static long s(long paramLong)
  {
    return (TimeZone.getDefault().getOffset(paramLong) + paramLong) / 1000L;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */