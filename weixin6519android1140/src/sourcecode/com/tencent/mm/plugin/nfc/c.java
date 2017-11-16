package com.tencent.mm.plugin.nfc;

import com.tencent.gmtrace.GMTrace;

public final class c
{
  public static String aB(byte[] paramArrayOfByte)
  {
    GMTrace.i(20986820820992L, 156364);
    String str = "";
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      GMTrace.o(20986820820992L, 156364);
      return "";
    }
    int i = 0;
    if (i < paramArrayOfByte.length)
    {
      int k = paramArrayOfByte[i];
      int m = k & 0xF;
      int j;
      label60:
      int n;
      if (m < 10)
      {
        j = 48;
        n = (k & 0xF0) >> 4;
        if (n >= 10) {
          break label125;
        }
      }
      label125:
      for (k = 48;; k = 55)
      {
        str = str + (char)(k + n) + (char)(m + j);
        i += 1;
        break;
        j = 55;
        break label60;
      }
    }
    GMTrace.o(20986820820992L, 156364);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\nfc\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */