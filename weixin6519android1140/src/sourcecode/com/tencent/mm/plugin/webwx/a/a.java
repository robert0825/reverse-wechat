package com.tencent.mm.plugin.webwx.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.sa;
import com.tencent.mm.protocal.c.sb;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public int eHz;
  private com.tencent.mm.ad.e fUd;
  private final b gMj;
  
  public a(int paramInt)
  {
    GMTrace.i(7659805736960L, 57070);
    this.eHz = paramInt;
    b.a locala = new b.a();
    sa localsa = new sa();
    sb localsb = new sb();
    locala.gtF = localsa;
    locala.gtG = localsb;
    locala.uri = "/cgi-bin/micromsg-bin/extdevicecontrol";
    locala.gtE = 792;
    locala.gtH = 0;
    locala.gtI = 0;
    localsa.lQF = paramInt;
    localsa.uig = 1;
    this.gMj = locala.DA();
    GMTrace.o(7659805736960L, 57070);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7660208390144L, 57073);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(7660208390144L, 57073);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7659939954688L, 57071);
    w.d("MicroMsg.NetSceneExtDeviceControl", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " errMsg:" + paramString);
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(7659939954688L, 57071);
  }
  
  public final int getType()
  {
    GMTrace.i(7660074172416L, 57072);
    GMTrace.o(7660074172416L, 57072);
    return 792;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webwx\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */