package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.afi;
import com.tencent.mm.protocal.c.afj;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private afi mlE;
  public afj mlF;
  
  public e()
  {
    GMTrace.i(15066745274368L, 112256);
    this.fUa = null;
    this.mlE = null;
    this.mlF = null;
    this.fUd = null;
    b.a locala = new b.a();
    locala.gtF = new afi();
    locala.gtG = new afj();
    locala.gtE = 831;
    locala.uri = "/cgi-bin/micromsg-bin/getwcopackageproductlist";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.mlE = ((afi)this.fUa.gtC.gtK);
    w.i("MicroMsg.NetSceneIPCallGetPackageProductList", "NetSceneIPCallGetPackageProductList");
    GMTrace.o(15066745274368L, 112256);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(15067013709824L, 112258);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(15067013709824L, 112258);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(15067147927552L, 112259);
    w.i("MicroMsg.NetSceneIPCallGetPackageProductList", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mlF = ((afj)((b)paramq).gtD.gtK);
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(15067147927552L, 112259);
  }
  
  public final int getType()
  {
    GMTrace.i(15066879492096L, 112257);
    GMTrace.o(15066879492096L, 112257);
    return 831;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */