package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ij;
import com.tencent.mm.protocal.c.ik;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends b
{
  private final String TAG;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public ik oiY;
  
  public c(String paramString1, String paramString2)
  {
    GMTrace.i(20893673717760L, 155670);
    this.TAG = "MicroMsg.NetSceneBankRemitBusinessCallback";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ij();
    ((b.a)localObject).gtG = new ik();
    ((b.a)localObject).gtE = 1340;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/busscb_tsbc";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ij)this.fUa.gtC.gtK;
    ((ij)localObject).tXo = paramString1;
    ((ij)localObject).omN = paramString2;
    GMTrace.o(20893673717760L, 155670);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20893942153216L, 155672);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20893942153216L, 155672);
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(20894076370944L, 155673);
    w.i("MicroMsg.NetSceneBankRemitBusinessCallback", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.oiY = ((ik)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneBankRemitBusinessCallback", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.oiY.jWs), this.oiY.jWt });
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(20894076370944L, 155673);
  }
  
  public final int getType()
  {
    GMTrace.i(20893807935488L, 155671);
    GMTrace.o(20893807935488L, 155671);
    return 1340;
  }
  
  protected final void h(q paramq)
  {
    GMTrace.i(20894210588672L, 155674);
    paramq = (ik)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    this.xDi = paramq.jWs;
    this.xDj = paramq.jWt;
    GMTrace.o(20894210588672L, 155674);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */