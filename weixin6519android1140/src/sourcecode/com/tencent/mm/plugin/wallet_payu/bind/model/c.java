package com.tencent.mm.plugin.wallet_payu.bind.model;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUBankcardManageUI;
import com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUCheckPwdUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;

public class c
  extends b
{
  public c()
  {
    GMTrace.i(7913477242880L, 58960);
    GMTrace.o(7913477242880L, 58960);
  }
  
  public final b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7913611460608L, 58961);
    w.d("MicroMsg.PayUBindProcess", "hy: start process: PayUBindProcess");
    c(paramActivity, WalletPayUCheckPwdUI.class, paramBundle);
    GMTrace.o(7913611460608L, 58961);
    return this;
  }
  
  public final d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(7914282549248L, 58966);
    if ((paramMMActivity instanceof WalletPayUCheckPwdUI))
    {
      paramMMActivity = new com.tencent.mm.plugin.wallet_payu.pwd.a.a(paramMMActivity, paramf, this.ler)
      {
        public final CharSequence se(int paramAnonymousInt)
        {
          GMTrace.i(7916564250624L, 58983);
          if (paramAnonymousInt == 0)
          {
            localObject = this.xDN.getString(a.i.taW);
            GMTrace.o(7916564250624L, 58983);
            return (CharSequence)localObject;
          }
          Object localObject = super.se(paramAnonymousInt);
          GMTrace.o(7916564250624L, 58983);
          return (CharSequence)localObject;
        }
      };
      GMTrace.o(7914282549248L, 58966);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletPayUCardElementUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7913208807424L, 58958);
          if (((paramAnonymousk instanceof a)) && (paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            c.a(c.this).putInt("key_errcode_payu", 0);
            c.this.b(this.xDN, c.b(c.this));
          }
          if ((paramAnonymousk instanceof NetScenePayUElementQuery))
          {
            if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0)) {
              break label133;
            }
            paramAnonymousString = ((NetScenePayUElementQuery)paramAnonymousk).rtj;
            if (bg.nm(paramAnonymousString.rtk)) {
              paramAnonymousString.rtl = ab.getContext().getString(a.i.teN);
            }
            c.c(c.this).putParcelable("key_card_element", ((NetScenePayUElementQuery)paramAnonymousk).rtj);
          }
          for (;;)
          {
            GMTrace.o(7913208807424L, 58958);
            return false;
            label133:
            NetScenePayUElementQuery.PayUBankcardElement localPayUBankcardElement = new NetScenePayUElementQuery.PayUBankcardElement();
            paramAnonymousk = paramAnonymousString;
            if (bg.nm(paramAnonymousString)) {
              paramAnonymousk = "err card element";
            }
            localPayUBankcardElement.rtl = paramAnonymousk;
            c.d(c.this).putParcelable("key_card_element", localPayUBankcardElement);
          }
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7913343025152L, 58959);
          paramAnonymousVarArgs = (NetScenePayUElementQuery.PayUBankcardElement)c.e(c.this).getParcelable("key_card_element");
          this.xDO.a(new a(paramAnonymousVarArgs.nEp, paramAnonymousVarArgs.rtl, c.f(c.this).getString("key_bank_username"), c.g(c.this).getString("key_card_id"), c.h(c.this).getString("key_expire_data"), paramAnonymousVarArgs.cardType, c.i(c.this).getString("key_cvv"), c.j(c.this).getString("key_pwd1")), true);
          GMTrace.o(7913343025152L, 58959);
          return false;
        }
      };
      GMTrace.o(7914282549248L, 58966);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(7914282549248L, 58966);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(7913745678336L, 58962);
    if ((paramActivity instanceof WalletPayUCheckPwdUI)) {
      c(paramActivity, WalletPayUCardElementUI.class, paramBundle);
    }
    GMTrace.o(7913745678336L, 58962);
  }
  
  public final String aAd()
  {
    GMTrace.i(7914416766976L, 58967);
    GMTrace.o(7914416766976L, 58967);
    return "PayUBindProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7914014113792L, 58964);
    if (this.ler.getInt("key_errcode_payu", -1) == 0)
    {
      u.makeText(paramActivity, a.i.tdp, 0).show();
      a(paramActivity, WalletPayUBankcardManageUI.class, -1, false);
      GMTrace.o(7914014113792L, 58964);
      return;
    }
    u.makeText(paramActivity, a.i.tbB, 0).show();
    a(paramActivity, WalletPayUBankcardManageUI.class, 0, false);
    GMTrace.o(7914014113792L, 58964);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(7913879896064L, 58963);
    B(paramActivity);
    GMTrace.o(7913879896064L, 58963);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7914148331520L, 58965);
    GMTrace.o(7914148331520L, 58965);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\bind\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */