package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.awk;
import com.tencent.mm.protocal.c.awl;
import com.tencent.mm.sdk.platformtools.w;

public final class m
  extends b
{
  private final String TAG;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public awl oji;
  
  public m()
  {
    GMTrace.i(20892868411392L, 155664);
    this.TAG = "MicroMsg.NetSceneBankRemitQueryTransferList";
    b.a locala = new b.a();
    locala.gtF = new awk();
    locala.gtG = new awl();
    locala.gtE = 1378;
    locala.uri = "/cgi-bin/mmpay-bin/tsrecordlist_tsbc";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(20892868411392L, 155664);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20893136846848L, 155666);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20893136846848L, 155666);
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(20893271064576L, 155667);
    w.i("MicroMsg.NetSceneBankRemitQueryTransferList", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.oji = ((awl)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneBankRemitQueryTransferList", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.oji.jWs), this.oji.jWt });
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(20893271064576L, 155667);
  }
  
  public final int getType()
  {
    GMTrace.i(20893002629120L, 155665);
    GMTrace.o(20893002629120L, 155665);
    return 1378;
  }
  
  protected final void h(q paramq)
  {
    GMTrace.i(20893405282304L, 155668);
    paramq = (awl)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    this.xDi = paramq.jWs;
    this.xDj = paramq.jWt;
    GMTrace.o(20893405282304L, 155668);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */