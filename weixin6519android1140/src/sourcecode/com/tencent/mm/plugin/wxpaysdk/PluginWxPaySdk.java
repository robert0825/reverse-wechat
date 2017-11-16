package com.tencent.mm.plugin.wxpaysdk;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.d;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.plugin.wxpaysdk.a.a;

public class PluginWxPaySdk
  extends d
  implements a
{
  public PluginWxPaySdk()
  {
    GMTrace.i(20964809113600L, 156200);
    GMTrace.o(20964809113600L, 156200);
  }
  
  public void configure(e parame)
  {
    GMTrace.i(20965345984512L, 156204);
    parame.eR("");
    GMTrace.o(20965345984512L, 156204);
  }
  
  public void dependency()
  {
    GMTrace.i(20965211766784L, 156203);
    GMTrace.o(20965211766784L, 156203);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(20965480202240L, 156205);
    parame.eR("");
    GMTrace.o(20965480202240L, 156205);
  }
  
  public void installed()
  {
    GMTrace.i(20965077549056L, 156202);
    alias(PluginWxPaySdk.class);
    GMTrace.o(20965077549056L, 156202);
  }
  
  public String name()
  {
    GMTrace.i(20964943331328L, 156201);
    GMTrace.o(20964943331328L, 156201);
    return "plugin-wxpaysdk";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxpaysdk\PluginWxPaySdk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */