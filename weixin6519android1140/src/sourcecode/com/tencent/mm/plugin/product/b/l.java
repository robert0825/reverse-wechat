package com.tencent.mm.plugin.product.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.beh;
import com.tencent.mm.protocal.c.bhv;
import com.tencent.mm.protocal.c.bhw;
import com.tencent.mm.sdk.platformtools.w;

public final class l
  extends com.tencent.mm.wallet_core.c.l
  implements k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public String nIb;
  
  public l(beh parambeh, String paramString)
  {
    GMTrace.i(5995103256576L, 44667);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bhv();
    ((b.a)localObject).gtG = new bhw();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/submitmallorder";
    ((b.a)localObject).gtE = 556;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bhv)this.fUa.gtC.gtK;
    ((bhv)localObject).uTD = parambeh;
    ((bhv)localObject).uTF = paramString;
    GMTrace.o(5995103256576L, 44667);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5995371692032L, 44669);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5995371692032L, 44669);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(5995505909760L, 44670);
    paramq = (bhw)((b)paramq).gtD.gtK;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      w.d("MicroMsg.NetSceneMallSubmitMallOrder", "resp.ReqKey " + paramq.uTE);
      this.nIb = paramq.uTE;
    }
    w.d("MicroMsg.NetSceneMallSubmitMallOrder", "errCode " + paramInt2 + ", errMsg " + paramString);
    this.fUd.a(paramInt1, paramInt2, paramString, this);
    GMTrace.o(5995505909760L, 44670);
  }
  
  public final int getType()
  {
    GMTrace.i(5995237474304L, 44668);
    GMTrace.o(5995237474304L, 44668);
    return 556;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */