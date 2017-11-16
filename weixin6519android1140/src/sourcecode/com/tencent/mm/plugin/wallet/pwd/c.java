package com.tencent.mm.plugin.wallet.pwd;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet.pwd.a.g;
import com.tencent.mm.plugin.wallet.pwd.ui.WalletResetPwdAdapterUI;
import com.tencent.mm.plugin.wallet_core.c.j;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class c
  extends b
{
  public c()
  {
    GMTrace.i(18430912626688L, 137321);
    GMTrace.o(18430912626688L, 137321);
  }
  
  public final b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(18431046844416L, 137322);
    w.d("MicroMsg.ResetPwdProcessByToken", "start Process : ResetPwdProcessByToken");
    c(paramActivity, WalletSetPasswordUI.class, paramBundle);
    GMTrace.o(18431046844416L, 137322);
    return this;
  }
  
  public final d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(18431583715328L, 137326);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(18428630925312L, 137304);
          GMTrace.o(18428630925312L, 137304);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(18428765143040L, 137305);
          String str = (String)paramAnonymousVarArgs[0];
          paramAnonymousVarArgs = (String)paramAnonymousVarArgs[1];
          this.xDO.a(new j(str, 3, paramAnonymousVarArgs), true, 1);
          GMTrace.o(18428765143040L, 137305);
          return true;
        }
        
        public final CharSequence se(int paramAnonymousInt)
        {
          GMTrace.i(18428899360768L, 137306);
          switch (paramAnonymousInt)
          {
          default: 
            localObject = super.se(paramAnonymousInt);
            GMTrace.o(18428899360768L, 137306);
            return (CharSequence)localObject;
          case 0: 
            localObject = this.xDN.getString(a.i.taX);
            GMTrace.o(18428899360768L, 137306);
            return (CharSequence)localObject;
          }
          Object localObject = this.xDN.getString(a.i.tdW);
          GMTrace.o(18428899360768L, 137306);
          return (CharSequence)localObject;
        }
      };
      GMTrace.o(18431583715328L, 137326);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletPwdConfirmUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(18429167796224L, 137308);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousk instanceof g))
            {
              c.a(c.this).putInt("RESET_PWD_USER_ACTION", 1);
              c.this.a(this.xDN, 0, c.b(c.this));
              h.bm(this.xDN, this.xDN.getString(a.i.tdS));
            }
            GMTrace.o(18429167796224L, 137308);
            return true;
          }
          if ((paramAnonymousk instanceof g))
          {
            h.a(this.xDN, paramAnonymousString, "", false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(18430778408960L, 137320);
                c.c(c.this).putInt("RESET_PWD_USER_ACTION", 2);
                c.this.a(c.2.this.xDN, 0, c.d(c.this));
                GMTrace.o(18430778408960L, 137320);
              }
            });
            GMTrace.o(18429167796224L, 137308);
            return true;
          }
          GMTrace.o(18429167796224L, 137308);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(18429302013952L, 137309);
          paramAnonymousVarArgs = (o)paramAnonymousVarArgs[0];
          c.e(c.this).getString("key_pwd1");
          this.xDO.a(new g(paramAnonymousVarArgs.riF, paramAnonymousVarArgs.token), true, 1);
          GMTrace.o(18429302013952L, 137309);
          return true;
        }
      };
      GMTrace.o(18431583715328L, 137326);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(18431583715328L, 137326);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(18431181062144L, 137323);
    if ((paramActivity instanceof WalletSetPasswordUI))
    {
      c(paramActivity, WalletPwdConfirmUI.class, paramBundle);
      GMTrace.o(18431181062144L, 137323);
      return;
    }
    if ((paramActivity instanceof WalletPwdConfirmUI)) {
      b(paramActivity, paramBundle);
    }
    GMTrace.o(18431181062144L, 137323);
  }
  
  public final boolean a(final WalletBaseUI paramWalletBaseUI, int paramInt, String paramString)
  {
    GMTrace.i(18431852150784L, 137328);
    switch (paramInt)
    {
    default: 
      GMTrace.o(18431852150784L, 137328);
      return false;
    }
    h.a(paramWalletBaseUI, paramString, null, paramWalletBaseUI.getString(a.i.tgu), false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(18430509973504L, 137318);
        c.this.b(paramWalletBaseUI, c.f(c.this));
        if (paramWalletBaseUI.aNg()) {
          paramWalletBaseUI.finish();
        }
        WalletBaseUI.cmn();
        GMTrace.o(18430509973504L, 137318);
      }
    });
    GMTrace.o(18431852150784L, 137328);
    return true;
  }
  
  public final String aAd()
  {
    GMTrace.i(18432120586240L, 137330);
    GMTrace.o(18432120586240L, 137330);
    return "ResetPwdProcessByToken";
  }
  
  public final int b(MMActivity paramMMActivity, int paramInt)
  {
    GMTrace.i(18431986368512L, 137329);
    paramInt = a.i.tgu;
    GMTrace.o(18431986368512L, 137329);
    return paramInt;
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(18431449497600L, 137325);
    Intent localIntent = new Intent(paramActivity, WalletResetPwdAdapterUI.class);
    localIntent.putExtra("RESET_PWD_USER_ACTION", paramBundle.getInt("RESET_PWD_USER_ACTION", 0));
    a(paramActivity, WalletResetPwdAdapterUI.class, -1, localIntent, false);
    GMTrace.o(18431449497600L, 137325);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(18431315279872L, 137324);
    if ((paramActivity instanceof WalletPwdConfirmUI)) {
      a(paramActivity, WalletSetPasswordUI.class, paramInt);
    }
    GMTrace.o(18431315279872L, 137324);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(18431717933056L, 137327);
    GMTrace.o(18431717933056L, 137327);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pwd\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */