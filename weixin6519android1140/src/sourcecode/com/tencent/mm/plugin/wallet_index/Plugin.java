package com.tencent.mm.plugin.wallet_index;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_index.a.a;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public final class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(7590952042496L, 56557);
    GMTrace.o(7590952042496L, 56557);
  }
  
  public final o createApplication()
  {
    GMTrace.i(7591086260224L, 56558);
    GMTrace.o(7591086260224L, 56558);
    return null;
  }
  
  public final aq createSubCore()
  {
    GMTrace.i(7591354695680L, 56560);
    a locala = new a();
    GMTrace.o(7591354695680L, 56560);
    return locala;
  }
  
  public final b getContactWidgetFactory()
  {
    GMTrace.i(7591220477952L, 56559);
    GMTrace.o(7591220477952L, 56559);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet_index\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */