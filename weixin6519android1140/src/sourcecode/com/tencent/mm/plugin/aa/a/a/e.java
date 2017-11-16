package com.tencent.mm.plugin.aa.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.d;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private b gUL;
  private d hph;
  public com.tencent.mm.protocal.c.e hpi;
  public int scene;
  
  public e(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(5596208168960L, 41695);
    b.a locala = new b.a();
    locala.gtF = new d();
    locala.gtG = new com.tencent.mm.protocal.c.e();
    locala.gtE = 1530;
    locala.uri = "/cgi-bin/mmpay-bin/newaaclose";
    locala.gtH = 0;
    locala.gtI = 0;
    this.gUL = locala.DA();
    this.hph = ((d)this.gUL.gtC.gtK);
    this.hph.tMa = paramString2;
    this.hph.tLZ = paramString1;
    this.hph.scene = paramInt;
    this.scene = paramInt;
    w.d("MicroMsg.NetSceneAAClose", "NetSceneAAClose, billNo: %s, scene: %s", new Object[] { this.hph.tLZ, Integer.valueOf(paramInt) });
    GMTrace.o(5596208168960L, 41695);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5596476604416L, 41697);
    w.i("MicroMsg.NetSceneAAClose", "doScene");
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(5596476604416L, 41697);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5596610822144L, 41698);
    w.i("MicroMsg.NetSceneAAClose", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.hpi = ((com.tencent.mm.protocal.c.e)((b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneAAClose", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.hpi.jWs), this.hpi.jWt });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(5596610822144L, 41698);
  }
  
  public final int getType()
  {
    GMTrace.i(5596342386688L, 41696);
    GMTrace.o(5596342386688L, 41696);
    return 1530;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\aa\a\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */