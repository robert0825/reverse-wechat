package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.auw;
import com.tencent.mm.protocal.c.aux;
import com.tencent.mm.sdk.platformtools.w;

public final class h
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public auw mlL;
  private aux mlM;
  
  public h(int paramInt, long paramLong1, long paramLong2)
  {
    GMTrace.i(11581379313664L, 86288);
    this.fUa = null;
    this.mlL = null;
    this.mlM = null;
    this.fUd = null;
    b.a locala = new b.a();
    locala.gtF = new auw();
    locala.gtG = new aux();
    locala.gtE = 824;
    locala.uri = "/cgi-bin/micromsg-bin/pstnheartbeat";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    long l = System.currentTimeMillis();
    this.mlL = ((auw)this.fUa.gtC.gtK);
    this.mlL.uhU = paramInt;
    this.mlL.uhV = paramLong1;
    this.mlL.uKh = paramLong2;
    this.mlL.uKe = l;
    w.d("MicroMsg.NetSceneIPCallHeartBeat", "heartbeat, roomId: %d, roomKey: %d, callSeq: %d, timestamp: %d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(l) });
    GMTrace.o(11581379313664L, 86288);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11581647749120L, 86290);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11581647749120L, 86290);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11581781966848L, 86291);
    w.i("MicroMsg.NetSceneIPCallHeartBeat", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mlM = ((aux)((b)paramq).gtD.gtK);
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11581781966848L, 86291);
  }
  
  public final int getType()
  {
    GMTrace.i(11581513531392L, 86289);
    GMTrace.o(11581513531392L, 86289);
    return 824;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\d\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */