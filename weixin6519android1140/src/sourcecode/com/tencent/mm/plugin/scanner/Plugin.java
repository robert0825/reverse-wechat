package com.tencent.mm.plugin.scanner;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements com.tencent.mm.pluginsdk.d.c
{
  public Plugin()
  {
    GMTrace.i(6185021341696L, 46082);
    GMTrace.o(6185021341696L, 46082);
  }
  
  public o createApplication()
  {
    GMTrace.i(6185155559424L, 46083);
    b localb = new b();
    GMTrace.o(6185155559424L, 46083);
    return localb;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(6185423994880L, 46085);
    c localc = new c();
    GMTrace.o(6185423994880L, 46085);
    return localc;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(6185289777152L, 46084);
    GMTrace.o(6185289777152L, 46084);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */