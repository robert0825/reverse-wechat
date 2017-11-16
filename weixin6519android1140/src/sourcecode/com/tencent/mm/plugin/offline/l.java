package com.tencent.mm.plugin.offline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.wallet_core.b;

public class l
  extends b
{
  public l()
  {
    GMTrace.i(6250922246144L, 46573);
    GMTrace.o(6250922246144L, 46573);
  }
  
  public final b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6251056463872L, 46574);
    c(paramActivity, WalletVerifyCodeUI.class, paramBundle);
    GMTrace.o(6251056463872L, 46574);
    return this;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(6251190681600L, 46575);
    if ((paramActivity instanceof WalletVerifyCodeUI)) {
      b(paramActivity, paramBundle);
    }
    GMTrace.o(6251190681600L, 46575);
  }
  
  public final String aAd()
  {
    GMTrace.i(6251727552512L, 46579);
    GMTrace.o(6251727552512L, 46579);
    return "VerifyProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6251459117056L, 46577);
    paramBundle = new Intent(paramActivity, WalletOfflineCoinPurseUI.class);
    paramBundle.addFlags(67108864);
    paramActivity.startActivity(paramBundle);
    GMTrace.o(6251459117056L, 46577);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(6251324899328L, 46576);
    GMTrace.o(6251324899328L, 46576);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6251593334784L, 46578);
    GMTrace.o(6251593334784L, 46578);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */