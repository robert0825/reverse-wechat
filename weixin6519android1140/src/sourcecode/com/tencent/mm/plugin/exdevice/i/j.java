package com.tencent.mm.plugin.exdevice.i;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.b.c;
import com.tencent.mm.plugin.exdevice.b.h;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends ae
{
  private a kDY;
  private h kDZ;
  
  public j(int paramInt1, int paramInt2, long paramLong)
  {
    GMTrace.i(11124770603008L, 82886);
    this.kDZ = new h(paramInt1, paramInt2, paramLong);
    GMTrace.o(11124770603008L, 82886);
  }
  
  public final boolean a(m paramm, d paramd)
  {
    GMTrace.i(11124904820736L, 82887);
    if (!u.aus().bL(this.kDZ.joF))
    {
      w.w("MicroMsg.exdevice.MMSwitchViewPushTaskExcuter", "push switchview event to device before it do auth, device id = %d", new Object[] { Long.valueOf(this.kDZ.joF) });
      GMTrace.o(11124904820736L, 82887);
      return true;
    }
    this.kDY = new b(this.kDZ, paramd);
    boolean bool = this.kDY.b(paramm);
    GMTrace.o(11124904820736L, 82887);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\i\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */