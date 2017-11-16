package com.tencent.mm.plugin.wallet_core.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.c.l;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView;
import com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView.a;
import com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemView;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.em;
import com.tencent.mm.protocal.c.wt;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class WalletSwitchVerifyPhoneUI
  extends WalletBaseUI
{
  private SwitchPhoneItemGroupView rpA;
  private List<em> rpB;
  public boolean rpC;
  
  public WalletSwitchVerifyPhoneUI()
  {
    GMTrace.i(7013010505728L, 52251);
    this.rpC = false;
    GMTrace.o(7013010505728L, 52251);
  }
  
  private void bxh()
  {
    GMTrace.i(7013950029824L, 52258);
    w.i("MicroMsg.WalletSwitchVerifyPhoneUI", "directToNext()");
    Authen localAuthen = (Authen)this.ui.getParcelable("key_authen");
    Bankcard localBankcard = (Bankcard)this.ui.getParcelable("key_bankcard");
    ElementQuery localElementQuery = n.byF().Kf(localBankcard.field_bankcardType);
    this.ui.putParcelable("elemt_query", localElementQuery);
    localAuthen.nDt = localBankcard.field_bankcardType;
    localAuthen.nDu = localBankcard.field_bindSerial;
    localBankcard.field_bankPhone = localElementQuery.rfX;
    this.ui.putBoolean("key_balance_change_phone_need_confirm_phone", true);
    this.ui.putBoolean("key_is_changing_balance_phone_num", true);
    this.ui.putInt("key_err_code", 418);
    com.tencent.mm.wallet_core.a.i(this, this.ui);
    GMTrace.o(7013950029824L, 52258);
  }
  
  protected final void MP()
  {
    GMTrace.i(7013278941184L, 52253);
    this.rpA = ((SwitchPhoneItemGroupView)findViewById(a.f.sEp));
    this.rpA.rqu = new SwitchPhoneItemGroupView.a()
    {
      public final void cO(View paramAnonymousView)
      {
        GMTrace.i(6987777572864L, 52063);
        if (paramAnonymousView.getTag() != null)
        {
          int i = ((Integer)paramAnonymousView.getTag()).intValue();
          w.d("MicroMsg.WalletSwitchVerifyPhoneUI", "index: %d", new Object[] { Integer.valueOf(i) });
          if (i == -1)
          {
            w.i("MicroMsg.WalletSwitchVerifyPhoneUI", "do bind new card");
            WalletSwitchVerifyPhoneUI.a(WalletSwitchVerifyPhoneUI.this);
            GMTrace.o(6987777572864L, 52063);
            return;
          }
          paramAnonymousView = (em)WalletSwitchVerifyPhoneUI.b(WalletSwitchVerifyPhoneUI.this).get(i);
          WalletSwitchVerifyPhoneUI.this.ui.putBoolean("key_balance_change_phone_need_confirm_phone", false);
          w.i("MicroMsg.WalletSwitchVerifyPhoneUI", "select wx phone: %s", new Object[] { Boolean.valueOf(paramAnonymousView.tTk.equals("wx")) });
          WalletSwitchVerifyPhoneUI.this.cmq().j(new Object[] { paramAnonymousView });
        }
        GMTrace.o(6987777572864L, 52063);
      }
    };
    GMTrace.o(7013278941184L, 52253);
  }
  
  protected final boolean bxq()
  {
    GMTrace.i(7013815812096L, 52257);
    GMTrace.o(7013815812096L, 52257);
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, final k paramk)
  {
    GMTrace.i(7013547376640L, 52255);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.d))
      {
        this.rpB = ((com.tencent.mm.plugin.wallet_core.c.d)paramk).rck.uoL;
        Collections.sort(this.rpB, new Comparator() {});
        if ((this.rpB == null) || (this.rpB.isEmpty()))
        {
          w.i("MicroMsg.WalletSwitchVerifyPhoneUI", "empty mobile info");
          GMTrace.o(7013547376640L, 52255);
          return true;
        }
        paramInt1 = this.rpB.size() - 1;
        label102:
        if (paramInt1 >= 0)
        {
          paramk = (em)this.rpB.get(paramInt1);
          if (!paramk.tTk.equals("cft")) {
            break label395;
          }
          SwitchPhoneItemView localSwitchPhoneItemView = new SwitchPhoneItemView(this.vKB.vKW);
          if (!paramk.tTl.equals("1")) {
            break label258;
          }
          paramString = getString(a.i.tgF);
          label173:
          paramString = getString(a.i.tgD, new Object[] { paramk.mhU, paramString, paramk.tTm });
          if (!this.rpC) {
            break label269;
          }
          paramString = new SpannableString(paramString);
          label221:
          localSwitchPhoneItemView.setTag(Integer.valueOf(paramInt1));
          localSwitchPhoneItemView.a(paramk.rcs, paramString);
          this.rpA.a(localSwitchPhoneItemView, 0);
        }
        for (;;)
        {
          paramInt1 -= 1;
          break label102;
          break;
          label258:
          paramString = getString(a.i.tgE);
          break label173;
          label269:
          String str1 = getString(a.i.tgH);
          f localf = new f(this);
          String str2 = paramString + "，";
          localf.rz = getResources().getColor(a.c.aMW);
          paramString = new SpannableString(str2 + str1);
          paramString.setSpan(localf, str2.length(), str2.length() + str1.length(), 33);
          localf.rmz = new f.a()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(6982408863744L, 52023);
              w.d("MicroMsg.WalletSwitchVerifyPhoneUI", "span click");
              WalletSwitchVerifyPhoneUI.a(WalletSwitchVerifyPhoneUI.this, paramk);
              GMTrace.o(6982408863744L, 52023);
            }
          };
          break label221;
          label395:
          paramString = new SwitchPhoneItemView(this.vKB.vKW);
          paramString.setTag(Integer.valueOf(paramInt1));
          paramString.a(paramk.rcs, getString(a.i.tgI));
          this.rpA.a(paramString, 0);
        }
      }
      if ((paramk instanceof l)) {
        bxh();
      }
    }
    GMTrace.o(7013547376640L, 52255);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7013681594368L, 52256);
    int i = a.g.sQl;
    GMTrace.o(7013681594368L, 52256);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7013144723456L, 52252);
    overridePendingTransition(a.a.aLG, a.a.aLj);
    super.onCreate(paramBundle);
    sq(getString(a.i.tgG));
    MP();
    this.rpC = this.ui.getBoolean("key_block_bind_new_card", false);
    if (!this.rpC)
    {
      paramBundle = new SwitchPhoneItemView(this.vKB.vKW);
      paramBundle.setTag(Integer.valueOf(-1));
      paramBundle.a(getString(a.i.tgC), null);
      this.rpA.a(paramBundle, -1);
    }
    hN(1667);
    hN(461);
    hN(1505);
    l(new com.tencent.mm.plugin.wallet_core.c.d(bxg()));
    GMTrace.o(7013144723456L, 52252);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7013413158912L, 52254);
    super.onDestroy();
    hO(1667);
    hO(461);
    hO(1505);
    GMTrace.o(7013413158912L, 52254);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\WalletSwitchVerifyPhoneUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */