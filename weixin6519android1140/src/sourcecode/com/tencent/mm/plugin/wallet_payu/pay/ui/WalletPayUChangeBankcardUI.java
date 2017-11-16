package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.lk;
import com.tencent.mm.plugin.wallet.a.f;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.ui.e;
import com.tencent.mm.plugin.wallet_core.ui.l;
import com.tencent.mm.plugin.wallet_payu.pay.a.d;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(3)
public class WalletPayUChangeBankcardUI
  extends WalletChangeBankcardUI
{
  private String ruF;
  private c ruG;
  
  public WalletPayUChangeBankcardUI()
  {
    GMTrace.i(7982465155072L, 59474);
    this.ruF = null;
    this.ruG = new c() {};
    GMTrace.o(7982465155072L, 59474);
  }
  
  protected final void JY(String paramString)
  {
    GMTrace.i(7983136243712L, 59479);
    this.qXg.red = paramString;
    label171:
    Object localObject;
    boolean bool;
    if (this.qTV != null)
    {
      this.ui.putString("key_mobile", this.qTV.field_mobile);
      this.ui.putParcelable("key_bankcard", this.qTV);
      this.qXg.nDu = this.qTV.field_bindSerial;
      this.qXg.nDt = this.qTV.field_bankcardType;
      if (this.qYW == null) {
        break label352;
      }
      this.qXg.rep = this.qYW.rgo;
      if ((this.opK != null) && (this.opK.rhw != null)) {
        this.qXg.reo = this.opK.rhw.qXz;
      }
      if ((this.opK != null) && (this.opK.rcw == 3))
      {
        if (!this.qTV.byg()) {
          break label363;
        }
        this.qXg.eQl = 3;
        localObject = this.ui;
        if (this.qTV.byg()) {
          break label375;
        }
        bool = true;
        label190:
        ((Bundle)localObject).putBoolean("key_is_oversea", bool);
      }
    }
    this.ui.putParcelable("key_authen", this.qXg);
    if ((this.qYU.ePL == 32) || (this.qYU.ePL == 31))
    {
      if (this.qYU.ePL == 32) {
        w.d("MicroMsg.WalletPayUChangeBankcardUI", "hy: transfer ftf");
      }
      for (int i = 1;; i = 0)
      {
        r(new com.tencent.mm.plugin.wallet_payu.remittance.a.a(this.qYU.eHG, this.llG, this.qYU.tIC.getDouble("total_fee"), this.qYU.tIC.getString("fee_type"), i, this.qYU.tIC.getString("extinfo_key_1"), this.qTV.field_bindSerial, this.qYU.tIC.getString("extinfo_key_4")));
        GMTrace.o(7983136243712L, 59479);
        return;
        label352:
        this.qXg.rep = null;
        break;
        label363:
        this.qXg.eQl = 6;
        break label171;
        label375:
        bool = false;
        break label190;
      }
    }
    if (this.qYU.ePL == 11)
    {
      paramString = this.llG;
      localObject = this.ruF;
      String str1 = this.qYU.eHG;
      double d = this.qYU.tIC.getDouble("total_fee");
      String str2 = this.qYU.tIC.getString("fee_type");
      String str3 = this.qTV.field_bindSerial;
      String str4 = this.qTV.field_bankcardType;
      p.bxd();
      r(new com.tencent.mm.plugin.wallet_payu.balance.a.b(paramString, (String)localObject, str1, d, str2, str3, str4, p.bxe().qUy.field_bindSerial));
      GMTrace.o(7983136243712L, 59479);
      return;
    }
    l(new com.tencent.mm.plugin.wallet_payu.pay.a.b(this.qYU.eHG, this.qYU.tIC.getDouble("total_fee"), this.qYU.tIC.getString("fee_type"), this.qTV.field_bankcardType, this.qTV.field_bindSerial, this.ruF, paramString));
    GMTrace.o(7983136243712L, 59479);
  }
  
  protected final e bxo()
  {
    GMTrace.i(7982867808256L, 59477);
    a locala = new a(this, this.qTU, this.qYS, this.opK);
    GMTrace.o(7982867808256L, 59477);
    return locala;
  }
  
  protected final void bxp()
  {
    GMTrace.i(7983002025984L, 59478);
    w.d("MicroMsg.WalletPayUChangeBankcardUI", "pay with old bankcard!");
    String str = this.ui.getString("key_pwd1");
    if (bg.nm(str))
    {
      sv(4);
      this.qTS = b.a(this, this.opK, this.qYW, this.qTV, new b.b()new View.OnClickListener
      {
        public final void a(String paramAnonymousString1, String paramAnonymousString2, FavorPayInfo paramAnonymousFavorPayInfo)
        {
          GMTrace.i(7985820598272L, 59499);
          WalletPayUChangeBankcardUI.a(WalletPayUChangeBankcardUI.this, paramAnonymousFavorPayInfo);
          WalletPayUChangeBankcardUI.this.ui.putParcelable("key_favor_pay_info", WalletPayUChangeBankcardUI.a(WalletPayUChangeBankcardUI.this));
          WalletPayUChangeBankcardUI.a(WalletPayUChangeBankcardUI.this, paramAnonymousString1);
          WalletPayUChangeBankcardUI.b(WalletPayUChangeBankcardUI.this, paramAnonymousString2);
          WalletPayUChangeBankcardUI.this.aLo();
          WalletPayUChangeBankcardUI.this.JY(paramAnonymousString1);
          GMTrace.o(7985820598272L, 59499);
        }
      }, new View.OnClickListener()new DialogInterface.OnCancelListener
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7980988760064L, 59463);
          if (WalletPayUChangeBankcardUI.b(WalletPayUChangeBankcardUI.this) != null) {
            WalletPayUChangeBankcardUI.c(WalletPayUChangeBankcardUI.this).dismiss();
          }
          WalletPayUChangeBankcardUI.e(WalletPayUChangeBankcardUI.this).e(WalletPayUChangeBankcardUI.d(WalletPayUChangeBankcardUI.this), true);
          WalletPayUChangeBankcardUI.b(WalletPayUChangeBankcardUI.this, (FavorPayInfo)paramAnonymousView.getTag());
          if (WalletPayUChangeBankcardUI.f(WalletPayUChangeBankcardUI.this) != null) {
            WalletPayUChangeBankcardUI.g(WalletPayUChangeBankcardUI.this).rgs = "";
          }
          WalletPayUChangeBankcardUI.this.ui.putParcelable("key_favor_pay_info", WalletPayUChangeBankcardUI.h(WalletPayUChangeBankcardUI.this));
          WalletPayUChangeBankcardUI.i(WalletPayUChangeBankcardUI.this);
          WalletPayUChangeBankcardUI.this.sv(0);
          GMTrace.o(7980988760064L, 59463);
        }
      }, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(7976022704128L, 59426);
          WalletPayUChangeBankcardUI.j(WalletPayUChangeBankcardUI.this);
          if (WalletPayUChangeBankcardUI.k(WalletPayUChangeBankcardUI.this).getVisibility() != 0) {
            WalletPayUChangeBankcardUI.l(WalletPayUChangeBankcardUI.this);
          }
          GMTrace.o(7976022704128L, 59426);
        }
      }, "CREDITCARD_PAYU".equals(this.qTV.field_bankcardType));
      GMTrace.o(7983002025984L, 59478);
      return;
    }
    JY(str);
    GMTrace.o(7983002025984L, 59478);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7983270461440L, 59480);
    if ((paramInt1 == 0) && (paramInt2 == 0) && (((paramk instanceof com.tencent.mm.plugin.wallet_payu.pay.a.b)) || ((paramk instanceof com.tencent.mm.plugin.wallet_payu.remittance.a.a)) || ((paramk instanceof com.tencent.mm.plugin.wallet_payu.balance.a.b))))
    {
      paramString = this.ui;
      if (!bg.nm(this.llG)) {
        paramString.putString("key_pwd1", this.llG);
      }
      paramString.putBoolean("key_need_verify_sms", false);
      paramString.putParcelable("key_pay_info", this.qYU);
      paramString.putInt("key_pay_flag", 3);
      if ((paramk instanceof com.tencent.mm.plugin.wallet_payu.pay.a.b))
      {
        com.tencent.mm.plugin.wallet_payu.pay.a.b localb = (com.tencent.mm.plugin.wallet_payu.pay.a.b)paramk;
        paramString.putString("transid", localb.jVR);
        paramString.putBoolean("key_should_redirect", localb.ruz);
        paramString.putString("key_gateway_code", localb.rtd);
        paramString.putString("key_gateway_reference", localb.rtc);
        paramString.putString("key_force_adjust_code", localb.rtf);
        paramString.putBoolean("key_should_force_adjust", localb.ruA);
        if (localb.isSuccess()) {
          paramString.putParcelable("key_orders", d.a(this.opK, localb.ruB, localb.ruC, localb.jWT, localb.rkr));
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.wallet_payu.balance.a.b))
      {
        paramk = (com.tencent.mm.plugin.wallet_payu.balance.a.b)paramk;
        paramString.putString("transid", paramk.jVR);
        paramString.putBoolean("key_should_redirect", paramk.rtb);
        paramString.putString("key_gateway_code", paramk.rtd);
        paramString.putString("key_gateway_reference", paramk.rtc);
        paramString.putString("key_force_adjust_code", paramk.rtf);
        paramString.putBoolean("key_should_force_adjust", paramk.rte);
      }
      com.tencent.mm.wallet_core.a.i(this, paramString);
      GMTrace.o(7983270461440L, 59480);
      return true;
    }
    GMTrace.o(7983270461440L, 59480);
    return false;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7983404679168L, 59481);
    if (paramInt1 == 23351)
    {
      w.d("MicroMsg.WalletPayUChangeBankcardUI", "hy: check otp done. resultcode: %d", new Object[] { Integer.valueOf(paramInt2) });
      if (paramInt2 == -1)
      {
        this.ui.putBoolean("key_should_redirect", false);
        com.tencent.mm.wallet_core.a.i(this, this.ui);
      }
      if (paramInt2 == 0) {
        com.tencent.mm.wallet_core.a.c(this, this.ui, 0);
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(7983404679168L, 59481);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7982599372800L, 59475);
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.b.a.vgX.b(this.ruG);
    GMTrace.o(7982599372800L, 59475);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7982733590528L, 59476);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.vgX.c(this.ruG);
    GMTrace.o(7982733590528L, 59476);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pay\ui\WalletPayUChangeBankcardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */