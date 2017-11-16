package com.tencent.mm.plugin.fingerprint.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.wallet.a;
import com.tencent.mm.pluginsdk.wallet.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class m
  implements j
{
  public m()
  {
    GMTrace.i(10791373766656L, 80402);
    GMTrace.o(10791373766656L, 80402);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(10791507984384L, 80403);
    w.i("MicroMsg.SoterPrePayAuthDelegate", "hy: pre auth prepare.");
    if (bg.nm(r.riJ.llD))
    {
      w.e("MicroMsg.SoterPrePayAuthDelegate", "hy: no challenge. failed.");
      parama.R(-1, "no challenge");
      GMTrace.o(10791507984384L, 80403);
      return;
    }
    parama.R(0, "");
    GMTrace.o(10791507984384L, 80403);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */