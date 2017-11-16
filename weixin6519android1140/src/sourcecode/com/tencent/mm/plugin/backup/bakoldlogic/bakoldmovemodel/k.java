package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.qx;
import com.tencent.mm.plugin.backup.b.f;
import com.tencent.mm.plugin.backup.e.a.b;
import com.tencent.mm.plugin.backup.g.a.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.zero.b.b;
import com.tencent.mm.protocal.c.ek;
import com.tencent.mm.protocal.c.el;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bs;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
{
  public static int iVq;
  private boolean guN;
  private boolean iWK;
  final int iWN;
  private long iWO;
  public b iWQ;
  private com.tencent.mm.sdk.b.c<qx> iWR;
  public d jdL;
  private long jdV;
  public int jeA;
  public int jeB;
  public int jeC;
  public final List<String> jey;
  public int jez;
  private Object lock;
  
  public k(List<String> paramList, int paramInt)
  {
    GMTrace.i(14749454565376L, 109892);
    this.iWK = false;
    this.lock = new Object();
    this.jez = 0;
    this.jeA = 0;
    this.jeB = 0;
    this.jeC = 0;
    this.iWO = 0L;
    this.iWQ = ((b)com.tencent.mm.kernel.h.h(b.class));
    this.jdV = 0L;
    w.i("MicroMsg.RecoverMerger", "new RecoverMerger, msgDataIdList size:%d, totalSession:%d", new Object[] { Integer.valueOf(paramList.size()), Integer.valueOf(paramInt) });
    this.jey = paramList;
    this.iWN = paramInt;
    GMTrace.o(14749454565376L, 109892);
  }
  
  public final int a(String paramString, HashMap<String, Integer> paramHashMap, com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.c paramc, HashSet<String> paramHashSet)
  {
    GMTrace.i(14749991436288L, 109896);
    l = System.currentTimeMillis();
    localObject1 = com.tencent.mm.a.e.d(paramString, 0, -1);
    try
    {
      localel = (el)new el().aD((byte[])localObject1);
      paramString = localel.jhd.iterator();
    }
    catch (Exception paramHashMap)
    {
      el localel;
      for (;;)
      {
        synchronized (this.lock)
        {
          if (this.guN)
          {
            g.ork.i(11790, new Object[] { Integer.valueOf(0), Integer.valueOf(0) });
            w.i("MicroMsg.RecoverMerger", "backupImp canceled");
            GMTrace.o(14749991436288L, 109896);
            return -1;
            paramHashMap = paramHashMap;
            if (localObject1 == null)
            {
              i = 0;
              w.printErrStackTrace("MicroMsg.RecoverMerger", paramHashMap, "read mmPath errr %s, %s, len:%d", new Object[] { paramString, paramHashMap, Integer.valueOf(i) });
              GMTrace.o(14749991436288L, 109896);
              return 0;
            }
            i = localObject1.length;
            continue;
          }
          if (bg.aH(this.iWO) > 1800000L)
          {
            this.iWQ.bIL().V(3600000L);
            this.iWO = bg.Pv();
          }
        }
        try
        {
          a.b.a((ek)localObject1, paramHashMap, paramHashSet, new HashMap());
          this.jeC += 1;
          bJ(this.jeC, this.jez);
          f.kv(((ek)localObject1).jib);
          paramc.afU();
          continue;
          paramString = finally;
          throw paramString;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.RecoverMerger", localException, "readFromSdcard err", new Object[0]);
          }
        }
      }
      f.aez();
      w.d("MicroMsg.RecoverMerger", "read item time " + (System.currentTimeMillis() - l));
      int i = localel.jhd.size();
      GMTrace.o(14749991436288L, 109896);
      return i;
    }
    if (paramString.hasNext()) {
      localObject1 = (ek)paramString.next();
    }
  }
  
  public final void aex()
  {
    GMTrace.i(14750259871744L, 109898);
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      this.jdL = null;
      this.iWK = false;
      this.jez = 0;
      this.jeA = 0;
      this.jeB = 0;
      GMTrace.o(14750259871744L, 109898);
      return;
    }
  }
  
  public final void aey()
  {
    GMTrace.i(14750394089472L, 109899);
    if (this.iWR != null)
    {
      com.tencent.mm.sdk.b.a.vgX.c(this.iWR);
      this.iWR = null;
    }
    GMTrace.o(14750394089472L, 109899);
  }
  
  /* Error */
  public final void agi()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 280
    //   5: ldc_w 282
    //   8: invokestatic 53	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 55	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k:iWK	Z
    //   15: ifeq +23 -> 38
    //   18: ldc 81
    //   20: ldc_w 284
    //   23: invokestatic 287	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   26: ldc2_w 280
    //   29: ldc_w 282
    //   32: invokestatic 107	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: aload_0
    //   39: iconst_1
    //   40: putfield 55	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k:iWK	Z
    //   43: ldc 81
    //   45: ldc_w 289
    //   48: invokestatic 174	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   51: bipush -22
    //   53: putstatic 291	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k:iVq	I
    //   56: aload_0
    //   57: getfield 268	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k:iWR	Lcom/tencent/mm/sdk/b/c;
    //   60: ifnonnull +26 -> 86
    //   63: aload_0
    //   64: new 6	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k$1
    //   67: dup
    //   68: aload_0
    //   69: invokespecial 294	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k$1:<init>	(Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k;)V
    //   72: putfield 268	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k:iWR	Lcom/tencent/mm/sdk/b/c;
    //   75: getstatic 274	com/tencent/mm/sdk/b/a:vgX	Lcom/tencent/mm/sdk/b/a;
    //   78: aload_0
    //   79: getfield 268	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k:iWR	Lcom/tencent/mm/sdk/b/c;
    //   82: invokevirtual 297	com/tencent/mm/sdk/b/a:b	(Lcom/tencent/mm/sdk/b/c;)Z
    //   85: pop
    //   86: aload_0
    //   87: getfield 77	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k:iWQ	Lcom/tencent/mm/plugin/zero/b/b;
    //   90: invokeinterface 192 1 0
    //   95: ldc2_w 193
    //   98: invokevirtual 200	com/tencent/mm/y/bs:V	(J)Z
    //   101: pop
    //   102: ldc2_w 280
    //   105: ldc_w 282
    //   108: invokestatic 107	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   111: goto -76 -> 35
    //   114: astore_1
    //   115: aload_0
    //   116: monitorexit
    //   117: aload_1
    //   118: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	this	k
    //   114	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	35	114	finally
    //   38	86	114	finally
    //   86	111	114	finally
  }
  
  public final void bJ(final int paramInt1, final int paramInt2)
  {
    GMTrace.i(14749857218560L, 109895);
    if ((this.jdV != 0L) && (bg.aI(this.jdV) < 100L))
    {
      GMTrace.o(14749857218560L, 109895);
      return;
    }
    this.jdV = bg.Pw();
    if ((!this.guN) && (this.jdL != null)) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14747709734912L, 109879);
          if (k.this.jdL != null)
          {
            k.this.jdL.bI(paramInt1, paramInt2);
            GMTrace.o(14747709734912L, 109879);
            return;
          }
          w.e("MicroMsg.RecoverMerger", "operatorCallback is null.");
          GMTrace.o(14747709734912L, 109879);
        }
      });
    }
    GMTrace.o(14749857218560L, 109895);
  }
  
  public final void cancel()
  {
    GMTrace.i(14750125654016L, 109897);
    synchronized (this.lock)
    {
      w.i("MicroMsg.RecoverMerger", "cancel");
      this.guN = true;
      this.iWQ.bIL().BN();
      aey();
      w.i("MicroMsg.RecoverMerger", "recover cancel and restart sync");
      aex();
      GMTrace.o(14750125654016L, 109897);
      return;
    }
  }
  
  public final int getItemCount()
  {
    GMTrace.i(14749723000832L, 109894);
    Iterator localIterator = this.jey.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      try
      {
        localObject = com.tencent.mm.a.e.d(com.tencent.mm.plugin.backup.a.h.aer() + "backupItem/" + com.tencent.mm.plugin.backup.bakoldlogic.a.d.ti((String)localObject) + (String)localObject, 0, -1);
        int j = ((el)new el().aD((byte[])localObject)).jhd.size();
        i = j + i;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.RecoverMerger", localException, "getItemCount: ", new Object[0]);
      }
    }
    GMTrace.o(14749723000832L, 109894);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldmovemodel\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */