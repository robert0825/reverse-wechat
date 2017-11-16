package com.tencent.mm.plugin.music;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.music.a.h;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(4882840944640L, 36380);
    GMTrace.o(4882840944640L, 36380);
  }
  
  public o createApplication()
  {
    GMTrace.i(4882975162368L, 36381);
    com.tencent.mm.plugin.music.a.b localb = new com.tencent.mm.plugin.music.a.b();
    GMTrace.o(4882975162368L, 36381);
    return localb;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(4883243597824L, 36383);
    h localh = new h();
    GMTrace.o(4883243597824L, 36383);
    return localh;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(4883109380096L, 36382);
    GMTrace.o(4883109380096L, 36382);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\music\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */