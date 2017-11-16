package com.google.a.a;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public final class b
{
  final int aCN;
  private final byte[] buffer;
  int position;
  
  b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.buffer = paramArrayOfByte;
    this.position = 0;
    this.aCN = (paramInt2 + 0);
  }
  
  public static int aF(String paramString)
  {
    try
    {
      paramString = paramString.getBytes("UTF-8");
      int i = cM(paramString.length);
      int j = paramString.length;
      return j + i;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new RuntimeException("UTF-8 not supported.");
    }
  }
  
  public static int ar(int paramInt1, int paramInt2)
  {
    return cK(paramInt1) + cI(paramInt2);
  }
  
  public static int as(int paramInt1, int paramInt2)
  {
    return cK(paramInt1) + cM(paramInt2);
  }
  
  private void at(int paramInt1, int paramInt2)
  {
    cL(g.au(paramInt1, paramInt2));
  }
  
  public static int b(int paramInt, e parame)
  {
    paramInt = cK(paramInt);
    int i = parame.nv();
    return paramInt + (i + cM(i));
  }
  
  public static int b(int paramInt, byte[] paramArrayOfByte)
  {
    return cK(paramInt) + (cM(paramArrayOfByte.length) + paramArrayOfByte.length);
  }
  
  public static int cI(int paramInt)
  {
    if (paramInt >= 0) {
      return cM(paramInt);
    }
    return 10;
  }
  
  private void cJ(int paramInt)
  {
    int i = (byte)paramInt;
    if (this.position == this.aCN) {
      throw new a(this.position, this.aCN);
    }
    byte[] arrayOfByte = this.buffer;
    paramInt = this.position;
    this.position = (paramInt + 1);
    arrayOfByte[paramInt] = i;
  }
  
  private static int cK(int paramInt)
  {
    return cM(g.au(paramInt, 0));
  }
  
  private void cL(int paramInt)
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        cJ(paramInt);
        return;
      }
      cJ(paramInt & 0x7F | 0x80);
      paramInt >>>= 7;
    }
  }
  
  public static int cM(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0) {
      return 1;
    }
    if ((paramInt & 0xC000) == 0) {
      return 2;
    }
    if ((0xFFE00000 & paramInt) == 0) {
      return 3;
    }
    if ((0xF0000000 & paramInt) == 0) {
      return 4;
    }
    return 5;
  }
  
  public static int f(int paramInt, String paramString)
  {
    return cK(paramInt) + aF(paramString);
  }
  
  public static int h(int paramInt, long paramLong)
  {
    return cK(paramInt) + r(paramLong);
  }
  
  public static int i(int paramInt, long paramLong)
  {
    return cK(paramInt) + r(paramLong);
  }
  
  private void j(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    if (this.aCN - this.position >= i)
    {
      System.arraycopy(paramArrayOfByte, 0, this.buffer, this.position, i);
      this.position = (i + this.position);
      return;
    }
    throw new a(this.position, this.aCN);
  }
  
  private void q(long paramLong)
  {
    for (;;)
    {
      if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L)
      {
        cJ((int)paramLong);
        return;
      }
      cJ((int)paramLong & 0x7F | 0x80);
      paramLong >>>= 7;
    }
  }
  
  private static int r(long paramLong)
  {
    if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L) {
      return 1;
    }
    if ((0xFFFFFFFFFFFFC000 & paramLong) == 0L) {
      return 2;
    }
    if ((0xFFFFFFFFFFE00000 & paramLong) == 0L) {
      return 3;
    }
    if ((0xFFFFFFFFF0000000 & paramLong) == 0L) {
      return 4;
    }
    if ((0xFFFFFFF800000000 & paramLong) == 0L) {
      return 5;
    }
    if ((0xFFFFFC0000000000 & paramLong) == 0L) {
      return 6;
    }
    if ((0xFFFE000000000000 & paramLong) == 0L) {
      return 7;
    }
    if ((0xFF00000000000000 & paramLong) == 0L) {
      return 8;
    }
    if ((0x8000000000000000 & paramLong) == 0L) {
      return 9;
    }
    return 10;
  }
  
  public final void a(int paramInt, e parame)
  {
    at(paramInt, 2);
    if (parame.aCP < 0) {
      parame.nv();
    }
    cL(parame.aCP);
    parame.a(this);
  }
  
  public final void a(int paramInt, byte[] paramArrayOfByte)
  {
    at(paramInt, 2);
    cL(paramArrayOfByte.length);
    j(paramArrayOfByte);
  }
  
  public final void ap(int paramInt1, int paramInt2)
  {
    at(paramInt1, 0);
    if (paramInt2 >= 0)
    {
      cL(paramInt2);
      return;
    }
    q(paramInt2);
  }
  
  public final void aq(int paramInt1, int paramInt2)
  {
    at(paramInt1, 0);
    cL(paramInt2);
  }
  
  public final void e(int paramInt, String paramString)
  {
    at(paramInt, 2);
    paramString = paramString.getBytes("UTF-8");
    cL(paramString.length);
    j(paramString);
  }
  
  public final void f(int paramInt, long paramLong)
  {
    at(paramInt, 0);
    q(paramLong);
  }
  
  public final void g(int paramInt, long paramLong)
  {
    at(paramInt, 0);
    q(paramLong);
  }
  
  public static final class a
    extends IOException
  {
    a(int paramInt1, int paramInt2)
    {
      super();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */