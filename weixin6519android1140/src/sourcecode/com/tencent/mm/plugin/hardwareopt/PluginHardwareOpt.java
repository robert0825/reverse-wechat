package com.tencent.mm.plugin.hardwareopt;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.b.d;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.hardwareopt.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.sdk.platformtools.w;

public class PluginHardwareOpt
  extends d
  implements c, b
{
  public PluginHardwareOpt()
  {
    GMTrace.i(18662438207488L, 139046);
    GMTrace.o(18662438207488L, 139046);
  }
  
  public void configure(e parame)
  {
    GMTrace.i(18662840860672L, 139049);
    if (!parame.eR(""))
    {
      GMTrace.o(18662840860672L, 139049);
      return;
    }
    w.v("MicroMsg.PluginHardwareOpt", "hy: on config");
    h.a(com.tencent.mm.plugin.hardwareopt.a.a.a.class, new com.tencent.mm.plugin.hardwareopt.a.a());
    GMTrace.o(18662840860672L, 139049);
  }
  
  public void dependency()
  {
    GMTrace.i(18662706642944L, 139048);
    dependsOn(n.class);
    GMTrace.o(18662706642944L, 139048);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(18662975078400L, 139050);
    if (parame.eR("")) {
      w.i("MicroMsg.PluginHardwareOpt", "hy: on execute. ");
    }
    GMTrace.o(18662975078400L, 139050);
  }
  
  public void installed()
  {
    GMTrace.i(18662572425216L, 139047);
    alias(b.class);
    GMTrace.o(18662572425216L, 139047);
  }
  
  public void onAccountInitialized(e.f paramf)
  {
    GMTrace.i(18663109296128L, 139051);
    w.v("MicroMsg.PluginHardwareOpt", "hy: on onAccountInitialized");
    ((com.tencent.mm.plugin.hardwareopt.a.a.a)h.h(com.tencent.mm.plugin.hardwareopt.a.a.a.class)).fe(false);
    GMTrace.o(18663109296128L, 139051);
  }
  
  public void onAccountRelease()
  {
    GMTrace.i(18663243513856L, 139052);
    w.v("MicroMsg.PluginHardwareOpt", "hy: on onAccountRelease");
    GMTrace.o(18663243513856L, 139052);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\hardwareopt\PluginHardwareOpt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */