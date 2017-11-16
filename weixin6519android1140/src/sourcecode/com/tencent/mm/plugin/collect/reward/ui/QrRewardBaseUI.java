package com.tencent.mm.plugin.collect.reward.ui;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public abstract class QrRewardBaseUI
  extends WalletBaseUI
{
  public QrRewardBaseUI()
  {
    GMTrace.i(19372315770880L, 144335);
    GMTrace.o(19372315770880L, 144335);
  }
  
  protected void aoI()
  {
    GMTrace.i(19372584206336L, 144337);
    cN().cO().setBackgroundDrawable(new ColorDrawable(getResources().getColor(a.c.slU)));
    Object localObject = cN().cO().getCustomView();
    if (localObject != null)
    {
      View localView = ((View)localObject).findViewById(a.f.divider);
      if (localView != null) {
        localView.setBackgroundColor(getResources().getColor(a.c.transparent));
      }
      localObject = ((View)localObject).findViewById(16908308);
      if ((localObject != null) && ((localObject instanceof TextView))) {
        ((TextView)localObject).setTextColor(getResources().getColor(a.c.black));
      }
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject = getWindow();
      ((Window)localObject).addFlags(Integer.MIN_VALUE);
      ((Window)localObject).setStatusBarColor(getResources().getColor(a.c.slW));
      ((Window)localObject).setNavigationBarColor(getResources().getColor(a.c.slV));
    }
    GMTrace.o(19372584206336L, 144337);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19372449988608L, 144336);
    super.onCreate(paramBundle);
    aoI();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(19378624004096L, 144382);
        QrRewardBaseUI.this.aLo();
        QrRewardBaseUI.a(QrRewardBaseUI.this);
        QrRewardBaseUI.this.finish();
        GMTrace.o(19378624004096L, 144382);
        return false;
      }
    }, a.h.cJD);
    GMTrace.o(19372449988608L, 144336);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\reward\ui\QrRewardBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */