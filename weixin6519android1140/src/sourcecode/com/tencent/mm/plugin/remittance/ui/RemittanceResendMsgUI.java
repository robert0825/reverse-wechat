package com.tencent.mm.plugin.remittance.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.remittance.c.o;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(7)
public class RemittanceResendMsgUI
  extends WalletBaseUI
{
  public RemittanceResendMsgUI()
  {
    GMTrace.i(10825867722752L, 80659);
    GMTrace.o(10825867722752L, 80659);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(10826270375936L, 80662);
    if ((paramk instanceof o))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        h.bm(this, getString(a.i.sYr));
        finish();
        GMTrace.o(10826270375936L, 80662);
        return true;
      }
      h.bm(this, paramString);
      finish();
      GMTrace.o(10826270375936L, 80662);
      return true;
    }
    GMTrace.o(10826270375936L, 80662);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10826404593664L, 80663);
    GMTrace.o(10826404593664L, 80663);
    return -1;
  }
  
  public void j(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(10826136158208L, 80661);
    paramString1 = new o(paramString1, paramString2, paramInt1, paramInt2);
    paramString1.fXf = "RemittanceProcess";
    l(paramString1);
    GMTrace.o(10826136158208L, 80661);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10826001940480L, 80660);
    super.onCreate(paramBundle);
    this.vKB.hqF.setVisibility(8);
    AU(8);
    paramBundle = getIntent().getStringExtra("transaction_id");
    String str = getIntent().getStringExtra("receiver_name");
    int i = getIntent().getIntExtra("resend_msg_from_flag", 1);
    int j = getIntent().getIntExtra("invalid_time", 0);
    if ((!bg.nm(paramBundle)) && (!bg.nm(str))) {
      j(paramBundle, str, j, i);
    }
    GMTrace.o(10826001940480L, 80660);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\ui\RemittanceResendMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */