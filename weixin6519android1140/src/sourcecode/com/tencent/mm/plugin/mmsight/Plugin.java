package com.tencent.mm.plugin.mmsight;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(7493912625152L, 55834);
    GMTrace.o(7493912625152L, 55834);
  }
  
  public o createApplication()
  {
    GMTrace.i(7494046842880L, 55835);
    b localb = new b();
    GMTrace.o(7494046842880L, 55835);
    return localb;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(7494315278336L, 55837);
    GMTrace.o(7494315278336L, 55837);
    return null;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(7494181060608L, 55836);
    GMTrace.o(7494181060608L, 55836);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\mmsight\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */