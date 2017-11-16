package com.tencent.mm.ad;

import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.i;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ListenerInstanceMonitor;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import junit.framework.Assert;

public final class n
  implements e
{
  private static int guC;
  private static n gur;
  public boolean foreground;
  public boolean guA;
  private aj guB;
  public com.tencent.mm.network.e gus;
  public af gut;
  public Vector<k> guu;
  public Vector<k> guv;
  public final Map<Integer, Set<e>> guw;
  private Boolean gux;
  public final a guy;
  private long guz;
  public final ae handler;
  public final Object lock;
  
  static
  {
    GMTrace.i(13417612050432L, 99969);
    gur = null;
    guC = 1;
    GMTrace.o(13417612050432L, 99969);
  }
  
  private n(a parama)
  {
    GMTrace.i(13413451300864L, 99938);
    this.gut = null;
    this.guw = new HashMap();
    this.foreground = false;
    this.gux = null;
    this.lock = new Object();
    this.guz = 21600000L;
    this.guA = false;
    this.guB = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        boolean bool2 = false;
        GMTrace.i(13407277285376L, 99892);
        if (n.this.guy == null)
        {
          GMTrace.o(13407277285376L, 99892);
          return false;
        }
        w.v("MicroMsg.NetSceneQueue", "onQueueIdle, running=%d, waiting=%d, foreground=%b", new Object[] { Integer.valueOf(n.this.guu.size()), Integer.valueOf(n.this.guv.size()), Boolean.valueOf(n.this.foreground) });
        n.a locala = n.this.guy;
        n localn = n.this;
        boolean bool1 = bool2;
        if (n.this.guA)
        {
          bool1 = bool2;
          if (n.this.guu.isEmpty())
          {
            bool1 = bool2;
            if (n.this.guv.isEmpty()) {
              bool1 = true;
            }
          }
        }
        locala.a(localn, bool1);
        GMTrace.o(13407277285376L, 99892);
        return true;
      }
    }, true);
    this.guu = new Vector();
    this.guv = new Vector();
    this.handler = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(13411572252672L, 99924);
        n.this.a((k)paramAnonymousMessage.obj, 0);
        GMTrace.o(13411572252672L, 99924);
      }
    };
    this.guy = parama;
    GMTrace.o(13413451300864L, 99938);
  }
  
  private boolean DS()
  {
    GMTrace.i(13415733002240L, 99955);
    if (this.guu.size() >= 50)
    {
      GMTrace.o(13415733002240L, 99955);
      return false;
    }
    GMTrace.o(13415733002240L, 99955);
    return true;
  }
  
  public static n a(a parama)
  {
    GMTrace.i(13413719736320L, 99940);
    if (gur == null) {
      gur = new n(parama);
    }
    parama = gur;
    GMTrace.o(13413719736320L, 99940);
    return parama;
  }
  
  private void b(final k paramk, int paramInt)
  {
    GMTrace.i(13415196131328L, 99951);
    boolean bool = DS();
    int j = this.guu.size();
    int k = paramk.getType();
    int m = paramk.hashCode();
    int n = paramk.DI();
    int i1 = this.guv.size();
    int i;
    if (this.gus == null)
    {
      i = 0;
      w.i("MicroMsg.NetSceneQueue", "doSceneImp start: mmcgi type:%d hash[%d,%d] run:%d wait:%d afterSec:%d canDo:%b autoauth:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(j), Integer.valueOf(i1), Integer.valueOf(paramInt), Boolean.valueOf(bool), Integer.valueOf(i) });
      if ((paramInt != 0) || (!bool) || (this.gus == null)) {
        break label324;
      }
    }
    for (;;)
    {
      synchronized (this.lock)
      {
        this.guu.add(paramk);
        if (j == this.guu.size()) {
          w.w("MicroMsg.NetSceneQueue", "doSceneImp mmcgi  Add to runningQueue wrong  type:%d hash:%d run:[%d ,%d] wait:%d ", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramk.hashCode()), Integer.valueOf(j), Integer.valueOf(this.guu.size()), Integer.valueOf(this.guv.size()) });
        }
        this.gut.A(new Runnable()
        {
          public final void run()
          {
            int k = 0;
            GMTrace.i(13400163745792L, 99839);
            paramk.gub = n.this;
            int j;
            if ((!paramk.gtZ) && (n.this.gus != null))
            {
              j = paramk.a(n.this.gus, n.this);
              if (j >= 0) {}
            }
            for (int i = j;; i = 0)
            {
              int m = paramk.getType();
              int n = paramk.hashCode();
              int i1 = paramk.DI();
              boolean bool = paramk.gtZ;
              int i2 = n.this.guu.size();
              int i3 = n.this.guv.size();
              if (n.this.gus == null) {
                j = k;
              }
              for (;;)
              {
                w.w("MicroMsg.NetSceneQueue", "doscene mmcgi Failed type:%d hash[%d,%d] cancel[%b] run:%d wait:%d ret:%d autoauth:%d", new Object[] { Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Boolean.valueOf(bool), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(j) });
                paramk.gub = null;
                synchronized (n.this.lock)
                {
                  n.this.guu.remove(paramk);
                  if (paramk.gtZ) {
                    break;
                  }
                  n.this.handler.post(new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(13408082591744L, 99898);
                      n.this.a(3, -1, "doScene failed", n.5.this.ezf);
                      GMTrace.o(13408082591744L, 99898);
                    }
                  });
                  GMTrace.o(13400163745792L, 99839);
                  return;
                  j = n.this.gus.hashCode();
                }
              }
              k = paramk.getType();
              m = paramk.hashCode();
              n = paramk.DI();
              i1 = n.this.guu.size();
              i2 = n.this.guv.size();
              if (n.this.gus == null) {}
              for (i = 0;; i = n.this.gus.hashCode())
              {
                w.i("MicroMsg.NetSceneQueue", "On doscene  mmcgi type:%d hash[%d,%d] run:%d wait:%d ret:%d autoauth:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(j), Integer.valueOf(i) });
                paramk.guc = false;
                GMTrace.o(13400163745792L, 99839);
                return;
              }
            }
          }
          
          public final String toString()
          {
            GMTrace.i(13400297963520L, 99840);
            String str = super.toString() + "|doSceneImp_" + paramk + "_type=" + paramk.getType();
            GMTrace.o(13400297963520L, 99840);
            return str;
          }
        });
        if (this.gus != null) {
          break label580;
        }
        if (this.guy != null) {
          break;
        }
        w.e("MicroMsg.NetSceneQueue", "prepare dispatcher failed, queue idle:%s", new Object[] { this.guy });
        GMTrace.o(13415196131328L, 99951);
        return;
        i = this.gus.hashCode();
      }
      label324:
      if (paramInt > 0)
      {
        ??? = Message.obtain();
        ((Message)???).obj = paramk;
        this.handler.sendMessageDelayed((Message)???, paramInt);
        w.i("MicroMsg.NetSceneQueue", "timed: type=" + paramk.getType() + " id=" + paramk.hashCode() + " cur_after_sec=" + paramInt);
      }
      else
      {
        w.i("MicroMsg.NetSceneQueue", "waited: type=" + paramk.getType() + " id=" + paramk.hashCode() + " cur_waiting_cnt=" + this.guv.size());
        synchronized (this.lock)
        {
          this.guv.add(paramk);
          w.i("MicroMsg.NetSceneQueue", "waitingQueue_size = " + this.guv.size());
        }
      }
    }
    this.guy.a(this);
    paramk = new aj(Looper.getMainLooper(), new aj.a()
    {
      private long guG;
      
      public final boolean pM()
      {
        GMTrace.i(13424322936832L, 100019);
        if (n.this.gus == null)
        {
          long l = this.guG;
          this.guG = (l - 1L);
          if (l > 0L)
          {
            GMTrace.o(13424322936832L, 100019);
            return true;
          }
        }
        n.this.DR();
        GMTrace.o(13424322936832L, 100019);
        return false;
      }
    }, true);
    long l = guC * 100;
    paramk.z(l, l);
    if (guC < 512) {
      guC *= 2;
    }
    GMTrace.o(13415196131328L, 99951);
    return;
    label580:
    guC = 1;
    GMTrace.o(13415196131328L, 99951);
  }
  
  private void c(final int paramInt1, final int paramInt2, final String paramString, final k paramk)
  {
    GMTrace.i(13415464566784L, 99953);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(13407814156288L, 99896);
        Set localSet = (Set)n.this.guw.get(Integer.valueOf(paramk.getType()));
        Object localObject;
        e locale;
        if ((localSet != null) && (localSet.size() > 0))
        {
          localObject = new HashSet();
          ((Set)localObject).addAll(localSet);
          localObject = ((Set)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            locale = (e)((Iterator)localObject).next();
            if ((locale != null) && (localSet.contains(locale))) {
              locale.a(paramInt1, paramInt2, paramString, paramk);
            }
          }
        }
        localSet = (Set)n.this.guw.get(Integer.valueOf(-1));
        if ((localSet != null) && (localSet.size() > 0))
        {
          localObject = new HashSet();
          ((Set)localObject).addAll(localSet);
          localObject = ((Set)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            locale = (e)((Iterator)localObject).next();
            if ((locale != null) && (localSet.contains(locale))) {
              locale.a(paramInt1, paramInt2, paramString, paramk);
            }
          }
        }
        GMTrace.o(13407814156288L, 99896);
      }
    });
    GMTrace.o(13415464566784L, 99953);
  }
  
  private boolean e(k paramk)
  {
    GMTrace.i(13415867219968L, 99956);
    int i = paramk.getType();
    if (paramk.DE()) {}
    synchronized (this.lock)
    {
      Iterator localIterator = this.guu.iterator();
      k localk;
      while (localIterator.hasNext())
      {
        localk = (k)localIterator.next();
        if (localk.getType() == i)
        {
          w.i("MicroMsg.NetSceneQueue", "forbid in running: type=" + paramk.getType() + " id=" + paramk.hashCode() + " cur_running_cnt=" + this.guu.size());
          if (paramk.b(localk))
          {
            GMTrace.o(13415867219968L, 99956);
            return true;
          }
          if (paramk.a(localk))
          {
            w.e("MicroMsg.NetSceneQueue", "forbid in running diagnostic: type=" + paramk.getType() + " id=" + paramk.hashCode() + " cur_running_cnt=" + this.guu.size() + " ---" + localk.hashCode());
            if (!this.foreground)
            {
              w.e("MicroMsg.NetSceneQueue", "forbid in running diagnostic: type=" + paramk.getType() + "acinfo[" + localk.getInfo() + "] scinfo[" + paramk.getInfo() + "]");
              w.bPM();
              Assert.assertTrue("NetsceneQueue forbid in running diagnostic: type=" + paramk.getType(), false);
            }
            c(localk);
            GMTrace.o(13415867219968L, 99956);
            return true;
          }
          GMTrace.o(13415867219968L, 99956);
          return false;
        }
      }
      localIterator = this.guv.iterator();
      while (localIterator.hasNext())
      {
        localk = (k)localIterator.next();
        if (localk.getType() == i)
        {
          w.i("MicroMsg.NetSceneQueue", "forbid in waiting: type=" + paramk.getType() + " id=" + paramk.hashCode() + " cur_waiting_cnt=" + this.guv.size());
          if (paramk.b(localk))
          {
            GMTrace.o(13415867219968L, 99956);
            return true;
          }
          if (paramk.a(localk))
          {
            w.e("MicroMsg.NetSceneQueue", "forbid in waiting diagnostic: type=" + paramk.getType() + " id=" + paramk.hashCode() + " cur_waiting_cnt=" + this.guv.size() + " ---" + localk.hashCode());
            if (!this.foreground)
            {
              w.bPM();
              Assert.assertTrue("NetsceneQueue forbid in waiting diagnostic: type=" + paramk.getType(), false);
            }
            c(localk);
            GMTrace.o(13415867219968L, 99956);
            return true;
          }
          GMTrace.o(13415867219968L, 99956);
          return false;
        }
      }
      GMTrace.o(13415867219968L, 99956);
      return true;
    }
  }
  
  public final int DN()
  {
    GMTrace.i(13413048647680L, 99935);
    try
    {
      if ((this.gus != null) && (this.gus.DZ() != null))
      {
        int i = this.gus.DZ().OC();
        GMTrace.o(13413048647680L, 99935);
        return i;
      }
      w.e("MicroMsg.NetSceneQueue", "[arthurdan.getNetworkStatus] Notice!!! autoAuth and autoAuth.getNetworkEvent() is null!!!!");
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.NetSceneQueue", "exception:%s", new Object[] { bg.f(localException) });
      }
      GMTrace.o(13413048647680L, 99935);
    }
    if (am.isConnected(ab.getContext()))
    {
      GMTrace.o(13413048647680L, 99935);
      return 6;
    }
    return 0;
  }
  
  public final boolean DO()
  {
    GMTrace.i(13413182865408L, 99936);
    if (this.gus != null)
    {
      boolean bool = this.gus.DO();
      GMTrace.o(13413182865408L, 99936);
      return bool;
    }
    GMTrace.o(13413182865408L, 99936);
    return true;
  }
  
  public final void DP()
  {
    GMTrace.i(13414256607232L, 99944);
    Vector localVector = this.guu;
    this.guu = new Vector();
    Iterator localIterator = localVector.iterator();
    while (localIterator.hasNext())
    {
      k localk = (k)localIterator.next();
      w.i("MicroMsg.NetSceneQueue", "reset::cancel scene " + localk.getType());
      localk.cancel();
      c(3, -1, "doScene failed clearRunningQueue", localk);
    }
    localVector.clear();
    GMTrace.o(13414256607232L, 99944);
  }
  
  public final void DQ()
  {
    GMTrace.i(13414390824960L, 99945);
    w.i("MicroMsg.NetSceneQueue", "resetDispatcher");
    if (this.gus != null)
    {
      this.gus.reset();
      this.gus = null;
    }
    GMTrace.o(13414390824960L, 99945);
  }
  
  public final void DR()
  {
    GMTrace.i(13415598784512L, 99954);
    for (;;)
    {
      int j;
      synchronized (this.lock)
      {
        if (this.guv.size() > 0)
        {
          k localk = (k)this.guv.get(0);
          int i = localk.priority;
          j = 1;
          if (j < this.guv.size())
          {
            if (((k)this.guv.get(j)).priority > i)
            {
              this.guv.get(j);
              if (DS())
              {
                localk = (k)this.guv.get(j);
                i = localk.priority;
              }
            }
          }
          else
          {
            this.guv.remove(localk);
            w.i("MicroMsg.NetSceneQueue", "waiting2running waitingQueue_size = " + this.guv.size());
            b(localk, 0);
          }
        }
        else
        {
          GMTrace.o(13415598784512L, 99954);
          return;
        }
      }
      j += 1;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    int i = 0;
    GMTrace.i(13415330349056L, 99952);
    paramk.guc = true;
    for (;;)
    {
      synchronized (this.lock)
      {
        this.guu.remove(paramk);
        int j = paramk.getType();
        int k = paramk.hashCode();
        int m = paramk.DI();
        int n = this.guu.size();
        int i1 = this.guv.size();
        if (this.gus == null)
        {
          w.i("MicroMsg.NetSceneQueue", "onSceneEnd mmcgi type:%d hash[%d,%d] run:%d wait:%d autoauth:%d [%d,%d,%s]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
          DR();
          c(paramInt1, paramInt2, paramString, paramk);
          if ((this.guA) && (this.guu.isEmpty()) && (this.guv.isEmpty()))
          {
            paramString = this.guB;
            long l = this.guz;
            paramString.z(l, l);
          }
          GMTrace.o(13415330349056L, 99952);
          return;
        }
      }
      i = this.gus.hashCode();
    }
  }
  
  public final void a(int paramInt, e parame)
  {
    GMTrace.i(13413853954048L, 99941);
    synchronized (this.guw)
    {
      if (!this.guw.containsKey(Integer.valueOf(paramInt))) {
        this.guw.put(Integer.valueOf(paramInt), new HashSet());
      }
      if ((!((Set)this.guw.get(Integer.valueOf(paramInt))).contains(parame)) && (((Set)this.guw.get(Integer.valueOf(paramInt))).add(parame))) {
        ListenerInstanceMonitor.bC(parame);
      }
      GMTrace.o(13413853954048L, 99941);
      return;
    }
  }
  
  public final void a(int paramInt1, String paramString, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(13412780212224L, 99933);
    if (this.gus == null)
    {
      w.e("MicroMsg.NetSceneQueue", "logUtil autoAuth  == null");
      GMTrace.o(13412780212224L, 99933);
      return;
    }
    this.gus.a(paramInt1, paramString, paramInt2, paramBoolean);
    GMTrace.o(13412780212224L, 99933);
  }
  
  public final boolean a(k paramk, int paramInt)
  {
    GMTrace.i(13415061913600L, 99950);
    if ((paramk != null) || (paramInt >= 0))
    {
      bool = true;
      Assert.assertTrue(bool);
      if (this.gut == null) {
        break label63;
      }
    }
    label63:
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("worker thread has not been set", bool);
      if (e(paramk)) {
        break label68;
      }
      GMTrace.o(13415061913600L, 99950);
      return false;
      bool = false;
      break;
    }
    label68:
    b(paramk, paramInt);
    GMTrace.o(13415061913600L, 99950);
    return true;
  }
  
  public final void b(int paramInt, e parame)
  {
    GMTrace.i(13413988171776L, 99942);
    try
    {
      synchronized (this.guw)
      {
        if ((this.guw.get(Integer.valueOf(paramInt)) != null) && (((Set)this.guw.get(Integer.valueOf(paramInt))).remove(parame))) {
          ListenerInstanceMonitor.bD(parame);
        }
        GMTrace.o(13413988171776L, 99942);
        return;
      }
    }
    catch (Exception parame)
    {
      for (;;) {}
    }
  }
  
  public final void bj(boolean paramBoolean)
  {
    GMTrace.i(13412645994496L, 99932);
    this.guA = paramBoolean;
    if (!this.guA)
    {
      this.guB.stopTimer();
      GMTrace.o(13412645994496L, 99932);
      return;
    }
    w.e("MicroMsg.NetSceneQueue", "the working process is ready to be killed");
    aj localaj = this.guB;
    long l = this.guz;
    localaj.z(l, l);
    GMTrace.o(13412645994496L, 99932);
  }
  
  public final void bk(boolean paramBoolean)
  {
    GMTrace.i(13412914429952L, 99934);
    this.foreground = paramBoolean;
    this.gux = Boolean.valueOf(paramBoolean);
    b.bk(paramBoolean);
    if (this.gus == null)
    {
      w.e("MicroMsg.NetSceneQueue", "setForeground autoAuth  == null");
      GMTrace.o(13412914429952L, 99934);
      return;
    }
    this.gus.bm(paramBoolean);
    GMTrace.o(13412914429952L, 99934);
  }
  
  public final void c(k paramk)
  {
    GMTrace.i(13414793478144L, 99948);
    if (paramk == null)
    {
      GMTrace.o(13414793478144L, 99948);
      return;
    }
    w.k("MicroMsg.NetSceneQueue", "cancel sceneHashCode:%d", new Object[] { Integer.valueOf(paramk.hashCode()) });
    paramk.cancel();
    synchronized (this.lock)
    {
      this.guv.remove(paramk);
      this.guu.remove(paramk);
      GMTrace.o(13414793478144L, 99948);
      return;
    }
  }
  
  public final void cancel(final int paramInt)
  {
    GMTrace.i(13414659260416L, 99947);
    w.k("MicroMsg.NetSceneQueue", "cancel sceneHashCode:%d", new Object[] { Integer.valueOf(paramInt) });
    this.gut.A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(13424591372288L, 100021);
        n localn = n.this;
        int i = paramInt;
        synchronized (localn.lock)
        {
          Iterator localIterator = localn.guu.iterator();
          k localk;
          while (localIterator.hasNext())
          {
            localk = (k)localIterator.next();
            if ((localk != null) && (localk.hashCode() == i))
            {
              localn.c(localk);
              GMTrace.o(13424591372288L, 100021);
              return;
            }
          }
          localIterator = localn.guv.iterator();
          while (localIterator.hasNext())
          {
            localk = (k)localIterator.next();
            if ((localk != null) && (localk.hashCode() == i))
            {
              localn.c(localk);
              GMTrace.o(13424591372288L, 100021);
              return;
            }
          }
          GMTrace.o(13424591372288L, 100021);
          return;
        }
      }
      
      public final String toString()
      {
        GMTrace.i(13424725590016L, 100022);
        String str = super.toString() + "|cancelImp_" + paramInt;
        GMTrace.o(13424725590016L, 100022);
        return str;
      }
    });
    GMTrace.o(13414659260416L, 99947);
  }
  
  public final void d(com.tencent.mm.network.e parame)
  {
    GMTrace.i(13413585518592L, 99939);
    this.gus = parame;
    parame.bm(this.foreground);
    DR();
    GMTrace.o(13413585518592L, 99939);
  }
  
  public final boolean d(k paramk)
  {
    GMTrace.i(13414927695872L, 99949);
    boolean bool = a(paramk, 0);
    GMTrace.o(13414927695872L, 99949);
    return bool;
  }
  
  public final String getNetworkServerIp()
  {
    GMTrace.i(13413317083136L, 99937);
    if (this.gus != null)
    {
      String str = this.gus.getNetworkServerIp();
      GMTrace.o(13413317083136L, 99937);
      return str;
    }
    GMTrace.o(13413317083136L, 99937);
    return "unknown";
  }
  
  public final void reset()
  {
    GMTrace.i(13414122389504L, 99943);
    if (this.gus != null) {
      this.gus.reset();
    }
    DP();
    Vector localVector = this.guv;
    this.guv = new Vector();
    Iterator localIterator = localVector.iterator();
    while (localIterator.hasNext())
    {
      k localk = (k)localIterator.next();
      w.i("MicroMsg.NetSceneQueue", "reset::cancel scene " + localk.getType());
      localk.cancel();
      c(3, -1, "doScene failed clearWaitingQueue", localk);
    }
    localVector.clear();
    GMTrace.o(13414122389504L, 99943);
  }
  
  public final com.tencent.mm.network.e wW()
  {
    GMTrace.i(13414525042688L, 99946);
    com.tencent.mm.network.e locale = this.gus;
    GMTrace.o(13414525042688L, 99946);
    return locale;
  }
  
  public static abstract interface a
  {
    public abstract void a(n paramn);
    
    public abstract void a(n paramn, boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ad\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */