package com.tencent.mm.ar;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bkc;
import com.tencent.mm.protocal.c.bkd;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public b()
  {
    GMTrace.i(1337882312704L, 9968);
    b.a locala = new b.a();
    locala.gtF = new bkc();
    locala.gtG = new bkd();
    locala.uri = "/cgi-bin/micromsg-bin/unbindlinkedincontact";
    locala.gtE = 550;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((bkc)this.fUa.gtC.gtK).tSK = 1;
    GMTrace.o(1337882312704L, 9968);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1338016530432L, 9969);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1338016530432L, 9969);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1338284965888L, 9971);
    w.d("MicroMsg.NetSceneUnBindLinkedinContact", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      at.AR();
      c.xh().set(286722, "");
      at.AR();
      c.xh().set(286721, "");
      at.AR();
      c.xh().set(286723, "");
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1338284965888L, 9971);
  }
  
  public final int getType()
  {
    GMTrace.i(15326053924864L, 114188);
    GMTrace.o(15326053924864L, 114188);
    return 550;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ar\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */