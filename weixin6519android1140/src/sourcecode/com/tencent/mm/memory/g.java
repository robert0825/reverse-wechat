package com.tencent.mm.memory;

import com.tencent.gmtrace.GMTrace;
import java.util.Arrays;

public final class g
  extends a<byte[]>
{
  public static final g ghL;
  
  static
  {
    GMTrace.i(1289832366080L, 9610);
    ghL = new g();
    GMTrace.o(1289832366080L, 9610);
  }
  
  private g()
  {
    GMTrace.i(1288490188800L, 9600);
    GMTrace.o(1288490188800L, 9600);
  }
  
  public final void x(byte[] paramArrayOfByte)
  {
    try
    {
      GMTrace.i(1288624406528L, 9601);
      Arrays.fill(paramArrayOfByte, (byte)0);
      super.aw(paramArrayOfByte);
      GMTrace.o(1288624406528L, 9601);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  protected final long yc()
  {
    GMTrace.i(1288758624256L, 9602);
    GMTrace.o(1288758624256L, 9602);
    return 5242880L;
  }
  
  protected final long yd()
  {
    GMTrace.i(1288892841984L, 9603);
    GMTrace.o(1288892841984L, 9603);
    return 1048576L;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\memory\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */