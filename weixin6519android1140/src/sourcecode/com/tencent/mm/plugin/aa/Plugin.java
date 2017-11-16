package com.tencent.mm.plugin.aa;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(5653653356544L, 42123);
    GMTrace.o(5653653356544L, 42123);
  }
  
  public o createApplication()
  {
    GMTrace.i(5653787574272L, 42124);
    a locala = new a();
    GMTrace.o(5653787574272L, 42124);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(5654056009728L, 42126);
    b localb = new b();
    GMTrace.o(5654056009728L, 42126);
    return localb;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(5653921792000L, 42125);
    GMTrace.o(5653921792000L, 42125);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\aa\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */