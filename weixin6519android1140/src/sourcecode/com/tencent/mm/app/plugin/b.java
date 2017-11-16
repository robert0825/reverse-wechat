package com.tencent.mm.app.plugin;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.sdk.platformtools.bg;

public final class b
{
  public static boolean pH()
  {
    GMTrace.i(13016569479168L, 96981);
    if (!d.LL("translate"))
    {
      GMTrace.o(13016569479168L, 96981);
      return false;
    }
    String str = g.ut().getValue("TranslateMsgOff");
    if (bg.nm(str))
    {
      GMTrace.o(13016569479168L, 96981);
      return true;
    }
    if (bg.Sy(str) != 0)
    {
      GMTrace.o(13016569479168L, 96981);
      return false;
    }
    GMTrace.o(13016569479168L, 96981);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\plugin\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */