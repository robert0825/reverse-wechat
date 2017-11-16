package com.tencent.mm.plugin.remittance.ui;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.fi;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(19)
public class RemittanceResultUI
  extends WalletBaseUI
{
  public RemittanceResultUI()
  {
    GMTrace.i(10818485747712L, 80604);
    GMTrace.o(10818485747712L, 80604);
  }
  
  private void s(Class<?> paramClass)
  {
    GMTrace.i(19330305622016L, 144022);
    if (cmp() == null)
    {
      a(paramClass, getIntent());
      GMTrace.o(19330305622016L, 144022);
      return;
    }
    cmp().c(this, paramClass, this.ui);
    GMTrace.o(19330305622016L, 144022);
  }
  
  protected boolean bbM()
  {
    GMTrace.i(10818754183168L, 80606);
    GMTrace.o(10818754183168L, 80606);
    return true;
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(10818888400896L, 80607);
    GMTrace.o(10818888400896L, 80607);
    return false;
  }
  
  protected int getLayoutId()
  {
    GMTrace.i(10819022618624L, 80608);
    int i = a.g.sOG;
    GMTrace.o(10819022618624L, 80608);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10818619965440L, 80605);
    super.onCreate(paramBundle);
    boolean bool;
    if (bbM())
    {
      paramBundle = (Orders)this.ui.getParcelable("key_orders");
      if (paramBundle != null) {
        break label200;
      }
      bool = true;
      w.i("MicroMsg.RemittanceResultUI", "orders==null:%s", new Object[] { Boolean.valueOf(bool) });
      if (paramBundle == null) {
        break label205;
      }
      w.i("MicroMsg.RemittanceResultUI", "is_use_new_paid_succ_page: %s", new Object[] { Integer.valueOf(paramBundle.rhF) });
      if (paramBundle.rhF == 1) {
        break label205;
      }
      s(RemittanceResultOldUI.class);
      label96:
      finish();
      paramBundle = (PayInfo)this.ui.getParcelable("key_pay_info");
      if (paramBundle == null) {
        break label238;
      }
    }
    label200:
    label205:
    label214:
    label238:
    for (int i = paramBundle.ePL;; i = 0)
    {
      fi localfi;
      if ((i == 33) || (i == 32) || (i == 48) || (i == 31))
      {
        localfi = new fi();
        localfi.eHF.eHG = paramBundle.eHG;
        if (i != 31) {
          break label214;
        }
      }
      for (localfi.eHF.type = 0;; localfi.eHF.type = 1) {
        do
        {
          com.tencent.mm.sdk.b.a.vgX.m(localfi);
          GMTrace.o(10818619965440L, 80605);
          return;
          bool = false;
          break;
          s(RemittanceResultNewUI.class);
          break label96;
        } while ((i != 32) && (i != 33));
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\ui\RemittanceResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */