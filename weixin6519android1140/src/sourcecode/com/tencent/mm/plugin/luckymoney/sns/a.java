package com.tencent.mm.plugin.luckymoney.sns;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.pr;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;

public class a
  extends b
{
  public a()
  {
    GMTrace.i(9895470432256L, 73727);
    GMTrace.o(9895470432256L, 73727);
  }
  
  public static void pW(int paramInt)
  {
    GMTrace.i(16051903397888L, 119596);
    pr localpr = new pr();
    localpr.eUv.key = paramInt;
    localpr.eUv.value = 1;
    localpr.eUv.eUw = true;
    com.tencent.mm.sdk.b.a.vgX.m(localpr);
    GMTrace.o(16051903397888L, 119596);
  }
  
  public final b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(9895604649984L, 73728);
    if ((paramActivity instanceof SnsLuckyMoneyFreePwdSetting)) {
      c(paramActivity, WalletCheckPwdUI.class, paramBundle);
    }
    GMTrace.o(9895604649984L, 73728);
    return this;
  }
  
  public final d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(9896409956352L, 73734);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(9895201996800L, 73725);
          if ((paramAnonymousk instanceof com.tencent.mm.plugin.luckymoney.sns.a.a))
          {
            w.i("MicroMsg.ProcessManager", "OpenSnsPayProcess onSceneEnd, errType:" + paramAnonymousInt1 + " errCode:" + paramAnonymousInt2 + " errMsg:" + paramAnonymousString);
            if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
            {
              h.bm(this.xDN, this.xDN.getString(a.i.sUS));
              a.pW(121);
              a.a(a.this).putBoolean("is_open_sns_pay", true);
              a.this.a(this.xDN, 0, a.b(a.this));
            }
            for (;;)
            {
              GMTrace.o(9895201996800L, 73725);
              return true;
              h.bm(this.xDN, this.xDN.getString(a.i.sUR));
              a.pW(122);
              a.this.c(this.xDN, 0);
            }
          }
          GMTrace.o(9895201996800L, 73725);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(9895336214528L, 73726);
          paramAnonymousVarArgs = (String)paramAnonymousVarArgs[0];
          this.xDO.a(new com.tencent.mm.plugin.luckymoney.sns.a.a(1, paramAnonymousVarArgs, ""), true, 1);
          GMTrace.o(9895336214528L, 73726);
          return true;
        }
      };
      GMTrace.o(9896409956352L, 73734);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(9896409956352L, 73734);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(9895738867712L, 73729);
    b(paramActivity, paramBundle);
    GMTrace.o(9895738867712L, 73729);
  }
  
  public final String aAd()
  {
    GMTrace.i(9896275738624L, 73733);
    GMTrace.o(9896275738624L, 73733);
    return "LuckyFreePwdProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(9896007303168L, 73731);
    Intent localIntent = new Intent();
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    localIntent.putExtras(localBundle);
    a(paramActivity, "luckymoney", ".sns.SnsLuckyMoneyFreePwdSetting", -1, localIntent, true);
    GMTrace.o(9896007303168L, 73731);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(9895873085440L, 73730);
    b(paramActivity, null);
    GMTrace.o(9895873085440L, 73730);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(9896141520896L, 73732);
    GMTrace.o(9896141520896L, 73732);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\sns\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */