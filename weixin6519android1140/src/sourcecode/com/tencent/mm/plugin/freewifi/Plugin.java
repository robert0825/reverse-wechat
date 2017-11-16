package com.tencent.mm.plugin.freewifi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(7265608269824L, 54133);
    GMTrace.o(7265608269824L, 54133);
  }
  
  public o createApplication()
  {
    GMTrace.i(7265742487552L, 54134);
    g localg = new g();
    GMTrace.o(7265742487552L, 54134);
    return localg;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(7266010923008L, 54136);
    j localj = new j();
    GMTrace.o(7266010923008L, 54136);
    return localj;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(7265876705280L, 54135);
    GMTrace.o(7265876705280L, 54135);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\freewifi\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */