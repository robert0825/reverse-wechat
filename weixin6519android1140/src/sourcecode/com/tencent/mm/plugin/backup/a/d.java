package com.tencent.mm.plugin.backup.a;

import com.tencent.gmtrace.GMTrace;

public final class d
  implements Cloneable, Comparable<d>
{
  public String iVh;
  public long iVi;
  public long iVj;
  public long iVk;
  public long iVl;
  
  public d()
  {
    GMTrace.i(14722745237504L, 109693);
    this.iVi = 0L;
    this.iVj = 0L;
    this.iVk = -1L;
    this.iVl = -1L;
    GMTrace.o(14722745237504L, 109693);
  }
  
  public final d aeh()
  {
    GMTrace.i(18450508414976L, 137467);
    d locald = new d();
    locald.iVh = this.iVh;
    locald.iVi = this.iVi;
    locald.iVj = this.iVj;
    locald.iVk = this.iVk;
    locald.iVl = this.iVl;
    GMTrace.o(18450508414976L, 137467);
    return locald;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */