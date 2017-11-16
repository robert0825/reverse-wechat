package com.tencent.mm.modelstat;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aaf;
import com.tencent.mm.protocal.c.aag;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fXo;
  final com.tencent.mm.ad.b gYp;
  
  public i(com.tencent.mm.bm.b paramb)
  {
    GMTrace.i(1396669677568L, 10406);
    b.a locala = new b.a();
    aaf localaaf = new aaf();
    localaaf.tNq = 0;
    localaaf.uqW = paramb;
    locala.gtF = localaaf;
    locala.gtG = new aag();
    locala.uri = "/cgi-bin/mmbiz-bin/geteventsampleconf";
    locala.gtE = 1126;
    locala.gtH = 0;
    locala.gtI = 0;
    this.gYp = locala.DA();
    GMTrace.o(1396669677568L, 10406);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1396938113024L, 10408);
    w.i("MicroMsg.NetSceneUpdateEventConfig", "start update event config");
    this.guc = true;
    this.fXo = parame1;
    int i = a(parame, this.gYp, this);
    GMTrace.o(1396938113024L, 10408);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1397072330752L, 10409);
    w.i("MicroMsg.NetSceneUpdateEventConfig", "onGYNetEnd errType: %d, errCode: %d, errMsg %s, IReqResp %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, paramq.toString() });
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1397072330752L, 10409);
  }
  
  public final int getType()
  {
    GMTrace.i(1396803895296L, 10407);
    GMTrace.o(1396803895296L, 10407);
    return 1126;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelstat\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */