package com.tencent.mm.plugin.mmsight.segment;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract interface d
{
  public abstract int getDurationMs();
  
  public abstract Bitmap getFrameAtTime(long paramLong);
  
  public abstract int getScaledHeight();
  
  public abstract int getScaledWidth();
  
  public abstract void init(String paramString, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void release();
  
  public abstract void reuseBitmap(Bitmap paramBitmap);
  
  public static final class a
  {
    Lock lnP;
    LinkedBlockingQueue<d> ndv;
    private final int ndw;
    private Callable<d> ndx;
    private volatile int size;
    
    public a(Callable<d> paramCallable)
    {
      GMTrace.i(20179232751616L, 150347);
      this.size = 0;
      this.lnP = new ReentrantLock();
      this.ndw = 4;
      this.ndv = new LinkedBlockingQueue(4);
      this.ndx = paramCallable;
      GMTrace.o(20179232751616L, 150347);
    }
    
    private d aQb()
    {
      GMTrace.i(7471766700032L, 55669);
      if (this.ndx == null) {
        throw new IllegalStateException("fetcher generator can not be null.");
      }
      long l = bg.Pw();
      try
      {
        d locald = (d)this.ndx.call();
        w.d("FetcherPool", "time flee, construct fetcher instance cost %d", new Object[] { Long.valueOf(bg.aI(l)) });
        GMTrace.o(7471766700032L, 55669);
        return locald;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("FetcherPool", localException, " fetcher generater call error %s", new Object[] { localException.getMessage() });
        throw localException;
      }
    }
    
    public final void a(d paramd)
    {
      GMTrace.i(7471900917760L, 55670);
      w.d("FetcherPool", "reuseFetcher");
      if (paramd == null)
      {
        w.e("FetcherPool", "Null object can not be reused.");
        GMTrace.o(7471900917760L, 55670);
        return;
      }
      if (this.ndv == null)
      {
        paramd.release();
        GMTrace.o(7471900917760L, 55670);
        return;
      }
      if (this.ndv.contains(paramd)) {
        throw new IllegalStateException("fetcher already in pool");
      }
      this.ndv.offer(paramd);
      GMTrace.o(7471900917760L, 55670);
    }
    
    public final d aQa()
    {
      GMTrace.i(7471632482304L, 55668);
      long l = bg.Pw();
      w.d("FetcherPool", "acquireFetcher");
      if (this.ndv == null)
      {
        w.d("FetcherPool", "acquireFetcher no pool directly return null");
        GMTrace.o(7471632482304L, 55668);
        return null;
      }
      this.lnP.lock();
      w.d("FetcherPool", "pool.size() %d, size %d, maxFetcherSize %d", new Object[] { Integer.valueOf(this.ndv.size()), Integer.valueOf(this.size), Integer.valueOf(this.ndw) });
      if (this.ndv == null)
      {
        this.lnP.unlock();
        GMTrace.o(7471632482304L, 55668);
        return null;
      }
      if ((this.ndv.isEmpty()) && (this.size < this.ndw))
      {
        w.d("FetcherPool", "new fetcher");
        this.size += 1;
        this.lnP.unlock();
      }
      for (d locald = aQb();; locald = (d)this.ndv.poll(5L, TimeUnit.SECONDS))
      {
        w.d("FetcherPool", "time flee, acquireFetcher cost time %d", new Object[] { Long.valueOf(bg.aI(l)) });
        GMTrace.o(7471632482304L, 55668);
        return locald;
        w.d("FetcherPool", "waiting fetcher");
        this.lnP.unlock();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */