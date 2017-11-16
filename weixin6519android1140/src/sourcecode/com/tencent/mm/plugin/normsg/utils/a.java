package com.tencent.mm.plugin.normsg.utils;

import com.tencent.gmtrace.GMTrace;

public final class a
{
  private static final char[] aaZ;
  
  static
  {
    GMTrace.i(17526956228608L, 130586);
    aaZ = new char[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    GMTrace.o(17526956228608L, 130586);
  }
  
  public static String f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(17526822010880L, 130585);
    char[] arrayOfChar = new char[(paramInt2 - paramInt1) * 2];
    int i = 0;
    while (paramInt1 < paramInt2)
    {
      int j = paramArrayOfByte[paramInt1];
      int k = i + 1;
      arrayOfChar[i] = aaZ[(j >>> 4 & 0xF)];
      i = k + 1;
      arrayOfChar[k] = aaZ[(j & 0xF)];
      paramInt1 += 1;
    }
    paramArrayOfByte = new String(arrayOfChar);
    GMTrace.o(17526822010880L, 130585);
    return paramArrayOfByte;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\normsg\utils\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */