package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.c.j;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.t;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;

@com.tencent.mm.ui.base.a(1)
public class WalletLqtSimpleCheckPwdUI
  extends WalletBaseUI
{
  private EditHintPasswdView qVS;
  private j qVT;
  
  public WalletLqtSimpleCheckPwdUI()
  {
    GMTrace.i(18405277040640L, 137130);
    GMTrace.o(18405277040640L, 137130);
  }
  
  protected final int Qf()
  {
    GMTrace.i(18405948129280L, 137135);
    GMTrace.o(18405948129280L, 137135);
    return 1;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(18405545476096L, 137132);
    w.d("MicroMsg.WalletLqtSimpleCheckPwdUI", "scene end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramk instanceof j))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = this.qVS.getText();
        paramk = new Intent();
        paramk.putExtra("lqt_enc_pwd", paramString);
        setResult(-1, paramk);
        finish();
        GMTrace.o(18405545476096L, 137132);
        return true;
      }
      if (this.qVS != null) {
        this.qVS.baC();
      }
    }
    GMTrace.o(18405545476096L, 137132);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(18405813911552L, 137134);
    int i = a.g.sPC;
    GMTrace.o(18405813911552L, 137134);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(18405411258368L, 137131);
    super.onCreate(paramBundle);
    sq(t.fK(this));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18412793233408L, 137186);
        WalletLqtSimpleCheckPwdUI.this.finish();
        GMTrace.o(18412793233408L, 137186);
        return false;
      }
    });
    ((TextView)findViewById(a.f.swf)).setText(a.i.tba);
    this.qVS = ((EditHintPasswdView)findViewById(a.f.swd));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.qVS);
    this.qVS.xFp = new EditHintPasswdView.a()
    {
      public final void gR(boolean paramAnonymousBoolean)
      {
        GMTrace.i(18413061668864L, 137188);
        if (paramAnonymousBoolean)
        {
          WalletLqtSimpleCheckPwdUI.a(WalletLqtSimpleCheckPwdUI.this, new j(WalletLqtSimpleCheckPwdUI.a(WalletLqtSimpleCheckPwdUI.this).getText(), 7, WalletLqtSimpleCheckPwdUI.this.bxg()));
          WalletLqtSimpleCheckPwdUI.this.r(WalletLqtSimpleCheckPwdUI.b(WalletLqtSimpleCheckPwdUI.this));
        }
        GMTrace.o(18413061668864L, 137188);
      }
    };
    e(this.qVS, 0, false);
    GMTrace.o(18405411258368L, 137131);
  }
  
  public final void so(int paramInt)
  {
    GMTrace.i(18405679693824L, 137133);
    super.so(paramInt);
    if (this.qVS != null) {
      this.qVS.baC();
    }
    GMTrace.o(18405679693824L, 137133);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\ui\lqt\WalletLqtSimpleCheckPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */