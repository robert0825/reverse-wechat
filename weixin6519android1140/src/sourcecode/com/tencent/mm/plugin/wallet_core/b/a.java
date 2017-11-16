package com.tencent.mm.plugin.wallet_core.b;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public abstract class a
  extends b
{
  public a()
  {
    GMTrace.i(6827521605632L, 50869);
    GMTrace.o(6827521605632L, 50869);
  }
  
  public b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6827655823360L, 50870);
    w(new Object[] { "start", paramActivity, paramBundle });
    if (paramBundle != null) {
      paramBundle.putBoolean("key_is_bind_reg_process", true);
    }
    c(paramActivity, WalletBankcardIdUI.class, paramBundle);
    GMTrace.o(6827655823360L, 50870);
    return this;
  }
  
  public void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(6827790041088L, 50871);
    w(new Object[] { "forward", paramActivity, Integer.valueOf(paramInt), paramBundle });
    if (((paramActivity instanceof WalletBankcardIdUI)) || ((paramActivity instanceof WalletConfirmCardIDUI)))
    {
      c(paramActivity, WalletCardElementUI.class, paramBundle);
      GMTrace.o(6827790041088L, 50871);
      return;
    }
    if ((paramActivity instanceof WalletVerifyCodeUI))
    {
      c(paramActivity, WalletSetPasswordUI.class, paramBundle);
      GMTrace.o(6827790041088L, 50871);
      return;
    }
    if ((paramActivity instanceof WalletSetPasswordUI))
    {
      c(paramActivity, WalletPwdConfirmUI.class, paramBundle);
      GMTrace.o(6827790041088L, 50871);
      return;
    }
    if ((paramActivity instanceof WalletOrderInfoUI)) {
      b(paramActivity, paramBundle);
    }
    GMTrace.o(6827790041088L, 50871);
  }
  
  public boolean a(final WalletBaseUI paramWalletBaseUI, int paramInt, String paramString)
  {
    GMTrace.i(6828192694272L, 50874);
    switch (paramInt)
    {
    default: 
      GMTrace.o(6828192694272L, 50874);
      return false;
    }
    w.i("MicroMsg.ProcessManager", "404 bind error, cancel bind!");
    h.a(paramWalletBaseUI, paramString, null, paramWalletBaseUI.getString(a.i.taa), false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(6828595347456L, 50877);
        a.this.b(paramWalletBaseUI, a.this.ler);
        if (paramWalletBaseUI.aNg()) {
          paramWalletBaseUI.finish();
        }
        WalletBaseUI.cmn();
        GMTrace.o(6828595347456L, 50877);
      }
    });
    GMTrace.o(6828192694272L, 50874);
    return true;
  }
  
  public int b(MMActivity paramMMActivity, int paramInt)
  {
    GMTrace.i(6828326912000L, 50875);
    paramInt = a.i.tci;
    GMTrace.o(6828326912000L, 50875);
    return paramInt;
  }
  
  public void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(6827924258816L, 50872);
    w(new Object[] { "back", paramActivity, Integer.valueOf(paramInt) });
    if ((paramActivity instanceof WalletPwdConfirmUI))
    {
      a(paramActivity, WalletSetPasswordUI.class, paramInt);
      GMTrace.o(6827924258816L, 50872);
      return;
    }
    B(paramActivity);
    GMTrace.o(6827924258816L, 50872);
  }
  
  public boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6828058476544L, 50873);
    boolean bool = paramActivity instanceof WalletOrderInfoUI;
    GMTrace.o(6828058476544L, 50873);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */