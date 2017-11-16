package com.tencent.mm.plugin.voip_cs;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(11283281739776L, 84067);
    GMTrace.o(11283281739776L, 84067);
  }
  
  public o createApplication()
  {
    GMTrace.i(11283415957504L, 84068);
    GMTrace.o(11283415957504L, 84068);
    return null;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(11283684392960L, 84070);
    com.tencent.mm.plugin.voip_cs.b.b localb = new com.tencent.mm.plugin.voip_cs.b.b();
    GMTrace.o(11283684392960L, 84070);
    return localb;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(11283550175232L, 84069);
    GMTrace.o(11283550175232L, 84069);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */