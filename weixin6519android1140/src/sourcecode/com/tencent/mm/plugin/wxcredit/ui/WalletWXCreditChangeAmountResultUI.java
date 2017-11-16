package com.tencent.mm.plugin.wxcredit.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

public class WalletWXCreditChangeAmountResultUI
  extends WalletBaseUI
{
  public WalletWXCreditChangeAmountResultUI()
  {
    GMTrace.i(9003325194240L, 67080);
    GMTrace.o(9003325194240L, 67080);
  }
  
  protected final void MP()
  {
    GMTrace.i(9003862065152L, 67084);
    ((TextView)findViewById(a.f.sKX)).setText(e.s(this.ui.getDouble("key_credit_amount")));
    ld(false);
    le(false);
    a(0, getString(a.i.cTh), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9004935806976L, 67092);
        WalletWXCreditChangeAmountResultUI.this.cmp().a(WalletWXCreditChangeAmountResultUI.this.vKB.vKW, 0, WalletWXCreditChangeAmountResultUI.this.ui);
        GMTrace.o(9004935806976L, 67092);
        return true;
      }
    });
    GMTrace.o(9003862065152L, 67084);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9003459411968L, 67081);
    GMTrace.o(9003459411968L, 67081);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9003593629696L, 67082);
    int i = a.g.sQp;
    GMTrace.o(9003593629696L, 67082);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9003727847424L, 67083);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(9003727847424L, 67083);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\ui\WalletWXCreditChangeAmountResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */