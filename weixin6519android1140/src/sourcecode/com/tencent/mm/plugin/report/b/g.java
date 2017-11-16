package com.tencent.mm.plugin.report.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ae;
import com.tencent.mm.protocal.c.af;
import com.tencent.mm.protocal.c.vr;
import com.tencent.mm.protocal.c.vs;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private static boolean aDI;
  private static Object lock;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private vr oqx;
  public af oqy;
  
  static
  {
    GMTrace.i(18923625906176L, 140992);
    aDI = false;
    lock = new Object();
    GMTrace.o(18923625906176L, 140992);
  }
  
  public g(int paramInt1, int paramInt2)
  {
    GMTrace.i(18923089035264L, 140988);
    this.oqx = null;
    gV(true);
    ae localae = new ae();
    this.oqx = new vr();
    try
    {
      localae.tNB = paramInt1;
      localae.tNC = paramInt2;
      this.oqx.uoq = localae;
      GMTrace.o(18923089035264L, 140988);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.NetSceneGetAPMStrategy", "parse data error");
      GMTrace.o(18923089035264L, 140988);
    }
  }
  
  private static void gV(boolean paramBoolean)
  {
    GMTrace.i(18922954817536L, 140987);
    synchronized (lock)
    {
      aDI = paramBoolean;
      GMTrace.o(18922954817536L, 140987);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(18923491688448L, 140991);
    this.fUd = parame1;
    h.xw();
    if (!a.wK())
    {
      w.w("MicroMsg.NetSceneGetAPMStrategy", "get mrs strategy must go after login");
      GMTrace.o(18923491688448L, 140991);
      return -1;
    }
    parame1 = new b.a();
    parame1.gtJ = false;
    parame1.gtF = this.oqx;
    parame1.gtG = new vs();
    parame1.uri = "/cgi-bin/micromsg-bin/getapmstrategy";
    parame1.gtE = 914;
    this.fUa = parame1.DA();
    int i = a(parame, this.fUa, this);
    if (i < 0) {
      w.i("MicroMsg.NetSceneGetAPMStrategy", "mark all failed. do scene %d", new Object[] { Integer.valueOf(i) });
    }
    try
    {
      this.oqy = null;
      gV(false);
      GMTrace.o(18923491688448L, 140991);
      return i;
    }
    catch (Exception parame)
    {
      for (;;)
      {
        w.e("MicroMsg.NetSceneGetAPMStrategy", "onStrategyResp failed  hash:%d  , ex:%s", new Object[] { Integer.valueOf(hashCode()), bg.f(parame) });
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(18923223252992L, 140989);
    try
    {
      this.oqy = null;
      if ((h.xx().fYr == null) || (h.xx().fYr.gus == null))
      {
        w.f("MicroMsg.NetSceneGetAPMStrategy", "null == network().getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        gV(false);
        GMTrace.o(18923223252992L, 140989);
        return;
      }
      if (paramInt2 != 0)
      {
        w.e("MicroMsg.NetSceneGetAPMStrategy", "get report strategy err, errType:" + paramInt2 + ", errCode:" + paramInt3);
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        gV(false);
        GMTrace.o(18923223252992L, 140989);
        return;
      }
      w.d("MicroMsg.NetSceneGetAPMStrategy", "get report strategy ok");
      this.oqy = ((vs)this.fUa.gtD.gtK).uor;
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      gV(false);
      GMTrace.o(18923223252992L, 140989);
      return;
    }
    finally
    {
      gV(false);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(18923357470720L, 140990);
    GMTrace.o(18923357470720L, 140990);
    return 914;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */