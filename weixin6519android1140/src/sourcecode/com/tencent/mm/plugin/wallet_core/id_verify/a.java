package com.tencent.mm.plugin.wallet_core.id_verify;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.sn;
import com.tencent.mm.g.a.sy;
import com.tencent.mm.plugin.wallet_core.id_verify.model.c;
import com.tencent.mm.plugin.wallet_core.id_verify.model.h;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.d;

public class a
  extends com.tencent.mm.plugin.wallet_core.b.b
{
  public int aGY;
  public boolean jAg;
  private int mMode;
  public String rcO;
  public String rcP;
  private boolean rcQ;
  private int rcR;
  
  public a()
  {
    GMTrace.i(6856244199424L, 51083);
    this.rcO = null;
    this.rcP = null;
    this.rcQ = false;
    this.aGY = 0;
    this.rcR = -1;
    this.jAg = false;
    GMTrace.o(6856244199424L, 51083);
  }
  
  public final com.tencent.mm.wallet_core.b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6856378417152L, 51084);
    w(new Object[] { "start", paramActivity, paramBundle });
    if (this.ler == null) {
      this.ler = new Bundle();
    }
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = this.ler;
    }
    boolean bool;
    if (localBundle != null)
    {
      this.mMode = localBundle.getInt("real_name_verify_mode", 0);
      this.rcR = this.mMode;
      localBundle.putBoolean("key_is_realname_verify_process", true);
      this.rcO = localBundle.getString("realname_verify_process_jump_plugin", "");
      this.rcP = localBundle.getString("realname_verify_process_jump_activity", "");
      if (localBundle.getInt("realname_verify_process_allow_idverify", 0) != 1) {
        break label222;
      }
      bool = true;
      label133:
      this.rcQ = bool;
      w.i("MicroMsg.RealNameVerifyProcess", "mAllowIdVerify is  mAllowIdVerify: %s,mPluginName %s, mActivityName %s ", new Object[] { Boolean.valueOf(this.rcQ), this.rcO, this.rcP });
      switch (this.mMode)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(6856378417152L, 51084);
      return this;
      this.mMode = 0;
      break;
      label222:
      bool = false;
      break label133;
      localBundle.putBoolean("key_need_bind_response", true);
      com.tencent.mm.wallet_core.c.o.EL(10);
      super.a(paramActivity, localBundle);
      continue;
      com.tencent.mm.wallet_core.c.o.EL(10);
      c(paramActivity, SwitchRealnameVerifyModeUI.class, localBundle);
      continue;
      c(paramActivity, WalletRealNameVerifyUI.class, localBundle);
    }
  }
  
  public final d a(MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.f paramf)
  {
    GMTrace.i(6856915288064L, 51088);
    if ((paramMMActivity instanceof WalletPwdConfirmUI))
    {
      if (this.mMode == 2)
      {
        paramMMActivity = new d(paramMMActivity, paramf)
        {
          public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
          {
            GMTrace.i(6860941819904L, 51118);
            if ((paramAnonymousk instanceof c))
            {
              if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
              {
                a.b(a.this).putInt("realname_verify_process_ret", -1);
                w.i("MicroMsg.RealNameVerifyProcess", "real name reg succ ,update user info");
                n.byx().ayE();
                paramAnonymousString = new sn(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(6839064330240L, 50955);
                    w.i("MicroMsg.RealNameVerifyProcess", "update user info succ,end process");
                    GMTrace.o(6839064330240L, 50955);
                  }
                });
                com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousString);
                a.a(a.this, this.xDO);
                a.this.b(this.xDN, a.c(a.this));
                GMTrace.o(6860941819904L, 51118);
                return true;
              }
            }
            else if ((paramAnonymousk instanceof h))
            {
              GMTrace.o(6860941819904L, 51118);
              return true;
            }
            GMTrace.o(6860941819904L, 51118);
            return false;
          }
          
          public final boolean j(Object... paramAnonymousVarArgs)
          {
            GMTrace.i(6860807602176L, 51117);
            paramAnonymousVarArgs = (com.tencent.mm.plugin.wallet_core.model.o)paramAnonymousVarArgs[0];
            String str = a.a(a.this).getString("key_real_name_token");
            if ((paramAnonymousVarArgs == null) || (bg.nm(paramAnonymousVarArgs.riF))) {
              w.e("MicroMsg.RealNameVerifyProcess", "get pwd error");
            }
            for (;;)
            {
              GMTrace.o(6860807602176L, 51117);
              return true;
              if (bg.nm(str))
              {
                w.e("MicroMsg.RealNameVerifyProcess", "get token error");
              }
              else
              {
                paramAnonymousVarArgs = new c(paramAnonymousVarArgs.riF, str, a.this.ler.getInt("entry_scene", -1));
                this.xDO.a(paramAnonymousVarArgs, true);
              }
            }
          }
        };
        GMTrace.o(6856915288064L, 51088);
        return paramMMActivity;
      }
      paramMMActivity = super.a(paramMMActivity, paramf);
      GMTrace.o(6856915288064L, 51088);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletRealNameVerifyUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(6837990588416L, 50947);
          GMTrace.o(6837990588416L, 50947);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(6837856370688L, 50946);
          GMTrace.o(6837856370688L, 50946);
          return false;
        }
        
        public final CharSequence se(int paramAnonymousInt)
        {
          GMTrace.i(6837722152960L, 50945);
          Object localObject = null;
          if (paramAnonymousInt == 0)
          {
            String str = this.xDN.getString(a.i.tfk);
            localObject = this.xDN.getString(a.i.tfj);
            str = this.xDN.getString(a.i.tfm, new Object[] { str, localObject });
            com.tencent.mm.plugin.wallet_core.ui.f localf = new com.tencent.mm.plugin.wallet_core.ui.f(this.xDN);
            SpannableString localSpannableString = new SpannableString(str);
            localSpannableString.setSpan(localf, str.length() - ((String)localObject).length(), str.length(), 33);
            localObject = localSpannableString.subSequence(0, localSpannableString.length());
          }
          GMTrace.o(6837722152960L, 50945);
          return (CharSequence)localObject;
        }
      };
      GMTrace.o(6856915288064L, 51088);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(6856915288064L, 51088);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(6856646852608L, 51086);
    w(new Object[] { "forward", paramActivity, "actionCode:" + paramInt, paramBundle });
    int i = this.ler.getInt("real_name_verify_mode", this.mMode);
    if (this.mMode != i) {
      this.mMode = i;
    }
    if (this.mMode == 2)
    {
      if ((paramActivity instanceof WalletRealNameVerifyUI))
      {
        c(paramActivity, WalletSetPasswordUI.class, paramBundle);
        GMTrace.o(6856646852608L, 51086);
        return;
      }
      if ((paramActivity instanceof WalletSetPasswordUI))
      {
        c(paramActivity, WalletPwdConfirmUI.class, paramBundle);
        GMTrace.o(6856646852608L, 51086);
        return;
      }
      if ((!(paramActivity instanceof WalletPwdConfirmUI)) && ((paramActivity instanceof SwitchRealnameVerifyModeUI)))
      {
        c(paramActivity, WalletRealNameVerifyUI.class, paramBundle);
        this.mMode = 2;
        GMTrace.o(6856646852608L, 51086);
      }
    }
    else
    {
      if (this.mMode == 1)
      {
        if ((paramActivity instanceof SwitchRealnameVerifyModeUI))
        {
          if (n.byx().byS())
          {
            c(paramActivity, WalletCheckPwdUI.class, paramBundle);
            GMTrace.o(6856646852608L, 51086);
            return;
          }
          c(paramActivity, WalletBankcardIdUI.class, paramBundle);
          GMTrace.o(6856646852608L, 51086);
          return;
        }
        if ((paramActivity instanceof WalletCheckPwdUI))
        {
          c(paramActivity, WalletBankcardIdUI.class, paramBundle);
          GMTrace.o(6856646852608L, 51086);
          return;
        }
        super.a(paramActivity, paramInt, paramBundle);
        GMTrace.o(6856646852608L, 51086);
        return;
      }
      if ((paramActivity instanceof WalletRealNameVerifyUI))
      {
        c(paramActivity, WalletBankcardIdUI.class, paramBundle);
        this.mMode = 1;
        GMTrace.o(6856646852608L, 51086);
        return;
      }
      super.a(paramActivity, paramInt, paramBundle);
    }
    GMTrace.o(6856646852608L, 51086);
  }
  
  public final String aAd()
  {
    GMTrace.i(6857049505792L, 51089);
    GMTrace.o(6857049505792L, 51089);
    return "realname_verify_process";
  }
  
  public final int b(MMActivity paramMMActivity, int paramInt)
  {
    GMTrace.i(6857183723520L, 51090);
    paramInt = a.i.tcm;
    GMTrace.o(6857183723520L, 51090);
    return paramInt;
  }
  
  public final void b(final Activity paramActivity, final Bundle paramBundle)
  {
    GMTrace.i(6856781070336L, 51087);
    w(new Object[] { "end", paramActivity, paramBundle });
    com.tencent.mm.wallet_core.c.o.clP();
    if (paramBundle == null) {
      paramBundle = this.ler;
    }
    for (;;)
    {
      final Object localObject = paramBundle;
      if (paramBundle == null) {
        localObject = new Bundle();
      }
      if (this.mMode == 1)
      {
        clE();
        if (((Bundle)localObject).getBoolean("intent_bind_end", false)) {
          this.aGY = -1;
        }
      }
      for (;;)
      {
        if (((Bundle)localObject).containsKey("intent_bind_end")) {
          ((Bundle)localObject).remove("intent_bind_end");
        }
        if (((Bundle)localObject).containsKey("key_is_bind_reg_process")) {
          ((Bundle)localObject).remove("key_is_bind_reg_process");
        }
        ((Bundle)localObject).putInt("realname_verify_process_ret", this.aGY);
        paramBundle = new Intent();
        paramBundle.putExtras((Bundle)localObject);
        if (this.aGY == -1) {
          Toast.makeText(paramActivity, paramActivity.getString(a.i.sXg), 0).show();
        }
        localObject = new sn();
        ((sn)localObject).eDO = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6846446305280L, 51010);
            if (!a.this.jAg)
            {
              localObject.eDO = null;
              a.this.jAg = true;
              if ((!bg.nm(a.this.rcO)) && (!bg.nm(a.this.rcP)))
              {
                w.i("MicroMsg.RealNameVerifyProcess", "real name verify process end,jump to " + a.this.rcO + a.this.rcP);
                com.tencent.mm.sdk.platformtools.af.i(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(6836916846592L, 50939);
                    a.1.this.fSC.putExtra("key_process_is_end", true);
                    a.1.this.fSC.putExtra("key_process_is_stay", this.rcU);
                    a.a(a.this, a.1.this.hjp, a.this.rcO, a.this.rcP, a.this.aGY, a.1.this.fSC, this.rcU);
                    if (a.this.aGY == -1)
                    {
                      sy localsy = new sy();
                      localsy.eYs.result = a.this.aGY;
                      com.tencent.mm.sdk.b.a.vgX.m(localsy);
                    }
                    GMTrace.o(6836916846592L, 50939);
                  }
                }, 500L);
                GMTrace.o(6846446305280L, 51010);
                return;
              }
              a.this.ae(paramActivity);
              if (a.this.aGY == -1)
              {
                sy localsy = new sy();
                localsy.eYs.result = a.this.aGY;
                com.tencent.mm.sdk.b.a.vgX.m(localsy);
              }
            }
            GMTrace.o(6846446305280L, 51010);
          }
        };
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        GMTrace.o(6856781070336L, 51087);
        return;
        this.aGY = 0;
        continue;
        if (((Bundle)localObject).containsKey("realname_verify_process_ret")) {
          this.aGY = ((Bundle)localObject).getInt("realname_verify_process_ret", -1);
        } else {
          this.aGY = 0;
        }
      }
    }
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(6856512634880L, 51085);
    w(new Object[] { "back", paramActivity, Integer.valueOf(paramInt) });
    com.tencent.mm.wallet_core.c.o.clP();
    if ((paramActivity instanceof SwitchRealnameVerifyModeUI)) {
      if (paramInt == 0) {
        b(paramActivity, this.ler);
      }
    }
    for (;;)
    {
      if ((paramActivity instanceof WalletPwdConfirmUI)) {
        a(paramActivity, WalletSetPasswordUI.class, paramInt);
      }
      GMTrace.o(6856512634880L, 51085);
      return;
      if (((paramActivity instanceof WalletRealNameVerifyUI)) || ((paramActivity instanceof WalletBankcardIdUI)))
      {
        if (this.rcR != 0) {
          b(paramActivity, this.ler);
        }
      }
      else if ((paramActivity instanceof WalletCheckPwdUI)) {
        b(paramActivity, this.ler);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\id_verify\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */