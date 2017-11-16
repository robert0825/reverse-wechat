package com.tencent.mm.plugin.wxcredit.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(19)
public class WalletWXCreditOpenResultUI
  extends WalletBaseUI
{
  private CheckBox slF;
  
  public WalletWXCreditOpenResultUI()
  {
    GMTrace.i(9011915128832L, 67144);
    GMTrace.o(9011915128832L, 67144);
  }
  
  private void bxP()
  {
    GMTrace.i(9012586217472L, 67149);
    cmq().j(new Object[] { Boolean.valueOf(this.slF.isChecked()) });
    GMTrace.o(9012586217472L, 67149);
  }
  
  protected final void MP()
  {
    GMTrace.i(9012451999744L, 67148);
    oM(a.i.thK);
    TextView localTextView = (TextView)findViewById(a.f.sLi);
    this.slF = ((CheckBox)findViewById(a.f.spT));
    Bankcard localBankcard = (Bankcard)this.ui.getParcelable("key_bankcard");
    if (localBankcard != null)
    {
      this.slF.setText(getString(a.i.thL, new Object[] { localBankcard.field_bankName }));
      localTextView.setText(a.i.thM);
    }
    ((Button)findViewById(a.f.bQR)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9004130500608L, 67086);
        WalletWXCreditOpenResultUI.a(WalletWXCreditOpenResultUI.this);
        GMTrace.o(9004130500608L, 67086);
      }
    });
    GMTrace.o(9012451999744L, 67148);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9012049346560L, 67145);
    GMTrace.o(9012049346560L, 67145);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9012183564288L, 67146);
    int i = a.g.sQw;
    GMTrace.o(9012183564288L, 67146);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9012317782016L, 67147);
    super.onCreate(paramBundle);
    h.xz();
    h.xy().xh().set(196658, Boolean.valueOf(true));
    n.byx().rjz = bg.Pu();
    MP();
    GMTrace.o(9012317782016L, 67147);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(9012720435200L, 67150);
    if (paramInt == 4)
    {
      bxP();
      GMTrace.o(9012720435200L, 67150);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(9012720435200L, 67150);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\ui\WalletWXCreditOpenResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */