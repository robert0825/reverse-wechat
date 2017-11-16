package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.avb;
import com.tencent.mm.protocal.c.avc;
import com.tencent.mm.sdk.platformtools.w;

public final class k
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public avb mlR;
  public avc mlS;
  
  public k(int paramInt, long paramLong1, long paramLong2)
  {
    GMTrace.i(11582989926400L, 86300);
    this.fUa = null;
    this.mlR = null;
    this.mlS = null;
    this.fUd = null;
    b.a locala = new b.a();
    locala.gtF = new avb();
    locala.gtG = new avc();
    locala.gtE = 726;
    locala.uri = "/cgi-bin/micromsg-bin/pstnredirect";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.mlR = ((avb)this.fUa.gtC.gtK);
    this.mlR.uhU = paramInt;
    this.mlR.uhV = paramLong1;
    this.mlR.uKh = paramLong2;
    GMTrace.o(11582989926400L, 86300);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11583258361856L, 86302);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11583258361856L, 86302);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11583392579584L, 86303);
    w.i("MicroMsg.NetSceneIPCallRedirect", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mlS = ((avc)((b)paramq).gtD.gtK);
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11583392579584L, 86303);
  }
  
  public final int getType()
  {
    GMTrace.i(11583124144128L, 86301);
    GMTrace.o(11583124144128L, 86301);
    return 726;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\d\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */