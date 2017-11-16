package com.tencent.mm.plugin.walletlock.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;

public final class h
{
  private static long sessionId;
  
  static
  {
    GMTrace.i(20980244152320L, 156315);
    sessionId = -1L;
    GMTrace.o(20980244152320L, 156315);
  }
  
  public static void R(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(20980109934592L, 156314);
    if (sessionId == -1L)
    {
      w.e("MicroMsg.WalletLockReportManager", "alvinluo wallet lock report sessionId is -1, not create session, ignore");
      GMTrace.o(20980109934592L, 156314);
      return;
    }
    if (paramInt1 == -1)
    {
      GMTrace.o(20980109934592L, 156314);
      return;
    }
    w.i("MicroMsg.WalletLockReportManager", "alvinluo reportVerifyWalletLock session: %d, protectScene: %d, walletLockType: %d, result: %d", new Object[] { Long.valueOf(sessionId), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    g.ork.i(14839, new Object[] { Long.valueOf(sessionId), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    GMTrace.o(20980109934592L, 156314);
  }
  
  public static void bBd()
  {
    GMTrace.i(20979707281408L, 156311);
    w.i("MicroMsg.WalletLockReportManager", "alvinluo idkey report fingerprintlock verify by passwd success");
    g.ork.a(713L, 2L, 1L, false);
    GMTrace.o(20979707281408L, 156311);
  }
  
  public static void bBe()
  {
    GMTrace.i(20979841499136L, 156312);
    w.i("MicroMsg.WalletLockReportManager", "alvinluo idkey report close wallet lock success");
    g.ork.a(713L, 3L, 1L, false);
    GMTrace.o(20979841499136L, 156312);
  }
  
  public static void bBf()
  {
    GMTrace.i(20979975716864L, 156313);
    sessionId = System.currentTimeMillis();
    w.i("MicroMsg.WalletLockReportManager", "alvinluo wallet lock report create session: %d", new Object[] { Long.valueOf(sessionId) });
    GMTrace.o(20979975716864L, 156313);
  }
  
  public static void dB(int paramInt1, int paramInt2)
  {
    GMTrace.i(20249562841088L, 150871);
    switch (paramInt2)
    {
    default: 
      paramInt1 = -1;
    }
    for (;;)
    {
      if (paramInt1 != -1)
      {
        w.i("MicroMsg.WalletLockReportManager", "alvinluo wallet lock idkey report id: %d, key: %d, value: %d", new Object[] { Integer.valueOf(713), Integer.valueOf(paramInt1), Long.valueOf(1L) });
        g.ork.a(713L, paramInt1, 1L, false);
      }
      GMTrace.o(20249562841088L, 150871);
      return;
      if (paramInt1 == 3)
      {
        paramInt1 = 4;
        continue;
        paramInt1 = 5;
        continue;
        paramInt1 = 6;
      }
      else
      {
        paramInt1 = -1;
      }
    }
  }
  
  public static void jk(boolean paramBoolean)
  {
    GMTrace.i(20249697058816L, 150872);
    w.i("MicroMsg.WalletLockReportManager", "alvinluo idkey fingerprint open result: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    g localg = g.ork;
    if (paramBoolean) {}
    for (long l = 0L;; l = 1L)
    {
      localg.a(713L, l, 1L, false);
      GMTrace.o(20249697058816L, 150872);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\walletlock\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */