package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class ao
  extends a
{
  int ytd = 0;
  int yte = 0;
  
  public ao()
  {
    this.yrE = 2;
  }
  
  public final byte[] n(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    this.ytd = (paramArrayOfByte1.length + 6 + paramArrayOfByte2.length);
    byte[] arrayOfByte = new byte[this.ytd];
    util.p(arrayOfByte, 0, this.yte);
    util.p(arrayOfByte, 2, paramArrayOfByte1.length);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 4, paramArrayOfByte1.length);
    int i = paramArrayOfByte1.length + 4;
    util.p(arrayOfByte, i, paramArrayOfByte2.length);
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, i + 2, paramArrayOfByte2.length);
    super.Gx(this.yrE);
    super.G(arrayOfByte, this.ytd);
    super.cti();
    return super.cte();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */