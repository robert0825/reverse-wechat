package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  public int gns;
  private int jfA;
  int jfB;
  int jfC;
  int jfD;
  public int jfE;
  public int jfy;
  public int jfz;
  
  public c()
  {
    GMTrace.i(14784753827840L, 110155);
    GMTrace.o(14784753827840L, 110155);
  }
  
  private void reset()
  {
    GMTrace.i(14784888045568L, 110156);
    this.jfy = 0;
    this.jfz = 0;
    this.gns = 0;
    this.jfA = 0;
    this.jfB = 0;
    this.jfC = 0;
    this.jfD = 0;
    this.jfE = 0;
    GMTrace.o(14784888045568L, 110156);
  }
  
  public final void BH()
  {
    GMTrace.i(14785022263296L, 110157);
    if (this.jfy == 0)
    {
      reset();
      GMTrace.o(14785022263296L, 110157);
      return;
    }
    String str = String.format("%d,%d,%d,%d,%d,%d,%d,%d", new Object[] { Integer.valueOf(this.jfy), Integer.valueOf(this.jfz), Integer.valueOf(this.gns), Integer.valueOf(this.jfA), Integer.valueOf(this.jfB), Integer.valueOf(this.jfC), Integer.valueOf(this.jfD), Integer.valueOf(this.jfE) });
    w.i("MicroMsg.BakPCReportor", "report: %s", new Object[] { str });
    g.ork.A(11103, str);
    reset();
    GMTrace.o(14785022263296L, 110157);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldpcmodel\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */