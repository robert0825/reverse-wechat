package com.tencent.mm.plugin.wallet_payu.pay.a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.ss;
import com.tencent.mm.g.a.ss.a;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_payu.balance.ui.WalletPayUBalanceManagerUI;
import com.tencent.mm.plugin.wallet_payu.balance.ui.WalletPayUBalanceResultUI;
import com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUVerifyCodeUI;
import com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUChangeBankcardUI;
import com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUOrderInfoUI;
import com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUPayUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class e
  extends com.tencent.mm.plugin.wallet_core.b.a
{
  public e()
  {
    GMTrace.i(7971593519104L, 59393);
    GMTrace.o(7971593519104L, 59393);
  }
  
  private void f(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7972398825472L, 59399);
    int i = paramBundle.getInt("key_pay_scene", 6);
    if ((i == 11) || (i == 21))
    {
      c(paramActivity, WalletPayUBalanceResultUI.class, paramBundle);
      GMTrace.o(7972398825472L, 59399);
      return;
    }
    if ((i == 31) || (i == 32) || (i == 33))
    {
      a(paramActivity, "remittance", ".ui.RemittanceResultUI", paramBundle);
      GMTrace.o(7972398825472L, 59399);
      return;
    }
    c(paramActivity, WalletPayUOrderInfoUI.class, paramBundle);
    GMTrace.o(7972398825472L, 59399);
  }
  
  private void h(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7972264607744L, 59398);
    if (paramBundle.getBoolean("key_should_redirect", false))
    {
      paramBundle.getString("key_gateway_code");
      String str = paramBundle.getString("key_gateway_reference");
      boolean bool = paramBundle.getBoolean("key_should_force_adjust");
      paramBundle = paramBundle.getString("key_force_adjust_code");
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", str);
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("shouldForceViewPort", bool);
      localIntent.putExtra("pay_channel", 2);
      localIntent.putExtra("view_port_code", paramBundle);
      com.tencent.mm.bj.d.b(paramActivity, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent, 23351);
      GMTrace.o(7972264607744L, 59398);
      return;
    }
    f(paramActivity, paramBundle);
    GMTrace.o(7972264607744L, 59398);
  }
  
  public final b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7971727736832L, 59394);
    paramBundle.putInt("key_pay_scene", ((PayInfo)paramBundle.getParcelable("key_pay_info")).ePL);
    switch (paramBundle.getInt("key_err_code", 0))
    {
    default: 
      w.d("MicroMsg.PayUPayProcess", "start pay_flag : " + paramBundle.getInt("key_pay_flag", 0));
      switch (paramBundle.getInt("key_pay_flag", 0))
      {
      }
      break;
    }
    for (;;)
    {
      GMTrace.o(7971727736832L, 59394);
      return this;
      paramBundle.putInt("key_pay_flag", 3);
      paramBundle.putInt("key_err_code", 0);
      c(paramActivity, WalletPayUChangeBankcardUI.class, paramBundle);
      GMTrace.o(7971727736832L, 59394);
      return this;
      h(paramActivity, paramBundle);
    }
  }
  
  public final com.tencent.mm.wallet_core.d.d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(7972667260928L, 59401);
    if ((paramMMActivity instanceof WalletPayUPayUI))
    {
      paramMMActivity = new com.tencent.mm.wallet_core.d.d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7973472567296L, 59407);
          GMTrace.o(7973472567296L, 59407);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7973606785024L, 59408);
          GMTrace.o(7973606785024L, 59408);
          return false;
        }
        
        public final boolean p(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7973338349568L, 59406);
          paramAnonymousVarArgs = (PayInfo)this.xDN.getIntent().getParcelableExtra("key_pay_info");
          if ((paramAnonymousVarArgs != null) && (!bg.nm(paramAnonymousVarArgs.eHG)))
          {
            this.xDO.a(new c(paramAnonymousVarArgs.eHG), paramAnonymousVarArgs.tIA, 1);
            this.xDO.a(new com.tencent.mm.plugin.wallet_core.c.b.a(), paramAnonymousVarArgs.tIA, 1);
            GMTrace.o(7973338349568L, 59406);
            return true;
          }
          GMTrace.o(7973338349568L, 59406);
          return false;
        }
      };
      GMTrace.o(7972667260928L, 59401);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletPayUBalanceResultUI))
    {
      paramMMActivity = new com.tencent.mm.wallet_core.d.d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7973875220480L, 59410);
          GMTrace.o(7973875220480L, 59410);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7974009438208L, 59411);
          paramAnonymousVarArgs = (Orders)paramAnonymousVarArgs[0];
          p.bxd();
          Bankcard localBankcard = p.bxe().qUy;
          localBankcard.reK += paramAnonymousVarArgs.rhd;
          GMTrace.o(7974009438208L, 59411);
          return false;
        }
        
        public final CharSequence se(int paramAnonymousInt)
        {
          GMTrace.i(7974143655936L, 59412);
          switch (paramAnonymousInt)
          {
          default: 
            localObject = super.se(paramAnonymousInt);
            GMTrace.o(7974143655936L, 59412);
            return (CharSequence)localObject;
          case 0: 
            localObject = this.xDN.getString(a.i.sZA);
            GMTrace.o(7974143655936L, 59412);
            return (CharSequence)localObject;
          }
          Object localObject = this.xDN.getString(a.i.sZz);
          GMTrace.o(7974143655936L, 59412);
          return (CharSequence)localObject;
        }
      };
      GMTrace.o(7972667260928L, 59401);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(7972667260928L, 59401);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    paramInt = 1;
    GMTrace.i(7971861954560L, 59395);
    switch (paramBundle.getInt("key_err_code", 0))
    {
    default: 
      paramInt = 0;
    }
    while (paramInt != 0)
    {
      w.i("MicroMsg.PayUPayProcess", "deal with the err!");
      GMTrace.o(7971861954560L, 59395);
      return;
      b(paramActivity, paramBundle);
      continue;
      com.tencent.mm.wallet_core.a.a(paramActivity, com.tencent.mm.plugin.wallet_payu.bind.model.c.class, paramBundle);
      continue;
      paramBundle.putInt("key_pay_flag", 3);
      paramBundle.putInt("key_err_code", 0);
      c(paramActivity, WalletPayUChangeBankcardUI.class, paramBundle);
    }
    if (paramBundle.containsKey("key_pay_flag"))
    {
      paramInt = paramBundle.getInt("key_pay_flag", 0);
      w.d("MicroMsg.PayUPayProcess", "forward pay_flag : " + paramInt);
      switch (paramInt)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(7971861954560L, 59395);
      return;
      paramInt = this.ler.getInt("key_pay_flag", 0);
      break;
      if ((paramActivity instanceof WalletPayUVerifyCodeUI))
      {
        f(paramActivity, paramBundle);
        GMTrace.o(7971861954560L, 59395);
        return;
      }
      if ((paramActivity instanceof WalletPayUChangeBankcardUI))
      {
        h(paramActivity, paramBundle);
        GMTrace.o(7971861954560L, 59395);
        return;
      }
      if ((paramActivity instanceof WalletPayUBalanceResultUI))
      {
        Intent localIntent = new Intent(paramActivity, WalletPayUBalanceManagerUI.class);
        localIntent.putExtras(new Bundle());
        localIntent.getExtras().putAll(paramBundle);
        a(paramActivity, WalletPayUBalanceManagerUI.class, localIntent);
        GMTrace.o(7971861954560L, 59395);
        return;
      }
      super.a(paramActivity, 0, paramBundle);
    }
  }
  
  public final boolean a(WalletBaseUI paramWalletBaseUI, int paramInt, String paramString)
  {
    GMTrace.i(7972801478656L, 59402);
    GMTrace.o(7972801478656L, 59402);
    return false;
  }
  
  public final String aAd()
  {
    GMTrace.i(7973069914112L, 59404);
    GMTrace.o(7973069914112L, 59404);
    return "PayUPayProcess";
  }
  
  public final int b(MMActivity paramMMActivity, int paramInt)
  {
    GMTrace.i(7972935696384L, 59403);
    paramInt = a.i.teE;
    GMTrace.o(7972935696384L, 59403);
    return paramInt;
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    int j = -1;
    GMTrace.i(7972130390016L, 59397);
    w.d("MicroMsg.PayUPayProcess", "end pay_flag : " + this.ler.getInt("key_pay_flag", 0));
    int i;
    Intent localIntent;
    ss.a locala;
    if (this.ler.getBoolean("intent_pay_end", false))
    {
      i = -1;
      localIntent = new Intent();
      if (paramBundle != null)
      {
        paramBundle = new Bundle();
        paramBundle.putInt("intent_pay_end_errcode", this.ler.getInt("intent_pay_end_errcode"));
        paramBundle.putString("intent_pay_app_url", this.ler.getString("intent_pay_app_url"));
        paramBundle.putBoolean("intent_pay_end", this.ler.getBoolean("intent_pay_end"));
        paramBundle.putString("intent_wap_pay_jump_url", this.ler.getString("intent_wap_pay_jump_url"));
        localIntent.putExtras(paramBundle);
      }
      paramBundle = new ss();
      paramBundle.eYc.context = paramActivity;
      paramBundle.eYc.intent = localIntent;
      locala = paramBundle.eYc;
      if (!this.ler.getBoolean("intent_pay_end", false)) {
        break label242;
      }
    }
    for (;;)
    {
      locala.result = j;
      com.tencent.mm.sdk.b.a.vgX.m(paramBundle);
      a(paramActivity, "wallet_payu", ".pay.ui.WalletPayUPayUI", i, localIntent, false);
      GMTrace.o(7972130390016L, 59397);
      return;
      i = 0;
      break;
      label242:
      j = 0;
    }
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(7971996172288L, 59396);
    w.d("MicroMsg.PayUPayProcess", "bakck pay_flag : " + this.ler.getInt("key_pay_flag", 0));
    if ((paramActivity instanceof WalletPwdConfirmUI))
    {
      a(paramActivity, WalletSetPasswordUI.class, paramInt);
      GMTrace.o(7971996172288L, 59396);
      return;
    }
    B(paramActivity);
    GMTrace.o(7971996172288L, 59396);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7972533043200L, 59400);
    w.d("MicroMsg.PayUPayProcess", "needupdatebankcardlist pay_flag : " + this.ler.getInt("key_pay_flag", 0));
    switch (this.ler.getInt("key_pay_flag", 0))
    {
    default: 
      GMTrace.o(7972533043200L, 59400);
      return false;
    }
    GMTrace.o(7972533043200L, 59400);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pay\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */