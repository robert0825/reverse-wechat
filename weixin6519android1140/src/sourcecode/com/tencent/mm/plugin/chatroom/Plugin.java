package com.tencent.mm.plugin.chatroom;

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
    GMTrace.i(9170694701056L, 68327);
    GMTrace.o(9170694701056L, 68327);
  }
  
  public o createApplication()
  {
    GMTrace.i(9170828918784L, 68328);
    a locala = new a();
    GMTrace.o(9170828918784L, 68328);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(9171097354240L, 68330);
    d locald = new d();
    GMTrace.o(9171097354240L, 68330);
    return locald;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(9170963136512L, 68329);
    GMTrace.o(9170963136512L, 68329);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */