package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.n;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.tk;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

@com.tencent.mm.ui.base.a(19)
public class RemittanceOSUI
  extends RemittanceBaseUI
  implements d.a
{
  private int opB;
  private String opC;
  private String opD;
  private String opE;
  private String opF;
  private boolean opG;
  private c opH;
  
  public RemittanceOSUI()
  {
    GMTrace.i(10814056562688L, 80571);
    this.opG = false;
    this.opH = new c() {};
    GMTrace.o(10814056562688L, 80571);
  }
  
  protected final void FF(String paramString)
  {
    GMTrace.i(10814861869056L, 80577);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    com.tencent.mm.bj.d.b(this, "webview", ".ui.tools.WebViewUI", localIntent, 3);
    this.opG = true;
    GMTrace.o(10814861869056L, 80577);
  }
  
  protected final void FG(String paramString)
  {
    GMTrace.i(10814996086784L, 80578);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    com.tencent.mm.bj.d.b(this, "webview", ".ui.tools.WebViewUI", localIntent, 3);
    this.opG = true;
    GMTrace.o(10814996086784L, 80578);
  }
  
  public final void b(int paramInt1, int paramInt2, final String paramString, k paramk, boolean paramBoolean)
  {
    GMTrace.i(10816069828608L, 80586);
    super.b(paramInt1, paramInt2, paramString, paramk, paramBoolean);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramk instanceof com.tencent.mm.plugin.remittance.c.q)))
    {
      paramString = (com.tencent.mm.plugin.remittance.c.q)paramk;
      if (paramString.omi <= 0) {
        break label265;
      }
      if (paramString.omZ != 0) {
        break label182;
      }
      com.tencent.mm.ui.base.h.a(this, getString(a.i.sYo, new Object[] { Integer.valueOf(paramString.omi) }), getString(a.i.cUl), getString(a.i.sXt), getString(a.i.sYj), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(10823049150464L, 80638);
          RemittanceOSUI.this.FF(paramString.omc);
          GMTrace.o(10823049150464L, 80638);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(10820364795904L, 80618);
          RemittanceOSUI.this.FG(paramString.omY);
          GMTrace.o(10820364795904L, 80618);
        }
      });
      paramInt1 = 1;
    }
    for (;;)
    {
      if (paramInt1 == 0)
      {
        paramString = ((com.tencent.mm.plugin.remittance.c.q)paramk).omc;
        paramk = new Intent();
        paramk.putExtra("rawUrl", paramString);
        paramk.putExtra("showShare", false);
        com.tencent.mm.bj.d.b(this, "webview", ".ui.tools.WebViewUI", paramk, 3);
      }
      GMTrace.o(10816069828608L, 80586);
      return;
      label182:
      if (paramString.omZ == 1)
      {
        com.tencent.mm.ui.base.h.a(this, getString(a.i.sYo, new Object[] { Integer.valueOf(paramString.omi) }), getString(a.i.cUl), getString(a.i.sXt), getString(a.i.sYj), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(10809895813120L, 80540);
            RemittanceOSUI.this.FF(paramString.omc);
            GMTrace.o(10809895813120L, 80540);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(10812580167680L, 80560);
            RemittanceOSUI.this.FG(paramString.omY);
            GMTrace.o(10812580167680L, 80560);
          }
        });
        paramInt1 = 1;
      }
      else
      {
        paramInt1 = 0;
        continue;
        label265:
        paramInt1 = 0;
      }
    }
  }
  
  public final void bbC()
  {
    GMTrace.i(10815130304512L, 80579);
    if (!bg.nm(this.opE))
    {
      e.a((TextView)findViewById(a.f.sqJ), "", this.opE, this.opF);
      GMTrace.o(10815130304512L, 80579);
      return;
    }
    w.i("MicroMsg.RemittanceOSUI", "no bulletin data");
    GMTrace.o(10815130304512L, 80579);
  }
  
  public final void bbw()
  {
    GMTrace.i(10814190780416L, 80572);
    GMTrace.o(10814190780416L, 80572);
  }
  
  public final void bby()
  {
    GMTrace.i(10814324998144L, 80573);
    g.ork.i(13337, new Object[] { Integer.valueOf(2) });
    GMTrace.o(10814324998144L, 80573);
  }
  
  public final void bbz()
  {
    GMTrace.i(10814459215872L, 80574);
    u.makeText(this.vKB.vKW, getString(a.i.sYk, new Object[] { this.opC }), 0).show();
    GMTrace.o(10814459215872L, 80574);
  }
  
  public final void dt(String paramString1, String paramString2)
  {
    GMTrace.i(10814727651328L, 80576);
    String str = com.tencent.mm.y.q.zG();
    paramString2 = str;
    if (bg.nm(str)) {
      paramString2 = com.tencent.mm.y.q.zE();
    }
    com.tencent.mm.kernel.h.xz();
    x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(this.fKP);
    str = this.fKP;
    if ((int)localx.fTq != 0) {
      str = localx.vk();
    }
    paramString1 = new com.tencent.mm.plugin.remittance.c.q(this.oni, paramString2, this.fKP, str, paramString1, this.opB);
    paramString1.fXf = "RemittanceProcess";
    l(paramString1);
    g.ork.i(13337, new Object[] { Integer.valueOf(1), Double.valueOf(this.oni) });
    GMTrace.o(10814727651328L, 80576);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10815935610880L, 80585);
    int i = a.g.sOz;
    GMTrace.o(10815935610880L, 80585);
    return i;
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(10815667175424L, 80583);
    GMTrace.o(10815667175424L, 80583);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(10815801393152L, 80584);
    w.d("MicroMsg.RemittanceOSUI", "reqcode=" + paramInt1 + ", resultCode=" + paramInt2 + ", username=" + this.fKP);
    this.opG = false;
    if ((paramInt1 == 3) && (paramInt2 == -1)) {
      finish();
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(10815801393152L, 80584);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10814593433600L, 80575);
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.b.a.vgX.a(this.opH);
    this.xEL.hN(1622);
    this.xEL.hN(1574);
    MP();
    this.jZE.vl("");
    n.Dh().a(this);
    this.opB = getIntent().getIntExtra("os_currency", 0);
    this.opC = getIntent().getStringExtra("os_currencyuint");
    this.opD = getIntent().getStringExtra("os_currencywording");
    this.opE = getIntent().getStringExtra("os_notice");
    this.opF = getIntent().getStringExtra("os_notice_url");
    this.jZE.vl(this.opC);
    bbC();
    GMTrace.o(10814593433600L, 80575);
  }
  
  public void onDestroy()
  {
    GMTrace.i(10815532957696L, 80582);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.vgX.c(this.opH);
    n.Dh().b(this);
    this.xEL.hO(1622);
    this.xEL.hO(1574);
    GMTrace.o(10815532957696L, 80582);
  }
  
  public void onPause()
  {
    GMTrace.i(10815398739968L, 80581);
    super.onPause();
    GMTrace.o(10815398739968L, 80581);
  }
  
  public void onResume()
  {
    GMTrace.i(10815264522240L, 80580);
    super.onResume();
    GMTrace.o(10815264522240L, 80580);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\ui\RemittanceOSUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */