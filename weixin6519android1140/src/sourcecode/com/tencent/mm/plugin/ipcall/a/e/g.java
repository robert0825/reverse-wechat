package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.gmtrace.GMTrace;

public final class g
  extends a
{
  private long mmb;
  public long mmc;
  public long mmq;
  public String mmr;
  public String mms;
  public long mmt;
  public long mmu;
  public long mmv;
  public String mmw;
  
  public g()
  {
    GMTrace.i(11602854150144L, 86448);
    this.mmq = 0L;
    this.mmr = "";
    this.mms = "";
    this.mmt = 0L;
    this.mmu = 0L;
    this.mmv = 0L;
    this.mmw = "";
    GMTrace.o(11602854150144L, 86448);
  }
  
  protected final void aIS()
  {
    GMTrace.i(11603256803328L, 86451);
    com.tencent.mm.plugin.report.service.g.ork.i(12933, new Object[] { Long.valueOf(this.mmb), Long.valueOf(this.mmc), Long.valueOf(this.mmq), this.mmr, this.mms, Long.valueOf(this.mmt), Long.valueOf(this.mmu), Long.valueOf(this.mmv), this.mmw });
    GMTrace.o(11603256803328L, 86451);
  }
  
  public final void reset()
  {
    GMTrace.i(11603122585600L, 86450);
    this.mmb = 0L;
    this.mmc = 0L;
    this.mmq = 0L;
    this.mmr = "";
    this.mms = "";
    this.mmt = 0L;
    this.mmu = 0L;
    this.mmv = 0L;
    this.mmw = "";
    GMTrace.o(11603122585600L, 86450);
  }
  
  public final void start()
  {
    GMTrace.i(11602988367872L, 86449);
    super.start();
    this.mmb = System.currentTimeMillis();
    GMTrace.o(11602988367872L, 86449);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\e\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */