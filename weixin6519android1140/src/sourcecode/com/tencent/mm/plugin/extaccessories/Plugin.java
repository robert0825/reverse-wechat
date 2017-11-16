package com.tencent.mm.plugin.extaccessories;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(11210267295744L, 83523);
    GMTrace.o(11210267295744L, 83523);
  }
  
  public o createApplication()
  {
    GMTrace.i(11210401513472L, 83524);
    a locala = new a();
    GMTrace.o(11210401513472L, 83524);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(11210669948928L, 83526);
    b localb = new b();
    GMTrace.o(11210669948928L, 83526);
    return localb;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(11210535731200L, 83525);
    GMTrace.o(11210535731200L, 83525);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\extaccessories\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */