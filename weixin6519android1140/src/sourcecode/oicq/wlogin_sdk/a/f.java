package oicq.wlogin_sdk.a;

public final class f
  extends a
{
  int ysx = 0;
  
  public f()
  {
    this.yrE = 260;
  }
  
  public final byte[] bR(byte[] paramArrayOfByte)
  {
    this.ysx = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[this.ysx];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    super.Gx(this.yrE);
    super.G(arrayOfByte, this.ysx);
    super.cti();
    return super.cte();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */