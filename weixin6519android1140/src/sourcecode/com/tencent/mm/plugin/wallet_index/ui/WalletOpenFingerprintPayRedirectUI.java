package com.tencent.mm.plugin.wallet_index.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.compatible.d.r;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.wallet.b.a;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.ui.g;

public class WalletOpenFingerprintPayRedirectUI
  extends AutoLoginActivity
  implements e
{
  private boolean GJ;
  private Dialog hul;
  
  public WalletOpenFingerprintPayRedirectUI()
  {
    GMTrace.i(7575919656960L, 56445);
    this.hul = null;
    this.GJ = false;
    GMTrace.o(7575919656960L, 56445);
  }
  
  private void b(int paramInt, boolean paramBoolean, String paramString)
  {
    GMTrace.i(7576724963328L, 56451);
    w.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: redirect to open fingerprint failed. errCode: %d", new Object[] { Integer.valueOf(paramInt) });
    if ((this.hul != null) && (this.hul.isShowing()))
    {
      this.hul.dismiss();
      this.hul = null;
    }
    if (paramBoolean)
    {
      com.tencent.mm.ui.base.h.a(this, paramString, "", false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7582898978816L, 56497);
          WalletOpenFingerprintPayRedirectUI.this.finish();
          GMTrace.o(7582898978816L, 56497);
        }
      });
      GMTrace.o(7576724963328L, 56451);
      return;
    }
    finish();
    GMTrace.o(7576724963328L, 56451);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7576993398784L, 56453);
    if ((paramk instanceof o))
    {
      if (!this.GJ)
      {
        this.GJ = true;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          w.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: bind query ok. start judge.");
          com.tencent.mm.plugin.wallet.a.p.bxd();
          paramString = com.tencent.mm.plugin.wallet.a.p.bxe();
          if ((paramString == null) || (!paramString.byS()))
          {
            w.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: not open wechat payment. hint bind bankcard");
            b(5, true, getString(a.i.tbM));
            GMTrace.o(7576993398784L, 56453);
            return;
          }
          if ((!a.bxV()) || (com.tencent.mm.compatible.d.p.fQG.fQP != 1))
          {
            w.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: not support wechat fp pay or not allow");
            b(6, true, getString(a.i.tbO));
            GMTrace.o(7576993398784L, 56453);
            return;
          }
          paramString = new Intent();
          paramString.putExtra("key_is_from_system", true);
          d.b(this, "wallet", ".pwd.ui.WalletPasswordSettingUI", paramString);
          finish();
          GMTrace.o(7576993398784L, 56453);
          return;
        }
        w.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: bind query failed. inform fail.");
        b(3, true, getString(a.i.sZc));
        GMTrace.o(7576993398784L, 56453);
        return;
      }
      w.w("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: is already handled");
    }
    GMTrace.o(7576993398784L, 56453);
  }
  
  protected final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    GMTrace.i(7576590745600L, 56450);
    w.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "postLogin, loginResult = " + parama);
    switch (3.jjk[parama.ordinal()])
    {
    default: 
      w.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "postLogin, unknown login result = " + parama);
    }
    for (;;)
    {
      b(2, true, getString(a.i.sZc));
      GMTrace.o(7576590745600L, 56450);
      return;
      w.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: login ok.");
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(new o(null, 1), 0);
      if (this.hul != null)
      {
        this.hul.dismiss();
        this.hul = null;
      }
      this.hul = g.e(this, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(7574309044224L, 56433);
          WalletOpenFingerprintPayRedirectUI.a(WalletOpenFingerprintPayRedirectUI.this);
          WalletOpenFingerprintPayRedirectUI.a(WalletOpenFingerprintPayRedirectUI.this, "");
          GMTrace.o(7574309044224L, 56433);
        }
      });
      GMTrace.o(7576590745600L, 56450);
      return;
      w.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "postLogin fail, loginResult = " + parama);
      b(1, false, "");
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7576188092416L, 56447);
    GMTrace.o(7576188092416L, 56447);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7576053874688L, 56446);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(385, this);
    GMTrace.o(7576053874688L, 56446);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7576456527872L, 56449);
    super.onDestroy();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(385, this);
    GMTrace.o(7576456527872L, 56449);
  }
  
  protected void onStop()
  {
    GMTrace.i(7576859181056L, 56452);
    super.onStop();
    if ((this.hul != null) && (this.hul.isShowing()))
    {
      this.hul.dismiss();
      this.hul = null;
    }
    GMTrace.o(7576859181056L, 56452);
  }
  
  protected final boolean y(Intent paramIntent)
  {
    GMTrace.i(7576322310144L, 56448);
    GMTrace.o(7576322310144L, 56448);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_index\ui\WalletOpenFingerprintPayRedirectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */