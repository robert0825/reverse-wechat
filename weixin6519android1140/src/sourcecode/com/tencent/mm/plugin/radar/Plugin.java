package com.tencent.mm.plugin.radar;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(8930310750208L, 66536);
    GMTrace.o(8930310750208L, 66536);
  }
  
  public o createApplication()
  {
    GMTrace.i(8930444967936L, 66537);
    a locala = new a();
    GMTrace.o(8930444967936L, 66537);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(8930713403392L, 66539);
    b localb = new b();
    GMTrace.o(8930713403392L, 66539);
    return localb;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(8930579185664L, 66538);
    GMTrace.o(8930579185664L, 66538);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\radar\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */