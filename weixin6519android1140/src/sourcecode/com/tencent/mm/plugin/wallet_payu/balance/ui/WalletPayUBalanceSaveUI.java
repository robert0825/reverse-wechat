package com.tencent.mm.plugin.wallet_payu.balance.ui;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI;
import com.tencent.mm.plugin.wallet_payu.balance.a.a;
import com.tencent.mm.pluginsdk.wallet.g;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class WalletPayUBalanceSaveUI
  extends WalletBalanceSaveUI
{
  public WalletPayUBalanceSaveUI()
  {
    GMTrace.i(7936025821184L, 59128);
    GMTrace.o(7936025821184L, 59128);
  }
  
  protected final void bwQ()
  {
    GMTrace.i(7936294256640L, 59130);
    l(new a(this.oni, "ZAR"));
    GMTrace.o(7936294256640L, 59130);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7936428474368L, 59131);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramk instanceof a))) {
      g.a(this, ((a)paramk).eHG, "", 11, 1);
    }
    GMTrace.o(7936428474368L, 59131);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7936160038912L, 59129);
    super.onCreate(paramBundle);
    this.qTY.setVisibility(8);
    GMTrace.o(7936160038912L, 59129);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\balance\ui\WalletPayUBalanceSaveUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */