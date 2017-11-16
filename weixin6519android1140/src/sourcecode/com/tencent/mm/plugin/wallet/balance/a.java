package com.tencent.mm.plugin.wallet.balance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.wallet_core.c.o;

public class a
  extends com.tencent.mm.plugin.wallet_core.b.b
{
  public static int qTf;
  public static int qTg;
  
  static
  {
    GMTrace.i(7729062084608L, 57586);
    qTf = 1;
    qTg = 2;
    GMTrace.o(7729062084608L, 57586);
  }
  
  public a()
  {
    GMTrace.i(7728525213696L, 57582);
    GMTrace.o(7728525213696L, 57582);
  }
  
  public final com.tencent.mm.wallet_core.b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(16563138723840L, 123405);
    o.EL(14);
    paramActivity = super.a(paramActivity, paramBundle);
    GMTrace.o(16563138723840L, 123405);
    return paramActivity;
  }
  
  public final String aAd()
  {
    GMTrace.i(7728927866880L, 57585);
    GMTrace.o(7728927866880L, 57585);
    return "BalanceFetchCardProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7728793649152L, 57584);
    o.clP();
    if ((paramBundle != null) && (paramBundle.getBoolean("intent_bind_end", false)))
    {
      Intent localIntent = new Intent();
      localIntent.putExtras(paramBundle);
      if (paramBundle.getInt("from_bind_ui", qTg) == qTf)
      {
        localIntent.putExtra("from_bind_ui", qTf);
        a(paramActivity, "wallet", ".balance.ui.WalletBalanceManagerUI", -1, localIntent, true);
        GMTrace.o(7728793649152L, 57584);
        return;
      }
      localIntent.putExtra("from_bind_ui", qTg);
      a(paramActivity, "wallet", ".balance.ui.WalletBalanceFetchUI", -1, localIntent, true);
      GMTrace.o(7728793649152L, 57584);
      return;
    }
    paramActivity.finish();
    GMTrace.o(7728793649152L, 57584);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(7728659431424L, 57583);
    o.clP();
    if (paramActivity != null) {
      paramActivity.finish();
    }
    GMTrace.o(7728659431424L, 57583);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */