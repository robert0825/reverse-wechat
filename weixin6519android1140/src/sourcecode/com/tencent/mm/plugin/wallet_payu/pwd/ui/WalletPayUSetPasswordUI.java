package com.tencent.mm.plugin.wallet_payu.pwd.ui;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.wallet_core.ui.formview.a;

public class WalletPayUSetPasswordUI
  extends WalletSetPasswordUI
{
  public WalletPayUSetPasswordUI()
  {
    GMTrace.i(7959111270400L, 59300);
    GMTrace.o(7959111270400L, 59300);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7959245488128L, 59301);
    super.onCreate(paramBundle);
    a.a(this.qVS, false);
    GMTrace.o(7959245488128L, 59301);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pwd\ui\WalletPayUSetPasswordUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */