package com.tencent.mm.plugin.luckymoney;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public final class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(9907550027776L, 73817);
    GMTrace.o(9907550027776L, 73817);
  }
  
  public final o createApplication()
  {
    GMTrace.i(9907684245504L, 73818);
    a locala = new a();
    GMTrace.o(9907684245504L, 73818);
    return locala;
  }
  
  public final aq createSubCore()
  {
    GMTrace.i(9907952680960L, 73820);
    com.tencent.mm.plugin.luckymoney.a.a locala = new com.tencent.mm.plugin.luckymoney.a.a();
    GMTrace.o(9907952680960L, 73820);
    return locala;
  }
  
  public final b getContactWidgetFactory()
  {
    GMTrace.i(9907818463232L, 73819);
    GMTrace.o(9907818463232L, 73819);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */