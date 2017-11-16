package com.tencent.mm.plugin.remittance.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.remittance.c.f;
import com.tencent.mm.plugin.remittance.c.g;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class RemittanceHKUI
  extends RemittanceBaseUI
{
  private int opv;
  private String opw;
  private String opx;
  private String opy;
  
  public RemittanceHKUI()
  {
    GMTrace.i(17406428708864L, 129688);
    GMTrace.o(17406428708864L, 129688);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, k paramk, boolean paramBoolean)
  {
    GMTrace.i(17407502450688L, 129696);
    if ((paramk instanceof g))
    {
      paramk = (g)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (!bg.nm(paramk.omc))
        {
          e.p(this.vKB.vKW, paramk.omc, 4);
          GMTrace.o(17407502450688L, 129696);
          return;
        }
        w.e("MicroMsg.RemittanceHKUI", "empty payurl");
        GMTrace.o(17407502450688L, 129696);
        return;
      }
      h.b(this.vKB.vKW, paramString, "", false);
      GMTrace.o(17407502450688L, 129696);
      return;
    }
    super.b(paramInt1, paramInt2, paramString, paramk, paramBoolean);
    GMTrace.o(17407502450688L, 129696);
  }
  
  public final void bbC()
  {
    GMTrace.i(17407234015232L, 129694);
    if (!bg.nm(this.opx))
    {
      TextView localTextView = (TextView)findViewById(a.f.sqJ);
      localTextView.setText(this.opx);
      localTextView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(17408576192512L, 129704);
          w.i("MicroMsg.RemittanceHKUI", "hy: on click banner");
          if (!bg.nm(RemittanceHKUI.a(RemittanceHKUI.this)))
          {
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("rawUrl", RemittanceHKUI.a(RemittanceHKUI.this));
            paramAnonymousView.putExtra("showShare", false);
            d.b(RemittanceHKUI.this.vKB.vKW, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramAnonymousView);
          }
          GMTrace.o(17408576192512L, 129704);
        }
      });
    }
    GMTrace.o(17407234015232L, 129694);
  }
  
  protected final void bbG()
  {
    GMTrace.i(17407770886144L, 129698);
    GMTrace.o(17407770886144L, 129698);
  }
  
  public final void bbw()
  {
    GMTrace.i(17406831362048L, 129691);
    GMTrace.o(17406831362048L, 129691);
  }
  
  public final void bbx()
  {
    GMTrace.i(17407368232960L, 129695);
    w.d("MicroMsg.RemittanceHKUI", "do scene cancel");
    if (this.onk == 33) {}
    for (int i = 1;; i = 0)
    {
      b(new f(this.fKP, this.onl, this.opv, this.oni * 100L, i), false);
      GMTrace.o(17407368232960L, 129695);
      return;
    }
  }
  
  public final void bbz()
  {
    GMTrace.i(17407099797504L, 129693);
    u.makeText(this.vKB.vKW, getString(a.i.sYk, new Object[] { this.opw }), 0).show();
    GMTrace.o(17407099797504L, 129693);
  }
  
  public final void dt(String paramString1, String paramString2)
  {
    GMTrace.i(17406965579776L, 129692);
    w.d("MicroMsg.RemittanceHKUI", "do scene gen pay");
    int i = 0;
    if (this.onk == 33) {
      i = 1;
    }
    b(new g(Math.round(this.oni * 100.0D), this.fKP, this.onj, this.onx, this.fLH, this.onl, this.opv, i), true);
    GMTrace.o(17406965579776L, 129692);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(17407636668416L, 129697);
    if ((paramInt1 == 4) && (paramInt2 == -1)) {
      finish();
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(17407636668416L, 129697);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(17406562926592L, 129689);
    super.onCreate(paramBundle);
    hN(1529);
    hN(1257);
    this.opv = getIntent().getIntExtra("hk_currency", 0);
    this.opw = getIntent().getStringExtra("hk_currencyuint");
    this.opx = getIntent().getStringExtra("hk_notice");
    this.opy = getIntent().getStringExtra("hk_notice_url");
    this.jZE.vl(this.opw);
    this.onu.setText(this.opw);
    GMTrace.o(17406562926592L, 129689);
  }
  
  public void onDestroy()
  {
    GMTrace.i(17406697144320L, 129690);
    super.onDestroy();
    hO(1529);
    hO(1257);
    GMTrace.o(17406697144320L, 129690);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\ui\RemittanceHKUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */