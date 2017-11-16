package com.tencent.mm.plugin.webview.fts;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.az.a;
import com.tencent.mm.az.e.b;
import com.tencent.mm.modelstat.n;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.all;
import com.tencent.mm.protocal.c.bez;
import com.tencent.mm.protocal.c.bms;
import com.tencent.mm.protocal.c.btj;
import com.tencent.mm.protocal.c.btm;
import com.tencent.mm.protocal.c.btn;
import com.tencent.mm.protocal.c.bvf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class i
  extends a
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private com.tencent.mm.ad.b gMj;
  private int gRi;
  private btn rCI;
  private btm rCJ;
  private int scene;
  
  public i(e.b paramb)
  {
    GMTrace.i(14450954338304L, 107668);
    this.gRa = paramb.eBj;
    this.vq = paramb.offset;
    this.gRb = paramb.scene;
    this.gQZ = paramb.eQd;
    this.gRi = paramb.gRi;
    if (!bg.nm(paramb.eBj))
    {
      w.i("MicroMsg.FTS.NetSceneWebSearch", "Constructors: keyword=%s", new Object[] { paramb.eBj });
      this.scene = paramb.scene;
      b.a locala = new b.a();
      locala.gtE = 719;
      locala.uri = "/cgi-bin/micromsg-bin/mmwebsearch";
      locala.gtF = new btm();
      locala.gtG = new btn();
      this.gMj = locala.DA();
      this.rCJ = ((btm)this.gMj.gtC.gtK);
      this.rCJ.unf = paramb.eBj;
      this.rCJ.uMX = paramb.gRi;
      this.rCJ.tXu = paramb.gRj;
      this.rCJ.uBS = com.tencent.mm.az.e.CO();
      this.rCJ.tWu = paramb.offset;
      this.rCJ.vaT = com.tencent.mm.az.e.GL();
      this.rCJ.uOk = paramb.gRl;
      this.rCJ.tOG = paramb.scene;
      this.rCJ.tXx = paramb.gRm;
      this.rCJ.vca = paramb.gRn;
      this.rCJ.vcg = paramb.gRo;
      this.rCJ.vci = paramb.gRq;
      this.rCJ.vch = paramb.gRp;
      this.rCJ.vcj = paramb.gRr;
      this.rCJ.vcb = paramb.gRw;
      this.rCJ.gRv = paramb.gRv;
      this.rCJ.vck = paramb.gRx;
      this.rCJ.kBh = paramb.aKB;
      this.rCJ.vaX = com.tencent.mm.az.e.gN(paramb.scene);
      if (paramb.gRA == null) {}
    }
    try
    {
      this.rCJ.vcm = new com.tencent.mm.bm.b(paramb.gRA.toByteArray());
      if (paramb.gRz != null) {}
      try
      {
        this.rCJ.vcl = new com.tencent.mm.bm.b(paramb.gRz.toByteArray());
        if (this.rCJ.uBS != null) {}
        for (boolean bool = true;; bool = false)
        {
          w.i("MicroMsg.FTS.NetSceneWebSearch", "contains location = %b | matchUserSize=%d | scene=%d | businessType=%d | isHomePage=%b | sceneActionType=%d | webViewId=%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramb.gRl.size()), Integer.valueOf(paramb.scene), Integer.valueOf(paramb.gRj), Integer.valueOf(this.gRi), Integer.valueOf(paramb.gRn), Integer.valueOf(paramb.eQd) });
          if (this.rCJ.uBS != null) {
            n.a(2005, this.rCJ.uBS.tYy, this.rCJ.uBS.tYz, this.rCJ.uBS.ujb);
          }
          GMTrace.o(14450954338304L, 107668);
          return;
        }
        w.e("MicroMsg.FTS.NetSceneWebSearch", "keyword is unavailable");
        GMTrace.o(14450954338304L, 107668);
        return;
      }
      catch (Exception localException1)
      {
        for (;;) {}
      }
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
  }
  
  public final String CM()
  {
    GMTrace.i(12470840197120L, 92915);
    if (this.rCI != null)
    {
      String str = this.rCI.tWC;
      GMTrace.o(12470840197120L, 92915);
      return str;
    }
    GMTrace.o(12470840197120L, 92915);
    return "";
  }
  
  public final int CN()
  {
    GMTrace.i(12470974414848L, 92916);
    if (this.rCI != null)
    {
      int i = this.rCI.vbd;
      GMTrace.o(12470974414848L, 92916);
      return i;
    }
    GMTrace.o(12470974414848L, 92916);
    return 0;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12470571761664L, 92913);
    com.tencent.mm.az.k.aY(this.scene, 2);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(12470571761664L, 92913);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12470705979392L, 92914);
    w.i("MicroMsg.FTS.NetSceneWebSearch", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      com.tencent.mm.az.k.r(this.scene, paramInt2, paramInt3);
      GMTrace.o(12470705979392L, 92914);
      return;
    }
    this.rCI = ((btn)this.gMj.gtD.gtK);
    if (this.rCI != null) {
      w.v("MicroMsg.FTS.NetSceneWebSearch", "return data\n%s", new Object[] { this.rCI.tWC });
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    com.tencent.mm.az.k.r(this.scene, paramInt2, paramInt3);
    GMTrace.o(12470705979392L, 92914);
  }
  
  public final int getType()
  {
    GMTrace.i(12470437543936L, 92912);
    GMTrace.o(12470437543936L, 92912);
    return 719;
  }
  
  public final void p(LinkedList<bms> paramLinkedList)
  {
    GMTrace.i(19473650155520L, 145090);
    this.rCJ.uOk = paramLinkedList;
    bez localbez = new bez();
    localbez.uQH = paramLinkedList.size();
    this.rCJ.vcn = localbez;
    GMTrace.o(19473650155520L, 145090);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */