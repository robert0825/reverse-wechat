package com.tencent.mm.pluginsdk.model.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.ck;
import com.tencent.mm.g.a.ha;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.pluginsdk.j.a.d.p;
import com.tencent.mm.pluginsdk.j.a.d.s;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class an
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private o toO;
  private am.a toP;
  private j toQ;
  private com.tencent.mm.pluginsdk.model.b toR;
  private final s toS;
  private com.tencent.mm.sdk.b.c toT;
  private com.tencent.mm.sdk.b.c toU;
  
  static
  {
    GMTrace.i(787186974720L, 5865);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("APPMESSAGE_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(17956050305024L, 133783);
        String[] arrayOfString = k.fTX;
        GMTrace.o(17956050305024L, 133783);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("APPSORT_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(796582215680L, 5935);
        String[] arrayOfString = o.fTX;
        GMTrace.o(796582215680L, 5935);
        return arrayOfString;
      }
    });
    GMTrace.o(787186974720L, 5865);
  }
  
  public an()
  {
    GMTrace.i(784905273344L, 5848);
    this.toP = null;
    this.toQ = new j();
    this.toR = new com.tencent.mm.pluginsdk.model.b();
    this.toT = new com.tencent.mm.sdk.b.c()
    {
      private static boolean a(ha paramAnonymousha)
      {
        GMTrace.i(17956452958208L, 133786);
        for (;;)
        {
          try
          {
            com.tencent.mm.k.e locale = com.tencent.mm.k.g.ut();
            if (locale != null) {
              continue;
            }
            i = 0;
          }
          catch (Exception localException)
          {
            int i = 0;
            continue;
          }
          paramAnonymousha.eKh.eDY = i;
          GMTrace.o(17956452958208L, 133786);
          return false;
          i = bg.getInt(com.tencent.mm.k.g.ut().getValue("AndroidUseUnicodeEmoji"), 0);
        }
      }
    };
    this.toU = new com.tencent.mm.sdk.b.c() {};
    this.toS = new s();
    GMTrace.o(784905273344L, 5848);
  }
  
  public static d aGk()
  {
    GMTrace.i(786381668352L, 5859);
    d locald = com.tencent.mm.plugin.x.a.aGk();
    GMTrace.o(786381668352L, 5859);
    return locald;
  }
  
  public static m aWA()
  {
    GMTrace.i(786247450624L, 5858);
    m localm = com.tencent.mm.plugin.x.a.aWA();
    GMTrace.o(786247450624L, 5858);
    return localm;
  }
  
  public static e aWw()
  {
    GMTrace.i(785442144256L, 5852);
    e locale = com.tencent.mm.plugin.x.a.aWw();
    GMTrace.o(785442144256L, 5852);
    return locale;
  }
  
  public static h aWx()
  {
    GMTrace.i(785576361984L, 5853);
    h localh = com.tencent.mm.plugin.x.a.aWx();
    GMTrace.o(785576361984L, 5853);
    return localh;
  }
  
  public static i aWy()
  {
    GMTrace.i(785710579712L, 5854);
    i locali = com.tencent.mm.plugin.x.a.aWy();
    GMTrace.o(785710579712L, 5854);
    return locali;
  }
  
  public static c afP()
  {
    GMTrace.i(785307926528L, 5851);
    c localc = com.tencent.mm.plugin.x.a.afP();
    GMTrace.o(785307926528L, 5851);
    return localc;
  }
  
  private static an bJG()
  {
    GMTrace.i(785039491072L, 5849);
    an localan2 = (an)at.AK().gZ(an.class.getName());
    an localan1 = localan2;
    if (localan2 == null) {
      localan1 = new an();
    }
    GMTrace.o(785039491072L, 5849);
    return localan1;
  }
  
  public static j bJH()
  {
    GMTrace.i(785173708800L, 5850);
    j localj = bJG().toQ;
    GMTrace.o(785173708800L, 5850);
    return localj;
  }
  
  public static k bJI()
  {
    GMTrace.i(785844797440L, 5855);
    k localk = com.tencent.mm.plugin.x.a.aWz();
    GMTrace.o(785844797440L, 5855);
    return localk;
  }
  
  public static o bJJ()
  {
    GMTrace.i(785979015168L, 5856);
    com.tencent.mm.kernel.h.xw().wG();
    if (bJG().toO == null)
    {
      localObject = bJG();
      at.AR();
      ((an)localObject).toO = new o(com.tencent.mm.y.c.yH());
    }
    Object localObject = bJG().toO;
    GMTrace.o(785979015168L, 5856);
    return (o)localObject;
  }
  
  public static am.a bJK()
  {
    GMTrace.i(786113232896L, 5857);
    com.tencent.mm.kernel.h.xw().wG();
    if (bJG().toP == null) {
      bJG().toP = new am.a();
    }
    am.a locala = bJG().toP;
    GMTrace.o(786113232896L, 5857);
    return locala;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(786918539264L, 5863);
    com.tencent.mm.y.ab.a.gmV = com.tencent.mm.plugin.x.a.aWx();
    d.c.a(Integer.valueOf(47), this.toR);
    d.c.a(Integer.valueOf(49), this.toQ);
    com.tencent.mm.sdk.b.a.vgX.b(this.toT);
    com.tencent.mm.sdk.b.a.vgX.b(this.toU);
    SightVideoJNI.registerALL();
    s locals = this.toS;
    Iterator localIterator = p.bKq().iterator();
    while (localIterator.hasNext()) {
      ((com.tencent.mm.pluginsdk.j.a.d.g)localIterator.next()).bCN();
    }
    com.tencent.mm.kernel.h.xx().a(locals.trD);
    com.tencent.mm.sdk.b.a.vgX.b(locals.trE);
    GMTrace.o(786918539264L, 5863);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(787052756992L, 5864);
    GMTrace.o(787052756992L, 5864);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(786784321536L, 5862);
    GMTrace.o(786784321536L, 5862);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(786515886080L, 5860);
    Object localObject = bJG().toP;
    if (localObject != null) {
      ((am.a)localObject).eyZ = 0;
    }
    d.c.aE(Integer.valueOf(47));
    d.c.aE(Integer.valueOf(49));
    com.tencent.mm.sdk.b.a.vgX.c(this.toT);
    com.tencent.mm.sdk.b.a.vgX.c(this.toU);
    com.tencent.mm.pluginsdk.model.j.bJi();
    localObject = this.toS;
    com.tencent.mm.kernel.h.xx().b(((s)localObject).trD);
    com.tencent.mm.sdk.b.a.vgX.c(((s)localObject).trE);
    localObject = p.bKq().iterator();
    while (((Iterator)localObject).hasNext()) {
      ((com.tencent.mm.pluginsdk.j.a.d.g)((Iterator)localObject).next()).onAccountRelease();
    }
    GMTrace.o(786515886080L, 5860);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(786650103808L, 5861);
    HashMap localHashMap = fIv;
    GMTrace.o(786650103808L, 5861);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */