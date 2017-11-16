package com.tencent.mm.c;

import com.tencent.gmtrace.GMTrace;

public final class k
  implements Cloneable
{
  long value;
  
  public k(long paramLong)
  {
    GMTrace.i(14023336656896L, 104482);
    this.value = paramLong;
    GMTrace.o(14023336656896L, 104482);
  }
  
  public k(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, (byte)0);
    GMTrace.i(14023068221440L, 104480);
    GMTrace.o(14023068221440L, 104480);
  }
  
  private k(byte[] paramArrayOfByte, byte paramByte)
  {
    GMTrace.i(14023202439168L, 104481);
    this.value = (paramArrayOfByte[3] << 24 & 0xFF000000);
    this.value += (paramArrayOfByte[2] << 16 & 0xFF0000);
    this.value += (paramArrayOfByte[1] << 8 & 0xFF00);
    this.value += (paramArrayOfByte[0] & 0xFF);
    GMTrace.o(14023202439168L, 104481);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(14023470874624L, 104483);
    if ((paramObject == null) || (!(paramObject instanceof k)))
    {
      GMTrace.o(14023470874624L, 104483);
      return false;
    }
    if (this.value == ((k)paramObject).value)
    {
      GMTrace.o(14023470874624L, 104483);
      return true;
    }
    GMTrace.o(14023470874624L, 104483);
    return false;
  }
  
  public final byte[] getBytes()
  {
    GMTrace.i(14023605092352L, 104484);
    int i = (byte)(int)(this.value & 0xFF);
    int j = (byte)(int)((this.value & 0xFF00) >> 8);
    int k = (byte)(int)((this.value & 0xFF0000) >> 16);
    int m = (byte)(int)((this.value & 0xFF000000) >> 24);
    GMTrace.o(14023605092352L, 104484);
    return new byte[] { i, j, k, m };
  }
  
  public final int hashCode()
  {
    GMTrace.i(14023739310080L, 104485);
    int i = (int)this.value;
    GMTrace.o(14023739310080L, 104485);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\c\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */