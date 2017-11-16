package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.pi;
import com.tencent.mm.protocal.c.pj;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public i(String paramString)
  {
    GMTrace.i(1365128511488L, 10171);
    w.i("MicroMsg.NetSceneDelTempSession", "NetSceneDelTempSession %s", new Object[] { paramString });
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new pi();
    ((b.a)localObject).gtG = new pj();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/deltempsession";
    ((b.a)localObject).gtE = 1067;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (pi)this.fUa.gtC.gtK;
    ((pi)localObject).tVK = paramString;
    ((pi)localObject).ufH = com.tencent.mm.bm.b.aX(new byte[0]);
    GMTrace.o(1365128511488L, 10171);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1365396946944L, 10173);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1365396946944L, 10173);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1365531164672L, 10174);
    w.i("MicroMsg.NetSceneDelTempSession", "onGYNetEnd: %d, %d, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1365531164672L, 10174);
  }
  
  public final int getType()
  {
    GMTrace.i(1365262729216L, 10172);
    GMTrace.o(1365262729216L, 10172);
    return 1067;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */