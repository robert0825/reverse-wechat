package com.tencent.mm.plugin.game;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.a.a;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(12784372809728L, 95251);
    GMTrace.o(12784372809728L, 95251);
  }
  
  public o createApplication()
  {
    GMTrace.i(12784507027456L, 95252);
    a locala = new a();
    GMTrace.o(12784507027456L, 95252);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(12784775462912L, 95254);
    SubCoreGameCenter localSubCoreGameCenter = new SubCoreGameCenter();
    GMTrace.o(12784775462912L, 95254);
    return localSubCoreGameCenter;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(12784641245184L, 95253);
    GMTrace.o(12784641245184L, 95253);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\game\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */