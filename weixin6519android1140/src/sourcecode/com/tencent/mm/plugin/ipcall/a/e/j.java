package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;

public final class j
  extends a
{
  public long mmB;
  public long mmC;
  public long mmD;
  private long mmb;
  public long mmc;
  
  public j()
  {
    GMTrace.i(11601109319680L, 86435);
    this.mmB = 0L;
    this.mmC = 0L;
    this.mmD = 0L;
    GMTrace.o(11601109319680L, 86435);
  }
  
  protected final void aIS()
  {
    GMTrace.i(11601511972864L, 86438);
    g.ork.i(12934, new Object[] { Long.valueOf(this.mmb), Long.valueOf(this.mmc), Long.valueOf(this.mmB), Long.valueOf(this.mmC), Long.valueOf(this.mmD) });
    GMTrace.o(11601511972864L, 86438);
  }
  
  public final void reset()
  {
    GMTrace.i(11601377755136L, 86437);
    this.mmb = 0L;
    this.mmc = 0L;
    this.mmB = 0L;
    this.mmC = 0L;
    this.mmD = 0L;
    GMTrace.o(11601377755136L, 86437);
  }
  
  public final void start()
  {
    GMTrace.i(11601243537408L, 86436);
    super.start();
    this.mmb = System.currentTimeMillis();
    GMTrace.o(11601243537408L, 86436);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\e\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */