package com.tencent.mm.plugin.wallet_payu.pwd.a;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;

public class a
  extends d
{
  private Bundle ler;
  
  public a(MMActivity paramMMActivity, f paramf, Bundle paramBundle)
  {
    super(paramMMActivity, paramf);
    GMTrace.i(7955755827200L, 59275);
    this.ler = paramBundle;
    GMTrace.o(7955755827200L, 59275);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7955890044928L, 59276);
    if ((paramk instanceof c))
    {
      paramString = (c)paramk;
      if (bg.nm(paramString.token)) {
        break label73;
      }
      w.d("MicroMsg.CommonCheckPwdController", "hy: check pwd pass");
      this.ler.putString("payu_reference", paramString.token);
      com.tencent.mm.wallet_core.a.i(this.xDN, this.ler);
    }
    for (;;)
    {
      GMTrace.o(7955890044928L, 59276);
      return false;
      label73:
      w.w("MicroMsg.CommonCheckPwdController", "hy: check pwd failed");
    }
  }
  
  public final boolean j(Object... paramVarArgs)
  {
    GMTrace.i(7956024262656L, 59277);
    this.ler.putString("key_pwd1", (String)paramVarArgs[0]);
    this.xDO.a(new c(this.ler.getString("key_pwd1")), true);
    GMTrace.o(7956024262656L, 59277);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pwd\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */