package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.sj;
import com.tencent.mm.g.a.sj.a;
import com.tencent.mm.g.a.sj.b;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wallet_core.c.a.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;

public final class j
  extends c<sj>
{
  public j()
  {
    GMTrace.i(19536866705408L, 145561);
    this.vhf = sj.class.getName().hashCode();
    GMTrace.o(19536866705408L, 145561);
  }
  
  private static void a(sj paramsj, com.tencent.mm.ad.e parame)
  {
    GMTrace.i(19537000923136L, 145562);
    w.i("MicroMsg.HandleWCPayWalletBufferListener", "do check pay jsapi");
    h.xz();
    h.xx().fYr.a(1767, parame);
    paramsj = paramsj.eXj;
    w.i("MicroMsg.HandleWCPayWalletBufferListener", "appId: %s, \nnonce: %s, \ntimestamp: %s, \npackage: %s, \nsign: %s, \nsignType: %s, \nurl: %s", new Object[] { paramsj.appId, paramsj.nonceStr, paramsj.eDJ, paramsj.eXl, paramsj.eXm, paramsj.signType, paramsj.url });
    paramsj = new a(paramsj.appId, paramsj.nonceStr, paramsj.eDJ, paramsj.eXl, paramsj.eXm, paramsj.signType, paramsj.url);
    h.xz();
    h.xx().fYr.a(paramsj, 0);
    GMTrace.o(19537000923136L, 145562);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */