package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;

public final class b
  extends a
{
  private long mmb;
  public long mmc;
  public long mmd;
  public long mme;
  public long mmf;
  
  public b()
  {
    GMTrace.i(11603391021056L, 86452);
    this.mmd = 0L;
    this.mme = 0L;
    this.mmf = 0L;
    GMTrace.o(11603391021056L, 86452);
  }
  
  protected final void aIS()
  {
    GMTrace.i(11603793674240L, 86455);
    g.ork.i(12930, new Object[] { Long.valueOf(this.mmb), Long.valueOf(this.mmc), Long.valueOf(this.mmd), Long.valueOf(this.mme), Long.valueOf(this.mmf) });
    GMTrace.o(11603793674240L, 86455);
  }
  
  public final void reset()
  {
    GMTrace.i(11603659456512L, 86454);
    this.mmb = 0L;
    this.mmc = 0L;
    this.mmd = 0L;
    this.mme = 0L;
    this.mmf = 0L;
    GMTrace.o(11603659456512L, 86454);
  }
  
  public final void start()
  {
    GMTrace.i(11603525238784L, 86453);
    super.start();
    this.mmb = System.currentTimeMillis();
    GMTrace.o(11603525238784L, 86453);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */