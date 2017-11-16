package com.tencent.mm.plugin.wallet_payu.bind.ui;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_payu.bind.model.c;
import com.tencent.mm.plugin.wallet_payu.bind.model.d;

@com.tencent.mm.ui.base.a(3)
public class WalletPayUBankcardManageUI
  extends WalletBankcardManageUI
{
  public WalletPayUBankcardManageUI()
  {
    GMTrace.i(7922335612928L, 59026);
    GMTrace.o(7922335612928L, 59026);
  }
  
  protected final com.tencent.mm.plugin.wallet.bind.ui.a bwV()
  {
    GMTrace.i(7923006701568L, 59031);
    a locala = new a(this, this.qWC);
    GMTrace.o(7923006701568L, 59031);
    return locala;
  }
  
  protected final void bwW()
  {
    GMTrace.i(7922738266112L, 59029);
    com.tencent.mm.wallet_core.a.a(this, c.class, null);
    GMTrace.o(7922738266112L, 59029);
  }
  
  protected final void c(Bankcard paramBankcard)
  {
    GMTrace.i(7923140919296L, 59032);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("key_bankcard", paramBankcard);
    com.tencent.mm.wallet_core.a.a(this, d.class, localBundle);
    GMTrace.o(7923140919296L, 59032);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7922872483840L, 59030);
    if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.b.a))
    {
      bwX();
      GMTrace.o(7922872483840L, 59030);
      return true;
    }
    GMTrace.o(7922872483840L, 59030);
    return false;
  }
  
  protected final void iK(boolean paramBoolean)
  {
    GMTrace.i(7922604048384L, 59028);
    if (paramBoolean)
    {
      b(new com.tencent.mm.plugin.wallet_core.c.b.a(), false);
      GMTrace.o(7922604048384L, 59028);
      return;
    }
    r(new com.tencent.mm.plugin.wallet_core.c.b.a());
    GMTrace.o(7922604048384L, 59028);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7922469830656L, 59027);
    super.onCreate(paramBundle);
    GMTrace.o(7922469830656L, 59027);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\bind\ui\WalletPayUBankcardManageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */