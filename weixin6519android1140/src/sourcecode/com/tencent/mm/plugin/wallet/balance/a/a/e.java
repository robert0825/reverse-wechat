package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.protocal.c.avy;
import com.tencent.mm.protocal.c.avz;

public final class e
  extends a<avz>
{
  private b gUL;
  private avy qTn;
  
  public e()
  {
    GMTrace.i(18415746023424L, 137208);
    this.qTn = null;
    b.a locala = new b.a();
    locala.gtF = new avy();
    locala.gtG = new avz();
    locala.gtE = 1211;
    locala.uri = "/cgi-bin/mmpay-bin/qryusrfunddetail";
    locala.gtH = 0;
    locala.gtI = 0;
    this.gUL = locala.DA();
    this.qTn = ((avy)this.gUL.gtC.gtK);
    this.qTn.time_stamp = ((int)System.currentTimeMillis());
    this.fUa = locala.DA();
    GMTrace.o(18415746023424L, 137208);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\a\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */