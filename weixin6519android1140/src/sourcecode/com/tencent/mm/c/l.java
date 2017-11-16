package com.tencent.mm.c;

import com.tencent.gmtrace.GMTrace;

public final class l
  implements Cloneable
{
  public int value;
  
  public l(int paramInt)
  {
    GMTrace.i(14021323390976L, 104467);
    this.value = paramInt;
    GMTrace.o(14021323390976L, 104467);
  }
  
  public l(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, (byte)0);
    GMTrace.i(14021054955520L, 104465);
    GMTrace.o(14021054955520L, 104465);
  }
  
  private l(byte[] paramArrayOfByte, byte paramByte)
  {
    GMTrace.i(14021189173248L, 104466);
    this.value = (paramArrayOfByte[1] << 8 & 0xFF00);
    this.value += (paramArrayOfByte[0] & 0xFF);
    GMTrace.o(14021189173248L, 104466);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(14021457608704L, 104468);
    if ((paramObject == null) || (!(paramObject instanceof l)))
    {
      GMTrace.o(14021457608704L, 104468);
      return false;
    }
    if (this.value == ((l)paramObject).value)
    {
      GMTrace.o(14021457608704L, 104468);
      return true;
    }
    GMTrace.o(14021457608704L, 104468);
    return false;
  }
  
  public final byte[] getBytes()
  {
    GMTrace.i(14021591826432L, 104469);
    int i = (byte)(this.value & 0xFF);
    int j = (byte)((this.value & 0xFF00) >> 8);
    GMTrace.o(14021591826432L, 104469);
    return new byte[] { i, j };
  }
  
  public final int hashCode()
  {
    GMTrace.i(14021726044160L, 104470);
    int i = this.value;
    GMTrace.o(14021726044160L, 104470);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\c\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */