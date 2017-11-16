package com.tencent.mm.plugin.wallet_payu.pwd.ui;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;

@com.tencent.mm.ui.base.a(3)
public class WalletPayUCheckPwdUI
  extends WalletCheckPwdUI
{
  public WalletPayUCheckPwdUI()
  {
    GMTrace.i(7959379705856L, 59302);
    GMTrace.o(7959379705856L, 59302);
  }
  
  protected final boolean bxq()
  {
    GMTrace.i(7959648141312L, 59304);
    GMTrace.o(7959648141312L, 59304);
    return true;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7959513923584L, 59303);
    super.onCreate(paramBundle);
    com.tencent.mm.wallet_core.ui.formview.a.a(this.qVS, true);
    GMTrace.o(7959513923584L, 59303);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pwd\ui\WalletPayUCheckPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */