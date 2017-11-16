package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class ai
  extends a
{
  public int ysW = 0;
  public int ysX = 0;
  public int ysY = 0;
  
  public ai()
  {
    this.yrE = 326;
  }
  
  public final Boolean ctj()
  {
    if (this.yso < 12) {
      return Boolean.valueOf(false);
    }
    int i = util.J(this.yry, this.ysn + 4);
    if (this.yso < i + 12) {
      return Boolean.valueOf(false);
    }
    this.ysW = i;
    i = util.J(this.yry, this.ysn + 6 + this.ysW);
    if (this.yso < this.ysW + 12 + i) {
      return Boolean.valueOf(false);
    }
    this.ysX = i;
    i = util.J(this.yry, this.ysn + 10 + this.ysW + this.ysX);
    if (this.yso < this.ysW + 12 + this.ysX + i) {
      return Boolean.valueOf(false);
    }
    this.ysY = i;
    return Boolean.valueOf(true);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */