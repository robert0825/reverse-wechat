package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ame;
import com.tencent.mm.protocal.c.amf;
import com.tencent.mm.sdk.platformtools.w;

public final class t
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public t()
  {
    GMTrace.i(14909844750336L, 111087);
    b.a locala = new b.a();
    locala.gtF = new ame();
    locala.gtG = new amf();
    locala.uri = "/cgi-bin/micromsg-bin/logout";
    locala.gtE = 282;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((ame)this.fUa.gtC.gtK).tOG = 0;
    GMTrace.o(14909844750336L, 111087);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(14910113185792L, 111089);
    w.d("MicroMsg.NetSceneLogout", "doScene");
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(14910113185792L, 111089);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(14910247403520L, 111090);
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      w.d("MicroMsg.NetSceneLogout", "logout Error. ");
    }
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(14910247403520L, 111090);
  }
  
  public final int getType()
  {
    GMTrace.i(14909978968064L, 111088);
    GMTrace.o(14909978968064L, 111088);
    return 282;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\modelsimple\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */