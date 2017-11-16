package com.tencent.mm.plugin.remittance;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public final class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(10836470923264L, 80738);
    GMTrace.o(10836470923264L, 80738);
  }
  
  public final o createApplication()
  {
    GMTrace.i(10836605140992L, 80739);
    GMTrace.o(10836605140992L, 80739);
    return null;
  }
  
  public final aq createSubCore()
  {
    GMTrace.i(10836873576448L, 80741);
    com.tencent.mm.plugin.remittance.a.b localb = new com.tencent.mm.plugin.remittance.a.b();
    GMTrace.o(10836873576448L, 80741);
    return localb;
  }
  
  public final com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(10836739358720L, 80740);
    GMTrace.o(10836739358720L, 80740);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\remittance\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */