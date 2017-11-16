package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class t
  extends a
{
  public int ysK = 0;
  
  public t()
  {
    this.yrE = 282;
  }
  
  public final Boolean ctj()
  {
    if (this.yso < 5) {
      return Boolean.valueOf(false);
    }
    int i = util.I(this.yry, this.ysn + 2 + 1 + 1);
    if (this.yso < i + 5) {
      return Boolean.valueOf(false);
    }
    this.ysK = i;
    return Boolean.valueOf(true);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */