package com.tencent.mm.plugin.ext;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(5743579234304L, 42793);
    GMTrace.o(5743579234304L, 42793);
  }
  
  public o createApplication()
  {
    GMTrace.i(5743847669760L, 42795);
    a locala = new a();
    GMTrace.o(5743847669760L, 42795);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(5743713452032L, 42794);
    b localb = new b();
    GMTrace.o(5743713452032L, 42794);
    return localb;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(5743981887488L, 42796);
    GMTrace.o(5743981887488L, 42796);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\ext\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */