package com.tencent.mm.plugin.aa.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.l;
import com.tencent.mm.protocal.c.m;
import com.tencent.mm.sdk.platformtools.w;

public final class h
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private b gUL;
  private l hpn;
  public m hpo;
  
  public h()
  {
    GMTrace.i(5597416128512L, 41704);
    b.a locala = new b.a();
    locala.gtF = new l();
    locala.gtG = new m();
    locala.gtE = 1698;
    locala.uri = "/cgi-bin/mmpay-bin/newaaoperation";
    locala.gtH = 0;
    locala.gtI = 0;
    this.gUL = locala.DA();
    this.hpn = ((l)this.gUL.gtC.gtK);
    GMTrace.o(5597416128512L, 41704);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5597684563968L, 41706);
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(5597684563968L, 41706);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5597818781696L, 41707);
    w.i("MicroMsg.NetSceneAAOperation", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.hpo = ((m)((b)paramq).gtD.gtK);
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      w.i("MicroMsg.NetSceneAAOperation", "retCode: %s, retMsg: %s, max_payer_num: %s, max_receiver_num: %s, max_total_num: %s, max_total_amount: %s, max_per_amount: %s, notice: %s, notice_url: %s", new Object[] { Integer.valueOf(this.hpo.jWs), this.hpo.jWt, Integer.valueOf(this.hpo.tMn), Integer.valueOf(this.hpo.tMo), Integer.valueOf(this.hpo.tMp), Long.valueOf(this.hpo.tMq), Long.valueOf(this.hpo.tMr), this.hpo.jWE, this.hpo.jWF });
    }
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(5597818781696L, 41707);
  }
  
  public final int getType()
  {
    GMTrace.i(5597550346240L, 41705);
    GMTrace.o(5597550346240L, 41705);
    return 1698;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\a\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */