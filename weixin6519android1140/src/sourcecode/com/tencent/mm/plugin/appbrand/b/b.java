package com.tencent.mm.plugin.appbrand.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Set;

public final class b
{
  public final String TAG;
  public final c hKO;
  public final android.support.v4.e.a<a, b> hKP;
  public final com.tencent.mm.plugin.appbrand.o.e hKQ;
  private final com.tencent.mm.plugin.appbrand.e hzM;
  
  public b(com.tencent.mm.plugin.appbrand.e parame)
  {
    GMTrace.i(18879065620480L, 140660);
    this.hKP = new android.support.v4.e.a();
    this.hKQ = new com.tencent.mm.plugin.appbrand.o.e()
    {
      public final void onTrimMemory(int paramAnonymousInt)
      {
        GMTrace.i(18872086298624L, 140608);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(18872086298624L, 140608);
          return;
          if ((b.this.hKO.Tc() == a.hKL) && (d.tJF))
          {
            w.i(b.this.TAG, "onTrimMemory level %d, finishRuntime", new Object[] { Integer.valueOf(paramAnonymousInt) });
            b.this.SZ();
          }
        }
      }
    };
    this.TAG = String.format("MicroMsg.AppBrand.AppRunningStateController[%s]", new Object[] { parame.hyD });
    this.hzM = parame;
    this.hKO = new c(parame)
    {
      final void Tb()
      {
        GMTrace.i(18879468273664L, 140663);
        b.this.SZ();
        GMTrace.o(18879468273664L, 140663);
      }
      
      final void b(a paramAnonymousa)
      {
        GMTrace.i(18879602491392L, 140664);
        Object localObject = b.this;
        synchronized (((b)localObject).hKP)
        {
          b.a[] arrayOfa = new b.a[((b)localObject).hKP.size()];
          localObject = (b.a[])((b)localObject).hKP.keySet().toArray(arrayOfa);
          int j = localObject.length;
          int i = 0;
          if (i < j)
          {
            localObject[i].a(paramAnonymousa);
            i += 1;
          }
        }
        GMTrace.o(18879602491392L, 140664);
      }
    };
    GMTrace.o(18879065620480L, 140660);
  }
  
  public final void SZ()
  {
    GMTrace.i(18878931402752L, 140659);
    if (!this.hzM.mFinished) {
      this.hzM.finish();
    }
    GMTrace.o(18878931402752L, 140659);
  }
  
  public final boolean Ta()
  {
    GMTrace.i(20767777488896L, 154732);
    switch (3.hKS[this.hKO.Tc().ordinal()])
    {
    default: 
      GMTrace.o(20767777488896L, 154732);
      return false;
    }
    GMTrace.o(20767777488896L, 154732);
    return true;
  }
  
  public final void a(a parama)
  {
    GMTrace.i(18879199838208L, 140661);
    if ((parama == null) || (a.hKM == this.hKO.Tc()))
    {
      GMTrace.o(18879199838208L, 140661);
      return;
    }
    synchronized (this.hKP)
    {
      this.hKP.put(parama, this);
      GMTrace.o(18879199838208L, 140661);
      return;
    }
  }
  
  public final void b(a parama)
  {
    GMTrace.i(20767643271168L, 154731);
    if ((parama == null) || (a.hKM == this.hKO.Tc()))
    {
      GMTrace.o(20767643271168L, 154731);
      return;
    }
    synchronized (this.hKP)
    {
      this.hKP.remove(parama);
      GMTrace.o(20767643271168L, 154731);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(a parama);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */