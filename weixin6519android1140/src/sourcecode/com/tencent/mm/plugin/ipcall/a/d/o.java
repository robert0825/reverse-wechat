package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.protocal.c.avh;
import com.tencent.mm.protocal.c.avi;
import com.tencent.mm.sdk.platformtools.w;

public final class o
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public avh mlZ;
  public avi mma;
  
  public o(int paramInt1, long paramLong1, int paramInt2, long paramLong2, boolean paramBoolean)
  {
    GMTrace.i(11584063668224L, 86308);
    this.fUa = null;
    this.mlZ = null;
    this.mma = null;
    b.a locala = new b.a();
    locala.gtF = new avh();
    locala.gtG = new avi();
    locala.gtE = 819;
    locala.uri = "/cgi-bin/micromsg-bin/pstnsync";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    long l = System.currentTimeMillis();
    this.mlZ = ((avh)this.fUa.gtC.gtK);
    this.mlZ.uKB = com.tencent.mm.y.q.zE();
    this.mlZ.uhU = paramInt1;
    this.mlZ.uhV = paramLong1;
    this.mlZ.uKe = l;
    this.mlZ.uKC = paramInt2;
    this.mlZ.uKh = paramLong2;
    if (!paramBoolean) {}
    for (this.mlZ.uKD = 0;; this.mlZ.uKD = 1)
    {
      w.i("MicroMsg.NetSceneIPCallSync", "roomId: %d, roomKey: %d, syncKey: %d, callSeq: %d,dataFlag: %d, timestamp: %d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Integer.valueOf(paramInt2), Long.valueOf(paramLong2), Integer.valueOf(this.mlZ.uKD), Long.valueOf(l) });
      GMTrace.o(11584063668224L, 86308);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11584332103680L, 86310);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11584332103680L, 86310);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11584466321408L, 86311);
    w.i("MicroMsg.NetSceneIPCallSync", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mma = ((avi)((b)paramq).gtD.gtK);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(11584466321408L, 86311);
  }
  
  public final int getType()
  {
    GMTrace.i(11584197885952L, 86309);
    GMTrace.o(11584197885952L, 86309);
    return 819;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\d\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */