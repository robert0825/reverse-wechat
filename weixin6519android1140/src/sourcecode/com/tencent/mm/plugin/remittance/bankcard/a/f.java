package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.pq;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends b
{
  private final String TAG;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public String oiX;
  public pr ojb;
  
  public f(String paramString)
  {
    GMTrace.i(20895015895040L, 155680);
    this.TAG = "MicroMsg.NetSceneBankRemitDeleteRecord";
    b.a locala = new b.a();
    locala.gtF = new pq();
    locala.gtG = new pr();
    locala.gtE = 1395;
    locala.uri = "/cgi-bin/mmpay-bin/deleterecord_tsbc";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((pq)this.fUa.gtC.gtK).ojE = paramString;
    this.oiX = paramString;
    GMTrace.o(20895015895040L, 155680);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20895284330496L, 155682);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20895284330496L, 155682);
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(20895418548224L, 155683);
    w.i("MicroMsg.NetSceneBankRemitDeleteRecord", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.ojb = ((pr)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneBankRemitDeleteRecord", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.ojb.jWs), this.ojb.jWt });
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(20895418548224L, 155683);
  }
  
  public final int getType()
  {
    GMTrace.i(20895150112768L, 155681);
    GMTrace.o(20895150112768L, 155681);
    return 1395;
  }
  
  protected final void h(q paramq)
  {
    GMTrace.i(20895552765952L, 155684);
    paramq = (pr)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    this.xDi = paramq.jWs;
    this.xDj = paramq.jWt;
    GMTrace.o(20895552765952L, 155684);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */