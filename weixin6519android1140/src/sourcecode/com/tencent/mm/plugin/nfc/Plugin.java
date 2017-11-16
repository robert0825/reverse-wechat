package com.tencent.mm.plugin.nfc;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(8964670488576L, 66792);
    GMTrace.o(8964670488576L, 66792);
  }
  
  public o createApplication()
  {
    GMTrace.i(8964804706304L, 66793);
    GMTrace.o(8964804706304L, 66793);
    return null;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(8965073141760L, 66795);
    b localb = new b();
    GMTrace.o(8965073141760L, 66795);
    return localb;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(8964938924032L, 66794);
    GMTrace.o(8964938924032L, 66794);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nfc\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */