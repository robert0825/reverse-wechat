package com.tencent.mm.plugin.wallet_payu.order.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.atc;
import com.tencent.mm.protocal.c.atd;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.l;

public final class a
  extends l
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public a(int paramInt)
  {
    GMTrace.i(7937233780736L, 59137);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new atc();
    ((b.a)localObject).gtG = new atd();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payubatchuserroll";
    ((b.a)localObject).gtE = 1519;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (atc)this.fUa.gtC.gtK;
    ((atc)localObject).lRy = 10;
    ((atc)localObject).tWu = paramInt;
    w.d("MicroMsg.NetScenePayUPayQueryUserRoll", "limit:10" + ",offset:" + paramInt);
    GMTrace.o(7937233780736L, 59137);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7937770651648L, 59141);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7937770651648L, 59141);
    return i;
  }
  
  public final int bAn()
  {
    GMTrace.i(7937502216192L, 59139);
    int i = ((atd)this.fUa.gtD.gtK).uIY;
    GMTrace.o(7937502216192L, 59139);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(7937367998464L, 59138);
    w.w("MicroMsg.NetScenePayUPayQueryUserRoll", "errType = " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString);
    this.fUd.a(paramInt1, paramInt2, paramString, this);
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      w.d("MicroMsg.NetScenePayUPayQueryUserRoll", "rr" + ((atd)((b)paramq).gtD.gtK).uIY);
    }
    GMTrace.o(7937367998464L, 59138);
  }
  
  public final int getType()
  {
    GMTrace.i(7937636433920L, 59140);
    GMTrace.o(7937636433920L, 59140);
    return 1519;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\order\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */