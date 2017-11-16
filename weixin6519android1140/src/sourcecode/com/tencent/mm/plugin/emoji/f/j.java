package com.tencent.mm.plugin.emoji.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.zt;
import com.tencent.mm.protocal.c.zu;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final b fUa;
  private com.tencent.mm.ad.e fXo;
  public String klG;
  private String klH;
  
  public j(String paramString1, String paramString2)
  {
    GMTrace.i(17972961738752L, 133909);
    b.a locala = new b.a();
    locala.gtF = new zt();
    locala.gtG = new zu();
    locala.uri = "/cgi-bin/micromsg-bin/getemotionactivity";
    locala.gtE = 368;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.klG = paramString1;
    this.klH = paramString2;
    GMTrace.o(17972961738752L, 133909);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(17973095956480L, 133910);
    this.fXo = parame1;
    parame1 = (zt)this.fUa.gtC.gtK;
    parame1.uqy = this.klG;
    parame1.ugy = this.klH;
    int i = a(parame, this.fUa, this);
    GMTrace.o(17973095956480L, 133910);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(17973230174208L, 133911);
    w.i("MicroMsg.emoji.NetSceneGetEmotionActivity", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(17973230174208L, 133911);
  }
  
  public final int getType()
  {
    GMTrace.i(17973364391936L, 133912);
    GMTrace.o(17973364391936L, 133912);
    return 368;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */