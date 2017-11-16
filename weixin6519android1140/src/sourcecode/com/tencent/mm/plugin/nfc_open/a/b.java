package com.tencent.mm.plugin.nfc_open.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.of;
import com.tencent.mm.protocal.c.og;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public b(int paramInt)
  {
    GMTrace.i(12477282648064L, 92963);
    b.a locala = new b.a();
    locala.gtF = new of();
    locala.gtG = new og();
    locala.uri = "/cgi-bin/mmpay-bin/cpucardgetconfig2";
    locala.gtE = 1561;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((of)this.fUa.gtC.gtK).version = paramInt;
    GMTrace.o(12477282648064L, 92963);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12477551083520L, 92965);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12477551083520L, 92965);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12477685301248L, 92966);
    w.d("MicroMsg.NetSceneCpuCardGetConfig", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12477685301248L, 92966);
  }
  
  public final int getType()
  {
    GMTrace.i(12477416865792L, 92964);
    GMTrace.o(12477416865792L, 92964);
    return 1561;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nfc_open\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */