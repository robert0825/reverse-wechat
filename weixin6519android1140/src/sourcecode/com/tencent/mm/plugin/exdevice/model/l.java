package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.plugin.exdevice.service.f.a;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.protocal.c.agx;
import com.tencent.mm.protocal.c.agy;
import com.tencent.mm.protocal.c.gh;
import com.tencent.mm.protocal.c.gi;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class l
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public l(String paramString, int paramInt)
  {
    GMTrace.i(10971762393088L, 81746);
    this.fUd = null;
    this.fUa = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new gh();
    ((b.a)localObject).gtG = new gi();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bindharddevice";
    ((b.a)localObject).gtE = 536;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (gh)this.fUa.gtC.gtK;
    ((gh)localObject).tTZ = bg.nl(paramString);
    ((gh)localObject).tUs = bg.e(Integer.valueOf(paramInt));
    GMTrace.o(10971762393088L, 81746);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10972299264000L, 81750);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(10972299264000L, 81750);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10971896610816L, 81747);
    w.i("MicroMsg.exdevice.NetSceneBindHardDevice", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    label292:
    long l;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = atK();
      w.i("MicroMsg.exdevice.NetSceneBindHardDevice", "hardDevice : DeviceIdServer = %s, DeviceType = %s", new Object[] { paramArrayOfByte.tUt.jhl, paramArrayOfByte.tUt.tSz });
      String str1 = paramArrayOfByte.tUu.tSi;
      String str2 = paramArrayOfByte.tUu.uwj;
      String str3 = paramArrayOfByte.tUu.tTU;
      String str4 = paramArrayOfByte.tUu.uwk;
      paramInt1 = paramArrayOfByte.tUu.uwl;
      if (paramArrayOfByte.tPM != 0) {
        break label468;
      }
      paramq = "sync";
      w.i("MicroMsg.exdevice.NetSceneBindHardDevice", "hardDeviceAttr : AuthKey = %s, BrandName = %s, Mac = %s, connProto = %s, ConnStrategy = %s, bindFlag = %s", new Object[] { str1, str2, str3, str4, Integer.valueOf(paramInt1), paramq });
      paramInt1 = 0;
      if (ad.atR().bZ(paramArrayOfByte.tUu.uwj, paramArrayOfByte.tUt.jhl) == null) {
        break label476;
      }
      boolean bool = ad.atR().ca(paramArrayOfByte.tUt.jhl, paramArrayOfByte.tUu.uwj);
      w.i("MicroMsg.exdevice.NetSceneBindHardDevice", "delete local deviceinfo : %s, ret : %b", new Object[] { paramArrayOfByte.tUu.uwj, Boolean.valueOf(bool) });
      if (bool) {
        paramInt1 = 1;
      }
      paramq = new com.tencent.mm.plugin.exdevice.h.b();
      f.a(paramq, paramArrayOfByte.tUt, paramArrayOfByte.tUu);
      paramq.field_url = "";
      paramArrayOfByte = u.aus().bH(paramq.field_mac);
      if ((paramArrayOfByte != null) && (paramArrayOfByte.eFl == 2))
      {
        w.i("MicroMsg.exdevice.NetSceneBindHardDevice", "before do bind netscene, stop the channel now");
        ad.atY();
        d.bv(paramq.field_mac);
        paramArrayOfByte = u.aus();
        l = paramq.field_mac;
        if (!paramArrayOfByte.kDb.containsKey(Long.valueOf(l))) {
          break label481;
        }
        paramArrayOfByte.kDb.remove(Long.valueOf(l));
        w.i("MicroMsg.exdevice.ExdeviceInfoManager", "remove the device from map : %d", new Object[] { Long.valueOf(l) });
      }
      label432:
      if (paramInt1 == 0) {
        break label505;
      }
      ad.atR().b(paramq);
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(10971896610816L, 81747);
      return;
      label468:
      paramq = "async";
      break;
      label476:
      paramInt1 = 1;
      break label292;
      label481:
      w.i("MicroMsg.exdevice.ExdeviceInfoManager", "device id not contains in the map : %d", new Object[] { Long.valueOf(l) });
      break label432;
      label505:
      ad.atR().e(paramq);
    }
  }
  
  public final gi atK()
  {
    GMTrace.i(10972165046272L, 81749);
    if ((this.fUa != null) && (this.fUa.gtD.gtK != null))
    {
      gi localgi = (gi)this.fUa.gtD.gtK;
      GMTrace.o(10972165046272L, 81749);
      return localgi;
    }
    GMTrace.o(10972165046272L, 81749);
    return null;
  }
  
  public final int getType()
  {
    GMTrace.i(10972030828544L, 81748);
    GMTrace.o(10972030828544L, 81748);
    return 536;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */