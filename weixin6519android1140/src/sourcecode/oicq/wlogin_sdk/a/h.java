package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.c;
import oicq.wlogin_sdk.tools.d;
import oicq.wlogin_sdk.tools.util;

public final class h
  extends a
{
  int ysC = 1;
  int ysD = 1;
  int ysE = 69;
  
  public h()
  {
    this.yrE = 262;
    if (util.ytA <= 2)
    {
      this.ysC = 1;
      this.ysE = 69;
      return;
    }
    this.ysC = 2;
    this.ysE = 90;
  }
  
  public final byte[] a(long paramLong1, int paramInt1, long paramLong2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, int paramInt2, byte[] paramArrayOfByte5)
  {
    if (util.ytA <= 2)
    {
      paramArrayOfByte5 = new byte[this.ysE];
      util.p(paramArrayOfByte5, 0, this.ysC);
      util.q(paramArrayOfByte5, 2, util.cto());
      util.q(paramArrayOfByte5, 6, this.ysD);
      util.q(paramArrayOfByte5, 10, (int)paramLong1);
      util.q(paramArrayOfByte5, 14, paramInt1);
      util.b(paramArrayOfByte5, 18, paramLong2);
      System.arraycopy(paramArrayOfByte1, 0, paramArrayOfByte5, 26, paramArrayOfByte1.length);
      paramInt1 = paramArrayOfByte1.length + 26;
      System.arraycopy(paramArrayOfByte2, 0, paramArrayOfByte5, paramInt1, paramArrayOfByte2.length);
      paramInt1 += paramArrayOfByte2.length;
      util.o(paramArrayOfByte5, paramInt1, 1);
      paramInt1 += 1;
      System.arraycopy(paramArrayOfByte3, 0, paramArrayOfByte5, paramInt1, paramArrayOfByte3.length);
      System.arraycopy(paramArrayOfByte4, 0, paramArrayOfByte5, paramInt1 + paramArrayOfByte3.length, paramArrayOfByte4.length);
      paramArrayOfByte1 = new byte[24];
      System.arraycopy(paramArrayOfByte3, 0, paramArrayOfByte1, 0, paramArrayOfByte3.length);
      util.b(paramArrayOfByte1, 16, paramLong2);
      paramArrayOfByte1 = c.bX(paramArrayOfByte1);
      paramArrayOfByte1 = d.b(paramArrayOfByte5, paramArrayOfByte5.length, paramArrayOfByte1);
      this.ysE = paramArrayOfByte1.length;
      super.Gx(this.yrE);
      super.G(paramArrayOfByte1, this.ysE);
      super.cti();
      return super.cte();
    }
    byte[] arrayOfByte = new byte[this.ysE];
    util.p(arrayOfByte, 0, this.ysC);
    util.q(arrayOfByte, 2, util.cto());
    util.q(arrayOfByte, 6, this.ysD);
    util.q(arrayOfByte, 10, (int)paramLong1);
    util.q(arrayOfByte, 14, paramInt1);
    util.b(arrayOfByte, 18, paramLong2);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 26, paramArrayOfByte1.length);
    paramInt1 = paramArrayOfByte1.length + 26;
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, paramInt1, paramArrayOfByte2.length);
    paramInt1 += paramArrayOfByte2.length;
    util.o(arrayOfByte, paramInt1, 1);
    paramInt1 += 1;
    System.arraycopy(paramArrayOfByte3, 0, arrayOfByte, paramInt1, paramArrayOfByte3.length);
    paramInt1 += paramArrayOfByte3.length;
    System.arraycopy(paramArrayOfByte4, 0, arrayOfByte, paramInt1, paramArrayOfByte4.length);
    paramInt1 += paramArrayOfByte4.length;
    util.q(arrayOfByte, paramInt1, 0);
    paramInt1 += 4;
    util.o(arrayOfByte, paramInt1, paramInt2);
    if ((paramArrayOfByte5 == null) || (paramArrayOfByte5.length <= 0))
    {
      paramArrayOfByte1 = new byte[16];
      util.q(paramArrayOfByte1, 0, util.cto());
      util.q(paramArrayOfByte1, 4, util.cto());
      util.q(paramArrayOfByte1, 8, util.cto());
      util.q(paramArrayOfByte1, 12, util.cto());
    }
    for (;;)
    {
      paramArrayOfByte1 = new byte[24];
      System.arraycopy(paramArrayOfByte3, 0, paramArrayOfByte1, 0, paramArrayOfByte3.length);
      util.b(paramArrayOfByte1, 16, paramLong2);
      paramArrayOfByte1 = c.bX(paramArrayOfByte1);
      paramArrayOfByte1 = d.b(arrayOfByte, arrayOfByte.length, paramArrayOfByte1);
      this.ysE = paramArrayOfByte1.length;
      super.Gx(this.yrE);
      super.G(paramArrayOfByte1, this.ysE);
      super.cti();
      return cte();
      System.arraycopy(paramArrayOfByte5, 0, arrayOfByte, paramInt1 + 1, paramArrayOfByte5.length);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */