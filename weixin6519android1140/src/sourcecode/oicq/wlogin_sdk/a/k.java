package oicq.wlogin_sdk.a;

public final class k
  extends a
{
  int ysH = 0;
  
  public k()
  {
    this.yrE = 265;
  }
  
  public final byte[] bT(byte[] paramArrayOfByte)
  {
    this.ysH = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[this.ysH];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    super.Gx(this.yrE);
    super.G(arrayOfByte, this.ysH);
    super.cti();
    return super.cte();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */