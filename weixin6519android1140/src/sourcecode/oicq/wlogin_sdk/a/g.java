package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class g
  extends a
{
  public int ysA = 0;
  public int ysB = 0;
  public int ysy = 0;
  public int ysz = 0;
  
  public g()
  {
    this.yrE = 261;
  }
  
  public final Boolean ctj()
  {
    if (this.yso < 2) {
      return Boolean.valueOf(false);
    }
    this.ysz = util.J(this.yry, this.ysn);
    if (this.yso < this.ysz + 2 + 2) {
      return Boolean.valueOf(false);
    }
    this.ysy = util.J(this.yry, this.ysn + 2 + this.ysz);
    if (this.yso < this.ysz + 2 + 2 + this.ysy) {
      return Boolean.valueOf(false);
    }
    this.ysB = (this.ysn + 2);
    this.ysA = (this.ysz + 2 + 2 + this.ysn);
    return Boolean.valueOf(true);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */