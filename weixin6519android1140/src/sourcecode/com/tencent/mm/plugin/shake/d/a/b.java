package com.tencent.mm.plugin.shake.d.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.adz;
import com.tencent.mm.protocal.c.aea;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private String oOl;
  private int scene;
  
  public b(String paramString, int paramInt)
  {
    GMTrace.i(6609417797632L, 49244);
    this.oOl = paramString;
    this.scene = paramInt;
    GMTrace.o(6609417797632L, 49244);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6609552015360L, 49245);
    this.fUd = parame1;
    parame1 = new b.a();
    parame1.gtF = new adz();
    parame1.gtG = new aea();
    parame1.uri = "/cgi-bin/micromsg-bin/gettvinfo";
    parame1.gtE = 552;
    parame1.gtH = 0;
    parame1.gtI = 0;
    this.fUa = parame1.DA();
    parame1 = (adz)this.fUa.gtC.gtK;
    parame1.utR = this.oOl;
    parame1.tOG = this.scene;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6609552015360L, 49245);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(6609686233088L, 49246);
    paramq = (adz)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    if ((paramq.tOG < 0) || (paramq.utR == null) || (paramq.utR.length() <= 0))
    {
      w.e("MicroMsg.scanner.NetSceneGetTVInfo", "ERR: Security Check Failed, Scene = %s", new Object[] { Integer.valueOf(paramq.tOG) });
      i = k.b.gun;
      GMTrace.o(6609686233088L, 49246);
      return i;
    }
    int i = k.b.gum;
    GMTrace.o(6609686233088L, 49246);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6609820450816L, 49247);
    w.d("MicroMsg.scanner.NetSceneGetTVInfo", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6609820450816L, 49247);
  }
  
  public final int getType()
  {
    GMTrace.i(6609954668544L, 49248);
    GMTrace.o(6609954668544L, 49248);
    return 552;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\d\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */