package com.tencent.mm.plugin.fingerprint.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.soter.b.d;
import com.tencent.mm.protocal.c.bgt;
import com.tencent.mm.protocal.c.bgu;
import com.tencent.mm.sdk.platformtools.w;
import com.tenpay.android.wechat.TenpayUtil;

public final class b
  extends d
  implements k
{
  public final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public b(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(10749497835520L, 80090);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bgt();
    ((b.a)localObject).gtG = new bgu();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/soteropenfppayment";
    ((b.a)localObject).gtE = 1638;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bgt)this.fUa.gtC.gtK;
    ((bgt)localObject).uHK = paramString1;
    ((bgt)localObject).signature = paramString2;
    ((bgt)localObject).uSo = paramString3;
    ((bgt)localObject).eLg = TenpayUtil.signWith3Des("passwd=" + ((bgt)localObject).uSo);
    GMTrace.o(10749497835520L, 80090);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10750168924160L, 80095);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(10750168924160L, 80095);
    return i;
  }
  
  public final void aAc()
  {
    GMTrace.i(10749766270976L, 80092);
    w.i("MicroMsg.NetSceneSoterOpenTouchPay", "hy: authkey required");
    if (this.fUd != null) {
      this.fUd.a(4, -1, "", this);
    }
    GMTrace.o(10749766270976L, 80092);
  }
  
  public final void ce(int paramInt1, int paramInt2)
  {
    GMTrace.i(18484733935616L, 137722);
    w.i("MicroMsg.NetSceneSoterOpenTouchPay", "hy: onError: errType: %d, errcode: %d", new Object[] { Integer.valueOf(3), Integer.valueOf(paramInt2) });
    if (this.fUd != null) {
      this.fUd.a(4, -1, "", this);
    }
    GMTrace.o(18484733935616L, 137722);
  }
  
  public final void d(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(10749632053248L, 80091);
    w.i("MicroMsg.NetSceneSoterOpenTouchPay", "hy: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      w.i("MicroMsg.NetSceneSoterOpenTouchPay", "open fingerprintpay success");
      com.tencent.mm.plugin.fingerprint.b.e.eE(true);
    }
    for (;;)
    {
      this.fUd.a(paramInt1, paramInt2, "", this);
      GMTrace.o(10749632053248L, 80091);
      return;
      w.e("MicroMsg.NetSceneSoterOpenTouchPay", "open fingerprintpay failed");
    }
  }
  
  public final int getType()
  {
    GMTrace.i(10750034706432L, 80094);
    GMTrace.o(10750034706432L, 80094);
    return 1638;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */