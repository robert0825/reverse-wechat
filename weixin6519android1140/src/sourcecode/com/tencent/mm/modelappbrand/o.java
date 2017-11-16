package com.tencent.mm.modelappbrand;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bvh;
import com.tencent.mm.protocal.c.bvi;
import com.tencent.mm.sdk.platformtools.w;

public final class o
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fXo;
  private final b grb;
  
  public o(String paramString)
  {
    GMTrace.i(12933086052352L, 96359);
    b.a locala = new b.a();
    locala.gtF = new bvh();
    locala.gtG = new bvi();
    locala.uri = "/cgi-bin/mmbiz-bin/wxausrevent/wxatmplcomplaint";
    locala.gtE = 1198;
    locala.gtH = 0;
    locala.gtI = 0;
    this.grb = locala.DA();
    ((bvh)this.grb.gtC.gtK).vdD = paramString;
    GMTrace.o(12933086052352L, 96359);
  }
  
  public final bvi CP()
  {
    GMTrace.i(20830188732416L, 155197);
    if (this.grb != null)
    {
      bvi localbvi = (bvi)this.grb.gtD.gtK;
      GMTrace.o(20830188732416L, 155197);
      return localbvi;
    }
    GMTrace.o(20830188732416L, 155197);
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12933488705536L, 96362);
    w.i("MicroMsg.NetSceneGetServiceNotifyOptions", "doScene");
    this.fXo = parame1;
    int i = a(parame, this.grb, this);
    GMTrace.o(12933488705536L, 96362);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12933354487808L, 96361);
    w.i("MicroMsg.NetSceneGetServiceNotifyOptions", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fXo != null) {
      this.fXo.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(12933354487808L, 96361);
  }
  
  public final int getType()
  {
    GMTrace.i(15658511237120L, 116665);
    GMTrace.o(15658511237120L, 116665);
    return 1198;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelappbrand\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */