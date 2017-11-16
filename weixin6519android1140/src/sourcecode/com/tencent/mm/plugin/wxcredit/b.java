package com.tencent.mm.plugin.wxcredit;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.c.j;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wxcredit.a.c;
import com.tencent.mm.plugin.wxcredit.a.e;
import com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountResultUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;

public class b
  extends com.tencent.mm.wallet_core.b
{
  public b()
  {
    GMTrace.i(9017686491136L, 67187);
    GMTrace.o(9017686491136L, 67187);
  }
  
  public final com.tencent.mm.wallet_core.b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(9017820708864L, 67188);
    w.d("MicroMsg.WXCreditChangeAmountProcess", "start Process : WXCreditChangeAmountProcess");
    c(paramActivity, WalletCheckPwdUI.class, paramBundle);
    GMTrace.o(9017820708864L, 67188);
    return this;
  }
  
  public final d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(9018491797504L, 67193);
    if ((paramMMActivity instanceof WalletWXCreditChangeAmountUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(8993795735552L, 67009);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousk instanceof e))
            {
              b.a(b.this).putString("kreq_token", ((e)paramAnonymousk).token);
              GMTrace.o(8993795735552L, 67009);
              return false;
            }
            if ((paramAnonymousk instanceof c))
            {
              b.b(b.this).putDouble("key_credit_amount", ((c)paramAnonymousk).skt);
              b.this.a(this.xDN, 0, b.c(b.this));
              GMTrace.o(8993795735552L, 67009);
              return true;
            }
          }
          GMTrace.o(8993795735552L, 67009);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(8993929953280L, 67010);
          paramAnonymousVarArgs = (Bankcard)b.d(b.this).getParcelable("key_bankcard");
          this.xDO.a(new e(paramAnonymousVarArgs.field_bindSerial), true, 1);
          GMTrace.o(8993929953280L, 67010);
          return true;
        }
      };
      GMTrace.o(9018491797504L, 67193);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(8992856211456L, 67002);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            b.this.a(this.xDN, 0, b.e(b.this));
            this.xDN.finish();
            GMTrace.o(8992856211456L, 67002);
            return true;
          }
          GMTrace.o(8992856211456L, 67002);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(8992990429184L, 67003);
          b.f(b.this).putString("key_pwd1", (String)paramAnonymousVarArgs[0]);
          this.xDO.a(new j((String)paramAnonymousVarArgs[0], 5, ""), true, 1);
          GMTrace.o(8992990429184L, 67003);
          return true;
        }
      };
      GMTrace.o(9018491797504L, 67193);
      return paramMMActivity;
    }
    GMTrace.o(9018491797504L, 67193);
    return null;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(9017954926592L, 67189);
    if ((paramActivity instanceof WalletCheckPwdUI))
    {
      c(paramActivity, WalletWXCreditChangeAmountUI.class, paramBundle);
      GMTrace.o(9017954926592L, 67189);
      return;
    }
    if ((paramActivity instanceof WalletWXCreditChangeAmountUI))
    {
      c(paramActivity, WalletWXCreditChangeAmountResultUI.class, paramBundle);
      GMTrace.o(9017954926592L, 67189);
      return;
    }
    if ((paramActivity instanceof WalletWXCreditChangeAmountResultUI)) {
      b(paramActivity, paramBundle);
    }
    GMTrace.o(9017954926592L, 67189);
  }
  
  public final String aAd()
  {
    GMTrace.i(9018626015232L, 67194);
    GMTrace.o(9018626015232L, 67194);
    return "WXCreditChangeAmountProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(9018223362048L, 67191);
    d(paramActivity, "wallet", ".bind.ui.WalletBankcardManageUI");
    GMTrace.o(9018223362048L, 67191);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(9018089144320L, 67190);
    B(paramActivity);
    GMTrace.o(9018089144320L, 67190);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(9018357579776L, 67192);
    GMTrace.o(9018357579776L, 67192);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */