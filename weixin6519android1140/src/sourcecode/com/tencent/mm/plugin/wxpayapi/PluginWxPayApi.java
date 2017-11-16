package com.tencent.mm.plugin.wxpayapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.d;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.pluginsdk.wallet.b;

public class PluginWxPayApi
  extends d
  implements com.tencent.mm.plugin.wxpayapi.a.a
{
  public PluginWxPayApi()
  {
    GMTrace.i(20853274181632L, 155369);
    GMTrace.o(20853274181632L, 155369);
  }
  
  public void configure(e parame)
  {
    GMTrace.i(20853811052544L, 155373);
    parame.eR("");
    GMTrace.o(20853811052544L, 155373);
  }
  
  public void dependency()
  {
    GMTrace.i(20853676834816L, 155372);
    GMTrace.o(20853676834816L, 155372);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(20853945270272L, 155374);
    if (parame.eR("")) {
      h.a(b.class, new com.tencent.mm.plugin.v.a());
    }
    GMTrace.o(20853945270272L, 155374);
  }
  
  public void installed()
  {
    GMTrace.i(20853542617088L, 155371);
    alias(PluginWxPayApi.class);
    GMTrace.o(20853542617088L, 155371);
  }
  
  public String name()
  {
    GMTrace.i(20853408399360L, 155370);
    GMTrace.o(20853408399360L, 155370);
    return "plugin-wxpayapi";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wxpayapi\PluginWxPayApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */