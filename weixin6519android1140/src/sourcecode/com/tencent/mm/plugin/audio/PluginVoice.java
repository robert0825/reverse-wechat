package com.tencent.mm.plugin.audio;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.plugin.audio.a.a;
import com.tencent.mm.y.p;

public class PluginVoice
  extends com.tencent.mm.kernel.b.d
  implements a
{
  public PluginVoice()
  {
    GMTrace.i(14590003904512L, 108704);
    GMTrace.o(14590003904512L, 108704);
  }
  
  public void configure(e parame)
  {
    GMTrace.i(14590540775424L, 108708);
    GMTrace.o(14590540775424L, 108708);
  }
  
  public void dependency()
  {
    GMTrace.i(14590406557696L, 108707);
    dependsOn(com.tencent.mm.plugin.zero.a.d.class);
    GMTrace.o(14590406557696L, 108707);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(14590674993152L, 108709);
    if (parame.eR("")) {
      pin(new p(m.class));
    }
    GMTrace.o(14590674993152L, 108709);
  }
  
  public void installed()
  {
    GMTrace.i(14590272339968L, 108706);
    alias(a.class);
    GMTrace.o(14590272339968L, 108706);
  }
  
  public String name()
  {
    GMTrace.i(14590138122240L, 108705);
    GMTrace.o(14590138122240L, 108705);
    return "plugin-voice";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\audio\PluginVoice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */