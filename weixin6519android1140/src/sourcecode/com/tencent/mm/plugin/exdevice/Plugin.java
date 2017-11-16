package com.tencent.mm.plugin.exdevice;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(11196845522944L, 83423);
    GMTrace.o(11196845522944L, 83423);
  }
  
  public o createApplication()
  {
    GMTrace.i(11196979740672L, 83424);
    a locala = new a();
    GMTrace.o(11196979740672L, 83424);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(11197248176128L, 83426);
    ad localad = new ad();
    GMTrace.o(11197248176128L, 83426);
    return localad;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(11197113958400L, 83425);
    GMTrace.o(11197113958400L, 83425);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\exdevice\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */