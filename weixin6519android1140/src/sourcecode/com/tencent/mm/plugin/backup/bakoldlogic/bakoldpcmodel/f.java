package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.e.a.b;
import com.tencent.mm.plugin.backup.g.a.a;
import com.tencent.mm.plugin.backup.g.b.a;
import com.tencent.mm.plugin.backup.h.ab;
import com.tencent.mm.plugin.backup.h.ac;
import com.tencent.mm.plugin.backup.h.r;
import com.tencent.mm.protocal.c.ek;
import com.tencent.mm.protocal.c.el;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class f
  implements com.tencent.mm.ad.f
{
  boolean eIE;
  boolean guN;
  boolean iWK;
  public HashSet<String> jdK;
  private com.tencent.mm.ad.e jdM;
  boolean jdN;
  public List<com.tencent.mm.plugin.backup.h.t> jep;
  public e.d jfF;
  public int jfG;
  public List<com.tencent.mm.plugin.backup.h.t> jfZ;
  public int jga;
  public boolean jgb;
  public long jgc;
  long jgd;
  int jge;
  public Object lock;
  
  public f()
  {
    GMTrace.i(14778848247808L, 110111);
    this.lock = new Object();
    this.eIE = false;
    this.guN = false;
    this.jdK = new HashSet();
    this.jdN = false;
    this.jga = 0;
    this.jgb = false;
    this.iWK = false;
    this.jfG = 0;
    GMTrace.o(14778848247808L, 110111);
  }
  
  public static int X(List<com.tencent.mm.plugin.backup.h.t> paramList)
  {
    GMTrace.i(14779519336448L, 110116);
    paramList = paramList.iterator();
    int i = 0;
    while (paramList.hasNext())
    {
      Object localObject = (com.tencent.mm.plugin.backup.h.t)paramList.next();
      try
      {
        localObject = com.tencent.mm.a.e.d(h.aer() + "backupItem/" + com.tencent.mm.plugin.backup.bakoldlogic.a.d.ti(((com.tencent.mm.plugin.backup.h.t)localObject).ID) + ((com.tencent.mm.plugin.backup.h.t)localObject).ID, 0, -1);
        int j = ((el)new el().aD((byte[])localObject)).jhd.size();
        i = j + i;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.RecoverPCServer", localException, "", new Object[0]);
      }
    }
    GMTrace.o(14779519336448L, 110116);
    return i;
  }
  
  public final int a(String paramString, HashMap<String, Integer> paramHashMap, com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.c paramc, HashSet<String> paramHashSet)
  {
    GMTrace.i(14779787771904L, 110118);
    long l = System.currentTimeMillis();
    Object localObject1 = com.tencent.mm.a.e.d(paramString, 0, -1);
    el localel;
    try
    {
      localel = (el)new el().aD((byte[])localObject1);
      paramString = localel.jhd.iterator();
      for (;;)
      {
        if (paramString.hasNext())
        {
          localObject1 = (ek)paramString.next();
          if ((this.eIE) && (!this.guN)) {}
          try
          {
            a.b.a((ek)localObject1, paramHashMap, paramHashSet, new HashMap());
            this.jfG += 1;
            if (this.jfG % 100 == 0) {
              agB();
            }
            com.tencent.mm.plugin.backup.b.f.kv(((ek)localObject1).jib);
            paramc.afU();
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.e("MicroMsg.RecoverPCServer", "readFromSdcard err:" + localException.toString());
              w.printErrStackTrace("MicroMsg.RecoverPCServer", localException, "", new Object[0]);
            }
          }
        }
      }
    }
    catch (Exception paramHashMap)
    {
      synchronized (this.lock)
      {
        try
        {
          this.lock.wait();
          if (this.guN)
          {
            w.i("MicroMsg.RecoverPCServer", "backupImp canceled");
            GMTrace.o(14779787771904L, 110118);
            return -1;
            paramHashMap = paramHashMap;
            if (localObject1 == null) {}
            for (i = 0;; i = localObject1.length)
            {
              w.e("MicroMsg.RecoverPCServer", "read mmPath errr %s, %s, len:%d", new Object[] { paramString, paramHashMap, Integer.valueOf(i) });
              w.printErrStackTrace("MicroMsg.RecoverPCServer", paramHashMap, "", new Object[0]);
              GMTrace.o(14779787771904L, 110118);
              return 0;
            }
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.RecoverPCServer", localInterruptedException, "", new Object[0]);
          }
        }
      }
    }
    com.tencent.mm.plugin.backup.b.f.aez();
    w.d("MicroMsg.RecoverPCServer", "read item time " + (System.currentTimeMillis() - l));
    int i = localel.jhd.size();
    GMTrace.o(14779787771904L, 110118);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, k paramk)
  {
    GMTrace.i(14780056207360L, 110120);
    this.jgd += paramInt1;
    if (this.jgc == 0L) {}
    for (paramInt1 = 0;; paramInt1 = (int)(this.jgd * 100L / this.jgc))
    {
      if (paramInt1 > this.jge)
      {
        this.jge = paramInt1;
        com.tencent.mm.plugin.backup.bakoldlogic.c.c.setProgress(this.jge);
      }
      if ((this.eIE) || (this.guN) || (this.jfF == null) || (this.jge < 0) || (this.jge > 100)) {
        break;
      }
      this.jfF.kQ(this.jge);
      GMTrace.o(14780056207360L, 110120);
      return;
    }
    w.d("MicroMsg.RecoverPCServer", "failed to call operatorCallback.onNetProgress:%d", new Object[] { Integer.valueOf(this.jge) });
    GMTrace.o(14780056207360L, 110120);
  }
  
  public final void agA()
  {
    GMTrace.i(14779385118720L, 110115);
    if ((!this.jdN) || (this.guN))
    {
      GMTrace.o(14779385118720L, 110115);
      return;
    }
    synchronized (this.lock)
    {
      if (this.jdK.isEmpty())
      {
        if (this.guN)
        {
          GMTrace.o(14779385118720L, 110115);
          return;
        }
        this.jgb = true;
        this.jge = 0;
        a.agk().agl().jfR = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdn;
        a.agk().agl().jfS = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdd;
        if (this.jfF != null)
        {
          this.jfF.aga();
          com.tencent.mm.plugin.backup.f.b.b(7, this.jdM);
          bJ(0, 0);
          e.agv();
          w.i("MicroMsg.RecoverPCServer", "checkRecover publicRestAccUinEven");
        }
      }
      else
      {
        GMTrace.o(14779385118720L, 110115);
        return;
      }
      w.i("MicroMsg.RecoverPCServer", "operatorCallback is null");
    }
  }
  
  public final void agB()
  {
    GMTrace.i(14779921989632L, 110119);
    System.gc();
    long l1 = Runtime.getRuntime().freeMemory() / 1000L;
    long l2 = Runtime.getRuntime().totalMemory() / 1000L;
    w.i("MicroMsg.RecoverPCServer", "memoryInfo avail/total, dalvik[%dk, %dk, user:%dk], recoverCnt:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l2 - l1), Integer.valueOf(this.jfG) });
    GMTrace.o(14779921989632L, 110119);
  }
  
  public final void agz()
  {
    GMTrace.i(16049219043328L, 119576);
    com.tencent.mm.a.e.f(new File(h.aer()));
    this.jdM = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String arg3, k paramAnonymousk)
      {
        GMTrace.i(14792806891520L, 110215);
        paramAnonymousk = (com.tencent.mm.plugin.backup.bakoldlogic.c.c)paramAnonymousk;
        w.i("MicroMsg.RecoverPCServer", "onSceneEnd %s, %d, %d", new Object[] { paramAnonymousk.id, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        synchronized (f.this.lock)
        {
          f.this.jdK.remove(paramAnonymousk.id);
          w.i("MicroMsg.RecoverPCServer", "onSceneEnd left: size:%d", new Object[] { Integer.valueOf(f.this.jdK.size()) });
          if (f.this.jdK.size() <= 10) {
            f.this.lock.notifyAll();
          }
          ??? = f.this;
          ???.jfG += 1;
          if (f.this.jfG % 300 == 0) {
            f.this.agB();
          }
          f.this.agA();
          GMTrace.o(14792806891520L, 110215);
          return;
        }
      }
    };
    com.tencent.mm.plugin.backup.f.b.a(7, this.jdM);
    Iterator localIterator1 = this.jfZ.iterator();
    int i;
    for (;;)
    {
      if (localIterator1.hasNext())
      {
        com.tencent.mm.plugin.backup.h.t localt1 = (com.tencent.mm.plugin.backup.h.t)localIterator1.next();
        if ((this.eIE) && (!this.guN)) {
          w.i("MicroMsg.RecoverPCServer", "hit pause");
        }
        synchronized (this.lock)
        {
          try
          {
            this.lock.wait();
            if (this.guN)
            {
              w.i("MicroMsg.RecoverPCServer", "backupImp canceled");
              GMTrace.o(16049219043328L, 119576);
              return;
            }
          }
          catch (InterruptedException localInterruptedException3)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.RecoverPCServer", localInterruptedException3, "", new Object[0]);
            }
          }
        }
        com.tencent.mm.plugin.backup.bakoldlogic.c.c localc1 = new com.tencent.mm.plugin.backup.bakoldlogic.c.c(h.aer(), localt1.ID, 2, localt1.jhV, this, a.agk().iVs);
        synchronized (this.lock)
        {
          localc1.afx();
          this.jdK.add(localt1.ID);
          w.i("MicroMsg.RecoverPCServer", "media recoverImp now: size:%d", new Object[] { Integer.valueOf(this.jdK.size()) });
          i = this.jdK.size();
          if (i <= 10) {}
        }
        try
        {
          this.lock.wait();
          continue;
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
        catch (InterruptedException localInterruptedException1)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.RecoverPCServer", localInterruptedException1, "", new Object[0]);
          }
        }
      }
    }
    Iterator localIterator2 = this.jep.iterator();
    for (;;)
    {
      if (localIterator2.hasNext())
      {
        com.tencent.mm.plugin.backup.h.t localt2 = (com.tencent.mm.plugin.backup.h.t)localIterator2.next();
        if ((this.eIE) && (!this.guN)) {
          w.i("MicroMsg.RecoverPCServer", "hit pause");
        }
        synchronized (this.lock)
        {
          try
          {
            this.lock.wait();
            if (this.guN)
            {
              w.i("MicroMsg.RecoverPCServer", "backupImp canceled");
              GMTrace.o(16049219043328L, 119576);
              return;
            }
          }
          catch (InterruptedException localInterruptedException4)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.RecoverPCServer", localInterruptedException4, "", new Object[0]);
            }
          }
        }
        com.tencent.mm.plugin.backup.bakoldlogic.c.c localc2 = new com.tencent.mm.plugin.backup.bakoldlogic.c.c(h.aer(), localt2.ID, 1, localt2.jhV, this, a.agk().iVs);
        synchronized (this.lock)
        {
          localc2.afx();
          this.jdK.add(localt2.ID);
          w.i("MicroMsg.RecoverPCServer", "digest recoverImp now: size:%d", new Object[] { Integer.valueOf(this.jdK.size()) });
          i = this.jdK.size();
          if (i <= 10) {}
        }
        try
        {
          this.lock.wait();
          continue;
          localObject4 = finally;
          throw ((Throwable)localObject4);
        }
        catch (InterruptedException localInterruptedException2)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.RecoverPCServer", localInterruptedException2, "", new Object[0]);
          }
        }
      }
    }
    this.jdN = true;
    w.i("MicroMsg.RecoverPCServer", "send RestoreData req finish");
    agA();
    GMTrace.o(16049219043328L, 119576);
  }
  
  public final void bJ(int paramInt1, int paramInt2)
  {
    GMTrace.i(14779653554176L, 110117);
    if (paramInt1 == 0) {}
    int i;
    for (long l = 0L;; l = paramInt1 * 100L / paramInt2)
    {
      i = (int)l;
      if (((paramInt1 == 0) && (paramInt2 == 0)) || (i > this.jga)) {
        break;
      }
      GMTrace.o(14779653554176L, 110117);
      return;
    }
    this.jga = i;
    if ((!this.eIE) && (!this.guN) && (this.jfF != null) && (this.jga >= 0) && (this.jga <= 100)) {
      this.jfF.kR(this.jga);
    }
    ab localab = new ab();
    localab.jgO = 13;
    localab.jip = 0;
    localab.jiq = this.jga;
    try
    {
      w.i("MicroMsg.RecoverPCServer", "send progress cmd, progress :%d", new Object[] { Integer.valueOf(i) });
      com.tencent.mm.plugin.backup.f.b.r(localab.toByteArray(), 3);
      GMTrace.o(14779653554176L, 110117);
      return;
    }
    catch (IOException localIOException)
    {
      w.printErrStackTrace("MicroMsg.RecoverPCServer", localIOException, "", new Object[0]);
      w.e("MicroMsg.RecoverPCServer", "buf to PacketCommandRequest err");
      GMTrace.o(14779653554176L, 110117);
    }
  }
  
  public final void cancel()
  {
    GMTrace.i(14779250900992L, 110114);
    w.i("MicroMsg.RecoverPCServer", "cancel");
    this.guN = true;
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      com.tencent.mm.plugin.backup.f.b.b(7, this.jdM);
      this.jfF = null;
      this.jgb = false;
      this.iWK = false;
      this.jga = 0;
      this.jge = 0;
      GMTrace.o(14779250900992L, 110114);
      return;
    }
  }
  
  public final void pause()
  {
    GMTrace.i(14778982465536L, 110112);
    w.i("MicroMsg.RecoverPCServer", "pause");
    this.eIE = true;
    GMTrace.o(14778982465536L, 110112);
  }
  
  public final void resume()
  {
    GMTrace.i(14779116683264L, 110113);
    w.i("MicroMsg.RecoverPCServer", "resume");
    this.eIE = false;
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      GMTrace.o(14779116683264L, 110113);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldpcmodel\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */