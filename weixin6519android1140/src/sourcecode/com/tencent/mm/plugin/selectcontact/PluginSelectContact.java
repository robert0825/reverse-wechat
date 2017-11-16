package com.tencent.mm.plugin.selectcontact;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.d;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.plugin.selectcontact.a.a;

public class PluginSelectContact
  extends d
  implements a
{
  public PluginSelectContact()
  {
    GMTrace.i(20967090814976L, 156217);
    GMTrace.o(20967090814976L, 156217);
  }
  
  public void configure(e parame)
  {
    GMTrace.i(20967627685888L, 156221);
    parame.eR("");
    GMTrace.o(20967627685888L, 156221);
  }
  
  public void dependency()
  {
    GMTrace.i(20967493468160L, 156220);
    GMTrace.o(20967493468160L, 156220);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(20967761903616L, 156222);
    parame.eR("");
    GMTrace.o(20967761903616L, 156222);
  }
  
  public void installed()
  {
    GMTrace.i(20967359250432L, 156219);
    alias(PluginSelectContact.class);
    GMTrace.o(20967359250432L, 156219);
  }
  
  public String name()
  {
    GMTrace.i(20967225032704L, 156218);
    GMTrace.o(20967225032704L, 156218);
    return "plugin-selectcontact";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\selectcontact\PluginSelectContact.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */