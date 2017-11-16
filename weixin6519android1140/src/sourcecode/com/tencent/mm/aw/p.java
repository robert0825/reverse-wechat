package com.tencent.mm.aw;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.lq;
import com.tencent.mm.kernel.a;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.protocal.c.akt;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.bq;
import java.util.Iterator;
import java.util.LinkedList;

public final class p
  extends c<lq>
{
  public p()
  {
    GMTrace.i(12945299865600L, 96450);
    this.vhf = lq.class.getName().hashCode();
    GMTrace.o(12945299865600L, 96450);
  }
  
  private static boolean Kg()
  {
    GMTrace.i(12945434083328L, 96451);
    int i;
    if (com.tencent.mm.kernel.h.xw().wL())
    {
      com.tencent.mm.kernel.h.xw();
      if (!a.wF())
      {
        i = 1;
        if (i == 0) {
          break label352;
        }
        if (bg.aG(bg.a((Long)com.tencent.mm.kernel.h.xy().xh().get(68097, null), 0L)) * 1000L <= 3600000L) {
          break label129;
        }
        i = 1;
      }
    }
    LinkedList localLinkedList;
    for (;;)
    {
      if (i != 0)
      {
        localLinkedList = new LinkedList();
        Object localObject = com.tencent.mm.a.e.d(com.tencent.mm.kernel.h.xy().cachePath + "eggresult.rep", 0, -1);
        if (localObject == null)
        {
          GMTrace.o(12945434083328L, 96451);
          return false;
          i = 0;
          break;
          label129:
          i = 0;
          continue;
        }
        try
        {
          localObject = ((h)new h().aD((byte[])localObject)).gQb.iterator();
          while (((Iterator)localObject).hasNext())
          {
            g localg = (g)((Iterator)localObject).next();
            akt localakt;
            if (localg.gPZ != 0)
            {
              localakt = new akt();
              localakt.oqG = 17;
              localakt.oqQ = (localg.gPO + "," + localg.gPZ);
              localLinkedList.add(localakt);
            }
            if (localg.gQa != 0)
            {
              localakt = new akt();
              localakt.oqG = 18;
              localakt.oqQ = (localg.gPO + "," + localg.gQa);
              localLinkedList.add(localakt);
            }
          }
          if (localLinkedList.isEmpty()) {}
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.PostTaskReportEgg", "exception:%s", new Object[] { bg.f(localException) });
        }
      }
    }
    for (;;)
    {
      bq.a(localLinkedList);
      com.tencent.mm.kernel.h.xy().xh().set(68097, Long.valueOf(bg.Pu()));
      label352:
      w.d("MicroMsg.PostTaskReportEgg", "report egg done");
      GMTrace.o(12945434083328L, 96451);
      return false;
      b.deleteFile(com.tencent.mm.kernel.h.xy().cachePath + "eggresult.rep");
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\aw\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */