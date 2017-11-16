package com.tencent.mm.plugin.fingerprint;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(10771777978368L, 80256);
    GMTrace.o(10771777978368L, 80256);
  }
  
  public o createApplication()
  {
    GMTrace.i(10771912196096L, 80257);
    GMTrace.o(10771912196096L, 80257);
    return null;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(10772180631552L, 80259);
    a locala = new a();
    GMTrace.o(10772180631552L, 80259);
    return locala;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(10772046413824L, 80258);
    GMTrace.o(10772046413824L, 80258);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */