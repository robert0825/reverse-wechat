package com.tencent.mm.plugin.wallet_payu.security_question.model;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;

public final class a
  extends d
{
  private Bundle ler;
  
  public a(MMActivity paramMMActivity, f paramf, Bundle paramBundle)
  {
    super(paramMMActivity, paramf);
    GMTrace.i(7925154185216L, 59047);
    this.ler = paramBundle;
    GMTrace.o(7925154185216L, 59047);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7925422620672L, 59049);
    if (((paramk instanceof c)) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (c)paramk;
      this.ler.putParcelable("key_security_question", new PayUSecurityQuestion(paramString.id, paramString.rvs));
      GMTrace.o(7925422620672L, 59049);
      return false;
    }
    if ((paramk instanceof b))
    {
      paramString = (b)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (paramString.kRT)
        {
          this.ler.putString("payu_reference", paramString.rvr);
          com.tencent.mm.wallet_core.a.i(this.xDN, this.ler);
          GMTrace.o(7925422620672L, 59049);
          return true;
        }
        GMTrace.o(7925422620672L, 59049);
        return false;
      }
    }
    GMTrace.o(7925422620672L, 59049);
    return false;
  }
  
  public final boolean j(Object... paramVarArgs)
  {
    GMTrace.i(7925556838400L, 59050);
    paramVarArgs = (PayUSecurityQuestion)this.ler.getParcelable("key_security_question");
    String str1 = this.ler.getString("key_question_answer");
    String str2 = this.ler.getString("payu_reference");
    this.xDO.a(new b(str2, paramVarArgs.id, str1), true);
    GMTrace.o(7925556838400L, 59050);
    return false;
  }
  
  public final boolean p(Object... paramVarArgs)
  {
    GMTrace.i(7925288402944L, 59048);
    this.xDO.a(new c(this.ler.getString("payu_reference")), true);
    GMTrace.o(7925288402944L, 59048);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\security_question\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */