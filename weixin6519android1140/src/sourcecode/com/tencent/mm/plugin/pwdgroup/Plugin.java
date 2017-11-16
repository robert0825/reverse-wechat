package com.tencent.mm.plugin.pwdgroup;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public final class Plugin
  implements com.tencent.mm.pluginsdk.d.c
{
  public Plugin()
  {
    GMTrace.i(10712990613504L, 79818);
    GMTrace.o(10712990613504L, 79818);
  }
  
  public final o createApplication()
  {
    GMTrace.i(10713124831232L, 79819);
    a locala = new a();
    GMTrace.o(10713124831232L, 79819);
    return locala;
  }
  
  public final aq createSubCore()
  {
    GMTrace.i(10713393266688L, 79821);
    c localc = new c();
    GMTrace.o(10713393266688L, 79821);
    return localc;
  }
  
  public final b getContactWidgetFactory()
  {
    GMTrace.i(10713259048960L, 79820);
    GMTrace.o(10713259048960L, 79820);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\pwdgroup\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */