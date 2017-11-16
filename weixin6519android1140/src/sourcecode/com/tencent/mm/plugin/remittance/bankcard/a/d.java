package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.lh;
import com.tencent.mm.protocal.c.li;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends b
{
  private final String TAG;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public li oiZ;
  
  public d(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(20891526234112L, 155654);
    this.TAG = "MicroMsg.NetSceneBankRemitCheckBankBind";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new lh();
    ((b.a)localObject).gtG = new li();
    ((b.a)localObject).gtE = 1349;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/checkbankbind_tsbc";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (lh)this.fUa.gtC.gtK;
    ((lh)localObject).ubZ = paramString1;
    ((lh)localObject).uca = paramString2;
    ((lh)localObject).mhU = paramString3;
    ((lh)localObject).nDt = paramString4;
    GMTrace.o(20891526234112L, 155654);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20891794669568L, 155656);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20891794669568L, 155656);
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(20891928887296L, 155657);
    w.i("MicroMsg.NetSceneBankRemitCheckBankBind", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.oiZ = ((li)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneBankRemitCheckBankBind", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.oiZ.jWs), this.oiZ.jWt });
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(20891928887296L, 155657);
  }
  
  public final int getType()
  {
    GMTrace.i(20891660451840L, 155655);
    GMTrace.o(20891660451840L, 155655);
    return 1349;
  }
  
  protected final void h(q paramq)
  {
    GMTrace.i(20892063105024L, 155658);
    paramq = (li)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    this.xDi = paramq.jWs;
    this.xDj = paramq.jWt;
    GMTrace.o(20892063105024L, 155658);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */