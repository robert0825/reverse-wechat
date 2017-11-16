package com.tencent.mm.plugin.product;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.product.a.a;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(6042347896832L, 45019);
    GMTrace.o(6042347896832L, 45019);
  }
  
  public o createApplication()
  {
    GMTrace.i(6042482114560L, 45020);
    GMTrace.o(6042482114560L, 45020);
    return null;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(6042750550016L, 45022);
    a locala = new a();
    GMTrace.o(6042750550016L, 45022);
    return locala;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(6042616332288L, 45021);
    GMTrace.o(6042616332288L, 45021);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\product\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */