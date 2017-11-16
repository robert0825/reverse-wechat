package com.tencent.mm.plugin.soter_mp.b;

import com.tencent.gmtrace.GMTrace;

public final class e
{
  public String eAR;
  public String eTd;
  public int errCode;
  public byte qqh;
  public String qqi;
  
  public e()
  {
    GMTrace.i(7071797870592L, 52689);
    this.errCode = 0;
    this.eAR = "OK";
    this.qqh = 1;
    this.eTd = "";
    this.qqi = "";
    GMTrace.o(7071797870592L, 52689);
  }
  
  public final String toString()
  {
    GMTrace.i(7071932088320L, 52690);
    String str = "SoterMpRespModel{errCode=" + this.errCode + ", errMsg='" + this.eAR + '\'' + ", resultMode=" + this.qqh + ", resultJson='" + this.eTd + '\'' + ", resultJsonSignature='" + this.qqi + '\'' + '}';
    GMTrace.o(7071932088320L, 52690);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\soter_mp\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */