package com.tencent.mm.plugin.webview;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.a.a;
import com.tencent.mm.plugin.webview.modeltools.f;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(12474329858048L, 92941);
    GMTrace.o(12474329858048L, 92941);
  }
  
  public o createApplication()
  {
    GMTrace.i(12474464075776L, 92942);
    a locala = new a();
    GMTrace.o(12474464075776L, 92942);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(12474732511232L, 92944);
    f localf = new f();
    GMTrace.o(12474732511232L, 92944);
    return localf;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(12474598293504L, 92943);
    GMTrace.o(12474598293504L, 92943);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */