package com.tencent.mm.plugin.chatroom;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.d;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.chatroom.b.c;
import com.tencent.mm.y.n;

public class PluginChatroom
  extends d
  implements c
{
  public PluginChatroom()
  {
    GMTrace.i(14585172066304L, 108668);
    GMTrace.o(14585172066304L, 108668);
  }
  
  public void configure(e parame)
  {
    GMTrace.i(14585708937216L, 108672);
    GMTrace.o(14585708937216L, 108672);
  }
  
  public void dependency()
  {
    GMTrace.i(14585574719488L, 108671);
    dependsOn(com.tencent.mm.plugin.comm.a.a.class);
    GMTrace.o(14585574719488L, 108671);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(14585843154944L, 108673);
    if (parame.eR("")) {
      h.a(com.tencent.mm.plugin.chatroom.b.a.class, new n());
    }
    GMTrace.o(14585843154944L, 108673);
  }
  
  public void installed()
  {
    GMTrace.i(14585440501760L, 108670);
    alias(c.class);
    GMTrace.o(14585440501760L, 108670);
  }
  
  public String name()
  {
    GMTrace.i(14585306284032L, 108669);
    GMTrace.o(14585306284032L, 108669);
    return "plugin-chatroom";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\chatroom\PluginChatroom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */