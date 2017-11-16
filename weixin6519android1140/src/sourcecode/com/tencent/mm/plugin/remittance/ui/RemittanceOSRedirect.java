package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.c;
import com.tencent.mm.ac.n;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.remittance.c.p;
import com.tencent.mm.pluginsdk.wallet.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import com.tencent.mm.y.q;

@a(7)
public class RemittanceOSRedirect
  extends WalletBaseUI
{
  public String fKP;
  private int gRb;
  
  public RemittanceOSRedirect()
  {
    GMTrace.i(10808956289024L, 80533);
    this.fKP = "";
    GMTrace.o(10808956289024L, 80533);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, k paramk, boolean paramBoolean)
  {
    GMTrace.i(10809358942208L, 80536);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof p))
      {
        paramString = (p)paramk;
        w.i("MicroMsg.RemittanceOSRedirect", "indexScene  %s", new Object[] { paramString.omW });
        paramk = getIntent();
        if (paramString.jWC == 1) {
          g.a(this, 2, this.fKP, 11, null);
        }
        for (;;)
        {
          finish();
          GMTrace.o(10809358942208L, 80536);
          return;
          paramk.setClass(this, RemittanceOSUI.class);
          paramk.putExtra("os_currency", paramString.jWC);
          paramk.putExtra("os_currencyuint", paramString.omW);
          paramk.putExtra("os_currencywording", paramString.omX);
          paramk.putExtra("os_notice", paramString.jWE);
          paramk.putExtra("os_notice_url", paramString.jWF);
          startActivity(paramk);
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.remittance.c.h))
      {
        paramString = (com.tencent.mm.plugin.remittance.c.h)paramk;
        paramk = new Intent();
        paramk.setClass(this, RemittanceHKUI.class);
        this.fKP = paramString.omd;
        if (bg.nm(this.fKP))
        {
          w.e("MicroMsg.RemittanceOSRedirect", "empty username");
          finish();
        }
        paramk.putExtra("scene", this.gRb);
        paramk.putExtra("fee", paramString.eYB / 100.0D);
        paramk.putExtra("desc", paramString.desc);
        paramk.putExtra("scan_remittance_id", paramString.omf);
        paramk.putExtra("receiver_name", paramString.omd);
        paramk.putExtra("receiver_true_name", paramString.jWG);
        paramk.putExtra("receiver_nick_name", paramString.ome);
        paramk.putExtra("hk_currency", paramString.jWC);
        paramk.putExtra("hk_currencyuint", paramString.jWD);
        paramk.putExtra("hk_notice", paramString.jWE);
        paramk.putExtra("hk_notice_url", paramString.jWF);
        paramInt2 = paramString.jWH;
        paramInt1 = 32;
        w.i("MicroMsg.RemittanceOSRedirect", "setAmount: %d", new Object[] { Integer.valueOf(paramInt2) });
        if (paramInt2 == 1) {
          paramInt1 = 33;
        }
        paramk.putExtra("pay_scene", paramInt1);
        com.tencent.mm.kernel.h.xz();
        if (((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TD(this.fKP) != null)
        {
          startActivity(paramk);
          finish();
          GMTrace.o(10809358942208L, 80536);
          return;
        }
        w.d("MicroMsg.RemittanceOSRedirect", "Receiver in contactStg and try to get contact");
        final long l = bg.Pv();
        ak.a.gmX.a(this.fKP, "", new ak.b.a()
        {
          public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
          {
            GMTrace.i(17403073265664L, 129663);
            if (paramAnonymousBoolean)
            {
              w.v("MicroMsg.RemittanceOSRedirect", "getContact suc; cost=" + (bg.Pv() - l) + " ms");
              b.y(paramAnonymousString, 3);
              n.Dv().hS(paramAnonymousString);
            }
            for (;;)
            {
              RemittanceOSRedirect.this.startActivity(this.val$intent);
              RemittanceOSRedirect.this.finish();
              GMTrace.o(17403073265664L, 129663);
              return;
              w.w("MicroMsg.RemittanceOSRedirect", "getContact failed");
            }
          }
        });
        GMTrace.o(10809358942208L, 80536);
      }
    }
    else
    {
      if ((paramk instanceof p))
      {
        w.i("MicroMsg.RemittanceOSRedirect", "indexScene  errMsg %s", new Object[] { paramString });
        com.tencent.mm.ui.base.h.a(this, paramString, "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17409784152064L, 129713);
            RemittanceOSRedirect.this.finish();
            GMTrace.o(17409784152064L, 129713);
          }
        });
        GMTrace.o(10809358942208L, 80536);
        return;
      }
      if ((paramk instanceof com.tencent.mm.plugin.remittance.c.h)) {
        com.tencent.mm.ui.base.h.a(this, paramString, "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17406026055680L, 129685);
            RemittanceOSRedirect.this.finish();
            GMTrace.o(17406026055680L, 129685);
          }
        });
      }
    }
    GMTrace.o(10809358942208L, 80536);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(10809224724480L, 80535);
    GMTrace.o(10809224724480L, 80535);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10809627377664L, 80538);
    GMTrace.o(10809627377664L, 80538);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10809090506752L, 80534);
    super.onCreate(paramBundle);
    AU(8);
    this.gRb = getIntent().getIntExtra("scene", 0);
    this.fKP = getIntent().getStringExtra("receiver_name");
    if (this.gRb == 0)
    {
      w.e("MicroMsg.RemittanceOSRedirect", "error scene: %s", new Object[] { Integer.valueOf(this.gRb) });
      finish();
      GMTrace.o(10809090506752L, 80534);
      return;
    }
    if (this.gRb == 5)
    {
      this.xEL.hN(1574);
      l(new p(q.zL()));
      GMTrace.o(10809090506752L, 80534);
      return;
    }
    if (this.gRb == 6)
    {
      this.xEL.hN(1301);
      b(new com.tencent.mm.plugin.remittance.c.h(this.fKP), true);
    }
    GMTrace.o(10809090506752L, 80534);
  }
  
  public void onDestroy()
  {
    GMTrace.i(10809493159936L, 80537);
    super.onDestroy();
    if (this.gRb == 5)
    {
      hO(1574);
      GMTrace.o(10809493159936L, 80537);
      return;
    }
    if (this.gRb == 6) {
      hO(1301);
    }
    GMTrace.o(10809493159936L, 80537);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\ui\RemittanceOSRedirect.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */