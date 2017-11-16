package oicq.wlogin_sdk.a;

public final class j
  extends a
{
  int ysG = 0;
  
  public j()
  {
    this.yrE = 264;
  }
  
  public final byte[] bS(byte[] paramArrayOfByte)
  {
    this.ysG = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[this.ysG];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    super.Gx(this.yrE);
    super.G(arrayOfByte, this.ysG);
    super.cti();
    return super.cte();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */