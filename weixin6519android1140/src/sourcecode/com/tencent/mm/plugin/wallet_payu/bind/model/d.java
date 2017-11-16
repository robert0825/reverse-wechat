package com.tencent.mm.plugin.wallet_payu.bind.model;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet.bind.a;
import com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUBankcardDetailUI;
import com.tencent.mm.plugin.wallet_payu.pwd.a.c;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUCheckPwdUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.wallet_core.d.f;

public class d
  extends a
{
  public d()
  {
    GMTrace.i(7910927106048L, 58941);
    GMTrace.o(7910927106048L, 58941);
  }
  
  public final com.tencent.mm.wallet_core.d.d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(7911463976960L, 58945);
    if ((paramMMActivity instanceof WalletPayUCheckPwdUI))
    {
      paramMMActivity = new com.tencent.mm.wallet_core.d.d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7916161597440L, 58980);
          if ((paramAnonymousk instanceof c)) {
            if ((paramAnonymousInt2 == 0) && (paramAnonymousInt1 == 0))
            {
              paramAnonymousString = (c)paramAnonymousk;
              d.a(d.this).putString("payu_reference", paramAnonymousString.token);
              if (bg.nm(paramAnonymousString.token)) {
                break label124;
              }
              w.d("MicroMsg.PayUUnbindProcess", "hy: check pwd pass");
              paramAnonymousString = (Bankcard)d.b(d.this).getParcelable("key_bankcard");
              if (paramAnonymousString != null) {
                this.xDO.a(new b(paramAnonymousString.field_bindSerial, d.c(d.this).getString("payu_reference")), true);
              }
            }
          }
          label124:
          while (!(paramAnonymousk instanceof b)) {
            for (;;)
            {
              GMTrace.o(7916161597440L, 58980);
              return false;
              w.w("MicroMsg.PayUUnbindProcess", "hy: check pwd failed");
            }
          }
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            d.d(d.this).putInt("key_errcode_payu", 0);
            d.this.b(this.xDN, d.e(d.this));
          }
          GMTrace.o(7916161597440L, 58980);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7916295815168L, 58981);
          d.f(d.this).putString("key_pwd1", (String)paramAnonymousVarArgs[0]);
          this.xDO.a(new c(d.g(d.this).getString("key_pwd1")), true);
          GMTrace.o(7916295815168L, 58981);
          return true;
        }
        
        public final CharSequence se(int paramAnonymousInt)
        {
          GMTrace.i(7916027379712L, 58979);
          if (paramAnonymousInt == 0)
          {
            localObject = this.xDN.getString(a.i.tbd);
            GMTrace.o(7916027379712L, 58979);
            return (CharSequence)localObject;
          }
          Object localObject = super.se(paramAnonymousInt);
          GMTrace.o(7916027379712L, 58979);
          return (CharSequence)localObject;
        }
      };
      GMTrace.o(7911463976960L, 58945);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(7911463976960L, 58945);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(7911329759232L, 58944);
    if ((paramActivity instanceof WalletBankcardDetailUI))
    {
      c(paramActivity, WalletPayUCheckPwdUI.class, paramBundle);
      GMTrace.o(7911329759232L, 58944);
      return;
    }
    if ((paramActivity instanceof WalletPayUCheckPwdUI)) {
      b(paramActivity, paramBundle);
    }
    GMTrace.o(7911329759232L, 58944);
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7911195541504L, 58943);
    if (this.ler.getInt("key_errcode_payu", -1) == 0) {
      u.makeText(paramActivity, a.i.tdp, 0).show();
    }
    for (;;)
    {
      d(paramActivity, "mall", ".ui.MallIndexUI");
      GMTrace.o(7911195541504L, 58943);
      return;
      u.makeText(paramActivity, a.i.tbB, 0).show();
    }
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7911598194688L, 58946);
    GMTrace.o(7911598194688L, 58946);
    return false;
  }
  
  protected final void d(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7911061323776L, 58942);
    c(paramActivity, WalletPayUBankcardDetailUI.class, paramBundle);
    GMTrace.o(7911061323776L, 58942);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\bind\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */