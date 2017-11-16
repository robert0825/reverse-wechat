package com.tencent.mm.plugin.walletlock.fingerprint.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aro;
import com.tencent.mm.protocal.c.arp;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public f(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(20264192573440L, 150980);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new aro();
    ((b.a)localObject).gtG = new arp();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/opensotertouchlock";
    ((b.a)localObject).gtE = 1967;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (aro)this.fUa.gtC.gtK;
    w.d("MicroMsg.NetSceneOpenSoterFingerprintLock", "alvinluo json: %s, signature: %s, token: %s", new Object[] { paramString1, paramString2, paramString3 });
    ((aro)localObject).uHK = paramString1;
    ((aro)localObject).signature = paramString2;
    ((aro)localObject).rcC = paramString3;
    GMTrace.o(20264192573440L, 150980);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20264326791168L, 150981);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20264326791168L, 150981);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(20264461008896L, 150982);
    w.i("MicroMsg.NetSceneOpenSoterFingerprintLock", "alvinluo open soter fingerprint lock errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(20264461008896L, 150982);
  }
  
  public final int getType()
  {
    GMTrace.i(20264058355712L, 150979);
    GMTrace.o(20264058355712L, 150979);
    return 1967;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\walletlock\fingerprint\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */