package com.tencent.mm.plugin.voip;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.plugin.voip.model.d;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public final class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(5379312320512L, 40079);
    GMTrace.o(5379312320512L, 40079);
  }
  
  public final o createApplication()
  {
    GMTrace.i(5379446538240L, 40080);
    a locala = new a();
    GMTrace.o(5379446538240L, 40080);
    return locala;
  }
  
  public final aq createSubCore()
  {
    GMTrace.i(5379714973696L, 40082);
    d locald = new d();
    GMTrace.o(5379714973696L, 40082);
    return locald;
  }
  
  public final b getContactWidgetFactory()
  {
    GMTrace.i(5379580755968L, 40081);
    GMTrace.o(5379580755968L, 40081);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voip\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */