package com.tencent.mm.plugin.walletlock.b;

import android.app.Activity;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.walletlock.a.b.a;
import com.tencent.mm.plugin.walletlock.a.b.b;
import com.tencent.mm.plugin.walletlock.gesture.a.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;

public final class e
  extends a
{
  private static com.tencent.mm.plugin.walletlock.a.b ryU;
  
  public e()
  {
    GMTrace.i(20249831276544L, 150873);
    GMTrace.o(20249831276544L, 150873);
  }
  
  private static void bAZ()
  {
    GMTrace.i(20250099712000L, 150875);
    w.i("MicroMsg.WalletLockImpl", "alvinluo WalletLock init end, wallet lock type: %d", new Object[] { Integer.valueOf(g.rza.bBa()) });
    GMTrace.o(20250099712000L, 150875);
  }
  
  public final void L(Activity paramActivity)
  {
    GMTrace.i(20250770800640L, 150880);
    if (ryU != null) {
      ryU.L(paramActivity);
    }
    GMTrace.o(20250770800640L, 150880);
  }
  
  public final void a(Activity paramActivity, b.b paramb)
  {
    GMTrace.i(20250233929728L, 150876);
    if (ryU != null) {
      ryU.a(paramActivity, paramb);
    }
    GMTrace.o(20250233929728L, 150876);
  }
  
  public final void a(Activity paramActivity, b.b paramb, b.a parama)
  {
    GMTrace.i(20250368147456L, 150877);
    if (ryU != null) {
      ryU.a(paramActivity, paramb, parama);
    }
    GMTrace.o(20250368147456L, 150877);
  }
  
  public final void b(Activity paramActivity, int paramInt1, int paramInt2)
  {
    GMTrace.i(20250636582912L, 150879);
    super.b(paramActivity, paramInt1, paramInt2);
    GMTrace.o(20250636582912L, 150879);
  }
  
  public final void b(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    GMTrace.i(20251576107008L, 150886);
    if (ryU != null)
    {
      ryU.b(paramActivity, paramIntent, paramInt);
      GMTrace.o(20251576107008L, 150886);
      return;
    }
    super.b(paramActivity, paramIntent, paramInt);
    GMTrace.o(20251576107008L, 150886);
  }
  
  public final b.b bAq()
  {
    GMTrace.i(20251039236096L, 150882);
    if (ryU != null)
    {
      b.b localb = ryU.bAq();
      GMTrace.o(20251039236096L, 150882);
      return localb;
    }
    GMTrace.o(20251039236096L, 150882);
    return null;
  }
  
  public final boolean bAr()
  {
    GMTrace.i(20251173453824L, 150883);
    g localg = g.rza;
    if (!g.bAG())
    {
      localg = g.rza;
      if (!g.bAv()) {}
    }
    else
    {
      GMTrace.o(20251173453824L, 150883);
      return true;
    }
    GMTrace.o(20251173453824L, 150883);
    return false;
  }
  
  public final boolean bAs()
  {
    GMTrace.i(20251307671552L, 150884);
    if (ryU != null)
    {
      boolean bool = ryU.bAs();
      GMTrace.o(20251307671552L, 150884);
      return bool;
    }
    GMTrace.o(20251307671552L, 150884);
    return false;
  }
  
  public final void c(Activity paramActivity, Intent paramIntent)
  {
    GMTrace.i(20251441889280L, 150885);
    if (ryU != null)
    {
      ryU.c(paramActivity, paramIntent);
      GMTrace.o(20251441889280L, 150885);
      return;
    }
    super.c(paramActivity, paramIntent);
    GMTrace.o(20251441889280L, 150885);
  }
  
  public final void h(Activity paramActivity, int paramInt)
  {
    GMTrace.i(20250502365184L, 150878);
    super.h(paramActivity, paramInt);
    GMTrace.o(20250502365184L, 150878);
  }
  
  public final void i(Activity paramActivity, int paramInt)
  {
    GMTrace.i(20250905018368L, 150881);
    Intent localIntent = new Intent();
    localIntent.putExtra("action", "action.close_wallet_lock");
    d.b(paramActivity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", localIntent, paramInt);
    GMTrace.o(20250905018368L, 150881);
  }
  
  public final void init()
  {
    GMTrace.i(20249965494272L, 150874);
    w.i("MicroMsg.WalletLockImpl", "alvinluo WalletLock init start, call stack: %s", new Object[] { bg.f(new Throwable()) });
    int i = bg.m(com.tencent.mm.kernel.h.xy().xh().get(40, null), 0);
    w.i("MicroMsg.WalletLockImpl", "alvinluo pluginSwitch %d %d", new Object[] { Integer.valueOf(i), Integer.valueOf(0x800000 & i) });
    Object localObject;
    if ((i & 0x800000) != 0)
    {
      w.i("MicroMsg.WalletLockImpl", "alvinluo fingerprint wallet lock is opened");
      localObject = new com.tencent.mm.plugin.walletlock.fingerprint.a.b();
      ryU = (com.tencent.mm.plugin.walletlock.a.b)localObject;
      ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
      localObject = g.rza;
      boolean bool = g.bBb();
      w.i("MicroMsg.WalletLockImpl", "alvinluo init isSupportSoter: %b, isSupportFingerprintLock: %b", new Object[] { Boolean.valueOf(com.tencent.mm.plugin.soter.c.h.bqF()), Boolean.valueOf(bool) });
      if ((com.tencent.mm.plugin.walletlock.gesture.a.b.bAG()) && (!bool))
      {
        bool = com.tencent.mm.kernel.h.xy().xh().getBoolean(w.a.vzr, false);
        w.i("MicroMsg.WalletLockImpl", "alvinluo has opened fingerprint lock, but device not support soter, and use gesture, isAutoJumpToGesture: %b", new Object[] { Boolean.valueOf(bool) });
        if (bool)
        {
          localObject = new c();
          ryU = (com.tencent.mm.plugin.walletlock.a.b)localObject;
          ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
          bAZ();
          GMTrace.o(20249965494272L, 150874);
        }
      }
    }
    else
    {
      if (!com.tencent.mm.plugin.walletlock.gesture.a.b.bAG()) {
        break label271;
      }
      w.i("MicroMsg.WalletLockImpl", "alvinluo gesture wallet lock is opened");
      localObject = new c();
      ryU = (com.tencent.mm.plugin.walletlock.a.b)localObject;
      ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
      localObject = g.rza;
      g.jj(false);
    }
    for (;;)
    {
      bAZ();
      GMTrace.o(20249965494272L, 150874);
      return;
      label271:
      w.i("MicroMsg.WalletLockImpl", "alvinluo wallet lock is not open");
      ryU = new a();
      g.rza.ji(false);
      ryU.init();
    }
  }
  
  public final void xc(int paramInt)
  {
    GMTrace.i(20251710324736L, 150887);
    Object localObject;
    if (paramInt == 1)
    {
      w.i("MicroMsg.WalletLockImpl", "alvinluo wallet lock switch to gesture");
      localObject = new c();
      ryU = (com.tencent.mm.plugin.walletlock.a.b)localObject;
      ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
      localObject = g.rza;
      g.jj(true);
      GMTrace.o(20251710324736L, 150887);
      return;
    }
    if (paramInt == 2)
    {
      w.i("MicroMsg.WalletLockImpl", "alvinluo wallet lock switch to fingerprint lock");
      localObject = new com.tencent.mm.plugin.walletlock.fingerprint.a.b();
      ryU = (com.tencent.mm.plugin.walletlock.a.b)localObject;
      ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
      localObject = g.rza;
      g.jg(false);
      GMTrace.o(20251710324736L, 150887);
      return;
    }
    if (paramInt == 0)
    {
      w.i("MicroMsg.WalletLockImpl", "alvinluo wallet lock switch to none");
      localObject = new a();
      ryU = (com.tencent.mm.plugin.walletlock.a.b)localObject;
      ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
      g.rza.ji(true);
      GMTrace.o(20251710324736L, 150887);
      return;
    }
    w.e("MicroMsg.WalletLockImpl", "alvinluo unknown wallet lock type, ignore switch");
    GMTrace.o(20251710324736L, 150887);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\walletlock\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */