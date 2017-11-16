package com.tencent.mm.bw;

import com.tencent.gmtrace.GMTrace;

public final class e
{
  public static byte[] bt(byte[] paramArrayOfByte)
  {
    GMTrace.i(13154947956736L, 98012);
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      paramArrayOfByte[i] = ((byte)(paramArrayOfByte[i] ^ 0x12));
      i += 1;
    }
    GMTrace.o(13154947956736L, 98012);
    return paramArrayOfByte;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bw\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */