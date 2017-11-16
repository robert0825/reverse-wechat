package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.xw;
import com.tencent.mm.protocal.c.xx;
import com.tencent.mm.sdk.platformtools.w;

public final class o
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public o()
  {
    GMTrace.i(10941563404288L, 81521);
    this.fUd = null;
    this.fUa = null;
    b.a locala = new b.a();
    locala.gtF = new xw();
    locala.gtG = new xx();
    locala.uri = "/cgi-bin/micromsg-bin/getboundharddevices";
    locala.gtE = 539;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((xw)this.fUa.gtC.gtK).jia = 1;
    GMTrace.o(10941563404288L, 81521);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10941966057472L, 81524);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(10941966057472L, 81524);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10941697622016L, 81522);
    w.i("MicroMsg.exdevice.NetSceneGetBoundHardDevices", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(10941697622016L, 81522);
  }
  
  public final int getType()
  {
    GMTrace.i(10941831839744L, 81523);
    GMTrace.o(10941831839744L, 81523);
    return 539;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */