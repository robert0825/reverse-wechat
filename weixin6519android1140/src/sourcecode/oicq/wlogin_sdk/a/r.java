package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class r
  extends a
{
  int ysI = 0;
  int ysJ = 0;
  
  public r()
  {
    this.yrE = 278;
  }
  
  public final byte[] a(int paramInt1, int paramInt2, long[] paramArrayOfLong)
  {
    this.ysI = 10;
    paramArrayOfLong = new byte[this.ysI];
    util.o(paramArrayOfLong, 0, this.ysJ);
    util.q(paramArrayOfLong, 1, paramInt1);
    util.q(paramArrayOfLong, 5, paramInt2);
    util.o(paramArrayOfLong, 9, 0);
    super.Gx(this.yrE);
    super.G(paramArrayOfLong, this.ysI);
    super.cti();
    return super.cte();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */