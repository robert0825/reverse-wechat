package com.tencent.mm.plugin.a;

import com.tencent.gmtrace.GMTrace;
import java.io.RandomAccessFile;

public final class i
  extends a
{
  public i(int paramInt1, long paramLong1, int paramInt2, long paramLong2)
  {
    super(paramInt1, paramLong1, paramInt2, 0L);
    GMTrace.i(16393621733376L, 122142);
    GMTrace.o(16393621733376L, 122142);
  }
  
  public static e b(RandomAccessFile paramRandomAccessFile, byte[] paramArrayOfByte)
  {
    GMTrace.i(16393755951104L, 122143);
    paramRandomAccessFile = (e)c.a(paramRandomAccessFile, paramArrayOfByte, a.hlP);
    GMTrace.o(16393755951104L, 122143);
    return paramRandomAccessFile;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */