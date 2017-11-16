package com.tencent.mm.booter;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bb.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class n
{
  private static long fJy;
  
  static
  {
    GMTrace.i(501034778624L, 3733);
    fJy = 86400000L;
    GMTrace.o(501034778624L, 3733);
  }
  
  public static void run()
  {
    GMTrace.i(500900560896L, 3732);
    at.AR();
    if (com.tencent.mm.platformtools.t.aG(Long.valueOf(com.tencent.mm.platformtools.t.c((Long)c.xh().get(81944, null))).longValue()) * 1000L > fJy) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        Object localObject = d.LX();
        d.LY();
        if (!((d)localObject).gqR)
        {
          h.xz();
          if (h.xy().isSDCardAvailable())
          {
            ((d)localObject).release();
            ((d)localObject).gqR = true;
            h.wS().a(159, (com.tencent.mm.ad.e)localObject);
            localObject = new com.tencent.mm.aw.k(9);
            h.wS().a((com.tencent.mm.ad.k)localObject, 0);
          }
        }
      }
      GMTrace.o(500900560896L, 3732);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\booter\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */