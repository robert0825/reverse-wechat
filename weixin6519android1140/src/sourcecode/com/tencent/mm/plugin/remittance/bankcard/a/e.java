package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.po;
import com.tencent.mm.protocal.c.pp;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends b
{
  private final String TAG;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public String jVQ;
  public pp oja;
  
  public e(String paramString)
  {
    GMTrace.i(20890855145472L, 155649);
    this.TAG = "MicroMsg.NetSceneBankRemitDeleteHistory";
    b.a locala = new b.a();
    locala.gtF = new po();
    locala.gtG = new pp();
    locala.gtE = 1737;
    locala.uri = "/cgi-bin/mmpay-bin/deletehistoryrecord_tsbc";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((po)this.fUa.gtC.gtK).tXo = paramString;
    this.jVQ = paramString;
    GMTrace.o(20890855145472L, 155649);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20891123580928L, 155651);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20891123580928L, 155651);
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(20891257798656L, 155652);
    w.i("MicroMsg.NetSceneBankRemitDeleteHistory", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.oja = ((pp)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneBankRemitDeleteHistory", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.oja.jWs), this.oja.jWt });
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(20891257798656L, 155652);
  }
  
  public final int getType()
  {
    GMTrace.i(20890989363200L, 155650);
    GMTrace.o(20890989363200L, 155650);
    return 1737;
  }
  
  protected final void h(q paramq)
  {
    GMTrace.i(20891392016384L, 155653);
    paramq = (pp)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    this.xDi = paramq.jWs;
    this.xDj = paramq.jWt;
    GMTrace.o(20891392016384L, 155653);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */