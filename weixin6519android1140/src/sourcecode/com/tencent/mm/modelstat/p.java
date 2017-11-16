package com.tencent.mm.modelstat;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.n.a;
import com.tencent.mm.network.x;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.ak.e;
import com.tencent.mm.y.aq;
import java.util.HashMap;

public class p
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private k gZC;
  private l gZD;
  private x gZE;
  private f gZF;
  private com.tencent.mm.network.n gzE;
  
  static
  {
    GMTrace.i(1381637292032L, 10294);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("NETSTAT_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(1393582669824L, 10383);
        String[] arrayOfString = l.fTX;
        GMTrace.o(1393582669824L, 10383);
        return arrayOfString;
      }
    });
    GMTrace.o(1381637292032L, 10294);
  }
  
  public p()
  {
    GMTrace.i(1380160897024L, 10283);
    this.gZC = new k();
    this.gZE = new x();
    this.gZF = null;
    this.gzE = new n.a()
    {
      public final void db(int paramAnonymousInt)
      {
        GMTrace.i(1391032532992L, 10364);
        if ((paramAnonymousInt != 4) && (paramAnonymousInt != 6))
        {
          GMTrace.o(1391032532992L, 10364);
          return;
        }
        h.xB().h(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(1393851105280L, 10385);
            if (!h.xw().wL())
            {
              GMTrace.o(1393851105280L, 10385);
              return;
            }
            p.Ms().Mm();
            GMTrace.o(1393851105280L, 10385);
          }
          
          public final String toString()
          {
            GMTrace.i(1393985323008L, 10386);
            String str = super.toString() + "|onNetworkChange";
            GMTrace.o(1393985323008L, 10386);
            return str;
          }
        }, 3000L);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SubCoreStat", "NetTypeReporter st:%d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        n.hj(2);
        GMTrace.o(1391032532992L, 10364);
      }
    };
    GMTrace.o(1380160897024L, 10283);
  }
  
  public static f Ms()
  {
    GMTrace.i(1380295114752L, 10284);
    h.xw().wG();
    if (Mt().gZF == null) {
      Mt().gZF = new f(com.tencent.mm.storage.w.ghv);
    }
    f localf = Mt().gZF;
    GMTrace.o(1380295114752L, 10284);
    return localf;
  }
  
  private static p Mt()
  {
    GMTrace.i(1380429332480L, 10285);
    p localp = (p)com.tencent.mm.y.p.o(p.class);
    GMTrace.o(1380429332480L, 10285);
    return localp;
  }
  
  public static l Mu()
  {
    GMTrace.i(1380563550208L, 10286);
    h.xw().wG();
    if (Mt().gZD == null) {
      Mt().gZD = new l(h.xy().fYV);
    }
    l locall = Mt().gZD;
    GMTrace.o(1380563550208L, 10286);
    return locall;
  }
  
  public static void e(com.tencent.mm.network.e parame)
  {
    GMTrace.i(1380697767936L, 10287);
    if (parame == null) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SubCoreStat", "dknetstat setNetworkMoniter  isnull:%b  ,  %s ", new Object[] { Boolean.valueOf(bool), bg.bQW() });
      if (parame != null) {
        parame.a(Mt().gZC);
      }
      GMTrace.o(1380697767936L, 10287);
      return;
    }
  }
  
  public static void f(com.tencent.mm.network.e parame)
  {
    GMTrace.i(1380831985664L, 10288);
    if (parame == null) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SubCoreStat", "setKVReportMonitor  isnull:%b  ,  %s ", new Object[] { Boolean.valueOf(bool), bg.bQW() });
      if (parame != null) {
        parame.a(Mt().gZE);
      }
      GMTrace.o(1380831985664L, 10288);
      return;
    }
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(1381368856576L, 10292);
    d.c.a(Integer.valueOf(9998), this.gZC);
    h.xx().a(this.gzE);
    com.tencent.mm.y.ak.a.gmY = new ak.e()
    {
      public final void aI(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(1371034091520L, 10215);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SubCoreStat", "ReportDataFlow [%d][%d][%d] : %s ", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(0), bg.bQW() });
        m.s(paramAnonymousInt1, paramAnonymousInt2, 0);
        GMTrace.o(1371034091520L, 10215);
      }
    };
    GMTrace.o(1381368856576L, 10292);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(1381503074304L, 10293);
    GMTrace.o(1381503074304L, 10293);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(1381234638848L, 10291);
    GMTrace.o(1381234638848L, 10291);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(1380966203392L, 10289);
    h.xx().b(this.gzE);
    d.c.aE(Integer.valueOf(9998));
    this.gZC = new k();
    com.tencent.mm.y.ak.a.gmY = null;
    GMTrace.o(1380966203392L, 10289);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(1381100421120L, 10290);
    HashMap localHashMap = fIv;
    GMTrace.o(1381100421120L, 10290);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelstat\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */