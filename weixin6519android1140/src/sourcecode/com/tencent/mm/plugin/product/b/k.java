package com.tencent.mm.plugin.product.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.beh;
import com.tencent.mm.protocal.c.bht;
import com.tencent.mm.protocal.c.bhu;
import com.tencent.mm.sdk.platformtools.w;

public final class k
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public String nIb;
  
  public k(beh parambeh)
  {
    GMTrace.i(5997250740224L, 44683);
    b.a locala = new b.a();
    locala.gtF = new bht();
    locala.gtG = new bhu();
    locala.uri = "/cgi-bin/micromsg-bin/submitmallfreeorder";
    locala.gtE = 557;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((bht)this.fUa.gtC.gtK).uTD = parambeh;
    GMTrace.o(5997250740224L, 44683);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5997653393408L, 44686);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5997653393408L, 44686);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5997384957952L, 44684);
    paramq = (bhu)((b)paramq).gtD.gtK;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      w.d("MicroMsg.NetSceneMallSubmitMallFreeOrder", "resp.PrepareId " + paramq.uTE);
      this.nIb = paramq.uTE;
    }
    w.d("MicroMsg.NetSceneMallSubmitMallFreeOrder", "errCode " + paramInt3 + ", errMsg " + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5997384957952L, 44684);
  }
  
  public final int getType()
  {
    GMTrace.i(5997519175680L, 44685);
    GMTrace.o(5997519175680L, 44685);
    return 557;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */