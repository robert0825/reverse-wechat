package com.tencent.mm.plugin.backup.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.plugin.backup.g.a;
import com.tencent.mm.plugin.backup.g.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class d
{
  long goZ;
  private long iWI;
  boolean iWJ;
  
  public d()
  {
    GMTrace.i(14730127212544L, 109748);
    this.iWI = -1L;
    this.goZ = 0L;
    this.iWJ = false;
    GMTrace.o(14730127212544L, 109748);
  }
  
  public final void begin()
  {
    GMTrace.i(14730261430272L, 109749);
    w.d("MicroMsg.BackupRecoverFaster", "begin");
    if (a.afG().afH().fYV != null)
    {
      this.iWI = a.afG().afH().fYV.cE(Thread.currentThread().getId());
      this.iWJ = true;
    }
    this.goZ = bg.Pv();
    GMTrace.o(14730261430272L, 109749);
  }
  
  public final void end()
  {
    GMTrace.i(14730395648000L, 109750);
    if ((this.iWJ) && (a.afG().afH().fYV != null))
    {
      a.afG().afH().fYV.aL(this.iWI);
      this.iWJ = false;
    }
    GMTrace.o(14730395648000L, 109750);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */