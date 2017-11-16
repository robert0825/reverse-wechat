package com.tencent.mm.plugin.wear.model.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wear.model.e.r;

public final class a
  extends c
{
  public a()
  {
    GMTrace.i(9187606134784L, 68453);
    GMTrace.o(9187606134784L, 68453);
  }
  
  public final String getName()
  {
    GMTrace.i(9187740352512L, 68454);
    GMTrace.o(9187740352512L, 68454);
    return "RequestLogTask";
  }
  
  protected final void send()
  {
    GMTrace.i(9187874570240L, 68455);
    com.tencent.mm.plugin.wear.model.a.bBm();
    r.a(20009, null, false);
    com.tencent.mm.plugin.wear.model.a.bBm();
    r.a(20017, null, false);
    GMTrace.o(9187874570240L, 68455);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */