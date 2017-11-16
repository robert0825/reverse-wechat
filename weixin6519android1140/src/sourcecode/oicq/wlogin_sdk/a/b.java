package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class b
  extends a
{
  int ysp = 4;
  int ysq = 14;
  int ysr = 1;
  int yss = 20;
  byte[] yst = new byte[2];
  
  public b()
  {
    this.yrE = 1;
  }
  
  public final Boolean ctj()
  {
    if (this.yso < 20) {
      return Boolean.valueOf(false);
    }
    return Boolean.valueOf(true);
  }
  
  public final byte[] g(long paramLong, byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[this.yss];
    util.p(arrayOfByte, 0, this.ysr);
    util.q(arrayOfByte, 2, util.cto());
    util.q(arrayOfByte, 6, (int)paramLong);
    util.c(arrayOfByte, 10, util.ctq());
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 14, paramArrayOfByte.length);
    util.p(arrayOfByte, paramArrayOfByte.length + 14, 0);
    super.Gx(this.yrE);
    super.G(arrayOfByte, this.yss);
    super.cti();
    return super.cte();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */