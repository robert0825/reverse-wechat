package com.tencent.mm.plugin.favorite.c;

import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.favorite.b.ah;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.t;
import com.tencent.mm.protocal.c.ud;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class d
  implements com.tencent.mm.ad.e
{
  public Map<String, a> lcY;
  
  public d()
  {
    GMTrace.i(6484192657408L, 48311);
    this.lcY = new HashMap();
    at.wS().a(426, this);
    at.wS().a(401, this);
    GMTrace.o(6484192657408L, 48311);
  }
  
  public static void a(a parama, boolean paramBoolean)
  {
    GMTrace.i(16032441827328L, 119451);
    parama.retryCount -= 1;
    if (parama.retryCount < 0)
    {
      if (SystemClock.elapsedRealtime() - parama.time < 7200000L)
      {
        w.d("MicroMsg.FavEditService", "try mod item fail time limit, favid %d, localId %d, edit type %d", new Object[] { Integer.valueOf(parama.lcA), Long.valueOf(parama.lcB.field_localId), Integer.valueOf(parama.lcB.field_type) });
        GMTrace.o(16032441827328L, 119451);
        return;
      }
      parama.time = SystemClock.elapsedRealtime();
      parama.retryCount = 3;
    }
    if (parama.lcA <= 0)
    {
      localj = com.tencent.mm.plugin.favorite.h.axB().cf(parama.lcB.field_localId);
      if ((localj == null) || (localj.field_id <= 0))
      {
        w.w("MicroMsg.FavEditService", "want to start mod item, but favid is invalid, local id %d", new Object[] { Long.valueOf(parama.lcB.field_localId) });
        GMTrace.o(16032441827328L, 119451);
        return;
      }
      parama.lcA = localj.field_id;
      w.d("MicroMsg.FavEditService", "want mod item, find id %d by local id %d", new Object[] { Integer.valueOf(parama.lcA), Long.valueOf(parama.lcB.field_localId) });
    }
    while (paramBoolean)
    {
      j localj;
      w.d("MicroMsg.FavEditService", "try mod item, enforce %B, favid %d, edit type %d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(parama.lcA), Integer.valueOf(parama.lcB.field_type) });
      parama = new ah(parama.lcA, parama.lcB);
      at.wS().a(parama, 0);
      GMTrace.o(16032441827328L, 119451);
      return;
    }
    w.w("MicroMsg.FavEditService", "want to mod item, favid %d, it is running, but not enforce, return", new Object[] { Integer.valueOf(parama.lcA) });
    GMTrace.o(16032441827328L, 119451);
  }
  
  public static String r(long paramLong, int paramInt)
  {
    GMTrace.i(6484595310592L, 48314);
    String str = paramLong + "&&" + paramInt;
    GMTrace.o(6484595310592L, 48314);
    return str;
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(6484326875136L, 48312);
    if (paramk == null)
    {
      GMTrace.o(6484326875136L, 48312);
      return;
    }
    w.i("MicroMsg.FavEditService", "on edit service scene end, errType=%d errCode=%d, %s, scene type %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramk.getType()) });
    if (paramk.getType() == 401)
    {
      w.d("MicroMsg.FavEditService", "on add fav item scene end, try mod item");
      run();
      GMTrace.o(6484326875136L, 48312);
      return;
    }
    paramString = (ah)paramk;
    if (paramString.type != 0)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramk = r(paramString.ays(), paramString.ayt());
        w.d("MicroMsg.FavEditService", "clear job, key %s", new Object[] { paramk });
        this.lcY.remove(paramk);
        paramk = com.tencent.mm.plugin.favorite.h.axx();
        l = paramString.ays();
        paramInt1 = paramString.ayt();
        paramk.fTZ.delete("FavEditInfo", "localId=? and type=?", new String[] { String.valueOf(l), String.valueOf(paramInt1) });
        paramk = com.tencent.mm.plugin.favorite.h.axB().cf(paramString.ays());
        com.tencent.mm.plugin.report.service.g localg;
        int i;
        int j;
        if (paramk != null)
        {
          localg = com.tencent.mm.plugin.report.service.g.ork;
          paramInt2 = paramk.field_id;
          i = paramk.field_tagProto.ulP.size();
          j = com.tencent.mm.plugin.favorite.h.axu().axR();
          if (paramString.lcB != null) {
            break label316;
          }
        }
        label316:
        for (paramInt1 = 1;; paramInt1 = paramString.lcB.field_scene)
        {
          localg.i(11122, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt1) });
          GMTrace.o(6484326875136L, 48312);
          return;
        }
      }
      long l = paramString.ays();
      paramInt1 = paramString.ayt();
      paramString = r(l, paramInt1);
      w.d("MicroMsg.FavEditService", "retry job, key %s", new Object[] { paramString });
      paramString = (a)this.lcY.get(paramString);
      if (paramString == null)
      {
        w.w("MicroMsg.FavEditService", "want to retry mod item, localid %d, type %d", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt1) });
        GMTrace.o(6484326875136L, 48312);
        return;
      }
      at.xB().h(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6483253133312L, 48304);
          d.a(paramString, false);
          GMTrace.o(6483253133312L, 48304);
        }
        
        public final String toString()
        {
          GMTrace.i(6483387351040L, 48305);
          String str = super.toString() + "|retryJob";
          GMTrace.o(6483387351040L, 48305);
          return str;
        }
      }, 3000L);
    }
    GMTrace.o(6484326875136L, 48312);
  }
  
  public final void run()
  {
    GMTrace.i(6484461092864L, 48313);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6476944900096L, 48257);
        Object localObject = com.tencent.mm.plugin.favorite.h.axx().axF();
        if (localObject == null)
        {
          GMTrace.o(6476944900096L, 48257);
          return;
        }
        w.d("MicroMsg.FavEditService", "infos size %d", new Object[] { Integer.valueOf(((List)localObject).size()) });
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          com.tencent.mm.plugin.favorite.b.g localg = (com.tencent.mm.plugin.favorite.b.g)((Iterator)localObject).next();
          String str = d.r(localg.field_localId, localg.field_type);
          d.a locala = (d.a)d.this.lcY.get(str);
          if (locala == null)
          {
            w.d("MicroMsg.FavEditService", "not match key %s", new Object[] { str });
            locala = new d.a();
            locala.lcB = localg;
            locala.retryCount = 3;
            locala.time = SystemClock.elapsedRealtime();
            d.this.lcY.put(str, locala);
            d.a(locala, true);
          }
          else
          {
            w.d("MicroMsg.FavEditService", "match key %s, check start", new Object[] { str });
            d.a(locala, false);
          }
        }
        GMTrace.o(6476944900096L, 48257);
      }
      
      public final String toString()
      {
        GMTrace.i(6477079117824L, 48258);
        String str = super.toString() + "|run";
        GMTrace.o(6477079117824L, 48258);
        return str;
      }
    });
    GMTrace.o(6484461092864L, 48313);
  }
  
  private static final class a
  {
    int lcA;
    com.tencent.mm.plugin.favorite.b.g lcB;
    int retryCount;
    long time;
    
    public a()
    {
      GMTrace.i(6488487624704L, 48343);
      GMTrace.o(6488487624704L, 48343);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */