package com.tencent.mm.plugin.wallet_payu;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_payu.a.d;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(7987296993280L, 59510);
    GMTrace.o(7987296993280L, 59510);
  }
  
  public o createApplication()
  {
    GMTrace.i(7987431211008L, 59511);
    GMTrace.o(7987431211008L, 59511);
    return null;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(7987699646464L, 59513);
    d locald = new d();
    GMTrace.o(7987699646464L, 59513);
    return locald;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(7987565428736L, 59512);
    GMTrace.o(7987565428736L, 59512);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */