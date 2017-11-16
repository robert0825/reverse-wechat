package com.tencent.mm.plugin.wxcredit;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.c.j;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.e;

public class c
  extends b
{
  public c()
  {
    GMTrace.i(8994064171008L, 67011);
    GMTrace.o(8994064171008L, 67011);
  }
  
  public final b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(8994198388736L, 67012);
    w.d("MicroMsg.WXCreditChangeAmountProcess", "start Process : WXCreditCheckPwdProcess");
    c(paramActivity, WalletCheckPwdUI.class, paramBundle);
    GMTrace.o(8994198388736L, 67012);
    return this;
  }
  
  public final d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(8994869477376L, 67017);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(9020505063424L, 67208);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            c.this.a(this.xDN, 0, c.a(c.this));
            this.xDN.finish();
            GMTrace.o(9020505063424L, 67208);
            return true;
          }
          GMTrace.o(9020505063424L, 67208);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(9020639281152L, 67209);
          c.b(c.this).putString("key_pwd1", (String)paramAnonymousVarArgs[0]);
          this.xDO.a(new j((String)paramAnonymousVarArgs[0], 5, ""), true, 1);
          GMTrace.o(9020639281152L, 67209);
          return true;
        }
        
        public final boolean p(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(9020773498880L, 67210);
          GMTrace.o(9020773498880L, 67210);
          return false;
        }
      };
      GMTrace.o(8994869477376L, 67017);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(8994869477376L, 67017);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(8994332606464L, 67013);
    if ((paramActivity instanceof WalletCheckPwdUI))
    {
      e.m(paramActivity, paramBundle.getString("key_url"), false);
      GMTrace.o(8994332606464L, 67013);
      return;
    }
    b(paramActivity, paramBundle);
    GMTrace.o(8994332606464L, 67013);
  }
  
  public final String aAd()
  {
    GMTrace.i(8995003695104L, 67018);
    GMTrace.o(8995003695104L, 67018);
    return "WXCreditCheckPwdProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(8994601041920L, 67015);
    d(paramActivity, "mall", ".ui.MallIndexUI");
    GMTrace.o(8994601041920L, 67015);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(8994466824192L, 67014);
    B(paramActivity);
    GMTrace.o(8994466824192L, 67014);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(8994735259648L, 67016);
    GMTrace.o(8994735259648L, 67016);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */