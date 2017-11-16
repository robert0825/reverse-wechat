package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class c
  extends a
{
  int ysu = 1;
  int ysv = util.ytA;
  int ysw = 22;
  
  public c()
  {
    this.yrE = 256;
  }
  
  public final byte[] a(long paramLong1, long paramLong2, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[this.ysw];
    util.p(arrayOfByte, 0, this.ysu);
    util.q(arrayOfByte, 2, this.ysv);
    util.q(arrayOfByte, 6, (int)paramLong1);
    util.q(arrayOfByte, 10, 1);
    util.q(arrayOfByte, 14, paramInt1);
    util.q(arrayOfByte, 18, paramInt2);
    super.Gx(this.yrE);
    super.G(arrayOfByte, this.ysw);
    super.cti();
    return super.cte();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */