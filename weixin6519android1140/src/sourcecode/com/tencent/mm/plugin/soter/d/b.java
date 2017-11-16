package com.tencent.mm.plugin.soter.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.soter.c.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.vending.g.d.a;
import com.tencent.mm.vending.g.d.b;
import com.tencent.mm.vending.g.g;

public final class b
{
  public static void a(boolean paramBoolean1, boolean paramBoolean2, e parame)
  {
    GMTrace.i(20277077475328L, 151076);
    w.v("MicroMsg.SoterInitManager", "alvinluo isNeedPrepareAsk: %b, isNeedSaveDeviceInfo: %b", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    try
    {
      long l = System.currentTimeMillis();
      g.u(Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2)).b(new a()).b(new c()).b(new d()).a(new d.a() {}).a(new d.b() {});
      GMTrace.o(20277077475328L, 151076);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.SoterInitManager", localException, "alvinluo exception when init soter: %s", new Object[] { localException.getMessage() });
      com.tencent.mm.plugin.soter.c.a.dn(4, 1001);
      if (parame != null) {
        parame.vN(-1);
      }
      GMTrace.o(20277077475328L, 151076);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\soter\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */