package com.tencent.mm.plugin.ipcall;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class d
{
  public static boolean aHT()
  {
    GMTrace.i(11731568951296L, 87407);
    if (at.AU())
    {
      if (g.ut().getInt("WCOEntranceSwitch", 0) > 0)
      {
        at.AR();
        c.xh().a(w.a.vsi, Boolean.valueOf(true));
        GMTrace.o(11731568951296L, 87407);
        return true;
      }
      at.AR();
      c.xh().a(w.a.vsi, Boolean.valueOf(false));
      GMTrace.o(11731568951296L, 87407);
      return false;
    }
    GMTrace.o(11731568951296L, 87407);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\ipcall\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */