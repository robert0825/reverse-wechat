package com.tencent.mm.plugin.tmassistant;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(12852689633280L, 95760);
    GMTrace.o(12852689633280L, 95760);
  }
  
  public o createApplication()
  {
    GMTrace.i(12852823851008L, 95761);
    GMTrace.o(12852823851008L, 95761);
    return null;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(12853092286464L, 95763);
    com.tencent.mm.plugin.tmassistant.a.b localb = new com.tencent.mm.plugin.tmassistant.a.b();
    GMTrace.o(12853092286464L, 95763);
    return localb;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(12852958068736L, 95762);
    GMTrace.o(12852958068736L, 95762);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\tmassistant\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */