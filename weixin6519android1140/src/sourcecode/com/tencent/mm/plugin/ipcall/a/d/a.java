package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aus;
import com.tencent.mm.protocal.c.aut;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public aus mlw;
  private aut mlx;
  
  public a(int paramInt1, long paramLong1, String paramString1, String paramString2, int paramInt2, long paramLong2)
  {
    GMTrace.i(11586211151872L, 86324);
    this.fUa = null;
    this.mlw = null;
    this.mlx = null;
    this.fUd = null;
    b.a locala = new b.a();
    locala.gtF = new aus();
    locala.gtG = new aut();
    locala.gtE = 843;
    locala.uri = "/cgi-bin/micromsg-bin/pstncancelinvite";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    long l = System.currentTimeMillis();
    this.mlw = ((aus)this.fUa.gtC.gtK);
    this.mlw.uhU = paramInt1;
    this.mlw.uhV = paramLong1;
    this.mlw.lSX = paramString1;
    this.mlw.uKe = l;
    this.mlw.uKf = paramInt2;
    this.mlw.uKg = paramString2;
    this.mlw.uKh = paramLong2;
    w.d("MicroMsg.NetSceneIPCallCancel", "roomId: %d, roomKey: %d, toUsername: %s, timestamp: %d, inviteId: %d, phoneNumber: %s, callseq: %d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), paramString1, Long.valueOf(l), Integer.valueOf(paramInt2), paramString2, Long.valueOf(paramLong2) });
    GMTrace.o(11586211151872L, 86324);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11586479587328L, 86326);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11586479587328L, 86326);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11586613805056L, 86327);
    w.i("MicroMsg.NetSceneIPCallCancel", "errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mlx = ((aut)((b)paramq).gtD.gtK);
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11586613805056L, 86327);
  }
  
  public final int getType()
  {
    GMTrace.i(11586345369600L, 86325);
    GMTrace.o(11586345369600L, 86325);
    return 843;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */