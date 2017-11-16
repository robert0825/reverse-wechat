package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bar;
import com.tencent.mm.protocal.c.bas;
import com.tencent.mm.sdk.platformtools.w;

public final class u
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public u(String paramString)
  {
    GMTrace.i(10954179870720L, 81615);
    this.fUd = null;
    this.fUa = null;
    b.a locala = new b.a();
    locala.gtF = new bar();
    locala.gtG = new bas();
    locala.uri = "/cgi-bin/micromsg-bin/searchharddevice";
    locala.gtE = 540;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((bar)this.fUa.gtC.gtK).uOn = paramString;
    GMTrace.o(10954179870720L, 81615);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10954582523904L, 81618);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(10954582523904L, 81618);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10954314088448L, 81616);
    w.i("MicroMsg.exdevice.NetSceneSearchHardDevice", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(10954314088448L, 81616);
  }
  
  public final int getType()
  {
    GMTrace.i(10954448306176L, 81617);
    GMTrace.o(10954448306176L, 81617);
    return 540;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */