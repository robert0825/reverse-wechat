package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.vending.app.a;
import com.tencent.mm.vending.app.c;
import com.tencent.mm.vending.c.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public abstract class WalletLqtBasePresenterUI
  extends WalletBaseUI
{
  private c gaw;
  
  public WalletLqtBasePresenterUI()
  {
    GMTrace.i(18409706225664L, 137163);
    this.gaw = new c();
    GMTrace.o(18409706225664L, 137163);
  }
  
  protected final int Qf()
  {
    GMTrace.i(18410914185216L, 137172);
    GMTrace.o(18410914185216L, 137172);
    return 1;
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(18410645749760L, 137170);
    GMTrace.o(18410645749760L, 137170);
    return false;
  }
  
  protected int getLayoutId()
  {
    GMTrace.i(18410779967488L, 137171);
    GMTrace.o(18410779967488L, 137171);
    return 0;
  }
  
  public final <T extends b<? extends a>> T m(Class<? extends b<? extends a>> paramClass)
  {
    GMTrace.i(18410377314304L, 137168);
    paramClass = this.gaw.a(this, paramClass);
    GMTrace.o(18410377314304L, 137168);
    return paramClass;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(18409840443392L, 137164);
    super.onCreate(paramBundle);
    this.gaw.B(getIntent(), this);
    this.xEP = true;
    GMTrace.o(18409840443392L, 137164);
  }
  
  public void onDestroy()
  {
    GMTrace.i(18410243096576L, 137167);
    super.onDestroy();
    this.gaw.onDestroy();
    GMTrace.o(18410243096576L, 137167);
  }
  
  public void onPause()
  {
    GMTrace.i(18410108878848L, 137166);
    super.onPause();
    this.gaw.Ez(3);
    GMTrace.o(18410108878848L, 137166);
  }
  
  public void onResume()
  {
    GMTrace.i(18409974661120L, 137165);
    super.onResume();
    this.gaw.Ez(2);
    GMTrace.o(18409974661120L, 137165);
  }
  
  public final <T extends a> T p(Class<? extends a> paramClass)
  {
    GMTrace.i(18410511532032L, 137169);
    paramClass = this.gaw.b(this, paramClass);
    GMTrace.o(18410511532032L, 137169);
    return paramClass;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\ui\lqt\WalletLqtBasePresenterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */