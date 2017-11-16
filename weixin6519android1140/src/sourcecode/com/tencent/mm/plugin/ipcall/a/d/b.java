package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.auu;
import com.tencent.mm.protocal.c.auv;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private auu mly;
  public auv mlz;
  
  public b(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    GMTrace.i(11584600539136L, 86312);
    this.fUa = null;
    this.mly = null;
    this.mlz = null;
    b.a locala = new b.a();
    locala.gtF = new auu();
    locala.gtG = new auv();
    locala.gtE = 807;
    locala.uri = "/cgi-bin/micromsg-bin/pstnchecknumber";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.mly = ((auu)this.fUa.gtC.gtK);
    this.mly.uKi = paramString1;
    this.mly.uKk = paramString2;
    this.mly.uKm = paramString3;
    this.mly.uKl = paramString4;
    this.mly.uKn = paramInt;
    w.i("MicroMsg.NetSceneIPCallCheckNumber", "NetSceneIPCallCheckNumber pureNumber:%s,lastCountry:%s,osCountry:%s,simCountry:%s,dialScene:%d", new Object[] { paramString1, paramString2, paramString3, paramString4, Integer.valueOf(paramInt) });
    GMTrace.o(11584600539136L, 86312);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11584868974592L, 86314);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11584868974592L, 86314);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11585003192320L, 86315);
    w.i("MicroMsg.NetSceneIPCallCheckNumber", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mlz = ((auv)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11585003192320L, 86315);
  }
  
  public final int getType()
  {
    GMTrace.i(11584734756864L, 86313);
    GMTrace.o(11584734756864L, 86313);
    return 807;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */