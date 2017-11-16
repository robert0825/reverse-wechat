package com.tencent.mm.plugin.messenger;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.d;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.messenger.a.b;

public class PluginMessenger
  extends d
  implements b
{
  a mUs;
  
  public PluginMessenger()
  {
    GMTrace.i(14583293018112L, 108654);
    this.mUs = new a();
    GMTrace.o(14583293018112L, 108654);
  }
  
  public void configure(e parame)
  {
    GMTrace.i(14583695671296L, 108657);
    if (parame.eR(""))
    {
      h.xz();
      h.a(com.tencent.mm.plugin.messenger.a.a.class, this.mUs);
    }
    GMTrace.o(14583695671296L, 108657);
  }
  
  public void dependency()
  {
    GMTrace.i(14583561453568L, 108656);
    dependsOn(com.tencent.mm.plugin.comm.a.a.class);
    GMTrace.o(14583561453568L, 108656);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(14583829889024L, 108658);
    if (parame.eR("")) {
      pin(com.tencent.mm.plugin.ac.a.bbe());
    }
    GMTrace.o(14583829889024L, 108658);
  }
  
  public void installed()
  {
    GMTrace.i(14583427235840L, 108655);
    alias(b.class);
    GMTrace.o(14583427235840L, 108655);
  }
  
  public String toString()
  {
    GMTrace.i(14583964106752L, 108659);
    GMTrace.o(14583964106752L, 108659);
    return "plugin-messenger";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\messenger\PluginMessenger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */