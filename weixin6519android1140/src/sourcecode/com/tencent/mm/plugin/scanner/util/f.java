package com.tencent.mm.plugin.scanner.util;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import d.a;

public final class f
  extends a
{
  private static int oAD;
  private final byte[] oAC;
  
  static
  {
    GMTrace.i(6172136439808L, 45986);
    oAD = 10;
    GMTrace.o(6172136439808L, 45986);
  }
  
  public f(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    super(paramBitmap.getWidth() - paramInt1, paramBitmap.getHeight() - paramInt2);
    GMTrace.i(6171733786624L, 45983);
    int i = paramBitmap.getWidth() - paramInt1;
    int j = paramBitmap.getHeight() - paramInt2;
    int[] arrayOfInt = new int[i * j];
    paramBitmap.getPixels(arrayOfInt, 0, i, paramInt1 / 2, paramInt2 / 2, i, j);
    this.oAC = new byte[i * j];
    paramInt1 = 0;
    while (paramInt1 < j)
    {
      int k = paramInt1 * i;
      paramInt2 = 0;
      if (paramInt2 < i)
      {
        int i1 = arrayOfInt[(k + paramInt2)];
        int m = i1 >> 16 & 0xFF;
        int n = i1 >> 8 & 0xFF;
        i1 &= 0xFF;
        if ((m == n) && (n == i1)) {
          this.oAC[(k + paramInt2)] = ((byte)m);
        }
        for (;;)
        {
          paramInt2 += 1;
          break;
          this.oAC[(k + paramInt2)] = ((byte)(i1 + (m + n + n) >> 2));
        }
      }
      paramInt1 += 1;
    }
    GMTrace.o(6171733786624L, 45983);
  }
  
  public final byte[] bdo()
  {
    GMTrace.i(6172002222080L, 45985);
    byte[] arrayOfByte = this.oAC;
    GMTrace.o(6172002222080L, 45985);
    return arrayOfByte;
  }
  
  public final byte[] k(int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(6171868004352L, 45984);
    if ((paramInt < 0) || (paramInt >= this.height)) {
      throw new IllegalArgumentException("Requested row is outside the image: " + paramInt);
    }
    int i = this.width;
    byte[] arrayOfByte;
    if (paramArrayOfByte != null)
    {
      arrayOfByte = paramArrayOfByte;
      if (paramArrayOfByte.length >= i) {}
    }
    else
    {
      arrayOfByte = new byte[i];
    }
    System.arraycopy(this.oAC, paramInt * i, arrayOfByte, 0, i);
    GMTrace.o(6171868004352L, 45984);
    return arrayOfByte;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\util\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */