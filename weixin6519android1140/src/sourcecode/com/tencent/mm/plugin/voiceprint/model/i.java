package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bid;
import com.tencent.mm.protocal.c.bie;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public int mStatus;
  public int qCb;
  
  public i(int paramInt)
  {
    GMTrace.i(12498891702272L, 93124);
    b.a locala = new b.a();
    locala.gtF = new bid();
    locala.gtG = new bie();
    locala.uri = "/cgi-bin/micromsg-bin/switchopvoiceprint";
    locala.gtE = 615;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((bid)this.fUa.gtC.gtK).eHJ = paramInt;
    GMTrace.o(12498891702272L, 93124);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12499025920000L, 93125);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12499025920000L, 93125);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12499294355456L, 93127);
    w.d("MicroMsg.NetSceneSwitchOpVoicePrint", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (bie)((b)paramq).gtD.gtK;
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12499294355456L, 93127);
      return;
    }
    this.mStatus = paramq.uJk;
    this.qCb = paramq.uTJ;
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12499294355456L, 93127);
  }
  
  public final int getType()
  {
    GMTrace.i(12499160137728L, 93126);
    GMTrace.o(12499160137728L, 93126);
    return 615;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */