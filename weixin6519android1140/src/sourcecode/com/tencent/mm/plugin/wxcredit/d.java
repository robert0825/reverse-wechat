package com.tencent.mm.plugin.wxcredit;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditErrDetailUI;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.b;

public class d
  extends b
{
  public d()
  {
    GMTrace.i(9022518329344L, 67223);
    GMTrace.o(9022518329344L, 67223);
  }
  
  public final b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(9022652547072L, 67224);
    w.d("MicroMsg.WXCreditManagerProcess", "start Process : WXCreditManagerProcess");
    c(paramActivity, WalletWXCreditDetailUI.class, paramBundle);
    GMTrace.o(9022652547072L, 67224);
    return this;
  }
  
  public final com.tencent.mm.wallet_core.d.d a(MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.f paramf)
  {
    GMTrace.i(9023323635712L, 67229);
    if ((paramMMActivity instanceof WalletWXCreditDetailUI))
    {
      paramMMActivity = new com.tencent.mm.wallet_core.d.d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(8991782469632L, 66994);
          GMTrace.o(8991782469632L, 66994);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(8991916687360L, 66995);
          GMTrace.o(8991916687360L, 66995);
          return false;
        }
        
        public final boolean p(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(8992050905088L, 66996);
          paramAnonymousVarArgs = (Bankcard)paramAnonymousVarArgs[0];
          this.xDO.a(new com.tencent.mm.plugin.wxcredit.a.d(paramAnonymousVarArgs.field_bindSerial, paramAnonymousVarArgs.field_bankcardType), true, 1);
          GMTrace.o(8992050905088L, 66996);
          return true;
        }
      };
      GMTrace.o(9023323635712L, 67229);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new com.tencent.mm.wallet_core.d.d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(8993258864640L, 67005);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wxcredit.a.f)) {
              this.xDO.a(new o(null), true);
            }
            for (;;)
            {
              GMTrace.o(8993258864640L, 67005);
              return true;
              if ((paramAnonymousk instanceof o)) {
                d.this.b(this.xDN, d.a(d.this));
              }
            }
          }
          GMTrace.o(8993258864640L, 67005);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(8993393082368L, 67006);
          Bankcard localBankcard = (Bankcard)d.b(d.this).getParcelable("key_bankcard");
          this.xDO.a(new com.tencent.mm.plugin.wxcredit.a.f(localBankcard.field_bankcardType, localBankcard.field_bindSerial, (String)paramAnonymousVarArgs[0]), true, 1);
          GMTrace.o(8993393082368L, 67006);
          return true;
        }
        
        public final boolean p(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(8993527300096L, 67007);
          paramAnonymousVarArgs = (Bankcard)paramAnonymousVarArgs[0];
          this.xDO.a(new com.tencent.mm.plugin.wxcredit.a.d(paramAnonymousVarArgs.field_bindSerial, paramAnonymousVarArgs.field_bankcardType), true, 1);
          GMTrace.o(8993527300096L, 67007);
          return true;
        }
      };
      GMTrace.o(9023323635712L, 67229);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(9023323635712L, 67229);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(9022786764800L, 67225);
    if (paramInt == 1)
    {
      c(paramActivity, WalletWXCreditErrDetailUI.class, paramBundle);
      paramActivity.finish();
      GMTrace.o(9022786764800L, 67225);
      return;
    }
    if ((paramActivity instanceof WalletWXCreditDetailUI))
    {
      c(paramActivity, WalletCheckPwdUI.class, paramBundle);
      GMTrace.o(9022786764800L, 67225);
      return;
    }
    if ((paramActivity instanceof WalletCheckPwdUI))
    {
      b(paramActivity, paramBundle);
      GMTrace.o(9022786764800L, 67225);
      return;
    }
    if ((paramActivity instanceof WalletWXCreditErrDetailUI)) {
      c(paramActivity, WalletCheckPwdUI.class, paramBundle);
    }
    GMTrace.o(9022786764800L, 67225);
  }
  
  public final String aAd()
  {
    GMTrace.i(9023457853440L, 67230);
    GMTrace.o(9023457853440L, 67230);
    return "WXCreditManagerProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(9023055200256L, 67227);
    d(paramActivity, "mall", ".ui.MallIndexUI");
    GMTrace.o(9023055200256L, 67227);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(9022920982528L, 67226);
    B(paramActivity);
    GMTrace.o(9022920982528L, 67226);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(9023189417984L, 67228);
    GMTrace.o(9023189417984L, 67228);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */