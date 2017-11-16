package com.tencent.mm.plugin.hardwareopt.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.hardwareopt.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.d;
import com.tencent.mm.vending.g.d.a;
import com.tencent.mm.vending.g.d.b;
import com.tencent.mm.vending.g.e;

public final class a
  implements com.tencent.mm.plugin.hardwareopt.a.a.a
{
  public a()
  {
    GMTrace.i(18663377731584L, 139053);
    GMTrace.o(18663377731584L, 139053);
  }
  
  public final void fe(boolean paramBoolean)
  {
    GMTrace.i(18663511949312L, 139054);
    new e().u(new Object[] { ab.getContext() }).c(new com.tencent.mm.plugin.hardwareopt.c.a()).b(new b(paramBoolean)).a(new d.a()
    {
      public final void aH(Object paramAnonymousObject)
      {
        GMTrace.i(18663780384768L, 139056);
        w.w("MicroMsg.HardwareProvider", "hy: on interrupt.");
        GMTrace.o(18663780384768L, 139056);
      }
    }).a(new d.b() {});
    GMTrace.o(18663511949312L, 139054);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hardwareopt\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */