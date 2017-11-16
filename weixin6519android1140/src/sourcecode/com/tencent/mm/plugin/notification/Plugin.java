package com.tencent.mm.plugin.notification;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.notification.d.e;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  a nyh;
  
  public Plugin()
  {
    GMTrace.i(10738223546368L, 80006);
    this.nyh = new a();
    GMTrace.o(10738223546368L, 80006);
  }
  
  public o createApplication()
  {
    GMTrace.i(10738357764096L, 80007);
    a locala = this.nyh;
    GMTrace.o(10738357764096L, 80007);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(10738626199552L, 80009);
    e locale = e.aUS();
    GMTrace.o(10738626199552L, 80009);
    return locale;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(10738491981824L, 80008);
    GMTrace.o(10738491981824L, 80008);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\notification\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */