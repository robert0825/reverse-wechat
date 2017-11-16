package com.tencent.mm.plugin.multitalk.a;

import android.content.Context;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.s;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.b;
import com.tencent.mm.y.br;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import com.tencent.mm.y.bw;
import com.tencent.mm.y.bw.a;
import com.tencent.mm.y.q;
import com.tencent.pb.talkroom.sdk.d;
import java.util.HashMap;
import java.util.Map;

public final class o
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private bw.a lvz;
  private c nnB;
  public e nnC;
  private l nnD;
  private h nnE;
  private a nnF;
  private g nnG;
  private com.tencent.mm.plugin.multitalk.b.a nnH;
  private com.tencent.mm.plugin.multitalk.b.c nnI;
  private f nnJ;
  
  static
  {
    GMTrace.i(4757615804416L, 35447);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("MULTITALKINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4738556887040L, 35305);
        String[] arrayOfString = com.tencent.mm.plugin.multitalk.b.a.fTX;
        GMTrace.o(4738556887040L, 35305);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("MULTITALKMEMBER_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4767413698560L, 35520);
        String[] arrayOfString = com.tencent.mm.plugin.multitalk.b.c.fTX;
        GMTrace.o(4767413698560L, 35520);
        return arrayOfString;
      }
    });
    GMTrace.o(4757615804416L, 35447);
  }
  
  public o()
  {
    GMTrace.i(4755468320768L, 35431);
    this.lvz = new bw.a()
    {
      public final boolean BU()
      {
        GMTrace.i(4738825322496L, 35307);
        w.w("MicroMsg.SubCoreMultiTalk", "HERE UninitForUEH is called! multitalk");
        if (o.this.nnC != null)
        {
          o.this.nnC.aHP();
          if (o.this.nnC.nmp != null) {
            w.i("MicroMsg.SubCoreMultiTalk", "dump multiTalkGroup: %s", new Object[] { i.h(o.this.nnC.nmp) });
          }
        }
        GMTrace.o(4738825322496L, 35307);
        return true;
      }
    };
    GMTrace.o(4755468320768L, 35431);
  }
  
  private static o aRM()
  {
    GMTrace.i(4755736756224L, 35433);
    o localo2 = (o)at.AK().gZ("plugin.multitalk");
    o localo1 = localo2;
    if (localo2 == null)
    {
      localo1 = new o();
      at.AK().a("plugin.multitalk", localo1);
    }
    GMTrace.o(4755736756224L, 35433);
    return localo1;
  }
  
  public static com.tencent.mm.plugin.multitalk.b.a aRN()
  {
    GMTrace.i(4755870973952L, 35434);
    at.AR();
    if (com.tencent.mm.y.c.ww() == 0) {
      throw new b();
    }
    if (aRM().nnH == null)
    {
      localObject = aRM();
      at.AR();
      ((o)localObject).nnH = new com.tencent.mm.plugin.multitalk.b.a(com.tencent.mm.y.c.yH());
    }
    Object localObject = aRM().nnH;
    GMTrace.o(4755870973952L, 35434);
    return (com.tencent.mm.plugin.multitalk.b.a)localObject;
  }
  
  public static com.tencent.mm.plugin.multitalk.b.c aRO()
  {
    GMTrace.i(4756005191680L, 35435);
    at.AR();
    if (com.tencent.mm.y.c.ww() == 0) {
      throw new b();
    }
    if (aRM().nnI == null)
    {
      localObject = aRM();
      at.AR();
      ((o)localObject).nnI = new com.tencent.mm.plugin.multitalk.b.c(com.tencent.mm.y.c.yH());
    }
    Object localObject = aRM().nnI;
    GMTrace.o(4756005191680L, 35435);
    return (com.tencent.mm.plugin.multitalk.b.c)localObject;
  }
  
  public static h aRP()
  {
    GMTrace.i(4756139409408L, 35436);
    com.tencent.mm.kernel.h.xw().wG();
    if (aRM().nnE == null) {
      aRM().nnE = new h();
    }
    h localh = aRM().nnE;
    GMTrace.o(4756139409408L, 35436);
    return localh;
  }
  
  public static c aRQ()
  {
    GMTrace.i(4756273627136L, 35437);
    com.tencent.mm.kernel.h.xw().wG();
    if (aRM().nnB == null) {
      aRM().nnB = new c();
    }
    c localc = aRM().nnB;
    GMTrace.o(4756273627136L, 35437);
    return localc;
  }
  
  public static e aRR()
  {
    GMTrace.i(4756407844864L, 35438);
    com.tencent.mm.kernel.h.xw().wG();
    if (aRM().nnC == null) {
      aRM().nnC = new e();
    }
    e locale = aRM().nnC;
    GMTrace.o(4756407844864L, 35438);
    return locale;
  }
  
  public static l aRS()
  {
    GMTrace.i(4756542062592L, 35439);
    com.tencent.mm.kernel.h.xw().wG();
    if (aRM().nnD == null) {
      aRM().nnD = new l();
    }
    l locall = aRM().nnD;
    GMTrace.o(4756542062592L, 35439);
    return locall;
  }
  
  public static g aRT()
  {
    GMTrace.i(4757213151232L, 35444);
    if (aRM().nnG == null) {
      aRM().nnG = new g();
    }
    g localg = aRM().nnG;
    GMTrace.o(4757213151232L, 35444);
    return localg;
  }
  
  public static f aRU()
  {
    GMTrace.i(4757347368960L, 35445);
    if (aRM().nnJ == null) {
      aRM().nnJ = new f();
    }
    f localf = aRM().nnJ;
    GMTrace.o(4757347368960L, 35445);
    return localf;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(4756810498048L, 35441);
    this.nnB = new c();
    this.nnF = new a();
    at.getSysCmdMsgExtension().a("multivoip", this.nnF, true);
    at.xA().a(this.lvz);
    com.tencent.mm.pluginsdk.p.a.tmd = aRT();
    aRT().aRG();
    GMTrace.o(4756810498048L, 35441);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(4756944715776L, 35442);
    GMTrace.o(4756944715776L, 35442);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(4756676280320L, 35440);
    GMTrace.o(4756676280320L, 35440);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(4757078933504L, 35443);
    Object localObject;
    if (this.nnB != null)
    {
      localObject = this.nnB;
      at.wS().b(1918, (com.tencent.mm.ad.e)localObject);
      at.wS().b(1919, (com.tencent.mm.ad.e)localObject);
      at.wS().b(1927, (com.tencent.mm.ad.e)localObject);
      at.wS().b(1928, (com.tencent.mm.ad.e)localObject);
      at.wS().b(1929, (com.tencent.mm.ad.e)localObject);
      at.wS().b(1931, (com.tencent.mm.ad.e)localObject);
      at.wS().b(1932, (com.tencent.mm.ad.e)localObject);
      at.wS().b(1933, (com.tencent.mm.ad.e)localObject);
      at.wS().b(1935, (com.tencent.mm.ad.e)localObject);
      at.wS().b(1937, (com.tencent.mm.ad.e)localObject);
      at.wS().b(1938, (com.tencent.mm.ad.e)localObject);
      at.wS().b(1939, (com.tencent.mm.ad.e)localObject);
      this.nnB = null;
    }
    if (this.nnC != null)
    {
      localObject = this.nnC;
      ab.getContext().unregisterReceiver(((e)localObject).nmE);
      com.tencent.mm.sdk.b.a.vgX.c(((e)localObject).nmF);
      ((e)localObject).c(false, false, false);
      this.nnC = null;
    }
    if (this.nnD != null)
    {
      this.nnD.aRL();
      this.nnD = null;
    }
    if (this.nnE != null)
    {
      this.nnE.reset();
      this.nnE = null;
    }
    at.getSysCmdMsgExtension().b("multivoip", this.nnF, true);
    at.xA().b(this.lvz);
    GMTrace.o(4757078933504L, 35443);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(4755602538496L, 35432);
    HashMap localHashMap = fIv;
    GMTrace.o(4755602538496L, 35432);
    return localHashMap;
  }
  
  final class a
    implements bt.a
  {
    a()
    {
      GMTrace.i(4750233829376L, 35392);
      GMTrace.o(4750233829376L, 35392);
    }
    
    public final void a(d.a parama)
    {
      GMTrace.i(4750368047104L, 35393);
      Object localObject1 = o.aRU();
      String str = com.tencent.mm.platformtools.n.a(parama.gtM.tPY);
      Object localObject2 = bh.q(str, "sysmsg");
      if ((String)((Map)localObject2).get(".sysmsg.multivoip.notfriendnotifydata") != null)
      {
        w.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "receive notfriendnotifydata msg:" + str);
        GMTrace.o(4750368047104L, 35393);
        return;
      }
      str = (String)((Map)localObject2).get(".sysmsg.multivoip.notifydata");
      if (str != null)
      {
        localObject1 = Base64.decode(bg.aq(str, "").getBytes(), 0);
        w.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "receive " + com.tencent.mm.platformtools.n.a(parama.gtM.tPY) + " buffer len " + localObject1.length);
        o.aRQ().nlX.aQ(bg.e((Integer)at.AP().get(1)), q.zE());
        o.aRQ().nlX.bz((byte[])localObject1);
        GMTrace.o(4750368047104L, 35393);
        return;
      }
      localObject2 = (String)((Map)localObject2).get(".sysmsg.multivoip.banner");
      if (localObject2 != null) {
        ((f)localObject1).a((String)localObject2, parama);
      }
      GMTrace.o(4750368047104L, 35393);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */