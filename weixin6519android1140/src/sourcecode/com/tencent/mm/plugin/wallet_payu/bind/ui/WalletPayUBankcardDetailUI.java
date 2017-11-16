package com.tencent.mm.plugin.wallet_payu.bind.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.i;

public class WalletPayUBankcardDetailUI
  extends WalletBankcardDetailUI
{
  public WalletPayUBankcardDetailUI()
  {
    GMTrace.i(7918040645632L, 58994);
    GMTrace.o(7918040645632L, 58994);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7918174863360L, 58995);
    super.onCreate(paramBundle);
    if (1 == this.qUE.field_bankcardState)
    {
      bwT();
      findViewById(a.f.sIw).setVisibility(8);
      findViewById(a.f.sIv).setVisibility(8);
    }
    for (;;)
    {
      findViewById(a.f.sIy).setVisibility(8);
      ((TextView)findViewById(a.f.sIA)).setText(a.i.sZO);
      GMTrace.o(7918174863360L, 58995);
      return;
      iI(false);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\bind\ui\WalletPayUBankcardDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */