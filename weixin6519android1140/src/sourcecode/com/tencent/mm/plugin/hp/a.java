package com.tencent.mm.plugin.hp;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.app.MMApplicationLike;
import com.tencent.mm.g.a.bd;
import com.tencent.mm.g.a.be;
import com.tencent.mm.plugin.hp.tinker.d;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.o;

public final class a
  implements o
{
  public com.tencent.mm.plugin.hp.b.c mgU;
  private com.tencent.mm.sdk.b.c<be> mgV;
  private com.tencent.mm.sdk.b.c<bd> mgW;
  
  public a()
  {
    GMTrace.i(5750021685248L, 42841);
    this.mgU = new com.tencent.mm.plugin.hp.b.c();
    this.mgV = new com.tencent.mm.sdk.b.c() {};
    this.mgW = new com.tencent.mm.sdk.b.c() {};
    d.aHt();
    d.a(MMApplicationLike.getTinkerApplicationLike());
    com.tencent.mm.sdk.b.a.vgX.b(this.mgU);
    com.tencent.mm.sdk.b.a.vgX.b(this.mgW);
    com.tencent.mm.sdk.b.a.vgX.b(this.mgV);
    GMTrace.o(5750021685248L, 42841);
  }
  
  public final void a(l paraml)
  {
    GMTrace.i(5750290120704L, 42843);
    GMTrace.o(5750290120704L, 42843);
  }
  
  public final void a(m paramm)
  {
    GMTrace.i(5750155902976L, 42842);
    GMTrace.o(5750155902976L, 42842);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\hp\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */