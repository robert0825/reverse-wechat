package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.protocal.c.agx;
import com.tencent.mm.protocal.c.gp;
import com.tencent.mm.protocal.c.gq;
import com.tencent.mm.sdk.platformtools.w;

public final class m
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private String kzR;
  private long kzS;
  private String kzT;
  private long kzU;
  
  public m(long paramLong1, String paramString1, String paramString2, long paramLong2)
  {
    GMTrace.i(10966259466240L, 81705);
    this.kzS = paramLong1;
    this.kzT = paramString1;
    this.kzR = paramString2;
    this.kzU = paramLong2;
    GMTrace.o(10966259466240L, 81705);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10966662119424L, 81708);
    this.fUd = parame1;
    parame1 = new b.a();
    parame1.gtF = new gp();
    parame1.gtG = new gq();
    parame1.uri = "/cgi-bin/mmoc-bin/hardware/bindunauthdevice";
    parame1.gtE = 1262;
    parame1.gtH = 0;
    parame1.gtI = 0;
    this.fUa = parame1.DA();
    parame1 = (gp)this.fUa.gtC.gtK;
    parame1.mac = com.tencent.mm.plugin.exdevice.j.b.bT(this.kzS);
    parame1.tVo = this.kzT;
    parame1.tVn = this.kzR;
    parame1.tVp = this.kzU;
    int i = a(parame, this.fUa, this);
    GMTrace.o(10966662119424L, 81708);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10966393683968L, 81706);
    w.i("MicroMsg.NetSceneBindUnauthDevice", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    gq localgq;
    agx localagx;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      localgq = (gq)this.fUa.gtD.gtK;
      localagx = localgq.tUt;
      paramArrayOfByte = null;
      paramq = null;
      if (localagx != null)
      {
        paramArrayOfByte = localagx.jhl;
        paramq = localagx.tSz;
      }
      w.d("MicroMsg.NetSceneBindUnauthDevice", "unauth bind deviceId = %s, deviceType = %s", new Object[] { paramArrayOfByte, paramq });
      if (ad.atR().bZ(paramq, paramArrayOfByte) == null) {
        break label295;
      }
      boolean bool = ad.atR().ca(paramArrayOfByte, paramq);
      w.i("MicroMsg.NetSceneBindUnauthDevice", "delete local deviceinfo : %s, ret : %b", new Object[] { paramq, Boolean.valueOf(bool) });
      if (!bool) {
        break label312;
      }
      paramInt1 = 1;
    }
    for (;;)
    {
      paramq = new com.tencent.mm.plugin.exdevice.h.b();
      paramq.field_connProto = this.kzR;
      paramq.field_connStrategy = 1;
      paramq.field_closeStrategy = 1;
      paramq.field_url = "";
      f.a(paramq, localagx, localgq.tUu);
      if (paramq.field_mac == 0L)
      {
        w.d("MicroMsg.NetSceneBindUnauthDevice", "onSceneEnd, mac of hardDeviceAttr is 0 so set a local mac.");
        paramq.field_mac = this.kzS;
      }
      if (paramInt1 != 0) {
        ad.atR().b(paramq);
      }
      for (;;)
      {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(10966393683968L, 81706);
        return;
        label295:
        paramInt1 = 1;
        break;
        ad.atR().e(paramq);
      }
      label312:
      paramInt1 = 0;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(10966527901696L, 81707);
    GMTrace.o(10966527901696L, 81707);
    return 1262;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */