package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.afg;
import com.tencent.mm.protocal.c.afh;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private afg mlC;
  public afh mlD;
  
  public d()
  {
    GMTrace.i(11582453055488L, 86296);
    this.fUa = null;
    this.mlC = null;
    this.mlD = null;
    b.a locala = new b.a();
    locala.gtF = new afg();
    locala.gtG = new afh();
    locala.gtE = 288;
    locala.uri = "/cgi-bin/micromsg-bin/getwcogiftcardlist";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.mlC = ((afg)this.fUa.gtC.gtK);
    w.i("MicroMsg.NetSceneIPCallGetGiftCardList", "NetSceneIPCallGetGiftCardList");
    GMTrace.o(11582453055488L, 86296);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11582721490944L, 86298);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11582721490944L, 86298);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11582855708672L, 86299);
    w.i("MicroMsg.NetSceneIPCallGetGiftCardList", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mlD = ((afh)((b)paramq).gtD.gtK);
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11582855708672L, 86299);
  }
  
  public final int getType()
  {
    GMTrace.i(11582587273216L, 86297);
    GMTrace.o(11582587273216L, 86297);
    return 288;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */