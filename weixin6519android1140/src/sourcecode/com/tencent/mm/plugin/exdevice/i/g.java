package com.tencent.mm.plugin.exdevice.i;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.b.c;
import com.tencent.mm.plugin.exdevice.b.i;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends ae
{
  private c kDU;
  private a kDV;
  
  public g(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    GMTrace.i(11125173256192L, 82889);
    this.kDU = new i(paramArrayOfByte, paramInt, paramLong);
    GMTrace.o(11125173256192L, 82889);
  }
  
  public final boolean a(m paramm, d paramd)
  {
    GMTrace.i(11125307473920L, 82890);
    if (!u.aus().bL(this.kDU.joF))
    {
      w.w("MicroMsg.exdevice.MMPushManufacturerSvrSendDataLogic", "Service push data to device before it do auth, device id = %d", new Object[] { Long.valueOf(this.kDU.joF) });
      GMTrace.o(11125307473920L, 82890);
      return true;
    }
    this.kDV = new a(this.kDU, paramd);
    boolean bool = this.kDV.b(paramm);
    GMTrace.o(11125307473920L, 82890);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\i\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */