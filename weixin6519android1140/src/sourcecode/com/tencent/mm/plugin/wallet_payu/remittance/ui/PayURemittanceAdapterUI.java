package com.tencent.mm.plugin.wallet_payu.remittance.ui;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.c;
import com.tencent.mm.ac.n;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;

@a(7)
public class PayURemittanceAdapterUI
  extends RemittanceAdapterUI
{
  public PayURemittanceAdapterUI()
  {
    GMTrace.i(7967164334080L, 59360);
    GMTrace.o(7967164334080L, 59360);
  }
  
  protected final void b(String paramString, int paramInt, Intent paramIntent)
  {
    GMTrace.i(7967566987264L, 59363);
    w.i("MicroMsg.PayURemittanceAdapterUI", "startRemittanceUI scene=" + this.gRb + ", name=" + paramString);
    if (paramIntent != null) {}
    for (paramIntent = new Intent(paramIntent);; paramIntent = new Intent())
    {
      paramIntent.setClass(this, PayURemittanceUI.class);
      paramIntent.putExtra("receiver_name", paramString);
      paramIntent.putExtra("scene", this.gRb);
      paramIntent.putExtra("pay_scene", paramInt);
      startActivity(paramIntent);
      setResult(-1);
      finish();
      GMTrace.o(7967566987264L, 59363);
      return;
    }
  }
  
  protected final void bbv()
  {
    GMTrace.i(7967298551808L, 59361);
    b(new com.tencent.mm.plugin.wallet_payu.remittance.a.e(this.fKP), false);
    GMTrace.o(7967298551808L, 59361);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, final k paramk)
  {
    GMTrace.i(7967432769536L, 59362);
    super.d(paramInt1, paramInt2, paramString, paramk);
    if ((paramk instanceof com.tencent.mm.plugin.wallet_payu.remittance.a.e)) {
      this.onc = false;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramk instanceof com.tencent.mm.plugin.wallet_payu.remittance.a.e)))
    {
      paramString = (com.tencent.mm.plugin.wallet_payu.remittance.a.e)paramk;
      this.fKP = paramString.username;
      if (bg.nm(this.fKP))
      {
        w.d("MicroMsg.PayURemittanceAdapterUI", "Username empty & fishsh. scene=" + this.gRb);
        finish();
        GMTrace.o(7967432769536L, 59362);
        return true;
      }
      paramk = new Intent();
      paramk.putExtra("fee", paramString.jWS);
      paramk.putExtra("desc", paramString.desc);
      paramk.putExtra("scan_remittance_id", paramString.omB);
      paramk.putExtra("receiver_true_name", com.tencent.mm.wallet_core.ui.e.Xx(paramString.omA));
      com.tencent.mm.kernel.h.xz();
      if (((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TD(this.fKP) != null) {
        b(this.fKP, paramString.scene, paramk);
      }
      for (;;)
      {
        GMTrace.o(7967432769536L, 59362);
        return true;
        w.d("MicroMsg.PayURemittanceAdapterUI", "Receiver in contactStg and try to get contact");
        final long l = bg.Pv();
        ak.a.gmX.a(this.fKP, "", new ak.b.a()
        {
          public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
          {
            GMTrace.i(7971459301376L, 59392);
            if (paramAnonymousBoolean)
            {
              w.v("MicroMsg.PayURemittanceAdapterUI", "getContact suc; cost=" + (bg.Pv() - l) + " ms");
              b.y(paramAnonymousString, 3);
              n.Dv().hS(paramAnonymousString);
            }
            for (;;)
            {
              PayURemittanceAdapterUI.this.b(PayURemittanceAdapterUI.a(PayURemittanceAdapterUI.this), paramk.scene, this.onf);
              GMTrace.o(7971459301376L, 59392);
              return;
              w.w("MicroMsg.PayURemittanceAdapterUI", "getContact failed");
            }
          }
        });
      }
    }
    GMTrace.o(7967432769536L, 59362);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\remittance\ui\PayURemittanceAdapterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */