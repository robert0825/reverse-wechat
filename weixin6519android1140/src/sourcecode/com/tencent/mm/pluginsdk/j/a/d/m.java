package com.tencent.mm.pluginsdk.j.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.v;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class m
  extends f<k>
{
  private final f<k>.a trp;
  public final c trq;
  
  public m(t paramt, c paramc)
  {
    this(paramt, paramc, (byte)0);
    GMTrace.i(879394553856L, 6552);
    GMTrace.o(879394553856L, 6552);
  }
  
  private m(t paramt, c paramc, byte paramByte)
  {
    GMTrace.i(879528771584L, 6553);
    this.trp = new f.a(this, 4, 4, 3000L, TimeUnit.MILLISECONDS, new c(), paramt);
    this.trp.setKeepAliveTime(30000L, TimeUnit.MILLISECONDS);
    this.trp.allowCoreThreadTimeOut(true);
    this.trq = paramc;
    GMTrace.o(879528771584L, 6553);
  }
  
  public f.d a(k paramk)
  {
    GMTrace.i(880065642496L, 6557);
    w.i("MicroMsg.ResDownloader.NetworkWorker", "request.class = " + paramk.getClass().getSimpleName());
    Object localObject = o.a.trx;
    a locala = o.c(paramk);
    localObject = locala;
    if (locala == null)
    {
      w.i("MicroMsg.ResDownloader.NetworkWorker", "get null handler from plugin, use default handler");
      localObject = new b(paramk);
    }
    ((a)localObject).trt = this.trq;
    GMTrace.o(880065642496L, 6557);
    return (f.d)localObject;
  }
  
  public int b(k paramk)
  {
    int j = 0;
    GMTrace.i(879662989312L, 6554);
    if ((OM(paramk.tpD)) || (isDownloading(paramk.tpD)))
    {
      w.i("MicroMsg.ResDownloader.NetworkWorker", "urlKey = %s is already queueing, skip repeated task", new Object[] { paramk.tpD });
      GMTrace.o(879662989312L, 6554);
      return 0;
    }
    int i = v.tq();
    w.i("MicroMsg.ResDownloader.NetworkWorker", "currentNetType(%d), requestNetType(%d)", new Object[] { Integer.valueOf(i), Integer.valueOf(paramk.networkType) });
    if (i != 0) {
      if (2 == paramk.networkType) {
        i = 1;
      }
    }
    while (i == 0)
    {
      w.i("MicroMsg.ResDownloader.NetworkWorker", "urlKey = %s, mismatch networkType , skip task", new Object[] { paramk.tpD });
      GMTrace.o(879662989312L, 6554);
      return 1;
      if (i == 1) {
        i = 1;
      } else {
        i = 0;
      }
    }
    if ((!this.trp.isShutdown()) && (!this.trp.isTerminated()))
    {
      i = j;
      if (!this.trp.isTerminating()) {}
    }
    else
    {
      i = 1;
    }
    if (i != 0)
    {
      GMTrace.o(879662989312L, 6554);
      return 4;
    }
    super.b(paramk);
    GMTrace.o(879662989312L, 6554);
    return 2;
  }
  
  protected final f<k>.a bKe()
  {
    GMTrace.i(879931424768L, 6556);
    f.a locala = this.trp;
    GMTrace.o(879931424768L, 6556);
    return locala;
  }
  
  public final boolean isDownloading(String paramString)
  {
    GMTrace.i(879797207040L, 6555);
    boolean bool = this.tra.containsKey(paramString);
    GMTrace.o(879797207040L, 6555);
    return bool;
  }
  
  public void shutdown()
  {
    GMTrace.i(17774587936768L, 132431);
    this.trp.shutdownNow();
    Iterator localIterator = this.tra.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = (Future)this.tra.get(localObject);
      if (localObject != null) {
        ((Future)localObject).cancel(true);
      }
    }
    this.tqZ.clear();
    this.tra.clear();
    GMTrace.o(17774587936768L, 132431);
  }
  
  public static abstract class a<Req extends k>
    extends f.d<Req>
    implements e
  {
    private static final ThreadLocal<j> trr;
    private final int tpN;
    private final AtomicInteger trs;
    public volatile c trt;
    
    static
    {
      GMTrace.i(874965368832L, 6519);
      trr = new ThreadLocal() {};
      GMTrace.o(874965368832L, 6519);
    }
    
    public a(Req paramReq)
    {
      super();
      GMTrace.i(872281014272L, 6499);
      this.tpN = paramReq.tpN;
      this.trs = new AtomicInteger(this.tpN);
      GMTrace.o(872281014272L, 6499);
    }
    
    public boolean SN()
    {
      GMTrace.i(872817885184L, 6503);
      GMTrace.o(872817885184L, 6503);
      return false;
    }
    
    public boolean SO()
    {
      GMTrace.i(872952102912L, 6504);
      GMTrace.o(872952102912L, 6504);
      return true;
    }
    
    public boolean SP()
    {
      GMTrace.i(873086320640L, 6505);
      GMTrace.o(873086320640L, 6505);
      return false;
    }
    
    public boolean SQ()
    {
      GMTrace.i(872549449728L, 6501);
      GMTrace.o(872549449728L, 6501);
      return true;
    }
    
    public boolean SR()
    {
      GMTrace.i(873220538368L, 6506);
      GMTrace.o(873220538368L, 6506);
      return true;
    }
    
    public boolean SS()
    {
      GMTrace.i(874562715648L, 6516);
      if (this.trs.decrementAndGet() > 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.trt.n(bJY(), this.tpN, this.trs.get());
        GMTrace.o(874562715648L, 6516);
        return bool;
      }
    }
    
    public l a(j paramj)
    {
      GMTrace.i(872415232000L, 6500);
      if (!SQ())
      {
        paramj = paramj.a(this);
        GMTrace.o(872415232000L, 6500);
        return paramj;
      }
      q localq = o.a.trx.OO(bJY());
      if (localq != null)
      {
        localq.field_status = 1;
        o.a.trx.e(localq);
      }
      paramj = paramj.a(this);
      GMTrace.o(872415232000L, 6500);
      return paramj;
    }
    
    public final String bJY()
    {
      GMTrace.i(874294280192L, 6514);
      String str = ((k)ST()).tpD;
      GMTrace.o(874294280192L, 6514);
      return str;
    }
    
    public final String bKk()
    {
      GMTrace.i(873488973824L, 6508);
      GMTrace.o(873488973824L, 6508);
      return "GET";
    }
    
    public final Collection<b> bKl()
    {
      GMTrace.i(873623191552L, 6509);
      Map localMap = ((k)ST()).getRequestHeaders();
      if ((localMap == null) || (localMap.size() == 0))
      {
        GMTrace.o(873623191552L, 6509);
        return null;
      }
      Object localObject = localMap.keySet();
      if ((localObject == null) || (((Set)localObject).size() == 0))
      {
        GMTrace.o(873623191552L, 6509);
        return null;
      }
      LinkedList localLinkedList = new LinkedList();
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str1 = (String)((Iterator)localObject).next();
        String str2 = (String)localMap.get(str1);
        if (!bg.nm(str2)) {
          localLinkedList.add(new b(str1, str2));
        }
      }
      GMTrace.o(873623191552L, 6509);
      return localLinkedList;
    }
    
    public final int bKm()
    {
      GMTrace.i(874025844736L, 6512);
      int i = ((k)ST()).bKm();
      GMTrace.o(874025844736L, 6512);
      return i;
    }
    
    public final String bKn()
    {
      GMTrace.i(874160062464L, 6513);
      GMTrace.o(874160062464L, 6513);
      return "application/x-www-form-urlencoded;charset=utf-8";
    }
    
    public boolean el(long paramLong)
    {
      GMTrace.i(874696933376L, 6517);
      this.trt.o(bJY(), paramLong);
      long l = av.bQB();
      w.i("MicroMsg.ResDownloader.NetworkWorker", "%s: get available size = %d", new Object[] { bJY(), Long.valueOf(l) });
      if (l >= paramLong)
      {
        GMTrace.o(874696933376L, 6517);
        return true;
      }
      GMTrace.o(874696933376L, 6517);
      return false;
    }
    
    public final int getConnectTimeout()
    {
      GMTrace.i(873757409280L, 6510);
      int i = ((k)ST()).getConnectTimeout();
      GMTrace.o(873757409280L, 6510);
      return i;
    }
    
    public final String getFilePath()
    {
      GMTrace.i(874428497920L, 6515);
      String str = ((k)ST()).getFilePath();
      GMTrace.o(874428497920L, 6515);
      return str;
    }
    
    public final int getReadTimeout()
    {
      GMTrace.i(873891627008L, 6511);
      int i = ((k)ST()).getReadTimeout();
      GMTrace.o(873891627008L, 6511);
      return i;
    }
    
    public String getURL()
    {
      GMTrace.i(873354756096L, 6507);
      String str = ((k)ST()).url;
      GMTrace.o(873354756096L, 6507);
      return str;
    }
    
    public final void run()
    {
      GMTrace.i(872683667456L, 6502);
      l locall = a((j)trr.get());
      if (locall != null)
      {
        this.trt.a(this, locall);
        GMTrace.o(872683667456L, 6502);
        return;
      }
      w.e("MicroMsg.ResDownloader.NetworkWorker", "groupId = %s, performer get null response", new Object[] { SM() });
      GMTrace.o(872683667456L, 6502);
    }
  }
  
  private static final class b
    extends m.a<k>
  {
    b(k paramk)
    {
      super();
      GMTrace.i(868657135616L, 6472);
      GMTrace.o(868657135616L, 6472);
    }
    
    public final String SM()
    {
      GMTrace.i(868791353344L, 6473);
      GMTrace.o(868791353344L, 6473);
      return "ResDownload";
    }
  }
  
  private static final class c
    extends PriorityBlockingQueue<Runnable>
  {
    public c()
    {
      super(new Comparator() {});
      GMTrace.i(875099586560L, 6520);
      GMTrace.o(875099586560L, 6520);
    }
    
    private static String B(Runnable paramRunnable)
    {
      GMTrace.i(875233804288L, 6521);
      if ((paramRunnable instanceof f.c))
      {
        if ((((f.c)paramRunnable).trc instanceof k))
        {
          paramRunnable = String.format("priority = %d, urlKey = %s", new Object[] { Integer.valueOf(((k)((f.c)paramRunnable).trc).priority), ((f.c)paramRunnable).trc.bJY() });
          GMTrace.o(875233804288L, 6521);
          return paramRunnable;
        }
        paramRunnable = String.format("unknown request = %s", new Object[] { ((f.c)paramRunnable).trc });
        GMTrace.o(875233804288L, 6521);
        return paramRunnable;
      }
      paramRunnable = String.format("unknown runnable = %s", new Object[] { paramRunnable });
      GMTrace.o(875233804288L, 6521);
      return paramRunnable;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\d\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */