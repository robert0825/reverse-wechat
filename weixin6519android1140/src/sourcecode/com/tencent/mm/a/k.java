package com.tencent.mm.a;

import com.tencent.gmtrace.GMTrace;

public final class k
{
  public static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    GMTrace.i(13853819666432L, 103219);
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null))
    {
      GMTrace.o(13853819666432L, 103219);
      return null;
    }
    paramArrayOfByte1 = c(paramArrayOfByte1, paramArrayOfByte2);
    GMTrace.o(13853819666432L, 103219);
    return paramArrayOfByte1;
  }
  
  public static byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    GMTrace.i(13853953884160L, 103220);
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null))
    {
      GMTrace.o(13853953884160L, 103220);
      return null;
    }
    paramArrayOfByte1 = c(paramArrayOfByte1, paramArrayOfByte2);
    GMTrace.o(13853953884160L, 103220);
    return paramArrayOfByte1;
  }
  
  private static byte[] c(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int n = 0;
    GMTrace.i(13854088101888L, 103221);
    byte[] arrayOfByte2 = new byte['Ā'];
    int j = 0;
    while (j < 256)
    {
      arrayOfByte2[j] = ((byte)j);
      j += 1;
    }
    byte[] arrayOfByte1;
    int k;
    int m;
    if ((paramArrayOfByte2 == null) || (paramArrayOfByte2.length == 0))
    {
      arrayOfByte1 = null;
      paramArrayOfByte2 = new byte[paramArrayOfByte1.length];
      k = 0;
      m = 0;
      j = n;
    }
    while (j < paramArrayOfByte1.length)
    {
      m = m + 1 & 0xFF;
      k = k + (arrayOfByte1[m] & 0xFF) & 0xFF;
      int i = arrayOfByte1[m];
      arrayOfByte1[m] = arrayOfByte1[k];
      arrayOfByte1[k] = i;
      n = arrayOfByte1[m];
      int i1 = arrayOfByte1[k];
      int i2 = paramArrayOfByte1[j];
      paramArrayOfByte2[j] = ((byte)(arrayOfByte1[((n & 0xFF) + (i1 & 0xFF) & 0xFF)] ^ i2));
      j += 1;
      continue;
      k = 0;
      m = 0;
      j = 0;
      for (;;)
      {
        arrayOfByte1 = arrayOfByte2;
        if (k >= 256) {
          break;
        }
        m = m + ((paramArrayOfByte2[j] & 0xFF) + (arrayOfByte2[k] & 0xFF)) & 0xFF;
        i = arrayOfByte2[k];
        arrayOfByte2[k] = arrayOfByte2[m];
        arrayOfByte2[m] = i;
        j = (j + 1) % paramArrayOfByte2.length;
        k += 1;
      }
    }
    GMTrace.o(13854088101888L, 103221);
    return paramArrayOfByte2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */