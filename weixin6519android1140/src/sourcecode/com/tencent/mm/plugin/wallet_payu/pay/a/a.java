package com.tencent.mm.plugin.wallet_payu.pay.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.l;

public final class a
  extends l
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7975620050944L, 59423);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7975620050944L, 59423);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(7975754268672L, 59424);
    w.d("MicroMsg.NetScenePayUCheckJsApi", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    paramString = (ate)((b)paramq).gtD.gtK;
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      w.d("MicroMsg.NetScenePayUCheckJsApi", "rr " + paramString.kBk);
    }
    paramString = paramString.kBl;
    this.fUd.a(paramInt1, paramInt2, paramString, this);
    GMTrace.o(7975754268672L, 59424);
  }
  
  public final int getType()
  {
    GMTrace.i(7975485833216L, 59422);
    GMTrace.o(7975485833216L, 59422);
    return 1554;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pay\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */