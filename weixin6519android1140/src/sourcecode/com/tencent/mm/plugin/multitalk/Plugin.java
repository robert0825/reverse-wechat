package com.tencent.mm.plugin.multitalk;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(4795196768256L, 35727);
    GMTrace.o(4795196768256L, 35727);
  }
  
  public com.tencent.mm.pluginsdk.o createApplication()
  {
    GMTrace.i(4795330985984L, 35728);
    GMTrace.o(4795330985984L, 35728);
    return null;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(4795599421440L, 35730);
    com.tencent.mm.plugin.multitalk.a.o localo = new com.tencent.mm.plugin.multitalk.a.o();
    GMTrace.o(4795599421440L, 35730);
    return localo;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(4795465203712L, 35729);
    GMTrace.o(4795465203712L, 35729);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */