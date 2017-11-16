package com.tencent.mm.plugin.extqlauncher;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(9030302957568L, 67281);
    GMTrace.o(9030302957568L, 67281);
  }
  
  public o createApplication()
  {
    GMTrace.i(9030571393024L, 67283);
    a locala = new a();
    GMTrace.o(9030571393024L, 67283);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(9030437175296L, 67282);
    b localb = new b();
    GMTrace.o(9030437175296L, 67282);
    return localb;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(9030705610752L, 67284);
    GMTrace.o(9030705610752L, 67284);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\extqlauncher\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */