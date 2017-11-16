package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.network.c;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public byte[] glL;
  public long glM;
  
  public a()
  {
    GMTrace.i(13474788802560L, 100395);
    this.glM = -1L;
    if (yB()) {
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(13476667850752L, 100409);
          try
          {
            if (a.yB()) {
              d.oqe.a(226L, 1L, 1L, false);
            }
            GMTrace.o(13476667850752L, 100409);
            return;
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.AccInfoCacheInWorker", "init Exception:%s", new Object[] { bg.f(localException) });
            GMTrace.o(13476667850752L, 100409);
          }
        }
      }, 5000L);
    }
    GMTrace.o(13474788802560L, 100395);
  }
  
  public static boolean yB()
  {
    GMTrace.i(13474923020288L, 100396);
    if ((com.tencent.mm.kernel.a.wF()) || (!com.tencent.mm.kernel.h.xw().wL()))
    {
      GMTrace.o(13474923020288L, 100396);
      return false;
    }
    int i = bg.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("AndroidUseWorkerAuthCache"), 0);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw();
    int j = com.tencent.mm.a.h.aw(com.tencent.mm.kernel.a.ww(), 100);
    boolean bool = com.tencent.mm.sdk.a.b.bPq();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw();
    w.i("MicroMsg.AccInfoCacheInWorker", "checkUse debug:%s dyVal:%s uin:%d  uinHash:%d init:%b", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(com.tencent.mm.kernel.a.ww()), Integer.valueOf(j), Boolean.valueOf(com.tencent.mm.kernel.h.xw().wL()) });
    if (bool)
    {
      GMTrace.o(13474923020288L, 100396);
      return true;
    }
    if (i > j)
    {
      GMTrace.o(13474923020288L, 100396);
      return true;
    }
    GMTrace.o(13474923020288L, 100396);
    return false;
  }
  
  public static void yC()
  {
    GMTrace.i(13475057238016L, 100397);
    if (!yB())
    {
      GMTrace.o(13475057238016L, 100397);
      return;
    }
    long l2;
    try
    {
      com.tencent.mm.kernel.h.xz();
      a locala = com.tencent.mm.kernel.h.xw().fYa;
      com.tencent.mm.kernel.h.xz();
      localObject = com.tencent.mm.kernel.h.xx().fYr.gus.DY();
      l2 = bg.Pv();
      if (localObject == null)
      {
        w.e("MicroMsg.AccInfoCacheInWorker", "backupToWorker  accinfo == null");
        d.oqe.a(226L, 2L, 1L, false);
        GMTrace.o(13475057238016L, 100397);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      w.e("MicroMsg.AccInfoCacheInWorker", "tryBackupToWorker Exception:%s", new Object[] { bg.f(localThrowable) });
      GMTrace.o(13475057238016L, 100397);
      return;
    }
    w.i("MicroMsg.AccInfoCacheInWorker", "backupToWorker islogin:%b cache:%s", new Object[] { Boolean.valueOf(((c)localObject).DU()), Integer.valueOf(localThrowable.yA()) });
    if (!((c)localObject).DU())
    {
      d.oqe.a(226L, 3L, 1L, false);
      w.e("MicroMsg.AccInfoCacheInWorker", "backupToWorker ERR: Is Not Login");
      GMTrace.o(13475057238016L, 100397);
      return;
    }
    localThrowable.glL = ((c)localObject).DX();
    Object localObject = d.oqe;
    if (localThrowable.yA() > 0)
    {
      l1 = 4L;
      ((d)localObject).a(226L, l1, 1L, false);
      w.i("MicroMsg.AccInfoCacheInWorker", "backupToWorker time:%s cache:%s useCacheCount:%s ", new Object[] { Long.valueOf(bg.aH(l2)), Integer.valueOf(localThrowable.yA()), Long.valueOf(localThrowable.glM) });
      if (localThrowable.yA() > 0)
      {
        localObject = d.oqe;
        if (localThrowable.glM <= 5L) {
          break label383;
        }
      }
    }
    label383:
    for (long l1 = 5L;; l1 = localThrowable.glM)
    {
      ((d)localObject).a(226L, 31L - l1, 1L, false);
      d.oqe.i(11098, new Object[] { Integer.valueOf(2000), Long.valueOf(localThrowable.glM) });
      localThrowable.glM = -1L;
      GMTrace.o(13475057238016L, 100397);
      return;
      l1 = 5L;
      break;
    }
  }
  
  public final int yA()
  {
    GMTrace.i(13474654584832L, 100394);
    if (this.glL == null)
    {
      GMTrace.o(13474654584832L, 100394);
      return -1;
    }
    int i = this.glL.length;
    GMTrace.o(13474654584832L, 100394);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */