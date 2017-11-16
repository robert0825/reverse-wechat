package com.tencent.mm.plugin.nearlife;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.nearlife.a.a;
import com.tencent.mm.plugin.nearlife.b.d;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(12568148049920L, 93640);
    GMTrace.o(12568148049920L, 93640);
  }
  
  public o createApplication()
  {
    GMTrace.i(12568282267648L, 93641);
    a locala = new a();
    GMTrace.o(12568282267648L, 93641);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(12568550703104L, 93643);
    d locald = new d();
    GMTrace.o(12568550703104L, 93643);
    return locald;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(12568416485376L, 93642);
    GMTrace.o(12568416485376L, 93642);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearlife\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */