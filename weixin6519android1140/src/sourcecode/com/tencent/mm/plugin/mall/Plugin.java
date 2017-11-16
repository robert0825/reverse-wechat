package com.tencent.mm.plugin.mall;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.mall.a.d;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(8008234958848L, 59666);
    GMTrace.o(8008234958848L, 59666);
  }
  
  public o createApplication()
  {
    GMTrace.i(8008369176576L, 59667);
    GMTrace.o(8008369176576L, 59667);
    return null;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(8008637612032L, 59669);
    d locald = new d();
    GMTrace.o(8008637612032L, 59669);
    return locald;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(8008503394304L, 59668);
    GMTrace.o(8008503394304L, 59668);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\mall\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */