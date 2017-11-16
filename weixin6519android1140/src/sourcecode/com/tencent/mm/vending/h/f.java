package com.tencent.mm.vending.h;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.vending.c.a;

public final class f
{
  private volatile d xxT;
  public volatile a xye;
  
  public f(d paramd, a parama)
  {
    GMTrace.i(293936824320L, 2190);
    b(paramd);
    this.xye = parama;
    GMTrace.o(293936824320L, 2190);
  }
  
  private void a(final a parama, final Object paramObject, long paramLong, boolean paramBoolean)
  {
    label186:
    label207:
    for (;;)
    {
      d locald;
      try
      {
        GMTrace.i(294339477504L, 2193);
        locald = this.xxT;
        if (!(parama instanceof e)) {
          break label207;
        }
        e locale = (e)parama;
        if ("Vending.ANY".equals(locale.PJ())) {
          break label207;
        }
        locald = g.Xn(locale.PJ());
        if (locald == null)
        {
          if (this.xye != null) {
            this.xye.interrupt();
          }
          GMTrace.o(294339477504L, 2193);
          return;
        }
        parama = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(293399953408L, 2186);
            if (f.this.xye != null) {
              f.this.xye.ckm();
            }
            try
            {
              Object localObject = parama.call(paramObject);
              if (f.this.xye != null) {
                f.this.xye.bX(localObject);
              }
              GMTrace.o(293399953408L, 2186);
              return;
            }
            catch (ClassCastException localClassCastException)
            {
              this.xyq.initCause(localClassCastException);
              throw this.xyq;
            }
          }
        };
        if (-1L >= 0L) {
          break label186;
        }
        if ((paramBoolean) && (g.ckr() == locald))
        {
          parama.run();
          GMTrace.o(294339477504L, 2193);
          continue;
        }
        locald.D(parama);
      }
      finally {}
      GMTrace.o(294339477504L, 2193);
      continue;
      locald.g(parama, -1L);
      GMTrace.o(294339477504L, 2193);
    }
  }
  
  private void c(d paramd)
  {
    try
    {
      GMTrace.i(294205259776L, 2192);
      this.xxT = paramd;
      GMTrace.o(294205259776L, 2192);
      return;
    }
    finally
    {
      paramd = finally;
      throw paramd;
    }
  }
  
  public final void a(a parama, Object paramObject, boolean paramBoolean)
  {
    GMTrace.i(294473695232L, 2194);
    a(parama, paramObject, -1L, paramBoolean);
    GMTrace.o(294473695232L, 2194);
  }
  
  public final void b(d paramd)
  {
    try
    {
      GMTrace.i(294071042048L, 2191);
      c(paramd);
      GMTrace.o(294071042048L, 2191);
      return;
    }
    finally
    {
      paramd = finally;
      throw paramd;
    }
  }
  
  public static abstract interface a
  {
    public abstract void bX(Object paramObject);
    
    public abstract void ckm();
    
    public abstract void interrupt();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\vending\h\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */