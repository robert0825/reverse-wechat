package com.tencent.mm.plugin.notification;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.d;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.plugin.notification.b.a;
import com.tencent.mm.y.aj;

public class PluginNotification
  extends d
  implements a
{
  private aj nyi;
  
  public PluginNotification()
  {
    GMTrace.i(14606244249600L, 108825);
    GMTrace.o(14606244249600L, 108825);
  }
  
  public void configure(e parame)
  {
    GMTrace.i(14606646902784L, 108828);
    GMTrace.o(14606646902784L, 108828);
  }
  
  public void dependency()
  {
    GMTrace.i(14606512685056L, 108827);
    dependsOn(n.class);
    GMTrace.o(14606512685056L, 108827);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(14606781120512L, 108829);
    GMTrace.o(14606781120512L, 108829);
  }
  
  public aj getNotification()
  {
    GMTrace.i(14607049555968L, 108831);
    aj localaj = this.nyi;
    GMTrace.o(14607049555968L, 108831);
    return localaj;
  }
  
  public void installed()
  {
    GMTrace.i(14606378467328L, 108826);
    alias(a.class);
    GMTrace.o(14606378467328L, 108826);
  }
  
  public void setNotification(aj paramaj)
  {
    GMTrace.i(14606915338240L, 108830);
    this.nyi = paramaj;
    b.nxW = paramaj;
    GMTrace.o(14606915338240L, 108830);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\notification\PluginNotification.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */