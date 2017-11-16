package com.tencent.mm.plugin.profile;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;

public final class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(6823226638336L, 50837);
    w.i("MicroMsg.Plugin.profile", "profile constructor " + System.currentTimeMillis());
    GMTrace.o(6823226638336L, 50837);
  }
  
  public final o createApplication()
  {
    GMTrace.i(6823360856064L, 50838);
    w.i("MicroMsg.Plugin.profile", "profile createApplication " + System.currentTimeMillis());
    a locala = new a();
    GMTrace.o(6823360856064L, 50838);
    return locala;
  }
  
  public final aq createSubCore()
  {
    GMTrace.i(6823629291520L, 50840);
    w.i("MicroMsg.Plugin.profile", "profile createSubCore " + System.currentTimeMillis());
    b localb = new b();
    GMTrace.o(6823629291520L, 50840);
    return localb;
  }
  
  public final com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(6823495073792L, 50839);
    w.i("MicroMsg.Plugin.profile", "profile getContactWidgetFactory " + System.currentTimeMillis());
    GMTrace.o(6823495073792L, 50839);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\profile\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */