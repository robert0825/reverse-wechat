package com.tencent.mm.plugin.subapp;

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
    GMTrace.i(5850148110336L, 43587);
    w.i("MicroMsg.Plugin.subapp", "subapp constructor " + System.currentTimeMillis());
    GMTrace.o(5850148110336L, 43587);
  }
  
  public final o createApplication()
  {
    GMTrace.i(5850282328064L, 43588);
    w.i("MicroMsg.Plugin.subapp", "subapp createApplication " + System.currentTimeMillis());
    b localb = new b();
    GMTrace.o(5850282328064L, 43588);
    return localb;
  }
  
  public final aq createSubCore()
  {
    GMTrace.i(5850550763520L, 43590);
    w.i("MicroMsg.Plugin.subapp", "subapp createSubCore " + System.currentTimeMillis());
    a locala = new a();
    GMTrace.o(5850550763520L, 43590);
    return locala;
  }
  
  public final com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(5850416545792L, 43589);
    w.i("MicroMsg.Plugin.subapp", "subapp getContactWidgetFactory " + System.currentTimeMillis());
    GMTrace.o(5850416545792L, 43589);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\subapp\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */