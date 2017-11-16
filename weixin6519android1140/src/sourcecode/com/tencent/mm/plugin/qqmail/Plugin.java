package com.tencent.mm.plugin.qqmail;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.qqmail.b.w;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public final class Plugin
  implements c
{
  private a nRO;
  
  public Plugin()
  {
    GMTrace.i(5578222993408L, 41561);
    this.nRO = new a();
    GMTrace.o(5578222993408L, 41561);
  }
  
  public final o createApplication()
  {
    GMTrace.i(5578357211136L, 41562);
    com.tencent.mm.plugin.qqmail.a.a locala = new com.tencent.mm.plugin.qqmail.a.a();
    GMTrace.o(5578357211136L, 41562);
    return locala;
  }
  
  public final aq createSubCore()
  {
    GMTrace.i(5578625646592L, 41564);
    w localw = new w();
    GMTrace.o(5578625646592L, 41564);
    return localw;
  }
  
  public final b getContactWidgetFactory()
  {
    GMTrace.i(5578491428864L, 41563);
    a locala = this.nRO;
    GMTrace.o(5578491428864L, 41563);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\qqmail\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */