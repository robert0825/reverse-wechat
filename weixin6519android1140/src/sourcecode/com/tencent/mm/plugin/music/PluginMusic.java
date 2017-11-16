package com.tencent.mm.plugin.music;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.b;
import com.tencent.mm.kernel.b.d;
import com.tencent.mm.kernel.h;

public class PluginMusic
  extends d
  implements b
{
  public PluginMusic()
  {
    GMTrace.i(18643245072384L, 138903);
    GMTrace.o(18643245072384L, 138903);
  }
  
  public void configure(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(18643379290112L, 138904);
    if (parame.eR(""))
    {
      h.xz();
      h.a(a.class, new com.tencent.mm.at.e());
    }
    GMTrace.o(18643379290112L, 138904);
  }
  
  public void execute(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(18643513507840L, 138905);
    GMTrace.o(18643513507840L, 138905);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\PluginMusic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */