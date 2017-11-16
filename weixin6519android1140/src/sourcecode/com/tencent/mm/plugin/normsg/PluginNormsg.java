package com.tencent.mm.plugin.normsg;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.plugin.normsg.a.c;
import com.tencent.mm.plugin.normsg.utils.NativeLogic.a;

public class PluginNormsg
  extends com.tencent.mm.kernel.b.d
  implements a
{
  public PluginNormsg()
  {
    GMTrace.i(17528969494528L, 130601);
    GMTrace.o(17528969494528L, 130601);
  }
  
  public void configure(e parame)
  {
    GMTrace.i(17529372147712L, 130604);
    com.tencent.mm.plugin.normsg.a.d.a(b.nxC);
    c.a(NativeLogic.a.nxN);
    GMTrace.o(17529372147712L, 130604);
  }
  
  public void dependency()
  {
    GMTrace.i(17529237929984L, 130603);
    dependsOn(com.tencent.mm.plugin.zero.a.d.class);
    dependsOn(com.tencent.mm.plugin.report.b.class);
    GMTrace.o(17529237929984L, 130603);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(17529506365440L, 130605);
    GMTrace.o(17529506365440L, 130605);
  }
  
  public void installed()
  {
    GMTrace.i(17529103712256L, 130602);
    alias(a.class);
    GMTrace.o(17529103712256L, 130602);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\normsg\PluginNormsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */