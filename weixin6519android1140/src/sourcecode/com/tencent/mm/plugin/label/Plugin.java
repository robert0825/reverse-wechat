package com.tencent.mm.plugin.label;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public final class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(7321308626944L, 54548);
    GMTrace.o(7321308626944L, 54548);
  }
  
  public final o createApplication()
  {
    GMTrace.i(7321442844672L, 54549);
    a locala = new a();
    GMTrace.o(7321442844672L, 54549);
    return locala;
  }
  
  public final aq createSubCore()
  {
    GMTrace.i(7321711280128L, 54551);
    e locale = new e();
    GMTrace.o(7321711280128L, 54551);
    return locale;
  }
  
  public final b getContactWidgetFactory()
  {
    GMTrace.i(7321577062400L, 54550);
    GMTrace.o(7321577062400L, 54550);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\label\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */