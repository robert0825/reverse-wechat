package com.tencent.mm.plugin.card;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(5100139446272L, 37999);
    GMTrace.o(5100139446272L, 37999);
  }
  
  public o createApplication()
  {
    GMTrace.i(5100273664000L, 38000);
    a locala = new a();
    GMTrace.o(5100273664000L, 38000);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(5100542099456L, 38002);
    al localal = new al();
    GMTrace.o(5100542099456L, 38002);
    return localal;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(5100407881728L, 38001);
    GMTrace.o(5100407881728L, 38001);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\card\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */