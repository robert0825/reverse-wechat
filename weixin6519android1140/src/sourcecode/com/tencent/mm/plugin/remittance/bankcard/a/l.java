package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.awb;
import com.tencent.mm.protocal.c.awc;
import com.tencent.mm.sdk.platformtools.w;

public final class l
  extends b
{
  private final String TAG;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public awc ojh;
  
  public l(String paramString)
  {
    GMTrace.i(20897834467328L, 155701);
    this.TAG = "MicroMsg.NetSceneBankRemitQueryDetail";
    b.a locala = new b.a();
    locala.gtF = new awb();
    locala.gtG = new awc();
    locala.gtE = 1579;
    locala.uri = "/cgi-bin/mmpay-bin/querydetail_tsbc";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((awb)this.fUa.gtC.gtK).tXo = paramString;
    w.i("MicroMsg.NetSceneBankRemitQueryDetail", "bill id: %s", new Object[] { paramString });
    GMTrace.o(20897834467328L, 155701);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20898102902784L, 155703);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20898102902784L, 155703);
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(20898237120512L, 155704);
    w.i("MicroMsg.NetSceneBankRemitQueryDetail", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.ojh = ((awc)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(20898237120512L, 155704);
  }
  
  public final int getType()
  {
    GMTrace.i(20897968685056L, 155702);
    GMTrace.o(20897968685056L, 155702);
    return 1579;
  }
  
  protected final void h(q paramq)
  {
    GMTrace.i(20898371338240L, 155705);
    paramq = (awc)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    this.xDi = paramq.jWs;
    this.xDj = paramq.jWt;
    GMTrace.o(20898371338240L, 155705);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */