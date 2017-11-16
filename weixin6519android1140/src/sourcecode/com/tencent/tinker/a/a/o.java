package com.tencent.tinker.a.a;

import com.tencent.tinker.a.a.b.a;
import com.tencent.tinker.a.a.b.b;

public final class o
{
  public static int a(a parama)
  {
    int j = 0;
    int m = -1;
    int i = 0;
    int i2;
    int k;
    int n;
    int i1;
    do
    {
      i2 = parama.readByte() & 0xFF;
      k = i | (i2 & 0x7F) << j * 7;
      n = m << 7;
      i1 = j + 1;
      if ((i2 & 0x80) != 128) {
        break;
      }
      m = n;
      j = i1;
      i = k;
    } while (i1 < 5);
    if ((i2 & 0x80) == 128) {
      throw new j("invalid LEB128 sequence");
    }
    i = k;
    if ((n >> 1 & k) != 0) {
      i = k | n;
    }
    return i;
  }
  
  public static int a(b paramb, int paramInt)
  {
    int k = paramInt >>> 7;
    int i = 0;
    int j = paramInt;
    paramInt = k;
    while (paramInt != 0)
    {
      paramb.writeByte((byte)(j & 0x7F | 0x80));
      i += 1;
      j = paramInt;
      paramInt >>>= 7;
    }
    paramb.writeByte((byte)(j & 0x7F));
    return i + 1;
  }
  
  public static int b(a parama)
  {
    int j = 0;
    int i = 0;
    int n;
    int k;
    int m;
    do
    {
      n = parama.readByte() & 0xFF;
      k = i | (n & 0x7F) << j * 7;
      m = j + 1;
      if ((n & 0x80) != 128) {
        break;
      }
      j = m;
      i = k;
    } while (m < 5);
    if ((n & 0x80) == 128) {
      throw new j("invalid LEB128 sequence");
    }
    return k;
  }
  
  public static int b(b paramb, int paramInt)
  {
    return a(paramb, paramInt + 1);
  }
  
  public static int c(a parama)
  {
    return b(parama) - 1;
  }
  
  public static int c(b paramb, int paramInt)
  {
    int j;
    int k;
    int i;
    int m;
    if ((0x80000000 & paramInt) == 0)
    {
      j = 0;
      k = 0;
      i = 1;
      n = paramInt >> 7;
      m = paramInt;
      paramInt = n;
      label26:
      if (i == 0) {
        break label107;
      }
      if ((paramInt == j) && ((paramInt & 0x1) == (m >> 6 & 0x1))) {
        break label96;
      }
      i = 1;
      label50:
      if (i == 0) {
        break label101;
      }
    }
    label96:
    label101:
    for (int n = 128;; n = 0)
    {
      paramb.writeByte((byte)(n | m & 0x7F));
      m = paramInt;
      paramInt >>= 7;
      k += 1;
      break label26;
      j = -1;
      break;
      i = 0;
      break label50;
    }
    label107:
    return k;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tinker\a\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */