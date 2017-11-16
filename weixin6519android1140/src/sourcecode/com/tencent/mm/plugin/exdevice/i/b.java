package com.tencent.mm.plugin.exdevice.i;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.b.h;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends a
  implements d
{
  private final d kDP;
  
  public b(com.tencent.mm.plugin.exdevice.b.c paramc, d paramd)
  {
    super(paramc, paramd);
    GMTrace.i(11122354683904L, 82868);
    a(this);
    this.kDP = paramd;
    GMTrace.o(11122354683904L, 82868);
  }
  
  public final void a(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(11122488901632L, 82869);
    w.i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "onTaskSceneEnd, SwitchViewPush taskId = %d, errType = %d, errCode = %d, errMsg = %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    com.tencent.mm.plugin.exdevice.h.b localb;
    if (2 == ((h)this.kDM).atr())
    {
      w.i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "Switch view push has been sended to device, now try to check close strategy");
      localb = ad.atR().wS(this.kDM.joF);
      if (localb == null)
      {
        w.e("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "get hdinfo by mac failed!!!, Mac = %d", new Object[] { Long.valueOf(this.kDM.joF) });
        if (this.kDP != null) {
          this.kDP.a(paramLong, paramInt1, paramInt2, paramString);
        }
        GMTrace.o(11122488901632L, 82869);
        return;
      }
      switch (localb.field_closeStrategy)
      {
      default: 
        w.e("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "Error close strategy(%d)", new Object[] { Integer.valueOf(localb.field_closeStrategy) });
      }
    }
    for (;;)
    {
      if (this.kDP != null) {
        this.kDP.a(paramLong, paramInt1, paramInt2, paramString);
      }
      GMTrace.o(11122488901632L, 82869);
      return;
      w.i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "the close Strategy is %d, stop channel(device id = %d)", new Object[] { Integer.valueOf(localb.field_closeStrategy), Long.valueOf(this.kDM.joF) });
      if (u.aut().kxo != null)
      {
        u.aut().kxo.bN(this.kDM.joF);
        continue;
        w.i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "the close Strategy is %d, Record it(%d) in the shut down device list", new Object[] { Integer.valueOf(localb.field_closeStrategy), Long.valueOf(this.kDM.joF) });
        if (!com.tencent.mm.plugin.exdevice.h.a.u("shut_down_device", this.kDM.joF)) {
          w.e("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "MMExDeviceCore.getDeviceInfoManager().addShutDownDevice failed!!!");
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\i\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */