package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.zj;
import com.tencent.mm.protocal.c.zk;
import com.tencent.mm.sdk.platformtools.w;

public final class n
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String country;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public String fjk;
  public String fjl;
  
  public n(double paramDouble1, double paramDouble2)
  {
    GMTrace.i(1352109391872L, 10074);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new zj();
    ((b.a)localObject).gtG = new zk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcurlocation";
    ((b.a)localObject).gtE = 665;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (zj)this.fUa.gtC.gtK;
    ((zj)localObject).tWn = paramDouble1;
    ((zj)localObject).tWm = paramDouble2;
    w.d("MicroMsg.NetSceneGetCurLocation", "latitude:" + paramDouble1 + ", longitude:" + paramDouble2);
    GMTrace.o(1352109391872L, 10074);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1352243609600L, 10075);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1352243609600L, 10075);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1352512045056L, 10077);
    w.d("MicroMsg.NetSceneGetCurLocation", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (zk)this.fUa.gtD.gtK;
      this.fjl = paramq.gCz;
      this.country = paramq.gCG;
      this.fjk = paramq.gCy;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1352512045056L, 10077);
  }
  
  public final int getType()
  {
    GMTrace.i(1352377827328L, 10076);
    GMTrace.o(1352377827328L, 10076);
    return 665;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\modelsimple\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */