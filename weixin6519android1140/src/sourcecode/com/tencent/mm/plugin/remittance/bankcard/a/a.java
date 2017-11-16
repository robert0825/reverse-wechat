package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.dk;
import com.tencent.mm.protocal.c.dl;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends b
{
  private final String TAG;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public dl oiW;
  public String oiX;
  
  public a(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(20889512968192L, 155639);
    this.TAG = "MicroMsg.NetSceneBankRemitAppointBank";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new dk();
    ((b.a)localObject).gtG = new dl();
    ((b.a)localObject).gtE = 1348;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/appointbank_tsbc";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (dk)this.fUa.gtC.gtK;
    ((dk)localObject).ojE = paramString1;
    ((dk)localObject).tRJ = paramString2;
    ((dk)localObject).nDt = paramString3;
    this.oiX = paramString1;
    w.i("MicroMsg.NetSceneBankRemitAppointBank", "seqno: %s, timing_id: %s, bankType: %s", new Object[] { paramString1, paramString2, paramString3 });
    GMTrace.o(20889512968192L, 155639);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20889781403648L, 155641);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20889781403648L, 155641);
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(20889915621376L, 155642);
    w.i("MicroMsg.NetSceneBankRemitAppointBank", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.oiW = ((dl)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneBankRemitAppointBank", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.oiW.jWs), this.oiW.jWt });
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(20889915621376L, 155642);
  }
  
  public final int getType()
  {
    GMTrace.i(20889647185920L, 155640);
    GMTrace.o(20889647185920L, 155640);
    return 1348;
  }
  
  protected final void h(q paramq)
  {
    GMTrace.i(20890049839104L, 155643);
    paramq = (dl)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    this.xDi = paramq.jWs;
    this.xDj = paramq.jWt;
    GMTrace.o(20890049839104L, 155643);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */