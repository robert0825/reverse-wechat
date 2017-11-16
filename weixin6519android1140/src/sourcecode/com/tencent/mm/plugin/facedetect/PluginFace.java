package com.tencent.mm.plugin.facedetect;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.d;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.vending.g.d.a;
import com.tencent.mm.vending.g.g;

public class PluginFace
  extends d
  implements com.tencent.mm.plugin.facedetect.a.a
{
  public PluginFace()
  {
    GMTrace.i(18489565773824L, 137758);
    GMTrace.o(18489565773824L, 137758);
  }
  
  public void configure(e parame)
  {
    GMTrace.i(18489968427008L, 137761);
    w.d("MicroMsg.PluginFace", "hy: on face plugin config");
    GMTrace.o(18489968427008L, 137761);
  }
  
  public void dependency()
  {
    GMTrace.i(18489834209280L, 137760);
    w.d("MicroMsg.PluginFace", "hy: on face plugin ");
    dependsOn(com.tencent.mm.plugin.comm.a.a.class);
    GMTrace.o(18489834209280L, 137760);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(18490236862464L, 137763);
    w.i("MicroMsg.PluginFace", "hy: starting execute.");
    if (parame.eR("")) {
      g.ckp().b(new b()).a(new d.a() {});
    }
    GMTrace.o(18490236862464L, 137763);
  }
  
  public void installed()
  {
    GMTrace.i(18489699991552L, 137759);
    alias(com.tencent.mm.plugin.facedetect.a.a.class);
    GMTrace.o(18489699991552L, 137759);
  }
  
  public String name()
  {
    GMTrace.i(18490102644736L, 137762);
    GMTrace.o(18490102644736L, 137762);
    return "plugin-facedetect";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\facedetect\PluginFace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */