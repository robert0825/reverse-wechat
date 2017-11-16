package com.tencent.mm.plugin.mmsight;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.api.b.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.p;

public class PluginMMSight
  extends com.tencent.mm.kernel.b.d
  implements a
{
  public PluginMMSight()
  {
    GMTrace.i(18670625488896L, 139107);
    GMTrace.o(18670625488896L, 139107);
  }
  
  public void configure(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(18671162359808L, 139111);
    if (parame != null) {
      w.i("MicroMsg.PluginMMSight", "configure, process: %s", new Object[] { parame.fXf });
    }
    GMTrace.o(18671162359808L, 139111);
  }
  
  public void dependency()
  {
    GMTrace.i(18671028142080L, 139110);
    w.i("MicroMsg.PluginMMSight", "dependency");
    dependsOn(com.tencent.mm.plugin.zero.a.d.class);
    GMTrace.o(18671028142080L, 139110);
  }
  
  public void execute(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(18671296577536L, 139112);
    if (parame != null) {
      w.i("MicroMsg.PluginMMSight", "execute, process: %s", new Object[] { parame.fXf });
    }
    com.tencent.mm.plugin.mmsight.api.b.mXe = new b.a();
    com.tencent.mm.plugin.mmsight.api.MMSightRecordView.mXd = new com.tencent.mm.plugin.api.recordView.e();
    com.tencent.mm.plugin.mmsight.api.a.mXb = new com.tencent.mm.plugin.api.a();
    pin(new p(e.class));
    GMTrace.o(18671296577536L, 139112);
  }
  
  public void installed()
  {
    GMTrace.i(18670893924352L, 139109);
    w.i("MicroMsg.PluginMMSight", "installed");
    alias(a.class);
    GMTrace.o(18670893924352L, 139109);
  }
  
  public String name()
  {
    GMTrace.i(18670759706624L, 139108);
    GMTrace.o(18670759706624L, 139108);
    return "plugin-mmsight";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\mmsight\PluginMMSight.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */