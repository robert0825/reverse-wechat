package com.tencent.mm.plugin.walletlock.b;

import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.rq;
import com.tencent.mm.g.a.so;
import com.tencent.mm.g.a.so.a;
import com.tencent.mm.plugin.walletlock.gesture.a.a;
import com.tencent.mm.plugin.walletlock.gesture.a.b;
import com.tencent.mm.plugin.walletlock.gesture.a.d;
import com.tencent.mm.plugin.walletlock.gesture.a.e;
import com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;

public final class f
{
  public com.tencent.mm.sdk.b.c ryV;
  public com.tencent.mm.sdk.b.c ryW;
  private com.tencent.mm.sdk.b.c ryX;
  public com.tencent.mm.sdk.b.c ryY;
  
  public f()
  {
    GMTrace.i(20247549575168L, 150856);
    this.ryV = new c();
    this.ryW = new com.tencent.mm.sdk.b.c() {};
    this.ryX = new com.tencent.mm.sdk.b.c()
    {
      private static boolean a(so paramAnonymousso)
      {
        GMTrace.i(20251978760192L, 150889);
        w.v("MicroMsg.WalletLockInitTask", "alvinluo gestureprotectListener request: %d, verfiyMaskOnCreate: %b, verfiyMaskOnResume: %b", new Object[] { Integer.valueOf(paramAnonymousso.eXS.eXU), Boolean.valueOf(i.rze.bBg()), Boolean.valueOf(i.rze.bBh()) });
        switch (paramAnonymousso.eXS.eXU)
        {
        }
        for (;;)
        {
          paramAnonymousso.eXS.activity = null;
          GMTrace.o(20251978760192L, 150889);
          return false;
          long l1;
          long l2;
          if (!(paramAnonymousso.eXS.activity instanceof GestureGuardLogicUI))
          {
            if (!i.rze.bBg())
            {
              l1 = d.bAy();
              l2 = (SystemClock.elapsedRealtime() - l1) / 1000L;
              if ((l1 == -1L) || (l2 >= a.rxB) || ((b.bAH()) && (b.bAG())))
              {
                w.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONCREATE indicates needs verify.");
                paramAnonymousso.eXT.data = Integer.valueOf(17);
              }
              else
              {
                w.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONCREATE indicates need not verify.");
                paramAnonymousso.eXT.data = Integer.valueOf(16);
                i.rze.a(new WeakReference(paramAnonymousso.eXS.activity));
              }
            }
            else
            {
              w.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONCREATE indicates need not verify.");
              paramAnonymousso.eXT.data = Integer.valueOf(16);
              i.rze.a(new WeakReference(paramAnonymousso.eXS.activity));
              i.rze.jl(false);
            }
          }
          else
          {
            w.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONCREATE indicates need not verify.");
            paramAnonymousso.eXT.data = Integer.valueOf(16);
            continue;
            if (!(paramAnonymousso.eXS.activity instanceof GestureGuardLogicUI))
            {
              if (i.rze.bBg())
              {
                w.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONRESUME indicates need not verify.");
                i.rze.jl(false);
                i.rze.jm(false);
                paramAnonymousso.eXT.data = Integer.valueOf(16);
              }
              else if (i.rze.bBh())
              {
                w.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONRESUME indicates reenter.");
                i.rze.jl(false);
                i.rze.jm(false);
                paramAnonymousso.eXT.data = Integer.valueOf(18);
              }
              else
              {
                l1 = d.bAy();
                l2 = (SystemClock.elapsedRealtime() - l1) / 1000L;
                if (((l1 == -1L) || (l2 >= a.rxB) || (b.bAH())) && (b.bAG())) {
                  w.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONRESUME indicates needs verify.");
                }
                for (paramAnonymousso.eXT.data = Integer.valueOf(17);; paramAnonymousso.eXT.data = Integer.valueOf(16))
                {
                  i.rze.a(new WeakReference(paramAnonymousso.eXS.activity));
                  break;
                  w.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONRESUME indicates need not verify.");
                }
              }
            }
            else
            {
              w.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONRESUME indicates need not verify.");
              paramAnonymousso.eXT.data = Integer.valueOf(16);
              continue;
              i.rze.bBi();
              continue;
              paramAnonymousso.eXT.data = Boolean.valueOf(e.bAG());
              continue;
              paramAnonymousso.eXT.data = Boolean.valueOf(b.bAH());
            }
          }
        }
      }
    };
    this.ryY = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(20247549575168L, 150856);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\walletlock\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */