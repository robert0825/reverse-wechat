package com.tencent.mm.plugin.walletlock.fingerprint.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bjh;
import com.tencent.mm.protocal.c.bji;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  String llD;
  boolean rxl;
  
  public e(String paramString1, String paramString2)
  {
    GMTrace.i(20265803186176L, 150992);
    this.rxl = false;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bjh();
    ((b.a)localObject).gtG = new bji();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/touchlockgetchallenge";
    ((b.a)localObject).gtE = 1548;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bjh)this.fUa.gtC.gtK;
    ((bjh)localObject).scene = 1548;
    ((bjh)localObject).qpg = paramString1;
    ((bjh)localObject).qph = paramString2;
    GMTrace.o(20265803186176L, 150992);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20266071621632L, 150994);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20266071621632L, 150994);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(20266205839360L, 150995);
    w.i("MicroMsg.NetSceneGetTouchWalletLockChallenge", "alvinluo get touch wallet lock challenge errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (bji)((b)paramq).gtD.gtK;
    this.llD = paramq.llD;
    w.d("MicroMsg.NetSceneGetTouchWalletLockChallenge", "alvinluo get touch lock challenge: %s", new Object[] { this.llD });
    if (paramq.uSn == 1) {}
    for (this.rxl = true;; this.rxl = false)
    {
      if (this.fUd != null) {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
      }
      GMTrace.o(20266205839360L, 150995);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(20265937403904L, 150993);
    GMTrace.o(20265937403904L, 150993);
    return 1548;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\walletlock\fingerprint\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */