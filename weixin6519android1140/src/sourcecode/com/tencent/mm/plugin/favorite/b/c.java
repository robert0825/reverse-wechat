package com.tencent.mm.plugin.favorite.b;

import android.database.Cursor;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
{
  private static c laX;
  public long endTime;
  public boolean knj;
  public ArrayList<a> laW;
  public Object laY;
  private Runnable laZ;
  ae mHandler;
  public long startTime;
  
  static
  {
    GMTrace.i(6282866065408L, 46811);
    laX = null;
    GMTrace.o(6282866065408L, 46811);
  }
  
  private c()
  {
    GMTrace.i(6281658105856L, 46802);
    this.knj = false;
    this.laW = new ArrayList();
    this.startTime = -1L;
    this.endTime = -1L;
    this.laY = new Object();
    this.laZ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6297630015488L, 46921);
        k localk = h.axB();
        w.i("MicroMsg.FavItemInfoStorage", "calDataBaseDataTotalLength");
        Object localObject4 = "select " + k.lbe + " from FavItemInfo where ";
        Object localObject2 = x.lcb;
        int j = localObject2.length;
        ??? = "";
        int i = 0;
        int k;
        while (i < j)
        {
          k = localObject2[i];
          ??? = (String)??? + k + ",";
          i += 1;
        }
        localObject2 = ???;
        if (((String)???).endsWith(",")) {
          localObject2 = ((String)???).substring(0, ((String)???).length() - 1);
        }
        localObject4 = (String)localObject4 + "itemStatus in (" + (String)localObject2 + ")";
        localObject2 = x.lca;
        j = localObject2.length;
        ??? = "";
        i = 0;
        while (i < j)
        {
          k = localObject2[i];
          ??? = (String)??? + k + ",";
          i += 1;
        }
        localObject2 = ???;
        if (((String)???).endsWith(",")) {
          localObject2 = ((String)???).substring(0, ((String)???).length() - 1);
        }
        ??? = (String)localObject4 + " and type in (" + (String)localObject2 + ")";
        ??? = localk.fTZ.rawQuery((String)???, null);
        if (??? == null)
        {
          w.e("MicroMsg.FavItemInfoStorage", "calDataBaseDataTotalLength cu = null");
          c.this.endTime = System.currentTimeMillis();
          w.d("MicroMsg.FavCleanFirstLoader", "calDataBaseDataTotalLength, used: %dms", new Object[] { Long.valueOf(c.this.endTime - c.this.startTime) });
          c.this.endTime = -1L;
          c.this.startTime = -1L;
        }
        for (;;)
        {
          synchronized (c.this.laY)
          {
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vss, Boolean.valueOf(true));
            c.this.knj = false;
            c.this.mHandler.sendEmptyMessage(0);
            GMTrace.o(6297630015488L, 46921);
            return;
            if (((Cursor)???).getCount() == 0)
            {
              ((Cursor)???).close();
              w.i("MicroMsg.FavItemInfoStorage", "calDataBaseDataTotalLength cu.getCount() = 0");
              break;
            }
            w.i("MicroMsg.FavItemInfoStorage", "calDataBaseDataTotalLength cu.getCount() = " + ((Cursor)???).getCount());
            if ((localk.fTZ instanceof g))
            {
              l2 = ((g)localk.fTZ).cE(Thread.currentThread().getId());
              if (((Cursor)???).moveToNext())
              {
                localObject2 = new j();
                ((j)localObject2).b((Cursor)???);
                if (!x.nB(((j)localObject2).field_itemStatus)) {
                  continue;
                }
                long l3;
                if (((j)localObject2).field_favProto != null)
                {
                  localObject4 = ((j)localObject2).field_favProto.ulB.iterator();
                  long l1 = 0L;
                  l3 = l1;
                  if (((Iterator)localObject4).hasNext())
                  {
                    l1 = ((th)((Iterator)localObject4).next()).ujO + l1;
                    continue;
                  }
                }
                else
                {
                  l3 = 0L;
                }
                ((j)localObject2).field_datatotalsize = l3;
                localk.a((j)localObject2, new String[] { "localId" });
                continue;
              }
              if ((localk.fTZ instanceof g)) {
                ((g)localk.fTZ).aL(l2);
              }
              ((Cursor)???).close();
              w.i("MicroMsg.FavItemInfoStorage", "calDataBaseDataTotalLength end");
            }
          }
          long l2 = 0L;
        }
      }
    };
    this.mHandler = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(6304072466432L, 46969);
        paramAnonymousMessage = c.this.laW.iterator();
        while (paramAnonymousMessage.hasNext())
        {
          c.a locala = (c.a)paramAnonymousMessage.next();
          if (locala != null) {
            locala.onFinish();
          }
        }
        c.this.laW.clear();
        GMTrace.o(6304072466432L, 46969);
      }
    };
    GMTrace.o(6281658105856L, 46802);
  }
  
  public static c axD()
  {
    try
    {
      GMTrace.i(6281792323584L, 46803);
      if (laX == null) {
        laX = new c();
      }
      c localc = laX;
      GMTrace.o(6281792323584L, 46803);
      return localc;
    }
    finally {}
  }
  
  public final void a(a parama)
  {
    GMTrace.i(6281926541312L, 46804);
    synchronized (this.laY)
    {
      at.AR();
      if (((Boolean)com.tencent.mm.y.c.xh().get(w.a.vss, Boolean.valueOf(false))).booleanValue())
      {
        if (parama != null) {
          parama.onFinish();
        }
        GMTrace.o(6281926541312L, 46804);
        return;
      }
      if (parama != null) {
        this.laW.add(parama);
      }
      if (this.knj)
      {
        w.i("MicroMsg.FavCleanFirstLoader", "isLoading is true, ignore");
        GMTrace.o(6281926541312L, 46804);
        return;
      }
      this.knj = true;
      this.startTime = System.currentTimeMillis();
      com.tencent.mm.sdk.f.e.post(this.laZ, "FavCleanFirstLoader_CalFavDataLength");
      GMTrace.o(6281926541312L, 46804);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void onFinish();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */