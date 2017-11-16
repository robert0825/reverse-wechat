package com.tencent.mm.plugin.wallet_payu.create.ui;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.sdk.platformtools.w;

@com.tencent.mm.ui.base.a(3)
public class WalletPayUVerifyCodeUI
  extends WalletVerifyCodeUI
{
  public WalletPayUVerifyCodeUI()
  {
    GMTrace.i(7950789771264L, 59238);
    GMTrace.o(7950789771264L, 59238);
  }
  
  protected final boolean bxq()
  {
    GMTrace.i(7951595077632L, 59244);
    GMTrace.o(7951595077632L, 59244);
    return true;
  }
  
  public final void bzV()
  {
    GMTrace.i(7951326642176L, 59242);
    this.rpO = 180000;
    GMTrace.o(7951326642176L, 59242);
  }
  
  protected final void bzW()
  {
    GMTrace.i(7951058206720L, 59240);
    super.bzW();
    GMTrace.o(7951058206720L, 59240);
  }
  
  protected final void bzX()
  {
    GMTrace.i(7951192424448L, 59241);
    super.bzX();
    GMTrace.o(7951192424448L, 59241);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7951460859904L, 59243);
    if (((paramk instanceof com.tencent.mm.plugin.wallet_payu.a.a)) && (!((com.tencent.mm.plugin.wallet_payu.a.a)paramk).ruc)) {
      w.w("MicroMsg.WalletPayUVerifyCodeUI", "hy: confirm code not verified");
    }
    GMTrace.o(7951460859904L, 59243);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7950923988992L, 59239);
    super.onCreate(paramBundle);
    this.rpP.xFy = 60;
    GMTrace.o(7950923988992L, 59239);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\create\ui\WalletPayUVerifyCodeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */