package com.tencent.mm.plugin.auto;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(5212077031424L, 38833);
    GMTrace.o(5212077031424L, 38833);
  }
  
  public o createApplication()
  {
    GMTrace.i(5212211249152L, 38834);
    a locala = new a();
    GMTrace.o(5212211249152L, 38834);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(5212479684608L, 38836);
    com.tencent.mm.plugin.auto.a.b localb = new com.tencent.mm.plugin.auto.a.b();
    GMTrace.o(5212479684608L, 38836);
    return localb;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(5212345466880L, 38835);
    GMTrace.o(5212345466880L, 38835);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\auto\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */