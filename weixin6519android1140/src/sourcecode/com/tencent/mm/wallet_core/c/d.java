package com.tencent.mm.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jg;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends l
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public d(String paramString1, String paramString2)
  {
    GMTrace.i(1455993913344L, 10848);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new jf();
    ((b.a)localObject).gtG = new jg();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/cancelqrpay";
    ((b.a)localObject).gtE = 410;
    ((b.a)localObject).gtH = 198;
    ((b.a)localObject).gtI = 1000000198;
    this.fUa = ((b.a)localObject).DA();
    localObject = (jf)this.fUa.gtC.gtK;
    ((jf)localObject).tYS = paramString1;
    ((jf)localObject).tRU = paramString2;
    ((jf)localObject).tYT = h.byp();
    GMTrace.o(1455993913344L, 10848);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1456396566528L, 10851);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1456396566528L, 10851);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(1456128131072L, 10849);
    w.d("MicroMsg.NetSceneCancelQRPay", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.fUd.a(paramInt1, paramInt2, paramString, this);
    GMTrace.o(1456128131072L, 10849);
  }
  
  public final int getType()
  {
    GMTrace.i(1456262348800L, 10850);
    GMTrace.o(1456262348800L, 10850);
    return 410;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */