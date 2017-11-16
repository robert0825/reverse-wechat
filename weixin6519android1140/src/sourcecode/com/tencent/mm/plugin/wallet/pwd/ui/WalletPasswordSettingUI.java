package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.bp;
import com.tencent.mm.g.a.bp.a;
import com.tencent.mm.g.a.sl;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.y;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.l;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ae.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.wallet_core.ui.g;
import com.tencent.mm.y.q;

@com.tencent.mm.ui.base.a(19)
public class WalletPasswordSettingUI
  extends MMPreference
  implements com.tencent.mm.ad.e
{
  private boolean fUQ;
  private ae handler;
  private f htU;
  private Dialog hul;
  com.tencent.mm.sdk.b.c qWZ;
  CheckBoxPreference rbl;
  private IconPreference rbm;
  private Preference rbn;
  private String rbo;
  private String rbp;
  private String rbq;
  private y rbr;
  private boolean rbs;
  private int rbt;
  
  public WalletPasswordSettingUI()
  {
    GMTrace.i(7746913042432L, 57719);
    this.rbs = false;
    this.rbt = 0;
    this.handler = new ae(new ae.a()
    {
      public final boolean handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7760469032960L, 57820);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(7760469032960L, 57820);
          return false;
          WalletPasswordSettingUI.a(WalletPasswordSettingUI.this);
          continue;
          WalletPasswordSettingUI.b(WalletPasswordSettingUI.this);
        }
      }
    });
    this.qWZ = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(7746913042432L, 57719);
  }
  
  private void bxQ()
  {
    GMTrace.i(19544248680448L, 145616);
    com.tencent.mm.kernel.h.xz();
    String str1 = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzt, "");
    com.tencent.mm.kernel.h.xz();
    String str2 = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzu, "");
    w.i("MicroMsg.WalletPasswordSettingUI", "updateUnRegPref unreg_title %s unreg_url %s", new Object[] { str1, str2 });
    if ((!bg.nm(str1)) && (!bg.nm(str2)))
    {
      this.htU.bc("wallet_password_setting_un_reg", false);
      GMTrace.o(19544248680448L, 145616);
      return;
    }
    this.htU.bc("wallet_password_setting_un_reg", true);
    GMTrace.o(19544248680448L, 145616);
  }
  
  private void ec(String paramString1, String paramString2)
  {
    GMTrace.i(7747315695616L, 57722);
    this.rbm.setTitle(paramString1);
    if (!bg.nm(paramString2))
    {
      this.htU.bc("wallet_open_auto_pay", false);
      GMTrace.o(7747315695616L, 57722);
      return;
    }
    this.htU.bc("wallet_open_auto_pay", true);
    w.e("MicroMsg.WalletPasswordSettingUI", "deduct_url is null");
    GMTrace.o(7747315695616L, 57722);
  }
  
  private void iQ(boolean paramBoolean)
  {
    GMTrace.i(7748121001984L, 57728);
    this.ghC.edit().putBoolean("wallet_fingerprint_switch", paramBoolean).commit();
    this.rbl.sdM = paramBoolean;
    this.htU.notifyDataSetChanged();
    GMTrace.o(7748121001984L, 57728);
  }
  
  private void iR(boolean paramBoolean)
  {
    GMTrace.i(7748523655168L, 57731);
    com.tencent.mm.plugin.wallet.pwd.a.c localc = new com.tencent.mm.plugin.wallet.pwd.a.c();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(localc, 0);
    this.rbs = true;
    if (paramBoolean) {
      this.hul = g.a(this, false, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(7765837742080L, 57860);
          if (WalletPasswordSettingUI.g(WalletPasswordSettingUI.this) != null) {
            WalletPasswordSettingUI.g(WalletPasswordSettingUI.this).dismiss();
          }
          GMTrace.o(7765837742080L, 57860);
        }
      });
    }
    GMTrace.o(7748523655168L, 57731);
  }
  
  protected final void MP()
  {
    GMTrace.i(7747584131072L, 57724);
    if (q.zR()) {}
    for (String str = getString(a.i.teb);; str = getString(a.i.tea))
    {
      sq(str);
      com.tencent.mm.wallet_core.ui.e.cms();
      this.htU = this.wky;
      this.htU.addPreferencesFromResource(bxR());
      this.rbm = ((IconPreference)this.htU.VG("wallet_open_auto_pay"));
      this.rbn = this.htU.VG("wallet_delay_transfer_date");
      com.tencent.mm.kernel.h.xz();
      if (!((Boolean)com.tencent.mm.kernel.h.xy().xh().get(w.a.vtY, Boolean.valueOf(false))).booleanValue())
      {
        this.rbm.cT("new", a.e.bbl);
        this.rbm.Cl(0);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vtY, Boolean.valueOf(true));
      }
      this.rbl = ((CheckBoxPreference)this.htU.VG("wallet_fingerprint_switch"));
      bxU();
      this.htU.bc("nfc_idpay", true);
      this.htU.bc("wallet_open_auto_pay", true);
      bxQ();
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7758858420224L, 57808);
          WalletPasswordSettingUI.this.finish();
          GMTrace.o(7758858420224L, 57808);
          return true;
        }
      });
      GMTrace.o(7747584131072L, 57724);
      return;
    }
  }
  
  public final int QI()
  {
    GMTrace.i(7747047260160L, 57720);
    GMTrace.o(7747047260160L, 57720);
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(7748657872896L, 57732);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.wallet.pwd.a.c))
      {
        bxU();
        paramString = (com.tencent.mm.plugin.wallet.pwd.a.c)paramk;
        w.i("MicroMsg.WalletPasswordSettingUI", "isShowDeduct=" + paramString.rax);
        this.rbp = paramString.raB;
        if (paramString.rax == 1)
        {
          this.rbo = paramString.ray;
          ec(bg.aq(paramString.raA, getString(a.i.tex)), paramString.ray);
        }
        for (;;)
        {
          bxQ();
          if (this.hul != null) {
            this.hul.dismiss();
          }
          GMTrace.o(7748657872896L, 57732);
          return;
          this.htU.bc("wallet_open_auto_pay", true);
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.t))
      {
        this.rbq = ((com.tencent.mm.plugin.wallet_core.c.t)paramk).rcG;
        this.rbt = ((com.tencent.mm.plugin.wallet_core.c.t)paramk).rcL;
        if (this.rbt == 0)
        {
          this.htU.bc("wallet_delay_transfer_date", true);
          GMTrace.o(7748657872896L, 57732);
          return;
        }
        if (!bg.nm(this.rbq)) {
          this.rbn.setTitle(this.rbq);
        }
        for (;;)
        {
          this.htU.bc("wallet_delay_transfer_date", false);
          GMTrace.o(7748657872896L, 57732);
          return;
          w.i("MicroMsg.WalletPasswordSettingUI", "use hardcode wording");
        }
      }
    }
    else if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.t))
    {
      w.i("MicroMsg.WalletPasswordSettingUI", "net error, use hardcode wording");
    }
    GMTrace.o(7748657872896L, 57732);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(7748255219712L, 57729);
    if ("wallet_modify_password".equals(paramPreference.hiu))
    {
      bxS();
      com.tencent.mm.wallet_core.ui.e.EQ(24);
      GMTrace.o(7748255219712L, 57729);
      return true;
    }
    if ("wallet_forget_password".equals(paramPreference.hiu))
    {
      bxT();
      com.tencent.mm.wallet_core.ui.e.EQ(25);
      GMTrace.o(7748255219712L, 57729);
      return true;
    }
    if ("wallet_realname_verify".equals(paramPreference.hiu))
    {
      if (com.tencent.mm.plugin.wallet_core.model.n.byx().byS()) {
        if (!bg.nm(this.rbp))
        {
          w.i("MicroMsg.WalletPasswordSettingUI", "jump to mRealnameUrl");
          paramf = new Intent();
          paramf.putExtra("rawUrl", this.rbp);
          paramf.putExtra("showShare", false);
          d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
        }
      }
      for (;;)
      {
        GMTrace.o(7748255219712L, 57729);
        return true;
        w.e("MicroMsg.WalletPasswordSettingUI", "mRealnameUrl is null");
        continue;
        w.i("MicroMsg.WalletPasswordSettingUI", "go to RealNameVerifyProcess");
        paramf = new Bundle();
        paramf.putInt("real_name_verify_mode", 0);
        paramf.putString("realname_verify_process_jump_plugin", "wallet");
        paramf.putString("realname_verify_process_jump_activity", ".pwd.ui.WalletPasswordSettingUI");
        com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet_core.id_verify.a.class, paramf);
      }
    }
    if ("wallet_fingerprint_switch".equals(paramPreference.hiu))
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vrv, Boolean.valueOf(true));
      if (this.rbl.isChecked()) {
        if (this.fUQ)
        {
          com.tencent.mm.plugin.soter.c.a.vK(2);
          paramf = (com.tencent.mm.pluginsdk.k)com.tencent.mm.kernel.h.h(com.tencent.mm.pluginsdk.k.class);
          if ((paramf == null) || (!paramf.azu())) {
            break label350;
          }
          paramf = new Bundle();
          paramf.putInt("open_scene", 1);
          com.tencent.mm.wallet_core.a.b(this, "FingerprintAuth", paramf);
        }
      }
      for (;;)
      {
        GMTrace.o(7748255219712L, 57729);
        return true;
        com.tencent.mm.plugin.soter.c.a.vK(1);
        break;
        label350:
        this.handler.obtainMessage(2).sendToTarget();
        continue;
        this.handler.obtainMessage(1).sendToTarget();
      }
    }
    if ("wallet_open_auto_pay".equals(paramPreference.hiu))
    {
      if (!bg.nm(this.rbo))
      {
        w.i("MicroMsg.WalletPasswordSettingUI", "mDeductUrl is not null,jump!");
        paramf = new Intent();
        paramf.putExtra("rawUrl", this.rbo);
        paramf.putExtra("showShare", false);
        d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
        this.rbm.Cl(8);
        GMTrace.o(7748255219712L, 57729);
        return true;
      }
      w.e("MicroMsg.WalletPasswordSettingUI", "mDeductUrl is null");
    }
    if ("wallet_digitalcert".equals(paramPreference.hiu))
    {
      if (!this.rbs)
      {
        paramf = new com.tencent.mm.plugin.wallet.pwd.a.c();
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(paramf, 0);
      }
      d.b(this, "wallet", ".pwd.ui.WalletDigitalCertUI", new Intent());
      GMTrace.o(7748255219712L, 57729);
      return true;
    }
    if ("wallet_delay_transfer_date".equals(paramPreference.hiu))
    {
      startActivity(new Intent(this, WalletDelayTransferSettingUI.class));
      GMTrace.o(7748255219712L, 57729);
      return true;
    }
    if ("wallet_password_setting_un_reg".equals(paramPreference.hiu))
    {
      com.tencent.mm.kernel.h.xz();
      paramf = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzu, "");
      paramPreference = new Intent();
      paramPreference.putExtra("rawUrl", paramf);
      paramPreference.putExtra("showShare", false);
      d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
    }
    GMTrace.o(7748255219712L, 57729);
    return false;
  }
  
  public int bxR()
  {
    GMTrace.i(7747718348800L, 57725);
    int i = a.l.tkb;
    GMTrace.o(7747718348800L, 57725);
    return i;
  }
  
  public void bxS()
  {
    GMTrace.i(7747852566528L, 57726);
    com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.pwd.b.class, null, null);
    GMTrace.o(7747852566528L, 57726);
  }
  
  public void bxT()
  {
    GMTrace.i(7747986784256L, 57727);
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("key_is_paymanager", true);
    com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.pwd.a.class, localBundle, null);
    GMTrace.o(7747986784256L, 57727);
  }
  
  public void bxU()
  {
    GMTrace.i(7748389437440L, 57730);
    label175:
    Object localObject;
    if ((com.tencent.mm.plugin.wallet_core.model.n.byx().byP()) || (com.tencent.mm.plugin.wallet_core.model.n.byx().byT()))
    {
      this.htU.bc("wallet_modify_password", true);
      this.htU.bc("wallet_forget_password", true);
      this.htU.bc("wallet_fingerprint_switch", true);
      this.htU.bc("wallet_realname_verify", false);
      this.htU.VG("wallet_realname_verify").setSummary(a.i.tdV);
      this.htU.bc("wallet_digitalcert", true);
      if (!d.LL("fingerprint")) {
        break label523;
      }
      if (!com.tencent.mm.plugin.wallet.b.a.bxV()) {
        break label507;
      }
      w.i("MicroMsg.WalletPasswordSettingUI", "isSupportFingeprint is true");
      p.bxd();
      if ((p.bxe() == null) || (!((com.tencent.mm.pluginsdk.k)com.tencent.mm.kernel.h.h(com.tencent.mm.pluginsdk.k.class)).azt())) {
        break label476;
      }
      this.rbl.sdM = true;
      this.rbl.wlc = false;
      this.rbl.setSummary(a.i.tdT);
      this.htU.bc("wallet_fingerprint_switch", false);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vrt, Boolean.valueOf(true));
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vru, Boolean.valueOf(true));
      com.tencent.mm.kernel.h.xz();
      localObject = com.tencent.mm.kernel.h.xy().xh().get(w.a.vrv, Boolean.valueOf(false));
      if (localObject == null) {
        break label564;
      }
    }
    label303:
    label476:
    label507:
    label523:
    label547:
    label564:
    for (boolean bool = ((Boolean)localObject).booleanValue();; bool = false)
    {
      long l;
      int i;
      if (!bool)
      {
        this.rbl.cc(getString(a.i.cTH), a.e.bbl);
        this.rbl.wO(0);
        com.tencent.mm.kernel.h.xz();
        l = ((Long)com.tencent.mm.kernel.h.xy().xh().get(147457, Long.valueOf(0L))).longValue();
        i = a.i.tbt;
        if ((0x10 & l) == 0L) {
          break label547;
        }
        i = a.i.tbs;
      }
      for (;;)
      {
        this.htU.VG("wallet_delay_transfer_date").setSummary(i);
        this.htU.notifyDataSetChanged();
        GMTrace.o(7748389437440L, 57730);
        return;
        if (com.tencent.mm.plugin.wallet_core.model.n.byx().byS())
        {
          this.htU.bc("wallet_modify_password", false);
          this.htU.bc("wallet_forget_password", false);
          this.htU.bc("wallet_fingerprint_switch", false);
          this.htU.bc("wallet_realname_verify", false);
          this.htU.VG("wallet_realname_verify").setSummary(a.i.tdX);
          break;
        }
        w.e("MicroMsg.WalletPasswordSettingUI", "unknow reg state");
        break;
        this.rbl.sdM = false;
        this.rbl.wlc = false;
        break label175;
        this.rbl.wO(8);
        break label303;
        this.htU.bc("wallet_fingerprint_switch", true);
        break label303;
        w.e("MicroMsg.WalletPasswordSettingUI", "plugin fingerprinthad not been installed");
        this.htU.bc("wallet_fingerprint_switch", true);
        break label303;
        if ((l & 0x20) != 0L) {
          i = a.i.tbr;
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7747181477888L, 57721);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(385, this);
    com.tencent.mm.sdk.b.a.vgX.b(this.qWZ);
    this.fUQ = getIntent().getBooleanExtra("key_is_from_system", false);
    if (this.fUQ)
    {
      w.i("MicroMsg.WalletPasswordSettingUI", "hy: enter password setting from system setting");
      ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class)).a(this, null);
    }
    MP();
    label174:
    Cursor localCursor;
    if (com.tencent.mm.plugin.wallet.pwd.a.c.brk())
    {
      iR(false);
      com.tencent.mm.kernel.h.xz();
      this.rbt = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vwg, Integer.valueOf(0))).intValue();
      com.tencent.mm.kernel.h.xz();
      this.rbq = ((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vwb, ""));
      if (bg.nm(this.rbq))
      {
        com.tencent.mm.plugin.wallet_core.c.t.a(true, null);
        if (this.rbt == 0) {
          this.htU.bc("wallet_delay_transfer_date", true);
        }
        GMTrace.o(7747181477888L, 57721);
      }
    }
    else
    {
      com.tencent.mm.kernel.h.xz();
      this.rbp = ((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vuh, ""));
      paramBundle = com.tencent.mm.plugin.wallet_core.model.n.byw();
      if (!bg.nm("wallet_open_auto_pay"))
      {
        localCursor = paramBundle.fTZ.a("select * from WalletPrefInfo where pref_key=?", new String[] { "wallet_open_auto_pay" }, 2);
        if (localCursor != null)
        {
          if (!localCursor.moveToFirst()) {
            break label467;
          }
          paramBundle = new y();
          paramBundle.b(localCursor);
        }
      }
    }
    for (;;)
    {
      localCursor.close();
      for (;;)
      {
        this.rbr = paramBundle;
        if ((this.rbr == null) || (this.rbr.field_is_show != 1) || (bg.nm(this.rbr.field_pref_url))) {
          break label379;
        }
        w.i("MicroMsg.WalletPasswordSettingUI", "deduct info from cache is not null");
        this.rbo = this.rbr.field_pref_url;
        ec(this.rbr.field_pref_title, this.rbr.field_pref_url);
        break;
        paramBundle = null;
      }
      label379:
      if (this.rbr == null)
      {
        w.i("MicroMsg.WalletPasswordSettingUI", "deduct info from cache is null");
        break;
      }
      w.i("MicroMsg.WalletPasswordSettingUI", "mOpenAutoPayPrefInfo.field_is_show = " + this.rbr.field_is_show + " and mOpenAutoPayPrefInfo.field_pref_url is null?" + bg.nm(this.rbr.field_pref_url));
      break;
      this.rbn.setTitle(this.rbq);
      com.tencent.mm.plugin.wallet_core.c.t.a(false, null);
      break label174;
      label467:
      paramBundle = null;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7748792090624L, 57733);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.vgX.c(this.qWZ);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(385, this);
    GMTrace.o(7748792090624L, 57733);
  }
  
  protected void onResume()
  {
    GMTrace.i(7747449913344L, 57723);
    super.onResume();
    if (((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class)).bAs())
    {
      finish();
      GMTrace.o(7747449913344L, 57723);
      return;
    }
    bxU();
    GMTrace.o(7747449913344L, 57723);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pwd\ui\WalletPasswordSettingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */