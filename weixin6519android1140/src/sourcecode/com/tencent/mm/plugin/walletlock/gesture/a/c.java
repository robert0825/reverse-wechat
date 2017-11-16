package com.tencent.mm.plugin.walletlock.gesture.a;

import android.app.Activity;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.so;
import com.tencent.mm.g.a.so.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.walletlock.a.b.a;
import com.tencent.mm.plugin.walletlock.a.b.b;
import com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends com.tencent.mm.plugin.walletlock.b.a
{
  public c()
  {
    GMTrace.i(20238556987392L, 150789);
    GMTrace.o(20238556987392L, 150789);
  }
  
  public final void L(Activity paramActivity)
  {
    GMTrace.i(20239362293760L, 150795);
    if (!h.xu().g(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      w.d("MicroMsg.GestureImpl", "Plugin gesture is not installed.");
      GMTrace.o(20239362293760L, 150795);
      return;
    }
    if (!b.bAG())
    {
      w.d("MicroMsg.GestureImpl", "try to enter modify gesture password process while gesture password has been switched off.");
      GMTrace.o(20239362293760L, 150795);
      return;
    }
    Intent localIntent = new Intent(paramActivity, GestureGuardLogicUI.class);
    localIntent.addFlags(131072);
    localIntent.putExtra("action", "action.verify_pattern");
    localIntent.putExtra("next_action", "next_action.modify_pattern");
    localIntent.setPackage(ab.getPackageName());
    paramActivity.startActivity(localIntent);
    GMTrace.o(20239362293760L, 150795);
  }
  
  public final void a(Activity paramActivity, b.b paramb)
  {
    GMTrace.i(20238825422848L, 150791);
    if (!h.xu().g(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      w.d("MicroMsg.GestureImpl", "Plugin gesture is not installed.");
      GMTrace.o(20238825422848L, 150791);
      return;
    }
    if ((paramb != null) && (!paramb.M(paramActivity)))
    {
      w.d("MicroMsg.GestureImpl", "protectMeOnCreate: still in filter range, do not activate protection.");
      GMTrace.o(20238825422848L, 150791);
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
      GMTrace.o(20238825422848L, 150791);
      return;
      paramActivity.finish();
      paramb = new Intent(paramActivity, GestureGuardLogicUI.class);
      paramb.addFlags(131072);
      paramb.putExtra("action", "action.verify_pattern");
      paramb.putExtra("next_action", "next_action.goto_protected_page");
      paramb.putExtra("page_intent", paramActivity.getIntent());
      paramb.putExtra("scene", N(paramActivity));
      paramb.setPackage(ab.getPackageName());
      paramActivity.startActivity(paramb);
      com.tencent.mm.plugin.report.service.g.ork.i(12097, new Object[] { Integer.valueOf(8), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
    }
  }
  
  public final void a(Activity paramActivity, b.b paramb, b.a parama)
  {
    GMTrace.i(20238959640576L, 150792);
    if (!h.xu().g(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      w.d("MicroMsg.GestureImpl", "Plugin gesture is not installed.");
      GMTrace.o(20238959640576L, 150792);
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
      GMTrace.o(20238959640576L, 150792);
      return;
      if ((paramb == null) || (paramb.M(paramActivity)))
      {
        paramb = new Intent(paramActivity, GestureGuardLogicUI.class);
        paramb.addFlags(131072);
        paramb.putExtra("action", "action.verify_pattern");
        paramb.putExtra("next_action", "next_action.goto_protected_page");
        paramb.putExtra("page_intent", paramActivity.getIntent());
        paramb.putExtra("scene", N(paramActivity));
        paramb.setPackage(ab.getPackageName());
        paramActivity.startActivity(paramb);
        GMTrace.o(20238959640576L, 150792);
        return;
      }
      w.d("MicroMsg.GestureImpl", "protectMeOnResume: still in filter range, do not activate protection.");
    }
  }
  
  public final void b(Activity paramActivity, int paramInt1, int paramInt2)
  {
    GMTrace.i(20239228076032L, 150794);
    if (paramInt1 != 1)
    {
      GMTrace.o(20239228076032L, 150794);
      return;
    }
    if (!h.xu().g(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      w.d("MicroMsg.GestureImpl", "Plugin gesture is not installed.");
      GMTrace.o(20239228076032L, 150794);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("action", "action.verify_paypwd");
    localIntent.putExtra("next_action", "next_action.switch_on_pattern");
    localIntent.putExtra("key_wallet_lock_type", 1);
    d.b(paramActivity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", localIntent, paramInt2);
    GMTrace.o(20239228076032L, 150794);
  }
  
  public final boolean bAr()
  {
    GMTrace.i(20239630729216L, 150797);
    boolean bool = b.bAG();
    GMTrace.o(20239630729216L, 150797);
    return bool;
  }
  
  public final boolean bAs()
  {
    GMTrace.i(20239764946944L, 150798);
    boolean bool = b.bAH();
    GMTrace.o(20239764946944L, 150798);
    return bool;
  }
  
  public final void h(Activity paramActivity, int paramInt)
  {
    GMTrace.i(20239093858304L, 150793);
    if (paramInt != 1)
    {
      GMTrace.o(20239093858304L, 150793);
      return;
    }
    if (!h.xu().g(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      w.d("MicroMsg.GestureImpl", "Plugin gesture is not installed.");
      GMTrace.o(20239093858304L, 150793);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("action", "action.verify_paypwd");
    localIntent.putExtra("next_action", "next_action.switch_on_pattern");
    localIntent.putExtra("key_wallet_lock_type", 1);
    d.b(paramActivity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", localIntent);
    GMTrace.o(20239093858304L, 150793);
  }
  
  public final void i(Activity paramActivity, int paramInt)
  {
    GMTrace.i(20239496511488L, 150796);
    if (!h.xu().g(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      w.d("MicroMsg.GestureImpl", "Plugin gesture is not installed.");
      GMTrace.o(20239496511488L, 150796);
      return;
    }
    if (!b.bAG())
    {
      w.d("MicroMsg.GestureImpl", "try to enter close gesture password process while gesture password has been switched off.");
      GMTrace.o(20239496511488L, 150796);
      return;
    }
    Intent localIntent = new Intent(paramActivity, GestureGuardLogicUI.class);
    localIntent.addFlags(131072);
    localIntent.putExtra("action", "action.verify_pattern");
    localIntent.putExtra("next_action", "next_action.switch_off_pattern");
    localIntent.setPackage(ab.getPackageName());
    paramActivity.startActivity(localIntent);
    GMTrace.o(20239496511488L, 150796);
  }
  
  public final void init()
  {
    GMTrace.i(20238691205120L, 150790);
    w.e("MicroMsg.GestureImpl", "alvinluo gestureimpl init");
    com.tencent.mm.plugin.walletlock.b.g localg = com.tencent.mm.plugin.walletlock.b.g.rza;
    com.tencent.mm.plugin.walletlock.b.g.jg(true);
    com.tencent.mm.plugin.walletlock.b.g.rza.xh(1);
    GMTrace.o(20238691205120L, 150790);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\walletlock\gesture\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */