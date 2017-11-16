package com.tencent.mm.plugin.ipcall;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  b mit;
  
  public Plugin()
  {
    GMTrace.i(11743245893632L, 87494);
    this.mit = new b();
    GMTrace.o(11743245893632L, 87494);
  }
  
  public o createApplication()
  {
    GMTrace.i(11743380111360L, 87495);
    b localb = this.mit;
    GMTrace.o(11743380111360L, 87495);
    return localb;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(11743648546816L, 87497);
    i locali = i.aIn();
    GMTrace.o(11743648546816L, 87497);
    return locali;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(11743514329088L, 87496);
    GMTrace.o(11743514329088L, 87496);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\ipcall\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */