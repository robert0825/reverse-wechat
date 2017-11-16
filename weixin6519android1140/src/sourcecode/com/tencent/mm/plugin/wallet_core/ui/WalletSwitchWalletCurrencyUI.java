package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.d.f;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.y.q;
import java.util.ArrayList;

public class WalletSwitchWalletCurrencyUI
  extends WalletBaseUI
  implements View.OnClickListener
{
  private ListView rpF;
  private ArrayList<com.tencent.mm.plugin.wallet_core.model.w> rpG;
  private m rpH;
  private com.tencent.mm.plugin.wallet_core.model.w rpI;
  private com.tencent.mm.plugin.wallet_core.model.w rpJ;
  
  public WalletSwitchWalletCurrencyUI()
  {
    GMTrace.i(6949391302656L, 51777);
    this.rpG = null;
    this.rpH = null;
    GMTrace.o(6949391302656L, 51777);
  }
  
  private void jc(boolean paramBoolean)
  {
    GMTrace.i(6950062391296L, 51782);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WalletSwitchWalletCurrencyUI", "doGetAllWalletType isShowProcess = " + paramBoolean);
    b(new com.tencent.mm.plugin.wallet_core.c.e(), paramBoolean);
    GMTrace.o(6950062391296L, 51782);
  }
  
  protected final void MP()
  {
    GMTrace.i(6949659738112L, 51779);
    this.rpF = ((ListView)findViewById(a.f.sHg));
    this.rpH = new m(this, this.rpG);
    this.rpF.setAdapter(this.rpH);
    if ((this.rpG != null) && (this.rpG.size() > 0))
    {
      this.rpH.mData = this.rpG;
      this.rpH.notifyDataSetChanged();
    }
    this.rpF.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(7020392480768L, 52306);
        paramAnonymousView = WalletSwitchWalletCurrencyUI.a(WalletSwitchWalletCurrencyUI.this).wZ(paramAnonymousInt);
        WalletSwitchWalletCurrencyUI.a(WalletSwitchWalletCurrencyUI.this, WalletSwitchWalletCurrencyUI.a(WalletSwitchWalletCurrencyUI.this).rpL);
        if ((paramAnonymousView != null) && ((WalletSwitchWalletCurrencyUI.b(WalletSwitchWalletCurrencyUI.this) == null) || (!WalletSwitchWalletCurrencyUI.b(WalletSwitchWalletCurrencyUI.this).field_wallet_tpa_country.equals(paramAnonymousView.field_wallet_tpa_country))))
        {
          WalletSwitchWalletCurrencyUI.b(WalletSwitchWalletCurrencyUI.this, paramAnonymousView);
          paramAnonymousAdapterView = WalletSwitchWalletCurrencyUI.this;
          paramAnonymousView = paramAnonymousView.field_wallet_tpa_country;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WalletSwitchWalletCurrencyUI", "doSetUserWallet walletid = " + paramAnonymousView);
          paramAnonymousAdapterView.r(new com.tencent.mm.plugin.wallet_core.c.h(paramAnonymousView));
        }
        GMTrace.o(7020392480768L, 52306);
      }
    });
    GMTrace.o(6949659738112L, 51779);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6949793955840L, 51780);
    if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.e))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WalletSwitchWalletCurrencyUI", "NetSceneQueryUserWallet succ and update view");
        this.rpG = n.byA().bzq();
        this.rpH.mData = this.rpG;
        this.rpH.notifyDataSetChanged();
        GMTrace.o(6949793955840L, 51780);
        return true;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.WalletSwitchWalletCurrencyUI", "NetSceneQueryUserWallet error");
      if (this.rpG == null)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.WalletSwitchWalletCurrencyUI", "wallet list is null in cache");
        GMTrace.o(6949793955840L, 51780);
        return false;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.WalletSwitchWalletCurrencyUI", "use cache wallet list data");
      GMTrace.o(6949793955840L, 51780);
      return true;
    }
    if (((paramk instanceof com.tencent.mm.plugin.wallet_core.c.h)) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      this.rpI.field_wallet_selected = 1;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WalletSwitchWalletCurrencyUI", "set user wallet succ. current wallet type = " + this.rpI.field_wallet_type + " " + this.rpI.field_wallet_tpa_country_mask);
      ao.bJL().reset();
      n.byA().c(this.rpI, new String[0]);
      paramString = this.rpH.rpL;
      if (paramString != null)
      {
        paramString.field_wallet_selected = 0;
        n.byA().c(paramString, new String[0]);
      }
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().set(339975, Integer.valueOf(this.rpI.field_wallet_type));
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vut, Integer.valueOf(this.rpI.field_wallet_tpa_country_mask));
      if (q.zS())
      {
        n.bys();
        n.t(this, null);
      }
      setResult(-1);
      finish();
      GMTrace.o(6949793955840L, 51780);
      return true;
    }
    GMTrace.o(6949793955840L, 51780);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6949928173568L, 51781);
    int i = a.g.sQm;
    GMTrace.o(6949928173568L, 51781);
    return i;
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(6950196609024L, 51783);
    GMTrace.o(6950196609024L, 51783);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6949525520384L, 51778);
    super.onCreate(paramBundle);
    oM(a.i.tgJ);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().xh().a(w.a.vtq, Boolean.valueOf(true));
    getIntent().getIntExtra("switch_wallet_scene", 0);
    this.rpG = n.byA().bzq();
    if ((this.rpG == null) || (this.rpG.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WalletSwitchWalletCurrencyUI", "not data cache,do NetSceneQueryUserWallet");
      jc(true);
    }
    for (;;)
    {
      MP();
      setResult(0);
      GMTrace.o(6949525520384L, 51778);
      return;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WalletSwitchWalletCurrencyUI", "use cache data first, and do NetSceneQueryUserWallet for update cache");
      jc(false);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\WalletSwitchWalletCurrencyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */