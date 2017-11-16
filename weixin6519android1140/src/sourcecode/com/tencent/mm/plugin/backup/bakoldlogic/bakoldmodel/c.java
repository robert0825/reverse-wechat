package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.plugin.backup.g.a;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  private long goZ;
  private long iWI;
  boolean iWJ;
  
  public c()
  {
    GMTrace.i(14732677349376L, 109767);
    this.iWI = -1L;
    this.goZ = 0L;
    this.iWJ = false;
    GMTrace.o(14732677349376L, 109767);
  }
  
  public final void afU()
  {
    GMTrace.i(14733080002560L, 109770);
    long l = System.currentTimeMillis();
    if (l - this.goZ > 10000L)
    {
      end();
      begin();
      this.goZ = l;
    }
    GMTrace.o(14733080002560L, 109770);
  }
  
  public final void begin()
  {
    GMTrace.i(14732811567104L, 109768);
    w.d("MicroMsg.Recoverfaster", "begin");
    if (a.afG().afH().fYV != null)
    {
      this.iWI = a.afG().afH().fYV.cE(Thread.currentThread().getId());
      this.iWJ = true;
    }
    this.goZ = System.currentTimeMillis();
    GMTrace.o(14732811567104L, 109768);
  }
  
  public final void end()
  {
    GMTrace.i(14732945784832L, 109769);
    if ((this.iWJ) && (a.afG().afH().fYV != null))
    {
      a.afG().afH().fYV.aL(this.iWI);
      this.iWJ = false;
    }
    GMTrace.o(14732945784832L, 109769);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldmodel\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */