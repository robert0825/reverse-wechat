package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class ae
  extends a
{
  int ysR = 0;
  int ysS = 0;
  
  public ae()
  {
    this.yrE = 322;
  }
  
  public final byte[] bU(byte[] paramArrayOfByte)
  {
    this.ysS = (paramArrayOfByte.length + 4);
    byte[] arrayOfByte = new byte[this.ysS];
    util.p(arrayOfByte, 0, this.ysR);
    util.p(arrayOfByte, 2, paramArrayOfByte.length);
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 4, paramArrayOfByte.length);
    super.Gx(this.yrE);
    super.G(arrayOfByte, arrayOfByte.length);
    super.cti();
    return super.cte();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */