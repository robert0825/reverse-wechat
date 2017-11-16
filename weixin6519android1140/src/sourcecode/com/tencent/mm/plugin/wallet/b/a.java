package com.tencent.mm.plugin.wallet.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet_core.model.ad;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public static boolean bxV()
  {
    GMTrace.i(7695641870336L, 57337);
    k localk = (k)h.h(k.class);
    Object localObject = new StringBuilder("mgr==null?");
    ad localad;
    StringBuilder localStringBuilder;
    if (localk == null)
    {
      bool = true;
      w.i("MicroMsg.WalletUtil", bool);
      if (localk != null) {
        w.i("MicroMsg.WalletUtil", " mgr.isSupportAndLoadSuccess()=" + localk.azF());
      }
      p.bxd();
      localObject = p.bxe();
      localad = ((af)localObject).byW();
      localStringBuilder = new StringBuilder("config==null?");
      if (localad != null) {
        break label218;
      }
    }
    label218:
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.WalletUtil", bool);
      if (localad != null) {
        w.i("MicroMsg.WalletUtil", "config.isSupportTouchPay()=" + localad.byM());
      }
      w.i("MicroMsg.WalletUtil", "userInfoManger.isReg()=" + ((af)localObject).byS());
      if ((localk == null) || (!localk.azF()) || (localad == null) || (!localad.byM()) || (!((af)localObject).byS())) {
        break label223;
      }
      GMTrace.o(7695641870336L, 57337);
      return true;
      bool = false;
      break;
    }
    label223:
    GMTrace.o(7695641870336L, 57337);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */