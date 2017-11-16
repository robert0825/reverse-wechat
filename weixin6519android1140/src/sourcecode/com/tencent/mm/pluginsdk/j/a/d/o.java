package com.tencent.mm.pluginsdk.j.a.d;

import android.os.Looper;
import android.os.Process;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public final class o
{
  private volatile af gut;
  public final ae handler;
  public final boolean rFD;
  public final r tru;
  public final m trv;
  public final i trw;
  
  public o()
  {
    GMTrace.i(877381287936L, 6537);
    this.gut = null;
    p.init();
    this.tru = r.bKr();
    if (this.tru == null)
    {
      this.rFD = false;
      this.trv = null;
      this.handler = null;
      this.trw = null;
      GMTrace.o(877381287936L, 6537);
      return;
    }
    this.rFD = true;
    t localt = new t();
    this.handler = new ae(Looper.getMainLooper());
    this.trw = new i(xB().bQi());
    this.trv = new m(localt, this.trw);
    GMTrace.o(877381287936L, 6537);
  }
  
  static m.a c(k paramk)
  {
    GMTrace.i(877918158848L, 6541);
    w.d("MicroMsg.ResDownloaderCore", "getNetworkRequestHandler");
    int i = paramk.SM().hashCode();
    Iterator localIterator = p.bKq().iterator();
    while (localIterator.hasNext())
    {
      g localg = (g)localIterator.next();
      w.i("MicroMsg.ResDownloaderCore", "plugin = %s, groupId = %s", new Object[] { localg.getClass().getSimpleName(), localg.SM() });
      if (localg.SM().hashCode() == i)
      {
        paramk = localg.c(paramk);
        GMTrace.o(877918158848L, 6541);
        return paramk;
      }
    }
    GMTrace.o(877918158848L, 6541);
    return null;
  }
  
  public final q OO(String paramString)
  {
    GMTrace.i(878186594304L, 6543);
    if (this.rFD)
    {
      long l = bg.Pv();
      q localq = this.tru.OO(paramString);
      if (localq == null) {}
      for (paramString = "null";; paramString = localq.field_urlKey)
      {
        w.i("MicroMsg.ResDownloaderCore", "doQuery: urlKey = %s, cost = %d", new Object[] { paramString, Long.valueOf(bg.aH(l)) });
        GMTrace.o(878186594304L, 6543);
        return localq;
      }
    }
    GMTrace.o(878186594304L, 6543);
    return null;
  }
  
  public final boolean OP(String paramString)
  {
    GMTrace.i(878455029760L, 6545);
    if (this.rFD)
    {
      if ((this.trv.isDownloading(paramString)) || (this.trv.OM(paramString)))
      {
        GMTrace.o(878455029760L, 6545);
        return true;
      }
      GMTrace.o(878455029760L, 6545);
      return false;
    }
    GMTrace.o(878455029760L, 6545);
    return false;
  }
  
  public final void OQ(String paramString)
  {
    GMTrace.i(878589247488L, 6546);
    if (this.rFD)
    {
      m localm = this.trv;
      Future localFuture = (Future)localm.tra.remove(paramString);
      if (localFuture != null) {
        localFuture.cancel(true);
      }
      localm.tqZ.remove(paramString);
    }
    GMTrace.o(878589247488L, 6546);
  }
  
  public final void a(String paramString, d paramd)
  {
    GMTrace.i(877783941120L, 6540);
    w.d("MicroMsg.ResDownloaderCore", "addNetworkEventLister, groupId = %s, listener = %s", new Object[] { paramString, paramd });
    if (this.rFD)
    {
      i locali = this.trw;
      w.d("MicroMsg.ResDownloader.NetworkEventDispatcher", "addNetworkEventListener, listener = " + paramd);
      if (paramd == null)
      {
        GMTrace.o(877783941120L, 6540);
        return;
      }
      int i = paramString.hashCode();
      synchronized (locali.trf)
      {
        List localList = (List)locali.tre.get(i);
        paramString = localList;
        if (localList == null) {
          paramString = new LinkedList();
        }
        paramString.add(paramd);
        locali.tre.put(i, paramString);
        GMTrace.o(877783941120L, 6540);
        return;
      }
    }
    GMTrace.o(877783941120L, 6540);
  }
  
  public final int d(k paramk)
  {
    GMTrace.i(878320812032L, 6544);
    if (this.rFD)
    {
      if (bg.nm(paramk.url))
      {
        w.i("MicroMsg.ResDownloaderCore", "request#%s with null url, ignore", new Object[] { paramk.tpD });
        GMTrace.o(878320812032L, 6544);
        return 3;
      }
      w.i("MicroMsg.ResDownloaderCore", "request#%s post to network worker", new Object[] { paramk.tpD });
      int i = this.trv.b(paramk);
      GMTrace.o(878320812032L, 6544);
      return i;
    }
    GMTrace.o(878320812032L, 6544);
    return -1;
  }
  
  public final void e(q paramq)
  {
    GMTrace.i(878052376576L, 6542);
    long l;
    if (this.rFD)
    {
      l = bg.Pv();
      if (this.tru.OO(paramq.field_urlKey) == null) {
        break label90;
      }
      w.i("MicroMsg.ResDownloaderCore", "doUpdate: update existing record");
      this.tru.f(paramq);
    }
    for (;;)
    {
      w.i("MicroMsg.ResDownloaderCore", "doUpdate: urlKey = %s, cost = %d", new Object[] { paramq.field_urlKey, Long.valueOf(bg.aH(l)) });
      GMTrace.o(878052376576L, 6542);
      return;
      label90:
      w.i("MicroMsg.ResDownloaderCore", "doUpdate: insert new record");
      this.tru.g(paramq);
    }
  }
  
  public final void v(Runnable paramRunnable)
  {
    GMTrace.i(877515505664L, 6538);
    xB().A(new b(paramRunnable));
    GMTrace.o(877515505664L, 6538);
  }
  
  final af xB()
  {
    GMTrace.i(877649723392L, 6539);
    if (this.gut == null) {
      this.gut = new af("ResDownloader-WorkerThread");
    }
    af localaf = this.gut;
    GMTrace.o(877649723392L, 6539);
    return localaf;
  }
  
  private static final class a
  {
    public static final o trx;
    
    static
    {
      GMTrace.i(878991900672L, 6549);
      trx = new o();
      GMTrace.o(878991900672L, 6549);
    }
  }
  
  private static final class b
    implements Runnable
  {
    private final Runnable hdZ;
    
    public b(Runnable paramRunnable)
    {
      GMTrace.i(871744143360L, 6495);
      this.hdZ = paramRunnable;
      GMTrace.o(871744143360L, 6495);
    }
    
    public final void run()
    {
      GMTrace.i(871878361088L, 6496);
      if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {}
      for (int i = 1;; i = 0)
      {
        if ((i == 0) && (Process.getThreadPriority(Process.myTid()) != 10)) {
          Process.setThreadPriority(10);
        }
        if (this.hdZ != null) {
          this.hdZ.run();
        }
        GMTrace.o(871878361088L, 6496);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\d\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */