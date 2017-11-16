package com.tencent.mapsdk.rastercore.tile;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b
  implements e.a
{
  private static final TimeUnit a = TimeUnit.SECONDS;
  private static final int b = Runtime.getRuntime().availableProcessors();
  public com.tencent.mapsdk.rastercore.d.e c;
  public Map<String, List<a>> d = new HashMap();
  public Map<String, List<a>> e = new HashMap();
  private final BlockingQueue<Runnable> f = new LinkedBlockingQueue();
  public final BlockingQueue<Runnable> g = new LinkedBlockingQueue();
  private ExecutorService h;
  private ExecutorService i;
  private ThreadFactory j = new ThreadFactory()
  {
    private int a = 0;
    
    public final Thread newThread(Runnable paramAnonymousRunnable)
    {
      StringBuilder localStringBuilder = new StringBuilder("TileFetchThread#");
      int i = this.a;
      this.a = (i + 1);
      paramAnonymousRunnable = new Thread(paramAnonymousRunnable, i);
      paramAnonymousRunnable.setPriority(10);
      return paramAnonymousRunnable;
    }
  };
  
  public b(com.tencent.mapsdk.rastercore.d.e parame)
  {
    this.c = parame;
    if (b < 4) {}
    for (int k = 3;; k = 4)
    {
      this.i = new ThreadPoolExecutor(k, m, 30L, TimeUnit.SECONDS, this.g, this.j);
      this.h = new ThreadPoolExecutor(1, 1, 30L, a, this.f);
      return;
      m = 4;
    }
  }
  
  public final void a()
  {
    if (this.f != null) {
      this.f.clear();
    }
    if (this.g != null) {
      this.g.clear();
    }
    if (this.h != null)
    {
      this.h.shutdownNow();
      this.h = null;
    }
    if (this.i != null)
    {
      this.i.shutdown();
      this.i = null;
    }
  }
  
  public final void a(e parame)
  {
    if (parame != null)
    {
      Object localObject2 = parame.b();
      Bitmap localBitmap = parame.a();
      synchronized (this.d)
      {
        List localList = (List)this.e.remove(localObject2);
        this.d.remove(localObject2);
        if ((localList != null) && (localBitmap != null) && (!localBitmap.isRecycled()))
        {
          ??? = localList.iterator();
          while (((Iterator)???).hasNext())
          {
            localObject2 = (a)((Iterator)???).next();
            if (!((a)localObject2).i()) {
              ((a)localObject2).a(localBitmap.copy(localBitmap.getConfig(), false));
            }
          }
        }
      }
    }
    this.c.c().postInvalidate();
  }
  
  public final void a(final ArrayList<MapTile> paramArrayList)
  {
    if (com.tencent.mapsdk.rastercore.f.a.a(paramArrayList)) {}
    for (;;)
    {
      return;
      this.f.clear();
      paramArrayList = new Runnable()
      {
        public final void run()
        {
          b.this.g.clear();
          int i;
          a locala;
          Object localObject2;
          synchronized (b.this.d)
          {
            b.this.d.clear();
            b.this.d.putAll(b.this.e);
            i = 0;
            if (i < paramArrayList.size())
            {
              Iterator localIterator = ((MapTile)paramArrayList.get(i)).b().iterator();
              if (localIterator.hasNext()) {
                locala = (a)localIterator.next();
              }
            }
          }
        }
      };
      try
      {
        if (!this.h.isShutdown())
        {
          this.h.execute(paramArrayList);
          return;
        }
      }
      catch (Exception paramArrayList)
      {
        new StringBuilder("getTiles get error:").append(paramArrayList.getMessage());
      }
    }
  }
  
  public final void b(e arg1)
  {
    String str;
    if (??? != null) {
      str = ???.b();
    }
    synchronized (this.d)
    {
      List localList = (List)this.d.remove(str);
      this.e.put(str, localList);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\tile\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */