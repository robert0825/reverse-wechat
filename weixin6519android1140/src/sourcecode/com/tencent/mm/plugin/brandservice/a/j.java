package com.tencent.mm.plugin.brandservice.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.baz;
import com.tencent.mm.protocal.c.bba;
import com.tencent.mm.protocal.c.bbb;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class j
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private int eHz;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private String jtg;
  private int jth;
  private azp jti;
  public LinkedList<bbb> jtj;
  
  public j(String paramString)
  {
    GMTrace.i(10845597728768L, 80806);
    this.jti = new azp().be(new byte[0]);
    this.eHz = 0;
    this.jtg = paramString;
    this.jth = 0;
    GMTrace.o(10845597728768L, 80806);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10845866164224L, 80808);
    this.fUd = parame1;
    parame1 = new b.a();
    parame1.gtF = new baz();
    parame1.gtG = new bba();
    parame1.uri = "/cgi-bin/micromsg-bin/searchorrecommendbiz";
    parame1.gtE = 455;
    parame1.gtH = 0;
    parame1.gtI = 0;
    this.fUa = parame1.DA();
    parame1 = (baz)this.fUa.gtC.gtK;
    parame1.uxT = com.tencent.mm.platformtools.n.ni(this.jtg);
    parame1.tMX = this.eHz;
    parame1.uOt = this.jth;
    parame1.tQz = this.jti;
    w.d("MicroMsg.BrandService.NetSceneSearchOrRecommendBiz", "doScene:" + this.jtg + "  :" + this.eHz + "  entryFlag:" + this.jth);
    int i = a(parame, this.fUa, this);
    GMTrace.o(10845866164224L, 80808);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(10846000381952L, 80809);
    int i = k.b.gum;
    GMTrace.o(10846000381952L, 80809);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10846268817408L, 80811);
    w.d("MicroMsg.BrandService.NetSceneSearchOrRecommendBiz", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bba)this.fUa.gtD.gtK;
      this.jti = paramq.uOg;
      this.jtj = paramq.uOv;
      paramq = this.jtj.iterator();
    }
    while (paramq.hasNext())
    {
      paramArrayOfByte = (bbb)paramq.next();
      h localh = new h();
      localh.username = com.tencent.mm.platformtools.n.a(paramArrayOfByte.ufy);
      localh.gsU = paramArrayOfByte.ubV;
      localh.gsT = paramArrayOfByte.ubW;
      localh.eQl = -1;
      localh.fiZ = 3;
      localh.bi(true);
      com.tencent.mm.ac.n.Di().a(localh);
      continue;
      this.jtj = null;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(10846268817408L, 80811);
  }
  
  public final int getType()
  {
    GMTrace.i(10845731946496L, 80807);
    GMTrace.o(10845731946496L, 80807);
    return 455;
  }
  
  protected final int vB()
  {
    GMTrace.i(10846134599680L, 80810);
    GMTrace.o(10846134599680L, 80810);
    return 50;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\brandservice\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */