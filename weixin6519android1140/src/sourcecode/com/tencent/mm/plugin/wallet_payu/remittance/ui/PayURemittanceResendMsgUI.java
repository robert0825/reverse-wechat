package com.tencent.mm.plugin.wallet_payu.remittance.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.remittance.ui.RemittanceResendMsgUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.ui.base.a;

@a(3)
public class PayURemittanceResendMsgUI
  extends RemittanceResendMsgUI
{
  public PayURemittanceResendMsgUI()
  {
    GMTrace.i(7969714470912L, 59379);
    GMTrace.o(7969714470912L, 59379);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7970117124096L, 59382);
    if ((paramk instanceof com.tencent.mm.plugin.wallet_payu.remittance.a.h))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.ui.base.h.bm(this, getString(a.i.sYr));
        finish();
        GMTrace.o(7970117124096L, 59382);
        return true;
      }
      com.tencent.mm.ui.base.h.bm(this, paramString);
      finish();
      GMTrace.o(7970117124096L, 59382);
      return true;
    }
    GMTrace.o(7970117124096L, 59382);
    return false;
  }
  
  protected final void j(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(7969982906368L, 59381);
    l(new com.tencent.mm.plugin.wallet_payu.remittance.a.h(paramString1, getIntent().getIntExtra("total_fee", 0), getIntent().getStringExtra("fee_type"), paramString2, paramInt1));
    GMTrace.o(7969982906368L, 59381);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7969848688640L, 59380);
    super.onCreate(paramBundle);
    GMTrace.o(7969848688640L, 59380);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\remittance\ui\PayURemittanceResendMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */