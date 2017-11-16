package com.tencent.mm.plugin.wallet.bind;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class a
  extends b
{
  public a()
  {
    GMTrace.i(7673898598400L, 57175);
    GMTrace.o(7673898598400L, 57175);
  }
  
  public final b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7674032816128L, 57176);
    w.d("MicroMsg.ProcessManager", "start Process : UnbindProcess");
    if (paramBundle.getBoolean("key_is_show_detail", true)) {
      d(paramActivity, paramBundle);
    }
    for (;;)
    {
      GMTrace.o(7674032816128L, 57176);
      return this;
      c(paramActivity, WalletCheckPwdUI.class, paramBundle);
    }
  }
  
  public com.tencent.mm.wallet_core.d.d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(7674703904768L, 57181);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new com.tencent.mm.wallet_core.d.d(paramMMActivity, paramf)
      {
        private String eHG;
        
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7695104999424L, 57333);
          if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet.bind.a.d))
          {
            if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
            {
              a.this.ler.putInt("key_process_result_code", -1);
              if (a.this.c(this.xDN, null)) {
                this.xDO.a(new o(this.eHG), true, 1);
              }
              for (;;)
              {
                GMTrace.o(7695104999424L, 57333);
                return true;
                a.this.a(this.xDN, 0, null);
                if ((this.xDN instanceof WalletBaseUI)) {
                  ((WalletBaseUI)this.xDN).so(0);
                }
                this.xDN.finish();
              }
            }
            a.this.ler.putInt("key_process_result_code", 1);
          }
          GMTrace.o(7695104999424L, 57333);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7695373434880L, 57335);
          Bankcard localBankcard = (Bankcard)a.c(a.this).getParcelable("key_bankcard");
          String str = (String)paramAnonymousVarArgs[0];
          this.eHG = ((String)paramAnonymousVarArgs[1]);
          if (localBankcard != null)
          {
            this.xDO.a(new com.tencent.mm.plugin.wallet.bind.a.d(localBankcard.field_bankcardType, localBankcard.field_bindSerial, str), true, 1);
            GMTrace.o(7695373434880L, 57335);
            return true;
          }
          a.this.ler.putInt("key_process_result_code", 1);
          GMTrace.o(7695373434880L, 57335);
          return false;
        }
        
        public final boolean p(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7695239217152L, 57334);
          Bankcard localBankcard = (Bankcard)a.a(a.this).getParcelable("key_bankcard");
          if ((localBankcard != null) && (localBankcard.field_bankcardState == 1))
          {
            this.xDO.a(new com.tencent.mm.plugin.wallet.bind.a.d(localBankcard.field_bankcardType, localBankcard.field_bindSerial), true, 1);
            a.b(a.this).putBoolean("key_is_expired_bankcard", true);
            GMTrace.o(7695239217152L, 57334);
            return true;
          }
          a.this.ler.putInt("key_process_result_code", 1);
          boolean bool = super.p(paramAnonymousVarArgs);
          GMTrace.o(7695239217152L, 57334);
          return bool;
        }
        
        public final CharSequence se(int paramAnonymousInt)
        {
          GMTrace.i(7695507652608L, 57336);
          switch (paramAnonymousInt)
          {
          default: 
            localObject = super.se(paramAnonymousInt);
            GMTrace.o(7695507652608L, 57336);
            return (CharSequence)localObject;
          }
          Object localObject = this.xDN.getString(a.i.tcf);
          GMTrace.o(7695507652608L, 57336);
          return (CharSequence)localObject;
        }
      };
      GMTrace.o(7674703904768L, 57181);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(7674703904768L, 57181);
    return paramMMActivity;
  }
  
  public void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(7674301251584L, 57178);
    if ((paramActivity instanceof WalletBankcardDetailUI))
    {
      c(paramActivity, WalletCheckPwdUI.class, paramBundle);
      GMTrace.o(7674301251584L, 57178);
      return;
    }
    if ((paramActivity instanceof WalletCheckPwdUI)) {
      b(paramActivity, paramBundle);
    }
    GMTrace.o(7674301251584L, 57178);
  }
  
  public final String aAd()
  {
    GMTrace.i(7674972340224L, 57183);
    GMTrace.o(7674972340224L, 57183);
    return "UnbindProcess";
  }
  
  public void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7674569687040L, 57180);
    if (this.ler.getInt("scene", -1) == 1)
    {
      a(paramActivity, "wallet", ".bind.ui.WalletUnbindBankCardProxyUI", paramBundle.getInt("key_process_result_code", 0), false);
      GMTrace.o(7674569687040L, 57180);
      return;
    }
    d(paramActivity, "mall", ".ui.MallIndexUI");
    GMTrace.o(7674569687040L, 57180);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(7674435469312L, 57179);
    B(paramActivity);
    GMTrace.o(7674435469312L, 57179);
  }
  
  public boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7674838122496L, 57182);
    if ((paramActivity instanceof WalletCheckPwdUI))
    {
      GMTrace.o(7674838122496L, 57182);
      return true;
    }
    GMTrace.o(7674838122496L, 57182);
    return false;
  }
  
  public void d(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7674167033856L, 57177);
    c(paramActivity, WalletBankcardDetailUI.class, paramBundle);
    GMTrace.o(7674167033856L, 57177);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\bind\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */