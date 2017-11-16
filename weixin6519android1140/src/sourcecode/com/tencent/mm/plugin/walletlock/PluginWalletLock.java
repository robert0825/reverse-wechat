package com.tencent.mm.plugin.walletlock;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.api.c;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.messenger.foundation.a.q;
import com.tencent.mm.plugin.messenger.foundation.a.s;
import com.tencent.mm.plugin.walletlock.a.b;
import com.tencent.mm.plugin.walletlock.b.f;
import com.tencent.mm.plugin.walletlock.b.i;
import com.tencent.mm.protocal.c.apk;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;

public class PluginWalletLock
  extends com.tencent.mm.kernel.b.d
  implements c, com.tencent.mm.plugin.walletlock.a.a
{
  private f rvG;
  
  public PluginWalletLock()
  {
    GMTrace.i(20215203102720L, 150615);
    this.rvG = null;
    GMTrace.o(20215203102720L, 150615);
  }
  
  public void configure(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(20215605755904L, 150618);
    if (parame.eR(""))
    {
      w.i("MicroMsg.PluginWalletLock", "alvinluo registerService IWalletLock and add listeners");
      h.a(b.class, new com.tencent.mm.kernel.c.d(new com.tencent.mm.plugin.walletlock.b.e()));
      s.a(1, new a());
    }
    GMTrace.o(20215605755904L, 150618);
  }
  
  public void dependency()
  {
    GMTrace.i(20215471538176L, 150617);
    dependsOn(com.tencent.mm.plugin.soter.a.a.class);
    GMTrace.o(20215471538176L, 150617);
  }
  
  public void execute(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(20215739973632L, 150619);
    GMTrace.o(20215739973632L, 150619);
  }
  
  public void installed()
  {
    GMTrace.i(20215337320448L, 150616);
    alias(com.tencent.mm.plugin.walletlock.a.a.class);
    GMTrace.o(20215337320448L, 150616);
  }
  
  public String name()
  {
    GMTrace.i(20215874191360L, 150620);
    GMTrace.o(20215874191360L, 150620);
    return "plugin-wallet-lock";
  }
  
  public void onAccountInitialized(e.f paramf)
  {
    GMTrace.i(20216008409088L, 150621);
    w.i("MicroMsg.PluginWalletLock", "alvinluo PluginWalletLock onAccountInitialized");
    this.rvG = new f();
    paramf = this.rvG;
    if (!com.tencent.mm.sdk.b.a.vgX.d(paramf.ryV)) {
      com.tencent.mm.sdk.b.a.vgX.b(paramf.ryV);
    }
    if (!com.tencent.mm.sdk.b.a.vgX.d(paramf.ryW)) {
      com.tencent.mm.sdk.b.a.vgX.b(paramf.ryW);
    }
    if (!com.tencent.mm.sdk.b.a.vgX.d(paramf.ryY)) {
      com.tencent.mm.sdk.b.a.vgX.b(paramf.ryY);
    }
    try
    {
      paramf = ((com.tencent.mm.plugin.zero.b.a)h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("PatternLockTimeInterval");
      if (!bg.nm(paramf))
      {
        int i = bg.getInt(paramf, 0);
        if (i >= 0)
        {
          w.d("MicroMsg.WalletLockInitTask", String.format("Dynamic config for PatternLockInterval override default config, newval=%d", new Object[] { Integer.valueOf(i) }));
          com.tencent.mm.plugin.walletlock.gesture.a.a.rxB = i;
          ((b)h.h(b.class)).init();
          GMTrace.o(20216008409088L, 150621);
          return;
        }
      }
    }
    catch (Exception paramf)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.WalletLockInitTask", paramf, "", new Object[0]);
        paramf = null;
        continue;
        w.d("MicroMsg.WalletLockInitTask", "PatternLockInterval keeps default value.");
        com.tencent.mm.plugin.walletlock.gesture.a.a.rxB = 300;
        continue;
        w.d("MicroMsg.WalletLockInitTask", "PatternLockInterval keeps default value.");
        com.tencent.mm.plugin.walletlock.gesture.a.a.rxB = 300;
      }
    }
  }
  
  public void onAccountRelease()
  {
    GMTrace.i(20216142626816L, 150622);
    w.i("MicroMsg.PluginWalletLock", "alvinluo PluginWalletLock onAccountRelease");
    if (this.rvG != null)
    {
      Object localObject = this.rvG;
      if (com.tencent.mm.sdk.b.a.vgX.d(((f)localObject).ryV)) {
        com.tencent.mm.sdk.b.a.vgX.c(((f)localObject).ryV);
      }
      if (com.tencent.mm.sdk.b.a.vgX.d(((f)localObject).ryW)) {
        com.tencent.mm.sdk.b.a.vgX.c(((f)localObject).ryW);
      }
      if (com.tencent.mm.sdk.b.a.vgX.d(((f)localObject).ryY)) {
        com.tencent.mm.sdk.b.a.vgX.c(((f)localObject).ryY);
      }
      localObject = i.rze;
      if (((i)localObject).rzi != null) {
        ((i)localObject).rzi.clear();
      }
    }
    GMTrace.o(20216142626816L, 150622);
  }
  
  private final class a
    implements q<apk>
  {
    public a()
    {
      GMTrace.i(20254663114752L, 150909);
      GMTrace.o(20254663114752L, 150909);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\walletlock\PluginWalletLock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */