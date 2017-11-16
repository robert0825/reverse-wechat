package com.tencent.mm.plugin.wallet_ecard.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class WalletECardElementInputUI
  extends WalletECardBaseUI
{
  private Button qXb;
  private ElementQuery rdw;
  private WalletFormView rlo;
  
  public WalletECardElementInputUI()
  {
    GMTrace.i(19583708692480L, 145910);
    GMTrace.o(19583708692480L, 145910);
  }
  
  private void ar()
  {
    GMTrace.i(19584111345664L, 145913);
    if (this.rdw == null) {
      this.rdw = new ElementQuery();
    }
    if (bg.nm(this.rdw.mhU))
    {
      this.rlo.setText("");
      GMTrace.o(19584111345664L, 145913);
      return;
    }
    if (!bg.nm(this.rdw.rfV))
    {
      this.rlo.setText(this.rdw.mhU + " " + this.rdw.rfV);
      GMTrace.o(19584111345664L, 145913);
      return;
    }
    if (2 == this.rdw.rfU)
    {
      this.rlo.setText(this.rdw.mhU + " " + getString(a.i.tbg));
      GMTrace.o(19584111345664L, 145913);
      return;
    }
    this.rlo.setText(this.rdw.mhU + " " + getString(a.i.tbv));
    GMTrace.o(19584111345664L, 145913);
  }
  
  protected final void MP()
  {
    GMTrace.i(19583977127936L, 145912);
    this.rlo = ((WalletFormView)findViewById(a.f.sJi));
    this.rlo.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19586527264768L, 145931);
        paramAnonymousView = new Bundle();
        paramAnonymousView.putInt("key_support_bankcard", WalletECardElementInputUI.this.ui.getInt("key_support_bankcard", 3));
        paramAnonymousView.putInt("key_bind_scene", WalletECardElementInputUI.this.ui.getInt("key_bind_scene", -1));
        if (!bg.nm(WalletECardElementInputUI.a(WalletECardElementInputUI.this).getText()))
        {
          paramAnonymousView.putString("key_bank_type", WalletECardElementInputUI.b(WalletECardElementInputUI.this).nDt);
          paramAnonymousView.putInt("key_bankcard_type", WalletECardElementInputUI.b(WalletECardElementInputUI.this).rfU);
        }
        b localb = a.ad(WalletECardElementInputUI.this);
        if (localb != null) {
          localb.a(WalletECardElementInputUI.this, WalletCardSelectUI.class, paramAnonymousView, 1);
        }
        GMTrace.o(19586527264768L, 145931);
      }
    });
    this.qXb = ((Button)findViewById(a.f.bQR));
    this.qXb.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19582098079744L, 145898);
        w.i("MicroMsg.WalletECardElementInputUI", "goto next: %s", new Object[] { WalletECardElementInputUI.b(WalletECardElementInputUI.this).nDt });
        WalletECardElementInputUI.this.cmq().j(new Object[] { WalletECardElementInputUI.b(WalletECardElementInputUI.this) });
        GMTrace.o(19582098079744L, 145898);
      }
    });
    GMTrace.o(19583977127936L, 145912);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(19584245563392L, 145914);
    GMTrace.o(19584245563392L, 145914);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19584379781120L, 145915);
    int i = a.g.sMo;
    GMTrace.o(19584379781120L, 145915);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(19584513998848L, 145916);
    w.i("MicroMsg.WalletECardElementInputUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      GMTrace.o(19584513998848L, 145916);
      return;
    }
    switch (paramInt1)
    {
    default: 
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(19584513998848L, 145916);
      return;
    }
    this.rdw = ((ElementQuery)paramIntent.getParcelableExtra("elemt_query"));
    ar();
    GMTrace.o(19584513998848L, 145916);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19583842910208L, 145911);
    super.onCreate(paramBundle);
    oM(a.i.sTj);
    MP();
    ar();
    GMTrace.o(19583842910208L, 145911);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_ecard\ui\WalletECardElementInputUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */