package com.tencent.mm.plugin.wallet_payu.pwd.a;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUPwdConfirmUI;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUSetPasswordUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.d.f;

public abstract class e
  extends b
{
  public e()
  {
    GMTrace.i(7957634875392L, 59289);
    GMTrace.o(7957634875392L, 59289);
  }
  
  public com.tencent.mm.wallet_core.d.d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(7958305964032L, 59294);
    if ((paramMMActivity instanceof WalletPayUPwdConfirmUI))
    {
      paramMMActivity = new com.tencent.mm.wallet_core.d.d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7953474125824L, 59258);
          if ((paramAnonymousk instanceof d))
          {
            w.d("MicroMsg.PayUBaseChangePwdProcess", "hy: forget pwd user success");
            if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
            {
              e.this.ler.putInt("key_errcode_payu", 0);
              a.c(this.xDN, e.this.ler, 0);
              GMTrace.o(7953474125824L, 59258);
              return true;
            }
          }
          GMTrace.o(7953474125824L, 59258);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7953608343552L, 59259);
          Object localObject = (o)paramAnonymousVarArgs[0];
          paramAnonymousVarArgs = e.this.ler.getString("payu_reference");
          localObject = ((o)localObject).riF;
          this.xDO.a(new d(paramAnonymousVarArgs, (String)localObject), true);
          GMTrace.o(7953608343552L, 59259);
          return true;
        }
      };
      GMTrace.o(7958305964032L, 59294);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(7958305964032L, 59294);
    return paramMMActivity;
  }
  
  public void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(7957769093120L, 59290);
    if ((paramActivity instanceof WalletPayUSetPasswordUI)) {
      c(paramActivity, WalletPayUPwdConfirmUI.class, paramBundle);
    }
    GMTrace.o(7957769093120L, 59290);
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7958037528576L, 59292);
    if (this.ler.getInt("key_errcode_payu", -1) == 0) {
      u.makeText(paramActivity, a.i.tdp, 0).show();
    }
    for (;;)
    {
      d(paramActivity, "mall", ".ui.MallIndexUI");
      GMTrace.o(7958037528576L, 59292);
      return;
      u.makeText(paramActivity, a.i.tbB, 0).show();
    }
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(7957903310848L, 59291);
    if ((paramActivity instanceof WalletPayUPwdConfirmUI)) {
      a(paramActivity, WalletPayUSetPasswordUI.class, paramInt);
    }
    GMTrace.o(7957903310848L, 59291);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7958171746304L, 59293);
    GMTrace.o(7958171746304L, 59293);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pwd\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */