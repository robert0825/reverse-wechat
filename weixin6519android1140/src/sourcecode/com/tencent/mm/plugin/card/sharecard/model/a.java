package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.protocal.c.pg;
import com.tencent.mm.protocal.c.ph;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String eTJ;
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public int jzH;
  
  public a(String paramString)
  {
    GMTrace.i(5071953723392L, 37789);
    this.eTJ = "";
    b.a locala = new b.a();
    locala.gtF = new pg();
    locala.gtG = new ph();
    locala.uri = "/cgi-bin/mmbiz-bin/card/delsharecard";
    locala.gtE = 1163;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((pg)this.fUa.gtC.gtK).eTJ = paramString;
    this.eTJ = paramString;
    GMTrace.o(5071953723392L, 37789);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5072356376576L, 37792);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5072356376576L, 37792);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5072087941120L, 37790);
    w.i("MicroMsg.NetSceneDelShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(1163), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ph)this.fUa.gtD.gtK;
      w.i("MicroMsg.NetSceneDelShareCard", "ret_code:" + paramq.jzH);
      this.jzH = paramq.jzH;
      if (this.jzH == 0) {
        al.akv().uj(this.eTJ);
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5072087941120L, 37790);
  }
  
  public final int getType()
  {
    GMTrace.i(15361487405056L, 114452);
    GMTrace.o(15361487405056L, 114452);
    return 1163;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */