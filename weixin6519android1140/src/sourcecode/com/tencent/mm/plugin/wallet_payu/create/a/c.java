package com.tencent.mm.plugin.wallet_payu.create.a;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUStartOpenUI;
import com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUVerifyCodeUI;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUPwdConfirmUI;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUSetPasswordUI;
import com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionAnswerUI;
import com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.e;

public class c
  extends com.tencent.mm.wallet_core.b
{
  public c()
  {
    GMTrace.i(7944749973504L, 59193);
    GMTrace.o(7944749973504L, 59193);
  }
  
  public final com.tencent.mm.wallet_core.b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7944884191232L, 59194);
    w.d("MicroMsg.PayUOpenProcess", "hy: start process PayUOpenProcess");
    p.bxd();
    String str1 = p.Hz();
    p.bxd();
    String str2 = p.bxf();
    if (paramBundle != null)
    {
      paramBundle.putString("key_mobile", str1);
      paramBundle.putString("dial_code", str2);
    }
    c(paramActivity, WalletPayUStartOpenUI.class, paramBundle);
    GMTrace.o(7944884191232L, 59194);
    return this;
  }
  
  public final com.tencent.mm.wallet_core.d.d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(7945823715328L, 59201);
    if ((paramMMActivity instanceof WalletPayUStartOpenUI))
    {
      paramMMActivity = new com.tencent.mm.wallet_core.d.d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7946897457152L, 59209);
          if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_payu.a.b))
          {
            w.d("MicroMsg.PayUOpenProcess", "hy: scene gen otp, errCode %d, errType %d, errMsg %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
            if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
            {
              paramAnonymousString = (com.tencent.mm.plugin.wallet_payu.a.b)paramAnonymousk;
              c.this.ler.putString("payu_reference", paramAnonymousString.eMJ);
              w.d("MicroMsg.PayUOpenProcess", "hy: session: %s", new Object[] { paramAnonymousString.eMJ });
              c.this.ler.putBoolean("key_is_has_mobile", paramAnonymousString.rue);
              com.tencent.mm.wallet_core.a.i(this.xDN, c.this.ler);
              GMTrace.o(7946897457152L, 59209);
              return true;
            }
          }
          GMTrace.o(7946897457152L, 59209);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7947031674880L, 59210);
          this.xDO.a(new com.tencent.mm.plugin.wallet_payu.a.b(c.this.ler.getString("dial_code"), c.this.ler.getString("key_mobile")), true);
          GMTrace.o(7947031674880L, 59210);
          return false;
        }
      };
      GMTrace.o(7945823715328L, 59201);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletPayUVerifyCodeUI))
    {
      paramMMActivity = new com.tencent.mm.wallet_core.d.d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7947434328064L, 59213);
          if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_payu.a.a))
          {
            paramAnonymousString = (com.tencent.mm.plugin.wallet_payu.a.a)paramAnonymousk;
            if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && (paramAnonymousString.ruc))
            {
              c.a(c.this).putString("payu_reference", paramAnonymousString.rud);
              com.tencent.mm.wallet_core.a.i(this.xDN, c.this.ler);
              GMTrace.o(7947434328064L, 59213);
              return true;
            }
          }
          else if (((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_payu.a.b)) && (paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            paramAnonymousString = (com.tencent.mm.plugin.wallet_payu.a.b)paramAnonymousk;
            c.this.ler.putString("payu_reference", paramAnonymousString.eMJ);
            GMTrace.o(7947434328064L, 59213);
            return true;
          }
          GMTrace.o(7947434328064L, 59213);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7947568545792L, 59214);
          this.xDO.a(new com.tencent.mm.plugin.wallet_payu.a.a((String)paramAnonymousVarArgs[0], c.this.ler.getString("payu_reference")), true);
          GMTrace.o(7947568545792L, 59214);
          return true;
        }
        
        public final boolean q(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7947300110336L, 59212);
          this.xDO.a(new com.tencent.mm.plugin.wallet_payu.a.b(c.this.ler.getString("dial_code"), c.this.ler.getString("key_mobile")), true, 1);
          GMTrace.o(7947300110336L, 59212);
          return true;
        }
        
        public final CharSequence se(int paramAnonymousInt)
        {
          GMTrace.i(7947702763520L, 59215);
          if (paramAnonymousInt == 0)
          {
            localObject = this.xDN.getString(a.i.tgN, new Object[] { e.Xy("+" + c.b(c.this).getString("dial_code") + c.c(c.this).getString("key_mobile")) });
            GMTrace.o(7947702763520L, 59215);
            return (CharSequence)localObject;
          }
          Object localObject = super.se(paramAnonymousInt);
          GMTrace.o(7947702763520L, 59215);
          return (CharSequence)localObject;
        }
      };
      GMTrace.o(7945823715328L, 59201);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletPayUSecurityQuestionSettingUI))
    {
      paramMMActivity = new com.tencent.mm.wallet_core.d.d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7944347320320L, 59190);
          if (((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_payu.security_question.model.d)) && (paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            c.this.ler.putParcelableArrayList("key_security_question_list", ((com.tencent.mm.plugin.wallet_payu.security_question.model.d)paramAnonymousk).rvt);
            GMTrace.o(7944347320320L, 59190);
            return true;
          }
          GMTrace.o(7944347320320L, 59190);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7944481538048L, 59191);
          GMTrace.o(7944481538048L, 59191);
          return false;
        }
        
        public final boolean p(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7944213102592L, 59189);
          this.xDO.a(new com.tencent.mm.plugin.wallet_payu.security_question.model.d(), true);
          GMTrace.o(7944213102592L, 59189);
          return false;
        }
      };
      GMTrace.o(7945823715328L, 59201);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletPayUPwdConfirmUI))
    {
      paramMMActivity = new com.tencent.mm.wallet_core.d.d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7943005143040L, 59180);
          if (((paramAnonymousk instanceof a)) && (paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            w.d("MicroMsg.PayUOpenProcess", "hy: create user success");
            com.tencent.mm.wallet_core.a.c(this.xDN, c.this.ler, 0);
            c.d(c.this).putInt("key_open_error_code", 0);
            u.makeText(this.xDN, this.xDN.getString(a.i.teW), 0).show();
            GMTrace.o(7943005143040L, 59180);
            return true;
          }
          if (((paramAnonymousk instanceof b)) && (paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            w.d("MicroMsg.PayUOpenProcess", "hy: link user success");
            com.tencent.mm.wallet_core.a.c(this.xDN, c.this.ler, 0);
            c.e(c.this).putInt("key_open_error_code", 0);
            u.makeText(this.xDN, this.xDN.getString(a.i.teW), 0).show();
            GMTrace.o(7943005143040L, 59180);
            return true;
          }
          GMTrace.o(7943005143040L, 59180);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7943139360768L, 59181);
          Object localObject = (o)paramAnonymousVarArgs[0];
          paramAnonymousVarArgs = c.this.ler.getString("dial_code");
          String str1 = c.this.ler.getString("key_mobile");
          localObject = ((o)localObject).riF;
          String str2 = c.this.ler.getString("key_question_id");
          String str3 = c.this.ler.getString("key_question_answer");
          String str4 = c.this.ler.getString("payu_reference");
          if (!c.this.ler.getBoolean("key_is_has_mobile")) {
            this.xDO.a(new a(paramAnonymousVarArgs, str1, (String)localObject, str2, str3, str4), true);
          }
          for (;;)
          {
            GMTrace.o(7943139360768L, 59181);
            return true;
            this.xDO.a(new b(paramAnonymousVarArgs, str1, (String)localObject, str4), true);
          }
        }
      };
      GMTrace.o(7945823715328L, 59201);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletPayUSecurityQuestionAnswerUI))
    {
      paramMMActivity = new com.tencent.mm.plugin.wallet_payu.security_question.model.a(paramMMActivity, paramf, this.ler);
      GMTrace.o(7945823715328L, 59201);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(7945823715328L, 59201);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(7945018408960L, 59195);
    if ((paramActivity instanceof WalletPayUStartOpenUI)) {
      c(paramActivity, WalletPayUVerifyCodeUI.class, paramBundle);
    }
    if ((paramActivity instanceof WalletPayUVerifyCodeUI))
    {
      if (paramBundle.getBoolean("key_is_has_mobile")) {
        break label101;
      }
      c(paramActivity, WalletPayUSecurityQuestionSettingUI.class, paramBundle);
    }
    for (;;)
    {
      if ((paramActivity instanceof WalletPayUSecurityQuestionSettingUI)) {
        c(paramActivity, WalletPayUSetPasswordUI.class, paramBundle);
      }
      if ((paramActivity instanceof WalletPayUSetPasswordUI)) {
        c(paramActivity, WalletPayUPwdConfirmUI.class, paramBundle);
      }
      if ((paramActivity instanceof WalletPayUSecurityQuestionAnswerUI)) {
        c(paramActivity, WalletPayUSetPasswordUI.class, paramBundle);
      }
      GMTrace.o(7945018408960L, 59195);
      return;
      label101:
      c(paramActivity, WalletPayUSecurityQuestionAnswerUI.class, paramBundle);
    }
  }
  
  public final String aAd()
  {
    GMTrace.i(7945957933056L, 59202);
    GMTrace.o(7945957933056L, 59202);
    return "PayUOpenProcess";
  }
  
  public final int b(MMActivity paramMMActivity, int paramInt)
  {
    GMTrace.i(7945555279872L, 59199);
    if (paramInt == 1)
    {
      paramInt = a.i.teP;
      GMTrace.o(7945555279872L, 59199);
      return paramInt;
    }
    paramInt = super.b(paramMMActivity, paramInt);
    GMTrace.o(7945555279872L, 59199);
    return paramInt;
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7945421062144L, 59198);
    if (paramBundle.getInt("key_open_error_code", -1) == 0)
    {
      w.i("MicroMsg.PayUOpenProcess", "hy: user open success");
      d(paramActivity, "mall", ".ui.MallIndexUI");
      GMTrace.o(7945421062144L, 59198);
      return;
    }
    w.i("MicroMsg.PayUOpenProcess", "hy: user interrupted the process. go to preference");
    super.ae(paramActivity);
    e.fL(paramActivity);
    GMTrace.o(7945421062144L, 59198);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(7945152626688L, 59196);
    if ((paramActivity instanceof WalletPayUPwdConfirmUI))
    {
      a(paramActivity, WalletPayUSetPasswordUI.class, paramInt);
      GMTrace.o(7945152626688L, 59196);
      return;
    }
    b(paramActivity, this.ler);
    GMTrace.o(7945152626688L, 59196);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7945689497600L, 59200);
    GMTrace.o(7945689497600L, 59200);
    return false;
  }
  
  public final boolean g(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7945286844416L, 59197);
    paramBundle.putInt("key_open_error_code", 1);
    u.makeText(paramActivity, paramActivity.getString(a.i.teR), 0).show();
    b(paramActivity, paramBundle);
    GMTrace.o(7945286844416L, 59197);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\create\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */