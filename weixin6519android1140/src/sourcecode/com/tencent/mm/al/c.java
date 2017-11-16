package com.tencent.mm.al;

import android.database.Cursor;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.bu.g;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.aos;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bnn;
import com.tencent.mm.protocal.c.zh;
import com.tencent.mm.protocal.c.zi;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.m;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

final class c
  implements ak.b
{
  public Queue<zh> gFA;
  public Queue<a> gFB;
  public long gFC;
  final int gFD;
  final int gFE;
  public aj gFF;
  public final aj gFG;
  private f<String, Integer> gFy;
  public Map<String, ak.b.a> gFz;
  public boolean gsb;
  private long gsm;
  
  c()
  {
    GMTrace.i(4092030091264L, 30488);
    this.gsb = false;
    this.gFy = new f(200);
    this.gFz = new HashMap();
    this.gFA = new LinkedList();
    this.gFB = new LinkedList();
    this.gFC = 0L;
    this.gFD = 500;
    this.gFE = 10000;
    this.gsm = 0L;
    this.gFF = new aj(at.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(4089345736704L, 30468);
        w.d("MicroMsg.GetContactService", "pusherTry onTimerExpired tryStartNetscene");
        c.this.qG();
        GMTrace.o(4089345736704L, 30468);
        return false;
      }
    }, false);
    this.gFG = new aj(at.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(21038226210816L, 156747);
        if (c.this.gFB.isEmpty())
        {
          w.i("MicroMsg.GetContactService", "tryStartNetscene respHandler queue maybe this time is null , wait doscene!");
          GMTrace.o(21038226210816L, 156747);
          return false;
        }
        long l1 = bg.Pv();
        int i;
        ArrayList localArrayList;
        int j;
        label71:
        c.a locala;
        final boolean bool;
        if (c.this.gsb)
        {
          i = 5;
          localArrayList = new ArrayList(i * 2);
          j = 0;
          if (j >= i) {
            break label836;
          }
          locala = (c.a)c.this.gFB.peek();
          if (locala != null) {
            break label176;
          }
          w.i("MicroMsg.GetContactService", "tryStartNetscene respHandler queue maybe this time is null , break and wait doscene!");
          bool = false;
        }
        for (;;)
        {
          label108:
          int k = localArrayList.size();
          if (k > 0)
          {
            at.AR();
            long l2 = com.tencent.mm.y.c.yH().cE(Thread.currentThread().getId());
            Object localObject1 = d.Iz();
            j = 0;
            for (;;)
            {
              if (j < k)
              {
                ((b)localObject1).jW((String)localArrayList.get(j));
                j += 1;
                continue;
                i = 15;
                break;
                label176:
                Object localObject2 = locala.gFN.uql;
                localObject1 = locala.gFN.uqm;
                k = locala.gFO;
                int m = ((LinkedList)localObject2).size();
                if (m <= k)
                {
                  c.this.gFB.poll();
                  if (c.this.gFB.isEmpty())
                  {
                    w.i("MicroMsg.GetContactService", "tryStartNetscene respHandler resp proc fin gr.curIdx:%d size:%d and retList is empty break", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
                    c.this.gFC = 0L;
                    c.this.gFF.z(0L, 0L);
                    bool = false;
                    break label108;
                  }
                  w.i("MicroMsg.GetContactService", "tryStartNetscene respHandler resp proc fin gr.curIdx:%d size:%d and retList is not empty continue next", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
                  j += 1;
                  break label71;
                }
                localObject2 = (aos)((LinkedList)localObject2).get(k);
                m = ((Integer)((LinkedList)localObject1).get(k)).intValue();
                final String str1 = bg.aq(n.a(((aos)localObject2).ufy), "");
                final String str2 = bg.aq(((aos)localObject2).gCC, "");
                localArrayList.add(str1);
                localArrayList.add(str2);
                switch (m)
                {
                default: 
                  w.e("MicroMsg.GetContactService", "respHandler getFailed :%d ErrName: %s %s", new Object[] { Integer.valueOf(m), str1, str2 });
                  m.fe(str1);
                  bool = false;
                }
                for (;;)
                {
                  new ae(Looper.getMainLooper()).post(new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(21038494646272L, 156749);
                      ak.b.a locala2 = (ak.b.a)c.this.gFz.remove(str1);
                      if (bg.nm(str2)) {}
                      for (ak.b.a locala1 = null;; locala1 = (ak.b.a)c.this.gFz.remove(str2))
                      {
                        if (locala2 != null) {
                          locala2.r(str1, bool);
                        }
                        if ((locala1 != null) && (!bg.nm(str2))) {
                          locala1.r(str2, bool);
                        }
                        GMTrace.o(21038494646272L, 156749);
                        return;
                      }
                    }
                  });
                  locala.gFO += 1;
                  break;
                  if ((locala.gFN.uqn == null) || (locala.gFN.uqn.size() <= k) || (!str1.equals(((bnn)locala.gFN.uqn.get(k)).username))) {
                    if (locala.gFN.uqn == null)
                    {
                      localObject1 = "null";
                      label568:
                      w.w("MicroMsg.GetContactService", "get antispamticket from resp failed: list:%s idx:%d  user:%s", new Object[] { localObject1, Integer.valueOf(k), str1 });
                    }
                  }
                  for (localObject1 = "";; localObject1 = bg.aq(((bnn)locala.gFN.uqn.get(k)).uXy, ""))
                  {
                    w.i("MicroMsg.GetContactService", "dkverify respHandler mod contact: %s %s %s", new Object[] { str1, str2, localObject1 });
                    com.tencent.mm.plugin.subapp.b.hnI.a((aos)localObject2, (String)localObject1);
                    bool = true;
                    break;
                    localObject1 = Integer.valueOf(locala.gFN.uqn.size());
                    break label568;
                  }
                  w.e("MicroMsg.GetContactService", "respHandler getFailed :%d ErrName: %s %s", new Object[] { Integer.valueOf(m), str1, str2 });
                  m.fe(str1);
                  bool = false;
                }
              }
            }
            at.AR();
            com.tencent.mm.y.c.yH().aL(l2);
          }
          w.i("MicroMsg.GetContactService", "tryStartNetscene respHandler onTimerExpired netSceneRunning : " + c.this.gsb + " ret: " + bool + " maxCnt: " + i + " deleteCount: " + k + " take: " + (bg.Pv() - l1) + "ms");
          GMTrace.o(21038226210816L, 156747);
          return bool;
          label836:
          bool = true;
        }
      }
    }, true);
    GMTrace.o(4092030091264L, 30488);
  }
  
  private void Ix()
  {
    GMTrace.i(4092701179904L, 30493);
    Object localObject1 = d.Iz();
    long l = this.gFC;
    Object localObject4 = ((b)localObject1).goN.a("select getcontactinfov2.username,getcontactinfov2.inserttime,getcontactinfov2.type,getcontactinfov2.lastgettime,getcontactinfov2.reserved1,getcontactinfov2.reserved2,getcontactinfov2.reserved3,getcontactinfov2.reserved4 from getcontactinfov2 where inserttime> ?  order by inserttime asc limit ?", new String[] { String.valueOf(l), "80" }, 0);
    if (localObject4 == null)
    {
      GMTrace.o(4092701179904L, 30493);
      return;
    }
    int i = ((Cursor)localObject4).getCount();
    w.i("MicroMsg.GetContactService", "getFromDb count:%d", new Object[] { Integer.valueOf(i) });
    if (i <= 0)
    {
      ((Cursor)localObject4).close();
      GMTrace.o(4092701179904L, 30493);
      return;
    }
    localObject1 = new LinkedList();
    Object localObject2 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    LinkedList localLinkedList1 = new LinkedList();
    final Object localObject3;
    String str1;
    if (((Cursor)localObject4).moveToNext())
    {
      Object localObject5 = new a();
      ((a)localObject5).username = ((Cursor)localObject4).getString(0);
      ((a)localObject5).gFw = ((Cursor)localObject4).getLong(1);
      ((a)localObject5).type = ((Cursor)localObject4).getInt(2);
      ((a)localObject5).gFx = ((Cursor)localObject4).getInt(3);
      ((a)localObject5).goJ = ((Cursor)localObject4).getInt(4);
      ((a)localObject5).gDs = ((Cursor)localObject4).getInt(5);
      ((a)localObject5).goL = ((Cursor)localObject4).getString(6);
      ((a)localObject5).goM = ((Cursor)localObject4).getString(7);
      localObject3 = ((a)localObject5).getUsername();
      str1 = bg.nl(((a)localObject5).BB());
      i = bg.e(Integer.valueOf(((a)localObject5).gDs));
      String str2 = bg.nl(((a)localObject5).Iw());
      this.gFC = ((a)localObject5).gFw;
      localObject5 = (String)localObject3 + "#" + str1;
      int j = bg.a((Integer)this.gFy.get(localObject5), 0);
      if (j < 3)
      {
        this.gFy.m(localObject5, Integer.valueOf(j + 1));
        if (i == 1)
        {
          localLinkedList2.add(new Pair(new azq().Rq((String)localObject3), new azq().Rq(str2)));
          w.i("MicroMsg.GetContactService", "getFromDb add user:%s scene:%s ticket:%s", new Object[] { localObject3, Integer.valueOf(i), str2 });
          label454:
          if ((((LinkedList)localObject1).size() < 20) && (!((Cursor)localObject4).isLast())) {
            break label895;
          }
          localObject3 = new zh();
          ((zh)localObject3).tTO = ((LinkedList)localObject1);
          ((zh)localObject3).uqd = ((LinkedList)localObject1).size();
          ((zh)localObject3).uqh = ((LinkedList)localObject2);
          ((zh)localObject3).uqg = ((LinkedList)localObject2).size();
          this.gFA.add(localObject3);
          localObject2 = new LinkedList();
          localObject1 = new LinkedList();
          w.i("MicroMsg.GetContactService", "getFromDb now reqlist size:%d , this req usr count:%d", new Object[] { Integer.valueOf(this.gFA.size()), Integer.valueOf(((zh)localObject3).tTO.size()) });
        }
      }
    }
    for (;;)
    {
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
      break;
      ((LinkedList)localObject1).add(new azq().Rq((String)localObject3));
      ((LinkedList)localObject2).add(new azq().Rq(str1));
      w.i("MicroMsg.GetContactService", "getFromDb add user:%s room:%s", new Object[] { localObject3, str1 });
      break label454;
      localLinkedList1.add(localObject3);
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(21037957775360L, 156745);
          if (c.this.gFz.containsKey(localObject3))
          {
            ak.b.a locala = (ak.b.a)c.this.gFz.get(localObject3);
            if (locala != null) {
              locala.r(localObject3, this.pZy);
            }
            c.this.gFz.remove(localObject3);
          }
          GMTrace.o(21037957775360L, 156745);
        }
      });
      break label454;
      ((Cursor)localObject4).close();
      localObject1 = localLinkedList2.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Pair)((Iterator)localObject1).next();
        localObject3 = new zh();
        localObject4 = new LinkedList();
        ((LinkedList)localObject4).add(((Pair)localObject2).first);
        ((zh)localObject3).tTO = ((LinkedList)localObject4);
        ((zh)localObject3).uqd = ((LinkedList)localObject4).size();
        ((zh)localObject3).uqi = 1;
        ((zh)localObject3).uqj = ((azq)((Pair)localObject2).second);
        this.gFA.add(localObject3);
      }
      localLinkedList2.clear();
      i = 0;
      while (i < localLinkedList1.size())
      {
        localObject1 = (String)localLinkedList1.get(i);
        boolean bool = s.eb((String)localObject1);
        w.w("MicroMsg.GetContactService", "getFromDb try getContact Too much usr:%s; remove from table:%s ", new Object[] { localObject1, Boolean.valueOf(bool) });
        if (bool) {
          d.Iz().jW((String)localObject1);
        }
        i += 1;
      }
      GMTrace.o(4092701179904L, 30493);
      return;
      label895:
      localObject3 = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject3;
    }
  }
  
  private static boolean ad(String paramString1, String paramString2)
  {
    GMTrace.i(4092566962176L, 30492);
    if (bg.nm(paramString1))
    {
      GMTrace.o(4092566962176L, 30492);
      return false;
    }
    Object localObject = q.zE();
    String str = q.zF();
    if ((paramString1.equals(localObject)) || (paramString1.equals(str)))
    {
      w.i("MicroMsg.GetContactService", "addToStg username: " + paramString1 + " equal to user: " + (String)localObject + " alias: " + str + " ret");
      GMTrace.o(4092566962176L, 30492);
      return false;
    }
    localObject = new a();
    ((a)localObject).username = paramString1;
    ((a)localObject).goL = bg.nl(paramString2);
    ((a)localObject).gFw = bg.Pv();
    boolean bool = d.Iz().a((a)localObject);
    GMTrace.o(4092566962176L, 30492);
    return bool;
  }
  
  public final void K(String paramString1, String paramString2)
  {
    GMTrace.i(4092298526720L, 30490);
    w.i("MicroMsg.GetContactService", "dkverify add Contact :" + paramString1 + " chatroom: " + paramString2 + " stack:" + bg.bQW());
    if (ad(paramString1, paramString2)) {
      this.gFF.z(500L, 500L);
    }
    GMTrace.o(4092298526720L, 30490);
  }
  
  public final void L(String paramString1, String paramString2)
  {
    boolean bool = false;
    GMTrace.i(15353434341376L, 114392);
    if (bg.nm(paramString1)) {}
    for (;;)
    {
      if (bool) {
        this.gFF.z(500L, 500L);
      }
      GMTrace.o(15353434341376L, 114392);
      return;
      Object localObject = q.zE();
      String str = q.zF();
      if ((paramString1.equals(localObject)) || (paramString1.equals(str)))
      {
        w.i("MicroMsg.GetContactService", "addToStg username: " + paramString1 + " equal to user: " + (String)localObject + " alias: " + str + " ret");
      }
      else
      {
        localObject = new a();
        ((a)localObject).username = paramString1;
        ((a)localObject).goM = bg.nl(paramString2);
        ((a)localObject).gDs = bg.e(Integer.valueOf(1));
        ((a)localObject).gFw = bg.Pv();
        bool = d.Iz().a((a)localObject);
      }
    }
  }
  
  public final void a(String paramString1, String paramString2, ak.b.a parama)
  {
    GMTrace.i(4092432744448L, 30491);
    w.i("MicroMsg.GetContactService", "dkverify getNow :" + paramString1 + " chatroom: " + paramString2 + " stack:" + bg.bQW());
    if (ad(paramString1, paramString2))
    {
      this.gFz.put(paramString1, parama);
      this.gFF.z(0L, 0L);
    }
    GMTrace.o(4092432744448L, 30491);
  }
  
  public final void gJ(String paramString)
  {
    GMTrace.i(4092164308992L, 30489);
    this.gFz.remove(paramString);
    GMTrace.o(4092164308992L, 30489);
  }
  
  public final void qG()
  {
    for (;;)
    {
      long l;
      try
      {
        GMTrace.i(4092835397632L, 30494);
        if (com.tencent.mm.plugin.subapp.b.hnI.py())
        {
          w.w("MicroMsg.GetContactService", "tryStartNetscene need init , never get contact");
          GMTrace.o(4092835397632L, 30494);
          return;
        }
        l = bg.Pv();
        if ((this.gsb) && (l - this.gsm > 600000L))
        {
          w.w("MicroMsg.GetContactService", "tryStartNetscene Not Callback too long:%d . Force Run Now", new Object[] { Long.valueOf(l - this.gsm) });
          this.gsb = false;
        }
        if (this.gsb)
        {
          w.i("MicroMsg.GetContactService", "tryStartNetscene netSceneRunning: " + this.gsb + " ret");
          GMTrace.o(4092835397632L, 30494);
          continue;
        }
        localObject3 = (zh)this.gFA.poll();
      }
      finally {}
      Object localObject2 = localObject3;
      if (localObject3 == null)
      {
        Ix();
        localObject3 = (zh)this.gFA.poll();
        if ((localObject3 != null) && (((zh)localObject3).tTO != null))
        {
          localObject2 = localObject3;
          if (((zh)localObject3).tTO.size() != 0) {}
        }
        else
        {
          w.i("MicroMsg.GetContactService", "tryStartNetscene Not any more contact.");
          GMTrace.o(4092835397632L, 30494);
          continue;
        }
      }
      this.gsm = l;
      this.gsb = true;
      Object localObject3 = new b.a();
      ((b.a)localObject3).gtF = ((com.tencent.mm.bm.a)localObject2);
      ((b.a)localObject3).gtG = new zi();
      ((b.a)localObject3).uri = "/cgi-bin/micromsg-bin/getcontact";
      ((b.a)localObject3).gtE = 182;
      u.a(((b.a)localObject3).DA(), new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(21038628864000L, 156750);
          if (paramAnonymousk.getType() != 182)
          {
            GMTrace.o(21038628864000L, 156750);
            return 0;
          }
          c.this.gsb = false;
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            w.e("MicroMsg.GetContactService", "tryStartNetscene onSceneEnd errType:" + paramAnonymousInt1 + " errCode:" + paramAnonymousInt2 + " will retry");
            c.this.gFF.z(10000L, 10000L);
            GMTrace.o(21038628864000L, 156750);
            return 0;
          }
          if ((!c.this.gFA.isEmpty()) && (c.this.gFF.bQn())) {
            c.this.gFF.z(500L, 500L);
          }
          if (paramAnonymousb != null)
          {
            paramAnonymousk = new c.a(c.this);
            paramAnonymousk.errType = paramAnonymousInt1;
            paramAnonymousk.errCode = paramAnonymousInt2;
            paramAnonymousk.eAR = paramAnonymousString;
            paramAnonymousk.gFN = ((zi)paramAnonymousb.gtD.gtK);
            c.this.gFB.add(paramAnonymousk);
          }
          if ((!c.this.gFB.isEmpty()) && (c.this.gFG.bQn())) {
            c.this.gFG.z(50L, 50L);
          }
          GMTrace.o(21038628864000L, 156750);
          return 0;
        }
      }, true);
      GMTrace.o(4092835397632L, 30494);
    }
  }
  
  final class a
  {
    String eAR;
    int errCode;
    int errType;
    zi gFN;
    int gFO;
    
    a()
    {
      GMTrace.i(4091895873536L, 30487);
      this.gFO = 0;
      GMTrace.o(4091895873536L, 30487);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\al\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */