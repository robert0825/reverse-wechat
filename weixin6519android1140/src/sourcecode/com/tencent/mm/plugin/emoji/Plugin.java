package com.tencent.mm.plugin.emoji;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(11541650866176L, 85992);
    GMTrace.o(11541650866176L, 85992);
  }
  
  public o createApplication()
  {
    GMTrace.i(11541785083904L, 85993);
    b localb = new b();
    GMTrace.o(11541785083904L, 85993);
    return localb;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(11542053519360L, 85995);
    h localh = new h();
    GMTrace.o(11542053519360L, 85995);
    return localh;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(11541919301632L, 85994);
    GMTrace.o(11541919301632L, 85994);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\emoji\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */