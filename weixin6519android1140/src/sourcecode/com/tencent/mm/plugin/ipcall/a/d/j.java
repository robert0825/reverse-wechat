package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bql;
import com.tencent.mm.protocal.c.bqm;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public bql mlP;
  public bqm mlQ;
  
  public j(String paramString)
  {
    GMTrace.i(15067282145280L, 112260);
    this.fUa = null;
    this.mlP = null;
    this.mlQ = null;
    this.fUd = null;
    b.a locala = new b.a();
    locala.gtF = new bql();
    locala.gtG = new bqm();
    locala.gtE = 277;
    locala.uri = "/cgi-bin/micromsg-bin/wcopurchasepackage";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.mlP = ((bql)this.fUa.gtC.gtK);
    this.mlP.tRS = paramString;
    w.i("MicroMsg.NetSceneIPCallPurchasePackage", "NetSceneIPCallPurchasePackage ProductID:%s", new Object[] { this.mlP.tRS });
    GMTrace.o(15067282145280L, 112260);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(15067550580736L, 112262);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(15067550580736L, 112262);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(15067684798464L, 112263);
    w.i("MicroMsg.NetSceneIPCallPurchasePackage", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mlQ = ((bqm)((b)paramq).gtD.gtK);
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(15067684798464L, 112263);
  }
  
  public final int getType()
  {
    GMTrace.i(15067416363008L, 112261);
    GMTrace.o(15067416363008L, 112261);
    return 277;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\d\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */