package com.tencent.mm.plugin.exdevice.service;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.k;
import com.tencent.mm.sdk.platformtools.w;

public final class d
{
  public static boolean cl(Context paramContext)
  {
    GMTrace.i(11174833815552L, 83259);
    if (k.aS(paramContext))
    {
      w.i("MicroMsg.exdevice.ExDeviceServiceHelper", "fully exited, no need to start service");
      GMTrace.o(11174833815552L, 83259);
      return false;
    }
    Intent localIntent = new Intent(paramContext, ExDeviceService.class);
    localIntent.setFlags(268435456);
    paramContext.startService(localIntent);
    GMTrace.o(11174833815552L, 83259);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */