package com.tencent.mm.plugin.wxcredit.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wxcredit.b;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.storage.t;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class WalletWXCreditOpenNotifyUI
  extends WalletBaseUI
{
  public WalletWXCreditOpenNotifyUI()
  {
    GMTrace.i(8996345872384L, 67028);
    GMTrace.o(8996345872384L, 67028);
  }
  
  protected final void MP()
  {
    int i = 0;
    GMTrace.i(8996882743296L, 67032);
    oM(a.i.thJ);
    ld(false);
    le(false);
    a(0, getString(a.i.cTh), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9014331047936L, 67162);
        WalletWXCreditOpenNotifyUI.this.setResult(-1);
        WalletWXCreditOpenNotifyUI.this.finish();
        GMTrace.o(9014331047936L, 67162);
        return true;
      }
    });
    ((TextView)findViewById(a.f.sKX)).setText(com.tencent.mm.wallet_core.ui.e.s(this.ui.getDouble("key_total_amount")));
    Button localButton = (Button)findViewById(a.f.bQR);
    localButton.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9007217508352L, 67109);
        paramAnonymousView = new Bundle();
        paramAnonymousView.putParcelable("key_bankcard", WalletWXCreditOpenNotifyUI.this.ui.getParcelable("key_bankcard"));
        a.a(WalletWXCreditOpenNotifyUI.this, b.class, paramAnonymousView);
        GMTrace.o(9007217508352L, 67109);
      }
    });
    if (this.ui.getBoolean("key_can_upgrade_amount", true)) {}
    for (;;)
    {
      localButton.setVisibility(i);
      GMTrace.o(8996882743296L, 67032);
      return;
      i = 8;
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8996480090112L, 67029);
    GMTrace.o(8996480090112L, 67029);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8996614307840L, 67030);
    int i = a.g.sQv;
    GMTrace.o(8996614307840L, 67030);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8996748525568L, 67031);
    super.onCreate(paramBundle);
    h.xz();
    h.xy().xh().set(196658, Boolean.valueOf(false));
    MP();
    GMTrace.o(8996748525568L, 67031);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\ui\WalletWXCreditOpenNotifyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */