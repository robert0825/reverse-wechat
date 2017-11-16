package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.adp;
import com.tencent.mm.protocal.c.adq;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String jzG;
  
  public c(String paramString)
  {
    GMTrace.i(5058934603776L, 37692);
    b.a locala = new b.a();
    locala.gtF = new adp();
    locala.gtG = new adq();
    locala.uri = "/cgi-bin/micromsg-bin/getsharecard";
    locala.gtE = 904;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((adp)this.fUa.gtC.gtK).eTJ = paramString;
    GMTrace.o(5058934603776L, 37692);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5059337256960L, 37695);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5059337256960L, 37695);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5059068821504L, 37693);
    w.i("MicroMsg.NetSceneGetShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(904), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (adq)this.fUa.gtD.gtK;
      w.v("MicroMsg.NetSceneGetShareCard", "json:" + paramq.jzG);
      this.jzG = paramq.jzG;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5059068821504L, 37693);
  }
  
  public final int getType()
  {
    GMTrace.i(15360682098688L, 114446);
    GMTrace.o(15360682098688L, 114446);
    return 904;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */