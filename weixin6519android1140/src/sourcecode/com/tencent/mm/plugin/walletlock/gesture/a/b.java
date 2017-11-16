package com.tencent.mm.plugin.walletlock.gesture.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;

public final class b
{
  public static boolean bAG()
  {
    GMTrace.i(20244462567424L, 150833);
    boolean bool = ((Boolean)h.xy().xh().get(w.a.vzo, Boolean.valueOf(false))).booleanValue();
    GMTrace.o(20244462567424L, 150833);
    return bool;
  }
  
  public static boolean bAH()
  {
    GMTrace.i(20244596785152L, 150834);
    g localg = d.bAI();
    w.v("MicroMsg.GestureUtil", "alvinluo timeInfo: %d, %d", new Object[] { Long.valueOf(localg.rxG), Long.valueOf(localg.rxH) });
    if (localg.rxG != -1L)
    {
      e.a(localg);
      if (localg.rxH / 1000L < 600L)
      {
        d.x(localg.rxG, localg.rxH);
        GMTrace.o(20244596785152L, 150834);
        return true;
      }
      d.bAJ();
    }
    GMTrace.o(20244596785152L, 150834);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\walletlock\gesture\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */