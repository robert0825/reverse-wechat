package com.tencent.mm.plugin.walletlock.b;

import android.app.Activity;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.walletlock.a.b.a;
import com.tencent.mm.plugin.walletlock.a.b.b;
import com.tencent.mm.plugin.walletlock.gesture.a.c;
import com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI;
import com.tencent.mm.sdk.platformtools.w;

public class a
  implements com.tencent.mm.plugin.walletlock.a.b
{
  public a()
  {
    GMTrace.i(20247683792896L, 150857);
    GMTrace.o(20247683792896L, 150857);
  }
  
  public static int N(Activity paramActivity)
  {
    GMTrace.i(20979573063680L, 156310);
    w.i("MicroMsg.BaseWalletLockImpl", "alvinluo activity %s", new Object[] { paramActivity.getClass().getSimpleName() });
    if (paramActivity.getClass().getSimpleName().equals("MallIndexUI"))
    {
      GMTrace.o(20979573063680L, 156310);
      return 1;
    }
    if (paramActivity.getClass().getSimpleName().equals("WalletOfflineCoinPurseUI"))
    {
      GMTrace.o(20979573063680L, 156310);
      return 2;
    }
    GMTrace.o(20979573063680L, 156310);
    return -1;
  }
  
  public void L(Activity paramActivity)
  {
    GMTrace.i(20248489099264L, 150863);
    GMTrace.o(20248489099264L, 150863);
  }
  
  public void a(Activity paramActivity, b.b paramb)
  {
    GMTrace.i(20247952228352L, 150859);
    GMTrace.o(20247952228352L, 150859);
  }
  
  public void a(Activity paramActivity, b.b paramb, b.a parama)
  {
    GMTrace.i(20248086446080L, 150860);
    GMTrace.o(20248086446080L, 150860);
  }
  
  public void b(Activity paramActivity, int paramInt1, int paramInt2)
  {
    GMTrace.i(20248354881536L, 150862);
    w.i("MicroMsg.BaseWalletLockImpl", "alvinluo enterNewWalletLockProcessForResult walletLockType: %d, requestCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1)
    {
      new c().b(paramActivity, paramInt1, paramInt2);
      GMTrace.o(20248354881536L, 150862);
      return;
    }
    if (paramInt1 == 2) {
      new com.tencent.mm.plugin.walletlock.fingerprint.a.b().b(paramActivity, paramInt1, paramInt2);
    }
    GMTrace.o(20248354881536L, 150862);
  }
  
  public void b(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    GMTrace.i(20249294405632L, 150869);
    paramIntent.setClass(paramActivity, WalletLockSettingUI.class);
    paramActivity.startActivityForResult(paramIntent, paramInt);
    GMTrace.o(20249294405632L, 150869);
  }
  
  public b.b bAq()
  {
    GMTrace.i(20248757534720L, 150865);
    GMTrace.o(20248757534720L, 150865);
    return null;
  }
  
  public boolean bAr()
  {
    GMTrace.i(20248891752448L, 150866);
    GMTrace.o(20248891752448L, 150866);
    return false;
  }
  
  public boolean bAs()
  {
    GMTrace.i(20249025970176L, 150867);
    GMTrace.o(20249025970176L, 150867);
    return false;
  }
  
  public void c(Activity paramActivity, Intent paramIntent)
  {
    GMTrace.i(20249160187904L, 150868);
    paramIntent.setClass(paramActivity, WalletLockSettingUI.class);
    paramActivity.startActivity(paramIntent);
    GMTrace.o(20249160187904L, 150868);
  }
  
  public void h(Activity paramActivity, int paramInt)
  {
    GMTrace.i(20248220663808L, 150861);
    w.i("MicroMsg.BaseWalletLockImpl", "alvinluo enterNewWalletLockProcess walletLockType: %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt == 1)
    {
      new c().h(paramActivity, paramInt);
      GMTrace.o(20248220663808L, 150861);
      return;
    }
    if (paramInt == 2) {
      new com.tencent.mm.plugin.walletlock.fingerprint.a.b().h(paramActivity, paramInt);
    }
    GMTrace.o(20248220663808L, 150861);
  }
  
  public void i(Activity paramActivity, int paramInt)
  {
    GMTrace.i(20248623316992L, 150864);
    GMTrace.o(20248623316992L, 150864);
  }
  
  public void init()
  {
    GMTrace.i(20247818010624L, 150858);
    g.rza.xh(0);
    GMTrace.o(20247818010624L, 150858);
  }
  
  public void xc(int paramInt)
  {
    GMTrace.i(20249428623360L, 150870);
    GMTrace.o(20249428623360L, 150870);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\walletlock\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */