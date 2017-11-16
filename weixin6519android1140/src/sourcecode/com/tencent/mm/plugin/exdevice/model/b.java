package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  implements e
{
  public b()
  {
    GMTrace.i(10946261024768L, 81556);
    GMTrace.o(10946261024768L, 81556);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(10946395242496L, 81557);
    w.i("MicroMsg.exdevice.ExDeviceMessageService", "onScenend, errType = %d, errCode = %d, errMsg = ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    GMTrace.o(10946395242496L, 81557);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */