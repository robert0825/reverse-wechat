package com.tencent.mm.plugin.voip_cs.b.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bom;
import com.tencent.mm.protocal.c.bon;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public b(long paramLong1, long paramLong2)
  {
    GMTrace.i(11256572411904L, 83868);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bom();
    ((b.a)localObject).gtG = new bon();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/csvoipheartbeat";
    ((b.a)localObject).gtE = 795;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bom)this.fUa.gtC.gtK;
    ((bom)localObject).uYy = paramLong1;
    ((bom)localObject).uhV = paramLong2;
    ((bom)localObject).uKe = System.currentTimeMillis();
    GMTrace.o(11256572411904L, 83868);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11256975065088L, 83871);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11256975065088L, 83871);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11256706629632L, 83869);
    w.i("MicroMsg.NetSceneVoipCSHeartBeat", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(11256706629632L, 83869);
  }
  
  public final int getType()
  {
    GMTrace.i(11256840847360L, 83870);
    GMTrace.o(11256840847360L, 83870);
    return 795;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\b\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */