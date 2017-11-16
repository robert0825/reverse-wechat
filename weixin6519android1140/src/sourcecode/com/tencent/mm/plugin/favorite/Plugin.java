package com.tencent.mm.plugin.favorite;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements com.tencent.mm.pluginsdk.d.c
{
  public Plugin()
  {
    GMTrace.i(6498419736576L, 48417);
    GMTrace.o(6498419736576L, 48417);
  }
  
  public o createApplication()
  {
    GMTrace.i(6498553954304L, 48418);
    c localc = new c();
    GMTrace.o(6498553954304L, 48418);
    return localc;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(6498822389760L, 48420);
    h localh = new h();
    GMTrace.o(6498822389760L, 48420);
    return localh;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(6498688172032L, 48419);
    GMTrace.o(6498688172032L, 48419);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\favorite\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */