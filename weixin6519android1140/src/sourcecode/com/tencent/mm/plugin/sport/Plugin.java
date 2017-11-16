package com.tencent.mm.plugin.sport;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sport.c.l;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(12541572939776L, 93442);
    GMTrace.o(12541572939776L, 93442);
  }
  
  public o createApplication()
  {
    GMTrace.i(12541707157504L, 93443);
    b localb = new b();
    GMTrace.o(12541707157504L, 93443);
    return localb;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(12541975592960L, 93445);
    l locall = new l();
    GMTrace.o(12541975592960L, 93445);
    return locall;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(12541841375232L, 93444);
    com.tencent.mm.plugin.sport.ui.a.b localb = new com.tencent.mm.plugin.sport.ui.a.b();
    GMTrace.o(12541841375232L, 93444);
    return localb;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sport\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */