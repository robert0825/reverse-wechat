package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class ab
  extends a
{
  public int ysP = 0;
  
  public ab()
  {
    this.yrE = 306;
  }
  
  public final Boolean ctj()
  {
    if (this.yso < 2) {
      return Boolean.valueOf(false);
    }
    this.ysP = util.J(this.yry, this.ysn);
    if (this.ysP + 2 > this.yso) {
      return Boolean.valueOf(false);
    }
    return Boolean.valueOf(true);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */