package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ars;
import com.tencent.mm.protocal.c.art;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;

public final class k
  extends b
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public art ojg;
  
  public k()
  {
    GMTrace.i(20897163378688L, 155696);
    b.a locala = new b.a();
    locala.gtF = new ars();
    locala.gtG = new art();
    locala.gtE = 1280;
    locala.uri = "/cgi-bin/mmpay-bin/operation_tsbc";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(20897163378688L, 155696);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20897431814144L, 155698);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20897431814144L, 155698);
    return i;
  }
  
  protected final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(20897566031872L, 155699);
    w.i("MicroMsg.NetSceneBankRemitOperation", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.ojg = ((art)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneBankRemitOperation", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.ojg.jWs), this.ojg.jWt });
    if ((!this.jWW) && (!this.jWX))
    {
      w.i("MicroMsg.NetSceneBankRemitOperation", "min_poundage: %s, max_amount: %s", new Object[] { Integer.valueOf(this.ojg.uHN), Integer.valueOf(this.ojg.uHO) });
      if (this.ojg.uHN >= 0) {
        h.xy().xh().a(w.a.vzS, Integer.valueOf(this.ojg.uHN));
      }
      if (this.ojg.uHO > 0) {
        h.xy().xh().a(w.a.vzT, Integer.valueOf(this.ojg.uHO));
      }
      if (!bg.nm(this.ojg.uHP)) {
        h.xy().xh().a(w.a.vzU, this.ojg.uHP);
      }
    }
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(20897566031872L, 155699);
  }
  
  public final int getType()
  {
    GMTrace.i(20897297596416L, 155697);
    GMTrace.o(20897297596416L, 155697);
    return 1280;
  }
  
  protected final void h(q paramq)
  {
    GMTrace.i(20897700249600L, 155700);
    paramq = (art)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    this.xDi = paramq.jWs;
    this.xDj = paramq.jWt;
    GMTrace.o(20897700249600L, 155700);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */