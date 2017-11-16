package com.tencent.mm.plugin.appbrand.compat;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ae;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.plugin.appbrand.compat.a.f;
import com.tencent.mm.plugin.appbrand.compat.a.g;
import com.tencent.mm.plugin.appbrand.jsapi.k.c.a;

@android.support.a.a
public final class PluginAppBrandCompat
  extends com.tencent.mm.kernel.b.d
  implements com.tencent.mm.kernel.api.c, f
{
  private final com.tencent.mm.sdk.b.c hPq;
  
  public PluginAppBrandCompat()
  {
    GMTrace.i(19491232677888L, 145221);
    this.hPq = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(19491232677888L, 145221);
  }
  
  public final void configure(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(19491501113344L, 145223);
    GMTrace.o(19491501113344L, 145223);
  }
  
  public final void execute(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(19491635331072L, 145224);
    if (parame.eR(""))
    {
      com.tencent.mm.kernel.h.a(g.class, new com.tencent.mm.kernel.c.d(new com.tencent.mm.plugin.appbrand.j.d()));
      com.tencent.mm.kernel.h.a(com.tencent.mm.plugin.appbrand.compat.a.e.class, new com.tencent.mm.kernel.c.d(new b()));
      com.tencent.mm.kernel.h.xz().a(new com.tencent.mm.kernel.api.h()
      {
        public final void as(boolean paramAnonymousBoolean)
        {
          GMTrace.i(19481032130560L, 145145);
          GMTrace.o(19481032130560L, 145145);
        }
        
        public final void pe()
        {
          GMTrace.i(19480897912832L, 145144);
          com.tencent.mm.plugin.appbrand.ui.banner.c.abe();
          GMTrace.o(19480897912832L, 145144);
        }
      });
    }
    for (;;)
    {
      com.tencent.mm.kernel.h.a(com.tencent.mm.plugin.appbrand.compat.a.d.class, new com.tencent.mm.kernel.c.d(new m()));
      com.tencent.mm.kernel.h.a(com.tencent.mm.plugin.appbrand.compat.a.a.class, new com.tencent.mm.kernel.c.d(new a()));
      com.tencent.mm.kernel.h.a(com.tencent.mm.plugin.appbrand.compat.a.c.class, new com.tencent.mm.kernel.c.d(new k()));
      GMTrace.o(19491635331072L, 145224);
      return;
      com.tencent.mm.kernel.h.a(c.a.class, new com.tencent.mm.kernel.c.d(new com.tencent.mm.plugin.appbrand.jsapi.k.d()));
    }
  }
  
  public final void installed()
  {
    GMTrace.i(19491366895616L, 145222);
    super.installed();
    alias(f.class);
    GMTrace.o(19491366895616L, 145222);
  }
  
  public final void onAccountInitialized(e.f paramf)
  {
    GMTrace.i(19491769548800L, 145225);
    this.hPq.bPu();
    GMTrace.o(19491769548800L, 145225);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(19491903766528L, 145226);
    this.hPq.dead();
    GMTrace.o(19491903766528L, 145226);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\compat\PluginAppBrandCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */