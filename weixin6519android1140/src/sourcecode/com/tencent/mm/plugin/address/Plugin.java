package com.tencent.mm.plugin.address;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(12819537854464L, 95513);
    GMTrace.o(12819537854464L, 95513);
  }
  
  public o createApplication()
  {
    GMTrace.i(12819672072192L, 95514);
    GMTrace.o(12819672072192L, 95514);
    return null;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(12819940507648L, 95516);
    a locala = new a();
    GMTrace.o(12819940507648L, 95516);
    return locala;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(12819806289920L, 95515);
    GMTrace.o(12819806289920L, 95515);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */