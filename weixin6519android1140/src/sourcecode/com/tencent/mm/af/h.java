package com.tencent.mm.af;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.kernel.b;
import com.tencent.mm.protocal.c.akk;
import com.tencent.mm.protocal.c.akl;
import com.tencent.mm.protocal.c.akn;
import com.tencent.mm.protocal.c.btz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class h
  implements e
{
  Object gwY;
  Set<String> gwZ;
  public LinkedList<a> gxa;
  
  public h()
  {
    GMTrace.i(4550652067840L, 33905);
    this.gwY = new Object();
    this.gwZ = new HashSet();
    this.gxa = new LinkedList();
    GMTrace.o(4550652067840L, 33905);
  }
  
  private void b(LinkedList<btz> paramLinkedList)
  {
    GMTrace.i(4551323156480L, 33910);
    for (;;)
    {
      int i;
      synchronized (this.gwY)
      {
        ArrayList localArrayList = new ArrayList(this.gxa);
        i = 0;
        if (i < localArrayList.size())
        {
          a locala = (a)localArrayList.get(i);
          if (locala != null) {
            locala.c(paramLinkedList);
          }
        }
        else
        {
          GMTrace.o(4551323156480L, 33910);
          return;
        }
      }
      i += 1;
    }
  }
  
  public final void W(String paramString1, String paramString2)
  {
    GMTrace.i(4551054721024L, 33908);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      w.e("MicroMsg.BizKFService", "doKFGetDefaultList error args, %s, %s", new Object[] { paramString1, paramString2 });
      GMTrace.o(4551054721024L, 33908);
      return;
    }
    if (this.gwZ.contains(paramString2))
    {
      w.i("MicroMsg.BizKFService", "doKFGetInfoList: same is running, %s", new Object[] { paramString2 });
      GMTrace.o(4551054721024L, 33908);
      return;
    }
    this.gwZ.add(paramString2);
    Object localObject = new LinkedList();
    ((LinkedList)localObject).add(paramString2);
    localObject = new v(paramString1, (LinkedList)localObject);
    ((v)localObject).tag = paramString2;
    com.tencent.mm.kernel.h.xx().fYr.a((k)localObject, 0);
    w.i("MicroMsg.BizKFService", "doKFGetInfoList %s, %s, %d", new Object[] { paramString1, paramString2, Integer.valueOf(this.gxa.size()) });
    GMTrace.o(4551054721024L, 33908);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(4551188938752L, 33909);
    w.i("MicroMsg.BizKFService", "onSceneEnd errType = %s, errCode = %s, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramk == null)
    {
      w.e("MicroMsg.BizKFService", "scene == null");
      b(null);
      GMTrace.o(4551188938752L, 33909);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w.e("MicroMsg.BizKFService", "scene.getType() = %s", new Object[] { Integer.valueOf(paramk.getType()) });
      b(null);
      if (paramk.getType() == 675) {
        this.gwZ.remove(((v)paramk).tag);
      }
      GMTrace.o(4551188938752L, 33909);
      return;
    }
    w.i("MicroMsg.BizKFService", "scene.getType() = %s", new Object[] { Integer.valueOf(paramk.getType()) });
    com.tencent.mm.ac.i locali = com.tencent.mm.ac.n.Di();
    LinkedList localLinkedList = new LinkedList();
    paramString = null;
    long l = System.currentTimeMillis();
    Iterator localIterator;
    btz localbtz;
    com.tencent.mm.ac.h localh;
    if (paramk.getType() == 672)
    {
      if (((u)paramk).FC() == null)
      {
        w.e("MicroMsg.BizKFService", "resp is null, type = %s", new Object[] { Integer.valueOf(paramk.getType()) });
        b(null);
        GMTrace.o(4551188938752L, 33909);
        return;
      }
      paramString = ((u)paramk).FC().uzK;
      if ((paramString == null) || (paramString.size() <= 0))
      {
        w.e("MicroMsg.BizKFService", "empty workers");
        b(null);
        GMTrace.o(4551188938752L, 33909);
        return;
      }
      localIterator = paramString.iterator();
      while (localIterator.hasNext())
      {
        localbtz = (btz)localIterator.next();
        localLinkedList.add(new g(localbtz.vcF, ((u)paramk).gxy, localbtz.lQe, localbtz.uBf, 1, l));
        if (locali != null)
        {
          localh = new com.tencent.mm.ac.h();
          localh.username = localbtz.vcF;
          localh.gsT = localbtz.lQe;
          localh.bi(false);
          localh.fiZ = 3;
          locali.a(localh);
          com.tencent.mm.ac.n.Dv().hT(localbtz.vcF);
        }
      }
    }
    for (;;)
    {
      w.i("MicroMsg.BizKFService", "insertOrUpdateBizKFs %d", new Object[] { Integer.valueOf(x.FF().d(localLinkedList)) });
      b(paramString);
      GMTrace.o(4551188938752L, 33909);
      return;
      if (paramk.getType() == 675)
      {
        this.gwZ.remove(((v)paramk).tag);
        if (((v)paramk).FD() == null)
        {
          w.e("MicroMsg.BizKFService", "KFGetInfoList resp is null, type = %s", new Object[] { Integer.valueOf(paramk.getType()) });
          b(null);
          GMTrace.o(4551188938752L, 33909);
          return;
        }
        paramString = ((v)paramk).FD().uzK;
        if ((paramString == null) || (paramString.size() <= 0))
        {
          w.e("MicroMsg.BizKFService", "empty workers");
          b(null);
          GMTrace.o(4551188938752L, 33909);
          return;
        }
        localIterator = paramString.iterator();
        while (localIterator.hasNext())
        {
          localbtz = (btz)localIterator.next();
          w.i("MicroMsg.BizKFService", "onScenEnd: workers=%s, tag=%s", new Object[] { localbtz.vcF, ((v)paramk).tag });
          localLinkedList.add(new g(localbtz.vcF, ((v)paramk).gxy, localbtz.lQe, localbtz.uBf, ((v)paramk).gxz, l));
          if (locali != null)
          {
            localh = new com.tencent.mm.ac.h();
            localh.username = localbtz.vcF;
            localh.gsT = localbtz.lQe;
            localh.bi(false);
            localh.fiZ = 3;
            locali.a(localh);
            com.tencent.mm.ac.n.Dv().hT(localbtz.vcF);
          }
        }
      }
      else if (paramk.getType() == 674)
      {
        if (((t)paramk).FB() == null)
        {
          w.e("MicroMsg.BizKFService", "resp is null, type = %s", new Object[] { Integer.valueOf(paramk.getType()) });
          b(null);
          GMTrace.o(4551188938752L, 33909);
          return;
        }
        paramString = ((t)paramk).FB().uzK;
        if ((paramString == null) || (paramString.size() <= 0))
        {
          w.e("MicroMsg.BizKFService", "empty workers");
          b(null);
          GMTrace.o(4551188938752L, 33909);
          return;
        }
        localIterator = paramString.iterator();
        while (localIterator.hasNext())
        {
          localbtz = (btz)localIterator.next();
          localLinkedList.add(new g(localbtz.vcF, ((t)paramk).gxy, localbtz.lQe, localbtz.uBf, 2, l));
          if (locali != null)
          {
            localh = new com.tencent.mm.ac.h();
            localh.username = localbtz.vcF;
            localh.gsT = localbtz.lQe;
            localh.bi(false);
            localh.fiZ = 3;
            locali.a(localh);
            com.tencent.mm.ac.n.Dv().hT(localbtz.vcF);
          }
        }
      }
    }
  }
  
  public final void a(a parama)
  {
    GMTrace.i(4550786285568L, 33906);
    synchronized (this.gwY)
    {
      if (!this.gxa.contains(parama))
      {
        Iterator localIterator = this.gxa.iterator();
        while (localIterator.hasNext())
        {
          a locala = (a)localIterator.next();
          if ((parama != null) && (locala != null) && (bg.nl(parama.Fy()).equals(bg.nl(locala.Fy()))))
          {
            w.i("MicroMsg.BizKFService", "the same callbacker %s, return", new Object[] { parama.Fy() });
            GMTrace.o(4550786285568L, 33906);
            return;
          }
        }
        this.gxa.add(parama);
      }
      GMTrace.o(4550786285568L, 33906);
      return;
    }
  }
  
  public final void b(a parama)
  {
    GMTrace.i(4550920503296L, 33907);
    synchronized (this.gwY)
    {
      if (this.gxa.contains(parama)) {
        this.gxa.remove(parama);
      }
      GMTrace.o(4550920503296L, 33907);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract String Fy();
    
    public abstract void c(LinkedList<btz> paramLinkedList);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */