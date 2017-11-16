package com.tencent.mm.plugin.remittance.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.kn;
import com.tencent.mm.protocal.c.ko;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private b gUL;
  private kn omb;
  
  public e(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    GMTrace.i(17410589458432L, 129719);
    b.a locala = new b.a();
    locala.gtF = new kn();
    locala.gtG = new ko();
    locala.gtE = 1273;
    locala.uri = "/cgi-bin/mmpay-bin/f2fpaycheck";
    locala.gtH = 0;
    locala.gtI = 0;
    this.gUL = locala.DA();
    this.omb = ((kn)this.gUL.gtC.gtK);
    this.omb.tXc = paramString1;
    this.omb.tXd = paramString2;
    this.omb.ubn = paramString3;
    this.omb.ubo = paramString4;
    this.omb.mFu = paramInt;
    w.d("MicroMsg.NetSceneF2fPayCheck", "NetSceneF2fPayCheck, f2fId: %s, transId: %s, extendStr: %s, amount: %s", new Object[] { paramString1, paramString2, paramString3, Integer.valueOf(paramInt) });
    GMTrace.o(17410589458432L, 129719);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(17410857893888L, 129721);
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(17410857893888L, 129721);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(17410992111616L, 129722);
    w.i("MicroMsg.NetSceneF2fPayCheck", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(17410992111616L, 129722);
  }
  
  public final int getType()
  {
    GMTrace.i(17410723676160L, 129720);
    GMTrace.o(17410723676160L, 129720);
    return 1273;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */