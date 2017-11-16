package com.tencent.mm.plugin.wxcredit;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.c.i;
import com.tencent.mm.plugin.wallet_core.c.l;
import com.tencent.mm.plugin.wallet_core.e.c;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.plugin.wxcredit.a.g;
import com.tencent.mm.plugin.wxcredit.a.h;
import com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenResultUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenUI;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;

public class e
  extends com.tencent.mm.wallet_core.b
{
  public e()
  {
    GMTrace.i(8976481648640L, 66880);
    GMTrace.o(8976481648640L, 66880);
  }
  
  public final com.tencent.mm.wallet_core.b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(8976615866368L, 66881);
    if (!n.byx().byR())
    {
      if (!n.byx().byS()) {
        break label47;
      }
      c(paramActivity, WalletCheckPwdUI.class, paramBundle);
    }
    for (;;)
    {
      GMTrace.o(8976615866368L, 66881);
      return this;
      label47:
      c(paramActivity, WalletWXCreditOpenUI.class, paramBundle);
    }
  }
  
  public final d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(8977286955008L, 66886);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(8976213213184L, 66878);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wxcredit.a.b))
            {
              paramAnonymousString = (com.tencent.mm.plugin.wxcredit.a.b)paramAnonymousk;
              e.a(e.this).putString("KEY_SESSION_KEY", paramAnonymousString.token);
              e.b(e.this).putString("key_pre_name", paramAnonymousString.name);
              e.c(e.this).putString("key_pre_indentity", paramAnonymousString.skr);
              e.d(e.this).putBoolean("key_has_indentity_info", paramAnonymousString.sks);
            }
            e.this.a(this.xDN, 0, e.e(e.this));
            GMTrace.o(8976213213184L, 66878);
            return true;
          }
          GMTrace.o(8976213213184L, 66878);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          int i = 0;
          GMTrace.i(8976347430912L, 66879);
          e.f(e.this).putString("key_pwd1", (String)paramAnonymousVarArgs[0]);
          f localf = this.xDO;
          String str = (String)paramAnonymousVarArgs[0];
          if (paramAnonymousVarArgs[1] == null) {}
          for (;;)
          {
            localf.a(new com.tencent.mm.plugin.wxcredit.a.b(str, i, e.g(e.this).getString("key_bank_type")), true, 1);
            GMTrace.o(8976347430912L, 66879);
            return true;
            i = bg.Sy((String)paramAnonymousVarArgs[1]);
          }
        }
      };
      GMTrace.o(8977286955008L, 66886);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletCheckIdentityUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(9023994724352L, 67234);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wxcredit.a.a))
            {
              paramAnonymousString = (com.tencent.mm.plugin.wxcredit.a.a)paramAnonymousk;
              e.h(e.this).putString("KEY_SESSION_KEY", paramAnonymousString.token);
              e.i(e.this).putString("key_mobile", paramAnonymousString.eMW);
              e.j(e.this).putBoolean("key_need_bind_deposit", paramAnonymousString.eXw);
              e.k(e.this).putBoolean("key_is_bank_user", paramAnonymousString.skq);
            }
            e.this.a(this.xDN, 0, e.l(e.this));
            GMTrace.o(9023994724352L, 67234);
            return true;
          }
          GMTrace.o(9023994724352L, 67234);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(9024128942080L, 67235);
          String str = (String)paramAnonymousVarArgs[0];
          paramAnonymousVarArgs = (String)paramAnonymousVarArgs[1];
          e.m(e.this).putString("key_name", str);
          e.n(e.this).putString("key_indentity", paramAnonymousVarArgs);
          this.xDO.a(new com.tencent.mm.plugin.wxcredit.a.a(str, paramAnonymousVarArgs, e.o(e.this).getString("KEY_SESSION_KEY"), e.p(e.this).getString("key_bank_type")), true, 1);
          GMTrace.o(9024128942080L, 67235);
          return true;
        }
      };
      GMTrace.o(8977286955008L, 66886);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletVerifyCodeUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(8992319340544L, 66998);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousk instanceof g))
            {
              paramAnonymousString = ((g)paramAnonymousk).ePK;
              if (!bg.nm(paramAnonymousString)) {
                e.q(e.this).putString("key_bank_username", paramAnonymousString);
              }
              e.this.a(this.xDN, 0, e.r(e.this));
              GMTrace.o(8992319340544L, 66998);
              return true;
            }
            if ((paramAnonymousk instanceof h))
            {
              e.this.a(this.xDN, 0, e.s(e.this));
              GMTrace.o(8992319340544L, 66998);
              return true;
            }
            if ((paramAnonymousk instanceof i))
            {
              if (n.byx().byS())
              {
                this.xDO.a(new com.tencent.mm.plugin.wallet_core.c.o(null), true, 1);
                GMTrace.o(8992319340544L, 66998);
                return true;
              }
              e.this.a(this.xDN, 0, e.t(e.this));
              GMTrace.o(8992319340544L, 66998);
              return true;
            }
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.c.o))
            {
              paramAnonymousString = n.byx().bzf();
              paramAnonymousString = new g(e.u(e.this).getString("key_verify_code"), e.v(e.this).getString("KEY_SESSION_KEY"), e.w(e.this).getString("key_pwd1"), paramAnonymousString, e.x(e.this).getString("key_bank_type"));
              this.xDO.a(paramAnonymousString, true, 1);
              GMTrace.o(8992319340544L, 66998);
              return true;
            }
            GMTrace.o(8992319340544L, 66998);
            return false;
          }
          GMTrace.o(8992319340544L, 66998);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(8992453558272L, 66999);
          String str = (String)paramAnonymousVarArgs[0];
          e.y(e.this).putString("key_verify_code", str);
          if (n.byx().byS()) {
            if ((e.z(e.this).getBoolean("key_need_bind_deposit", true)) && (!e.A(e.this).getBoolean("key_is_bank_user")))
            {
              paramAnonymousVarArgs = (com.tencent.mm.plugin.wallet_core.model.o)paramAnonymousVarArgs[1];
              paramAnonymousVarArgs.flag = "2";
              this.xDO.a(new i(paramAnonymousVarArgs), true, 1);
            }
          }
          for (;;)
          {
            GMTrace.o(8992453558272L, 66999);
            return true;
            this.xDO.a(new g(str, e.B(e.this).getString("KEY_SESSION_KEY"), e.C(e.this).getString("key_pwd1"), e.D(e.this).getString("key_bind_serial"), e.E(e.this).getString("key_bank_type")), true, 1);
            continue;
            if (e.F(e.this).getBoolean("key_is_bank_user", false))
            {
              e.G(e.this).putString("key_verify_code", str);
              this.xDO.a(new h(str, e.H(e.this).getString("KEY_SESSION_KEY"), e.I(e.this).getString("key_pwd1"), e.J(e.this).getString("key_bind_serial"), e.K(e.this).getString("key_bank_type")), true, 1);
            }
            else
            {
              paramAnonymousVarArgs = (com.tencent.mm.plugin.wallet_core.model.o)paramAnonymousVarArgs[1];
              paramAnonymousVarArgs.flag = "1";
              this.xDO.a(new i(paramAnonymousVarArgs), true, 1);
            }
          }
        }
      };
      GMTrace.o(8977286955008L, 66886);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletBindDepositUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(9017283837952L, 67184);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.b.a.a)))
          {
            paramAnonymousString = (com.tencent.mm.plugin.wallet_core.b.a.a)paramAnonymousk;
            new StringBuilder("reqKey  ").append(paramAnonymousString.qYK);
            e.P(e.this).putString("kreq_token", paramAnonymousString.token);
            e.this.a(this.xDN, 0, e.Q(e.this));
            GMTrace.o(9017283837952L, 67184);
            return true;
          }
          GMTrace.o(9017283837952L, 67184);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(9017418055680L, 67185);
          c.bAa();
          Authen localAuthen = new Authen();
          localAuthen.reh = ((String)paramAnonymousVarArgs[0]);
          localAuthen.nDt = ((String)paramAnonymousVarArgs[1]);
          localAuthen.rcs = ((String)paramAnonymousVarArgs[2]);
          e.R(e.this).putString("key_bank_phone", (String)paramAnonymousVarArgs[3]);
          if (n.byx().byS()) {}
          for (int i = 2;; i = 1)
          {
            localAuthen.eQl = i;
            localAuthen.reg = 1;
            localAuthen.oek = ((PayInfo)e.S(e.this).getParcelable("key_pay_info"));
            localAuthen.red = e.T(e.this).getString("key_pwd1");
            if (!e.U(e.this).getBoolean("key_has_indentity_info", false))
            {
              localAuthen.ree = e.V(e.this).getString("key_name");
              localAuthen.ref = e.W(e.this).getString("key_indentity");
            }
            paramAnonymousVarArgs = com.tencent.mm.wallet_core.ui.e.Xy(localAuthen.rcs);
            e.X(e.this).putString("key_mobile", paramAnonymousVarArgs);
            e.Y(e.this).putBoolean("key_is_oversea", false);
            this.xDO.a(new com.tencent.mm.plugin.wallet_core.b.a.a(localAuthen), true, 1);
            GMTrace.o(9017418055680L, 67185);
            return true;
          }
        }
        
        public final boolean q(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(9017552273408L, 67186);
          this.xDO.a(new l("", (String)paramAnonymousVarArgs[0], (PayInfo)e.Z(e.this).getParcelable("key_pay_info")), true, 1);
          GMTrace.o(9017552273408L, 67186);
          return true;
        }
      };
      GMTrace.o(8977286955008L, 66886);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletPwdConfirmUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(9020102410240L, 67205);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.b.a.b))
            {
              this.xDO.a(new com.tencent.mm.plugin.wallet_core.c.o(null), true, 1);
              GMTrace.o(9020102410240L, 67205);
              return true;
            }
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.c.o))
            {
              paramAnonymousString = new g(e.aa(e.this).getString("key_verify_code"), e.ab(e.this).getString("KEY_SESSION_KEY"), e.ac(e.this).getString("key_pwd1"), n.byx().bzf(), e.ad(e.this).getString("key_bank_type"));
              this.xDO.a(paramAnonymousString, true, 1);
              GMTrace.o(9020102410240L, 67205);
              return true;
            }
            if ((paramAnonymousk instanceof g))
            {
              paramAnonymousString = ((g)paramAnonymousk).ePK;
              if (!bg.nm(paramAnonymousString)) {
                e.ae(e.this).putString("key_bank_username", paramAnonymousString);
              }
              e.this.a(this.xDN, 0, e.af(e.this));
              GMTrace.o(9020102410240L, 67205);
              return true;
            }
          }
          GMTrace.o(9020102410240L, 67205);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(9020236627968L, 67206);
          if (!e.ag(e.this).getBoolean("key_is_bank_user", false)) {
            this.xDO.a(new com.tencent.mm.plugin.wallet_core.b.a.b((com.tencent.mm.plugin.wallet_core.model.o)paramAnonymousVarArgs[0]), true, 1);
          }
          for (;;)
          {
            GMTrace.o(9020236627968L, 67206);
            return true;
            this.xDO.a(new g(e.ah(e.this).getString("key_verify_code"), e.ai(e.this).getString("KEY_SESSION_KEY"), e.aj(e.this).getString("key_pwd1"), n.byx().bzf(), e.ak(e.this).getString("key_bank_type")), true, 1);
          }
        }
      };
      GMTrace.o(8977286955008L, 66886);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletWXCreditOpenResultUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(9024934248448L, 67241);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            e.this.a(this.xDN, 0, e.al(e.this));
            GMTrace.o(9024934248448L, 67241);
            return true;
          }
          GMTrace.o(9024934248448L, 67241);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(9025068466176L, 67242);
          e.am(e.this).putBoolean("key_is_follow_bank_username", ((Boolean)paramAnonymousVarArgs[0]).booleanValue());
          e.an(e.this);
          this.xDO.a(new com.tencent.mm.plugin.wallet_core.c.o(null), true, 1);
          GMTrace.o(9025068466176L, 67242);
          return true;
        }
      };
      GMTrace.o(8977286955008L, 66886);
      return paramMMActivity;
    }
    GMTrace.o(8977286955008L, 66886);
    return null;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(8976750084096L, 66882);
    if ((paramActivity instanceof WalletWXCreditOpenUI))
    {
      c(paramActivity, WalletCheckIdentityUI.class, paramBundle);
      GMTrace.o(8976750084096L, 66882);
      return;
    }
    if ((paramActivity instanceof WalletCheckPwdUI))
    {
      B(paramActivity);
      c(paramActivity, WalletWXCreditOpenUI.class, paramBundle);
      GMTrace.o(8976750084096L, 66882);
      return;
    }
    if ((paramActivity instanceof WalletWXCreditOpenUI))
    {
      c(paramActivity, WalletCheckIdentityUI.class, paramBundle);
      GMTrace.o(8976750084096L, 66882);
      return;
    }
    if ((paramActivity instanceof WalletCheckIdentityUI))
    {
      if (paramBundle.getBoolean("key_need_bind_deposit", true))
      {
        c(paramActivity, WalletBindDepositUI.class, paramBundle);
        GMTrace.o(8976750084096L, 66882);
        return;
      }
      c(paramActivity, WalletVerifyCodeUI.class, paramBundle);
      GMTrace.o(8976750084096L, 66882);
      return;
    }
    if ((paramActivity instanceof WalletBindDepositUI))
    {
      c(paramActivity, WalletVerifyCodeUI.class, paramBundle);
      GMTrace.o(8976750084096L, 66882);
      return;
    }
    if ((paramActivity instanceof WalletVerifyCodeUI))
    {
      if (n.byx().byS())
      {
        c(paramActivity, WalletWXCreditOpenResultUI.class, paramBundle);
        GMTrace.o(8976750084096L, 66882);
        return;
      }
      c(paramActivity, WalletSetPasswordUI.class, paramBundle);
      GMTrace.o(8976750084096L, 66882);
      return;
    }
    if ((paramActivity instanceof WalletSetPasswordUI))
    {
      c(paramActivity, WalletPwdConfirmUI.class, paramBundle);
      GMTrace.o(8976750084096L, 66882);
      return;
    }
    if ((paramActivity instanceof WalletPwdConfirmUI))
    {
      c(paramActivity, WalletWXCreditOpenResultUI.class, paramBundle);
      GMTrace.o(8976750084096L, 66882);
      return;
    }
    if ((paramActivity instanceof WalletWXCreditOpenResultUI)) {
      b(paramActivity, paramBundle);
    }
    GMTrace.o(8976750084096L, 66882);
  }
  
  public final String aAd()
  {
    GMTrace.i(8977421172736L, 66887);
    GMTrace.o(8977421172736L, 66887);
    return "WXCreditOpenProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(8977018519552L, 66884);
    d(paramActivity, "wallet", ".bind.ui.WalletBankcardManageUI");
    GMTrace.o(8977018519552L, 66884);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(8976884301824L, 66883);
    B(paramActivity);
    GMTrace.o(8976884301824L, 66883);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(8977152737280L, 66885);
    GMTrace.o(8977152737280L, 66885);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */