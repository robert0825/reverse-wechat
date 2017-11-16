package com.tencent.mm.plugin.soter_mp;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(7076495491072L, 52724);
    w.i("SubCoreSoter", "soter plugin constructor");
    GMTrace.o(7076495491072L, 52724);
  }
  
  public o createApplication()
  {
    GMTrace.i(7076629708800L, 52725);
    a locala = new a();
    GMTrace.o(7076629708800L, 52725);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(7076898144256L, 52727);
    b localb = new b();
    GMTrace.o(7076898144256L, 52727);
    return localb;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(7076763926528L, 52726);
    GMTrace.o(7076763926528L, 52726);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\soter_mp\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */