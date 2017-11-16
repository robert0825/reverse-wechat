package com.tencent.mm.plugin.wallet_payu.pwd.ui;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.wallet_core.ui.formview.a;

public class WalletPayUPwdConfirmUI
  extends WalletPwdConfirmUI
{
  public WalletPayUPwdConfirmUI()
  {
    GMTrace.i(7959782359040L, 59305);
    GMTrace.o(7959782359040L, 59305);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7959916576768L, 59306);
    super.onCreate(paramBundle);
    a.a(this.qVS, false);
    GMTrace.o(7959916576768L, 59306);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pwd\ui\WalletPayUPwdConfirmUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */