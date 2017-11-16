package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.afk;
import com.tencent.mm.protocal.c.afl;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private afk mlG;
  public afl mlH;
  public boolean mlI;
  
  public f(String paramString1, String paramString2)
  {
    GMTrace.i(11586748022784L, 86328);
    this.fUa = null;
    this.mlG = null;
    this.mlH = null;
    this.mlI = true;
    if (bg.nm(paramString2))
    {
      this.mlI = true;
      paramString2 = "";
    }
    for (;;)
    {
      b.a locala = new b.a();
      locala.gtF = new afk();
      locala.gtG = new afl();
      locala.gtE = 929;
      locala.uri = "/cgi-bin/micromsg-bin/getwcoproductlist";
      locala.gtH = 0;
      locala.gtI = 0;
      this.fUa = locala.DA();
      this.mlG = ((afk)this.fUa.gtC.gtK);
      this.mlG.uuV = paramString1;
      this.mlG.uuW = paramString2;
      w.i("MicroMsg.NetSceneIPCallGetProductList", "NetSceneIPCallGetProductList");
      GMTrace.o(11586748022784L, 86328);
      return;
      this.mlI = false;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11587016458240L, 86330);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11587016458240L, 86330);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11587150675968L, 86331);
    w.i("MicroMsg.NetSceneIPCallGetProductList", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mlH = ((afl)((b)paramq).gtD.gtK);
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11587150675968L, 86331);
  }
  
  public final int getType()
  {
    GMTrace.i(11586882240512L, 86329);
    GMTrace.o(11586882240512L, 86329);
    return 929;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */