package com.tencent.mm.booter;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class h
{
  public static boolean rv()
  {
    GMTrace.i(496471375872L, 3699);
    try
    {
      at.AR();
      com.tencent.mm.platformtools.t.d((Long)c.xh().get(66817, null));
      if (com.tencent.mm.platformtools.t.aG(0L) * 1000L > 1800000L)
      {
        GMTrace.o(496471375872L, 3699);
        return true;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.PostTaskMediaNoteStat", localException, "", new Object[0]);
      }
      GMTrace.o(496471375872L, 3699);
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\booter\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */