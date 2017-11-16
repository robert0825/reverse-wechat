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
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class c
  extends com.tencent.mm.plugin.wallet_core.b.b
{
  public c()
  {
    GMTrace.i(6188913655808L, 46111);
    GMTrace.o(6188913655808L, 46111);
  }
  
  public static void e(MMActivity paramMMActivity)
  {
    GMTrace.i(16030831214592L, 119439);
    String str = ((WalletBaseUI)paramMMActivity).ui.getString("key_pwd1");
    int i = ((WalletBaseUI)paramMMActivity).ui.getInt("offline_add_fee", 0);
    Bankcard localBankcard = com.tencent.mm.plugin.offline.c.a.aVV();
    if (localBankcard != null) {
      ((WalletBaseUI)paramMMActivity).r(new com.tencent.mm.plugin.offline.a.k(localBankcard, str, i));
    }
    GMTrace.o(16030831214592L, 119439);
  }
  
  public final com.tencent.mm.wallet_core.b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6189047873536L, 46112);
    paramActivity = super.a(paramActivity, paramBundle);
    GMTrace.o(6189047873536L, 46112);
    return paramActivity;
  }
  
  public final d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(6189450526720L, 46115);
    if ((paramMMActivity instanceof WalletVerifyCodeUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(6205154000896L, 46232);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0)) {
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.c.o))
            {
              if ((((WalletBaseUI)this.xDN).ui != null) && (((WalletBaseUI)this.xDN).ui.getInt("key_bind_scene", -1) == 5) && (!com.tencent.mm.plugin.offline.c.a.aVS()))
              {
                c.e(this.xDN);
                GMTrace.o(6205154000896L, 46232);
                return true;
              }
            }
            else if ((paramAnonymousk instanceof com.tencent.mm.plugin.offline.a.k))
            {
              com.tencent.mm.wallet_core.a.i(this.xDN, ((WalletBaseUI)this.xDN).ui);
              com.tencent.mm.plugin.offline.c.a.E(this.xDN);
              GMTrace.o(6205154000896L, 46232);
              return true;
            }
          }
          GMTrace.o(6205154000896L, 46232);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(6205019783168L, 46231);
          paramAnonymousVarArgs = (com.tencent.mm.plugin.wallet_core.model.o)paramAnonymousVarArgs[1];
          paramAnonymousVarArgs.flag = "2";
          this.xDO.a(new i(paramAnonymousVarArgs), true, 1);
          GMTrace.o(6205019783168L, 46231);
          return true;
        }
      };
      GMTrace.o(6189450526720L, 46115);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletPwdConfirmUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(6252130205696L, 46582);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0)) {
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.c.o))
            {
              if ((((WalletBaseUI)this.xDN).ui != null) && (((WalletBaseUI)this.xDN).ui.getInt("key_bind_scene", -1) == 5) && (!com.tencent.mm.plugin.offline.c.a.aVS()))
              {
                c.e(this.xDN);
                GMTrace.o(6252130205696L, 46582);
                return true;
              }
            }
            else if ((paramAnonymousk instanceof com.tencent.mm.plugin.offline.a.k))
            {
              paramAnonymousString = ((WalletBaseUI)this.xDN).ui;
              paramAnonymousString.putBoolean("intent_bind_end", true);
              com.tencent.mm.wallet_core.a.i(this.xDN, paramAnonymousString);
              com.tencent.mm.plugin.offline.c.a.E(this.xDN);
              GMTrace.o(6252130205696L, 46582);
              return true;
            }
          }
          GMTrace.o(6252130205696L, 46582);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(6251995987968L, 46581);
          paramAnonymousVarArgs = (com.tencent.mm.plugin.wallet_core.model.o)paramAnonymousVarArgs[0];
          this.xDO.a(new com.tencent.mm.plugin.wallet_core.b.a.b(paramAnonymousVarArgs), true, 1);
          GMTrace.o(6251995987968L, 46581);
          return true;
        }
      };
      GMTrace.o(6189450526720L, 46115);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(6189450526720L, 46115);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(6189182091264L, 46113);
    super.a(paramActivity, paramInt, paramBundle);
    GMTrace.o(6189182091264L, 46113);
  }
  
  public final String aAd()
  {
    GMTrace.i(6189718962176L, 46117);
    GMTrace.o(6189718962176L, 46117);
    return "OfflineBindCardProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6189316308992L, 46114);
    com.tencent.mm.sdk.b.a.vgX.m(new ko());
    if (com.tencent.mm.plugin.offline.c.a.aVS()) {
      c(paramActivity, WalletOfflineEntranceUI.class);
    }
    for (;;)
    {
      if (paramActivity != null) {
        paramActivity.finish();
      }
      GMTrace.o(6189316308992L, 46114);
      return;
      if (paramBundle.getInt("key_entry_scene", -1) == 2) {
        d(paramActivity, "offline", "ui.WalletOfflineEntranceUI");
      } else {
        d(paramActivity, "mall", ".ui.MallIndexUI");
      }
    }
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6189584744448L, 46116);
    boolean bool = super.c(paramActivity, paramBundle);
    GMTrace.o(6189584744448L, 46116);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */