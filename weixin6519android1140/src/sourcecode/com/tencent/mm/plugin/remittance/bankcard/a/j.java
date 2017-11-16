package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.apn;
import com.tencent.mm.protocal.c.apo;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends b
{
  private final String TAG;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public String hLO;
  public String oiX;
  public apo ojf;
  
  public j(String paramString1, String paramString2)
  {
    GMTrace.i(20895686983680L, 155685);
    this.TAG = "MicroMsg.NetSceneBankRemitModifyExplain";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new apn();
    ((b.a)localObject).gtG = new apo();
    ((b.a)localObject).gtE = 1590;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/modifyexplain_tsbc";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (apn)this.fUa.gtC.gtK;
    ((apn)localObject).ojE = paramString1;
    ((apn)localObject).ojH = paramString2;
    this.oiX = paramString1;
    this.hLO = paramString2;
    GMTrace.o(20895686983680L, 155685);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20895955419136L, 155687);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20895955419136L, 155687);
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(20896089636864L, 155688);
    w.i("MicroMsg.NetSceneBankRemitModifyExplain", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.ojf = ((apo)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneBankRemitModifyExplain", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.ojf.jWs), this.ojf.jWt });
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(20896089636864L, 155688);
  }
  
  public final int getType()
  {
    GMTrace.i(20895821201408L, 155686);
    GMTrace.o(20895821201408L, 155686);
    return 1590;
  }
  
  protected final void h(q paramq)
  {
    GMTrace.i(20896223854592L, 155689);
    paramq = (apo)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    this.xDi = paramq.jWs;
    this.xDj = paramq.jWt;
    GMTrace.o(20896223854592L, 155689);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */