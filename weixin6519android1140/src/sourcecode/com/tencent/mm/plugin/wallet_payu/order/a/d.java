package com.tencent.mm.plugin.wallet_payu.order.a;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.order.a.a;
import com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderDetailUI;
import com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderRecordListUI;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.b;

public class d
  extends a
{
  public d()
  {
    GMTrace.i(7937904869376L, 59142);
    GMTrace.o(7937904869376L, 59142);
  }
  
  public final b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7938039087104L, 59143);
    w.d("MicroMsg.PayUShowOrdersInfoProcess", "start Process : ShowOrdersInfo");
    c(paramActivity, PayUMallOrderRecordListUI.class, paramBundle);
    GMTrace.o(7938039087104L, 59143);
    return this;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(7938173304832L, 59144);
    if ((paramActivity instanceof PayUMallOrderRecordListUI)) {
      c(paramActivity, PayUMallOrderDetailUI.class, paramBundle);
    }
    GMTrace.o(7938173304832L, 59144);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\order\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */