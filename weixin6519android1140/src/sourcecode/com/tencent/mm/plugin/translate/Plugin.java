package com.tencent.mm.plugin.translate;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(7275137728512L, 54204);
    GMTrace.o(7275137728512L, 54204);
  }
  
  public o createApplication()
  {
    GMTrace.i(7275271946240L, 54205);
    b localb = new b();
    GMTrace.o(7275271946240L, 54205);
    return localb;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(7275540381696L, 54207);
    a locala = new a();
    GMTrace.o(7275540381696L, 54207);
    return locala;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(7275406163968L, 54206);
    GMTrace.o(7275406163968L, 54206);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\translate\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */