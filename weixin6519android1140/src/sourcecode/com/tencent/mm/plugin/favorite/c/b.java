package com.tencent.mm.plugin.favorite.c;

import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.favorite.b.ad;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public final class b
  implements com.tencent.mm.ad.e
{
  public static Map<Long, g.a> eyW;
  private Queue<j> eyU;
  public boolean eyY;
  public long eza;
  public aj eze;
  public com.tencent.mm.network.n gzE;
  public boolean lcN;
  public boolean running;
  
  static
  {
    GMTrace.i(6482582044672L, 48299);
    eyW = new HashMap();
    GMTrace.o(6482582044672L, 48299);
  }
  
  public b()
  {
    GMTrace.i(6480837214208L, 48286);
    this.running = false;
    this.eza = 0L;
    this.eyY = false;
    this.eyU = new LinkedList();
    this.gzE = new n.a()
    {
      public final void db(int paramAnonymousInt)
      {
        Iterator localIterator = null;
        GMTrace.i(6496809123840L, 48405);
        boolean bool;
        b localb;
        for (;;)
        {
          Object localObject1;
          Object localObject2;
          try
          {
            bool = am.isWifi(ab.getContext());
            if ((paramAnonymousInt != 4) && (paramAnonymousInt != 6))
            {
              b.this.lcN = bool;
              GMTrace.o(6496809123840L, 48405);
              return;
            }
            w.i("MicroMsg.CheckFavCdnService", "onNetworkChange st:%d isWifi:%B, lastIsWifi:%B", new Object[] { Integer.valueOf(paramAnonymousInt), Boolean.valueOf(bool), Boolean.valueOf(b.this.lcN) });
            if ((b.this.lcN) || (!bool)) {
              break label360;
            }
            localb = b.this;
            localObject1 = h.axB();
            localObject2 = "select " + com.tencent.mm.plugin.favorite.b.k.lbe + " from FavItemInfo where itemStatus" + "=3";
            localObject1 = ((com.tencent.mm.plugin.favorite.b.k)localObject1).fTZ.rawQuery((String)localObject2, null);
            if (localObject1 == null)
            {
              if ((localIterator == null) || (localIterator.size() <= 0)) {
                break label360;
              }
              w.i("MicroMsg.CheckFavCdnService", "startAll list.size:%d", new Object[] { Integer.valueOf(localIterator.size()) });
              localIterator = localIterator.iterator();
              if (!localIterator.hasNext()) {
                break;
              }
              localObject1 = (j)localIterator.next();
              if (((j)localObject1).field_itemStatus != 3) {
                continue;
              }
              ((j)localObject1).field_itemStatus = 1;
              h.axB().a((j)localObject1, new String[] { "localId" });
              continue;
            }
            if (((Cursor)localObject1).getCount() != 0) {
              break label299;
            }
          }
          catch (Exception localException)
          {
            w.printErrStackTrace("MicroMsg.CheckFavCdnService", localException, "", new Object[0]);
            GMTrace.o(6496809123840L, 48405);
            return;
          }
          ((Cursor)localObject1).close();
          continue;
          label299:
          LinkedList localLinkedList = new LinkedList();
          while (((Cursor)localObject1).moveToNext())
          {
            localObject2 = new j();
            ((j)localObject2).b((Cursor)localObject1);
            localLinkedList.add(localObject2);
          }
          ((Cursor)localObject1).close();
        }
        localb.run();
        label360:
        b.this.lcN = bool;
        GMTrace.o(6496809123840L, 48405);
      }
    };
    this.eze = new aj(at.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(6479360819200L, 48275);
        try
        {
          b.this.qG();
          GMTrace.o(6479360819200L, 48275);
          return false;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.CheckFavCdnService", localException, "", new Object[0]);
          }
        }
      }
      
      public final String toString()
      {
        GMTrace.i(6479495036928L, 48276);
        String str = super.toString() + "|scenePusher";
        GMTrace.o(6479495036928L, 48276);
        return str;
      }
    }, false);
    this.lcN = am.isWifi(ab.getContext());
    at.a(this.gzE);
    at.wS().a(404, this);
    GMTrace.o(6480837214208L, 48286);
  }
  
  public final void a(final int paramInt1, int paramInt2, String paramString, final com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(6480971431936L, 48287);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6488219189248L, 48341);
        if (paramk.getType() != 404)
        {
          GMTrace.o(6488219189248L, 48341);
          return;
        }
        if (!(paramk instanceof ad))
        {
          GMTrace.o(6488219189248L, 48341);
          return;
        }
        b.this.eyY = false;
        long l = ((ad)paramk).lcn.field_localId;
        j localj = ((ad)paramk).lcn;
        b.eyW.remove(Long.valueOf(l));
        if (paramInt1 != 0)
        {
          w.e("MicroMsg.CheckFavCdnService", "achieved retry limit, set error, localId:%d", new Object[] { Long.valueOf(l) });
          g.ork.i(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(localj.field_type), Integer.valueOf(-2), Long.valueOf(x.k(localj)), Long.valueOf(x.ck(localj.field_localId)) });
          h.axB().s(3, l);
        }
        b.this.qG();
        GMTrace.o(6488219189248L, 48341);
      }
      
      public final String toString()
      {
        GMTrace.i(6488353406976L, 48342);
        String str = super.toString() + "|onSceneEnd";
        GMTrace.o(6488353406976L, 48342);
        return str;
      }
    });
    GMTrace.o(6480971431936L, 48287);
  }
  
  public final void qG()
  {
    GMTrace.i(16032307609600L, 119450);
    this.eza = System.currentTimeMillis();
    Object localObject1;
    Object localObject2;
    if ((!this.eyY) && (this.eyU.size() == 0))
    {
      localObject1 = h.axB();
      localObject2 = "select " + com.tencent.mm.plugin.favorite.b.k.lbe + " from FavItemInfo where itemStatus" + "=1";
      localObject2 = ((com.tencent.mm.plugin.favorite.b.k)localObject1).fTZ.a((String)localObject2, null, 2);
      if (localObject2 == null)
      {
        localObject1 = null;
        if ((localObject1 != null) && (((List)localObject1).size() != 0)) {
          break label194;
        }
      }
    }
    else
    {
      label99:
      if ((this.eyY) || (this.eyU.size() > 0)) {
        break label363;
      }
      qH();
      w.d("MicroMsg.CheckFavCdnService", "klem No Data Any More , Stop Service");
      GMTrace.o(16032307609600L, 119450);
      return;
    }
    if (((Cursor)localObject2).moveToFirst())
    {
      localObject1 = new LinkedList();
      do
      {
        j localj = new j();
        localj.b((Cursor)localObject2);
        ((List)localObject1).add(localj);
      } while (((Cursor)localObject2).moveToNext());
    }
    for (;;)
    {
      ((Cursor)localObject2).close();
      break;
      label194:
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (j)((Iterator)localObject1).next();
        if (eyW.containsKey(Long.valueOf(((j)localObject2).field_localId)))
        {
          w.d("MicroMsg.CheckFavCdnService", "File is Already running:" + ((j)localObject2).field_localId);
        }
        else
        {
          this.eyU.add(localObject2);
          eyW.put(Long.valueOf(((j)localObject2).field_localId), null);
        }
      }
      w.d("MicroMsg.CheckFavCdnService", "klem GetNeedRun procing:" + eyW.size() + ",send:" + this.eyU.size() + "]");
      this.eyU.size();
      break label99;
      label363:
      if ((!this.eyY) && (this.eyU.size() > 0))
      {
        localObject1 = (j)this.eyU.poll();
        if ((localObject1 != null) && (((j)localObject1).field_localId > 0L))
        {
          this.eyY = true;
          localObject1 = new ad((j)localObject1);
          at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
        }
      }
      GMTrace.o(16032307609600L, 119450);
      return;
      localObject1 = null;
    }
  }
  
  public final void qH()
  {
    GMTrace.i(6481239867392L, 48289);
    this.eyU.clear();
    eyW.clear();
    this.running = false;
    this.eyY = false;
    GMTrace.o(6481239867392L, 48289);
  }
  
  public final void run()
  {
    GMTrace.i(6481105649664L, 48288);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6488890277888L, 48346);
        long l = System.currentTimeMillis() - b.this.eza;
        if (b.this.running)
        {
          if (l < 60000L)
          {
            GMTrace.o(6488890277888L, 48346);
            return;
          }
          w.e("MicroMsg.CheckFavCdnService", "klem ERR: Try Run service runningFlag:" + b.this.running + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + b.this.running);
        }
        b.this.eyY = false;
        b.this.running = true;
        b.this.eze.z(10L, 10L);
        GMTrace.o(6488890277888L, 48346);
      }
      
      public final String toString()
      {
        GMTrace.i(6489024495616L, 48347);
        String str = super.toString() + "|run";
        GMTrace.o(6489024495616L, 48347);
        return str;
      }
    });
    GMTrace.o(6481105649664L, 48288);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */