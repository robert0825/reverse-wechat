package com.tencent.mm.plugin.wallet_payu.remittance.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.remittance.ui.RemittanceUI;
import com.tencent.mm.plugin.wallet_payu.remittance.a.d;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;

public class PayURemittanceUI
  extends RemittanceUI
{
  private final String rvq;
  
  public PayURemittanceUI()
  {
    GMTrace.i(7970519777280L, 59385);
    this.rvq = "ZAR";
    GMTrace.o(7970519777280L, 59385);
  }
  
  public final void bbx()
  {
    GMTrace.i(7970653995008L, 59386);
    l(new com.tencent.mm.plugin.wallet_payu.remittance.a.g(this.fKP, this.onl));
    GMTrace.o(7970653995008L, 59386);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7970922430464L, 59388);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof d))
      {
        paramString = (d)paramk;
        if (!bg.nm(paramString.eMJ)) {
          break label67;
        }
        u.makeText(this.vKB.vKW, a.i.thV, 0).show();
      }
      for (;;)
      {
        GMTrace.o(7970922430464L, 59388);
        return true;
        label67:
        Object localObject = paramString.eMJ;
        paramString = this.fKP;
        paramk = new PayInfo();
        paramk.eHG = ((String)localObject);
        paramk.ePL = this.onk;
        localObject = new Bundle();
        ((Bundle)localObject).putString("extinfo_key_1", paramString);
        ((Bundle)localObject).putString("extinfo_key_2", getIntent().getStringExtra("receiver_true_name"));
        ((Bundle)localObject).putString("extinfo_key_3", getIntent().getStringExtra("desc"));
        ((Bundle)localObject).putString("extinfo_key_4", getIntent().getStringExtra("scan_remittance_id"));
        ((Bundle)localObject).putString("fee_type", "ZAR");
        ((Bundle)localObject).putDouble("total_fee", this.oni);
        paramk.tIC = ((Bundle)localObject);
        com.tencent.mm.pluginsdk.wallet.g.a(this, paramk, 1);
      }
    }
    GMTrace.o(7970922430464L, 59388);
    return false;
  }
  
  public final void dt(String paramString1, String paramString2)
  {
    GMTrace.i(7970788212736L, 59387);
    l(new d(this.oni, "ZAR", this.fKP, this.gRb));
    GMTrace.o(7970788212736L, 59387);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\remittance\ui\PayURemittanceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */