package com.tencent.mm.plugin.safedevice;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.safedevice.a.f;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(12882083315712L, 95979);
    GMTrace.o(12882083315712L, 95979);
  }
  
  public o createApplication()
  {
    GMTrace.i(12882217533440L, 95980);
    a locala = new a();
    GMTrace.o(12882217533440L, 95980);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(12882485968896L, 95982);
    f localf = new f();
    GMTrace.o(12882485968896L, 95982);
    return localf;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(12882351751168L, 95981);
    GMTrace.o(12882351751168L, 95981);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\safedevice\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */