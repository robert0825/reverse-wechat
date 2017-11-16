package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class an
  extends a
{
  int yta = 22;
  int ytb = 1;
  int ytc = 1536;
  
  public an()
  {
    this.yrE = 24;
  }
  
  public final byte[] a(long paramLong1, int paramInt1, long paramLong2, int paramInt2)
  {
    byte[] arrayOfByte = new byte[this.yta];
    util.p(arrayOfByte, 0, this.ytb);
    util.q(arrayOfByte, 2, this.ytc);
    util.q(arrayOfByte, 6, (int)paramLong1);
    util.q(arrayOfByte, 10, paramInt1);
    util.q(arrayOfByte, 14, (int)paramLong2);
    util.p(arrayOfByte, 18, 0);
    util.p(arrayOfByte, 20, 0);
    super.Gx(this.yrE);
    super.G(arrayOfByte, this.yta);
    super.cti();
    return super.cte();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */