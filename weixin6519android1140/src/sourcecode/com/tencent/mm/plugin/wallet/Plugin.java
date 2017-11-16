package com.tencent.mm.plugin.wallet;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(7829322727424L, 58333);
    GMTrace.o(7829322727424L, 58333);
  }
  
  public o createApplication()
  {
    GMTrace.i(7829456945152L, 58334);
    GMTrace.o(7829456945152L, 58334);
    return null;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(7829725380608L, 58336);
    p localp = new p();
    GMTrace.o(7829725380608L, 58336);
    return localp;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(7829591162880L, 58335);
    GMTrace.o(7829591162880L, 58335);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */