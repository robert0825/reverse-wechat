package com.tencent.mm.kernel.c;

import com.tencent.gmtrace.GMTrace;

public final class d<T extends a>
  implements b, c<T>
{
  private T gav;
  
  public d(T paramT)
  {
    GMTrace.i(13516798951424L, 100708);
    this.gav = paramT;
    GMTrace.o(13516798951424L, 100708);
  }
  
  public final void xF()
  {
    GMTrace.i(20321637761024L, 151408);
    if ((this.gav instanceof b)) {
      ((b)this.gav).xF();
    }
    GMTrace.o(20321637761024L, 151408);
  }
  
  public final void xG()
  {
    GMTrace.i(20321771978752L, 151409);
    if ((this.gav instanceof b)) {
      ((b)this.gav).xG();
    }
    GMTrace.o(20321771978752L, 151409);
  }
  
  public final T xH()
  {
    GMTrace.i(13516933169152L, 100709);
    a locala = this.gav;
    GMTrace.o(13516933169152L, 100709);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kernel\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */