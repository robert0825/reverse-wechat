package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.sr;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.ui.l;
import com.tencent.mm.plugin.wallet_payu.pay.a.d;
import com.tencent.mm.plugin.wallet_payu.pay.a.e;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletPayUPayUI
  extends WalletPayUI
{
  private String ruF;
  
  public WalletPayUPayUI()
  {
    GMTrace.i(7977364881408L, 59436);
    this.ruF = null;
    GMTrace.o(7977364881408L, 59436);
  }
  
  protected final void K(Bundle paramBundle)
  {
    boolean bool = true;
    GMTrace.i(7978035970048L, 59441);
    this.qZE = true;
    if (this.opK != null) {
      paramBundle.putInt("key_support_bankcard", this.opK.rcw);
    }
    if (!bxD()) {}
    for (;;)
    {
      paramBundle.putBoolean("key_is_oversea", bool);
      com.tencent.mm.wallet_core.a.a(this, e.class, paramBundle);
      GMTrace.o(7978035970048L, 59441);
      return;
      bool = false;
    }
  }
  
  protected final void bxp()
  {
    GMTrace.i(7977901752320L, 59440);
    if (!QS())
    {
      GMTrace.o(7977901752320L, 59440);
      return;
    }
    w.d("MicroMsg.WalletPayUPayUI", "pay with old bankcard!");
    this.qTS = b.a(this, this.opK, this.qYW, this.qTV, new b.b()new View.OnClickListener
    {
      public final void a(String paramAnonymousString1, String paramAnonymousString2, FavorPayInfo paramAnonymousFavorPayInfo)
      {
        GMTrace.i(7980720324608L, 59461);
        WalletPayUPayUI.this.aLo();
        WalletPayUPayUI.a(WalletPayUPayUI.this, paramAnonymousString1);
        WalletPayUPayUI.b(WalletPayUPayUI.this, paramAnonymousString2);
        WalletPayUPayUI.this.iP(false);
        com.tencent.mm.plugin.wallet_core.e.c.bAa();
        GMTrace.o(7980720324608L, 59461);
      }
    }, new View.OnClickListener()new DialogInterface.OnCancelListener
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7986625904640L, 59505);
        WalletPayUPayUI.a(WalletPayUPayUI.this, (FavorPayInfo)paramAnonymousView.getTag());
        if (WalletPayUPayUI.a(WalletPayUPayUI.this) != null) {
          WalletPayUPayUI.b(WalletPayUPayUI.this).rgs = "";
        }
        WalletPayUPayUI.c(WalletPayUPayUI.this, "");
        WalletPayUPayUI.c(WalletPayUPayUI.this).dismiss();
        WalletPayUPayUI.d(WalletPayUPayUI.this);
        WalletPayUPayUI.e(WalletPayUPayUI.this);
        GMTrace.o(7986625904640L, 59505);
      }
    }, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(7982330937344L, 59473);
        WalletPayUPayUI.f(WalletPayUPayUI.this);
        WalletPayUPayUI.g(WalletPayUPayUI.this);
        if (WalletPayUPayUI.this.aNg()) {
          WalletPayUPayUI.this.finish();
        }
        GMTrace.o(7982330937344L, 59473);
      }
    }, "CREDITCARD_PAYU".equals(this.qTV.field_bankcardType));
    GMTrace.o(7977901752320L, 59440);
  }
  
  protected final void bxy()
  {
    GMTrace.i(7977767534592L, 59439);
    b(new com.tencent.mm.plugin.wallet_payu.pay.a.c(bxJ().eHG), bxJ().tIA);
    b(new com.tencent.mm.plugin.wallet_core.c.b.a(bxJ().eHG), bxJ().tIA);
    GMTrace.o(7977767534592L, 59439);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7978304405504L, 59443);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.wallet_payu.pay.a.c))
      {
        this.opK = ((com.tencent.mm.plugin.wallet_payu.pay.a.c)paramk).opK;
        if (this.opK != null)
        {
          paramInt1 = this.opK.rhv.size();
          this.mCount = paramInt1;
          paramk = new StringBuilder("get mOrders! bankcardTag : ");
          if (this.opK == null) {
            break label211;
          }
        }
        label211:
        for (paramString = Integer.valueOf(this.opK.rcw);; paramString = "")
        {
          w.d("MicroMsg.WalletPayUPayUI", paramString);
          QS();
          if ((this.opK == null) || (this.opK.rhv == null)) {
            break label302;
          }
          paramString = new LinkedList();
          paramk = this.opK.rhv.iterator();
          while (paramk.hasNext())
          {
            Orders.Commodity localCommodity = (Orders.Commodity)paramk.next();
            if (bg.nm(localCommodity.eRP)) {
              localCommodity.eRP = this.qYU.eHG;
            }
            paramString.add(localCommodity.eRP);
          }
          paramInt1 = 0;
          break;
        }
        if (paramString.size() > 0)
        {
          paramk = new sr();
          paramk.eXZ.eYb = paramString;
          com.tencent.mm.sdk.b.a.vgX.m(paramk);
        }
        paramString = new Bundle();
        paramString.putDouble("total_fee", this.opK.rhd);
        paramString.putString("fee_type", "ZAR");
        if (this.qYU.tIC == null) {
          this.qYU.tIC = paramString;
        }
      }
      label302:
      do
      {
        do
        {
          for (;;)
          {
            ar();
            GMTrace.o(7978304405504L, 59443);
            return true;
            this.qYU.tIC.putAll(paramString);
          }
          if (!(paramk instanceof com.tencent.mm.plugin.wallet_core.c.b.a)) {
            break;
          }
          p.bxd();
          this.qTU = p.bxe().iL(bxm());
          p.bxd();
          this.qTV = p.bxe().a(null, null, bxm(), false);
          this.oow.setClickable(true);
        } while ((this.opK == null) || (this.qTU == null) || (this.qYU == null));
        com.tencent.mm.plugin.wallet_core.e.c.a(this.qYU, this.opK);
        paramString = g.ork;
        paramInt2 = this.qYU.ePL;
        p.bxd();
        if (p.bxe().byS()) {}
        for (paramInt1 = 2;; paramInt1 = 1)
        {
          paramString.i(10690, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf((int)(this.opK.rhd * 100.0D)), this.opK.nEr });
          break;
        }
        if ((paramk instanceof com.tencent.mm.plugin.wallet_payu.pay.a.b))
        {
          paramString = (com.tencent.mm.plugin.wallet_payu.pay.a.b)paramk;
          paramk = this.ui;
          paramk.putParcelable("key_pay_info", this.qYU);
          paramk.putParcelable("key_bankcard", this.qTV);
          paramk.putString("key_bank_type", this.qTV.field_bankcardType);
          if (!bg.nm(this.llG)) {
            paramk.putString("key_pwd1", this.llG);
          }
          paramk.putString("kreq_token", paramString.aWg());
          paramk.putParcelable("key_authen", bxC());
          paramk.putBoolean("key_need_verify_sms", false);
          paramk.putString("key_mobile", this.qTV.field_mobile);
          if (paramString.isSuccess()) {
            paramk.putParcelable("key_orders", d.a(this.opK, paramString.ruB, paramString.ruC, paramString.jWT, paramString.rkr));
          }
          this.ui.putBoolean("key_should_redirect", paramString.ruz);
          this.ui.putString("key_gateway_code", paramString.rtd);
          this.ui.putString("key_gateway_reference", paramString.rtc);
          this.ui.putBoolean("key_should_force_adjust", paramString.ruA);
          this.ui.putString("key_force_adjust_code", paramString.rtf);
          paramk.putInt("key_pay_flag", 3);
          K(paramk);
          GMTrace.o(7978304405504L, 59443);
          return true;
        }
      } while (!(paramk instanceof com.tencent.mm.plugin.wallet_payu.remittance.a.a));
      paramString = (com.tencent.mm.plugin.wallet_payu.remittance.a.a)paramk;
      paramk = this.ui;
      paramk.putParcelable("key_pay_info", this.qYU);
      paramk.putParcelable("key_bankcard", this.qTV);
      paramk.putString("key_bank_type", this.qTV.field_bankcardType);
      if (!bg.nm(this.llG)) {
        paramk.putString("key_pwd1", this.llG);
      }
      paramk.putString("kreq_token", paramString.aWg());
      paramk.putParcelable("key_authen", bxC());
      paramk.putBoolean("key_need_verify_sms", false);
      paramk.putString("key_mobile", this.qTV.field_mobile);
      paramk.putParcelable("key_orders", this.opK);
      paramk.putInt("key_pay_flag", 3);
      K(paramk);
      GMTrace.o(7978304405504L, 59443);
      return true;
    }
    if ((paramk instanceof com.tencent.mm.plugin.wallet_payu.pay.a.b)) {}
    switch (paramInt2)
    {
    case 405: 
    case 406: 
    case 407: 
    default: 
      GMTrace.o(7978304405504L, 59443);
      return false;
    case 402: 
    case 403: 
    case 408: 
      paramk = (com.tencent.mm.plugin.wallet_payu.pay.a.b)paramk;
      this.qZI = this.ui;
      this.qZI.putParcelable("key_pay_info", this.qYU);
      this.qZI.putParcelable("key_bankcard", this.qTV);
      if (!bg.nm(this.llG)) {
        this.qZI.putString("key_pwd1", this.llG);
      }
      this.qZI.putString("kreq_token", paramk.aWg());
      this.qZI.putString("key_mobile", this.qTV.field_mobile);
      this.qZI.putInt("key_err_code", paramInt2);
      this.qZI.putParcelable("key_orders", this.opK);
      if (bg.nm(paramString)) {
        paramString = getString(a.i.teK);
      }
      break;
    }
    for (;;)
    {
      h.a(this, paramString, "", getString(a.i.teJ), getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7986357469184L, 59503);
          WalletPayUPayUI.h(WalletPayUPayUI.this).putInt("key_pay_flag", 3);
          WalletPayUPayUI.this.K(WalletPayUPayUI.i(WalletPayUPayUI.this));
          GMTrace.o(7986357469184L, 59503);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7976291139584L, 59428);
          if (WalletPayUPayUI.this.aNg()) {
            WalletPayUPayUI.this.finish();
          }
          GMTrace.o(7976291139584L, 59428);
        }
      });
      GMTrace.o(7978304405504L, 59443);
      return true;
      if ((this.qTV == null) || (this.opK == null)) {
        break;
      }
      this.qTV.reJ = this.opK.eHG;
      if ((this.qTU != null) && (this.qTU.size() > 1)) {
        c(true, 4, paramString);
      }
      for (;;)
      {
        GMTrace.o(7978304405504L, 59443);
        return true;
        b(true, 4, paramString);
      }
    }
  }
  
  protected final void iP(boolean paramBoolean)
  {
    GMTrace.i(7978170187776L, 59442);
    if ((this.qYU.ePL == 32) || (this.qYU.ePL == 31))
    {
      if (this.qYU.ePL == 32) {
        w.d("MicroMsg.WalletPayUPayUI", "hy: transfer ftf");
      }
      for (int i = 1;; i = 0)
      {
        r(new com.tencent.mm.plugin.wallet_payu.remittance.a.a(this.qYU.eHG, this.llG, this.qYU.tIC.getDouble("total_fee"), this.qYU.tIC.getString("fee_type"), i, this.qYU.tIC.getString("extinfo_key_1"), this.qTV.field_bindSerial, this.qYU.tIC.getString("extinfo_key_4")));
        GMTrace.o(7978170187776L, 59442);
        return;
      }
    }
    if (this.qYU.ePL == 11)
    {
      String str1 = this.llG;
      String str2 = this.ruF;
      String str3 = this.qYU.eHG;
      double d = this.qYU.tIC.getDouble("total_fee");
      String str4 = this.qYU.tIC.getString("fee_type");
      String str5 = this.qTV.field_bindSerial;
      String str6 = this.qTV.field_bankcardType;
      p.bxd();
      r(new com.tencent.mm.plugin.wallet_payu.balance.a.b(str1, str2, str3, d, str4, str5, str6, p.bxe().qUy.field_bindSerial));
      GMTrace.o(7978170187776L, 59442);
      return;
    }
    l(new com.tencent.mm.plugin.wallet_payu.pay.a.b(this.qYU.eHG, this.qYU.tIC.getDouble("total_fee"), this.qYU.tIC.getString("fee_type"), this.qTV.field_bankcardType, this.qTV.field_bindSerial, this.ruF, this.llG));
    GMTrace.o(7978170187776L, 59442);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7977499099136L, 59437);
    super.onCreate(paramBundle);
    GMTrace.o(7977499099136L, 59437);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(7977633316864L, 59438);
    w.i("MicroMsg.WalletPayUPayUI", "hy: onNewIntent");
    super.onNewIntent(paramIntent);
    GMTrace.o(7977633316864L, 59438);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pay\ui\WalletPayUPayUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */