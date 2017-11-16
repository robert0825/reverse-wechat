package com.tencent.mm.plugin.backup.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.aw.n;
import com.tencent.mm.bc.m;
import com.tencent.mm.bu.f.a;
import com.tencent.mm.bu.g.a;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.am;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.ae;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class c
{
  private String cachePath;
  String fYU;
  public com.tencent.mm.bu.g fYV;
  private t fYX;
  private ba fYY;
  private com.tencent.mm.aw.b gQm;
  private com.tencent.mm.af.e gxB;
  private s hca;
  private u hem;
  ae jcA;
  private m jcB;
  private com.tencent.mm.ac.g jcC;
  private com.tencent.mm.modelstat.l jcD;
  private n jcE;
  public k jcF;
  public com.tencent.mm.pluginsdk.model.app.i jcG;
  private com.tencent.mm.pluginsdk.model.app.c jcH;
  public com.tencent.mm.bu.f jcI;
  public Boolean jcJ;
  private ar jcu;
  private com.tencent.mm.plugin.messenger.foundation.a.a.c jcv;
  private as jcw;
  private com.tencent.mm.ao.f jcx;
  private com.tencent.mm.storage.emotion.d jcy;
  public com.tencent.mm.plugin.messenger.foundation.a.a.f jcz;
  public int uin;
  
  public c()
  {
    GMTrace.i(14852802215936L, 110662);
    this.fYV = null;
    this.jcI = null;
    this.uin = 0;
    this.jcJ = null;
    GMTrace.o(14852802215936L, 110662);
  }
  
  public final com.tencent.mm.ao.f IZ()
  {
    GMTrace.i(14853741740032L, 110669);
    if (this.uin == 0) {
      throw new com.tencent.mm.y.b();
    }
    com.tencent.mm.ao.f localf = this.jcx;
    GMTrace.o(14853741740032L, 110669);
    return localf;
  }
  
  public final s Nh()
  {
    GMTrace.i(14854010175488L, 110671);
    if (this.uin == 0) {
      throw new com.tencent.mm.y.b();
    }
    s locals = this.hca;
    GMTrace.o(14854010175488L, 110671);
    return locals;
  }
  
  final void afN()
  {
    GMTrace.i(14853070651392L, 110664);
    this.fYX = new t(this.fYV);
    com.tencent.mm.plugin.messenger.foundation.a.i locali = (com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.i.class);
    this.jcu = locali.d(this.fYV);
    this.jcw = locali.e(this.fYV);
    this.jcv = locali.a(this.fYV, this.jcu, this.jcw);
    this.jcv.a(new am(this.jcv));
    this.jcv.a(new o(this.jcv));
    this.jcz = locali.f(this.fYV);
    this.jcx = new com.tencent.mm.ao.f(this.fYV);
    if (com.tencent.mm.bj.d.LL("emoji")) {
      this.jcy = new com.tencent.mm.storage.emotion.d(this.fYV);
    }
    this.jcA = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).c(this.fYV);
    this.jcC = new com.tencent.mm.ac.g(this.fYV);
    this.hem = new u(this.fYV);
    this.hca = new s(this.fYV);
    this.jcB = new m(this.fYV);
    this.jcD = new com.tencent.mm.modelstat.l(this.fYV);
    this.jcE = new n(this.fYV);
    this.gQm = new com.tencent.mm.aw.b(this.fYV);
    this.jcF = new k(this.fYV);
    this.jcG = new com.tencent.mm.pluginsdk.model.app.i(this.fYV);
    this.jcH = new com.tencent.mm.pluginsdk.model.app.c(this.fYV);
    this.gxB = new com.tencent.mm.af.e(this.fYV);
    this.fYY = new ba(this.fYX);
    this.fYY.c(new j.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(14855352352768L, 110681);
        p.dO(paramAnonymousString);
        GMTrace.o(14855352352768L, 110681);
      }
    });
    this.fYY.bUp();
    GMTrace.o(14853070651392L, 110664);
  }
  
  public final com.tencent.mm.storage.emotion.d afO()
  {
    GMTrace.i(14853875957760L, 110670);
    if (this.uin == 0) {
      throw new com.tencent.mm.y.b();
    }
    com.tencent.mm.storage.emotion.d locald = this.jcy;
    GMTrace.o(14853875957760L, 110670);
    return locald;
  }
  
  public final com.tencent.mm.pluginsdk.model.app.c afP()
  {
    GMTrace.i(14854278610944L, 110673);
    if (this.uin == 0) {
      throw new com.tencent.mm.y.b();
    }
    com.tencent.mm.pluginsdk.model.app.c localc = this.jcH;
    GMTrace.o(14854278610944L, 110673);
    return localc;
  }
  
  public final void k(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(14852936433664L, 110663);
    w.i("MicroMsg.TempStorage", "accPath %s, cachePath %s, accUin:%d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
    this.uin = paramInt;
    this.fYU = paramString1;
    this.cachePath = paramString2;
    GMTrace.o(14852936433664L, 110663);
  }
  
  public final t xh()
  {
    GMTrace.i(14853204869120L, 110665);
    if (this.uin == 0) {
      throw new com.tencent.mm.y.b();
    }
    t localt = this.fYX;
    GMTrace.o(14853204869120L, 110665);
    return localt;
  }
  
  public final void yE()
  {
    GMTrace.i(18452924334080L, 137485);
    w.i("MicroMsg.TempStorage", "closeDB isTempDb:%s datadb:%s memdb:%s %s", new Object[] { this.jcJ, this.fYV, this.jcI, bg.bQW() });
    if ((this.jcJ != null) && (!this.jcJ.booleanValue()))
    {
      this.jcJ = null;
      GMTrace.o(18452924334080L, 137485);
      return;
    }
    if (this.fYV != null)
    {
      w.i("MicroMsg.TempStorage", "closeDB true DB[%s]!!! ", new Object[] { this.fYV });
      this.fYV.yE();
      this.fYV = null;
    }
    if (this.jcI != null)
    {
      com.tencent.mm.bu.f localf = this.jcI;
      com.tencent.mm.bu.f.vDr = bg.bQW().toString();
      if (localf.vCT != null)
      {
        localf.vCT.close();
        localf.vCT = null;
      }
      this.jcI = null;
    }
    this.jcJ = null;
    GMTrace.o(18452924334080L, 137485);
  }
  
  public final ar yK()
  {
    GMTrace.i(14853339086848L, 110666);
    if (this.uin == 0) {
      throw new com.tencent.mm.y.b();
    }
    ar localar = this.jcu;
    GMTrace.o(14853339086848L, 110666);
    return localar;
  }
  
  public final com.tencent.mm.plugin.messenger.foundation.a.a.c yM()
  {
    GMTrace.i(14853473304576L, 110667);
    if (this.uin == 0) {
      throw new com.tencent.mm.y.b();
    }
    com.tencent.mm.plugin.messenger.foundation.a.a.c localc = this.jcv;
    GMTrace.o(14853473304576L, 110667);
    return localc;
  }
  
  public final as yP()
  {
    GMTrace.i(14853607522304L, 110668);
    if (this.uin == 0) {
      throw new com.tencent.mm.y.b();
    }
    as localas = this.jcw;
    GMTrace.o(14853607522304L, 110668);
    return localas;
  }
  
  public final String zb()
  {
    GMTrace.i(14854144393216L, 110672);
    if (this.uin == 0) {
      throw new com.tencent.mm.y.b();
    }
    String str = this.fYU + "emoji/";
    GMTrace.o(14854144393216L, 110672);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\g\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */