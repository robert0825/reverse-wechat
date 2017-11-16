package com.tencent.mm.plugin.record;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.record.a.s;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public final class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(7562632101888L, 56346);
    GMTrace.o(7562632101888L, 56346);
  }
  
  public final o createApplication()
  {
    GMTrace.i(7562766319616L, 56347);
    a locala = new a();
    GMTrace.o(7562766319616L, 56347);
    return locala;
  }
  
  public final aq createSubCore()
  {
    GMTrace.i(7563034755072L, 56349);
    s locals = new s();
    GMTrace.o(7563034755072L, 56349);
    return locals;
  }
  
  public final b getContactWidgetFactory()
  {
    GMTrace.i(7562900537344L, 56348);
    GMTrace.o(7562900537344L, 56348);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\record\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */