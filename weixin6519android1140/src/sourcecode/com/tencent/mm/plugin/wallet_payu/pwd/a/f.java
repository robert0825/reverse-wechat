package com.tencent.mm.plugin.wallet_payu.pwd.a;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUSetPasswordUI;
import com.tencent.mm.plugin.wallet_payu.security_question.model.a;
import com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionAnswerUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.d.d;

public class f
  extends e
{
  public f()
  {
    GMTrace.i(7956963786752L, 59284);
    GMTrace.o(7956963786752L, 59284);
  }
  
  public final b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7957098004480L, 59285);
    c(paramActivity, WalletPayUSecurityQuestionAnswerUI.class, paramBundle);
    paramActivity = super.a(paramActivity, paramBundle);
    GMTrace.o(7957098004480L, 59285);
    return paramActivity;
  }
  
  public final d a(MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.f paramf)
  {
    GMTrace.i(7957366439936L, 59287);
    if ((paramMMActivity instanceof WalletPayUSecurityQuestionAnswerUI))
    {
      paramMMActivity = new a(paramMMActivity, paramf, this.ler);
      GMTrace.o(7957366439936L, 59287);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(7957366439936L, 59287);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(7957232222208L, 59286);
    if ((paramActivity instanceof WalletPayUSecurityQuestionAnswerUI))
    {
      c(paramActivity, WalletPayUSetPasswordUI.class, paramBundle);
      GMTrace.o(7957232222208L, 59286);
      return;
    }
    super.a(paramActivity, paramInt, paramBundle);
    GMTrace.o(7957232222208L, 59286);
  }
  
  public final String aAd()
  {
    GMTrace.i(7957500657664L, 59288);
    GMTrace.o(7957500657664L, 59288);
    return "PayUForgotPwdProcess";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pwd\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */