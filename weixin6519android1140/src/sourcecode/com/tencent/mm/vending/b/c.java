package com.tencent.mm.vending.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.vending.h.d;
import com.tencent.mm.vending.h.f;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class c<_Callback>
  extends a<_Callback>
{
  public c()
  {
    GMTrace.i(273938382848L, 2041);
    GMTrace.o(273938382848L, 2041);
  }
  
  public c(d paramd)
  {
    super(paramd);
    GMTrace.i(274072600576L, 2042);
    GMTrace.o(274072600576L, 2042);
  }
  
  public final void a(final com.tencent.mm.vending.j.a parama)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(274475253760L, 2045);
        Iterator localIterator = ckd().iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        final b localb = (b)localIterator.next();
        if (localb != null) {
          if (localb.esx != null)
          {
            this.xxC.b(localb.esx);
            this.xxC.a(new com.tencent.mm.vending.c.a() {}, com.tencent.mm.vending.c.a.xxJ, true);
          }
          else
          {
            this.xxC.b(d.ckr());
          }
        }
      }
      finally {}
    }
    GMTrace.o(274475253760L, 2045);
  }
  
  public abstract void a(_Callback param_Callback, com.tencent.mm.vending.j.a parama);
  
  public final b<_Callback> bT(_Callback param_Callback)
  {
    GMTrace.i(274609471488L, 2046);
    param_Callback = a(new b(param_Callback, this));
    GMTrace.o(274609471488L, 2046);
    return param_Callback;
  }
  
  public final void cke()
  {
    try
    {
      GMTrace.i(274341036032L, 2044);
      a(null);
      GMTrace.o(274341036032L, 2044);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\vending\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */