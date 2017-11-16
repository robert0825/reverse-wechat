package com.tencent.mm.plugin.exdevice.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.h.b;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public static void k(long paramLong, int paramInt)
  {
    GMTrace.i(11119401893888L, 82846);
    b localb = ad.atR().wS(String.valueOf(paramLong));
    if (localb == null)
    {
      w.e("MicroMsg.exdevice.BTDeviceReport", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
      GMTrace.o(11119401893888L, 82846);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(localb.field_deviceType).append(',');
    localStringBuilder.append(localb.field_deviceID).append(',');
    localStringBuilder.append(paramInt);
    g.ork.A(11232, localStringBuilder.toString());
    GMTrace.o(11119401893888L, 82846);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\g\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */