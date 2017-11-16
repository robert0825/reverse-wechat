package com.tencent.mm.plugin.wxcredit;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.d.d;

public class f
  extends b
{
  public f()
  {
    GMTrace.i(9020907716608L, 67211);
    GMTrace.o(9020907716608L, 67211);
  }
  
  public final b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(9021041934336L, 67212);
    w.d("MicroMsg.ProcessManager", "start Process : UnbindProcess");
    if (paramBundle.getBoolean("key_is_show_detail", true)) {
      a(paramActivity, "wallet", ".bind.ui.WalletBankcardDetailUI", paramBundle);
    }
    for (;;)
    {
      GMTrace.o(9021041934336L, 67212);
      return this;
      c(paramActivity, WalletCheckPwdUI.class, paramBundle);
    }
  }
  
  public final d a(MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.f paramf)
  {
    GMTrace.i(9021578805248L, 67216);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(9019699757056L, 67202);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && ((paramAnonymousk instanceof com.tencent.mm.plugin.wxcredit.a.f)))
          {
            f.this.a(this.xDN, 0, f.a(f.this));
            GMTrace.o(9019699757056L, 67202);
            return true;
          }
          GMTrace.o(9019699757056L, 67202);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(9019833974784L, 67203);
          if (!f.b(f.this).getBoolean("key_is_show_detail", true))
          {
            paramAnonymousVarArgs = (Bankcard)f.c(f.this).getParcelable("key_bankcard");
            this.xDO.a(new com.tencent.mm.plugin.wxcredit.a.f(paramAnonymousVarArgs.field_bankcardType, paramAnonymousVarArgs.field_bindSerial, f.d(f.this).getString("key_pwd1")), true, 1);
            GMTrace.o(9019833974784L, 67203);
            return true;
          }
          GMTrace.o(9019833974784L, 67203);
          return false;
        }
      };
      GMTrace.o(9021578805248L, 67216);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(9021578805248L, 67216);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(9021176152064L, 67213);
    if (paramActivity.getClass().getSimpleName().equalsIgnoreCase("WalletBankcardDetailUI"))
    {
      c(paramActivity, WalletCheckPwdUI.class, paramBundle);
      GMTrace.o(9021176152064L, 67213);
      return;
    }
    if ((paramActivity instanceof WalletCheckPwdUI)) {
      b(paramActivity, paramBundle);
    }
    GMTrace.o(9021176152064L, 67213);
  }
  
  public final String aAd()
  {
    GMTrace.i(9021847240704L, 67218);
    GMTrace.o(9021847240704L, 67218);
    return "WXCreditUnbindProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(9021444587520L, 67215);
    d(paramActivity, "mall", ".ui.MallIndexUI");
    GMTrace.o(9021444587520L, 67215);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(9021310369792L, 67214);
    B(paramActivity);
    GMTrace.o(9021310369792L, 67214);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(9021713022976L, 67217);
    GMTrace.o(9021713022976L, 67217);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */