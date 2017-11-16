package com.tencent.mm.plugin.shake.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.normsg.a.d;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bdi;
import com.tencent.mm.protocal.c.bdj;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  byte[] eWZ;
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  int ret;
  
  public b(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    GMTrace.i(6502580486144L, 48448);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bdi();
    ((b.a)localObject).gtG = new bdj();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/shakereport";
    ((b.a)localObject).gtE = 161;
    ((b.a)localObject).gtH = 56;
    ((b.a)localObject).gtI = 1000000056;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bdi)this.fUa.gtC.gtK;
    w.i("MicroMsg.NetSceneShakeReport", "share reprot %f %f", new Object[] { Float.valueOf(paramFloat2), Float.valueOf(paramFloat1) });
    ((bdi)localObject).tMX = 0;
    ((bdi)localObject).tYy = paramFloat1;
    ((bdi)localObject).tYz = paramFloat2;
    ((bdi)localObject).ujb = paramInt1;
    ((bdi)localObject).ujc = paramString1;
    ((bdi)localObject).ujd = paramString2;
    ((bdi)localObject).uje = paramInt2;
    at.AR();
    ((bdi)localObject).uPy = bg.a((Integer)c.xh().get(4107, null), 0);
    at.AR();
    paramInt2 = bg.e((Integer)c.xh().get(4106, null));
    ((bdi)localObject).uPz = paramInt2;
    at.AR();
    c.xh().set(4106, Integer.valueOf(paramInt2 + 1));
    ((bdi)localObject).uAI = new azp().be(d.nxJ.aUq());
    com.tencent.mm.modelstat.n.a(2002, paramFloat1, paramFloat2, paramInt1);
    GMTrace.o(6502580486144L, 48448);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6502714703872L, 48449);
    w.d("MicroMsg.NetSceneShakeReport", "doScene");
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6502714703872L, 48449);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6503117357056L, 48452);
    w.d("MicroMsg.NetSceneShakeReport", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (bdj)this.fUa.gtD.gtK;
    this.ret = paramq.AZ().tKs;
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      this.eWZ = com.tencent.mm.platformtools.n.a(paramArrayOfByte.tTe);
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6503117357056L, 48452);
  }
  
  public final int beV()
  {
    GMTrace.i(6502983139328L, 48451);
    int i = ((bdi)this.fUa.gtC.gtK).uje;
    GMTrace.o(6502983139328L, 48451);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(6502848921600L, 48450);
    GMTrace.o(6502848921600L, 48450);
    return 161;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */