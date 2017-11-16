package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.d;
import oicq.wlogin_sdk.tools.util;

public class a
{
  public int yrE = 0;
  public int yrs = 128;
  public int yrt = 0;
  public byte[] yry = new byte[this.yrs];
  int ysm = 0;
  public int ysn = 4;
  public int yso = 0;
  
  private static int m(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int j = paramArrayOfByte.length;
    for (;;)
    {
      if (paramInt1 >= j) {}
      do
      {
        int i = -1;
        do
        {
          return i;
          if (paramInt1 + 2 > j) {
            break;
          }
          i = paramInt1;
        } while (util.J(paramArrayOfByte, paramInt1) == paramInt2);
        paramInt1 += 2;
      } while (paramInt1 + 2 > j);
      paramInt1 += util.J(paramArrayOfByte, paramInt1) + 2;
    }
  }
  
  public final void G(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt > this.yrs - this.ysn)
    {
      this.yrs = (this.ysn + paramInt + 64);
      byte[] arrayOfByte = new byte[this.yrs];
      System.arraycopy(this.yry, 0, arrayOfByte, 0, this.yrt);
      this.yry = arrayOfByte;
    }
    this.yso = paramInt;
    System.arraycopy(paramArrayOfByte, 0, this.yry, this.yrt, paramInt);
    this.yrt += paramInt;
  }
  
  public final void Gx(int paramInt)
  {
    util.p(this.yry, this.yrt, paramInt);
    this.yrt += 2;
    util.p(this.yry, this.yrt, 0);
    this.yrt += 2;
  }
  
  public final int b(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    int i = m(paramArrayOfByte1, paramInt1, this.yrE);
    if (i < 0) {}
    byte[] arrayOfByte;
    do
    {
      do
      {
        return -1;
        paramInt1 = paramInt2 - (i - paramInt1);
        arrayOfByte = new byte[paramInt1];
        System.arraycopy(paramArrayOfByte1, i, arrayOfByte, 0, paramInt1);
      } while (this.ysn >= paramInt1);
      this.yso = util.J(arrayOfByte, 2);
    } while (this.ysn + this.yso > paramInt1);
    paramArrayOfByte1 = d.decrypt(arrayOfByte, this.ysn, this.yso, paramArrayOfByte2);
    if (paramArrayOfByte1 == null) {
      return 64521;
    }
    if (this.ysn + paramArrayOfByte1.length > this.yrs)
    {
      this.yrs = (this.ysn + paramArrayOfByte1.length);
      this.yry = new byte[this.yrs];
    }
    this.yrt = 0;
    System.arraycopy(arrayOfByte, 0, this.yry, 0, this.ysn);
    this.yrt += this.ysn;
    System.arraycopy(paramArrayOfByte1, 0, this.yry, this.yrt, paramArrayOfByte1.length);
    this.yrt += paramArrayOfByte1.length;
    this.yso = paramArrayOfByte1.length;
    if (!ctj().booleanValue()) {
      return 64531;
    }
    return 0;
  }
  
  public final byte[] cte()
  {
    byte[] arrayOfByte = new byte[this.yrt];
    System.arraycopy(this.yry, 0, arrayOfByte, 0, this.yrt);
    return arrayOfByte;
  }
  
  public final byte[] cth()
  {
    byte[] arrayOfByte = new byte[this.yso];
    System.arraycopy(this.yry, this.ysn, arrayOfByte, 0, this.yso);
    return arrayOfByte;
  }
  
  public final void cti()
  {
    util.p(this.yry, 2, this.yrt - this.ysn);
  }
  
  public Boolean ctj()
  {
    return Boolean.valueOf(true);
  }
  
  public final int n(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = m(paramArrayOfByte, paramInt1, this.yrE);
    if (i < 0) {}
    do
    {
      do
      {
        return -1;
        paramInt1 = paramInt2 - (i - paramInt1);
      } while (this.ysn >= paramInt1);
      this.yso = util.J(paramArrayOfByte, i + 2);
    } while (this.ysn + this.yso > paramInt1);
    paramInt1 = this.ysn + this.yso;
    if (paramInt1 > this.yrs)
    {
      this.yrs = (paramInt1 + 128);
      this.yry = new byte[this.yrs];
    }
    this.yrt = paramInt1;
    System.arraycopy(paramArrayOfByte, i, this.yry, 0, paramInt1);
    this.yrE = util.J(paramArrayOfByte, i);
    this.yso = (paramInt1 - this.ysn);
    if (!ctj().booleanValue()) {
      return 64531;
    }
    return this.ysn + i + this.yso;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */