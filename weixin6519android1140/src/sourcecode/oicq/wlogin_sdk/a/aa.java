package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class aa
  extends a
{
  int ysO = 0;
  
  public aa()
  {
    this.yrE = 296;
  }
  
  private static int H(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte != null)
    {
      if (paramArrayOfByte.length > paramInt) {
        return paramInt;
      }
      return paramArrayOfByte.length;
    }
    return 0;
  }
  
  public final byte[] a(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int j = H(paramArrayOfByte1, 32);
    int i = H(paramArrayOfByte2, 16);
    this.ysO = (j + 11 + 2 + i + 2);
    byte[] arrayOfByte = new byte[this.ysO];
    util.p(arrayOfByte, 0, 0);
    util.o(arrayOfByte, 2, paramInt1);
    util.o(arrayOfByte, 3, paramInt2);
    util.o(arrayOfByte, 4, paramInt3);
    util.q(arrayOfByte, 5, 0);
    util.p(arrayOfByte, 9, j);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 11, j);
    paramInt1 = j + 11;
    util.p(arrayOfByte, paramInt1, i);
    paramInt1 += 2;
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, paramInt1, i);
    util.p(arrayOfByte, paramInt1 + i, 0);
    super.Gx(this.yrE);
    super.G(arrayOfByte, this.ysO);
    super.cti();
    return super.cte();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */