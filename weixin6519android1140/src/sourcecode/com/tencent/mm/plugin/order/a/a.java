package com.tencent.mm.plugin.order.a;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI;
import com.tencent.mm.plugin.order.ui.MallOrderProductListUI;
import com.tencent.mm.plugin.order.ui.MallOrderRecordListUI;
import com.tencent.mm.plugin.order.ui.MallOrderTransactionInfoUI;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.b;

public class a
  extends b
{
  public a()
  {
    GMTrace.i(6665252372480L, 49660);
    GMTrace.o(6665252372480L, 49660);
  }
  
  public b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6665386590208L, 49661);
    w.d("MicroMsg.ShowOrdersInfoProcess", "start Process : ShowOrdersInfo");
    c(paramActivity, MallOrderRecordListUI.class, paramBundle);
    GMTrace.o(6665386590208L, 49661);
    return this;
  }
  
  public void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(6665520807936L, 49662);
    if ((paramActivity instanceof MallOrderRecordListUI))
    {
      c(paramActivity, MallOrderTransactionInfoUI.class, paramBundle);
      GMTrace.o(6665520807936L, 49662);
      return;
    }
    if ((paramActivity instanceof MallOrderDetailInfoUI))
    {
      paramInt = paramBundle.getInt("key_enter_id");
      if (paramInt == 0)
      {
        c(paramActivity, MallOrderProductListUI.class, paramBundle);
        GMTrace.o(6665520807936L, 49662);
        return;
      }
      if (paramInt == 1) {
        c(paramActivity, MallOrderTransactionInfoUI.class, paramBundle);
      }
      GMTrace.o(6665520807936L, 49662);
      return;
    }
    if (((paramActivity instanceof MallOrderProductListUI)) || ((paramActivity instanceof MallOrderTransactionInfoUI))) {
      B(paramActivity);
    }
    GMTrace.o(6665520807936L, 49662);
  }
  
  public final String aAd()
  {
    GMTrace.i(6666057678848L, 49666);
    GMTrace.o(6666057678848L, 49666);
    return "ShowOrdersInfoProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6665655025664L, 49663);
    super.ae(paramActivity);
    GMTrace.o(6665655025664L, 49663);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(6665789243392L, 49664);
    B(paramActivity);
    GMTrace.o(6665789243392L, 49664);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6665923461120L, 49665);
    GMTrace.o(6665923461120L, 49665);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */