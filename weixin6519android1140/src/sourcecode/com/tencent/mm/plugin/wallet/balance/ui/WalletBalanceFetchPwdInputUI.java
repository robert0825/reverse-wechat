package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.ui.l;
import com.tencent.mm.plugin.wallet_core.ui.l.a;
import com.tencent.mm.plugin.wallet_core.ui.l.c;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

@a(3)
public class WalletBalanceFetchPwdInputUI
  extends WalletBaseUI
{
  private String mTitle;
  private String qTR;
  private l qTS;
  
  public WalletBalanceFetchPwdInputUI()
  {
    GMTrace.i(7722351198208L, 57536);
    this.mTitle = "";
    this.qTR = "";
    GMTrace.o(7722351198208L, 57536);
  }
  
  private void showDialog()
  {
    GMTrace.i(7722619633664L, 57538);
    if ((this.qTS != null) && (this.qTS.isShowing())) {
      this.qTS.dismiss();
    }
    Orders localOrders = (Orders)this.ui.getParcelable("key_orders");
    String str = "";
    if (localOrders.oml > 0.0D) {
      str = getResources().getString(a.i.sZd, new Object[] { e.d(localOrders.oml, localOrders.nEr) });
    }
    if (this.qTS == null)
    {
      this.qTS = l.a(this, this.mTitle, this.qTR, str, new l.c()new DialogInterface.OnCancelListener
      {
        public final void a(String paramAnonymousString, FavorPayInfo paramAnonymousFavorPayInfo, boolean paramAnonymousBoolean)
        {
          GMTrace.i(7719129972736L, 57512);
          WalletBalanceFetchPwdInputUI.a(WalletBalanceFetchPwdInputUI.this).dismiss();
          if (WalletBalanceFetchPwdInputUI.this.cmp() != null) {
            WalletBalanceFetchPwdInputUI.this.cmq().j(new Object[] { paramAnonymousString });
          }
          GMTrace.o(7719129972736L, 57512);
        }
      }, new DialogInterface.OnCancelListener()new l.a
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(7709600514048L, 57441);
          w.i("MicroMsg.WalletBalanceFetchPwdInputUI", "hy: dialog cancel. finish");
          WalletBalanceFetchPwdInputUI.a(WalletBalanceFetchPwdInputUI.this).dismiss();
          WalletBalanceFetchPwdInputUI.this.finish();
          GMTrace.o(7709600514048L, 57441);
        }
      }, new l.a()
      {
        public final void aVA()
        {
          GMTrace.i(7709332078592L, 57439);
          w.i("MicroMsg.WalletBalanceFetchPwdInputUI", "hy: pwd cancel.finish");
          WalletBalanceFetchPwdInputUI.a(WalletBalanceFetchPwdInputUI.this).dismiss();
          WalletBalanceFetchPwdInputUI.this.finish();
          GMTrace.o(7709332078592L, 57439);
        }
      });
      GMTrace.o(7722619633664L, 57538);
      return;
    }
    this.qTS.baC();
    this.qTS.show();
    GMTrace.o(7722619633664L, 57538);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7722888069120L, 57540);
    GMTrace.o(7722888069120L, 57540);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7723022286848L, 57541);
    GMTrace.o(7723022286848L, 57541);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 1;
    GMTrace.i(7722485415936L, 57537);
    super.onCreate(paramBundle);
    sv(4);
    this.mTitle = this.ui.getString("key_pwd_cash_title");
    this.qTR = this.ui.getString("key_pwd_cash_money");
    w.i("MicroMsg.WalletBalanceFetchPwdInputUI", "hy: money : %s, title : %s", new Object[] { bg.nl(this.qTR), bg.nl(this.mTitle) });
    if ((!bg.nm(this.mTitle)) && (!bg.nm(this.qTR))) {}
    while (i == 0)
    {
      h.a(this.vKB.vKW, a.i.tdb, 0, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7724498681856L, 57552);
          WalletBalanceFetchPwdInputUI.this.finish();
          GMTrace.o(7724498681856L, 57552);
        }
      });
      GMTrace.o(7722485415936L, 57537);
      return;
      i = 0;
    }
    showDialog();
    GMTrace.o(7722485415936L, 57537);
  }
  
  public final void so(int paramInt)
  {
    GMTrace.i(7722753851392L, 57539);
    if (paramInt == 0)
    {
      finish();
      GMTrace.o(7722753851392L, 57539);
      return;
    }
    if (paramInt == 1) {
      showDialog();
    }
    GMTrace.o(7722753851392L, 57539);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\ui\WalletBalanceFetchPwdInputUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */