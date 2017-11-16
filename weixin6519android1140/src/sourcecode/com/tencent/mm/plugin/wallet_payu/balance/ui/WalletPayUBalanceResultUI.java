package com.tencent.mm.plugin.wallet_payu.balance.ui;

import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.wallet_core.ui.e;

public class WalletPayUBalanceResultUI
  extends WalletBalanceResultUI
{
  public WalletPayUBalanceResultUI()
  {
    GMTrace.i(7935623168000L, 59125);
    GMTrace.o(7935623168000L, 59125);
  }
  
  protected final void MP()
  {
    GMTrace.i(7935757385728L, 59126);
    super.MP();
    this.qUD.setVisibility(8);
    GMTrace.o(7935757385728L, 59126);
  }
  
  protected final void ar()
  {
    GMTrace.i(7935891603456L, 59127);
    if (this.opK != null)
    {
      this.qUB.setText(e.d(this.opK.rhd, this.opK.nEr));
      if ((this.qUE != null) && (!bg.nm(this.qUE.field_bankName)))
      {
        if (!bg.nm(this.qUE.field_bankcardTail))
        {
          this.ojD.setText(this.qUE.field_bankName + " " + getString(a.i.tev) + this.qUE.field_bankcardTail);
          GMTrace.o(7935891603456L, 59127);
          return;
        }
        this.ojD.setText(this.qUE.field_bankName);
      }
    }
    GMTrace.o(7935891603456L, 59127);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\balance\ui\WalletPayUBalanceResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */