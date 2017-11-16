package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.protocal.c.avf;
import com.tencent.mm.protocal.c.avg;
import com.tencent.mm.sdk.platformtools.w;

public final class n
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public avf mlX;
  private avg mlY;
  
  public n(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
  {
    GMTrace.i(11583526797312L, 86304);
    this.fUa = null;
    this.mlX = null;
    this.mlY = null;
    this.fUd = null;
    b.a locala = new b.a();
    locala.gtF = new avf();
    locala.gtG = new avg();
    locala.gtE = 723;
    locala.uri = "/cgi-bin/micromsg-bin/pstnshutdown";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    long l = System.currentTimeMillis();
    this.mlX = ((avf)this.fUa.gtC.gtK);
    this.mlX.lSY = com.tencent.mm.y.q.zE();
    this.mlX.uhU = paramInt1;
    this.mlX.uhV = paramLong1;
    this.mlX.uKh = paramLong2;
    this.mlX.jhA = paramInt2;
    this.mlX.uKe = l;
    w.i("MicroMsg.NetSceneIPCallShutDown", "roomId: %d, roomKey: %d, callSeq: %d, status: %d, timestamp: %d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt2), Long.valueOf(l) });
    GMTrace.o(11583526797312L, 86304);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11583795232768L, 86306);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11583795232768L, 86306);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11583929450496L, 86307);
    w.i("MicroMsg.NetSceneIPCallShutDown", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mlY = ((avg)((b)paramq).gtD.gtK);
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11583929450496L, 86307);
  }
  
  public final int getType()
  {
    GMTrace.i(11583661015040L, 86305);
    GMTrace.o(11583661015040L, 86305);
    return 723;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\d\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */