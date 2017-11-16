package com.tencent.mm.plugin.wallet_index.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.ase;
import com.tencent.mm.protocal.c.asf;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.l;

public final class b
  extends l
{
  public com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public b(PayReq paramPayReq, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(7566121762816L, 56372);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ase();
    ((b.a)localObject).gtG = new asf();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payauthapp";
    ((b.a)localObject).gtE = 397;
    ((b.a)localObject).gtH = 188;
    ((b.a)localObject).gtI = 1000000188;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ase)this.fUa.gtC.gtK;
    ((ase)localObject).lQa = paramPayReq.appId;
    ((ase)localObject).uIg = paramPayReq.partnerId;
    ((ase)localObject).unE = paramPayReq.prepayId;
    ((ase)localObject).udf = paramPayReq.nonceStr;
    ((ase)localObject).uIh = paramPayReq.timeStamp;
    ((ase)localObject).udg = paramPayReq.packageValue;
    ((ase)localObject).udh = paramPayReq.sign;
    ((ase)localObject).udi = paramPayReq.signType;
    ((ase)localObject).uIi = paramString1;
    ((ase)localObject).lPl = paramString2;
    ((ase)localObject).lRT = paramString3;
    ((ase)localObject).tYT = h.byp();
    ((ase)localObject).uIk = paramString4;
    GMTrace.o(7566121762816L, 56372);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7566255980544L, 56373);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7566255980544L, 56373);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(7566390198272L, 56374);
    w.d("MicroMsg.NetScenePayAuthApp", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.fUd.a(paramInt1, paramInt2, paramString, this);
    GMTrace.o(7566390198272L, 56374);
  }
  
  public final int getType()
  {
    GMTrace.i(7566524416000L, 56375);
    GMTrace.o(7566524416000L, 56375);
    return 397;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_index\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */