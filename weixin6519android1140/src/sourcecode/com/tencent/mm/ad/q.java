package com.tencent.mm.ad;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.l.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class q
  extends l.a
{
  private final k eEg;
  private final com.tencent.mm.network.e gtW;
  private final long guK;
  private com.tencent.mm.network.q guL;
  private com.tencent.mm.network.k guM;
  private boolean guN;
  private boolean guO;
  Runnable guP;
  private final e gub;
  final ae handler;
  
  public q(com.tencent.mm.network.q paramq, com.tencent.mm.network.k paramk, k paramk1, e parame, com.tencent.mm.network.e parame1)
  {
    GMTrace.i(13404190277632L, 99869);
    this.guK = 330000L;
    this.guN = false;
    this.guO = false;
    this.guP = new Runnable()
    {
      public final void run()
      {
        int k = 0;
        int j = 0;
        GMTrace.i(13399895310336L, 99837);
        int i;
        if ((q.a(q.this)) || (q.b(q.this)))
        {
          if (q.c(q.this) == null)
          {
            i = 0;
            if (q.c(q.this) != null) {
              break label102;
            }
          }
          for (;;)
          {
            w.e("MicroMsg.RemoteOnGYNetEnd", "time exceed But removeCallbacks failed hash:%d type:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            GMTrace.o(13399895310336L, 99837);
            return;
            i = q.c(q.this).hashCode();
            break;
            label102:
            j = q.c(q.this).getType();
          }
        }
        final boolean bool1 = q.a(q.this);
        final boolean bool2 = q.b(q.this);
        if (q.c(q.this) == null)
        {
          i = 0;
          if (q.c(q.this) != null) {
            break label256;
          }
        }
        label256:
        for (j = k;; j = q.c(q.this).getType())
        {
          w.w("MicroMsg.RemoteOnGYNetEnd", "time exceed, force to callback hash:%d type:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          q.d(q.this);
          com.tencent.mm.sdk.f.e.post(new Runnable()
          {
            public final void run()
            {
              int j = 0;
              GMTrace.i(13399626874880L, 99835);
              q.e(q.this).ik("push process's network haven't callback in 5.5min!!!! cancelStatus:" + bool1 + " hasCallbackStatus:" + bool2);
              int i;
              if (q.c(q.this) == null)
              {
                i = 0;
                if (q.c(q.this) != null) {
                  break label135;
                }
              }
              for (;;)
              {
                w.w("MicroMsg.RemoteOnGYNetEnd", "time exceed, force to callback . kill push fin. hash:%d type:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
                GMTrace.o(13399626874880L, 99835);
                return;
                i = q.c(q.this).hashCode();
                break;
                label135:
                j = q.c(q.this).getType();
              }
            }
          }, "RemoteOnGYNetEnd_killPush");
          q.g(q.this).a(-1, 3, -1, "time exceed, force to callback", q.f(q.this), null);
          GMTrace.o(13399895310336L, 99837);
          return;
          i = q.c(q.this).hashCode();
          break;
        }
      }
    };
    this.guL = paramq;
    this.guM = paramk;
    this.eEg = paramk1;
    this.gub = parame;
    if (Looper.myLooper() == null) {}
    for (paramq = new ae(Looper.getMainLooper());; paramq = new ae())
    {
      this.handler = paramq;
      this.gtW = parame1;
      GMTrace.o(13404190277632L, 99869);
      return;
    }
  }
  
  public final void a(final int paramInt1, final int paramInt2, final int paramInt3, final String paramString, com.tencent.mm.network.r paramr, final byte[] paramArrayOfByte)
  {
    GMTrace.i(13404458713088L, 99871);
    w.i("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd netId:%d, errType:%d, errCode:%d, isCancel:%b, hash[%d,%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Boolean.valueOf(this.guN), Integer.valueOf(this.eEg.hashCode()), Integer.valueOf(this.guL.hashCode()) });
    this.eEg.gtY = -1;
    if (this.guN)
    {
      GMTrace.o(13404458713088L, 99871);
      return;
    }
    if (!this.guO)
    {
      this.guO = true;
      this.handler.removeCallbacks(this.guP);
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(13424054501376L, 100017);
          if (q.a(q.this))
          {
            w.w("MicroMsg.RemoteOnGYNetEnd", "netId:%d has been canceled", new Object[] { Integer.valueOf(paramInt1) });
            GMTrace.o(13424054501376L, 100017);
            return;
          }
          int k = paramInt2;
          int m = paramInt3;
          int i = k;
          int j = m;
          if (10016 == com.tencent.mm.platformtools.r.hkj)
          {
            i = k;
            j = m;
            if (!bg.nm(com.tencent.mm.platformtools.r.hkl))
            {
              w.i("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd DK TEST SET : %s ", new Object[] { com.tencent.mm.platformtools.r.hkl });
              String[] arrayOfString = com.tencent.mm.platformtools.r.hkl.split(",");
              i = k;
              j = m;
              if (arrayOfString != null)
              {
                i = k;
                j = m;
                if (arrayOfString.length == 3)
                {
                  i = k;
                  j = m;
                  if (bg.getInt(arrayOfString[0], -1) == q.c(q.this).getType())
                  {
                    k = bg.getInt(arrayOfString[1], 0);
                    j = bg.getInt(arrayOfString[2], 0);
                    i = k;
                    if (k == 999)
                    {
                      w.w("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd DK TEST SET syncservice : %s  NOT  CALLBACK !!!", new Object[] { com.tencent.mm.platformtools.r.hkl });
                      GMTrace.o(13424054501376L, 100017);
                      return;
                    }
                  }
                }
              }
            }
          }
          w.i("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd after post to worker netId:%d, errType:%d, errCode:%d, isCancel:%b, hashcode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(q.a(q.this)), Integer.valueOf(q.c(q.this).hashCode()) });
          q.g(q.this).a(paramInt1, i, j, paramString, q.f(q.this), paramArrayOfByte);
          if ((q.c(q.this).DH()) && (!q.c(q.this).guc))
          {
            w.e("MicroMsg.RemoteOnGYNetEnd", "the netscene hasn't call callback to onSceneEnd, type:%d", new Object[] { Integer.valueOf(q.c(q.this).getType()) });
            w.bPM();
          }
          GMTrace.o(13424054501376L, 100017);
        }
      });
      GMTrace.o(13404458713088L, 99871);
      return;
    }
    GMTrace.o(13404458713088L, 99871);
  }
  
  public final void cancel()
  {
    GMTrace.i(13404324495360L, 99870);
    this.guN = true;
    this.handler.removeCallbacks(this.guP);
    GMTrace.o(13404324495360L, 99870);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ad\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */