package com.tencent.mm.plugin.wxcredit.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wxcredit.a.i;
import com.tencent.mm.plugin.wxcredit.a.j;
import com.tencent.mm.plugin.wxcredit.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.wallet_core.ui.WalletPreferenceUI;
import java.util.ArrayList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletWXCreditDetailUI
  extends WalletPreferenceUI
{
  private boolean hasInit;
  private com.tencent.mm.ui.base.preference.f htU;
  private Bankcard qXk;
  private View.OnClickListener slu;
  private com.tencent.mm.wallet_core.b slw;
  private com.tencent.mm.plugin.wxcredit.a.k slx;
  
  public WalletWXCreditDetailUI()
  {
    GMTrace.i(9005070024704L, 67093);
    this.hasInit = false;
    this.slu = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9010572951552L, 67134);
        if (paramAnonymousView.getId() == a.f.sLh)
        {
          if (WalletWXCreditDetailUI.b(WalletWXCreditDetailUI.this) != null)
          {
            com.tencent.mm.wallet_core.ui.e.Q(WalletWXCreditDetailUI.this, WalletWXCreditDetailUI.b(WalletWXCreditDetailUI.this).skN.username);
            GMTrace.o(9010572951552L, 67134);
          }
        }
        else if ((paramAnonymousView.getId() == a.f.sLf) && (WalletWXCreditDetailUI.b(WalletWXCreditDetailUI.this) != null)) {
          com.tencent.mm.wallet_core.ui.e.m(WalletWXCreditDetailUI.this, WalletWXCreditDetailUI.b(WalletWXCreditDetailUI.this).skM, false);
        }
        GMTrace.o(9010572951552L, 67134);
      }
    };
    GMTrace.o(9005070024704L, 67093);
  }
  
  private void ar()
  {
    GMTrace.i(9005875331072L, 67099);
    if (!this.hasInit) {
      MP();
    }
    Object localObject1;
    Object localObject2;
    if (this.slx != null)
    {
      localObject1 = (WalletWXCreditDetailHeaderPreference)this.htU.VG("wallet_wxcredit_header");
      double d = this.slx.skz;
      ((WalletWXCreditDetailHeaderPreference)localObject1).hqk.setText(com.tencent.mm.wallet_core.ui.e.s(d));
      localObject2 = this.qXk.field_bankName;
      String str = this.slx.skL;
      ((WalletWXCreditDetailHeaderPreference)localObject1).slv.setText(((Preference)localObject1).mContext.getString(a.i.sLn, new Object[] { str, localObject2 }));
    }
    boolean bool;
    if (this.slx != null)
    {
      this.htU.VG("wallet_wxcredit_total_amount").setTitle(getString(a.i.thI, new Object[] { com.tencent.mm.wallet_core.ui.e.s(this.slx.skt) }));
      localObject1 = this.htU;
      if (this.slx.skE) {
        break label384;
      }
      bool = true;
      ((com.tencent.mm.ui.base.preference.f)localObject1).bc("wallet_wxcredit_change_amount", bool);
      localObject1 = this.htU.VG("wallet_wxcredit_bill");
      if (this.slx.skA != 0.0D) {
        ((Preference)localObject1).setSummary(com.tencent.mm.wallet_core.ui.e.s(this.slx.skA));
      }
      localObject1 = this.htU.VG("wallet_wxcredit_repayment");
      localObject2 = this.htU.VG("wallet_wxcredit_repayment_tips");
      if (this.slx.skC <= 0.0D) {
        break label389;
      }
      ((Preference)localObject1).setSummary(com.tencent.mm.wallet_core.ui.e.s(this.slx.skC));
      ((Preference)localObject2).setTitle(getString(a.i.thU, new Object[] { this.slx.skH }));
      this.htU.bc("wallet_wxcredit_repayment_tips", false);
    }
    for (;;)
    {
      if (this.qXk != null) {
        this.htU.VG("wallet_wxcredit_bank_name").setTitle(this.qXk.field_bankName);
      }
      ((WalletWXCreditDetailFooterPreference)this.htU.VG("wallet_wxcredit_footer")).slu = this.slu;
      this.htU.notifyDataSetChanged();
      GMTrace.o(9005875331072L, 67099);
      return;
      label384:
      bool = false;
      break;
      label389:
      this.htU.bc("wallet_wxcredit_repayment_tips", true);
    }
  }
  
  private boolean bIJ()
  {
    GMTrace.i(9005472677888L, 67096);
    if (this.qXk == null)
    {
      GMTrace.o(9005472677888L, 67096);
      return false;
    }
    if (this.qXk.field_bankcardState == 0)
    {
      GMTrace.o(9005472677888L, 67096);
      return true;
    }
    int i = this.qXk.field_wxcreditState;
    if (this.slx != null) {
      i = this.slx.sky;
    }
    switch (i)
    {
    case 2: 
    default: 
      GMTrace.o(9005472677888L, 67096);
      return true;
    case 1: 
      long l = bg.aG(n.byx().rjA);
      w.d("MicroMsg.WalletUserInfoManger", "pass time " + l);
      if (l > 300L) {}
      for (i = 1; i != 0; i = 0)
      {
        GMTrace.o(9005472677888L, 67096);
        return true;
      }
      GMTrace.o(9005472677888L, 67096);
      return false;
    case 3: 
      com.tencent.mm.ui.base.h.a(this, a.i.thG, -1, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9014062612480L, 67160);
          WalletWXCreditDetailUI.this.cmu().a(new i(WalletWXCreditDetailUI.a(WalletWXCreditDetailUI.this).field_bankcardType, WalletWXCreditDetailUI.a(WalletWXCreditDetailUI.this).reG), true, 1);
          GMTrace.o(9014062612480L, 67160);
        }
      });
      GMTrace.o(9005472677888L, 67096);
      return false;
    case 5: 
      this.slw.ler.putBoolean("key_can_unbind", false);
    }
    if (this.slx != null)
    {
      this.slw.ler.putString("key_repayment_url", this.slx.skG);
      this.slw.a(this, 1, this.slw.ler);
      GMTrace.o(9005472677888L, 67096);
      return false;
    }
    GMTrace.o(9005472677888L, 67096);
    return true;
  }
  
  protected final void MP()
  {
    GMTrace.i(9005741113344L, 67098);
    this.hasInit = true;
    oM(a.i.thH);
    this.htU = this.wky;
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9000238186496L, 67057);
        WalletWXCreditDetailUI.this.aLo();
        WalletWXCreditDetailUI.this.finish();
        GMTrace.o(9000238186496L, 67057);
        return true;
      }
    });
    a(0, a.e.aXV, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9000775057408L, 67061);
        paramAnonymousMenuItem = new ArrayList();
        n.byx();
        String str = WalletWXCreditDetailUI.a(WalletWXCreditDetailUI.this).field_bindSerial;
        com.tencent.mm.ui.base.h.a(WalletWXCreditDetailUI.this, null, (String[])paramAnonymousMenuItem.toArray(new String[paramAnonymousMenuItem.size()]), WalletWXCreditDetailUI.this.getString(a.i.tce), false, new h.c()
        {
          public final void hQ(int paramAnonymous2Int)
          {
            GMTrace.i(9015404789760L, 67170);
            switch (paramAnonymous2Int)
            {
            }
            for (;;)
            {
              GMTrace.o(9015404789760L, 67170);
              return;
              n.byx();
              String str = WalletWXCreditDetailUI.a(WalletWXCreditDetailUI.this).field_bindSerial;
              WalletWXCreditDetailUI.bIK();
              GMTrace.o(9015404789760L, 67170);
              return;
              WalletWXCreditDetailUI.c(WalletWXCreditDetailUI.this);
            }
          }
        });
        GMTrace.o(9000775057408L, 67061);
        return true;
      }
    });
    GMTrace.o(9005741113344L, 67098);
  }
  
  public final int QI()
  {
    GMTrace.i(9005204242432L, 67094);
    int i = a.l.tke;
    GMTrace.o(9005204242432L, 67094);
    return i;
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(9006009548800L, 67100);
    paramf = paramPreference.hiu;
    if ("wallet_wxcredit_change_amount".equals(paramf))
    {
      paramf = new Bundle();
      paramf.putParcelable("key_bankcard", this.qXk);
      com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wxcredit.b.class, paramf);
      GMTrace.o(9006009548800L, 67100);
      return true;
    }
    if ("wallet_wxcredit_bill".equals(paramf)) {
      if (this.slx != null)
      {
        paramf = new Bundle();
        paramf.putString("key_url", this.slx.skK);
        com.tencent.mm.wallet_core.a.a(this, c.class, paramf);
      }
    }
    for (;;)
    {
      GMTrace.o(9006009548800L, 67100);
      return false;
      if ("wallet_wxcredit_card_info".equals(paramf))
      {
        if (this.slx != null)
        {
          paramf = new Bundle();
          paramf.putString("key_url", this.slx.skI);
          com.tencent.mm.wallet_core.a.a(this, c.class, paramf);
        }
      }
      else if ("wallet_wxcredit_right".equals(paramf))
      {
        if (this.slx != null) {
          com.tencent.mm.wallet_core.ui.e.m(this, this.slx.skJ, false);
        }
      }
      else if ("wallet_wxcredit_repayment".equals(paramf))
      {
        if (this.slx != null) {
          com.tencent.mm.wallet_core.ui.e.m(this, this.slx.skG, false);
        }
      }
      else if (("wallet_wxcredit_bank_name".equals(paramf)) && (this.slx != null)) {
        com.tencent.mm.wallet_core.ui.e.P(this, this.slx.skN.username);
      }
    }
  }
  
  public final boolean f(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(9006143766528L, 67101);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.wxcredit.a.d))
      {
        n.byx().rjA = (System.currentTimeMillis() / 1000L);
        this.slx = ((com.tencent.mm.plugin.wxcredit.a.d)paramk).sku;
        if ((this.slx != null) && (this.slx.sky == 2))
        {
          com.tencent.mm.kernel.h.xz();
          if (((Boolean)com.tencent.mm.kernel.h.xy().xh().get(196658, Boolean.valueOf(false))).booleanValue())
          {
            paramString = com.tencent.mm.wallet_core.a.ad(this);
            paramk = paramString.ler;
            paramk.putDouble("key_total_amount", this.slx.skt);
            paramk.putBoolean("key_can_upgrade_amount", this.slx.skE);
            paramString.a(this, WalletWXCreditOpenNotifyUI.class, paramk, 1);
          }
        }
        for (;;)
        {
          GMTrace.o(9006143766528L, 67101);
          return true;
          if (bIJ())
          {
            sv(0);
            ar();
          }
        }
      }
      if (!(paramk instanceof i)) {
        break label215;
      }
      cmu().a(new o(null), true, 1);
    }
    for (;;)
    {
      GMTrace.o(9006143766528L, 67101);
      return false;
      label215:
      if ((paramk instanceof o)) {
        finish();
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(9006277984256L, 67102);
    sv(0);
    ar();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(9006277984256L, 67102);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9005338460160L, 67095);
    super.onCreate(paramBundle);
    cmu().hN(621);
    cmu().hN(600);
    sv(4);
    this.slw = com.tencent.mm.wallet_core.a.ad(this);
    if (this.qXk == null) {
      this.qXk = ((Bankcard)this.slw.ler.getParcelable("key_bankcard"));
    }
    if (bIJ())
    {
      if (this.xEM == null)
      {
        if (this.xEK == null) {
          this.xEK = com.tencent.mm.wallet_core.a.ad(this);
        }
        this.xEM = this.xEK.a(this, this.xEL);
      }
      if (!this.xEM.p(new Object[] { this.qXk }))
      {
        sv(0);
        MP();
      }
    }
    GMTrace.o(9005338460160L, 67095);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9005606895616L, 67097);
    cmu().hO(621);
    cmu().hO(600);
    super.onDestroy();
    GMTrace.o(9005606895616L, 67097);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\ui\WalletWXCreditDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */