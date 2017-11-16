package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class i
  extends a
{
  int ysF = 6;
  
  public i()
  {
    this.yrE = 263;
  }
  
  public final byte[] y(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    byte[] arrayOfByte = new byte[this.ysF];
    util.p(arrayOfByte, 0, 0);
    util.o(arrayOfByte, 2, 1);
    util.p(arrayOfByte, 3, 102400);
    util.o(arrayOfByte, 5, 1);
    super.Gx(this.yrE);
    super.G(arrayOfByte, this.ysF);
    super.cti();
    return super.cte();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */