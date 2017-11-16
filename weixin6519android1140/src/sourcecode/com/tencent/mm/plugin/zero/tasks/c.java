package com.tencent.mm.plugin.zero.tasks;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.modelsfs.FileOp;

public final class c
  extends com.tencent.mm.kernel.a.c
{
  public c()
  {
    GMTrace.i(14611747176448L, 108866);
    GMTrace.o(14611747176448L, 108866);
  }
  
  public final void execute(e parame)
  {
    GMTrace.i(14611881394176L, 108867);
    FileOp.init(parame.eR(""));
    GMTrace.o(14611881394176L, 108867);
  }
  
  public final String name()
  {
    GMTrace.i(14612015611904L, 108868);
    GMTrace.o(14612015611904L, 108868);
    return "boot-sfs";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\zero\tasks\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */