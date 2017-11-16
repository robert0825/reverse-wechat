package com.tencent.mm.plugin.appbrand.report;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public abstract class c
  extends com.tencent.mm.sdk.d.c
{
  public c()
  {
    GMTrace.i(18353334779904L, 136743);
    GMTrace.o(18353334779904L, 136743);
  }
  
  public void enter()
  {
    GMTrace.i(18353468997632L, 136744);
    super.enter();
    w.i("MicroMsg.LoggerState", getName() + " [ENTERING]");
    GMTrace.o(18353468997632L, 136744);
  }
  
  public void exit()
  {
    GMTrace.i(18353603215360L, 136745);
    super.exit();
    w.i("MicroMsg.LoggerState", getName() + " [EXITING]");
    GMTrace.o(18353603215360L, 136745);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\report\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */