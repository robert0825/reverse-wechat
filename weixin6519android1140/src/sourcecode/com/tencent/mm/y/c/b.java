package com.tencent.mm.y.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.ry;
import com.tencent.mm.protocal.c.vp;
import com.tencent.mm.protocal.c.vq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public final class b
{
  public static boolean mRunning;
  
  static
  {
    GMTrace.i(636460466176L, 4742);
    mRunning = false;
    GMTrace.o(636460466176L, 4742);
  }
  
  static void Co()
  {
    GMTrace.i(634715635712L, 4729);
    if (!h.xw().wL())
    {
      w.i("MicroMsg.ABTestUpdater", "Update aborted, Account not ready.");
      GMTrace.o(634715635712L, 4729);
      return;
    }
    Object localObject = (Long)h.xy().xh().get(w.a.vrG, null);
    long l1;
    int i;
    if (localObject == null)
    {
      l1 = 0L;
      if (l1 != 0L) {
        break label139;
      }
      i = new Random().nextInt(86400);
      fF(i);
      Cq();
      Cr();
      w.i("MicroMsg.ABTestUpdater", "First update ignored. Next update: %d", new Object[] { Integer.valueOf(i) });
      i = 1;
    }
    for (;;)
    {
      if (i != 0) {
        break label272;
      }
      w.v("MicroMsg.ABTestUpdater", "No need to update");
      GMTrace.o(634715635712L, 4729);
      return;
      l1 = ((Long)localObject).longValue();
      break;
      label139:
      localObject = (Integer)h.xy().xh().get(w.a.vrH, null);
      label173:
      long l2;
      long l3;
      if ((localObject == null) || (((Integer)localObject).intValue() == 0))
      {
        i = 86400;
        l2 = i;
        l3 = System.currentTimeMillis() / 1000L;
        if (l3 <= l1 + l2) {
          break label261;
        }
      }
      label261:
      for (boolean bool = true;; bool = false)
      {
        w.i("MicroMsg.ABTestUpdater", "Need Update: %b, Last Update Time: %d, Update Interval: %d, Current Time: %d", new Object[] { Boolean.valueOf(bool), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3) });
        if (l3 <= l1 + l2) {
          break label267;
        }
        i = 1;
        break;
        i = ((Integer)localObject).intValue();
        break label173;
      }
      label267:
      i = 0;
    }
    label272:
    if (mRunning)
    {
      w.i("MicroMsg.ABTestUpdater", "Updating");
      GMTrace.o(634715635712L, 4729);
      return;
    }
    update();
    GMTrace.o(634715635712L, 4729);
  }
  
  static void Cp()
  {
    GMTrace.i(634849853440L, 4730);
    if (!h.xw().wL())
    {
      w.i("MicroMsg.ABTestUpdater", "UpdateWithoutIntervalLimit aborted, Account not ready.");
      GMTrace.o(634849853440L, 4730);
      return;
    }
    if (mRunning)
    {
      w.i("MicroMsg.ABTestUpdater", "UpdateWithoutIntervalLimit, Already Updating");
      GMTrace.o(634849853440L, 4730);
      return;
    }
    w.i("MicroMsg.ABTestUpdater", "UpdateWithoutIntervalLimit, before do update");
    update();
    GMTrace.o(634849853440L, 4730);
  }
  
  public static void Cq()
  {
    GMTrace.i(635118288896L, 4732);
    long l = System.currentTimeMillis() / 1000L;
    h.xy().xh().a(w.a.vrG, Long.valueOf(l));
    GMTrace.o(635118288896L, 4732);
  }
  
  public static void Cr()
  {
    GMTrace.i(635386724352L, 4734);
    h.xy().xh().kL(true);
    GMTrace.o(635386724352L, 4734);
  }
  
  public static void fF(int paramInt)
  {
    GMTrace.i(635252506624L, 4733);
    int i = 0;
    if (paramInt == 0) {}
    for (i = 86400;; i = new Random().nextInt(126000) + 3600) {
      do
      {
        h.xy().xh().a(w.a.vrH, Integer.valueOf(i));
        GMTrace.o(635252506624L, 4733);
        return;
      } while ((paramInt >= 3600) && (paramInt <= 129600));
    }
  }
  
  public static void fG(int paramInt)
  {
    GMTrace.i(16087068442624L, 119858);
    h.xy().xh().a(w.a.vrF, Integer.valueOf(paramInt));
    GMTrace.o(16087068442624L, 119858);
  }
  
  private static void update()
  {
    GMTrace.i(634984071168L, 4731);
    mRunning = true;
    Object localObject1 = new b.a();
    ((b.a)localObject1).gtF = new vp();
    ((b.a)localObject1).gtG = new vq();
    ((b.a)localObject1).uri = "/cgi-bin/mmux-bin/getabtest";
    ((b.a)localObject1).gtE = 1801;
    com.tencent.mm.ad.b localb = ((b.a)localObject1).DA();
    localObject1 = (vp)localb.gtC.gtK;
    Object localObject2 = (Integer)h.xy().xh().get(w.a.vrF, null);
    if (localObject2 == null) {}
    for (int i = 0;; i = ((Integer)localObject2).intValue())
    {
      ((vp)localObject1).uok = i;
      ((vp)localObject1).uol = c.Ct().bSe();
      ((vp)localObject1).uol.addAll(c.Cu().bSe());
      localObject2 = ((vp)localObject1).uol.iterator();
      ry localry;
      for (localObject1 = ""; ((Iterator)localObject2).hasNext(); localObject1 = (String)localObject1 + localry.ufJ + ":" + localry.priority + "|") {
        localry = (ry)((Iterator)localObject2).next();
      }
    }
    w.i("MicroMsg.ABTestUpdater", "update abtest: %s", new Object[] { localObject1 });
    u.a(localb, new u.a()
    {
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
      {
        GMTrace.i(636728901632L, 4744);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          w.e("MicroMsg.ABTestUpdater", "Update Error: %d, %d, next update will be performed %d(s) later", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(86400) });
          b.Cq();
          b.fF(86400);
          b.Cr();
          GMTrace.o(636728901632L, 4744);
          return 0;
        }
        paramAnonymousString = (vq)paramAnonymousb.gtD.gtK;
        b.Cq();
        b.fG(paramAnonymousString.uhM);
        b.fF(paramAnonymousString.uoo);
        b.y(paramAnonymousString.uop);
        b.x(paramAnonymousString.uon);
        b.Cr();
        w.i("MicroMsg.ABTestUpdater", "Update Interval: %d", new Object[] { Integer.valueOf(paramAnonymousString.uoo) });
        b.mRunning = false;
        GMTrace.o(636728901632L, 4744);
        return 0;
      }
    }, true);
    GMTrace.o(634984071168L, 4731);
  }
  
  public static void x(List<com.tencent.mm.bm.b> paramList)
  {
    GMTrace.i(16086800007168L, 119856);
    if ((paramList == null) || (paramList.size() == 0))
    {
      w.w("MicroMsg.ABTestUpdater", "No Exp");
      GMTrace.o(16086800007168L, 119856);
      return;
    }
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      a.a locala = a.hj(n.a((com.tencent.mm.bm.b)paramList.next()));
      localLinkedList1.addAll(locala.gpU);
      localLinkedList2.addAll(locala.gpV);
    }
    c.Ct().j(localLinkedList1, 0);
    c.Cu().j(localLinkedList2, 1);
    GMTrace.o(16086800007168L, 119856);
  }
  
  public static void y(List<Integer> paramList)
  {
    GMTrace.i(16086934224896L, 119857);
    if (bg.cc(paramList))
    {
      w.w("MicroMsg.ABTestUpdater", "No expired Exp");
      GMTrace.o(16086934224896L, 119857);
      return;
    }
    Object localObject1 = c.Ct();
    Object localObject2;
    Object localObject3;
    if (!bg.cc(paramList))
    {
      localObject2 = paramList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Integer)((Iterator)localObject2).next();
        if (localObject3 != null)
        {
          com.tencent.mm.storage.c localc = new com.tencent.mm.storage.c();
          localc.field_expId = String.valueOf(localObject3);
          ((d)localObject1).a(localc, new String[] { "expId" });
        }
      }
    }
    localObject1 = c.Cu();
    if (!bg.cc(paramList))
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        localObject2 = (Integer)paramList.next();
        if (localObject2 != null)
        {
          localObject3 = new com.tencent.mm.storage.a();
          ((com.tencent.mm.storage.a)localObject3).field_expId = String.valueOf(localObject2);
          ((com.tencent.mm.storage.b)localObject1).a((com.tencent.mm.sdk.e.c)localObject3, new String[] { "expId" });
        }
      }
    }
    GMTrace.o(16086934224896L, 119857);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */