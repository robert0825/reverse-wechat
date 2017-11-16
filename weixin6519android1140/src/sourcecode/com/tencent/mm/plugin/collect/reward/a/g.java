package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.kv;
import com.tencent.mm.protocal.c.kw;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends a
{
  private final String TAG;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public kw jXf;
  public String jvD;
  
  public g(String paramString)
  {
    GMTrace.i(19348961886208L, 144161);
    this.TAG = "MicroMsg.NetSceneQrRewardSetPhotoWord";
    b.a locala = new b.a();
    locala.gtF = new kv();
    locala.gtG = new kw();
    locala.gtE = 1649;
    locala.uri = "/cgi-bin/mmpay-bin/setrewardqrcodephotoword";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((kv)this.fUa.gtC.gtK).jvD = paramString;
    this.jvD = paramString;
    if ((paramString.length() > 0) && (paramString.length() <= 3))
    {
      com.tencent.mm.plugin.report.service.g.ork.a(724L, 0L, 1L, false);
      GMTrace.o(19348961886208L, 144161);
      return;
    }
    if (paramString.length() > 3) {
      com.tencent.mm.plugin.report.service.g.ork.a(724L, 1L, 1L, false);
    }
    GMTrace.o(19348961886208L, 144161);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19349230321664L, 144163);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(19349230321664L, 144163);
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(19349364539392L, 144164);
    w.i("MicroMsg.NetSceneQrRewardSetPhotoWord", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.jXf = ((kw)((b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneQrRewardSetPhotoWord", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.jXf.jWs), this.jXf.jWt });
    if ((!this.jWW) && (this.jXf.jWs != 0)) {
      this.jWX = true;
    }
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(19349364539392L, 144164);
  }
  
  public final int getType()
  {
    GMTrace.i(19349096103936L, 144162);
    GMTrace.o(19349096103936L, 144162);
    return 1649;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\reward\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */