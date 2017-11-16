package com.tencent.mm.plugin.appbrand;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

@Deprecated
public final class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(10662793183232L, 79444);
    GMTrace.o(10662793183232L, 79444);
  }
  
  public final o createApplication()
  {
    GMTrace.i(10662927400960L, 79445);
    GMTrace.o(10662927400960L, 79445);
    return null;
  }
  
  public final aq createSubCore()
  {
    GMTrace.i(10663195836416L, 79447);
    e locale = new e();
    GMTrace.o(10663195836416L, 79447);
    return locale;
  }
  
  public final b getContactWidgetFactory()
  {
    GMTrace.i(10663061618688L, 79446);
    GMTrace.o(10663061618688L, 79446);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\appbrand\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */