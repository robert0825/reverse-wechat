package com.tencent.mm.plugin.wenote;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public final class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(5705327181824L, 42508);
    GMTrace.o(5705327181824L, 42508);
  }
  
  public final o createApplication()
  {
    GMTrace.i(5705461399552L, 42509);
    a locala = new a();
    GMTrace.o(5705461399552L, 42509);
    return locala;
  }
  
  public final aq createSubCore()
  {
    GMTrace.i(5705729835008L, 42511);
    com.tencent.mm.plugin.wenote.model.b localb = new com.tencent.mm.plugin.wenote.model.b();
    GMTrace.o(5705729835008L, 42511);
    return localb;
  }
  
  public final com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(5705595617280L, 42510);
    GMTrace.o(5705595617280L, 42510);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wenote\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */