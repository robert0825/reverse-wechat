package com.tencent.mm.plugin.walletlock.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.walletlock.a.f;
import com.tencent.mm.plugin.walletlock.a.g;
import com.tencent.mm.plugin.walletlock.a.i;
import com.tencent.mm.plugin.walletlock.a.b;
import com.tencent.mm.plugin.walletlock.b.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class WalletLockSettingUI
  extends MMPreference
{
  private int gRb;
  private i hiJ;
  private f htU;
  private IconPreference rzk;
  private IconPreference rzl;
  private IconPreference rzm;
  private boolean rzn;
  private boolean rzo;
  private boolean rzp;
  
  public WalletLockSettingUI()
  {
    GMTrace.i(20217082150912L, 150629);
    this.gRb = -1;
    this.rzn = false;
    this.rzo = true;
    this.rzp = true;
    GMTrace.o(20217082150912L, 150629);
  }
  
  private void a(Preference paramPreference, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(20218424328192L, 150639);
    if ((paramPreference instanceof IconPreference))
    {
      paramPreference = (IconPreference)paramPreference;
      paramPreference.et(com.tencent.mm.br.a.fromDPToPix(this, 20), com.tencent.mm.br.a.fromDPToPix(this, 20));
      if (paramBoolean1)
      {
        if (paramBoolean2) {
          paramPreference.Cn(a.f.cOv);
        }
        for (;;)
        {
          paramPreference.Co(0);
          GMTrace.o(20218424328192L, 150639);
          return;
          paramPreference.Cn(a.f.rvZ);
        }
      }
      paramPreference.Cn(a.f.cOu);
      paramPreference.Co(0);
    }
    GMTrace.o(20218424328192L, 150639);
  }
  
  private void bBk()
  {
    GMTrace.i(20218155892736L, 150637);
    bBl();
    w.i("MicroMsg.WalletLockSettingUI", "alvinluo current wallet lock type: %d", new Object[] { Integer.valueOf(g.rza.bBa()) });
    g localg = g.rza;
    if (!g.bBc())
    {
      w.w("MicroMsg.WalletLockSettingUI", "alvinluo FingerprintLock entry is not opened and don't show FingerprintLock entry");
      this.htU.bc("wallet_lock_fingerprint", true);
      localg = g.rza;
      w.i("MicroMsg.WalletLockSettingUI", "alvinluo isUserSetGesturePwd: %b", new Object[] { Boolean.valueOf(g.bAG()) });
      if ((g.rza.bBa() == 2) || (g.rza.bBa() != 1)) {
        break label333;
      }
      if (this.rzo)
      {
        a(this.rzl, true, true);
        this.htU.bc("wallet_lock_modify_gesture", false);
      }
    }
    for (;;)
    {
      if (g.rza.bBa() != 0) {
        break label358;
      }
      if (!this.rzo) {
        break label368;
      }
      a(this.rzm, true, true);
      GMTrace.o(20218155892736L, 150637);
      return;
      boolean bool = com.tencent.mm.plugin.soter.c.h.bqF();
      localg = g.rza;
      if (g.bAv())
      {
        if (!bool)
        {
          this.htU.bc("wallet_lock_fingerprint", false);
          this.rzk.VJ(getString(a.g.rwE));
          this.rzk.caX();
          a(this.rzk, true, false);
          this.rzk.setEnabled(false);
          this.rzk.wkd = true;
          this.rzp = false;
          break;
        }
        if (!this.rzo) {
          break;
        }
        this.htU.bc("wallet_lock_fingerprint", false);
        a(this.rzk, true, true);
        break;
      }
      if (!bool)
      {
        this.htU.bc("wallet_lock_fingerprint", true);
        break;
      }
      this.htU.bc("wallet_lock_fingerprint", false);
      a(this.rzk, false, true);
      break;
      label333:
      a(this.rzl, false, true);
      this.htU.bc("wallet_lock_modify_gesture", true);
    }
    label358:
    a(this.rzm, false, true);
    label368:
    GMTrace.o(20218155892736L, 150637);
  }
  
  private void bBl()
  {
    GMTrace.i(20218290110464L, 150638);
    if ((this.rzk != null) && (this.rzp)) {
      a(this.rzk, false, this.rzp);
    }
    if (this.rzl != null) {
      a(this.rzl, false, true);
    }
    if (this.rzm != null) {
      a(this.rzm, false, true);
    }
    GMTrace.o(20218290110464L, 150638);
  }
  
  private void d(int paramInt, Intent paramIntent)
  {
    GMTrace.i(20218021675008L, 150636);
    setResult(paramInt, paramIntent);
    finish();
    GMTrace.o(20218021675008L, 150636);
  }
  
  private void s(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(20217887457280L, 150635);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", paramInt2);
    localIntent.putExtra("key_err_msg", paramString);
    d(paramInt1, localIntent);
    GMTrace.o(20217887457280L, 150635);
  }
  
  private void wr(String paramString)
  {
    GMTrace.i(20218826981376L, 150642);
    this.hiJ = com.tencent.mm.ui.base.h.a(this, paramString, "", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(20216679497728L, 150626);
        GMTrace.o(20216679497728L, 150626);
      }
    });
    this.hiJ.setCanceledOnTouchOutside(false);
    this.hiJ.show();
    GMTrace.o(20218826981376L, 150642);
  }
  
  public final int QI()
  {
    GMTrace.i(20217216368640L, 150630);
    int i = a.i.rxe;
    GMTrace.o(20217216368640L, 150630);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(20218558545920L, 150640);
    if ("wallet_lock_fingerprint".equals(paramPreference.hiu))
    {
      bBl();
      a(paramPreference, true, true);
      if ((this.rzp) && ((!this.rzo) || (g.rza.bBa() != 2)))
      {
        if (com.tencent.d.a.a.hE(this)) {
          break label107;
        }
        this.hiJ = com.tencent.mm.ui.base.h.a(this, getString(a.g.rwQ), "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(20216411062272L, 150624);
            WalletLockSettingUI.b(WalletLockSettingUI.this);
            GMTrace.o(20216411062272L, 150624);
          }
        });
        this.hiJ.setCanceledOnTouchOutside(false);
      }
      for (;;)
      {
        GMTrace.o(20218558545920L, 150640);
        return true;
        label107:
        if ((!this.rzo) || (g.rza.bBa() != 2))
        {
          w.i("MicroMsg.WalletLockSettingUI", "alvinluo request open fingerprint lock");
          ((b)com.tencent.mm.kernel.h.h(b.class)).b(this, 2, 1);
        }
      }
    }
    if ("wallet_lock_gesture".equals(paramPreference.hiu))
    {
      bBl();
      a(paramPreference, true, true);
      if (g.rza.bBa() != 1)
      {
        w.i("MicroMsg.WalletLockSettingUI", "alvinluo request open gesture lock");
        ((b)com.tencent.mm.kernel.h.h(b.class)).b(this, 1, 2);
      }
      GMTrace.o(20218558545920L, 150640);
      return true;
    }
    if ("wallet_lock_close".equals(paramPreference.hiu))
    {
      bBl();
      a(paramPreference, true, true);
      if (g.rza.bBa() != 0)
      {
        w.i("MicroMsg.WalletLockSettingUI", "alvinluo request close wallet lock");
        ((b)com.tencent.mm.kernel.h.h(b.class)).i(this, 3);
      }
      GMTrace.o(20218558545920L, 150640);
      return true;
    }
    if ("wallet_lock_modify_gesture".equals(paramPreference.hiu))
    {
      ((b)com.tencent.mm.kernel.h.h(b.class)).L(this);
      GMTrace.o(20218558545920L, 150640);
      return true;
    }
    GMTrace.o(20218558545920L, 150640);
    return false;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(20218692763648L, 150641);
    w.i("MicroMsg.WalletLockSettingUI", "alvinluo onActivityResult requestCode: %d, resultCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramIntent == null)
    {
      w.e("MicroMsg.WalletLockSettingUI", "alvinluo data is null");
      GMTrace.o(20218692763648L, 150641);
      return;
    }
    int i = paramIntent.getIntExtra("key_err_code", -1);
    w.i("MicroMsg.WalletLockSettingUI", "alvinluo wallet lock setting onActivityResult errCode: %d", new Object[] { Integer.valueOf(i) });
    if (paramInt1 == 1)
    {
      w.i("MicroMsg.WalletLockSettingUI", "alvinluo request open fingerprint lock onActivityResult");
      if (i == 0)
      {
        if (this.rzn)
        {
          d(paramInt2, paramIntent);
          GMTrace.o(20218692763648L, 150641);
        }
      }
      else if (i != 4)
      {
        w.i("MicroMsg.WalletLockSettingUI", "alvinluo open fingerprint lock failed");
        wr(getString(a.g.rwF));
        GMTrace.o(20218692763648L, 150641);
      }
    }
    else if (paramInt1 == 2)
    {
      w.i("MicroMsg.WalletLockSettingUI", "alvinluo request open gesture onActivityResult");
      if (i == 0)
      {
        if (this.rzn)
        {
          d(paramInt2, paramIntent);
          GMTrace.o(20218692763648L, 150641);
        }
      }
      else if (i != 4)
      {
        w.i("MicroMsg.WalletLockSettingUI", "alvinluo open gesture lock failed");
        wr(getString(a.g.rwO));
        GMTrace.o(20218692763648L, 150641);
      }
    }
    else if (paramInt1 == 3)
    {
      if (i == 0)
      {
        ((b)com.tencent.mm.kernel.h.h(b.class)).xc(0);
        paramIntent = g.rza;
        g.bAx();
        bBk();
        Toast.makeText(this, getString(a.g.rwC), 0).show();
        com.tencent.mm.plugin.walletlock.b.h.bBe();
        if (this.rzn) {
          s(-1, 0, "close wallet lock ok");
        }
        GMTrace.o(20218692763648L, 150641);
        return;
      }
      if (i != 4) {
        wr(getString(a.g.rwD));
      }
    }
    GMTrace.o(20218692763648L, 150641);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(20217753239552L, 150634);
    w.i("MicroMsg.WalletLockSettingUI", "alvinluo onBackPressed");
    if (this.rzn)
    {
      s(0, 4, "user cancel setting wallet lock");
      GMTrace.o(20217753239552L, 150634);
      return;
    }
    finish();
    GMTrace.o(20217753239552L, 150634);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20217350586368L, 150631);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(20216947933184L, 150628);
        if (WalletLockSettingUI.a(WalletLockSettingUI.this)) {
          WalletLockSettingUI.a(WalletLockSettingUI.this, "user cancel setting wallet lock");
        }
        for (;;)
        {
          GMTrace.o(20216947933184L, 150628);
          return false;
          WalletLockSettingUI.this.finish();
        }
      }
    });
    oM(a.g.rwT);
    this.htU = this.wky;
    this.htU = this.wky;
    this.rzk = ((IconPreference)this.htU.VG("wallet_lock_fingerprint"));
    this.rzl = ((IconPreference)this.htU.VG("wallet_lock_gesture"));
    this.rzm = ((IconPreference)this.htU.VG("wallet_lock_close"));
    this.gRb = getIntent().getIntExtra("key_wallet_lock_setting_scene", -1);
    if (this.gRb == 1)
    {
      this.rzn = true;
      this.rzo = false;
    }
    w.i("MicroMsg.WalletLockSettingUI", "alvinluo isNeedFinish: %b, isNeedShowOpenIcon: %b", new Object[] { Boolean.valueOf(this.rzn), Boolean.valueOf(this.rzo) });
    GMTrace.o(20217350586368L, 150631);
  }
  
  protected void onPause()
  {
    GMTrace.i(20217619021824L, 150633);
    super.onPause();
    if ((this.hiJ != null) && (this.hiJ.isShowing())) {
      this.hiJ.dismiss();
    }
    GMTrace.o(20217619021824L, 150633);
  }
  
  protected void onResume()
  {
    GMTrace.i(20217484804096L, 150632);
    super.onResume();
    bBk();
    GMTrace.o(20217484804096L, 150632);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\walletlock\ui\WalletLockSettingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */