package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.wu;
import com.tencent.mm.protocal.c.wv;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends b
{
  private final String TAG;
  public String eDW;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public wv ojc;
  
  public g(String paramString1, String paramString2)
  {
    GMTrace.i(20894344806400L, 155675);
    this.TAG = "MicroMsg.NetSceneBankRemitGetBankInfo";
    b.a locala = new b.a();
    locala.gtF = new wu();
    locala.gtG = new wv();
    locala.gtE = 1542;
    locala.uri = "/cgi-bin/mmpay-bin/getbankinfo_tsbc";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((wu)this.fUa.gtC.gtK).uca = paramString1;
    this.eDW = paramString2;
    GMTrace.o(20894344806400L, 155675);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20894613241856L, 155677);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20894613241856L, 155677);
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(20894747459584L, 155678);
    w.i("MicroMsg.NetSceneBankRemitGetBankInfo", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.ojc = ((wv)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneBankRemitGetBankInfo", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.ojc.jWs), this.ojc.jWt });
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(20894747459584L, 155678);
  }
  
  public final int getType()
  {
    GMTrace.i(20894479024128L, 155676);
    GMTrace.o(20894479024128L, 155676);
    return 1542;
  }
  
  protected final void h(q paramq)
  {
    GMTrace.i(20894881677312L, 155679);
    paramq = (wv)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    this.xDi = paramq.jWs;
    this.xDj = paramq.jWt;
    GMTrace.o(20894881677312L, 155679);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */