package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aew;
import com.tencent.mm.protocal.c.aex;
import com.tencent.mm.protocal.c.azb;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  String qBK;
  int qBL;
  String qBM;
  
  public d(int paramInt, String paramString)
  {
    GMTrace.i(12486946324480L, 93035);
    this.qBK = "";
    this.qBL = 0;
    this.qBM = "";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new aew();
    ((b.a)localObject).gtG = new aex();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getvoiceprintresource";
    ((b.a)localObject).gtE = 611;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (aew)this.fUa.gtC.gtK;
    w.i("MicroMsg.NetSceneGetVoicePrintResource", "sceneType %d %s", new Object[] { Integer.valueOf(paramInt), paramString });
    ((aew)localObject).uuM = paramInt;
    ((aew)localObject).uuN = paramString;
    GMTrace.o(12486946324480L, 93035);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12487080542208L, 93036);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12487080542208L, 93036);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12487348977664L, 93038);
    w.d("MicroMsg.NetSceneGetVoicePrintResource", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (aex)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12487348977664L, 93038);
      return;
    }
    if (paramq.uuO != null)
    {
      this.qBK = new String(paramq.uuO.uNu.uNP.tJp);
      this.qBL = paramq.uuO.uMG;
      w.d("MicroMsg.NetSceneGetVoicePrintResource", "vertify resid %d mtext %s", new Object[] { Integer.valueOf(this.qBL), this.qBK });
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12487348977664L, 93038);
      return;
      w.e("MicroMsg.NetSceneGetVoicePrintResource", "resp ResourceData null ");
    }
  }
  
  public final int getType()
  {
    GMTrace.i(12487214759936L, 93037);
    GMTrace.o(12487214759936L, 93037);
    return 611;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */