package oicq.wlogin_sdk.a;

public final class ah
  extends a
{
  public int ysV = 0;
  
  public ah()
  {
    this.yrE = 325;
  }
  
  public final byte[] bV(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {}
    for (int i = paramArrayOfByte.length + 0;; i = 0)
    {
      byte[] arrayOfByte = new byte[i];
      if (arrayOfByte.length > 0) {
        System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, i);
      }
      this.ysV = arrayOfByte.length;
      super.Gx(this.yrE);
      super.G(arrayOfByte, arrayOfByte.length);
      super.cti();
      return super.cte();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */