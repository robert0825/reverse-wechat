package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.sdk.platformtools.w;

public final class g
{
  public String eUg;
  public String extra;
  public int fJC;
  public long fKc;
  public int gRK;
  public int pEM;
  public int pLF;
  public int pLG;
  public int pLH;
  public int pLI;
  public int pLJ;
  public int pLK;
  public int pLL;
  public int pLM;
  public int pLN;
  public int pLO;
  public String pLP;
  public String pLQ;
  public String pLR;
  public String pyc;
  public String pyf;
  
  public g()
  {
    GMTrace.i(8196676648960L, 61070);
    this.extra = "";
    GMTrace.o(8196676648960L, 61070);
  }
  
  public final String blx()
  {
    GMTrace.i(8196810866688L, 61071);
    long l1 = 0L;
    try
    {
      long l2 = i.Hb(this.eUg);
      l1 = l2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        StringBuilder localStringBuilder;
        String str1;
        w.e("AdLandingPagesReportInfo", "", new Object[] { localException });
        continue;
        String str2 = this.pyf;
      }
    }
    localStringBuilder = new StringBuilder().append(i.dt(l1)).append(",").append(this.pyc).append(",").append(this.pLF).append(",").append(this.fJC).append(",").append(this.pLG).append(",").append(this.pLH).append(",").append(this.pLI).append(",").append(this.pLJ).append(",").append(this.pLK).append(",").append(this.pLL).append(",").append(this.pLM).append(",").append(this.pLN).append(",").append(this.pLO).append(",").append(this.gRK).append(",").append(this.pLP).append(",").append(this.fKc).append(",").append(this.pLQ).append(",");
    if (this.pyf == null)
    {
      str1 = "";
      str1 = str1 + "," + this.extra + "," + this.pEM + "," + this.pLR;
      GMTrace.o(8196810866688L, 61071);
      return str1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */