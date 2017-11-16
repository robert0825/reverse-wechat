package com.tencent.mm.plugin.h;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.a.c;
import com.tencent.mm.kernel.b.e;

public final class a
  extends c
{
  public a()
  {
    GMTrace.i(5215700910080L, 38860);
    GMTrace.o(5215700910080L, 38860);
  }
  
  public final void execute(e parame)
  {
    GMTrace.i(5215835127808L, 38861);
    k.b("FFmpeg", getClass().getClassLoader());
    k.b("wechatpack", getClass().getClassLoader());
    GMTrace.o(5215835127808L, 38861);
  }
  
  public final String name()
  {
    GMTrace.i(5215969345536L, 38862);
    GMTrace.o(5215969345536L, 38862);
    return "boot-load-FFmpeg-and-wechatpack-libraries";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\h\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */