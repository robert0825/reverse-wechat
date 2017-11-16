package com.tencent.mm.booter;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.h;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class l
{
  public static void run()
  {
    GMTrace.i(497142464512L, 3704);
    int i = g.ut().getInt("EnableMMBitmapFactoryProb", 0);
    at.AR();
    int j = h.aw(c.ww(), 100);
    if ((b.bPq()) || ((i > 0) && (j >= 0) && (j <= i))) {}
    for (boolean bool = true;; bool = false)
    {
      MMBitmapFactory.setUseMMBitmapFactory(bool);
      w.i("MicroMsg.PostTaskUpdateMMImgDecSwitch", "Update MMImgDecSwitch, userHash:%d, prob:%d, enabled: %b", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Boolean.valueOf(bool) });
      GMTrace.o(497142464512L, 3704);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\booter\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */