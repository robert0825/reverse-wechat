package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ya;
import com.tencent.mm.protocal.c.yb;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class x
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private String jzR;
  
  public x()
  {
    GMTrace.i(4903913127936L, 36537);
    this.jzR = "";
    b.a locala = new b.a();
    locala.gtF = new ya();
    locala.gtG = new yb();
    locala.uri = "/cgi-bin/micromsg-bin/getcardconfiginfo";
    locala.gtE = 692;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(4903913127936L, 36537);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4904181563392L, 36539);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4904181563392L, 36539);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4904315781120L, 36540);
    w.i("MicroMsg.NetSceneGetCardConfigInfo", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.jzR = ((yb)this.fUa.gtD.gtK).jzG;
      at.AR();
      c.xh().set(282885, this.jzR);
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4904315781120L, 36540);
  }
  
  public final int getType()
  {
    GMTrace.i(4904047345664L, 36538);
    GMTrace.o(4904047345664L, 36538);
    return 692;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */