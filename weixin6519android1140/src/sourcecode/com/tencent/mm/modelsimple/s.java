package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.adf;
import com.tencent.mm.protocal.c.adg;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class s
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  public final b gTY;
  
  public s()
  {
    GMTrace.i(1346203811840L, 10030);
    b.a locala = new b.a();
    locala.gtF = new adf();
    locala.gtG = new adg();
    locala.uri = "/cgi-bin/micromsg-bin/getresourcecontrolinfo";
    locala.gtE = 725;
    locala.gtH = 0;
    locala.gtI = 0;
    this.gTY = locala.DA();
    ((adf)this.gTY.gtC.gtK).jib = 0;
    w.i("MicroMsg.NetSceneGetResourceControlInfo", "summerupdate GetResourceControlInfo type[%d], stack[%s]", new Object[] { Integer.valueOf(0), bg.bQW() });
    GMTrace.o(1346203811840L, 10030);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1346606465024L, 10033);
    this.fUd = parame1;
    g.ork.a(405L, 1L, 1L, true);
    int i = a(parame, this.gTY, this);
    GMTrace.o(1346606465024L, 10033);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1346338029568L, 10031);
    w.i("MicroMsg.NetSceneGetResourceControlInfo", "summerupdate GetResourceControlInfo onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      g.ork.a(405L, 2L, 1L, true);
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1346338029568L, 10031);
  }
  
  public final int getType()
  {
    GMTrace.i(1346472247296L, 10032);
    GMTrace.o(1346472247296L, 10032);
    return 725;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\modelsimple\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */