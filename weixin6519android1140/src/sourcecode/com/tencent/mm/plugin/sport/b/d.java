package com.tencent.mm.plugin.sport.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class d
{
  public static final void nU(int paramInt)
  {
    GMTrace.i(16743930003456L, 124752);
    w.v("MicroMsg.Sport.SportReportLogic", "report action=%d", new Object[] { Integer.valueOf(paramInt) });
    com.tencent.mm.plugin.report.d.oqe.i(13168, new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(16743930003456L, 124752);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\sport\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */