package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.protocal.c.agx;
import com.tencent.mm.protocal.c.bkg;
import com.tencent.mm.protocal.c.bkh;
import com.tencent.mm.sdk.platformtools.w;

public final class x
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public agx kzZ;
  
  public x(agx paramagx, int paramInt)
  {
    GMTrace.i(10953642999808L, 81611);
    this.kzZ = paramagx;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bkg();
    ((b.a)localObject).gtG = new bkh();
    ((b.a)localObject).gtE = 537;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/unbindharddevice";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bkg)this.fUa.gtC.gtK;
    ((bkg)localObject).tUt = paramagx;
    ((bkg)localObject).tPM = paramInt;
    GMTrace.o(10953642999808L, 81611);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10953911435264L, 81613);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(10953911435264L, 81613);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10954045652992L, 81614);
    w.i("MicroMsg.exdevice.NetSceneUnBindHardDevice", "onGYNetEnd netId = %d, errType= %d, errCode = %d , errMsg =%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = i.kzF;
    i.bB(0L);
    paramq = ad.atR().wT(this.kzZ.jhl);
    if (paramq != null)
    {
      if ((u.aut().kxo != null) && (!u.aut().kxo.bN(paramq.field_mac))) {
        w.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "stopChannel Failed!!!");
      }
      if (!ad.atR().ca(this.kzZ.jhl, this.kzZ.tSz)) {
        w.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "deleteByDeviceId Failed!!!");
      }
      if ((paramInt2 != 0) || (paramInt3 != 0)) {
        w.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "scene.getType() = %s", new Object[] { Integer.valueOf(537) });
      }
      if ((this.fUa == null) || (this.fUa.gtD.gtK == null)) {
        break label261;
      }
    }
    label261:
    for (paramq = (bkh)this.fUa.gtD.gtK;; paramq = null)
    {
      if (paramq == null) {
        w.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "UnbindHardDevice resp or req is null");
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(10954045652992L, 81614);
      return;
      w.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "getByDeviceIdServer Failed!!! DeviceIDServer = %s", new Object[] { this.kzZ.jhl });
      break;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(10953777217536L, 81612);
    GMTrace.o(10953777217536L, 81612);
    return 537;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */