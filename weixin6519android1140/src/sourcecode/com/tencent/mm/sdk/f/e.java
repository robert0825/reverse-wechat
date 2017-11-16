package com.tencent.mm.sdk.f;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;

public class e
  implements f.a
{
  private static e vmU;
  static int[] vmV;
  public static long vmW;
  public static long vmX;
  private static b vmY;
  private static a vmZ;
  private static b vna;
  private boolean eAo;
  volatile boolean eIE;
  Object lock;
  f vmM;
  private int vmN;
  private PriorityBlockingQueue<Runnable> vmO;
  LinkedList<g> vmP;
  private ArrayList<g> vmQ;
  private HashMap<g, Thread> vmR;
  ArrayList<c> vmS;
  c vmT;
  
  static
  {
    GMTrace.i(13987768958976L, 104217);
    vmV = new int[] { 19, 16, 13, 10, 0, -2, -4, -5, -6, -8 };
    vmW = 0L;
    vmX = 0L;
    GMTrace.o(13987768958976L, 104217);
  }
  
  private e()
  {
    GMTrace.i(13983473991680L, 104185);
    this.eAo = false;
    this.vmO = new PriorityBlockingQueue(33);
    this.vmP = new LinkedList();
    this.vmQ = new ArrayList();
    this.vmR = new HashMap();
    this.vmS = new ArrayList();
    this.lock = new Object();
    this.eIE = false;
    this.vmN = bRq();
    this.vmM = new f(this.vmN + 2, TimeUnit.SECONDS, this.vmO, this);
    HandlerThread localHandlerThread = SV("THREAD_POOL_HANDLER");
    localHandlerThread.start();
    this.vmT = new c(localHandlerThread.getLooper());
    GMTrace.o(13983473991680L, 104185);
  }
  
  public static void L(Runnable paramRunnable)
  {
    GMTrace.i(13984950386688L, 104196);
    e locale = bRp();
    synchronized (locale.lock)
    {
      Thread localThread = locale.M(paramRunnable);
      if (localThread != null)
      {
        localThread.interrupt();
        GMTrace.o(13984950386688L, 104196);
        return;
      }
      locale.S(paramRunnable);
    }
  }
  
  private Thread M(Runnable paramRunnable)
  {
    GMTrace.i(13985084604416L, 104197);
    if (paramRunnable == null)
    {
      GMTrace.o(13985084604416L, 104197);
      return null;
    }
    for (;;)
    {
      synchronized (this.lock)
      {
        Iterator localIterator = this.vmR.keySet().iterator();
        if (localIterator != null)
        {
          if (!localIterator.hasNext()) {
            break label131;
          }
          g localg = (g)localIterator.next();
          if ((localg == null) || (!localg.viN.equals(paramRunnable))) {
            continue;
          }
          paramRunnable = localg;
          if (paramRunnable != null)
          {
            paramRunnable = (Thread)this.vmR.get(paramRunnable);
            GMTrace.o(13985084604416L, 104197);
            return paramRunnable;
          }
        }
        GMTrace.o(13985084604416L, 104197);
        return null;
      }
      label131:
      paramRunnable = null;
    }
  }
  
  public static void N(Runnable paramRunnable)
  {
    GMTrace.i(13985218822144L, 104198);
    bRp().O(paramRunnable);
    GMTrace.o(13985218822144L, 104198);
  }
  
  private void O(Runnable paramRunnable)
  {
    GMTrace.i(13985353039872L, 104199);
    Assert.assertNotNull("join arg runnable is null!", paramRunnable);
    a locala = null;
    synchronized (this.lock)
    {
      if (R(paramRunnable))
      {
        locala = new a(paramRunnable);
        b(locala);
      }
      if (locala == null) {
        break label100;
      }
    }
    try
    {
      if (this.vmS.contains(locala)) {
        paramRunnable.wait();
      }
      for (;;)
      {
        GMTrace.o(13985353039872L, 104199);
        return;
        paramRunnable = finally;
        throw paramRunnable;
        w.d("MicroMsg.ThreadPool", "|MMThreadPool joinTask runnable is not in observerList, just removed!");
      }
      GMTrace.o(13985353039872L, 104199);
    }
    finally {}
    label100:
  }
  
  public static void P(Runnable paramRunnable)
  {
    int j = 1;
    GMTrace.i(13985487257600L, 104200);
    e locale = bRp();
    Assert.assertNotNull("join arg runnable is null!", paramRunnable);
    if (5000L < 0L) {
      throw new IllegalArgumentException();
    }
    int i;
    if (5000L >= 9223372036854L)
    {
      i = 1;
      if (5000L != 0L) {
        break label83;
      }
    }
    for (;;)
    {
      if ((j | i) == 0) {
        break label88;
      }
      locale.O(paramRunnable);
      GMTrace.o(13985487257600L, 104200);
      return;
      i = 0;
      break;
      label83:
      j = 0;
    }
    label88:
    a locala = null;
    synchronized (locale.lock)
    {
      if (locale.R(paramRunnable))
      {
        locala = new a(locale, paramRunnable);
        bRp().b(locala);
      }
      if (locala == null) {
        break label188;
      }
    }
    try
    {
      if (locale.vmS.contains(locala)) {
        paramRunnable.wait(5000L, 0);
      }
      for (;;)
      {
        GMTrace.o(13985487257600L, 104200);
        return;
        paramRunnable = finally;
        throw paramRunnable;
        w.d("MicroMsg.ThreadPool", "|MMThreadPool joinTask runnable is not in observerList, just removed!");
      }
      GMTrace.o(13985487257600L, 104200);
    }
    finally {}
    label188:
  }
  
  public static boolean Q(Runnable paramRunnable)
  {
    GMTrace.i(13985621475328L, 104201);
    boolean bool = bRp().R(paramRunnable);
    GMTrace.o(13985621475328L, 104201);
    return bool;
  }
  
  private boolean R(Runnable paramRunnable)
  {
    GMTrace.i(13985755693056L, 104202);
    if (paramRunnable == null)
    {
      GMTrace.o(13985755693056L, 104202);
      return false;
    }
    synchronized (this.lock)
    {
      Iterator localIterator = this.vmQ.iterator();
      g localg;
      while ((localIterator != null) && (localIterator.hasNext()))
      {
        localg = (g)localIterator.next();
        if ((localg != null) && (localg.viN.equals(paramRunnable)))
        {
          GMTrace.o(13985755693056L, 104202);
          return true;
        }
      }
      localIterator = this.vmR.keySet().iterator();
      while ((localIterator != null) && (localIterator.hasNext()))
      {
        localg = (g)localIterator.next();
        if ((localg != null) && (localg.viN.equals(paramRunnable)))
        {
          GMTrace.o(13985755693056L, 104202);
          return true;
        }
      }
      GMTrace.o(13985755693056L, 104202);
      return false;
    }
  }
  
  private boolean S(Runnable paramRunnable)
  {
    GMTrace.i(13986024128512L, 104204);
    if (paramRunnable == null)
    {
      GMTrace.o(13986024128512L, 104204);
      return false;
    }
    for (;;)
    {
      synchronized (this.lock)
      {
        Iterator localIterator = this.vmQ.iterator();
        if (localIterator != null)
        {
          if (!localIterator.hasNext()) {
            break label134;
          }
          g localg = (g)localIterator.next();
          if ((localg == null) || (!localg.viN.equals(paramRunnable))) {
            continue;
          }
          localIterator.remove();
          paramRunnable = localg;
          if (paramRunnable != null)
          {
            this.vmM.remove(paramRunnable);
            GMTrace.o(13986024128512L, 104204);
            return true;
          }
        }
        GMTrace.o(13986024128512L, 104204);
        return false;
      }
      label134:
      paramRunnable = null;
    }
  }
  
  public static HandlerThread SV(String paramString)
  {
    GMTrace.i(13987097870336L, 104212);
    paramString = bRu().cJ(paramString, 0);
    GMTrace.o(13987097870336L, 104212);
    return paramString;
  }
  
  public static void a(c paramc)
  {
    GMTrace.i(13984010862592L, 104189);
    bRp().b(paramc);
    GMTrace.o(13984010862592L, 104189);
  }
  
  public static void a(Runnable paramRunnable, String paramString)
  {
    GMTrace.i(13984816168960L, 104195);
    e locale = bRp();
    synchronized (locale.lock)
    {
      paramRunnable = new g(paramRunnable, paramString, Integer.MAX_VALUE, true, vna);
      locale.vmQ.add(paramRunnable);
      locale.vmM.execute(paramRunnable);
      if ((locale.vmM.getActiveCount() >= locale.vmN) && (locale.vmN < bRq() * 2))
      {
        locale.vmN += 1;
        locale.vmM.setCorePoolSize(locale.vmN);
        locale.vmM.setMaximumPoolSize(locale.vmN);
        w.i("MicroMsg.ThreadPool", "|MMThreadPool postAtFront expand core pool size=" + locale.vmN);
        paramString = new ArrayList(locale.vmS).iterator();
      }
      while (paramString.hasNext())
      {
        paramString.next();
        Runnable localRunnable = paramRunnable.viN;
        continue;
        locale.bRr();
      }
    }
    locale.kJ(false);
    GMTrace.o(13984816168960L, 104195);
  }
  
  public static Thread b(Runnable paramRunnable, String paramString)
  {
    GMTrace.i(13986695217152L, 104209);
    paramRunnable = bRt().a(paramRunnable, paramString, 5);
    GMTrace.o(13986695217152L, 104209);
    return paramRunnable;
  }
  
  private void b(c paramc)
  {
    GMTrace.i(13984145080320L, 104190);
    synchronized (this.lock)
    {
      if (!this.vmS.contains(paramc)) {
        this.vmS.add(paramc);
      }
      GMTrace.o(13984145080320L, 104190);
      return;
    }
  }
  
  public static void b(Runnable paramRunnable, String paramString, int paramInt)
  {
    GMTrace.i(13984547733504L, 104193);
    bRp().c(paramRunnable, paramString, paramInt);
    GMTrace.o(13984547733504L, 104193);
  }
  
  public static e bRp()
  {
    GMTrace.i(13983339773952L, 104184);
    if (vmU == null) {}
    try
    {
      if (vmU == null) {
        vmU = new e();
      }
      e locale = vmU;
      GMTrace.o(13983339773952L, 104184);
      return locale;
    }
    finally {}
  }
  
  private static int bRq()
  {
    int i = 32;
    GMTrace.i(13983608209408L, 104186);
    int j = Runtime.getRuntime().availableProcessors() * 4 + 2;
    if (j > 32) {}
    for (;;)
    {
      GMTrace.o(13983608209408L, 104186);
      return i;
      i = j;
    }
  }
  
  public static void bRs()
  {
    GMTrace.i(13986292563968L, 104206);
    bRp().kJ(true);
    GMTrace.o(13986292563968L, 104206);
  }
  
  private static b bRt()
  {
    GMTrace.i(13986560999424L, 104208);
    if (vmY == null) {
      vmY = new b(vna);
    }
    b localb = vmY;
    GMTrace.o(13986560999424L, 104208);
    return localb;
  }
  
  private static a bRu()
  {
    GMTrace.i(13986963652608L, 104211);
    if (vmZ == null) {
      vmZ = new a(vna);
    }
    a locala = vmZ;
    GMTrace.o(13986963652608L, 104211);
    return locala;
  }
  
  public static void c(c paramc)
  {
    GMTrace.i(13984279298048L, 104191);
    e locale = bRp();
    synchronized (locale.lock)
    {
      locale.vmS.remove(paramc);
      GMTrace.o(13984279298048L, 104191);
      return;
    }
  }
  
  private void c(Runnable paramRunnable, String paramString, int paramInt)
  {
    GMTrace.i(13984681951232L, 104194);
    synchronized (this.lock)
    {
      paramRunnable = new g(paramRunnable, paramString, paramInt, true, vna);
      this.vmP.add(paramRunnable);
      this.vmQ.add(paramRunnable);
      this.vmT.sendEmptyMessage(1);
      kJ(false);
      GMTrace.o(13984681951232L, 104194);
      return;
    }
  }
  
  public static HandlerThread cK(String paramString, int paramInt)
  {
    GMTrace.i(13987232088064L, 104213);
    paramString = bRu().cJ(paramString, paramInt);
    GMTrace.o(13987232088064L, 104213);
    return paramString;
  }
  
  public static Thread d(Runnable paramRunnable, String paramString, int paramInt)
  {
    GMTrace.i(13986829434880L, 104210);
    paramRunnable = bRt().a(paramRunnable, paramString, paramInt);
    GMTrace.o(13986829434880L, 104210);
    return paramRunnable;
  }
  
  private void kJ(boolean paramBoolean)
  {
    GMTrace.i(13986426781696L, 104207);
    if (!paramBoolean)
    {
      GMTrace.o(13986426781696L, 104207);
      return;
    }
    g localg;
    synchronized (this.lock)
    {
      w.i("MicroMsg.ThreadPool", "------------------------------------------");
      Iterator localIterator1 = this.vmP.iterator();
      if ((localIterator1 != null) && (localIterator1.hasNext()))
      {
        localg = (g)localIterator1.next();
        w.i("MicroMsg.ThreadPool", "|MMThreadPool adding task{" + localg + "}");
      }
    }
    w.i("MicroMsg.ThreadPool", "-----------");
    Iterator localIterator2 = this.vmQ.iterator();
    if (localIterator2 != null) {
      while (localIterator2.hasNext())
      {
        localg = (g)localIterator2.next();
        w.i("MicroMsg.ThreadPool", "|MMThreadPool waiting task{" + localg + "}");
      }
    }
    w.i("MicroMsg.ThreadPool", "-----------");
    localIterator2 = this.vmR.keySet().iterator();
    if (localIterator2 != null) {
      while (localIterator2.hasNext())
      {
        localg = (g)localIterator2.next();
        w.i("MicroMsg.ThreadPool", "|MMThreadPool running task{" + localg + "}");
      }
    }
    w.i("MicroMsg.ThreadPool", "-----------");
    w.i("MicroMsg.ThreadPool", "|MMThreadPool poolSize=" + this.vmM.getPoolSize() + "|activeCount=" + this.vmM.getActiveCount() + "|corePoolSize=" + this.vmM.getPoolSize() + "|largestPoolSize=" + this.vmM.getLargestPoolSize() + "|maximuPoolSize=" + this.vmM.getMaximumPoolSize());
    w.i("MicroMsg.ThreadPool", "------------------------------------------");
    GMTrace.o(13986426781696L, 104207);
  }
  
  public static void post(Runnable paramRunnable, String paramString)
  {
    GMTrace.i(13984413515776L, 104192);
    bRp().c(paramRunnable, paramString, 5);
    GMTrace.o(13984413515776L, 104192);
  }
  
  public static boolean remove(Runnable paramRunnable)
  {
    GMTrace.i(13985889910784L, 104203);
    boolean bool = bRp().S(paramRunnable);
    GMTrace.o(13985889910784L, 104203);
    return bool;
  }
  
  public final void K(Runnable paramRunnable)
  {
    GMTrace.i(13983876644864L, 104188);
    for (;;)
    {
      synchronized (this.lock)
      {
        paramRunnable = (g)paramRunnable;
        Iterator localIterator = this.vmR.keySet().iterator();
        if (localIterator != null)
        {
          if (!localIterator.hasNext()) {
            break label269;
          }
          g localg = (g)localIterator.next();
          if ((localg == null) || (!localg.equals(paramRunnable))) {
            continue;
          }
          localIterator.remove();
          i = 1;
          if (i != 0)
          {
            localIterator = new ArrayList(this.vmS).iterator();
            if (localIterator.hasNext()) {
              ((c)localIterator.next()).u(paramRunnable.viN);
            }
          }
        }
      }
      int i = this.vmM.getActiveCount();
      int j = this.vmM.getQueue().size();
      int k = this.vmM.getCorePoolSize();
      if ((i == 1) && (j == 0))
      {
        if (k > 0)
        {
          this.vmN = bRq();
          this.vmM.setCorePoolSize(0);
          this.vmM.setMaximumPoolSize(this.vmN + 2);
        }
        paramRunnable = new ArrayList(this.vmS).iterator();
        while (paramRunnable.hasNext()) {
          paramRunnable.next();
        }
        this.eAo = false;
      }
      GMTrace.o(13983876644864L, 104188);
      return;
      label269:
      i = 0;
    }
  }
  
  final void bRr()
  {
    GMTrace.i(13986158346240L, 104205);
    if (this.vmM.getCorePoolSize() < this.vmN)
    {
      this.vmM.setCorePoolSize(this.vmN);
      this.vmM.setMaximumPoolSize(this.vmN);
    }
    GMTrace.o(13986158346240L, 104205);
  }
  
  public final void beforeExecute(Thread paramThread, Runnable paramRunnable)
  {
    int i = 10;
    GMTrace.i(13983742427136L, 104187);
    for (;;)
    {
      Object localObject2;
      int j;
      synchronized (this.lock)
      {
        localObject2 = this.vmQ.iterator();
        if (localObject2 == null) {
          break label225;
        }
        paramRunnable = (g)paramRunnable;
        j = paramRunnable.priority;
        if (j <= 0)
        {
          i = 1;
          paramThread.setPriority(i);
          paramThread.setName(paramRunnable.lGL);
          if (!((Iterator)localObject2).hasNext()) {
            break label238;
          }
          g localg = (g)((Iterator)localObject2).next();
          if ((localg == null) || (!localg.equals(paramRunnable))) {
            continue;
          }
          ((Iterator)localObject2).remove();
          i = 1;
          if (i == 0) {
            break label225;
          }
          this.vmR.put(paramRunnable, paramThread);
          paramThread = new ArrayList(this.vmS);
          if (this.eAo) {
            break label190;
          }
          localObject2 = paramThread.iterator();
          if (!((Iterator)localObject2).hasNext()) {
            break label190;
          }
          ((Iterator)localObject2).next();
        }
      }
      if (j <= 10)
      {
        i = j;
        continue;
        label190:
        this.eAo = true;
        paramThread = paramThread.iterator();
        while (paramThread.hasNext())
        {
          paramThread.next();
          localObject2 = paramRunnable.viN;
        }
        label225:
        GMTrace.o(13983742427136L, 104187);
        return;
        label238:
        i = 0;
      }
    }
  }
  
  final class a
    implements c
  {
    private final Runnable vnb;
    
    public a(Runnable paramRunnable)
    {
      GMTrace.i(13980923854848L, 104166);
      this.vnb = paramRunnable;
      GMTrace.o(13980923854848L, 104166);
    }
    
    public final void u(Runnable arg1)
    {
      GMTrace.i(13981058072576L, 104167);
      if (???.equals(this.vnb)) {
        synchronized (this.vnb)
        {
          this.vnb.notifyAll();
          e.c(this);
          GMTrace.o(13981058072576L, 104167);
          return;
        }
      }
      GMTrace.o(13981058072576L, 104167);
    }
  }
  
  public static abstract interface b {}
  
  final class c
    extends ae
  {
    public c(Looper paramLooper)
    {
      super();
      GMTrace.i(13981863378944L, 104173);
      GMTrace.o(13981863378944L, 104173);
    }
    
    public final void handleMessage(Message arg1)
    {
      GMTrace.i(13981997596672L, 104174);
      switch (???.what)
      {
      default: 
        GMTrace.o(13981997596672L, 104174);
        return;
      }
      removeMessages(???.what);
      if (e.this.eIE)
      {
        long l = System.currentTimeMillis();
        e locale1;
        if ((e.vmW > 0L) && (Math.abs(e.vmX - l) > e.vmW))
        {
          w.i("MicroMsg.ThreadPool", "|MMThreadPool thread pool is auto wakeup");
          locale1 = e.this;
        }
        synchronized (locale1.lock)
        {
          locale1.eIE = false;
          e.vmX = 0L;
          e.vmW = 0L;
          sendEmptyMessageDelayed(1, 1000L);
          GMTrace.o(13981997596672L, 104174);
          return;
        }
      }
      e locale2 = e.this;
      synchronized (locale2.lock)
      {
        if (!locale2.vmP.isEmpty())
        {
          Iterator localIterator = locale2.vmP.iterator();
          if ((localIterator != null) && (localIterator.hasNext()))
          {
            g localg = (g)localIterator.next();
            localIterator.remove();
            locale2.bRr();
            locale2.vmM.execute(localg);
            localIterator = new ArrayList(locale2.vmS).iterator();
            if (localIterator.hasNext())
            {
              localIterator.next();
              Runnable localRunnable = localg.viN;
              locale2.vmM.getActiveCount();
            }
          }
        }
      }
      if (!((e)localObject2).vmP.isEmpty()) {
        ((e)localObject2).vmT.sendEmptyMessage(1);
      }
      GMTrace.o(13981997596672L, 104174);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\f\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */