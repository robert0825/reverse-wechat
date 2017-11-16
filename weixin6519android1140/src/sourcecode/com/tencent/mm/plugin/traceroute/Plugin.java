package com.tencent.mm.plugin.traceroute;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.traceroute.a.a;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public final class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(9999757606912L, 74504);
    GMTrace.o(9999757606912L, 74504);
  }
  
  public final o createApplication()
  {
    GMTrace.i(9999891824640L, 74505);
    a locala = new a();
    GMTrace.o(9999891824640L, 74505);
    return locala;
  }
  
  public final aq createSubCore()
  {
    GMTrace.i(10000160260096L, 74507);
    GMTrace.o(10000160260096L, 74507);
    return null;
  }
  
  public final b getContactWidgetFactory()
  {
    GMTrace.i(10000026042368L, 74506);
    GMTrace.o(10000026042368L, 74506);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\traceroute\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */