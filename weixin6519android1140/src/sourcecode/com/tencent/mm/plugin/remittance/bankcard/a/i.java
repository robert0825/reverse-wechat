package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.awf;
import com.tencent.mm.protocal.c.awg;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends b
{
  public int aCN;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public awg oje;
  
  public i(int paramInt1, int paramInt2)
  {
    GMTrace.i(20890184056832L, 155644);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new awf();
    ((b.a)localObject).gtG = new awg();
    ((b.a)localObject).gtE = 1511;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/historylist_tsbc";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (awf)this.fUa.gtC.gtK;
    ((awf)localObject).aCN = paramInt1;
    ((awf)localObject).offset = paramInt2;
    this.aCN = paramInt1;
    w.i("MicroMsg.NetSceneBankRemitHistoryList", "limit: %s, offset: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(20890184056832L, 155644);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20890452492288L, 155646);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20890452492288L, 155646);
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(20890586710016L, 155647);
    w.i("MicroMsg.NetSceneBankRemitHistoryList", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.oje = ((awg)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneBankRemitHistoryList", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.oje.jWs), this.oje.jWt });
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(20890586710016L, 155647);
  }
  
  public final int getType()
  {
    GMTrace.i(20890318274560L, 155645);
    GMTrace.o(20890318274560L, 155645);
    return 1511;
  }
  
  protected final void h(q paramq)
  {
    GMTrace.i(20890720927744L, 155648);
    paramq = (awg)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    this.xDi = paramq.jWs;
    this.xDj = paramq.jWt;
    GMTrace.o(20890720927744L, 155648);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */