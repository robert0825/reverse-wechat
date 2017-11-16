package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class z
  extends a
{
  public int ysM = 0;
  public int ysN = 0;
  
  public z()
  {
    this.yrE = 293;
  }
  
  public final Boolean ctj()
  {
    if (this.yso < 2) {
      return Boolean.valueOf(false);
    }
    this.ysM = util.J(this.yry, this.ysn);
    if (this.yso < this.ysM + 2 + 2) {
      return Boolean.valueOf(false);
    }
    this.ysN = util.J(this.yry, this.ysn + 2 + this.ysM);
    return Boolean.valueOf(true);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */