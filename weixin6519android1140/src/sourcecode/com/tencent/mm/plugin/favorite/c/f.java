package com.tencent.mm.plugin.favorite.c;

import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.plugin.favorite.b.ah;
import com.tencent.mm.plugin.favorite.b.b;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.b.z;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.aox;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public final class f
  implements com.tencent.mm.ad.e
{
  public static Map<Integer, g.a> eyW;
  public static Map<Integer, Integer> ldb;
  private Queue<j> eyU;
  public boolean eyY;
  public int eyZ;
  public long eza;
  public aj eze;
  public boolean running;
  
  static
  {
    GMTrace.i(6494661640192L, 48389);
    eyW = new HashMap();
    ldb = new HashMap();
    GMTrace.o(6494661640192L, 48389);
  }
  
  public f()
  {
    GMTrace.i(6492514156544L, 48373);
    this.running = false;
    this.eyZ = 0;
    this.eza = 0L;
    this.eyY = false;
    this.eyU = new LinkedList();
    this.eze = new aj(at.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(6477347553280L, 48260);
        try
        {
          f.this.ayx();
          GMTrace.o(6477347553280L, 48260);
          return false;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.FavModService", localException, "", new Object[0]);
          }
        }
      }
      
      public final String toString()
      {
        GMTrace.i(6477481771008L, 48261);
        String str = super.toString() + "|scenePusher";
        GMTrace.o(6477481771008L, 48261);
        return str;
      }
    }, false);
    at.wS().a(426, this);
    GMTrace.o(6492514156544L, 48373);
  }
  
  public final void a(final int paramInt1, final int paramInt2, String paramString, final com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(6492648374272L, 48374);
    if (paramk.getType() != 426)
    {
      GMTrace.o(6492648374272L, 48374);
      return;
    }
    if (!(paramk instanceof ah))
    {
      GMTrace.o(6492648374272L, 48374);
      return;
    }
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6494930075648L, 48391);
        f.this.eyY = false;
        int i = ((ah)paramk).lcA;
        f.eyW.remove(Integer.valueOf(i));
        Object localObject;
        if ((paramInt2 != 3) || (paramInt2 != 0))
        {
          localObject = f.this;
          ((f)localObject).eyZ -= 1;
        }
        j localj = h.axB().cg(i);
        if ((localj == null) || (localj.field_itemStatus == 10))
        {
          GMTrace.o(6494930075648L, 48391);
          return;
        }
        if ((paramInt1 == 0) && (paramInt2 == 0)) {
          if (localj.field_itemStatus == 17)
          {
            g.ork.i(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(localj.field_type), Integer.valueOf(0), Long.valueOf(x.k(localj)), Long.valueOf(x.ck(localj.field_localId)) });
            w.v("MicroMsg.FavModService", "mod end set status done. favId:%d", new Object[] { Integer.valueOf(localj.field_id) });
            localj.field_itemStatus = 10;
            h.axB().a(localj, new String[] { "localId" });
            h.axw().cd(localj.field_localId);
          }
        }
        while (f.this.eyZ > 0)
        {
          if (f.this.ayx()) {
            break label492;
          }
          x.startSync();
          GMTrace.o(6494930075648L, 48391);
          return;
          Integer localInteger = Integer.valueOf(bg.a((Integer)f.ldb.get(Integer.valueOf(i)), 0));
          localObject = localInteger;
          if (paramInt1 != 1)
          {
            localObject = localInteger;
            if (paramInt1 != 0) {
              localObject = Integer.valueOf(localInteger.intValue() - 1);
            }
          }
          if (((Integer)localObject).intValue() <= 0)
          {
            int j = x.cc(paramInt1, paramInt2);
            g.ork.i(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(localj.field_type), Integer.valueOf(j), Long.valueOf(x.k(localj)), Long.valueOf(x.ck(localj.field_localId)) });
            f.ldb.remove(Integer.valueOf(i));
            w.e("MicroMsg.FavModService", "achieved retry limit, set error, favId:%d", new Object[] { Integer.valueOf(i) });
            localj.field_itemStatus = 18;
            h.axB().a(localj, new String[] { "localId" });
          }
        }
        w.d("MicroMsg.FavModService", "klem stopFlag <= 0 , Stop Service");
        f.this.qH();
        label492:
        GMTrace.o(6494930075648L, 48391);
      }
      
      public final String toString()
      {
        GMTrace.i(6495064293376L, 48392);
        String str = super.toString() + "|onSceneEnd";
        GMTrace.o(6495064293376L, 48392);
        return str;
      }
    });
    GMTrace.o(6492648374272L, 48374);
  }
  
  public final boolean ayx()
  {
    GMTrace.i(16032844480512L, 119454);
    this.eza = System.currentTimeMillis();
    Object localObject1;
    Object localObject2;
    if ((!this.eyY) && (this.eyU.size() == 0))
    {
      localObject1 = h.axB();
      localObject2 = "select " + com.tencent.mm.plugin.favorite.b.k.lbe + " from FavItemInfo where itemStatus" + "=17";
      localObject2 = ((com.tencent.mm.plugin.favorite.b.k)localObject1).fTZ.a((String)localObject2, null, 2);
      if (localObject2 == null)
      {
        localObject1 = null;
        if ((localObject1 != null) && (((List)localObject1).size() != 0)) {
          break label195;
        }
      }
    }
    else
    {
      label99:
      if ((this.eyY) || (this.eyU.size() > 0)) {
        break label401;
      }
      qH();
      w.d("MicroMsg.FavModService", "klem No Data Any More , Stop Service");
      GMTrace.o(16032844480512L, 119454);
      return false;
    }
    Object localObject3;
    if (((Cursor)localObject2).moveToFirst())
    {
      localObject1 = new ArrayList();
      do
      {
        localObject3 = new j();
        ((j)localObject3).b((Cursor)localObject2);
        ((List)localObject1).add(localObject3);
      } while (((Cursor)localObject2).moveToNext());
    }
    for (;;)
    {
      ((Cursor)localObject2).close();
      break;
      label195:
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (j)((Iterator)localObject1).next();
        if (eyW.containsKey(Integer.valueOf(((j)localObject2).field_id)))
        {
          w.d("MicroMsg.FavModService", "File is Already running:" + ((j)localObject2).field_id);
        }
        else
        {
          if (!ldb.containsKey(Integer.valueOf(((j)localObject2).field_id))) {
            ldb.put(Integer.valueOf(((j)localObject2).field_id), Integer.valueOf(3));
          }
          this.eyU.add(localObject2);
          eyW.put(Integer.valueOf(((j)localObject2).field_id), null);
        }
      }
      w.d("MicroMsg.FavModService", "klem GetNeedRun procing:" + eyW.size() + ",send:" + this.eyU.size() + "]");
      this.eyU.size();
      break label99;
      label401:
      if ((!this.eyY) && (this.eyU.size() > 0))
      {
        localObject1 = (j)this.eyU.poll();
        if ((localObject1 != null) && (((j)localObject1).field_id > 0))
        {
          this.eyY = true;
          localObject2 = new LinkedList();
          localObject3 = new LinkedList();
          if (((j)localObject1).field_type != 18)
          {
            z.a(((j)localObject1).field_localId, (LinkedList)localObject2, (LinkedList)localObject3);
            localObject1 = new ah(((j)localObject1).field_id, (LinkedList)localObject2, (LinkedList)localObject3);
            at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
          }
          for (;;)
          {
            GMTrace.o(16032844480512L, 119454);
            return true;
            aox localaox = new aox();
            localaox.uEL = 1;
            localaox.uEM = ((int)bg.Pu());
            ((LinkedList)localObject2).add(localaox);
            localObject1 = new ah(((j)localObject1).field_id, (LinkedList)localObject2, (LinkedList)localObject3, j.b((j)localObject1));
            at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
          }
        }
      }
      GMTrace.o(16032844480512L, 119454);
      return false;
      localObject1 = null;
    }
  }
  
  public final void qH()
  {
    GMTrace.i(6492916809728L, 48376);
    this.eyU.clear();
    eyW.clear();
    this.running = false;
    this.eyY = false;
    ldb.clear();
    GMTrace.o(6492916809728L, 48376);
  }
  
  public final void run()
  {
    GMTrace.i(6492782592000L, 48375);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6496003817472L, 48399);
        long l = System.currentTimeMillis() - f.this.eza;
        if (f.this.running)
        {
          if (l < 60000L)
          {
            GMTrace.o(6496003817472L, 48399);
            return;
          }
          w.e("MicroMsg.FavModService", "klem ERR: Try Run service runningFlag:" + f.this.running + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + f.this.running);
        }
        f.this.eyY = false;
        f.this.running = true;
        f.this.eyZ = 3;
        f.this.eze.z(10L, 10L);
        GMTrace.o(6496003817472L, 48399);
      }
      
      public final String toString()
      {
        GMTrace.i(6496138035200L, 48400);
        String str = super.toString() + "|run";
        GMTrace.o(6496138035200L, 48400);
        return str;
      }
    });
    GMTrace.o(6492782592000L, 48375);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */