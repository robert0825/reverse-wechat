package com.tencent.mm.plugin.h;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.l;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.a.c;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends c
{
  public e()
  {
    GMTrace.i(5214090297344L, 38848);
    GMTrace.o(5214090297344L, 38848);
  }
  
  public final void execute(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(5214224515072L, 38849);
    int i = l.sK();
    if ((i & 0x400) != 0)
    {
      w.i("MicroMsg.SightInitTask", "load wechatsight_v7a, core number[%d]", new Object[] { Integer.valueOf(i >> 12) });
      k.b("wechatsight_v7a", getClass().getClassLoader());
      if (i >> 12 >= 4)
      {
        com.tencent.mm.plugin.sight.base.b.oRB = 3;
        com.tencent.mm.plugin.sight.base.b.oRD = 3;
        com.tencent.mm.plugin.sight.base.b.oRE = 544000;
        GMTrace.o(5214224515072L, 38849);
        return;
      }
      com.tencent.mm.plugin.sight.base.b.oRB = 1;
      com.tencent.mm.plugin.sight.base.b.oRD = 1;
      com.tencent.mm.plugin.sight.base.b.oRE = 640000;
      GMTrace.o(5214224515072L, 38849);
      return;
    }
    w.i("MicroMsg.SightInitTask", "load wechatsight");
    k.b("wechatsight", getClass().getClassLoader());
    com.tencent.mm.plugin.sight.base.b.oRB = 1;
    com.tencent.mm.plugin.sight.base.b.oRD = 1;
    com.tencent.mm.plugin.sight.base.b.oRE = 640000;
    GMTrace.o(5214224515072L, 38849);
  }
  
  public final String name()
  {
    GMTrace.i(5214358732800L, 38850);
    GMTrace.o(5214358732800L, 38850);
    return "boot-sight-init";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\h\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */