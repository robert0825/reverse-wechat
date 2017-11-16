package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;

public final class h
  extends a
{
  public long mmA;
  private long mmb;
  public long mmc;
  private long mmx;
  public long mmy;
  public long mmz;
  
  public h()
  {
    GMTrace.i(11600438231040L, 86430);
    this.mmx = 0L;
    this.mmy = 0L;
    this.mmz = 0L;
    this.mmA = 0L;
    GMTrace.o(11600438231040L, 86430);
  }
  
  protected final void aIS()
  {
    GMTrace.i(11600840884224L, 86433);
    g.ork.i(12931, new Object[] { Long.valueOf(this.mmb), Long.valueOf(this.mmc), Long.valueOf(this.mmx), Long.valueOf(this.mmy), Long.valueOf(this.mmz), Long.valueOf(this.mmA) });
    GMTrace.o(11600840884224L, 86433);
  }
  
  public final void reset()
  {
    GMTrace.i(11600706666496L, 86432);
    this.mmb = 0L;
    this.mmc = 0L;
    this.mmx = 0L;
    this.mmy = 0L;
    this.mmz = 0L;
    this.mmA = 0L;
    GMTrace.o(11600706666496L, 86432);
  }
  
  public final void start()
  {
    GMTrace.i(11600572448768L, 86431);
    super.start();
    this.mmb = System.currentTimeMillis();
    GMTrace.o(11600572448768L, 86431);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\e\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */