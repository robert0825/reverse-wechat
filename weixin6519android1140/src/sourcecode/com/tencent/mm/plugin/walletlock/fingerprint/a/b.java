package com.tencent.mm.plugin.walletlock.fingerprint.a;

import android.app.Activity;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.so;
import com.tencent.mm.g.a.so.b;
import com.tencent.mm.kernel.c;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.walletlock.a.b.a;
import com.tencent.mm.plugin.walletlock.a.b.b;
import com.tencent.mm.plugin.walletlock.b.g;
import com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.plugin.walletlock.b.a
{
  public b()
  {
    GMTrace.i(20271440330752L, 151034);
    GMTrace.o(20271440330752L, 151034);
  }
  
  public final void L(Activity paramActivity)
  {
    GMTrace.i(20272245637120L, 151040);
    GMTrace.o(20272245637120L, 151040);
  }
  
  public final void a(Activity paramActivity, b.b paramb)
  {
    GMTrace.i(20271708766208L, 151036);
    if (!h.xu().g(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      w.d("MicroMsg.FingerprintLockImpl", "Plugin gesture is not installed.");
      GMTrace.o(20271708766208L, 151036);
      return;
    }
    if ((paramb != null) && (!paramb.M(paramActivity)))
    {
      w.d("MicroMsg.FingerprintLockImpl", "protectMeOnCreate: still in filter range, do not activate protection.");
      GMTrace.o(20271708766208L, 151036);
      return;
    }
    paramb = new so();
    paramb.eXS.eXU = 0;
    paramb.eXS.activity = paramActivity;
    com.tencent.mm.sdk.b.a.vgX.m(paramb);
    switch (((Integer)paramb.eXT.data).intValue())
    {
    }
    for (;;)
    {
      GMTrace.o(20271708766208L, 151036);
      return;
      paramActivity.finish();
      paramb = new Intent(paramActivity, FingerprintWalletLockUI.class);
      paramb.addFlags(131072);
      paramb.putExtra("action", "action.verify_pattern");
      paramb.putExtra("next_action", "next_action.goto_protected_page");
      paramb.putExtra("page_intent", paramActivity.getIntent());
      paramb.putExtra("scene", N(paramActivity));
      paramb.setPackage(ab.getPackageName());
      paramActivity.startActivity(paramb);
    }
  }
  
  public final void a(Activity paramActivity, b.b paramb, b.a parama)
  {
    GMTrace.i(20271842983936L, 151037);
    if (!h.xu().g(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      w.d("MicroMsg.FingerprintLockImpl", "Plugin gesture is not installed.");
      GMTrace.o(20271842983936L, 151037);
      return;
    }
    parama = new so();
    parama.eXS.eXU = 1;
    parama.eXS.activity = paramActivity;
    com.tencent.mm.sdk.b.a.vgX.m(parama);
    switch (((Integer)parama.eXT.data).intValue())
    {
    }
    for (;;)
    {
      GMTrace.o(20271842983936L, 151037);
      return;
      if ((paramb == null) || (paramb.M(paramActivity)))
      {
        paramb = new Intent(paramActivity, FingerprintWalletLockUI.class);
        paramb.addFlags(131072);
        paramb.putExtra("action", "action.verify_pattern");
        paramb.putExtra("next_action", "next_action.goto_protected_page");
        paramb.putExtra("page_intent", paramActivity.getIntent());
        paramb.putExtra("scene", N(paramActivity));
        paramb.setPackage(ab.getPackageName());
        paramActivity.startActivity(paramb);
        GMTrace.o(20271842983936L, 151037);
        return;
      }
      w.d("MicroMsg.FingerprintLockImpl", "protectMeOnResume: still in filter range, do not activate protection.");
    }
  }
  
  public final void b(Activity paramActivity, int paramInt1, int paramInt2)
  {
    GMTrace.i(20272111419392L, 151039);
    if (paramInt1 != 2)
    {
      GMTrace.o(20272111419392L, 151039);
      return;
    }
    if (!h.xu().g(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      w.d("MicroMsg.FingerprintLockImpl", "Plugin gesture is not installed.");
      GMTrace.o(20272111419392L, 151039);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("action", "action.verify_paypwd");
    localIntent.putExtra("next_action", "next_action.switch_on_pattern");
    localIntent.putExtra("key_wallet_lock_type", 2);
    w.i("MicroMsg.FingerprintLockImpl", "alvinluo enterNewWalletLockProcessForResult start check pwd ui, wallet lock type: %d", new Object[] { Integer.valueOf(paramInt1) });
    com.tencent.mm.bj.d.b(paramActivity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", localIntent, paramInt2);
    GMTrace.o(20272111419392L, 151039);
  }
  
  public final b.b bAq()
  {
    GMTrace.i(20272514072576L, 151042);
    com.tencent.mm.plugin.walletlock.b.d locald = com.tencent.mm.plugin.walletlock.b.d.bAY();
    GMTrace.o(20272514072576L, 151042);
    return locald;
  }
  
  public final boolean bAr()
  {
    GMTrace.i(20272648290304L, 151043);
    g localg = g.rza;
    boolean bool = g.bAv();
    GMTrace.o(20272648290304L, 151043);
    return bool;
  }
  
  public final boolean bAs()
  {
    GMTrace.i(20272782508032L, 151044);
    GMTrace.o(20272782508032L, 151044);
    return false;
  }
  
  public final void h(Activity paramActivity, int paramInt)
  {
    GMTrace.i(20271977201664L, 151038);
    if (paramInt != 2)
    {
      GMTrace.o(20271977201664L, 151038);
      return;
    }
    if (!h.xu().g(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      w.d("MicroMsg.FingerprintLockImpl", "Plugin gesture is not installed.");
      GMTrace.o(20271977201664L, 151038);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("action", "action.verify_paypwd");
    localIntent.putExtra("next_action", "next_action.switch_on_pattern");
    localIntent.putExtra("key_wallet_lock_type", 2);
    com.tencent.mm.bj.d.b(paramActivity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", localIntent);
    GMTrace.o(20271977201664L, 151038);
  }
  
  public final void i(Activity paramActivity, int paramInt)
  {
    GMTrace.i(20272379854848L, 151041);
    GMTrace.o(20272379854848L, 151041);
  }
  
  public final void init()
  {
    GMTrace.i(20271574548480L, 151035);
    g localg = g.rza;
    g.jh(true);
    g.rza.xh(2);
    GMTrace.o(20271574548480L, 151035);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\walletlock\fingerprint\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */