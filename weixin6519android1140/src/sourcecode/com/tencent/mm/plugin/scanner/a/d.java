package com.tencent.mm.plugin.scanner.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.hj;
import com.tencent.mm.protocal.c.hk;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String eEa;
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  private String jYv;
  private int scene;
  
  public d(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(6059796201472L, 45149);
    this.eEa = paramString1;
    this.scene = paramInt;
    this.jYv = paramString2;
    GMTrace.o(6059796201472L, 45149);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6059930419200L, 45150);
    this.fUd = parame1;
    parame1 = new b.a();
    parame1.gtF = new hj();
    parame1.gtG = new hk();
    parame1.uri = "/cgi-bin/mmbiz-bin/usrmsg/bizscangetproductinfo";
    parame1.gtE = 1063;
    parame1.gtH = 0;
    parame1.gtI = 0;
    this.fUa = parame1.DA();
    parame1 = (hj)this.fUa.gtC.gtK;
    parame1.tRS = this.eEa;
    parame1.tOG = this.scene;
    parame1.tWl = this.jYv;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6059930419200L, 45150);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(6060064636928L, 45151);
    paramq = (hj)((b)paramq).gtC.gtK;
    if ((paramq.tOG < 0) || (paramq.tRS == null) || (paramq.tRS.length() <= 0))
    {
      w.e("MicroMsg.scanner.NetSceneGetProductInfo", "ERR: Security Check Failed, Scene = %s", new Object[] { Integer.valueOf(paramq.tOG) });
      i = k.b.gun;
      GMTrace.o(6060064636928L, 45151);
      return i;
    }
    int i = k.b.gum;
    GMTrace.o(6060064636928L, 45151);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6060198854656L, 45152);
    w.d("MicroMsg.scanner.NetSceneGetProductInfo", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6060198854656L, 45152);
  }
  
  public final int getType()
  {
    GMTrace.i(6060333072384L, 45153);
    GMTrace.o(6060333072384L, 45153);
    return 1063;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */