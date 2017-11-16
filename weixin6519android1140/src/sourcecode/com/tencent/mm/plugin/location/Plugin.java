package com.tencent.mm.plugin.location;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.location.model.l;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(9725282353152L, 72459);
    GMTrace.o(9725282353152L, 72459);
  }
  
  public o createApplication()
  {
    GMTrace.i(9725416570880L, 72460);
    a locala = new a();
    GMTrace.o(9725416570880L, 72460);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(9725685006336L, 72462);
    l locall = new l();
    GMTrace.o(9725685006336L, 72462);
    return locall;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(9725550788608L, 72461);
    GMTrace.o(9725550788608L, 72461);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\location\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */