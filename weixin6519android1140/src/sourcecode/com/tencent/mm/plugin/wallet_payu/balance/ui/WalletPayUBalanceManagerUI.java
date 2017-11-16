package com.tencent.mm.plugin.wallet_payu.balance.ui;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI;
import com.tencent.mm.plugin.wallet_core.c.b.a;
import com.tencent.mm.plugin.wallet_core.model.af;

public class WalletPayUBalanceManagerUI
  extends WalletBalanceManagerUI
{
  public WalletPayUBalanceManagerUI()
  {
    GMTrace.i(7936562692096L, 59132);
    GMTrace.o(7936562692096L, 59132);
  }
  
  protected final void bwL()
  {
    GMTrace.i(7936831127552L, 59134);
    p.bxd();
    if (p.bxe().qUy == null) {}
    for (boolean bool = true;; bool = false)
    {
      b(new a(), bool);
      GMTrace.o(7936831127552L, 59134);
      return;
    }
  }
  
  protected final void bwM()
  {
    GMTrace.i(7937099563008L, 59136);
    z(WalletPayUBalanceSaveUI.class);
    GMTrace.o(7937099563008L, 59136);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7936965345280L, 59135);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramk instanceof a))) {
      ar();
    }
    GMTrace.o(7936965345280L, 59135);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7936696909824L, 59133);
    super.onCreate(paramBundle);
    GMTrace.o(7936696909824L, 59133);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\balance\ui\WalletPayUBalanceManagerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */