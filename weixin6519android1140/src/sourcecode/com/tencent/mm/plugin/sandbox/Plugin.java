package com.tencent.mm.plugin.sandbox;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(8936082112512L, 66579);
    GMTrace.o(8936082112512L, 66579);
  }
  
  public o createApplication()
  {
    GMTrace.i(8936216330240L, 66580);
    a locala = new a();
    GMTrace.o(8936216330240L, 66580);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(8936484765696L, 66582);
    SubCoreSandBox localSubCoreSandBox = new SubCoreSandBox();
    GMTrace.o(8936484765696L, 66582);
    return localSubCoreSandBox;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(8936350547968L, 66581);
    GMTrace.o(8936350547968L, 66581);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sandbox\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */