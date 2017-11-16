package com.tencent.mm.ao;

import android.database.Cursor;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.bu.g;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public final class h
  implements e, com.tencent.mm.ad.f
{
  public static Set<Integer> gIa;
  private Queue<d> eyU;
  public boolean eyY;
  public int eyZ;
  public long eza;
  g.a ezd;
  public aj eze;
  public LinkedList<k> gIb;
  public a gIc;
  public boolean gId;
  private k.a gIe;
  public boolean running;
  
  static
  {
    GMTrace.i(3548314075136L, 26437);
    gIa = new HashSet();
    GMTrace.o(3548314075136L, 26437);
  }
  
  public h()
  {
    GMTrace.i(3545361285120L, 26415);
    this.gIb = new LinkedList();
    this.gIc = null;
    this.gId = false;
    this.gIe = new k.a()
    {
      public final void IM()
      {
        GMTrace.i(3530194681856L, 26302);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(3541334753280L, 26385);
            w.i("MicroMsg.ImgService", "on image upload end. queue size : " + h.this.gIb.size());
            h.this.gId = false;
            if (h.this.gIb.size() > 0)
            {
              k localk = (k)h.this.gIb.poll();
              if (localk != null)
              {
                w.i("MicroMsg.ImgService", "upload image scene hashcode : " + localk.hashCode());
                com.tencent.mm.kernel.h.xx().fYr.a(localk, 0);
                h.this.gId = true;
                GMTrace.o(3541334753280L, 26385);
                return;
              }
              w.w("MicroMsg.ImgService", "poll image scene is null");
            }
            GMTrace.o(3541334753280L, 26385);
          }
        });
        GMTrace.o(3530194681856L, 26302);
      }
    };
    this.eyU = new LinkedList();
    this.running = false;
    this.eyZ = 0;
    this.eza = 0L;
    this.eyY = false;
    this.ezd = new g.a();
    com.tencent.mm.kernel.h.xz();
    this.eze = new aj(com.tencent.mm.kernel.h.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(3512075288576L, 26167);
        try
        {
          h.this.qG();
          GMTrace.o(3512075288576L, 26167);
          return false;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.ImgService", "exception:%s", new Object[] { bg.f(localException) });
          }
        }
      }
      
      public final String toString()
      {
        GMTrace.i(3512209506304L, 26168);
        String str = super.toString() + "|scenePusher";
        GMTrace.o(3512209506304L, 26168);
        return str;
      }
    }, false);
    if (com.tencent.mm.kernel.h.xx().fYr != null) {
      com.tencent.mm.kernel.h.xx().fYr.a(110, this);
    }
    this.gIb.clear();
    this.gId = false;
    GMTrace.o(3545361285120L, 26415);
  }
  
  private void a(final k paramk)
  {
    GMTrace.i(3545763938304L, 26418);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3530463117312L, 26304);
        w.i("MicroMsg.ImgService", "offer to queue ? %b, scene hashcode %d", new Object[] { Boolean.valueOf(h.this.gId), Integer.valueOf(paramk.hashCode()) });
        if (h.this.gId)
        {
          h.this.gIb.offer(paramk);
          GMTrace.o(3530463117312L, 26304);
          return;
        }
        com.tencent.mm.kernel.h.xx().fYr.a(paramk, 0);
        h.this.gId = true;
        GMTrace.o(3530463117312L, 26304);
      }
    });
    GMTrace.o(3545763938304L, 26418);
  }
  
  public static boolean gt(int paramInt)
  {
    GMTrace.i(3545092849664L, 26413);
    boolean bool = gIa.add(Integer.valueOf(paramInt));
    GMTrace.o(3545092849664L, 26413);
    return bool;
  }
  
  public static boolean gu(int paramInt)
  {
    GMTrace.i(3545227067392L, 26414);
    boolean bool = gIa.remove(Integer.valueOf(paramInt));
    GMTrace.o(3545227067392L, 26414);
    return bool;
  }
  
  public static void gv(int paramInt)
  {
    GMTrace.i(3545898156032L, 26419);
    w.w("MicroMsg.ImgService", "setImgError, %d", new Object[] { Integer.valueOf(paramInt) });
    d locald = n.IZ().gr(paramInt);
    if ((locald == null) || (locald.gGR <= 0L))
    {
      GMTrace.o(3545898156032L, 26419);
      return;
    }
    Object localObject = n.IZ().gs((int)locald.gGR);
    if (localObject != null)
    {
      ((d)localObject).dB(-1);
      ((d)localObject).eQl = 264;
      n.IZ().a((int)((d)localObject).gGR, (d)localObject);
    }
    for (localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(((d)localObject).gGZ); ((ce)localObject).field_msgId != locald.gGZ; localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(locald.gGZ))
    {
      GMTrace.o(3545898156032L, 26419);
      return;
      locald.dB(-1);
      locald.eQl = 264;
      n.IZ().a(paramInt, locald);
    }
    ((au)localObject).dB(5);
    com.tencent.mm.plugin.report.d.oqe.a(111L, 31L, 1L, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a((int)((ce)localObject).field_msgId, (au)localObject);
    GMTrace.o(3545898156032L, 26419);
  }
  
  public final void a(int paramInt1, int paramInt2, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(3546435026944L, 26423);
    paramk = (k)paramk;
    if ((this.gIc != null) && (paramk != null) && (paramk.eAH != null)) {
      this.gIc.a(paramk.eAH.field_msgId, paramInt1, paramInt2);
    }
    GMTrace.o(3546435026944L, 26423);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, final com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(3546032373760L, 26420);
    w.d("MicroMsg.ImgService", "onSceneEnd errType %d, errCode %d, errMsg %s ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    a locala;
    long l;
    if ((paramk instanceof k))
    {
      paramString = (k)paramk;
      if ((this.gIc != null) && (paramString != null) && (paramString.eAH != null))
      {
        locala = this.gIc;
        l = paramString.eAH.field_msgId;
        if (paramString.eAH.field_status == 5) {
          break label142;
        }
      }
    }
    label142:
    for (boolean bool = true;; bool = false)
    {
      locala.a(l, bool);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(3544824414208L, 26411);
          if (paramk.getType() != 110)
          {
            GMTrace.o(3544824414208L, 26411);
            return;
          }
          if (!(paramk instanceof k))
          {
            GMTrace.o(3544824414208L, 26411);
            return;
          }
          h.this.eyY = false;
          int i = (int)((k)paramk).gIm;
          h.gIa.remove(Integer.valueOf(i));
          if (h.this.eyZ > 0)
          {
            h.this.qG();
            GMTrace.o(3544824414208L, 26411);
            return;
          }
          h.this.qH();
          GMTrace.o(3544824414208L, 26411);
        }
        
        public final String toString()
        {
          GMTrace.i(3544958631936L, 26412);
          String str = super.toString() + "|onSceneEnd";
          GMTrace.o(3544958631936L, 26412);
          return str;
        }
      });
      GMTrace.o(3546032373760L, 26420);
      return;
    }
  }
  
  public final void a(String paramString1, String paramString2, ArrayList<String> paramArrayList, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    GMTrace.i(3545495502848L, 26416);
    paramArrayList = paramArrayList.iterator();
    if (paramArrayList.hasNext())
    {
      String str = (String)paramArrayList.next();
      if (q.a(str, paramString2, paramBoolean)) {}
      for (int i = 1;; i = 0)
      {
        w.v("MicroMsg.ImgService", "pushsendimage, param.compressImg:%b, compresstype:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(i) });
        a(new k(3, paramString1, paramString2, str, i, this, paramInt1, this.gIe, paramInt2));
        break;
      }
    }
    GMTrace.o(3545495502848L, 26416);
  }
  
  public final void a(ArrayList<Integer> paramArrayList, String paramString1, String paramString2, ArrayList<String> paramArrayList1, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    GMTrace.i(3545629720576L, 26417);
    Iterator localIterator = paramArrayList1.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      int k = ((Integer)paramArrayList.get(i)).intValue();
      if (q.a(str, paramString2, paramBoolean)) {}
      for (int j = 1;; j = 0)
      {
        paramArrayList1 = "";
        d locald = n.IZ().gr(k);
        if (locald != null) {
          paramArrayList1 = locald.gHc;
        }
        paramArrayList1 = new k(k, 3, paramString1, paramString2, str, j, this, paramInt1, paramArrayList1, "", paramInt2);
        paramArrayList1.gIK = new k.b(paramArrayList1, this.gIe);
        a(paramArrayList1);
        i += 1;
        break;
      }
    }
    GMTrace.o(3545629720576L, 26417);
  }
  
  public final void qG()
  {
    GMTrace.i(16021704409088L, 119371);
    this.eza = System.currentTimeMillis();
    Object localObject2;
    Object localObject3;
    int j;
    if ((!this.eyY) && (this.eyU.size() == 0))
    {
      localObject2 = n.IZ();
      localObject1 = "select * " + " FROM ImgInfo2";
      localObject1 = (String)localObject1 + " WHERE iscomplete= 0 AND totalLen != 0 ";
      localObject3 = ((f)localObject2).goN.a((String)localObject1, null, 0);
      j = ((Cursor)localObject3).getCount();
      w.d("MicroMsg.ImgInfoStorage", "getUnfinishInfo resCount:" + j);
      if (j != 0) {
        break label203;
      }
      ((Cursor)localObject3).close();
      localObject1 = null;
      if ((localObject1 != null) && (((List)localObject1).size() != 0)) {
        break label339;
      }
      w.i("MicroMsg.ImgService", "get need run info by search db, but size is 0.");
    }
    label203:
    int i;
    for (;;)
    {
      if ((this.eyY) || (this.eyU.size() > 0)) {
        break label626;
      }
      qH();
      w.d("MicroMsg.ImgService", "No Data Any More , Stop Service");
      GMTrace.o(16021704409088L, 119371);
      return;
      localObject1 = new ArrayList();
      i = 0;
      if (i < j)
      {
        ((Cursor)localObject3).moveToPosition(i);
        d locald1 = new d();
        locald1.b((Cursor)localObject3);
        d locald2 = ((f)localObject2).gs((int)locald1.gGR);
        if (locald2 != null) {
          if ((locald2.eSf != 0L) || (locald2.gGZ != 0L)) {
            ((List)localObject1).add(locald1);
          }
        }
        for (;;)
        {
          i += 1;
          break;
          if ((locald1.eSf != 0L) || (locald1.gGZ != 0L)) {
            ((List)localObject1).add(locald1);
          }
        }
      }
      ((Cursor)localObject3).close();
      break;
      label339:
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (d)((Iterator)localObject1).next();
        if (bg.nm(((d)localObject2).gGS))
        {
          w.i("MicroMsg.ImgService", "the process is killed while selecting pic");
        }
        else
        {
          localObject3 = n.IZ().gs((int)((d)localObject2).gGR);
          if (localObject3 == null) {}
          for (i = (int)((d)localObject2).gGR;; i = (int)((d)localObject3).gGR)
          {
            if (!gIa.contains(Integer.valueOf(i))) {
              break label468;
            }
            w.d("MicroMsg.ImgService", "File is Already running:" + ((d)localObject2).gGR);
            break;
          }
          label468:
          if (localObject3 != null)
          {
            if ((((d)localObject3).gGZ <= 0L) || (((d)localObject3).eSf > 0L) || (((d)localObject2).offset > ((d)localObject2).gsL) || (((d)localObject2).status == -1) || (((d)localObject3).status == -1)) {}
          }
          else
          {
            for (;;)
            {
              if (((d)localObject2).gGY + 600 >= bg.Pu()) {
                break label598;
              }
              gv((int)((d)localObject2).gGR);
              break;
              if ((((d)localObject2).gGZ <= 0L) || (((d)localObject2).eSf > 0L) || (((d)localObject2).offset > ((d)localObject2).gsL) || (((d)localObject2).status == -1)) {
                break;
              }
            }
            label598:
            this.eyU.add(localObject2);
          }
        }
      }
      this.eyU.size();
    }
    label626:
    Object localObject1 = null;
    if ((!this.eyY) && (this.eyU.size() > 0))
    {
      label724:
      while (this.eyU.size() > 0)
      {
        localObject1 = (d)this.eyU.poll();
        localObject2 = n.IZ().gs((int)((d)localObject1).gGR);
        if (localObject2 == null) {}
        for (i = (int)((d)localObject1).gGR;; i = (int)((d)localObject2).gGR)
        {
          if (!gIa.contains(Integer.valueOf(i))) {
            break label724;
          }
          localObject1 = null;
          break;
        }
      }
      this.eyY = true;
      if ((localObject1 != null) && (((d)localObject1).gGR > 0L))
      {
        localObject2 = n.IZ().gs((int)((d)localObject1).gGR);
        if (localObject2 == null) {
          break label807;
        }
        w.d("MicroMsg.ImgService", "try upload hdinfo ");
      }
    }
    for (localObject1 = new k((int)((d)localObject2).gGR, 1);; localObject1 = new k((int)((d)localObject1).gGR, 0))
    {
      com.tencent.mm.kernel.h.xx().fYr.a((com.tencent.mm.ad.k)localObject1, 0);
      GMTrace.o(16021704409088L, 119371);
      return;
      label807:
      w.d("MicroMsg.ImgService", "try upload normalinfo ");
    }
  }
  
  public final void qH()
  {
    GMTrace.i(3546166591488L, 26421);
    this.eyU.clear();
    this.running = false;
    w.d("MicroMsg.ImgService", "Finish service use time(ms):" + this.ezd.tD());
    GMTrace.o(3546166591488L, 26421);
  }
  
  public final void run()
  {
    GMTrace.i(3546300809216L, 26422);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3544421761024L, 26408);
        long l = System.currentTimeMillis() - h.this.eza;
        if (h.this.running)
        {
          if (l < 60000L)
          {
            GMTrace.o(3544421761024L, 26408);
            return;
          }
          w.e("MicroMsg.ImgService", "ERR: Try Run service runningFlag:" + h.this.running + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + h.this.running);
        }
        h.this.running = true;
        h.this.eyZ = 3;
        h.this.ezd.fSo = SystemClock.elapsedRealtime();
        h.this.eze.z(10L, 10L);
        GMTrace.o(3544421761024L, 26408);
      }
      
      public final String toString()
      {
        GMTrace.i(3544555978752L, 26409);
        String str = super.toString() + "|run";
        GMTrace.o(3544555978752L, 26409);
        return str;
      }
    });
    GMTrace.o(3546300809216L, 26422);
  }
  
  public static abstract interface a
  {
    public abstract void a(long paramLong, int paramInt1, int paramInt2);
    
    public abstract void a(long paramLong, boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */