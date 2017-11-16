package com.tencent.mm.plugin.exdevice.i;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.b.f;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.sdk.platformtools.w;

public final class h
  extends ae
{
  private a kDW;
  private f kxf;
  
  public h(f paramf)
  {
    GMTrace.i(11121549377536L, 82862);
    this.kxf = paramf;
    GMTrace.o(11121549377536L, 82862);
  }
  
  public final boolean a(m paramm, d paramd)
  {
    GMTrace.i(11121683595264L, 82863);
    this.kDW = new a(this.kxf, paramd);
    boolean bool = this.kDW.b(paramm);
    w.i("MicroMsg.exdevice.MMSendDataToDeviceExcuter", "send data to devide : %b", new Object[] { Boolean.valueOf(bool) });
    GMTrace.o(11121683595264L, 82863);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\i\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */