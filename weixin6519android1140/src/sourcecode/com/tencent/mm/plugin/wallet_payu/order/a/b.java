package com.tencent.mm.plugin.wallet_payu.order.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.atf;
import com.tencent.mm.protocal.c.atg;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.l;

public final class b
  extends l
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public b(String paramString)
  {
    GMTrace.i(7938844393472L, 59149);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new atf();
    ((b.a)localObject).gtG = new atg();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payudeluserroll";
    ((b.a)localObject).gtE = 1544;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (atf)this.fUa.gtC.gtK;
    if (!bg.nm(paramString)) {
      ((atf)localObject).nFa = paramString;
    }
    GMTrace.o(7938844393472L, 59149);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7939247046656L, 59152);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7939247046656L, 59152);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(7938978611200L, 59150);
    w.d("MicroMsg.NetScenePayUDelUserRoll", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.fUd.a(paramInt1, paramInt2, paramString, this);
    GMTrace.o(7938978611200L, 59150);
  }
  
  public final int getType()
  {
    GMTrace.i(7939112828928L, 59151);
    GMTrace.o(7939112828928L, 59151);
    return 1544;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\order\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */