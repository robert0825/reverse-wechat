package com.tencent.mm.plugin.welab;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.ry;
import com.tencent.mm.protocal.c.vp;
import com.tencent.mm.protocal.c.vq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public final class f
{
  private static boolean DEBUG;
  public static boolean mRunning;
  
  static
  {
    GMTrace.i(15677704372224L, 116808);
    mRunning = false;
    DEBUG = false;
    GMTrace.o(15677704372224L, 116808);
  }
  
  public static void Cq()
  {
    GMTrace.i(15676362194944L, 116798);
    long l = System.currentTimeMillis() / 1000L;
    h.xy().xh().a(w.a.vxU, Long.valueOf(l));
    GMTrace.o(15676362194944L, 116798);
  }
  
  public static void Cr()
  {
    GMTrace.i(15676630630400L, 116800);
    h.xy().xh().kL(true);
    GMTrace.o(15676630630400L, 116800);
  }
  
  static void F(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(16004121886720L, 119240);
    w.i("MicroMsg.WelabUpdater", "tryToUpdate isUpgrade %s, isManualAuth %s ", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    if (!h.xw().wL())
    {
      w.i("MicroMsg.WelabUpdater", "Update aborted, Account not ready.");
      GMTrace.o(16004121886720L, 119240);
      return;
    }
    if ((!DEBUG) && (!paramBoolean1) && (!paramBoolean2))
    {
      localObject = (Long)h.xy().xh().get(w.a.vxU, null);
      long l1;
      if (localObject == null)
      {
        l1 = 0L;
        if (l1 != 0L) {
          break label178;
        }
        i = new Random().nextInt(86400);
        fF(i);
        Cq();
        Cr();
        w.i("MicroMsg.WelabUpdater", "First update ignored. Next update: %d", new Object[] { Integer.valueOf(i) });
        i = 1;
      }
      for (;;)
      {
        if (i != 0) {
          break label315;
        }
        w.v("MicroMsg.WelabUpdater", "No need to update");
        GMTrace.o(16004121886720L, 119240);
        return;
        l1 = ((Long)localObject).longValue();
        break;
        label178:
        localObject = (Integer)h.xy().xh().get(w.a.vxV, null);
        label212:
        long l2;
        long l3;
        if ((localObject == null) || (((Integer)localObject).intValue() == 0))
        {
          i = 86400;
          l2 = i;
          l3 = System.currentTimeMillis() / 1000L;
          if (l3 <= l1 + l2) {
            break label305;
          }
        }
        label305:
        for (boolean bool = true;; bool = false)
        {
          w.i("MicroMsg.WelabUpdater", "Need Update: %b, Last Update Time: %d, Update Interval: %d, Current Time: %d", new Object[] { Boolean.valueOf(bool), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3) });
          if (l3 <= l1 + l2) {
            break label310;
          }
          i = 1;
          break;
          i = ((Integer)localObject).intValue();
          break label212;
        }
        label310:
        i = 0;
      }
    }
    label315:
    if (mRunning)
    {
      w.i("MicroMsg.WelabUpdater", "Updating");
      GMTrace.o(16004121886720L, 119240);
      return;
    }
    mRunning = true;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new vp();
    ((b.a)localObject).gtG = new vq();
    ((b.a)localObject).uri = "/cgi-bin/mmux-bin/getlabsinfo";
    ((b.a)localObject).gtE = 1816;
    localObject = ((b.a)localObject).DA();
    vp localvp = (vp)((com.tencent.mm.ad.b)localObject).gtC.gtK;
    Integer localInteger = (Integer)h.xy().xh().get(w.a.vxW, null);
    if (localInteger == null) {}
    for (int i = 0;; i = localInteger.intValue())
    {
      localvp.uok = i;
      localvp.uol = bGw();
      localvp.uom = ((int)bg.Pu());
      if (paramBoolean1) {
        localvp.eQl |= 0x1;
      }
      if (paramBoolean2) {
        localvp.eQl |= 0x2;
      }
      w.i("MicroMsg.WelabUpdater", "update abtest: %s", new Object[] { as(localvp.uol) });
      u.a((com.tencent.mm.ad.b)localObject, new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(15661866680320L, 116690);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            w.e("MicroMsg.WelabUpdater", "Update Error: %d, %d, next update will be performed %d(s) later", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(86400) });
            f.Cq();
            f.fF(86400);
            f.Cr();
            GMTrace.o(15661866680320L, 116690);
            return 0;
          }
          paramAnonymousString = (vq)paramAnonymousb.gtD.gtK;
          f.Cq();
          f.fG(paramAnonymousString.uhM);
          f.fF(paramAnonymousString.uoo);
          f.y(paramAnonymousString.uop);
          f.x(paramAnonymousString.uon);
          f.Cr();
          w.i("MicroMsg.WelabUpdater", "Update Interval: %d", new Object[] { Integer.valueOf(paramAnonymousString.uoo) });
          f.mRunning = false;
          GMTrace.o(15661866680320L, 116690);
          return 0;
        }
      });
      GMTrace.o(16004121886720L, 119240);
      return;
    }
  }
  
  private static String as(LinkedList<ry> paramLinkedList)
  {
    GMTrace.i(15676093759488L, 116796);
    Iterator localIterator = paramLinkedList.iterator();
    ry localry;
    for (paramLinkedList = ""; localIterator.hasNext(); paramLinkedList = paramLinkedList + localry.ufJ + ":" + localry.priority + "|") {
      localry = (ry)localIterator.next();
    }
    GMTrace.o(15676093759488L, 116796);
    return paramLinkedList;
  }
  
  private static LinkedList<ry> bGw()
  {
    GMTrace.i(15676227977216L, 116797);
    Object localObject = b.bGu().saK.bGD();
    LinkedList localLinkedList = new LinkedList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      com.tencent.mm.plugin.welab.c.a.a locala = (com.tencent.mm.plugin.welab.c.a.a)((Iterator)localObject).next();
      ry localry = new ry();
      localry.ufJ = bg.getInt(locala.field_expId, 0);
      localry.priority = locala.field_prioritylevel;
      localLinkedList.add(localry);
    }
    GMTrace.o(15676227977216L, 116797);
    return localLinkedList;
  }
  
  public static void fF(int paramInt)
  {
    GMTrace.i(15676496412672L, 116799);
    int i = 0;
    if (paramInt == 0) {}
    for (i = 86400;; i = new Random().nextInt(126000) + 3600) {
      do
      {
        h.xy().xh().a(w.a.vxV, Integer.valueOf(i));
        GMTrace.o(15676496412672L, 116799);
        return;
      } while ((paramInt >= 3600) && (paramInt <= 129600));
    }
  }
  
  public static void fG(int paramInt)
  {
    GMTrace.i(16085860483072L, 119849);
    h.xy().xh().a(w.a.vxW, Integer.valueOf(paramInt));
    GMTrace.o(16085860483072L, 119849);
  }
  
  public static void x(List<com.tencent.mm.bm.b> paramList)
  {
    GMTrace.i(16085592047616L, 119847);
    if ((paramList == null) || (paramList.size() == 0))
    {
      w.w("MicroMsg.WelabUpdater", "No Exp");
      GMTrace.o(16085592047616L, 119847);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      com.tencent.mm.plugin.welab.c.a.a locala = g.Nn(n.a((com.tencent.mm.bm.b)paramList.next()));
      if ((locala != null) && (locala.isValid()))
      {
        localArrayList.add(locala);
        com.tencent.mm.plugin.welab.d.b.bGI().f(locala);
        e.o(locala.field_LabsAppId, 8, com.tencent.mm.plugin.welab.d.b.bGI().e(locala));
      }
    }
    w.i("MicroMsg.WelabUpdater", "save exp " + localArrayList);
    b.bGu().saK.bV(localArrayList);
    GMTrace.o(16085592047616L, 119847);
  }
  
  public static void y(List<Integer> paramList)
  {
    GMTrace.i(16085726265344L, 119848);
    if (bg.cc(paramList))
    {
      w.w("MicroMsg.WelabUpdater", "No expired Exp");
      GMTrace.o(16085726265344L, 119848);
      return;
    }
    w.i("MicroMsg.WelabUpdater", "expired exp " + paramList);
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Integer localInteger = (Integer)paramList.next();
      com.tencent.mm.plugin.welab.c.a.a locala = new com.tencent.mm.plugin.welab.c.a.a();
      locala.field_expId = localInteger.toString();
      b.bGu().saK.b(locala, new String[] { "expId" });
      if (!TextUtils.isEmpty(locala.field_LabsAppId))
      {
        locala.field_Switch = 3;
        localArrayList.add(locala);
      }
    }
    b.bGu().saK.bV(localArrayList);
    GMTrace.o(16085726265344L, 119848);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\welab\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */