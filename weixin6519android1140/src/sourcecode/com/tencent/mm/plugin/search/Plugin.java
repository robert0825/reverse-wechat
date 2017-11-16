package com.tencent.mm.plugin.search;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public final class Plugin
  implements com.tencent.mm.pluginsdk.d.c
{
  public Plugin()
  {
    GMTrace.i(11881624371200L, 88525);
    GMTrace.o(11881624371200L, 88525);
  }
  
  public final o createApplication()
  {
    GMTrace.i(11881758588928L, 88526);
    a locala = new a();
    GMTrace.o(11881758588928L, 88526);
    return locala;
  }
  
  public final aq createSubCore()
  {
    GMTrace.i(11881892806656L, 88527);
    com.tencent.mm.plugin.search.a.c localc = new com.tencent.mm.plugin.search.a.c();
    GMTrace.o(11881892806656L, 88527);
    return localc;
  }
  
  public final b getContactWidgetFactory()
  {
    GMTrace.i(11882027024384L, 88528);
    GMTrace.o(11882027024384L, 88528);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\search\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */