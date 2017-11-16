package com.tencent.mm.plugin.appbrand.g;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.bv.a;
import com.tencent.mm.plugin.appbrand.n.d;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.CountDownLatch;

public final class c
{
  public static <T extends azh> a.a<T> c(b paramb)
  {
    GMTrace.i(10553405734912L, 78629);
    if (paramb == null)
    {
      GMTrace.o(10553405734912L, 78629);
      return null;
    }
    d locald = new d();
    final CountDownLatch localCountDownLatch = new CountDownLatch(1);
    u.a(paramb, new u.a()
    {
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, k paramAnonymousk)
      {
        GMTrace.i(10555553218560L, 78645);
        this.hUA.iGp = a.a.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, (azh)paramAnonymousb.gtD.gtK, paramAnonymousk, null);
        localCountDownLatch.countDown();
        GMTrace.o(10555553218560L, 78645);
        return 0;
      }
    });
    new aj(a.bVB().getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(10553674170368L, 78631);
        this.hUA.iGp = new c.a();
        localCountDownLatch.countDown();
        GMTrace.o(10553674170368L, 78631);
        return false;
      }
    }, false).z(20000L, 20000L);
    try
    {
      localCountDownLatch.await();
      paramb = (a.a)locald.iGp;
      GMTrace.o(10553405734912L, 78629);
      return paramb;
    }
    catch (InterruptedException paramb)
    {
      w.printErrStackTrace("MicroMsg.SynchronousCgiCall", paramb, "latch await exp ", new Object[0]);
      GMTrace.o(10553405734912L, 78629);
    }
    return null;
  }
  
  public static final class a<T extends azh>
    extends a.a<T>
  {
    public a()
    {
      GMTrace.i(10554613694464L, 78638);
      this.errType = 3;
      this.errCode = -13;
      GMTrace.o(10554613694464L, 78638);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\g\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */