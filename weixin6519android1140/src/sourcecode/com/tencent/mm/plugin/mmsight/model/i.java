package com.tencent.mm.plugin.mmsight.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.af;

public final class i
{
  private static af mYY;
  
  static
  {
    GMTrace.i(7375264153600L, 54950);
    mYY = new af("MMSightHandler");
    GMTrace.o(7375264153600L, 54950);
  }
  
  public static void v(Runnable paramRunnable)
  {
    GMTrace.i(7374995718144L, 54948);
    mYY.A(paramRunnable);
    GMTrace.o(7374995718144L, 54948);
  }
  
  public static void w(Runnable paramRunnable)
  {
    GMTrace.i(7375129935872L, 54949);
    mYY.h(paramRunnable, 2000L);
    GMTrace.o(7375129935872L, 54949);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */