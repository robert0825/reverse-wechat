package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.protocal.c.adr;
import com.tencent.mm.protocal.c.ads;
import com.tencent.mm.sdk.platformtools.w;

public final class q
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public q()
  {
    GMTrace.i(10941026533376L, 81517);
    this.fUd = null;
    this.fUa = null;
    GMTrace.o(10941026533376L, 81517);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10941429186560L, 81520);
    this.fUd = parame1;
    parame1 = new b.a();
    parame1.gtF = new adr();
    parame1.gtG = new ads();
    parame1.uri = "/cgi-bin/mmbiz-bin/rank/getsportdevicelist";
    parame1.gtE = 1267;
    parame1.gtH = 0;
    parame1.gtI = 0;
    this.fUa = parame1.DA();
    int i = a(parame, this.fUa, this);
    GMTrace.o(10941429186560L, 81520);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10941160751104L, 81518);
    w.i("MicroMsg.exdevice.NetSceneGetSportDeviceList", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(10941160751104L, 81518);
  }
  
  public final int getType()
  {
    GMTrace.i(10941294968832L, 81519);
    GMTrace.o(10941294968832L, 81519);
    return 1267;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */