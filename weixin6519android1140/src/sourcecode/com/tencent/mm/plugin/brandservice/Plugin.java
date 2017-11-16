package com.tencent.mm.plugin.brandservice;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ah;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements com.tencent.mm.pluginsdk.d.c
{
  public Plugin()
  {
    GMTrace.i(10914451423232L, 81319);
    GMTrace.o(10914451423232L, 81319);
  }
  
  public o createApplication()
  {
    GMTrace.i(10914585640960L, 81320);
    com.tencent.mm.sdk.b.a.vgX.b(new com.tencent.mm.sdk.b.c() {});
    a locala = new a();
    GMTrace.o(10914585640960L, 81320);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(10914854076416L, 81322);
    b localb = new b();
    GMTrace.o(10914854076416L, 81322);
    return localb;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(10914719858688L, 81321);
    GMTrace.o(10914719858688L, 81321);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */