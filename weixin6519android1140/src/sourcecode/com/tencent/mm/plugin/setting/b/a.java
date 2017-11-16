package com.tencent.mm.plugin.setting.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.hp;
import com.tencent.mm.g.a.rx;
import com.tencent.mm.g.a.rx.b;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.e;
import com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.h;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class a
{
  public final com.tencent.mm.sdk.platformtools.af fZz;
  public long lJd;
  public Object mLock;
  public Runnable mRunnable;
  public boolean oFV;
  public boolean oFW;
  public boolean oFX;
  public final CountDownLatch oFY;
  public HashSet<String> oFZ;
  public HashSet<String> oGa;
  public HashSet<String> oGb;
  public HashSet<String> oGc;
  public a oGd;
  public UnfamiliarContactDetailUI.h oGe;
  
  public a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, UnfamiliarContactDetailUI.h paramh)
  {
    GMTrace.i(18373735874560L, 136895);
    this.mLock = new Object();
    this.oFZ = new HashSet();
    this.oGa = new HashSet();
    this.oGb = new HashSet();
    this.oGc = new HashSet();
    this.oFV = paramBoolean1;
    this.oFW = paramBoolean2;
    this.oFX = paramBoolean3;
    int i;
    int j;
    if (this.oFW)
    {
      i = 1;
      if (!this.oFV) {
        break label218;
      }
      j = 1;
      label102:
      if (!this.oFX) {
        break label224;
      }
    }
    label218:
    label224:
    for (int k = 1;; k = 0)
    {
      i = k + (j + i);
      w.i("MicroMsg.UnfamiliarContactEngine", "[UnfamiliarContactEngine] count:%s [%s:%s:%s]", new Object[] { Integer.valueOf(i), Boolean.valueOf(this.oFW), Boolean.valueOf(this.oFV), Boolean.valueOf(this.oFX) });
      this.oFY = new CountDownLatch(i);
      this.fZz = new com.tencent.mm.sdk.platformtools.af("UnfamiliarContactEngine");
      this.oGe = paramh;
      GMTrace.o(18373735874560L, 136895);
      return;
      i = 0;
      break;
      j = 0;
      break label102;
    }
  }
  
  public final void ae(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(18373870092288L, 136896);
    final Object localObject1;
    if (this.oFW)
    {
      this.oGd = new a(this.oGe, this.oFY);
      localObject1 = this.oGd;
      ((a)localObject1).start = System.currentTimeMillis();
      at.wS().a(292, (com.tencent.mm.ad.e)localObject1);
      a.bef();
    }
    if (this.oFV)
    {
      localObject1 = new HashSet();
      Object localObject2 = paramLinkedList.iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((HashSet)localObject1).add((String)((Iterator)localObject2).next());
      }
      final long l1 = System.currentTimeMillis() - 15552000000L;
      w.i("MicroMsg.UnfamiliarContactEngine", "[getHalfYearNotChatInfo] timestamp:%s size:%s", new Object[] { Long.valueOf(l1), Integer.valueOf(((HashSet)localObject1).size()) });
      long l2 = System.currentTimeMillis();
      localObject2 = new com.tencent.mm.plugin.fts.a.a.f();
      ((com.tencent.mm.plugin.fts.a.a.f)localObject2).lwS = 9;
      ((com.tencent.mm.plugin.fts.a.a.f)localObject2).eQb = String.valueOf(l1);
      ((com.tencent.mm.plugin.fts.a.a.f)localObject2).lwY = new j()
      {
        public final void a(g paramAnonymousg)
        {
          GMTrace.i(18373333221376L, 136892);
          paramAnonymousg = paramAnonymousg.lxb;
          Object localObject;
          if (paramAnonymousg != null)
          {
            paramAnonymousg = paramAnonymousg.iterator();
            while (paramAnonymousg.hasNext())
            {
              localObject = (i)paramAnonymousg.next();
              localObject1.remove(((i)localObject).lwH);
              a.this.oGa.add(((i)localObject).lwH);
            }
          }
          paramAnonymousg = localObject1.iterator();
          while (paramAnonymousg.hasNext())
          {
            localObject = (String)paramAnonymousg.next();
            at.AR();
            int i = com.tencent.mm.y.c.yM().j((String)localObject, l1, System.currentTimeMillis());
            if (i > 0)
            {
              w.i("MicroMsg.UnfamiliarContactEngine", "[getHalfYearNotChatInfo] talker:%s voipCount:%s", new Object[] { localObject, Integer.valueOf(i) });
            }
            else
            {
              at.AR();
              Cursor localCursor1 = com.tencent.mm.y.c.yM().a((String)localObject, l1, System.currentTimeMillis(), true);
              if (localCursor1.getCount() > 0)
              {
                at.AR();
                Cursor localCursor2 = com.tencent.mm.y.c.yM().a((String)localObject, l1, System.currentTimeMillis(), false);
                if (localCursor2.getCount() <= 0) {
                  a.this.oGa.add(localObject);
                }
                localCursor2.close();
              }
              for (;;)
              {
                localCursor1.close();
                break;
                a.this.oGa.add(localObject);
              }
            }
          }
          w.i("MicroMsg.UnfamiliarContactEngine", "[getHalfYearNotChatInfo] query:%s cost:%sms", new Object[] { Long.valueOf(l1), Long.valueOf(System.currentTimeMillis() - this.fJi) });
          a.this.oFY.countDown();
          GMTrace.o(18373333221376L, 136892);
        }
      };
      ((com.tencent.mm.plugin.fts.a.a.f)localObject2).handler = this.fZz.bQi();
      ((l)com.tencent.mm.kernel.h.j(l.class)).search(2, (com.tencent.mm.plugin.fts.a.a.f)localObject2);
    }
    if (this.oFX) {
      e(paramLinkedList, 0);
    }
    paramLinkedList = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18372527915008L, 136886);
        try
        {
          a.this.oFY.await();
          long l = System.currentTimeMillis();
          a.this.oFZ.clear();
          a.this.oGa.remove(q.zE());
          a.this.oFZ.addAll(a.this.oGa);
          a.this.oFZ.addAll(a.this.oGb);
          a.this.oFZ.addAll(a.this.oGc);
          if (a.this.oFW) {
            a.this.oFZ.retainAll(a.this.oGc);
          }
          if (a.this.oFX) {
            a.this.oFZ.retainAll(a.this.oGb);
          }
          if (a.this.oFV) {
            a.this.oFZ.retainAll(a.this.oGa);
          }
          a.this.oGe.e(a.this.oFZ);
          w.i("MicroMsg.UnfamiliarContactEngine", "[onResult] :%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
          com.tencent.mm.sdk.platformtools.af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18375346487296L, 136907);
              a.this.oGe.onSuccess();
              GMTrace.o(18375346487296L, 136907);
            }
          });
          w.i("MicroMsg.UnfamiliarContactEngine", "all cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - a.this.lJd) });
          GMTrace.o(18372527915008L, 136886);
          return;
        }
        catch (InterruptedException localInterruptedException)
        {
          w.printErrStackTrace("MicroMsg.UnfamiliarContactEngine", localInterruptedException, "", new Object[0]);
          com.tencent.mm.sdk.platformtools.af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18373064785920L, 136890);
              a.this.oGe.onError();
              GMTrace.o(18373064785920L, 136890);
            }
          });
          GMTrace.o(18372527915008L, 136886);
        }
      }
    };
    this.mRunnable = paramLinkedList;
    com.tencent.mm.sdk.f.e.post(paramLinkedList, "MicroMsg.UnfamiliarContactEngineAwait");
    GMTrace.o(18373870092288L, 136896);
  }
  
  public final void e(final LinkedList<String> paramLinkedList, int paramInt)
  {
    GMTrace.i(18374004310016L, 136897);
    final long l = System.currentTimeMillis();
    if (paramInt + 10 < paramLinkedList.size()) {}
    for (final int i = paramInt + 10;; i = paramLinkedList.size())
    {
      final List localList = paramLinkedList.subList(paramInt, i);
      com.tencent.mm.plugin.fts.a.a.f localf = new com.tencent.mm.plugin.fts.a.a.f();
      localf.lwS = 8;
      localf.eQb = bg.c(localList, ",");
      localf.lwY = new j()
      {
        final int aCN;
        
        public final void a(g arg1)
        {
          GMTrace.i(18373601656832L, 136894);
          ??? = ???.lxb;
          String str;
          Iterator localIterator2;
          if ((??? != null) && (???.size() > 0))
          {
            ??? = (i)???.get(0);
            if ((???.userData != null) && ((???.userData instanceof HashMap)))
            {
              HashMap localHashMap = (HashMap)???.userData;
              synchronized (a.this.mLock)
              {
                Iterator localIterator1 = localList.iterator();
                if (!localIterator1.hasNext()) {
                  break label210;
                }
                str = (String)localIterator1.next();
                if (!localHashMap.containsKey(str)) {
                  a.this.oGb.add(str);
                }
              }
              localIterator2 = ((List)((HashMap)localObject).get(str)).iterator();
            }
          }
          for (;;)
          {
            int i = 0;
            if (localIterator2.hasNext())
            {
              if (((i)localIterator2.next()).lxe < 100L) {
                i = 1;
              }
            }
            else
            {
              if (i != 0) {
                break;
              }
              a.this.oGb.add(str);
              break;
              label210:
              if (this.aCN >= paramLinkedList.size())
              {
                w.i("MicroMsg.UnfamiliarContactEngine", "[getSameChatInfoTask] finish all load! userNames.size:%s cost:%sms", new Object[] { Integer.valueOf(paramLinkedList.size()), Long.valueOf(System.currentTimeMillis() - l) });
                a.this.oFY.countDown();
                GMTrace.o(18373601656832L, 136894);
                return;
                if (???.userData == null) {}
                for (boolean bool = true;; bool = false)
                {
                  w.e("MicroMsg.UnfamiliarContactEngine", "[getSameChatInfoTask] is null?%s is instanceof List", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(???.userData instanceof HashMap) });
                  break;
                }
                if (localList == null) {}
                for (bool = true;; bool = false)
                {
                  w.e("MicroMsg.UnfamiliarContactEngine", "[getSameChatInfoTask] list is null? %s ", new Object[] { Boolean.valueOf(bool) });
                  break;
                }
              }
              a.this.e(paramLinkedList, this.aCN);
              GMTrace.o(18373601656832L, 136894);
              return;
            }
          }
        }
      };
      localf.handler = this.fZz.bQi();
      ((l)com.tencent.mm.kernel.h.j(l.class)).search(2, localf);
      GMTrace.o(18374004310016L, 136897);
      return;
    }
  }
  
  final class a
    implements com.tencent.mm.ad.e, Runnable
  {
    CountDownLatch kCM;
    UnfamiliarContactDetailUI.h oGk;
    k oGl;
    long start;
    
    a(UnfamiliarContactDetailUI.h paramh, CountDownLatch paramCountDownLatch)
    {
      GMTrace.i(18374138527744L, 136898);
      this.oGk = paramh;
      this.kCM = paramCountDownLatch;
      GMTrace.o(18374138527744L, 136898);
    }
    
    public static void bef()
    {
      GMTrace.i(18374541180928L, 136901);
      hp localhp = new hp();
      localhp.eKT.eHJ = 3;
      com.tencent.mm.sdk.b.a.vgX.m(localhp);
      GMTrace.o(18374541180928L, 136901);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(18374272745472L, 136899);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.UnfamiliarContactEngine", "[onSceneEnd] errType:%s errCode:%s errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        this.kCM.countDown();
        GMTrace.o(18374272745472L, 136899);
        return;
      }
      if (paramk.getType() == 292)
      {
        this.oGl = paramk;
        com.tencent.mm.sdk.f.e.post(this, "load_unfamiliar_contact");
      }
      GMTrace.o(18374272745472L, 136899);
    }
    
    public final void run()
    {
      GMTrace.i(18374406963200L, 136900);
      Object localObject = new rx();
      ((rx)localObject).eWG.eWI = this.oGl;
      com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
      int j = ((rx)localObject).eWH.state;
      localObject = ((rx)localObject).eWH.eWJ;
      boolean bool;
      if (localObject == null)
      {
        bool = true;
        if (localObject != null) {
          break label172;
        }
      }
      label172:
      for (int i = 0;; i = ((List)localObject).size())
      {
        w.i("MicroMsg.UnfamiliarContactEngine", "[callback] state:%s,tagList is null?%s,tagList size:%s", new Object[] { Integer.valueOf(j), Boolean.valueOf(bool), Integer.valueOf(i) });
        if (j == 1) {
          break label183;
        }
        if (localObject != null) {
          a.this.oGc.addAll((Collection)localObject);
        }
        w.i("MicroMsg.UnfamiliarContactEngine", "[AsyncGetSnsTagInfo] %sms", new Object[] { Long.valueOf(System.currentTimeMillis() - this.start) });
        this.kCM.countDown();
        GMTrace.o(18374406963200L, 136900);
        return;
        bool = false;
        break;
      }
      label183:
      if (this.oGk != null) {
        com.tencent.mm.sdk.platformtools.af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18372796350464L, 136888);
            a.a.this.oGk.a(UnfamiliarContactDetailUI.e.oLs);
            GMTrace.o(18372796350464L, 136888);
          }
        });
      }
      a.this.fZz.h(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18375078051840L, 136905);
          a.a.bef();
          GMTrace.o(18375078051840L, 136905);
        }
      }, 30000L);
      GMTrace.o(18374406963200L, 136900);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */