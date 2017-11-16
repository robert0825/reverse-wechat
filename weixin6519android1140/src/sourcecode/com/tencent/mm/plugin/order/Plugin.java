package com.tencent.mm.plugin.order;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(6664178630656L, 49652);
    GMTrace.o(6664178630656L, 49652);
  }
  
  public o createApplication()
  {
    GMTrace.i(6664312848384L, 49653);
    GMTrace.o(6664312848384L, 49653);
    return null;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(6664581283840L, 49655);
    com.tencent.mm.plugin.order.a.b localb = new com.tencent.mm.plugin.order.a.b();
    GMTrace.o(6664581283840L, 49655);
    return localb;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(6664447066112L, 49654);
    GMTrace.o(6664447066112L, 49654);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\order\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */