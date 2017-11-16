package com.tencent.mm.plugin.performance;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.d;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.plugin.performance.a.a;
import com.tencent.mm.plugin.report.PluginReport;

public class PluginPerformance
  extends d
  implements a
{
  public PluginPerformance()
  {
    GMTrace.i(13093878890496L, 97557);
    GMTrace.o(13093878890496L, 97557);
  }
  
  public void configure(e parame)
  {
    GMTrace.i(13094147325952L, 97559);
    com.tencent.mm.bw.c.vFe = new b.1();
    com.tencent.mm.performance.a.a.hiq = new a.1();
    GMTrace.o(13094147325952L, 97559);
  }
  
  public void dependency()
  {
    GMTrace.i(13094013108224L, 97558);
    dependsOn(PluginReport.class);
    dependsOn(n.class);
    GMTrace.o(13094013108224L, 97558);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(13094281543680L, 97560);
    GMTrace.o(13094281543680L, 97560);
  }
  
  public void installed()
  {
    GMTrace.i(14585977372672L, 108674);
    alias(a.class);
    GMTrace.o(14585977372672L, 108674);
  }
  
  public String toString()
  {
    GMTrace.i(13094415761408L, 97561);
    GMTrace.o(13094415761408L, 97561);
    return "plugin-performance";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\performance\PluginPerformance.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */