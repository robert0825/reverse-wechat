package com.tencent.mm.plugin.recharge;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.recharge.a.a;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(7909048057856L, 58927);
    GMTrace.o(7909048057856L, 58927);
  }
  
  public o createApplication()
  {
    GMTrace.i(7909182275584L, 58928);
    GMTrace.o(7909182275584L, 58928);
    return null;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(7909450711040L, 58930);
    a locala = new a();
    GMTrace.o(7909450711040L, 58930);
    return locala;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(7909316493312L, 58929);
    GMTrace.o(7909316493312L, 58929);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\recharge\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */