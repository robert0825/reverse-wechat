package com.tencent.mm.plugin.wallet.loan;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;

@com.tencent.mm.ui.base.a(3)
public class WalletLoanCheckPwdUI
  extends WalletCheckPwdUI
{
  public WalletLoanCheckPwdUI()
  {
    GMTrace.i(7830128033792L, 58339);
    GMTrace.o(7830128033792L, 58339);
  }
  
  protected final int Qf()
  {
    GMTrace.i(7830530686976L, 58342);
    GMTrace.o(7830530686976L, 58342);
    return 1;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(7830396469248L, 58341);
    if (((paramk instanceof com.tencent.mm.plugin.wallet_core.c.k)) && ((paramInt1 != 0) || (paramInt2 != 0)))
    {
      GMTrace.o(7830396469248L, 58341);
      return false;
    }
    boolean bool = super.d(paramInt1, paramInt2, paramString, paramk);
    GMTrace.o(7830396469248L, 58341);
    return bool;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7830262251520L, 58340);
    super.onCreate(paramBundle);
    if (cmp() != null) {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7829993816064L, 58338);
          com.tencent.mm.wallet_core.a.k(WalletLoanCheckPwdUI.this, 0);
          GMTrace.o(7829993816064L, 58338);
          return true;
        }
      });
    }
    GMTrace.o(7830262251520L, 58340);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\loan\WalletLoanCheckPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */