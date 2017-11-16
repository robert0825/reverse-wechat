package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.ui.l;
import com.tencent.mm.plugin.wallet_core.ui.l.a;
import com.tencent.mm.plugin.wallet_core.ui.l.c;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

@a(3)
public class WalletLqtCheckPwdInputDialogUI
  extends WalletBaseUI
{
  private String mTitle;
  private String qTR;
  private l qTS;
  
  public WalletLqtCheckPwdInputDialogUI()
  {
    GMTrace.i(18402726903808L, 137111);
    this.mTitle = "";
    this.qTR = "";
    GMTrace.o(18402726903808L, 137111);
  }
  
  private void showDialog()
  {
    GMTrace.i(18402995339264L, 137113);
    if ((this.qTS != null) && (this.qTS.isShowing())) {
      this.qTS.dismiss();
    }
    if (this.qTS == null)
    {
      this.qTR = e.s(bg.getDouble(this.qTR, 0.0D));
      this.qTS = l.a(this, this.mTitle, this.qTR, "", new l.c()new DialogInterface.OnCancelListener
      {
        public final void a(String paramAnonymousString, FavorPayInfo paramAnonymousFavorPayInfo, boolean paramAnonymousBoolean)
        {
          GMTrace.i(18404605952000L, 137125);
          WalletLqtCheckPwdInputDialogUI.a(WalletLqtCheckPwdInputDialogUI.this).dismiss();
          paramAnonymousFavorPayInfo = new Intent();
          paramAnonymousFavorPayInfo.putExtra("lqt_fetch_enc_pwd", paramAnonymousString);
          WalletLqtCheckPwdInputDialogUI.this.setResult(-1, paramAnonymousFavorPayInfo);
          WalletLqtCheckPwdInputDialogUI.this.finish();
          GMTrace.o(18404605952000L, 137125);
        }
      }, new DialogInterface.OnCancelListener()new l.a
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(18400982073344L, 137098);
          w.i("MicroMsg.WalletLqtCheckPwdInputDialogUI", "hy: dialog cancel. finish");
          WalletLqtCheckPwdInputDialogUI.a(WalletLqtCheckPwdInputDialogUI.this).dismiss();
          WalletLqtCheckPwdInputDialogUI.this.finish();
          GMTrace.o(18400982073344L, 137098);
        }
      }, new l.a()
      {
        public final void aVA()
        {
          GMTrace.i(18409035137024L, 137158);
          w.i("MicroMsg.WalletLqtCheckPwdInputDialogUI", "hy: pwd cancel.finish");
          WalletLqtCheckPwdInputDialogUI.a(WalletLqtCheckPwdInputDialogUI.this).dismiss();
          WalletLqtCheckPwdInputDialogUI.this.finish();
          GMTrace.o(18409035137024L, 137158);
        }
      });
      GMTrace.o(18402995339264L, 137113);
      return;
    }
    this.qTS.baC();
    this.qTS.show();
    GMTrace.o(18402995339264L, 137113);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(18403263774720L, 137115);
    GMTrace.o(18403263774720L, 137115);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(18403397992448L, 137116);
    GMTrace.o(18403397992448L, 137116);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 1;
    GMTrace.i(18402861121536L, 137112);
    super.onCreate(paramBundle);
    sv(4);
    this.mTitle = getIntent().getStringExtra("lqt_fetch_pwd_title");
    this.qTR = getIntent().getStringExtra("lqt_fetch_pwd_money");
    w.i("MicroMsg.WalletLqtCheckPwdInputDialogUI", "hy: money : %s, title : %s", new Object[] { bg.nl(this.qTR), bg.nl(this.mTitle) });
    if ((!bg.nm(this.mTitle)) && (!bg.nm(this.qTR))) {}
    while (i == 0)
    {
      h.a(this.vKB.vKW, a.i.tdb, 0, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(18399639896064L, 137088);
          WalletLqtCheckPwdInputDialogUI.this.finish();
          GMTrace.o(18399639896064L, 137088);
        }
      });
      GMTrace.o(18402861121536L, 137112);
      return;
      i = 0;
    }
    getWindow().setBackgroundDrawableResource(a.c.transparent);
    showDialog();
    GMTrace.o(18402861121536L, 137112);
  }
  
  public final void so(int paramInt)
  {
    GMTrace.i(18403129556992L, 137114);
    if (paramInt == 0)
    {
      finish();
      GMTrace.o(18403129556992L, 137114);
      return;
    }
    if (paramInt == 1) {
      showDialog();
    }
    GMTrace.o(18403129556992L, 137114);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\ui\lqt\WalletLqtCheckPwdInputDialogUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */