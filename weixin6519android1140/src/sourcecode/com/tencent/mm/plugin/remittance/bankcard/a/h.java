package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ww;
import com.tencent.mm.protocal.c.wx;
import com.tencent.mm.sdk.platformtools.w;

public final class h
  extends b
{
  private final String TAG;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public wx ojd;
  
  public h()
  {
    GMTrace.i(20892197322752L, 155659);
    this.TAG = "MicroMsg.NetSceneBankRemitGetBankList";
    b.a locala = new b.a();
    locala.gtF = new ww();
    locala.gtG = new wx();
    locala.gtE = 1399;
    locala.uri = "/cgi-bin/mmpay-bin/getbanklist_tsbc";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(20892197322752L, 155659);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20892465758208L, 155661);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20892465758208L, 155661);
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(20892599975936L, 155662);
    w.i("MicroMsg.NetSceneBankRemitGetBankList", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.ojd = ((wx)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneBankRemitGetBankList", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.ojd.jWs), this.ojd.jWt });
    if ((!this.jWW) && (this.ojd.jWs != 0)) {
      this.jWX = true;
    }
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(20892599975936L, 155662);
  }
  
  public final int getType()
  {
    GMTrace.i(20892331540480L, 155660);
    GMTrace.o(20892331540480L, 155660);
    return 1399;
  }
  
  protected final void h(q paramq)
  {
    GMTrace.i(20892734193664L, 155663);
    paramq = (wx)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    this.xDi = paramq.jWs;
    this.xDj = paramq.jWt;
    GMTrace.o(20892734193664L, 155663);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */