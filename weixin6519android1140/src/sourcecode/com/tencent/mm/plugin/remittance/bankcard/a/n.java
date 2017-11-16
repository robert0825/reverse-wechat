package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ayy;
import com.tencent.mm.protocal.c.ayz;
import com.tencent.mm.protocal.c.cd;
import com.tencent.mm.sdk.platformtools.w;

public final class n
  extends b
{
  private final String TAG;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public ayz ojj;
  
  public n(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4, int paramInt3, int paramInt4, String paramString5)
  {
    GMTrace.i(20896358072320L, 155690);
    this.TAG = "MicroMsg.NetSceneBankRemitRequestOrder";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ayy();
    ((b.a)localObject).gtG = new ayz();
    ((b.a)localObject).gtE = 1380;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/request_tsbc";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ayy)this.fUa.gtC.gtK;
    ((ayy)localObject).ojE = paramString1;
    ((ayy)localObject).ojF = paramString2;
    ((ayy)localObject).nDt = paramString3;
    ((ayy)localObject).ojr = paramInt1;
    ((ayy)localObject).uNi = paramInt2;
    ((ayy)localObject).uNj = paramString4;
    ((ayy)localObject).uNk = paramInt3;
    ((ayy)localObject).uNl = paramInt4;
    ((ayy)localObject).tRL = paramString5;
    GMTrace.o(20896358072320L, 155690);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20896626507776L, 155692);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20896626507776L, 155692);
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(20896760725504L, 155693);
    w.i("MicroMsg.NetSceneBankRemitRequestOrder", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.ojj = ((ayz)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneBankRemitRequestOrder", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.ojj.jWs), this.ojj.jWt });
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(20896760725504L, 155693);
  }
  
  public final boolean bbj()
  {
    GMTrace.i(20897029160960L, 155695);
    if ((this.ojj.uNm != null) && (this.ojj.uNm.eQl == 1))
    {
      GMTrace.o(20897029160960L, 155695);
      return false;
    }
    GMTrace.o(20897029160960L, 155695);
    return true;
  }
  
  public final int getType()
  {
    GMTrace.i(20896492290048L, 155691);
    GMTrace.o(20896492290048L, 155691);
    return 1380;
  }
  
  protected final void h(q paramq)
  {
    GMTrace.i(20896894943232L, 155694);
    paramq = (ayz)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    this.xDi = paramq.jWs;
    this.xDj = paramq.jWt;
    GMTrace.o(20896894943232L, 155694);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */