package com.tencent.mm.a;

import com.tencent.gmtrace.GMTrace;

public final class n
{
  public static int c(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(13864422866944L, 103298);
    int i = paramArrayOfByte[paramInt];
    int j = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    paramInt = paramArrayOfByte[(paramInt + 3)];
    GMTrace.o(13864422866944L, 103298);
    return (i & 0xFF) << 24 | (j & 0xFF) << 16 | (k & 0xFF) << 8 | (paramInt & 0xFF) << 0;
  }
  
  public static byte[] cS(int paramInt)
  {
    int j = 0;
    GMTrace.i(13864154431488L, 103296);
    byte[] arrayOfByte1 = new byte[4];
    int i = 0;
    while (i < 4)
    {
      arrayOfByte1[i] = ((byte)(paramInt >> i * 8 & 0xFF));
      i += 1;
    }
    byte[] arrayOfByte2 = new byte[4];
    paramInt = j;
    while (paramInt < 4)
    {
      arrayOfByte2[paramInt] = arrayOfByte1[(3 - paramInt)];
      paramInt += 1;
    }
    GMTrace.o(13864154431488L, 103296);
    return arrayOfByte2;
  }
  
  public static int p(byte[] paramArrayOfByte)
  {
    GMTrace.i(13864288649216L, 103297);
    int i = paramArrayOfByte[3];
    int j = paramArrayOfByte[2];
    int k = paramArrayOfByte[1];
    int m = paramArrayOfByte[0];
    GMTrace.o(13864288649216L, 103297);
    return (i & 0xFF) << 24 | (j & 0xFF) << 16 | (k & 0xFF) << 8 | (m & 0xFF) << 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */