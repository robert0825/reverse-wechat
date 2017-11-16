package com.tencent.mm.plugin.webview.modelcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;

public final class m
{
  public static void ek(long paramLong)
  {
    GMTrace.i(12360647442432L, 92094);
    g.ork.a(238L, paramLong, 1L, false);
    GMTrace.o(12360647442432L, 92094);
  }
  
  public static void xA(int paramInt)
  {
    GMTrace.i(12360513224704L, 92093);
    if (2 == paramInt) {
      paramInt = 11;
    }
    for (;;)
    {
      if (-1 == paramInt)
      {
        GMTrace.o(12360513224704L, 92093);
        return;
        if (1 == paramInt) {
          paramInt = 10;
        }
      }
      else
      {
        g.ork.a(238L, paramInt, 1L, false);
        GMTrace.o(12360513224704L, 92093);
        return;
      }
      paramInt = -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modelcache\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */