package com.tencent.mm.plugin.wallet_core;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.a.a;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(7038109220864L, 52438);
    GMTrace.o(7038109220864L, 52438);
  }
  
  public o createApplication()
  {
    GMTrace.i(7038243438592L, 52439);
    a locala = new a();
    GMTrace.o(7038243438592L, 52439);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(7038511874048L, 52441);
    n localn = new n();
    GMTrace.o(7038511874048L, 52441);
    return localn;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(7038377656320L, 52440);
    GMTrace.o(7038377656320L, 52440);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */