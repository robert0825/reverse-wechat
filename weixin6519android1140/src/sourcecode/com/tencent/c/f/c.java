package com.tencent.c.f;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class c
{
  private static void a(byte[] paramArrayOfByte, int[] paramArrayOfInt)
  {
    int j = 0;
    int k = paramArrayOfByte.length;
    int i = 0;
    while (i < k >> 2)
    {
      int m = j + 1;
      paramArrayOfByte[j] &= 0xFF;
      int n = paramArrayOfInt[i];
      j = m + 1;
      paramArrayOfInt[i] = (n | (paramArrayOfByte[m] & 0xFF) << 8);
      n = paramArrayOfInt[i];
      m = j + 1;
      paramArrayOfInt[i] = (n | (paramArrayOfByte[j] & 0xFF) << 16);
      n = paramArrayOfInt[i];
      j = m + 1;
      paramArrayOfInt[i] = ((paramArrayOfByte[m] & 0xFF) << 24 | n);
      i += 1;
    }
    if (j < paramArrayOfByte.length)
    {
      k = j + 1;
      paramArrayOfByte[j] &= 0xFF;
      j = 8;
      while (k < paramArrayOfByte.length)
      {
        paramArrayOfInt[i] |= (paramArrayOfByte[k] & 0xFF) << j;
        k += 1;
        j += 8;
      }
    }
  }
  
  private static void a(int[] paramArrayOfInt, int paramInt, byte[] paramArrayOfByte)
  {
    int k = 0;
    int i = paramArrayOfByte.length >> 2;
    int j = i;
    if (i > paramInt) {
      j = paramInt;
    }
    i = 0;
    while (i < j)
    {
      int m = k + 1;
      paramArrayOfByte[k] = ((byte)(paramArrayOfInt[i] & 0xFF));
      k = m + 1;
      paramArrayOfByte[m] = ((byte)(paramArrayOfInt[i] >>> 8 & 0xFF));
      m = k + 1;
      paramArrayOfByte[k] = ((byte)(paramArrayOfInt[i] >>> 16 & 0xFF));
      k = m + 1;
      paramArrayOfByte[m] = ((byte)(paramArrayOfInt[i] >>> 24 & 0xFF));
      i += 1;
    }
    if ((paramInt > j) && (k < paramArrayOfByte.length))
    {
      paramInt = k + 1;
      paramArrayOfByte[k] = ((byte)(paramArrayOfInt[i] & 0xFF));
      j = 8;
      while ((j <= 24) && (paramInt < paramArrayOfByte.length))
      {
        paramArrayOfByte[paramInt] = ((byte)(paramArrayOfInt[i] >>> j & 0xFF));
        j += 8;
        paramInt += 1;
      }
    }
  }
  
  private static byte[] bB(byte[] paramArrayOfByte)
  {
    Object localObject = paramArrayOfByte;
    if (paramArrayOfByte != null)
    {
      localObject = paramArrayOfByte;
      if (paramArrayOfByte.length <= 16) {}
    }
    try
    {
      localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramArrayOfByte);
      localObject = ((MessageDigest)localObject).digest();
      return (byte[])localObject;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte) {}
    return null;
  }
  
  public static byte[] cnH()
  {
    try
    {
      Object localObject = new StringBuffer();
      int i = 0;
      while (i < "http://pmir.3g.qq.com".length())
      {
        ((StringBuffer)localObject).append((char)("http://pmir.3g.qq.com".charAt(i) + new int[] { -36, -46, -45, -77, -22, -10, 47, -77, -72, -69, -32, 25, 21, -21, -6, -75, -71, 31, -39, -49, -49 }[i]));
        i += 1;
      }
      localObject = ((StringBuffer)localObject).toString().getBytes("UTF-8");
      return (byte[])localObject;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException) {}
    return null;
  }
  
  public static byte[] j(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = bB(paramArrayOfByte2);
    if ((paramArrayOfByte1 == null) || (arrayOfByte == null) || (paramArrayOfByte1.length == 0)) {
      return paramArrayOfByte1;
    }
    if (paramArrayOfByte1.length % 4 == 0)
    {
      i = (paramArrayOfByte1.length >>> 2) + 1;
      paramArrayOfByte2 = new int[i];
      a(paramArrayOfByte1, paramArrayOfByte2);
      paramArrayOfByte2[(i - 1)] = paramArrayOfByte1.length;
      if (arrayOfByte.length % 4 != 0) {
        break label107;
      }
    }
    label107:
    for (int i = arrayOfByte.length >>> 2;; i = (arrayOfByte.length >>> 2) + 1)
    {
      j = i;
      if (i < 4) {
        j = 4;
      }
      paramArrayOfByte1 = new int[j];
      i = 0;
      while (i < j)
      {
        paramArrayOfByte1[i] = 0;
        i += 1;
      }
      i = (paramArrayOfByte1.length >>> 2) + 2;
      break;
    }
    a(arrayOfByte, paramArrayOfByte1);
    int i1 = paramArrayOfByte2.length - 1;
    i = paramArrayOfByte2[i1];
    int j = 52 / (i1 + 1) + 6;
    int k = 0;
    while (j > 0)
    {
      int m = -1640531527 + k;
      int i2 = m >>> 2 & 0x3;
      int n = 0;
      k = i;
      i = n;
      while (i < i1)
      {
        n = paramArrayOfByte2[(i + 1)];
        i3 = paramArrayOfByte2[i];
        k = ((k ^ paramArrayOfByte1[(i & 0x3 ^ i2)]) + (n ^ m) ^ (k >>> 5 ^ n << 2) + (n >>> 3 ^ k << 4)) + i3;
        paramArrayOfByte2[i] = k;
        i += 1;
      }
      n = paramArrayOfByte2[0];
      int i3 = paramArrayOfByte2[i1];
      i = ((paramArrayOfByte1[(i & 0x3 ^ i2)] ^ k) + (n ^ m) ^ (k >>> 5 ^ n << 2) + (n >>> 3 ^ k << 4)) + i3;
      paramArrayOfByte2[i1] = i;
      k = m;
      j -= 1;
    }
    paramArrayOfByte1 = new byte[paramArrayOfByte2.length << 2];
    a(paramArrayOfByte2, paramArrayOfByte2.length, paramArrayOfByte1);
    return paramArrayOfByte1;
  }
  
  public static byte[] k(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = bB(paramArrayOfByte2);
    if ((paramArrayOfByte1 == null) || (arrayOfByte == null) || (paramArrayOfByte1.length == 0)) {
      return paramArrayOfByte1;
    }
    if ((paramArrayOfByte1.length % 4 != 0) || (paramArrayOfByte1.length < 8)) {
      return null;
    }
    paramArrayOfByte2 = new int[paramArrayOfByte1.length >>> 2];
    a(paramArrayOfByte1, paramArrayOfByte2);
    if (arrayOfByte.length % 4 == 0) {}
    for (int i = arrayOfByte.length >>> 2;; i = (arrayOfByte.length >>> 2) + 1)
    {
      j = i;
      if (i < 4) {
        j = 4;
      }
      paramArrayOfByte1 = new int[j];
      i = 0;
      while (i < j)
      {
        paramArrayOfByte1[i] = 0;
        i += 1;
      }
    }
    a(arrayOfByte, paramArrayOfByte1);
    int m = paramArrayOfByte2.length - 1;
    i = paramArrayOfByte2[0];
    int j = (52 / (m + 1) + 6) * -1640531527;
    while (j != 0)
    {
      int n = j >>> 2 & 0x3;
      int k = i;
      i = m;
      while (i > 0)
      {
        i1 = paramArrayOfByte2[(i - 1)];
        k = paramArrayOfByte2[i] - ((k ^ j) + (i1 ^ paramArrayOfByte1[(i & 0x3 ^ n)]) ^ (i1 >>> 5 ^ k << 2) + (k >>> 3 ^ i1 << 4));
        paramArrayOfByte2[i] = k;
        i -= 1;
      }
      int i1 = paramArrayOfByte2[m];
      i = paramArrayOfByte2[0] - ((paramArrayOfByte1[(i & 0x3 ^ n)] ^ i1) + (k ^ j) ^ (i1 >>> 5 ^ k << 2) + (k >>> 3 ^ i1 << 4));
      paramArrayOfByte2[0] = i;
      j += 1640531527;
    }
    i = paramArrayOfByte2[m];
    if ((i < 0) || (i > paramArrayOfByte2.length - 1 << 2)) {
      return null;
    }
    paramArrayOfByte1 = new byte[i];
    a(paramArrayOfByte2, paramArrayOfByte2.length - 1, paramArrayOfByte1);
    return paramArrayOfByte1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\f\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */