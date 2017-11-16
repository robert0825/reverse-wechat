package com.tencent.mm.plugin.nfc;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public static void bz(String paramString, int paramInt)
  {
    GMTrace.i(20986955038720L, 156365);
    w.i("MicroMsg.HCEReportManager", "alvinluo reportStartHCEResult appId: %s, result: %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    g.ork.i(14837, new Object[] { paramString, Integer.valueOf(paramInt) });
    GMTrace.o(20986955038720L, 156365);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\nfc\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */