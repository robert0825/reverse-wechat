package com.tencent.mm.plugin.offline;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ko;
import com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI;
import com.tencent.mm.plugin.wallet_core.c.i;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class d
  extends com.tencent.mm.plugin.wallet_core.b.b
{
  public d()
  {
    GMTrace.i(6236829384704L, 46468);
    GMTrace.o(6236829384704L, 46468);
  }
  
  public static void e(MMActivity paramMMActivity)
  {
    GMTrace.i(16031099650048L, 119441);
    String str = ((WalletBaseUI)paramMMActivity).ui.getString("key_pwd1");
    int i = ((WalletBaseUI)paramMMActivity).ui.getInt("offline_add_fee", 0);
    Bankcard localBankcard = com.tencent.mm.plugin.offline.c.a.aVV();
    if (localBankcard != null) {
      ((WalletBaseUI)paramMMActivity).r(new com.tencent.mm.plugin.offline.a.k(localBankcard, str, i));
    }
    GMTrace.o(16031099650048L, 119441);
  }
  
  public final com.tencent.mm.wallet_core.d.d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(6237232037888L, 46471);
    if ((paramMMActivity instanceof WalletVerifyCodeUI))
    {
      paramMMActivity = new com.tencent.mm.wallet_core.d.d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(6255217213440L, 46605);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0)) {
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.c.o))
            {
              if ((((WalletBaseUI)this.xDN).ui != null) && (((WalletBaseUI)this.xDN).ui.getInt("key_bind_scene", -1) == 5) && (!com.tencent.mm.plugin.offline.c.a.aVS()))
              {
                d.e(this.xDN);
                GMTrace.o(6255217213440L, 46605);
                return true;
              }
            }
            else if ((paramAnonymousk instanceof com.tencent.mm.plugin.offline.a.k))
            {
              com.tencent.mm.wallet_core.a.i(this.xDN, ((WalletBaseUI)this.xDN).ui);
              com.tencent.mm.plugin.offline.c.a.E(this.xDN);
              GMTrace.o(6255217213440L, 46605);
              return true;
            }
          }
          GMTrace.o(6255217213440L, 46605);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(6255082995712L, 46604);
          paramAnonymousVarArgs = (com.tencent.mm.plugin.wallet_core.model.o)paramAnonymousVarArgs[1];
          paramAnonymousVarArgs.flag = "1";
          this.xDO.a(new i(paramAnonymousVarArgs), true, 1);
          GMTrace.o(6255082995712L, 46604);
          return true;
        }
      };
      GMTrace.o(6237232037888L, 46471);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletPwdConfirmUI))
    {
      paramMMActivity = new com.tencent.mm.wallet_core.d.d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(6201395904512L, 46204);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.c.o))
            {
              if ((((WalletBaseUI)this.xDN).ui != null) && (((WalletBaseUI)this.xDN).ui.getInt("key_bind_scene", -1) == 5) && (!com.tencent.mm.plugin.offline.c.a.aVS())) {
                d.e(this.xDN);
              }
              GMTrace.o(6201395904512L, 46204);
              return true;
            }
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.offline.a.k))
            {
              paramAnonymousString = ((WalletBaseUI)this.xDN).ui;
              paramAnonymousString.putBoolean("intent_bind_end", true);
              com.tencent.mm.wallet_core.a.i(this.xDN, paramAnonymousString);
              com.tencent.mm.plugin.offline.c.a.E(this.xDN);
              GMTrace.o(6201395904512L, 46204);
              return true;
            }
          }
          GMTrace.o(6201395904512L, 46204);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(6201261686784L, 46203);
          paramAnonymousVarArgs = (com.tencent.mm.plugin.wallet_core.model.o)paramAnonymousVarArgs[0];
          this.xDO.a(new com.tencent.mm.plugin.wallet_core.b.a.b(paramAnonymousVarArgs), true, 1);
          GMTrace.o(6201261686784L, 46203);
          return true;
        }
      };
      GMTrace.o(6237232037888L, 46471);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(6237232037888L, 46471);
    return paramMMActivity;
  }
  
  public final String aAd()
  {
    GMTrace.i(6237500473344L, 46473);
    GMTrace.o(6237500473344L, 46473);
    return "OfflineBindCardRegProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6236963602432L, 46469);
    com.tencent.mm.sdk.b.a.vgX.m(new ko());
    c(paramActivity, WalletOfflineEntranceUI.class);
    if (paramActivity != null) {
      paramActivity.finish();
    }
    GMTrace.o(6236963602432L, 46469);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(6237097820160L, 46470);
    super.c(paramActivity, paramInt);
    GMTrace.o(6237097820160L, 46470);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6237366255616L, 46472);
    boolean bool = super.c(paramActivity, paramBundle);
    GMTrace.o(6237366255616L, 46472);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */