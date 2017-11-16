package com.tencent.mm.plugin.wallet_payu.remittance.a;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.remittance.a.a;
import com.tencent.mm.plugin.wallet_payu.remittance.ui.PayURemittanceAdapterUI;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.b;

public class i
  extends a
{
  public i()
  {
    GMTrace.i(7961795624960L, 59320);
    GMTrace.o(7961795624960L, 59320);
  }
  
  public final b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7961929842688L, 59321);
    w.d("MicroMsg.PayURemittanceProcess", "start Process : PayURemittanceProcess");
    c(paramActivity, PayURemittanceAdapterUI.class, paramBundle);
    GMTrace.o(7961929842688L, 59321);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\remittance\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */