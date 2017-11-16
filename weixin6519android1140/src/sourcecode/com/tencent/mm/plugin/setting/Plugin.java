package com.tencent.mm.plugin.setting;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;

public final class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(4736812056576L, 35292);
    w.i("MicroMsg.Plugin.setting", "setting constructor " + System.currentTimeMillis());
    GMTrace.o(4736812056576L, 35292);
  }
  
  public final o createApplication()
  {
    GMTrace.i(4736946274304L, 35293);
    w.i("MicroMsg.Plugin.setting", "setting createApplication " + System.currentTimeMillis());
    a locala = new a();
    GMTrace.o(4736946274304L, 35293);
    return locala;
  }
  
  public final aq createSubCore()
  {
    GMTrace.i(4737214709760L, 35295);
    w.i("MicroMsg.Plugin.setting", "setting createSubCore " + System.currentTimeMillis());
    b localb = new b();
    GMTrace.o(4737214709760L, 35295);
    return localb;
  }
  
  public final com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(4737080492032L, 35294);
    w.i("MicroMsg.Plugin.setting", "setting getContactWidgetFactory " + System.currentTimeMillis());
    GMTrace.o(4737080492032L, 35294);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\setting\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */