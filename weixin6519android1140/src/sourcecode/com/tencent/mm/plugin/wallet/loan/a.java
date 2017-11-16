package com.tencent.mm.plugin.wallet.loan;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.n;

public class a
  extends com.tencent.mm.plugin.wallet_core.b.b
{
  public a()
  {
    GMTrace.i(7830664904704L, 58343);
    GMTrace.o(7830664904704L, 58343);
  }
  
  public final com.tencent.mm.wallet_core.b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7830799122432L, 58344);
    if (n.byx().byS()) {
      c(paramActivity, WalletLoanCheckPwdUI.class, paramBundle);
    }
    for (;;)
    {
      GMTrace.o(7830799122432L, 58344);
      return this;
      super.a(paramActivity, paramBundle);
    }
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    int i = 0;
    GMTrace.i(7831067557888L, 58346);
    if (paramBundle.getBoolean("intent_bind_end", false)) {
      i = -1;
    }
    a(paramActivity, WalletLoanRepaymentUI.class, i, null, true);
    GMTrace.o(7831067557888L, 58346);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(7830933340160L, 58345);
    b(paramActivity, this.ler);
    GMTrace.o(7830933340160L, 58345);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\loan\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */