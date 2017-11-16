package com.tencent.mm.plugin.fingerprint.b;

import android.content.Context;
import com.tencent.d.a.c.h;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.soter.b.e;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.lang.ref.WeakReference;

public final class l
  implements i
{
  private com.tencent.mm.pluginsdk.wallet.a lli;
  private com.tencent.mm.pluginsdk.wallet.a llj;
  private String llm;
  public WeakReference<WalletBaseUI> llz;
  
  public l()
  {
    GMTrace.i(10789092065280L, 80385);
    this.llz = null;
    this.lli = null;
    this.llm = "";
    this.llj = null;
    GMTrace.o(10789092065280L, 80385);
  }
  
  private void T(int paramInt, String paramString)
  {
    GMTrace.i(10789628936192L, 80389);
    w.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: callback total");
    clear();
    this.llj.R(paramInt, paramString);
    this.llj = null;
    GMTrace.o(10789628936192L, 80389);
  }
  
  public final void S(int paramInt, String paramString)
  {
    GMTrace.i(19595251417088L, 145996);
    if (this.lli != null) {
      this.lli.R(paramInt, paramString);
    }
    GMTrace.o(19595251417088L, 145996);
  }
  
  public final void a(Context paramContext, com.tencent.mm.pluginsdk.wallet.a parama, String paramString)
  {
    GMTrace.i(10789226283008L, 80386);
    w.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: prepare");
    this.llz = new WeakReference((WalletBaseUI)paramContext);
    this.lli = parama;
    this.llm = paramString;
    ((WalletBaseUI)this.llz.get()).hN(1586);
    ((WalletBaseUI)this.llz.get()).hN(1638);
    com.tencent.mm.plugin.soter.c.a.bqx();
    w.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: start gen auth key");
    com.tencent.d.b.a.a(new com.tencent.d.b.a.b() {}, true, 1, new com.tencent.mm.plugin.fingerprint.c.c(this.llm), new e());
    GMTrace.o(10789226283008L, 80386);
  }
  
  public final void a(com.tencent.mm.pluginsdk.wallet.a parama, String paramString, int paramInt)
  {
    GMTrace.i(10789763153920L, 80390);
    w.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: doOpenFP");
    this.llj = parama;
    parama = r.riJ.riL;
    if (parama != null)
    {
      if ((this.llz != null) && (this.llz.get() != null))
      {
        ((WalletBaseUI)this.llz.get()).l(new com.tencent.mm.plugin.fingerprint.c.b(parama.yaq, parama.signature, this.llm));
        GMTrace.o(10789763153920L, 80390);
      }
    }
    else
    {
      w.e("MicroMsg.SoterFingerprintOpenDelegate", "hy: signature is null");
      com.tencent.mm.plugin.soter.c.a.c(9, -1000223, -1, "signature is null");
      S(-1, ab.getContext().getString(a.i.sTp));
    }
    GMTrace.o(10789763153920L, 80390);
  }
  
  public final void clear()
  {
    GMTrace.i(10789360500736L, 80387);
    w.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: clear");
    if ((this.llz != null) && (this.llz.get() != null))
    {
      ((WalletBaseUI)this.llz.get()).hO(1586);
      ((WalletBaseUI)this.llz.get()).hO(1638);
    }
    this.lli = null;
    r.riJ.reset();
    if ((this.llz != null) && (this.llz.get() != null)) {
      this.llz.clear();
    }
    GMTrace.o(10789360500736L, 80387);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(10789494718464L, 80388);
    w.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: onSceneEnd: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    String str = paramString;
    if (bg.nm(paramString)) {
      str = ab.getContext().getString(a.i.sTp);
    }
    if ((paramk instanceof com.tencent.mm.plugin.fingerprint.c.a))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        w.i("MicroMsg.SoterFingerprintOpenDelegate", "get challenge success");
        if (bg.nm(((com.tencent.mm.plugin.fingerprint.c.a)paramk).llD))
        {
          S(-1, str);
          GMTrace.o(10789494718464L, 80388);
          return true;
        }
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(10774059679744L, 80273);
            l.this.S(0, "");
            GMTrace.o(10774059679744L, 80273);
          }
        });
      }
    }
    else
    {
      if (!(paramk instanceof com.tencent.mm.plugin.fingerprint.c.b)) {
        break label233;
      }
      if ((paramInt2 != 0) || (paramInt1 != 0)) {
        break label207;
      }
      w.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: open success");
      com.tencent.mm.plugin.soter.c.a.bqy();
      com.tencent.mm.plugin.soter.c.a.c(0, 0, 0, "OK");
      T(0, str);
    }
    for (;;)
    {
      GMTrace.o(10789494718464L, 80388);
      return true;
      w.e("MicroMsg.SoterFingerprintOpenDelegate", "hy: failed get challenge");
      S(paramInt2, str);
      com.tencent.mm.plugin.soter.c.a.c(7, paramInt1, paramInt2, "get challenge failed");
      GMTrace.o(10789494718464L, 80388);
      return true;
      label207:
      w.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: open");
      com.tencent.mm.plugin.soter.c.a.c(8, paramInt1, paramInt2, "open fp pay failed");
      T(-1, str);
    }
    label233:
    GMTrace.o(10789494718464L, 80388);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */