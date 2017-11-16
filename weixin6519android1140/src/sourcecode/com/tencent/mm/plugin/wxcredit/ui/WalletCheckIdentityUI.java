package com.tencent.mm.plugin.wxcredit.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.a;

public class WalletCheckIdentityUI
  extends WalletBaseUI
{
  private WalletFormView rbc;
  private WalletFormView rkx;
  private String skV;
  
  public WalletCheckIdentityUI()
  {
    GMTrace.i(8998896009216L, 67047);
    GMTrace.o(8998896009216L, 67047);
  }
  
  public final void MP()
  {
    GMTrace.i(8999432880128L, 67051);
    oM(a.i.taV);
    this.rkx = ((WalletFormView)findViewById(a.f.sCF));
    a.e(this, this.rkx);
    this.rbc = ((WalletFormView)findViewById(a.f.svX));
    a.b(this.rbc);
    e(this.rbc, 1, false);
    String str = this.ui.getString("key_pre_name");
    this.skV = this.ui.getString("key_pre_indentity");
    if (!bg.nm(str))
    {
      this.rkx.ogd.setText(str);
      this.rkx.setHint(getString(a.i.taO));
    }
    if (!bg.nm(this.skV))
    {
      this.rbc.ogz = 4;
      this.rbc.ogd.setText(this.skV);
      this.rbc.setHint(getString(a.i.tax));
    }
    findViewById(a.f.bQR).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9016478531584L, 67178);
        paramAnonymousView = WalletCheckIdentityUI.a(WalletCheckIdentityUI.this).getText();
        String str = WalletCheckIdentityUI.b(WalletCheckIdentityUI.this).getText();
        if (WalletCheckIdentityUI.a(WalletCheckIdentityUI.this, paramAnonymousView, str)) {
          WalletCheckIdentityUI.this.cmq().j(new Object[] { paramAnonymousView, str });
        }
        GMTrace.o(9016478531584L, 67178);
      }
    });
    GMTrace.o(8999432880128L, 67051);
  }
  
  protected final int Qf()
  {
    GMTrace.i(8999567097856L, 67052);
    GMTrace.o(8999567097856L, 67052);
    return 1;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8999164444672L, 67049);
    GMTrace.o(8999164444672L, 67049);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8999298662400L, 67050);
    int i = a.g.sQr;
    GMTrace.o(8999298662400L, 67050);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8999030226944L, 67048);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(8999030226944L, 67048);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\ui\WalletCheckIdentityUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */