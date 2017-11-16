package com.tencent.mm.plugin.wallet.bind.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet.pay.a.a.b;
import com.tencent.mm.plugin.wallet.pay.a.a.c;
import com.tencent.mm.plugin.wallet_core.c.l;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.i;
import com.tencent.mm.wallet_core.ui.MMScrollView;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;

@com.tencent.mm.ui.base.a(19)
public class WalletResetInfoUI
  extends WalletBaseUI
  implements WalletFormView.a
{
  private TextView iuc;
  private Orders opK;
  private Bankcard qUE;
  private Button qXb;
  private WalletFormView qXc;
  private WalletFormView qXd;
  private WalletFormView qXe;
  private WalletFormView qXf;
  private Authen qXg;
  private ElementQuery qXh;
  
  public WalletResetInfoUI()
  {
    GMTrace.i(7682354315264L, 57238);
    GMTrace.o(7682354315264L, 57238);
  }
  
  private boolean QS()
  {
    GMTrace.i(7683428057088L, 57246);
    if (!this.qXd.dJ(null)) {}
    for (boolean bool = false;; bool = true)
    {
      if (!this.qXf.dJ(null)) {
        bool = false;
      }
      if (!this.qXe.dJ(null)) {
        bool = false;
      }
      if ((this.opK == null) || (this.qXg == null)) {
        bool = false;
      }
      if (bool)
      {
        this.qXb.setEnabled(true);
        this.qXb.setClickable(true);
      }
      for (;;)
      {
        GMTrace.o(7683428057088L, 57246);
        return bool;
        this.qXb.setEnabled(false);
        this.qXb.setClickable(false);
      }
    }
  }
  
  private boolean bxb()
  {
    GMTrace.i(7683025403904L, 57243);
    if ((this.ui.getInt("key_err_code", 408) == 408) && (this.qXh == null))
    {
      GMTrace.o(7683025403904L, 57243);
      return true;
    }
    GMTrace.o(7683025403904L, 57243);
    return false;
  }
  
  private void bxc()
  {
    GMTrace.i(7683159621632L, 57244);
    switch (this.ui.getInt("key_err_code", 408))
    {
    default: 
      if (this.ui.getBoolean("key_balance_change_phone_need_confirm_phone", true))
      {
        oM(a.i.tfS);
        this.qXf.setVisibility(0);
      }
      break;
    }
    for (;;)
    {
      if (this.qUE != null)
      {
        w.d("Micromsg.WalletResetInfoUI", "bankPhone: %s", new Object[] { this.qUE.field_bankPhone });
        this.iuc.setText(String.format(getString(a.i.tfR), new Object[] { this.qUE.field_bankPhone }));
      }
      if ((this.qXh == null) && (this.qUE != null)) {
        this.qXh = n.byF().Kf(this.qUE.field_bankcardType);
      }
      if ((this.qXh != null) && (this.qXh.rfP)) {
        this.qXe.setVisibility(0);
      }
      if ((this.qXh != null) && (this.qXh.rfQ)) {
        this.qXd.setVisibility(0);
      }
      for (;;)
      {
        this.qXb = ((Button)findViewById(a.f.bQR));
        this.qXb.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7681280573440L, 57230);
            if (!WalletResetInfoUI.a(WalletResetInfoUI.this))
            {
              w.w("Micromsg.WalletResetInfoUI", "input format illegal!");
              GMTrace.o(7681280573440L, 57230);
              return;
            }
            if (WalletResetInfoUI.b(WalletResetInfoUI.this).getVisibility() == 0) {
              WalletResetInfoUI.c(WalletResetInfoUI.this).rei = WalletResetInfoUI.b(WalletResetInfoUI.this).getText();
            }
            if (WalletResetInfoUI.d(WalletResetInfoUI.this).getVisibility() == 0) {
              WalletResetInfoUI.c(WalletResetInfoUI.this).rej = bg.aq(WalletResetInfoUI.d(WalletResetInfoUI.this).getText(), "");
            }
            if (WalletResetInfoUI.e(WalletResetInfoUI.this).getVisibility() == 0)
            {
              WalletResetInfoUI.c(WalletResetInfoUI.this).rcs = bg.aq(WalletResetInfoUI.e(WalletResetInfoUI.this).getText(), "");
              paramAnonymousView = e.Xy(WalletResetInfoUI.c(WalletResetInfoUI.this).rcs);
              WalletResetInfoUI.this.ui.putString("key_mobile", paramAnonymousView);
            }
            w.d("Micromsg.WalletResetInfoUI", "tft: bank_type: %s, bank_serial: %s", new Object[] { WalletResetInfoUI.c(WalletResetInfoUI.this).nDt, WalletResetInfoUI.c(WalletResetInfoUI.this).nDu });
            WalletResetInfoUI.c(WalletResetInfoUI.this).rec = 1;
            if (WalletResetInfoUI.this.ui.getBoolean("key_is_changing_balance_phone_num", false))
            {
              WalletResetInfoUI.this.l(new c(WalletResetInfoUI.c(WalletResetInfoUI.this), WalletResetInfoUI.f(WalletResetInfoUI.this), WalletResetInfoUI.this.ui.getBoolean("key_isbalance", false)));
              GMTrace.o(7681280573440L, 57230);
              return;
            }
            paramAnonymousView = com.tencent.mm.plugin.wallet.pay.a.a.a(WalletResetInfoUI.c(WalletResetInfoUI.this), WalletResetInfoUI.f(WalletResetInfoUI.this), false);
            if (paramAnonymousView != null) {
              WalletResetInfoUI.this.l(paramAnonymousView);
            }
            GMTrace.o(7681280573440L, 57230);
          }
        });
        QS();
        if (!bxb()) {
          break;
        }
        sv(4);
        GMTrace.o(7683159621632L, 57244);
        return;
        oM(a.i.tfP);
        this.qXe.setVisibility(0);
        this.iuc.setText(a.i.tfO);
        continue;
        oM(a.i.tfU);
        this.qXd.setVisibility(0);
        this.iuc.setText(a.i.tfT);
      }
      oM(a.i.tfQ);
    }
    sv(0);
    GMTrace.o(7683159621632L, 57244);
  }
  
  protected final void MP()
  {
    GMTrace.i(7682891186176L, 57242);
    this.iuc = ((TextView)findViewById(a.f.sKM));
    Bankcard localBankcard = (Bankcard)this.ui.getParcelable("key_switch_phone_reset_bank_card");
    Object localObject = localBankcard;
    if (localBankcard == null) {
      localObject = (Bankcard)this.ui.getParcelable("key_bankcard");
    }
    this.qUE = ((Bankcard)localObject);
    this.opK = ((Orders)this.ui.getParcelable("key_orders"));
    this.qXg = ((Authen)this.ui.getParcelable("key_authen"));
    if (TextUtils.isEmpty(this.ui.getString("key_pwd1", "")))
    {
      this.ui.putString("key_pwd1", this.qXg.red);
      w.e("Micromsg.WalletResetInfoUI", "pwd is empty, reset it to input");
    }
    this.qXh = ((ElementQuery)this.ui.getParcelable("elemt_query"));
    this.qXc = ((WalletFormView)findViewById(a.f.sqs));
    this.qXd = ((WalletFormView)findViewById(a.f.suu));
    com.tencent.mm.wallet_core.ui.formview.a.a(this, this.qXd);
    this.qXe = ((WalletFormView)findViewById(a.f.sut));
    com.tencent.mm.wallet_core.ui.formview.a.b(this, this.qXe);
    this.qXf = ((WalletFormView)findViewById(a.f.sCx));
    com.tencent.mm.wallet_core.ui.formview.a.c(this, this.qXf);
    this.qXd.xFu = this;
    this.qXe.xFu = this;
    this.qXf.xFu = this;
    localObject = (MMScrollView)findViewById(a.f.cnx);
    ((MMScrollView)localObject).a((ViewGroup)localObject, (View.OnFocusChangeListener)localObject);
    if (this.qUE != null) {
      this.qXc.setText(this.qUE.field_desc);
    }
    for (;;)
    {
      bxc();
      if (bxb()) {
        b(new l("", "", null), true);
      }
      GMTrace.o(7682891186176L, 57242);
      return;
      this.qXc.setVisibility(8);
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7683293839360L, 57245);
    w.d("Micromsg.WalletResetInfoUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = this.ui;
      if (((paramk instanceof b)) || ((paramk instanceof c)))
      {
        paramk = (b)paramk;
        if (!paramk.qYB) {}
        for (boolean bool = true;; bool = false)
        {
          paramString.putBoolean("key_need_verify_sms", bool);
          paramString.putString("kreq_token", paramk.token);
          if (paramk.qZD) {
            paramString.putParcelable("key_orders", paramk.qYC);
          }
          paramk = paramk.nAD;
          if (paramk != null) {
            paramString.putParcelable("key_realname_guide_helper", paramk);
          }
          paramString.putInt("key_err_code", 0);
          com.tencent.mm.wallet_core.a.i(this, paramString);
          GMTrace.o(7683293839360L, 57245);
          return true;
        }
      }
      if (((paramk instanceof l)) && (this.qUE != null))
      {
        this.qXh = n.byF().Kg(this.qUE.field_bindSerial);
        bxc();
      }
    }
    GMTrace.o(7683293839360L, 57245);
    return false;
  }
  
  public final void gR(boolean paramBoolean)
  {
    GMTrace.i(7683562274816L, 57247);
    QS();
    GMTrace.o(7683562274816L, 57247);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7682488532992L, 57239);
    int i = a.g.sQd;
    GMTrace.o(7682488532992L, 57239);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7682622750720L, 57240);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(7682622750720L, 57240);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7682756968448L, 57241);
    super.onDestroy();
    GMTrace.o(7682756968448L, 57241);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\bind\ui\WalletResetInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */