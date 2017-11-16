package com.tencent.mm.pluginsdk.j.a.c;

import com.tencent.gmtrace.GMTrace;
import java.io.IOException;

public final class b
  extends IOException
{
  private final long eYV;
  private final long tqU;
  
  public b()
  {
    this(0L, 0L);
    GMTrace.i(885568569344L, 6598);
    GMTrace.o(885568569344L, 6598);
  }
  
  public b(long paramLong1, long paramLong2)
  {
    super(String.format("contentLength: %d, requestRange:%d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) }));
    GMTrace.i(885702787072L, 6599);
    this.eYV = paramLong1;
    this.tqU = paramLong2;
    GMTrace.o(885702787072L, 6599);
  }
  
  public final String toString()
  {
    GMTrace.i(885837004800L, 6600);
    String str = "FileSizeOutOfRangeException{contentLength=" + this.eYV + ", requestRange=" + this.tqU + '}';
    GMTrace.o(885837004800L, 6600);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */