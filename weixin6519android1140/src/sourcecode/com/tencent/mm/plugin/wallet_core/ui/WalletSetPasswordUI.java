package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.e.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.t;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;
import com.tencent.mm.y.q;

@com.tencent.mm.ui.base.a(19)
public class WalletSetPasswordUI
  extends WalletBaseUI
{
  public EditHintPasswdView qVS;
  
  public WalletSetPasswordUI()
  {
    GMTrace.i(6951404568576L, 51792);
    GMTrace.o(6951404568576L, 51792);
  }
  
  protected final void MP()
  {
    GMTrace.i(6951673004032L, 51794);
    TextView localTextView;
    Object localObject;
    if (this.ui.getInt("key_err_code", 0) == 64534)
    {
      localTextView = (TextView)findViewById(a.f.swc);
      localTextView.setVisibility(0);
      if (q.zR())
      {
        localObject = getString(a.i.tgy);
        localTextView.setText((CharSequence)localObject);
        this.ui.putInt("key_err_code", 0);
      }
    }
    else
    {
      this.qVS = ((EditHintPasswdView)findViewById(a.f.swd));
      com.tencent.mm.wallet_core.ui.formview.a.a(this.qVS);
      findViewById(a.f.sqV).setVisibility(8);
      localTextView = (TextView)findViewById(a.f.sKP);
      localObject = com.tencent.mm.wallet_core.a.ad(this);
      if ((localObject == null) || (!(localObject instanceof com.tencent.mm.plugin.wallet_core.id_verify.a))) {
        break label187;
      }
      localObject = getString(a.i.tgv);
    }
    for (;;)
    {
      localTextView.setText((CharSequence)localObject);
      this.qVS.xFp = new EditHintPasswdView.a()
      {
        public final void gR(boolean paramAnonymousBoolean)
        {
          GMTrace.i(6931674562560L, 51645);
          if (paramAnonymousBoolean)
          {
            String str = WalletSetPasswordUI.this.qVS.cmw();
            Bundle localBundle = new Bundle();
            localBundle.putString("key_new_pwd1", str);
            WalletSetPasswordUI.this.qVS.baC();
            com.tencent.mm.wallet_core.a.i(WalletSetPasswordUI.this, localBundle);
          }
          GMTrace.o(6931674562560L, 51645);
        }
      };
      e(this.qVS, 0, false);
      GMTrace.o(6951673004032L, 51794);
      return;
      localObject = getString(a.i.tgx);
      break;
      label187:
      if (q.zR()) {
        localObject = getString(a.i.tgw);
      } else {
        localObject = getString(a.i.sKP);
      }
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(6952344092672L, 51799);
    GMTrace.o(6952344092672L, 51799);
    return 1;
  }
  
  protected final boolean bxq()
  {
    GMTrace.i(6952209874944L, 51798);
    GMTrace.o(6952209874944L, 51798);
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6951941439488L, 51796);
    GMTrace.o(6951941439488L, 51796);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6952075657216L, 51797);
    int i = a.g.sQj;
    GMTrace.o(6952075657216L, 51797);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6951538786304L, 51793);
    super.onCreate(paramBundle);
    sq(t.fJ(this));
    MP();
    c.b(this, this.ui, 5);
    GMTrace.o(6951538786304L, 51793);
  }
  
  public void onResume()
  {
    GMTrace.i(6951807221760L, 51795);
    this.qVS.requestFocus();
    super.onResume();
    GMTrace.o(6951807221760L, 51795);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\WalletSetPasswordUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */