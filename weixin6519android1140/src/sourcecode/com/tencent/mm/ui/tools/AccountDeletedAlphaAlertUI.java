package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;

@com.tencent.mm.ui.base.a(3)
public class AccountDeletedAlphaAlertUI
  extends MMActivity
{
  private static AccountDeletedAlphaAlertUI xeV;
  
  static
  {
    GMTrace.i(2062658043904L, 15368);
    xeV = null;
    GMTrace.o(2062658043904L, 15368);
  }
  
  public AccountDeletedAlphaAlertUI()
  {
    GMTrace.i(2061852737536L, 15362);
    GMTrace.o(2061852737536L, 15362);
  }
  
  public static AccountDeletedAlphaAlertUI chT()
  {
    GMTrace.i(2061986955264L, 15363);
    AccountDeletedAlphaAlertUI localAccountDeletedAlphaAlertUI = xeV;
    GMTrace.o(2061986955264L, 15363);
    return localAccountDeletedAlphaAlertUI;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2062389608448L, 15366);
    GMTrace.o(2062389608448L, 15366);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2062121172992L, 15364);
    super.onCreate(paramBundle);
    xeV = this;
    paramBundle = new x();
    com.tencent.mm.sdk.b.a.vgX.m(paramBundle);
    at.hold();
    paramBundle = com.tencent.mm.h.a.dH(getIntent().getStringExtra("errmsg"));
    if (paramBundle != null)
    {
      paramBundle.a(this, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2065073963008L, 15386);
          AccountDeletedAlphaAlertUI.a(AccountDeletedAlphaAlertUI.this);
          GMTrace.o(2065073963008L, 15386);
        }
      }, null);
      GMTrace.o(2062121172992L, 15364);
      return;
    }
    h.a(this, getString(R.l.dHX), null, false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(1953673248768L, 14556);
        AccountDeletedAlphaAlertUI.a(AccountDeletedAlphaAlertUI.this);
        GMTrace.o(1953673248768L, 14556);
      }
    });
    GMTrace.o(2062121172992L, 15364);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2062255390720L, 15365);
    if (equals(xeV)) {
      xeV = null;
    }
    super.onDestroy();
    GMTrace.o(2062255390720L, 15365);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\AccountDeletedAlphaAlertUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */