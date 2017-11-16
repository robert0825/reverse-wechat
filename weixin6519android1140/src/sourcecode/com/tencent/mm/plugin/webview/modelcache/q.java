package com.tencent.mm.plugin.webview.modelcache;

import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.os.Process;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.lq;
import com.tencent.mm.g.a.ti;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.pluginsdk.j.a.c.d;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class q
{
  private volatile af gut;
  private final Object iGt;
  public final com.tencent.mm.sdk.b.c rFY;
  public final com.tencent.mm.sdk.b.c rFZ;
  private volatile i rGa;
  final SparseArray<l> rGb;
  public final c rGc;
  final e rGd;
  public final byte[] rGe;
  public final SparseArray<Set<Object>> rGf;
  
  public q()
  {
    GMTrace.i(12359842136064L, 92088);
    this.rFY = new com.tencent.mm.sdk.b.c() {};
    this.rFZ = new com.tencent.mm.sdk.b.c() {};
    this.rGb = new SparseArray();
    this.rGc = new c();
    this.rGd = new e();
    this.iGt = new Object();
    this.rGe = new byte[0];
    this.rGf = new SparseArray();
    GMTrace.o(12359842136064L, 92088);
  }
  
  public final void release(boolean paramBoolean)
  {
    GMTrace.i(12359976353792L, 92089);
    int i = 0;
    while (i < this.rGb.size())
    {
      this.rGb.valueAt(i);
      i += 1;
    }
    this.rGb.clear();
    a.clearCache();
    if (this.gut == null)
    {
      GMTrace.o(12359976353792L, 92089);
      return;
    }
    synchronized (this.iGt)
    {
      if (this.gut == null)
      {
        GMTrace.o(12359976353792L, 92089);
        return;
      }
      if (paramBoolean)
      {
        this.gut.ngv.quit();
        GMTrace.o(12359976353792L, 92089);
        return;
      }
      final af localaf = this.gut;
      this.gut.A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12348299411456L, 92002);
          Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
          {
            public final boolean queueIdle()
            {
              GMTrace.i(12361318531072L, 92099);
              if (Build.VERSION.SDK_INT >= 18) {
                q.4.this.rGk.ngv.getLooper().quitSafely();
              }
              for (;;)
              {
                GMTrace.o(12361318531072L, 92099);
                return false;
                q.4.this.rGk.ngv.getLooper().quit();
              }
            }
          });
          GMTrace.o(12348299411456L, 92002);
        }
      });
      this.gut = null;
      GMTrace.o(12359976353792L, 92089);
      return;
    }
  }
  
  public final af xB()
  {
    GMTrace.i(12360110571520L, 92090);
    if (this.gut == null) {}
    synchronized (this.iGt)
    {
      if (this.gut == null) {
        this.gut = new af("WebViewCacheWorkerManager#WorkerThread")
        {
          public final int A(final Runnable paramAnonymousRunnable)
          {
            GMTrace.i(12359707918336L, 92087);
            int i = super.A(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(12361586966528L, 92101);
                if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {}
                for (int i = 1;; i = 0)
                {
                  if ((i == 0) && (Process.getThreadPriority(Process.myTid()) != 10)) {
                    Process.setThreadPriority(10);
                  }
                  if (paramAnonymousRunnable != null) {
                    paramAnonymousRunnable.run();
                  }
                  GMTrace.o(12361586966528L, 92101);
                  return;
                }
              }
            });
            GMTrace.o(12359707918336L, 92087);
            return i;
          }
        };
      }
      ??? = this.gut;
      GMTrace.o(12360110571520L, 92090);
      return (af)???;
    }
  }
  
  public final void xB(int paramInt)
  {
    GMTrace.i(12360244789248L, 92091);
    if (at.AU()) {
      try
      {
        a.rGn.rGd.xy(paramInt);
        synchronized (this.rGe)
        {
          Object localObject2 = (Set)this.rGf.get(paramInt);
          if ((localObject2 == null) || (((Set)localObject2).size() <= 0)) {
            break label138;
          }
          ??? = ((Set)localObject2).iterator();
          if (!((Iterator)???).hasNext()) {
            break label138;
          }
          ((Iterator)???).next();
          if (this.rGa == null) {
            this.rGa = new i();
          }
          localObject2 = this.rGa;
        }
        GMTrace.o(12360244789248L, 92091);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.WebViewCacheWorkerManager", "onWebViewUIDestroy, accHasReady, but occurred exception = %s", new Object[] { localException });
      }
    }
    return;
    label138:
    GMTrace.o(12360244789248L, 92091);
  }
  
  private static final class a
  {
    public static final q rGn;
    
    static
    {
      GMTrace.i(12351252201472L, 92024);
      rGn = new q();
      GMTrace.o(12351252201472L, 92024);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modelcache\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */