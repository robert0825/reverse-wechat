package com.tencent.mm.plugin.backup;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(9576032239616L, 71347);
    GMTrace.o(9576032239616L, 71347);
  }
  
  public o createApplication()
  {
    GMTrace.i(9576166457344L, 71348);
    a locala = new a();
    GMTrace.o(9576166457344L, 71348);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(9576434892800L, 71350);
    com.tencent.mm.plugin.backup.i.a locala = com.tencent.mm.plugin.backup.i.a.agG();
    GMTrace.o(9576434892800L, 71350);
    return locala;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(9576300675072L, 71349);
    GMTrace.o(9576300675072L, 71349);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\backup\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */