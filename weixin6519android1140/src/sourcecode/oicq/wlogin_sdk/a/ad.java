package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class ad
  extends a
{
  public int ysQ = 0;
  
  public ad()
  {
    this.yrE = 312;
  }
  
  public final Boolean ctj()
  {
    if (this.yso < 4) {
      return Boolean.valueOf(false);
    }
    this.ysQ = util.K(this.yry, this.ysn);
    if (this.yso < this.ysQ * 10 + 4) {
      return Boolean.valueOf(false);
    }
    return Boolean.valueOf(true);
  }
  
  public final int ctk()
  {
    int i = 0;
    for (;;)
    {
      if (i >= this.ysQ) {
        return 0;
      }
      if (util.J(this.yry, this.ysn + 4 + i * 10) == 266) {
        return util.K(this.yry, i * 10 + (this.ysn + 4) + 2);
      }
      i += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\a\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */