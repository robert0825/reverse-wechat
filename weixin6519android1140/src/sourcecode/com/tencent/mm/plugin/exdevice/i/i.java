package com.tencent.mm.plugin.exdevice.i;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.b.c;
import com.tencent.mm.plugin.exdevice.b.g;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends ae
{
  private a kDV;
  private g kDX;
  
  public i(int paramInt)
  {
    GMTrace.i(11123831078912L, 82879);
    this.kDX = new g(paramInt);
    GMTrace.o(11123831078912L, 82879);
  }
  
  public final boolean a(m paramm, d paramd)
  {
    GMTrace.i(11123965296640L, 82880);
    if (!u.aus().bL(this.kDX.joF))
    {
      w.w("MicroMsg.exdevice.MMSwitchBackGroudTaskExcuter", "push switch backgroud event to device before it do auth, device id = %d", new Object[] { Long.valueOf(this.kDX.joF) });
      GMTrace.o(11123965296640L, 82880);
      return true;
    }
    this.kDV = new a(this.kDX, paramd);
    boolean bool = this.kDV.b(paramm);
    GMTrace.o(11123965296640L, 82880);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\i\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */