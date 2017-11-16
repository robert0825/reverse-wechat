package com.tencent.mm.plugin.hp;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.hp.b.d;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(5756866789376L, 42892);
    GMTrace.o(5756866789376L, 42892);
  }
  
  public o createApplication()
  {
    GMTrace.i(5757001007104L, 42893);
    a locala = new a();
    GMTrace.o(5757001007104L, 42893);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(5757269442560L, 42895);
    d locald = new d();
    GMTrace.o(5757269442560L, 42895);
    return locald;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(5757135224832L, 42894);
    GMTrace.o(5757135224832L, 42894);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\hp\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */