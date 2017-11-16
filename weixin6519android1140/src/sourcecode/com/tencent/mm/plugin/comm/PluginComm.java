package com.tencent.mm.plugin.comm;

import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.wx_extension.d.a;
import com.tencent.mm.kernel.b.d;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.pluginsdk.ui.a.b;

public class PluginComm
  extends d
  implements com.tencent.mm.plugin.comm.a.a
{
  public PluginComm()
  {
    GMTrace.i(18738673876992L, 139614);
    GMTrace.o(18738673876992L, 139614);
  }
  
  public void configure(e parame)
  {
    GMTrace.i(18739210747904L, 139618);
    if (parame.eR(""))
    {
      parame = (n)com.tencent.mm.kernel.h.j(n.class);
      new com.tencent.mm.plugin.zero.tasks.c().after(parame).before(this);
    }
    GMTrace.o(18739210747904L, 139618);
  }
  
  public void dependency()
  {
    GMTrace.i(18739076530176L, 139617);
    dependsOn(n.class);
    GMTrace.o(18739076530176L, 139617);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(18739344965632L, 139619);
    if (parame.eR(""))
    {
      pin(com.tencent.mm.plugin.f.a.adZ());
      pin(com.tencent.mm.plugin.a.PD());
      pin(com.tencent.mm.plugin.j.a.ank());
      pin(com.tencent.mm.plugin.l.a.apu());
      pin(com.tencent.mm.plugin.b.a.Qs());
      pin(com.tencent.mm.plugin.b.b.Qt());
      pin(com.tencent.mm.plugin.n.b.aHC());
      pin(com.tencent.mm.plugin.n.a.aHB());
      pin(com.tencent.mm.r.h.vD());
      pin(com.tencent.mm.plugin.y.a.aWV());
      pin(com.tencent.mm.plugin.r.b.aOd());
      pin(com.tencent.mm.plugin.d.a.Re());
      pin(com.tencent.mm.plugin.x.a.aWv());
      com.tencent.mm.kernel.h.a(com.tencent.mm.plugin.r.a.a.class, new com.tencent.mm.plugin.r.a());
      ((com.tencent.mm.plugin.auth.a.b)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(com.tencent.mm.plugin.j.a.ank());
      com.tencent.mm.ui.f.a.a.a(new com.tencent.mm.ui.f.a.b()
      {
        public final void a(ImageView paramAnonymousImageView, String paramAnonymousString)
        {
          GMTrace.i(18738539659264L, 139613);
          a.b.a(paramAnonymousImageView, paramAnonymousString);
          GMTrace.o(18738539659264L, 139613);
        }
      });
    }
    pin(d.a.fVX);
    GMTrace.o(18739344965632L, 139619);
  }
  
  public void installed()
  {
    GMTrace.i(18738942312448L, 139616);
    alias(com.tencent.mm.plugin.comm.a.a.class);
    GMTrace.o(18738942312448L, 139616);
  }
  
  public String name()
  {
    GMTrace.i(18738808094720L, 139615);
    GMTrace.o(18738808094720L, 139615);
    return "plugin-comm";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\comm\PluginComm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */