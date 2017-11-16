package com.tencent.mm.plugin.emoji.sync;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

public final class a<T extends d>
{
  public BKGLoaderManager kmc;
  
  public a()
  {
    GMTrace.i(11323681275904L, 84368);
    b.a locala = new b.a();
    locala.kmk = 1;
    locala.gKh = 10;
    com.tencent.mm.ao.a.e.a locala1 = new com.tencent.mm.ao.a.e.a();
    locala.kmm = new b.b(locala.kmk, locala.kmk, TimeUnit.MILLISECONDS, locala1, new b.c(locala.gKh, "bkg_loader_"));
    a(new b(locala));
    GMTrace.o(11323681275904L, 84368);
  }
  
  /* Error */
  private void a(b paramb)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 71
    //   5: ldc 73
    //   7: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 75	com/tencent/mm/plugin/emoji/sync/a:kmc	Lcom/tencent/mm/plugin/emoji/sync/BKGLoaderManager;
    //   14: ifnonnull +26 -> 40
    //   17: aload_0
    //   18: new 77	com/tencent/mm/plugin/emoji/sync/BKGLoaderManager
    //   21: dup
    //   22: aload_1
    //   23: invokespecial 79	com/tencent/mm/plugin/emoji/sync/BKGLoaderManager:<init>	(Lcom/tencent/mm/plugin/emoji/sync/b;)V
    //   26: putfield 75	com/tencent/mm/plugin/emoji/sync/a:kmc	Lcom/tencent/mm/plugin/emoji/sync/BKGLoaderManager;
    //   29: ldc2_w 71
    //   32: ldc 73
    //   34: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   37: aload_0
    //   38: monitorexit
    //   39: return
    //   40: ldc 81
    //   42: ldc 83
    //   44: invokestatic 88	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   47: ldc2_w 71
    //   50: ldc 73
    //   52: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   55: goto -18 -> 37
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	this	a
    //   0	63	1	paramb	b
    // Exception table:
    //   from	to	target	type
    //   2	37	58	finally
    //   40	55	58	finally
  }
  
  public final a arF()
  {
    GMTrace.i(11324218146816L, 84372);
    Object localObject = this.kmc;
    if ((((BKGLoaderManager)localObject).kmq) && (((BKGLoaderManager)localObject).kmv))
    {
      localObject = a.kmh;
      GMTrace.o(11324218146816L, 84372);
      return (a)localObject;
    }
    if ((BKGLoaderManager.aqu()) && (!((BKGLoaderManager)localObject).kmq) && (h.arl().kjy.bUZ() > 0))
    {
      localObject = a.kmf;
      GMTrace.o(11324218146816L, 84372);
      return (a)localObject;
    }
    if ((!am.isConnected(ab.getContext())) && (!((BKGLoaderManager)localObject).kmq) && (h.arl().kjy.bUZ() > 0))
    {
      localObject = a.kmg;
      GMTrace.o(11324218146816L, 84372);
      return (a)localObject;
    }
    if (am.isConnected(ab.getContext()))
    {
      if ((((BKGLoaderManager)localObject).kmq) && (((BKGLoaderManager)localObject).kmw))
      {
        localObject = a.kme;
        GMTrace.o(11324218146816L, 84372);
        return (a)localObject;
      }
      if (((BKGLoaderManager)localObject).kmt)
      {
        localObject = a.kmi;
        GMTrace.o(11324218146816L, 84372);
        return (a)localObject;
      }
    }
    localObject = a.kmd;
    GMTrace.o(11324218146816L, 84372);
    return (a)localObject;
  }
  
  public final void dO(boolean paramBoolean)
  {
    GMTrace.i(11324352364544L, 84373);
    this.kmc.kmw = paramBoolean;
    GMTrace.o(11324352364544L, 84373);
  }
  
  public final void v(ArrayList<d> paramArrayList)
  {
    GMTrace.i(11323949711360L, 84370);
    BKGLoaderManager localBKGLoaderManager = this.kmc;
    localBKGLoaderManager.kmp = false;
    if (localBKGLoaderManager.kmz == null) {
      localBKGLoaderManager.kmz = new Vector();
    }
    if (paramArrayList.size() > 0)
    {
      int j = paramArrayList.size();
      int i = 0;
      if (i < j)
      {
        d locald = (d)paramArrayList.get(i);
        if ((locald != null) && (!localBKGLoaderManager.kmz.contains(locald))) {
          localBKGLoaderManager.kmz.add(locald);
        }
        for (;;)
        {
          i += 1;
          break;
          w.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is has exist.:%s", new Object[] { locald.getKey() });
        }
      }
    }
    GMTrace.o(11323949711360L, 84370);
  }
  
  public final void w(ArrayList<d> paramArrayList)
  {
    GMTrace.i(11324083929088L, 84371);
    BKGLoaderManager localBKGLoaderManager = this.kmc;
    if (localBKGLoaderManager.kmB == null) {
      localBKGLoaderManager.kmB = new Vector();
    }
    if (paramArrayList.size() > 0)
    {
      int j = paramArrayList.size();
      int i = 0;
      if (i < j)
      {
        Object localObject = (d)paramArrayList.get(i);
        if ((localBKGLoaderManager.kmx != null) && (localBKGLoaderManager.kmx.equals(localObject))) {
          if (localObject == null)
          {
            localObject = "task is null";
            label99:
            w.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] currentTask equals task is has exist:%s", new Object[] { localObject });
          }
        }
        for (;;)
        {
          i += 1;
          break;
          localObject = ((d)localObject).getKey();
          break label99;
          if ((localObject == null) || (localBKGLoaderManager.kmB.contains(localObject))) {
            break label164;
          }
          localBKGLoaderManager.kmB.add(localObject);
        }
        label164:
        if (localObject == null) {}
        for (localObject = "task is null";; localObject = ((d)localObject).getKey())
        {
          w.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is has exist:%s", new Object[] { localObject });
          break;
        }
      }
    }
    GMTrace.o(11324083929088L, 84371);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(11320325832704L, 84343);
      kmd = new a("Default", 0);
      kme = new a("Syncing", 1);
      kmf = new a("PauseSync", 2);
      kmg = new a("PauseSyncOffline", 3);
      kmh = new a("PauseSyncSDCardFull", 4);
      kmi = new a("FinishSync", 5);
      kmj = new a[] { kmd, kme, kmf, kmg, kmh, kmi };
      GMTrace.o(11320325832704L, 84343);
    }
    
    private a()
    {
      GMTrace.i(11320191614976L, 84342);
      GMTrace.o(11320191614976L, 84342);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\sync\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */