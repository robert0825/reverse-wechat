package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ac;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.ui.e;
import com.tencent.mm.ui.base.a;
import java.util.ArrayList;

@a(3)
public class WalletChangeLoanRepayBankcardUI
  extends WalletChangeBankcardUI
{
  public WalletChangeLoanRepayBankcardUI()
  {
    GMTrace.i(7794023464960L, 58070);
    GMTrace.o(7794023464960L, 58070);
  }
  
  protected final int Qf()
  {
    GMTrace.i(7794560335872L, 58074);
    GMTrace.o(7794560335872L, 58074);
    return 1;
  }
  
  protected final e bxo()
  {
    GMTrace.i(7794291900416L, 58072);
    this.qTU = n.byy().rjo;
    bxn();
    e locale = new e(this, this.qTU, this.qYS, this.opK);
    GMTrace.o(7794291900416L, 58072);
    return locale;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7794157682688L, 58071);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7820061704192L, 58264);
        WalletChangeLoanRepayBankcardUI.this.setResult(-1, null);
        GMTrace.o(7820061704192L, 58264);
        return true;
      }
    });
    GMTrace.o(7794157682688L, 58071);
  }
  
  protected final void wN(int paramInt)
  {
    GMTrace.i(7794426118144L, 58073);
    int i;
    Object localObject;
    if (this.qTU != null)
    {
      i = this.qTU.size();
      if ((this.qTU == null) || (paramInt >= i)) {
        break label133;
      }
      localObject = (Bankcard)this.qTU.get(paramInt);
      this.qTV = ((Bankcard)localObject);
      this.qYT.rmn = ((Bankcard)localObject).field_bindSerial;
      this.oow.setEnabled(true);
      this.qYT.notifyDataSetChanged();
      Intent localIntent = new Intent();
      localIntent.putExtra("bindSerial", ((Bankcard)localObject).field_bindSerial);
      localIntent.putExtra("ret", 0);
      setResult(-1, localIntent);
    }
    for (;;)
    {
      finish();
      GMTrace.o(7794426118144L, 58073);
      return;
      i = 0;
      break;
      label133:
      if (i == paramInt)
      {
        localObject = new Intent();
        ((Intent)localObject).putExtra("ret", 64533);
        setResult(-1, (Intent)localObject);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\ui\WalletChangeLoanRepayBankcardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */