package com.tencent.mm.plugin.video;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.modelvideo.n;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.p;

public class PluginVideo
  extends com.tencent.mm.kernel.b.d
  implements com.tencent.mm.plugin.video.a.a
{
  public PluginVideo()
  {
    GMTrace.i(16387716153344L, 122098);
    GMTrace.o(16387716153344L, 122098);
  }
  
  public void configure(e parame)
  {
    GMTrace.i(16388253024256L, 122102);
    GMTrace.o(16388253024256L, 122102);
  }
  
  public void dependency()
  {
    GMTrace.i(16388118806528L, 122101);
    dependsOn(com.tencent.mm.plugin.comm.a.a.class);
    GMTrace.o(16388118806528L, 122101);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(16388387241984L, 122103);
    w.i("MicroMsg.PluginVideo", "plugin video execute");
    if (parame.eR(""))
    {
      pin(new p(o.class));
      pin(new p(com.tencent.mm.modelcontrol.d.class));
      pin(new p(n.class));
    }
    GMTrace.o(16388387241984L, 122103);
  }
  
  public void installed()
  {
    GMTrace.i(16387984588800L, 122100);
    alias(com.tencent.mm.plugin.video.a.a.class);
    GMTrace.o(16387984588800L, 122100);
  }
  
  public String name()
  {
    GMTrace.i(16387850371072L, 122099);
    GMTrace.o(16387850371072L, 122099);
    return "plugin-video";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\video\PluginVideo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */