package com.tencent.mm.pluginsdk.j.a.d;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.List;

public final class i
  implements c
{
  private final ae trd;
  public final SparseArray<List<d>> tre;
  public final Object trf;
  
  i(ae paramae)
  {
    GMTrace.i(869059788800L, 6475);
    this.trd = paramae;
    this.tre = new SparseArray();
    this.trf = new Object();
    GMTrace.o(869059788800L, 6475);
  }
  
  private List<d> ON(String arg1)
  {
    GMTrace.i(869596659712L, 6479);
    int i = ???.hashCode();
    synchronized (this.trf)
    {
      List localList = (List)this.tre.get(i);
      GMTrace.o(869596659712L, 6479);
      return localList;
    }
  }
  
  public final void a(final e parame, final l paraml)
  {
    GMTrace.i(869194006528L, 6476);
    w.i("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchResponse, response = " + paraml);
    switch (paraml.status)
    {
    }
    for (;;)
    {
      GMTrace.o(869194006528L, 6476);
      return;
      final Object localObject = o.a.trx.OO(paraml.tpD);
      if (localObject != null)
      {
        ((q)localObject).field_status = 4;
        o.a.trx.e((q)localObject);
      }
      localObject = ON(parame.SM());
      if (!bg.cc((List)localObject))
      {
        parame = parame.bJY();
        this.trd.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(861677813760L, 6420);
            Iterator localIterator = localObject.iterator();
            while (localIterator.hasNext())
            {
              d locald = (d)localIterator.next();
              if (bg.nl(locald.SM()).equals(paraml.groupId)) {
                locald.LA(parame);
              }
            }
            GMTrace.o(861677813760L, 6420);
          }
        });
      }
      GMTrace.o(869194006528L, 6476);
      return;
      localObject = o.a.trx.OO(paraml.tpD);
      if (localObject != null)
      {
        ((q)localObject).field_status = 2;
        o.a.trx.e((q)localObject);
      }
      w.d("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchComplete, groupId = " + parame.SM());
      localObject = ON(parame.SM());
      if (bg.cc((List)localObject))
      {
        w.d("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchComplete, listeners.size = null");
        GMTrace.o(869194006528L, 6476);
        return;
      }
      w.d("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchComplete, listeners.size = " + ((List)localObject).size());
      parame = parame.bJY();
      this.trd.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(863288426496L, 6432);
          Iterator localIterator = localObject.iterator();
          while (localIterator.hasNext())
          {
            d locald = (d)localIterator.next();
            if (bg.nl(locald.SM()).equals(paraml.groupId)) {
              locald.a(parame, paraml);
            }
          }
          GMTrace.o(863288426496L, 6432);
        }
      });
      GMTrace.o(869194006528L, 6476);
      return;
      localObject = o.a.trx.OO(paraml.tpD);
      if (localObject != null)
      {
        ((q)localObject).field_status = 3;
        o.a.trx.e((q)localObject);
      }
      localObject = ON(parame.SM());
      if (!bg.cc((List)localObject))
      {
        parame = parame.bJY();
        this.trd.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(867046522880L, 6460);
            Iterator localIterator = localObject.iterator();
            while (localIterator.hasNext())
            {
              d locald = (d)localIterator.next();
              if (bg.nl(locald.SM()).equals(paraml.groupId)) {
                locald.b(parame, paraml);
              }
            }
            GMTrace.o(867046522880L, 6460);
          }
        });
      }
    }
  }
  
  public final void n(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(869328224256L, 6477);
    w.i("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchRetry, urlKey = %s, max = %d, count = %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    paramString = o.a.trx.OO(paramString);
    if (paramString != null)
    {
      paramString.field_maxRetryTimes = paramInt1;
      paramString.field_retryTimes = paramInt2;
      o.a.trx.e(paramString);
    }
    GMTrace.o(869328224256L, 6477);
  }
  
  public final void o(String paramString, long paramLong)
  {
    GMTrace.i(869462441984L, 6478);
    paramString = o.a.trx.OO(paramString);
    if (paramString != null)
    {
      paramString.field_contentLength = paramLong;
      o.a.trx.e(paramString);
    }
    GMTrace.o(869462441984L, 6478);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\d\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */