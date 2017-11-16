package com.tencent.mm.booter;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.h;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class m
{
  public static void run()
  {
    GMTrace.i(492981714944L, 3673);
    int i = g.ut().getInt("EnableFlockMultiProcSPProb", 0);
    at.AR();
    int j = h.aw(c.ww(), 101);
    if ((b.bPq()) || ((i > 0) && (j >= 0) && (j <= i))) {}
    for (boolean bool = true;; bool = false)
    {
      al.a.setValue(al.a.vjo, bool);
      w.i("MicroMsg.PostTaskUpdateMultiProcSPSwitchListener", "Update MMImgDecSwitch, userHash:%d, prob:%d, enabled: %b", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Boolean.valueOf(bool) });
      GMTrace.o(492981714944L, 3673);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\booter\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */