package com.tencent.mm.plugin.zero.tasks;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.a.c;
import com.tencent.mm.kernel.b.e;

public final class b
  extends c
{
  public b()
  {
    GMTrace.i(13628333883392L, 101539);
    GMTrace.o(13628333883392L, 101539);
  }
  
  public final void execute(e parame)
  {
    GMTrace.i(13628468101120L, 101540);
    k.b("wechatcommon", getClass().getClassLoader());
    GMTrace.o(13628468101120L, 101540);
  }
  
  public final String name()
  {
    GMTrace.i(13628602318848L, 101541);
    GMTrace.o(13628602318848L, 101541);
    return "boot-load-wechatcommon-library";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\zero\tasks\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */