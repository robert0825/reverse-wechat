package com.tencent.mm.plugin.webwx;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webwx.a.f;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public final class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(7673361727488L, 57171);
    GMTrace.o(7673361727488L, 57171);
  }
  
  public final o createApplication()
  {
    GMTrace.i(7673495945216L, 57172);
    a locala = new a();
    GMTrace.o(7673495945216L, 57172);
    return locala;
  }
  
  public final aq createSubCore()
  {
    GMTrace.i(7673764380672L, 57174);
    f localf = new f();
    GMTrace.o(7673764380672L, 57174);
    return localf;
  }
  
  public final b getContactWidgetFactory()
  {
    GMTrace.i(7673630162944L, 57173);
    GMTrace.o(7673630162944L, 57173);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\webwx\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */