package com.tencent.mm.plugin.wallet_ecard.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;

public class WalletECardCheckOtherCardUI
  extends WalletECardBaseUI
  implements WalletFormView.a
{
  private Button kES;
  private String kai;
  private WalletFormView ojJ;
  private WalletFormView rrO;
  
  public WalletECardCheckOtherCardUI()
  {
    GMTrace.i(19580219031552L, 145884);
    GMTrace.o(19580219031552L, 145884);
  }
  
  protected final void MP()
  {
    GMTrace.i(19580487467008L, 145886);
    this.ojJ = ((WalletFormView)findViewById(a.f.sta));
    this.rrO = ((WalletFormView)findViewById(a.f.stb));
    this.kES = ((Button)findViewById(a.f.stc));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.ojJ);
    com.tencent.mm.wallet_core.ui.formview.a.c(this, this.rrO);
    if (!bg.nm(this.kai)) {
      this.ojJ.setHint(getString(a.i.sTf, new Object[] { this.kai }));
    }
    for (;;)
    {
      this.rrO.setHint(getString(a.i.sTh));
      this.ojJ.xFu = this;
      this.rrO.xFu = this;
      e(this.ojJ, 0, false);
      e(this.rrO, 0, false);
      this.kES.setEnabled(false);
      this.kES.setClickable(false);
      this.kES.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19582366515200L, 145900);
          w.i("MicroMsg.WalletECardCheckOtherCardUI", "do check card");
          if ((WalletECardCheckOtherCardUI.a(WalletECardCheckOtherCardUI.this).QW()) && (WalletECardCheckOtherCardUI.b(WalletECardCheckOtherCardUI.this).QW()))
          {
            paramAnonymousView = WalletECardCheckOtherCardUI.a(WalletECardCheckOtherCardUI.this).getText();
            String str = WalletECardCheckOtherCardUI.b(WalletECardCheckOtherCardUI.this).getText();
            WalletECardCheckOtherCardUI.this.cmq().j(new Object[] { paramAnonymousView, str });
            GMTrace.o(19582366515200L, 145900);
            return;
          }
          w.w("MicroMsg.WalletECardCheckOtherCardUI", "input invalid");
          GMTrace.o(19582366515200L, 145900);
        }
      });
      GMTrace.o(19580487467008L, 145886);
      return;
      this.ojJ.setHint(getString(a.i.sTg));
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(19580621684736L, 145887);
    GMTrace.o(19580621684736L, 145887);
    return false;
  }
  
  public final void gR(boolean paramBoolean)
  {
    GMTrace.i(19581024337920L, 145890);
    w.d("MicroMsg.WalletECardCheckOtherCardUI", "is valid: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((this.ojJ.QW()) && (this.rrO.QW()))
    {
      this.kES.setEnabled(true);
      this.kES.setClickable(true);
      GMTrace.o(19581024337920L, 145890);
      return;
    }
    this.kES.setEnabled(false);
    this.kES.setClickable(false);
    GMTrace.o(19581024337920L, 145890);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19580755902464L, 145888);
    int i = a.g.sMn;
    GMTrace.o(19580755902464L, 145888);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19580353249280L, 145885);
    super.onCreate(paramBundle);
    this.kai = this.ui.getString(com.tencent.mm.plugin.wallet_ecard.a.a.rrq, "");
    sq(getString(a.i.sTi));
    this.xEL.hN(385);
    MP();
    GMTrace.o(19580353249280L, 145885);
  }
  
  public void onDestroy()
  {
    GMTrace.i(19580890120192L, 145889);
    super.onDestroy();
    this.xEL.hO(385);
    GMTrace.o(19580890120192L, 145889);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_ecard\ui\WalletECardCheckOtherCardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */