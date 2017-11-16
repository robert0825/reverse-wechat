package com.tencent.mm.plugin.wallet_payu.pwd.a;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUCheckPwdUI;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUPwdConfirmUI;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUSetPasswordUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;

public class g
  extends e
{
  public g()
  {
    GMTrace.i(7954547867648L, 59266);
    GMTrace.o(7954547867648L, 59266);
  }
  
  public final com.tencent.mm.wallet_core.b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7954682085376L, 59267);
    c(paramActivity, WalletPayUCheckPwdUI.class, paramBundle);
    GMTrace.o(7954682085376L, 59267);
    return this;
  }
  
  public final d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(7954950520832L, 59269);
    if ((paramMMActivity instanceof WalletPayUCheckPwdUI))
    {
      paramMMActivity = new a(paramMMActivity, paramf, this.ler)
      {
        public final CharSequence se(int paramAnonymousInt)
        {
          GMTrace.i(7955621609472L, 59274);
          if (paramAnonymousInt == 0)
          {
            localObject = this.xDN.getString(a.i.taY);
            GMTrace.o(7955621609472L, 59274);
            return (CharSequence)localObject;
          }
          Object localObject = super.se(paramAnonymousInt);
          GMTrace.o(7955621609472L, 59274);
          return (CharSequence)localObject;
        }
      };
      GMTrace.o(7954950520832L, 59269);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletPayUPwdConfirmUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7953876779008L, 59261);
          if ((paramAnonymousk instanceof b))
          {
            w.d("MicroMsg.PayUModifyPasswordProcess", "hy: change pwd user success");
            if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
            {
              g.a(g.this).putInt("key_errcode_payu", 0);
              com.tencent.mm.wallet_core.a.c(this.xDN, g.this.ler, 0);
              GMTrace.o(7953876779008L, 59261);
              return true;
            }
          }
          GMTrace.o(7953876779008L, 59261);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7954010996736L, 59262);
          Object localObject = (o)paramAnonymousVarArgs[0];
          paramAnonymousVarArgs = g.b(g.this).getString("key_pwd1");
          localObject = ((o)localObject).riF;
          this.xDO.a(new b(paramAnonymousVarArgs, (String)localObject), true);
          GMTrace.o(7954010996736L, 59262);
          return true;
        }
      };
      GMTrace.o(7954950520832L, 59269);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(7954950520832L, 59269);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(7954816303104L, 59268);
    if ((paramActivity instanceof WalletPayUCheckPwdUI))
    {
      c(paramActivity, WalletPayUSetPasswordUI.class, paramBundle);
      GMTrace.o(7954816303104L, 59268);
      return;
    }
    super.a(paramActivity, paramInt, paramBundle);
    GMTrace.o(7954816303104L, 59268);
  }
  
  public final String aAd()
  {
    GMTrace.i(7955084738560L, 59270);
    GMTrace.o(7955084738560L, 59270);
    return "PayUModifyPasswordProcess";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pwd\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */