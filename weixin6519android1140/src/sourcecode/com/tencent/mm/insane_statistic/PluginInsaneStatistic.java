package com.tencent.mm.insane_statistic;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.d;
import com.tencent.mm.kernel.b.e;

public class PluginInsaneStatistic
  extends d
  implements com.tencent.mm.insane_statistic.a.a
{
  public PluginInsaneStatistic()
  {
    GMTrace.i(16312285790208L, 121536);
    GMTrace.o(16312285790208L, 121536);
  }
  
  public void configure(e parame)
  {
    GMTrace.i(16312688443392L, 121539);
    GMTrace.o(16312688443392L, 121539);
  }
  
  public void dependency()
  {
    GMTrace.i(16312554225664L, 121538);
    dependsOn(com.tencent.mm.plugin.comm.a.a.class);
    GMTrace.o(16312554225664L, 121538);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(16312822661120L, 121540);
    if (parame.eR(""))
    {
      com.tencent.mm.ao.q.gJS = new b();
      com.tencent.mm.modelstat.q.gZI = new a();
    }
    GMTrace.o(16312822661120L, 121540);
  }
  
  public void installed()
  {
    GMTrace.i(16312420007936L, 121537);
    alias(com.tencent.mm.insane_statistic.a.a.class);
    GMTrace.o(16312420007936L, 121537);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\insane_statistic\PluginInsaneStatistic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */