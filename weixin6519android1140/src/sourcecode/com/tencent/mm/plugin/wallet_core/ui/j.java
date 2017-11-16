package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.c.r;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;

public class j
  extends b
{
  public String llm;
  public String rct;
  private int scene;
  public String token;
  
  public j()
  {
    GMTrace.i(7005628530688L, 52196);
    GMTrace.o(7005628530688L, 52196);
  }
  
  public final b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7005762748416L, 52197);
    w.i("MicroMsg.WalletJSApiVerifyCodeProcess", "start WalletJSApiVerifyCodeProcess");
    this.rct = paramBundle.getString("key_relation_key");
    this.llm = paramBundle.getString("key_pwd1");
    this.token = paramBundle.getString("key_jsapi_token");
    this.scene = paramBundle.getInt("key_verify_scene");
    c(paramActivity, WalletVerifyCodeUI.class, paramBundle);
    GMTrace.o(7005762748416L, 52197);
    return this;
  }
  
  public final d a(final MMActivity paramMMActivity, final f paramf)
  {
    GMTrace.i(7006568054784L, 52203);
    paramMMActivity = new d(paramMMActivity, paramf)
    {
      public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(7004689006592L, 52189);
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          if ((paramAnonymousk instanceof r))
          {
            w.i("MicroMsg.WalletJSApiVerifyCodeProcess", "send sms succ");
            paramAnonymousString = (r)paramAnonymousk;
            paramAnonymousk = j.this.ler;
            paramAnonymousk.putString("key_jsapi_token", paramAnonymousString.rcC);
            j.this.b(paramMMActivity, paramAnonymousk);
            GMTrace.o(7004689006592L, 52189);
            return true;
          }
          if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.c.k))
          {
            GMTrace.o(7004689006592L, 52189);
            return true;
          }
          GMTrace.o(7004689006592L, 52189);
          return false;
        }
        if ((paramAnonymousk instanceof r)) {
          w.e("MicroMsg.WalletJSApiVerifyCodeProcess", "send sms fail,errType=" + paramAnonymousInt1 + ",errCode=" + paramAnonymousInt2 + ",errMsg=" + paramAnonymousString);
        }
        GMTrace.o(7004689006592L, 52189);
        return false;
      }
      
      public final boolean j(Object... paramAnonymousVarArgs)
      {
        GMTrace.i(7004420571136L, 52187);
        if (paramAnonymousVarArgs.length == 2)
        {
          paramAnonymousVarArgs = (o)paramAnonymousVarArgs[1];
          paramAnonymousVarArgs.token = j.this.token;
          w.i("MicroMsg.WalletJSApiVerifyCodeProcess", "do NetSceneTenpayVerifySmsByPasswd");
          paramAnonymousVarArgs = new r(paramAnonymousVarArgs, j.this.rct);
          paramf.a(paramAnonymousVarArgs, true, 1);
          GMTrace.o(7004420571136L, 52187);
          return true;
        }
        w.e("MicroMsg.WalletJSApiVerifyCodeProcess", "arguments is error");
        GMTrace.o(7004420571136L, 52187);
        return false;
      }
      
      public final boolean q(Object... paramAnonymousVarArgs)
      {
        GMTrace.i(7004554788864L, 52188);
        w.i("MicroMsg.WalletJSApiVerifyCodeProcess", "resend sms");
        paramAnonymousVarArgs = new com.tencent.mm.plugin.wallet_core.c.k(j.this.llm, j.this.token, (byte)0);
        paramf.a(paramAnonymousVarArgs, true, 1);
        GMTrace.o(7004554788864L, 52188);
        return true;
      }
      
      public final CharSequence se(int paramAnonymousInt)
      {
        GMTrace.i(7004823224320L, 52190);
        String str = String.format(paramMMActivity.getResources().getString(a.i.tgT), new Object[] { j.this.ler.getString("key_mobile") });
        GMTrace.o(7004823224320L, 52190);
        return str;
      }
    };
    GMTrace.o(7006568054784L, 52203);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(7005896966144L, 52198);
    GMTrace.o(7005896966144L, 52198);
  }
  
  public final String aAd()
  {
    GMTrace.i(7006433837056L, 52202);
    GMTrace.o(7006433837056L, 52202);
    return null;
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7006165401600L, 52200);
    w.i("MicroMsg.WalletJSApiVerifyCodeProcess", "end WalletJSApiVerifyCodeProcess");
    if (this.scene == 8)
    {
      a(paramActivity, "wallet", ".pay.ui.WalletLoanRepaymentUI", -1, null, false);
      GMTrace.o(7006165401600L, 52200);
      return;
    }
    a(paramActivity, WalletCheckPwdUI.class, -1, null, false);
    GMTrace.o(7006165401600L, 52200);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(7006031183872L, 52199);
    GMTrace.o(7006031183872L, 52199);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7006299619328L, 52201);
    GMTrace.o(7006299619328L, 52201);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */