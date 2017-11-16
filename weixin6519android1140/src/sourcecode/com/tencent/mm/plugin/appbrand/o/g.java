package com.tencent.mm.plugin.appbrand.o;

import com.tencent.gmtrace.GMTrace;

public final class g
{
  private long iGB;
  private long iGC;
  private a iGD;
  
  public g()
  {
    GMTrace.i(10009555501056L, 74577);
    GMTrace.o(10009555501056L, 74577);
  }
  
  public g(long paramLong, a parama)
  {
    GMTrace.i(10009689718784L, 74578);
    this.iGB = paramLong;
    this.iGD = parama;
    GMTrace.o(10009689718784L, 74578);
  }
  
  public final boolean h(Object... paramVarArgs)
  {
    GMTrace.i(10009823936512L, 74579);
    if (System.currentTimeMillis() - this.iGC < this.iGB) {}
    for (int i = 1; i != 0; i = 0)
    {
      GMTrace.o(10009823936512L, 74579);
      return false;
    }
    if (this.iGD == null)
    {
      GMTrace.o(10009823936512L, 74579);
      return false;
    }
    boolean bool = this.iGD.f(paramVarArgs);
    if (bool) {
      this.iGC = System.currentTimeMillis();
    }
    GMTrace.o(10009823936512L, 74579);
    return bool;
  }
  
  public static abstract interface a
  {
    public abstract boolean f(Object... paramVarArgs);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\o\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */