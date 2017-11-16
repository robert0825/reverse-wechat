package com.tencent.mm.plugin.wallet.pay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.b.b;

public class a
  extends b
{
  public a()
  {
    GMTrace.i(7822477623296L, 58282);
    GMTrace.o(7822477623296L, 58282);
  }
  
  public final String aAd()
  {
    GMTrace.i(7822880276480L, 58285);
    GMTrace.o(7822880276480L, 58285);
    return "BindCardForPayProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7822746058752L, 58284);
    Intent localIntent = new Intent();
    localIntent.putExtras(paramBundle);
    a(paramActivity, "wallet", ".pay.ui.WalletPayUI", -1, localIntent, false);
    GMTrace.o(7822746058752L, 58284);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(7822611841024L, 58283);
    if (paramActivity != null) {
      paramActivity.finish();
    }
    GMTrace.o(7822611841024L, 58283);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */