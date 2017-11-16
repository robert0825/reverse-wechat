package com.tencent.mm.plugin.nfc.c;

import com.tencent.gmtrace.GMTrace;

public final class a
{
  private static final char[] nxt;
  
  static
  {
    GMTrace.i(8958362255360L, 66745);
    nxt = new char[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
    GMTrace.o(8958362255360L, 66745);
  }
  
  public static byte[] b(short paramShort)
  {
    GMTrace.i(8957959602176L, 66742);
    int i = (byte)(paramShort >>> 8 & 0xFF);
    int j = (byte)(paramShort & 0xFF);
    GMTrace.o(8957959602176L, 66742);
    return new byte[] { i, j };
  }
  
  public static String byteArrayToHexString(byte[] paramArrayOfByte)
  {
    GMTrace.i(8958093819904L, 66743);
    if (paramArrayOfByte == null)
    {
      GMTrace.o(8958093819904L, 66743);
      return null;
    }
    char[] arrayOfChar = new char[paramArrayOfByte.length * 2];
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      int j = paramArrayOfByte[i] & 0xFF;
      arrayOfChar[(i * 2)] = nxt[(j >>> 4)];
      arrayOfChar[(i * 2 + 1)] = nxt[(j & 0xF)];
      i += 1;
    }
    paramArrayOfByte = new String(arrayOfChar);
    GMTrace.o(8958093819904L, 66743);
    return paramArrayOfByte;
  }
  
  public static byte[] hexStringToByteArray(String paramString)
  {
    GMTrace.i(8958228037632L, 66744);
    int j = paramString.length();
    byte[] arrayOfByte = new byte[j / 2];
    int i = 0;
    while (i < j)
    {
      arrayOfByte[(i / 2)] = ((byte)((Character.digit(paramString.charAt(i), 16) << 4) + Character.digit(paramString.charAt(i + 1), 16)));
      i += 2;
    }
    GMTrace.o(8958228037632L, 66744);
    return arrayOfByte;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nfc\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */