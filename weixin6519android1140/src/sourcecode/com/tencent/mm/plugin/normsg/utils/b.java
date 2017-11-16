package com.tencent.mm.plugin.normsg.utils;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public static boolean nxM;
  
  static
  {
    GMTrace.i(17526687793152L, 130584);
    nxM = false;
    long l = System.nanoTime();
    try
    {
      nxM = NativeLogic.aUs();
      w.i("MicroMsg.NormalMsgSource.DADH", "CDA, result: %b, time: %d ns", new Object[] { Boolean.valueOf(nxM), Long.valueOf(System.nanoTime() - l) });
      GMTrace.o(17526687793152L, 130584);
      return;
    }
    catch (Throwable localThrowable)
    {
      w.printErrStackTrace("MicroMsg.NormalMsgSource.DADH", localThrowable, "unexpected exception.", new Object[0]);
      nxM = false;
      w.i("MicroMsg.NormalMsgSource.DADH", "CDA, result: %b, time: %d ns", new Object[] { Boolean.valueOf(nxM), Long.valueOf(System.nanoTime() - l) });
      GMTrace.o(17526687793152L, 130584);
      return;
    }
    finally
    {
      w.i("MicroMsg.NormalMsgSource.DADH", "CDA, result: %b, time: %d ns", new Object[] { Boolean.valueOf(nxM), Long.valueOf(System.nanoTime() - l) });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\normsg\utils\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */