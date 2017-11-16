package com.tencent.mm.af;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.af.a.g;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.as.a;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import com.tencent.mm.y.p;
import com.tencent.mm.y.s;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class x
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private static long gxA;
  private com.tencent.mm.y.e gnk;
  private e gxB;
  private m.a gxC;
  private k gxD;
  private i gxE;
  private h gxF;
  private com.tencent.mm.af.a.d gxG;
  private com.tencent.mm.af.a.b gxH;
  private com.tencent.mm.af.a.k gxI;
  private g gxJ;
  private com.tencent.mm.af.a.i gxK;
  private com.tencent.mm.af.a.h gxL;
  private c gxM;
  private a gxN;
  private bt.a gxO;
  private as.a gxP;
  private e.a gxQ;
  
  static
  {
    GMTrace.i(4527163965440L, 33730);
    gxA = 0L;
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("BIZINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4548638801920L, 33890);
        String[] arrayOfString = e.fTX;
        GMTrace.o(4548638801920L, 33890);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("BIZKF_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4527432400896L, 33732);
        String[] arrayOfString = i.fTX;
        GMTrace.o(4527432400896L, 33732);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("BIZCHAT_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4537632948224L, 33808);
        String[] arrayOfString = com.tencent.mm.af.a.d.fTX;
        GMTrace.o(4537632948224L, 33808);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("BIZCHATUSER_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4551591591936L, 33912);
        String[] arrayOfString = com.tencent.mm.af.a.k.fTX;
        GMTrace.o(4551591591936L, 33912);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("BIZCONVERSATION_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4556691865600L, 33950);
        String[] arrayOfString = com.tencent.mm.af.a.b.fTX;
        GMTrace.o(4556691865600L, 33950);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("BIZCHAMYUSERINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4585146023936L, 34162);
        String[] arrayOfString = g.fTX;
        GMTrace.o(4585146023936L, 34162);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("BIZENTERPRISE_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4584877588480L, 34160);
        String[] arrayOfString = c.fTX;
        GMTrace.o(4584877588480L, 34160);
        return arrayOfString;
      }
    });
    GMTrace.o(4527163965440L, 33730);
  }
  
  public x()
  {
    GMTrace.i(4524076957696L, 33707);
    this.gxC = null;
    this.gxD = null;
    this.gxF = null;
    this.gxG = null;
    this.gxH = null;
    this.gxI = null;
    this.gxJ = null;
    this.gxK = null;
    this.gxL = null;
    this.gxM = null;
    this.gnk = new com.tencent.mm.y.e();
    this.gxO = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(4539780431872L, 33824);
        paramAnonymousa = paramAnonymousa.gtM;
        if (paramAnonymousa == null)
        {
          w.e("MicroMsg.SubCoreBiz", "AddMsg is null.");
          GMTrace.o(4539780431872L, 33824);
          return;
        }
        paramAnonymousa = com.tencent.mm.platformtools.n.a(paramAnonymousa.tPY);
        if (bg.nm(paramAnonymousa))
        {
          w.e("MicroMsg.SubCoreBiz", "msg content is null");
          GMTrace.o(4539780431872L, 33824);
          return;
        }
        paramAnonymousa = bh.q(paramAnonymousa, "sysmsg");
        if ((paramAnonymousa == null) || (paramAnonymousa.size() <= 0))
        {
          w.e("MicroMsg.SubCoreBiz", "receiveMessage, no sysmsg");
          GMTrace.o(4539780431872L, 33824);
          return;
        }
        if (!"mmbizattrappsvr_BizAttrSync".equalsIgnoreCase((String)paramAnonymousa.get(".sysmsg.$type")))
        {
          w.e("MicroMsg.SubCoreBiz", "receiveMessage, type not BizAttrSync.");
          GMTrace.o(4539780431872L, 33824);
          return;
        }
        int i = bg.getInt((String)paramAnonymousa.get(".sysmsg.mmbizattrappsvr_BizAttrSync.openflag"), 0);
        w.i("MicroMsg.SubCoreBiz", "BizAttrSync openFlag : %d.", new Object[] { Integer.valueOf(i) });
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vrM, Integer.valueOf(i));
        com.tencent.mm.kernel.h.xy().xh().kL(true);
        GMTrace.o(4539780431872L, 33824);
      }
    };
    this.gxP = new as.a()
    {
      public final void a(ae paramAnonymousae, as paramAnonymousas)
      {
        GMTrace.i(4544880705536L, 33862);
        if ((paramAnonymousae != null) && (!bg.nm(paramAnonymousae.field_username)))
        {
          paramAnonymousas = paramAnonymousae.field_username;
          Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramAnonymousas);
          if (localObject == null)
          {
            GMTrace.o(4544880705536L, 33862);
            return;
          }
          if ((((com.tencent.mm.storage.x)localObject).bSA()) && (!s.fP(paramAnonymousas)))
          {
            localObject = x.FG().iC(paramAnonymousas);
            if (((d)localObject).vmr == -1L)
            {
              w.i("MicroMsg.SubCoreBiz", "onMsgChangeNotify: no bizInfo");
              GMTrace.o(4544880705536L, 33862);
              return;
            }
            if (((d)localObject).EG())
            {
              if (((d)localObject).bq(false) == null)
              {
                paramAnonymousae.cQ(null);
                w.e("MicroMsg.SubCoreBiz", "getExtInfo() == null");
                GMTrace.o(4544880705536L, 33862);
                return;
              }
              if (((d)localObject).bq(false).Fh() == null)
              {
                paramAnonymousae.cQ(null);
                w.e("MicroMsg.SubCoreBiz", "enterpriseBizInfo == null");
                GMTrace.o(4544880705536L, 33862);
                return;
              }
              if (!((d)localObject).EH())
              {
                paramAnonymousae.cQ(bg.nl(((d)localObject).EN()));
                if (bg.nm(((d)localObject).EN()))
                {
                  w.w("MicroMsg.SubCoreBiz", "Enterprise belong is null:%s", new Object[] { paramAnonymousae.field_username });
                  GMTrace.o(4544880705536L, 33862);
                }
              }
              else
              {
                paramAnonymousae.cQ(null);
              }
              GMTrace.o(4544880705536L, 33862);
              return;
            }
            if ((((d)localObject).EC()) || (((d)localObject).EF()) || (s.gk(paramAnonymousas)))
            {
              paramAnonymousae.cQ(null);
              GMTrace.o(4544880705536L, 33862);
              return;
            }
            paramAnonymousae.cQ("officialaccounts");
          }
        }
        GMTrace.o(4544880705536L, 33862);
      }
    };
    this.gxQ = new e.a()
    {
      public final void a(e.a.b paramAnonymousb)
      {
        GMTrace.i(4590112079872L, 34199);
        Object localObject;
        ae localae;
        int i;
        if ((paramAnonymousb.gwW == e.a.a.gwS) || (paramAnonymousb.gwW == e.a.a.gwU))
        {
          if (paramAnonymousb.gwX == null)
          {
            GMTrace.o(4590112079872L, 34199);
            return;
          }
          localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramAnonymousb.gvB);
          if (localObject == null)
          {
            GMTrace.o(4590112079872L, 34199);
            return;
          }
          if (!((com.tencent.mm.storage.x)localObject).bSA())
          {
            x.h(paramAnonymousb.gwX);
            GMTrace.o(4590112079872L, 34199);
            return;
          }
          if (s.fP(((af)localObject).field_username))
          {
            GMTrace.o(4590112079872L, 34199);
            return;
          }
          localae = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TO(paramAnonymousb.gvB);
          w.v("MicroMsg.SubCoreBiz", "hakon onEvent bizName = %s", new Object[] { paramAnonymousb.gvB });
          if ((paramAnonymousb.gwX.EG()) && (paramAnonymousb.gwX.bq(false) != null) && (paramAnonymousb.gwX.bq(false).Fh() != null) && (!bg.nm(paramAnonymousb.gwX.EN())) && (bg.nm(paramAnonymousb.gwX.field_enterpriseFather)))
          {
            paramAnonymousb.gwX.field_enterpriseFather = paramAnonymousb.gwX.EN();
            x.FG().e(paramAnonymousb.gwX);
            w.i("MicroMsg.SubCoreBiz", "hakon bizStgExt, %s set enterpriseFather %s", new Object[] { paramAnonymousb.gvB, paramAnonymousb.gwX.field_enterpriseFather });
          }
          if (localae == null)
          {
            GMTrace.o(4590112079872L, 34199);
            return;
          }
          if (paramAnonymousb.gwX.EG())
          {
            if (paramAnonymousb.gwX.bq(false) == null)
            {
              w.e("MicroMsg.SubCoreBiz", "getExtInfo() == null");
              GMTrace.o(4590112079872L, 34199);
              return;
            }
            if (paramAnonymousb.gwX.bq(false).Fh() == null)
            {
              w.e("MicroMsg.SubCoreBiz", "enterpriseBizInfo == null");
              GMTrace.o(4590112079872L, 34199);
              return;
            }
            localObject = localae.field_parentRef;
            if (!paramAnonymousb.gwX.EH())
            {
              w.i("MicroMsg.SubCoreBiz", "Enterprise belong %s, userName: %s", new Object[] { paramAnonymousb.gwX.EN(), paramAnonymousb.gvB });
              localae.cQ(bg.nl(paramAnonymousb.gwX.EN()));
              if ((localObject == null) || (localae.field_parentRef == null) || (((String)localObject).equals(localae.field_parentRef))) {
                break label525;
              }
              i = 1;
            }
          }
        }
        for (;;)
        {
          label445:
          w.v("MicroMsg.SubCoreBiz", "hakon isEnterpriseChildType, %s, %s", new Object[] { paramAnonymousb.gvB, localae.field_parentRef });
          for (;;)
          {
            if (i != 0)
            {
              ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().a(localae, localae.field_username);
              if (bg.nm(localae.field_parentRef))
              {
                GMTrace.o(4590112079872L, 34199);
                return;
                localae.cQ(null);
                break;
                label525:
                if ((localObject == null) && (localae.field_parentRef != null))
                {
                  i = 1;
                  break label445;
                }
                if ((localObject == null) || (localae.field_parentRef != null)) {
                  break label1088;
                }
                i = 1;
                break label445;
                if (paramAnonymousb.gwX.EF())
                {
                  w.v("MicroMsg.SubCoreBiz", "hakon isEnterpriseFatherType, %s", new Object[] { paramAnonymousb.gvB });
                  i = 1;
                  continue;
                }
                if ((!paramAnonymousb.gwX.EC()) && (!s.gk(((af)localObject).field_username)) && (!"officialaccounts".equals(localae.field_parentRef)))
                {
                  localae.cQ("officialaccounts");
                  i = 1;
                  continue;
                }
                if ((!paramAnonymousb.gwX.EC()) || (localae.field_parentRef == null)) {
                  break label1083;
                }
                localae.cQ(null);
                i = 1;
                continue;
              }
              if ("officialaccounts".equals(localae.field_parentRef))
              {
                localae = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TO("officialaccounts");
                paramAnonymousb = localae;
                if (localae == null)
                {
                  paramAnonymousb = new ae("officialaccounts");
                  paramAnonymousb.bSW();
                  ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().d(paramAnonymousb);
                }
                if (bg.nm(paramAnonymousb.field_content))
                {
                  w.i("MicroMsg.SubCoreBiz", "conv content is null");
                  paramAnonymousb = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().bTg();
                  if (bg.nm(paramAnonymousb))
                  {
                    w.w("MicroMsg.SubCoreBiz", "last convBiz is null");
                    GMTrace.o(4590112079872L, 34199);
                    return;
                  }
                  paramAnonymousb = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Ca(paramAnonymousb);
                  if ((paramAnonymousb == null) || (paramAnonymousb.field_msgId == 0L))
                  {
                    w.w("MicroMsg.SubCoreBiz", "last biz msg is error");
                    GMTrace.o(4590112079872L, 34199);
                    return;
                  }
                  ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(paramAnonymousb.field_msgId, paramAnonymousb);
                }
                GMTrace.o(4590112079872L, 34199);
                return;
              }
              w.i("MicroMsg.SubCoreBiz", "hakon username = %s, parentRef = %s", new Object[] { paramAnonymousb.gvB, localae.field_parentRef });
              paramAnonymousb = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TO(localae.field_parentRef);
              if (paramAnonymousb == null)
              {
                GMTrace.o(4590112079872L, 34199);
                return;
              }
              if (bg.nm(paramAnonymousb.field_content))
              {
                w.i("MicroMsg.SubCoreBiz", "conv content is null");
                paramAnonymousb = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TZ(localae.field_parentRef);
                if (bg.nm(paramAnonymousb))
                {
                  w.w("MicroMsg.SubCoreBiz", "last enterprise convBiz is null");
                  GMTrace.o(4590112079872L, 34199);
                  return;
                }
                paramAnonymousb = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Ca(paramAnonymousb);
                if ((paramAnonymousb == null) || (paramAnonymousb.field_msgId == 0L))
                {
                  w.w("MicroMsg.SubCoreBiz", "last enterprise biz msg is error");
                  GMTrace.o(4590112079872L, 34199);
                  return;
                }
                ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(paramAnonymousb.field_msgId, paramAnonymousb);
              }
            }
            GMTrace.o(4590112079872L, 34199);
            return;
            label1083:
            i = 0;
          }
          label1088:
          i = 0;
        }
      }
    };
    GMTrace.o(4524076957696L, 33707);
  }
  
  private static x FE()
  {
    try
    {
      GMTrace.i(4524211175424L, 33708);
      x localx = (x)p.o(x.class);
      GMTrace.o(4524211175424L, 33708);
      return localx;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static i FF()
  {
    GMTrace.i(4524345393152L, 33709);
    com.tencent.mm.kernel.h.xw().wG();
    if (FE().gxE == null) {
      FE().gxE = new i(com.tencent.mm.kernel.h.xy().fYV);
    }
    i locali = FE().gxE;
    GMTrace.o(4524345393152L, 33709);
    return locali;
  }
  
  public static e FG()
  {
    GMTrace.i(4524479610880L, 33710);
    com.tencent.mm.kernel.h.xw().wG();
    if (FE().gxB == null) {
      FE().gxB = new e(com.tencent.mm.kernel.h.xy().fYV);
    }
    e locale = FE().gxB;
    GMTrace.o(4524479610880L, 33710);
    return locale;
  }
  
  public static h FH()
  {
    GMTrace.i(4524613828608L, 33711);
    com.tencent.mm.kernel.h.xw().wG();
    h localh;
    if (FE().gxF == null)
    {
      FE().gxF = new h();
      localh = FE().gxF;
      com.tencent.mm.kernel.h.xx().fYr.a(675, localh);
      com.tencent.mm.kernel.h.xx().fYr.a(672, localh);
      com.tencent.mm.kernel.h.xx().fYr.a(674, localh);
    }
    synchronized (localh.gwY)
    {
      localh.gxa.clear();
      ??? = FE().gxF;
      GMTrace.o(4524613828608L, 33711);
      return (h)???;
    }
  }
  
  public static com.tencent.mm.af.a.d FI()
  {
    GMTrace.i(4524748046336L, 33712);
    com.tencent.mm.kernel.h.xw().wG();
    if (FE().gxG == null) {
      FE().gxG = new com.tencent.mm.af.a.d(com.tencent.mm.kernel.h.xy().fYV);
    }
    com.tencent.mm.af.a.d locald = FE().gxG;
    GMTrace.o(4524748046336L, 33712);
    return locald;
  }
  
  public static com.tencent.mm.af.a.b FJ()
  {
    GMTrace.i(4524882264064L, 33713);
    com.tencent.mm.kernel.h.xw().wG();
    if (FE().gxH == null) {
      FE().gxH = new com.tencent.mm.af.a.b(com.tencent.mm.kernel.h.xy().fYV);
    }
    com.tencent.mm.af.a.b localb = FE().gxH;
    GMTrace.o(4524882264064L, 33713);
    return localb;
  }
  
  public static com.tencent.mm.af.a.k FK()
  {
    GMTrace.i(4525016481792L, 33714);
    com.tencent.mm.kernel.h.xw().wG();
    if (FE().gxI == null) {
      FE().gxI = new com.tencent.mm.af.a.k(com.tencent.mm.kernel.h.xy().fYV);
    }
    com.tencent.mm.af.a.k localk = FE().gxI;
    GMTrace.o(4525016481792L, 33714);
    return localk;
  }
  
  public static g FL()
  {
    GMTrace.i(4525150699520L, 33715);
    com.tencent.mm.kernel.h.xw().wG();
    if (FE().gxJ == null) {
      FE().gxJ = new g(com.tencent.mm.kernel.h.xy().fYV);
    }
    g localg = FE().gxJ;
    GMTrace.o(4525150699520L, 33715);
    return localg;
  }
  
  public static com.tencent.mm.af.a.h FM()
  {
    GMTrace.i(4525284917248L, 33716);
    com.tencent.mm.kernel.h.xw().wG();
    if (FE().gxL == null) {
      FE().gxL = new com.tencent.mm.af.a.h();
    }
    com.tencent.mm.af.a.h localh = FE().gxL;
    GMTrace.o(4525284917248L, 33716);
    return localh;
  }
  
  public static c FN()
  {
    GMTrace.i(4525419134976L, 33717);
    com.tencent.mm.kernel.h.xw().wG();
    if (FE().gxM == null) {
      FE().gxM = new c(com.tencent.mm.kernel.h.xy().fYV);
    }
    c localc = FE().gxM;
    GMTrace.o(4525419134976L, 33717);
    return localc;
  }
  
  public static m.a FO()
  {
    GMTrace.i(4525553352704L, 33718);
    com.tencent.mm.kernel.h.xw().wG();
    if (FE().gxC == null) {
      FE().gxC = new m.a();
    }
    m.a locala = FE().gxC;
    GMTrace.o(4525553352704L, 33718);
    return locala;
  }
  
  public static k FP()
  {
    GMTrace.i(4525687570432L, 33719);
    com.tencent.mm.kernel.h.xw().wG();
    if (FE().gxD == null) {
      FE().gxD = new k();
    }
    k localk = FE().gxD;
    GMTrace.o(4525687570432L, 33719);
    return localk;
  }
  
  public static a FQ()
  {
    GMTrace.i(4525821788160L, 33720);
    if (FE().gxN == null) {
      FE().gxN = new a();
    }
    a locala = FE().gxN;
    GMTrace.o(4525821788160L, 33720);
    return locala;
  }
  
  public static com.tencent.mm.af.a.i FR()
  {
    GMTrace.i(4525956005888L, 33721);
    com.tencent.mm.kernel.h.xw().wG();
    if (FE().gxK == null) {
      FE().gxK = new com.tencent.mm.af.a.i();
    }
    com.tencent.mm.af.a.i locali = FE().gxK;
    GMTrace.o(4525956005888L, 33721);
    return locali;
  }
  
  public static long FS()
  {
    GMTrace.i(4526090223616L, 33722);
    if (gxA == 0L)
    {
      Object localObject = com.tencent.mm.kernel.h.xy().xh().get(w.a.vqI, null);
      if ((localObject != null) && ((localObject instanceof Long)))
      {
        gxA = ((Long)localObject).longValue();
        w.i("MicroMsg.SubCoreBiz", "temp session needUpdateTime : %d.(get from ConfigStorage)", new Object[] { Long.valueOf(gxA) });
      }
    }
    if (gxA == 0L)
    {
      gxA = System.currentTimeMillis();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vqI, Long.valueOf(gxA));
      w.i("MicroMsg.SubCoreBiz", "temp session needUpdateTime is 0, so get current time : %d.", new Object[] { Long.valueOf(gxA) });
    }
    long l = gxA;
    GMTrace.o(4526090223616L, 33722);
    return l;
  }
  
  public static void h(d paramd)
  {
    GMTrace.i(16085189394432L, 119844);
    if ((paramd.EG()) && (!paramd.EH()) && (paramd.bq(false) != null) && (paramd.bq(false).Fh() != null) && (!bg.nm(paramd.EN())))
    {
      if (((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TO(paramd.EN()) == null) {
        w.d("MicroMsg.SubCoreBiz", "father conv is null");
      }
      if (((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TO(paramd.field_username) == null)
      {
        w.v("MicroMsg.SubCoreBiz", "add empty conv for enterprise child %s", new Object[] { paramd.field_username });
        ae localae = new ae(paramd.field_username);
        if (!paramd.EH())
        {
          w.i("MicroMsg.SubCoreBiz", "Enterprise belong %s, userName: %s", new Object[] { paramd.EN(), paramd.field_username });
          localae.cQ(bg.nl(paramd.EN()));
          localae.bSW();
          ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().d(localae);
        }
      }
    }
    GMTrace.o(16085189394432L, 119844);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(4526627094528L, 33726);
    d.c.a(Integer.valueOf(55), this.gnk);
    d.c.a(Integer.valueOf(57), this.gnk);
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().b(this.gxP);
    FG().a(this.gxQ, null);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("mmbizattrappsvr_BizAttrSync", this.gxO, true);
    GMTrace.o(4526627094528L, 33726);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(4526895529984L, 33728);
    GMTrace.o(4526895529984L, 33728);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(4526358659072L, 33724);
    GMTrace.o(4526358659072L, 33724);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(4526761312256L, 33727);
    d.c.aE(Integer.valueOf(55));
    d.c.aE(Integer.valueOf(57));
    h localh;
    if (FE().gxF != null)
    {
      localh = FE().gxF;
      com.tencent.mm.kernel.h.xx().fYr.b(675, localh);
      com.tencent.mm.kernel.h.xx().fYr.b(672, localh);
      com.tencent.mm.kernel.h.xx().fYr.b(674, localh);
    }
    synchronized (localh.gwY)
    {
      localh.gxa.clear();
      localh.gwZ.clear();
      if (com.tencent.mm.kernel.h.xw().wL())
      {
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().c(this.gxP);
        FG().a(this.gxQ);
      }
      ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("mmbizattrappsvr_BizAttrSync", this.gxO, true);
      GMTrace.o(4526761312256L, 33727);
      return;
    }
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(4526224441344L, 33723);
    HashMap localHashMap = fIv;
    GMTrace.o(4526224441344L, 33723);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */