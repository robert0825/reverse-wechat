package com.tencent.mm.plugin.fps_lighter.c;

import com.tencent.gmtrace.GMTrace;

public final class a
{
  public long lnk;
  public long lnl;
  public boolean lnm;
  public int lnn;
  public int lno;
  public int lnp;
  public long lnq;
  public boolean lnr;
  public int scene;
  
  public a()
  {
    GMTrace.i(5219190571008L, 38886);
    GMTrace.o(5219190571008L, 38886);
  }
  
  public final long aAm()
  {
    GMTrace.i(5219324788736L, 38887);
    long l1 = this.lnk;
    long l2 = this.lnl;
    GMTrace.o(5219324788736L, 38887);
    return l1 - l2;
  }
  
  public final String toString()
  {
    GMTrace.i(5219459006464L, 38888);
    Object localObject = new StringBuilder(16);
    ((StringBuilder)localObject).append("\t");
    ((StringBuilder)localObject).append(this.scene);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(this.lnl);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(this.lnk);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(this.lnm);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(this.lnn);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(this.lno);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(this.lnp);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(this.lnq);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(this.lnr);
    ((StringBuilder)localObject).append("\n");
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(5219459006464L, 38888);
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fps_lighter\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */