package com.tencent.mm.plugin.sns;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(8863201886208L, 66036);
    GMTrace.o(8863201886208L, 66036);
  }
  
  public o createApplication()
  {
    GMTrace.i(8863336103936L, 66037);
    a locala = new a();
    GMTrace.o(8863336103936L, 66037);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(8863604539392L, 66039);
    GMTrace.o(8863604539392L, 66039);
    return null;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(8863470321664L, 66038);
    GMTrace.o(8863470321664L, 66038);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\sns\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */