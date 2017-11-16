package com.tencent.mm.plugin.wallet_payu.pwd.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI;
import com.tencent.mm.plugin.wallet_payu.pwd.a.g;
import com.tencent.mm.plugin.wxpay.a.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.wallet_core.a;

public class WalletPayUPasswordSettingUI
  extends WalletPasswordSettingUI
{
  public WalletPayUPasswordSettingUI()
  {
    GMTrace.i(7958440181760L, 59295);
    GMTrace.o(7958440181760L, 59295);
  }
  
  protected final int bxR()
  {
    GMTrace.i(7958977052672L, 59299);
    int i = a.l.tkc;
    GMTrace.o(7958977052672L, 59299);
    return i;
  }
  
  protected final void bxS()
  {
    GMTrace.i(7958708617216L, 59297);
    w.d("MicroMsg.WalletPayUPasswordSettingUI", "hy: start payu reset pwd");
    a.a(this, g.class, null);
    GMTrace.o(7958708617216L, 59297);
  }
  
  protected final void bxT()
  {
    GMTrace.i(7958574399488L, 59296);
    w.d("MicroMsg.WalletPayUPasswordSettingUI", "hy: start payu do forgot pwd");
    a.a(this, com.tencent.mm.plugin.wallet_payu.pwd.a.f.class, null);
    GMTrace.o(7958574399488L, 59296);
  }
  
  protected final void bxU()
  {
    GMTrace.i(7958842834944L, 59298);
    this.wky.bc("wallet_modify_gesture_password", true);
    this.wky.bc("wallet_open_gesture_password", true);
    GMTrace.o(7958842834944L, 59298);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pwd\ui\WalletPayUPasswordSettingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */