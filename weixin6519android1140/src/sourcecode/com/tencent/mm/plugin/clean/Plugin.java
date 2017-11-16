package com.tencent.mm.plugin.clean;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.clean.a.a;
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(7070053040128L, 52676);
    GMTrace.o(7070053040128L, 52676);
  }
  
  public o createApplication()
  {
    GMTrace.i(7070187257856L, 52677);
    a locala = new a();
    GMTrace.o(7070187257856L, 52677);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(7070455693312L, 52679);
    j localj = j.aoj();
    GMTrace.o(7070455693312L, 52679);
    return localj;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(7070321475584L, 52678);
    GMTrace.o(7070321475584L, 52678);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\clean\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */