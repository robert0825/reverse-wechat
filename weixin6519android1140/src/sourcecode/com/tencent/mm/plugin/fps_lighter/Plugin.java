package com.tencent.mm.plugin.fps_lighter;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fps_lighter.b.g;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(5233551867904L, 38993);
    GMTrace.o(5233551867904L, 38993);
  }
  
  public o createApplication()
  {
    GMTrace.i(5233686085632L, 38994);
    a locala = new a();
    GMTrace.o(5233686085632L, 38994);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(5233954521088L, 38996);
    w.d("MicroMsg.FPSLighterCore.Plugin", "[createSubCore]");
    g localg = new g();
    GMTrace.o(5233954521088L, 38996);
    return localg;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(5233820303360L, 38995);
    GMTrace.o(5233820303360L, 38995);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\fps_lighter\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */