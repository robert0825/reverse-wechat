package com.tencent.mm.plugin.fingerprint.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;

public class a
  extends b
{
  public a()
  {
    GMTrace.i(10765738180608L, 80211);
    GMTrace.o(10765738180608L, 80211);
  }
  
  public final b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(10765872398336L, 80212);
    w.i("MicroMsg.FingerPrintAuthProcess", "FingerPrintAuthProcess start,forward to WalletCheckPwdUI");
    c(paramActivity, WalletCheckPwdUI.class, paramBundle);
    GMTrace.o(10765872398336L, 80212);
    return this;
  }
  
  public final d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(10766677704704L, 80218);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(10754463891456L, 80127);
          GMTrace.o(10754463891456L, 80127);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(10754329673728L, 80126);
          paramAnonymousVarArgs = (String)paramAnonymousVarArgs[0];
          a.a(a.this).putString("pwd", paramAnonymousVarArgs);
          w.i("MicroMsg.FingerPrintAuthProcess", "this is onNext");
          GMTrace.o(10754329673728L, 80126);
          return false;
        }
      };
      GMTrace.o(10766677704704L, 80218);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(10766677704704L, 80218);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(10766006616064L, 80213);
    if ((paramActivity instanceof WalletCheckPwdUI))
    {
      w.i("MicroMsg.FingerPrintAuthProcess", "forward to FingerPrintAuthUI");
      c(paramActivity, FingerPrintAuthUI.class, paramBundle);
      GMTrace.o(10766006616064L, 80213);
      return;
    }
    if ((paramActivity instanceof FingerPrintAuthUI)) {
      b(paramActivity, paramBundle);
    }
    GMTrace.o(10766006616064L, 80213);
  }
  
  public final String aAd()
  {
    GMTrace.i(10766543486976L, 80217);
    GMTrace.o(10766543486976L, 80217);
    return "FingerprintAuth";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(10766275051520L, 80215);
    paramBundle = new Intent();
    w.i("MicroMsg.FingerPrintAuthProcess", "FingerPrintAuthProcess end");
    a(paramActivity, "wallet", ".pwd.ui.WalletPasswordSettingUI", 0, paramBundle, true);
    GMTrace.o(10766275051520L, 80215);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(10766140833792L, 80214);
    b(paramActivity, new Bundle());
    GMTrace.o(10766140833792L, 80214);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(10766409269248L, 80216);
    GMTrace.o(10766409269248L, 80216);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */