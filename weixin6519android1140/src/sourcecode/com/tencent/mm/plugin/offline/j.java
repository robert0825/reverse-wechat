package com.tencent.mm.plugin.offline;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.offline.a.g;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.List;

public class j
  extends com.tencent.mm.wallet_core.b
{
  public j()
  {
    GMTrace.i(6186631954432L, 46094);
    GMTrace.o(6186631954432L, 46094);
  }
  
  public final com.tencent.mm.wallet_core.b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6186766172160L, 46095);
    Object localObject;
    if (paramBundle != null) {
      if (!bg.nm(paramBundle.getString("key_trans_id"))) {
        localObject = "key_trans_id";
      }
    }
    for (;;)
    {
      h.xz();
      h.xx().fYr.a(new g("offlineshowpage", "push", (String)localObject), 0);
      c(paramActivity, WalletOrderInfoUI.class, paramBundle);
      h.xz();
      h.xy().xh().a(w.a.vvj, Boolean.valueOf(true));
      GMTrace.o(6186766172160L, 46095);
      return this;
      localObject = (Orders)paramBundle.getParcelable("key_orders");
      if ((localObject != null) && (((Orders)localObject).rhv != null) && (((Orders)localObject).rhv.size() > 0)) {
        localObject = ((Orders.Commodity)((Orders)localObject).rhv.get(0)).eRP;
      } else {
        localObject = "";
      }
    }
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(6186900389888L, 46096);
    if ((paramActivity instanceof WalletOrderInfoUI)) {
      B(paramActivity);
    }
    GMTrace.o(6186900389888L, 46096);
  }
  
  public final String aAd()
  {
    GMTrace.i(6187437260800L, 46100);
    GMTrace.o(6187437260800L, 46100);
    return "ShowOrderSuccessProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6187168825344L, 46098);
    ae(paramActivity);
    GMTrace.o(6187168825344L, 46098);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(6187034607616L, 46097);
    B(paramActivity);
    GMTrace.o(6187034607616L, 46097);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6187303043072L, 46099);
    GMTrace.o(6187303043072L, 46099);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */