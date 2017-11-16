package com.tencent.mm.plugin.wallet.pay.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.o;

public final class c
  extends f
{
  public c(o paramo, Orders paramOrders)
  {
    super(paramo, paramOrders);
    GMTrace.i(7783420264448L, 57991);
    GMTrace.o(7783420264448L, 57991);
  }
  
  public final int Bb()
  {
    GMTrace.i(7783688699904L, 57993);
    GMTrace.o(7783688699904L, 57993);
    return 1559;
  }
  
  public final String getUri()
  {
    GMTrace.i(7783554482176L, 57992);
    GMTrace.o(7783554482176L, 57992);
    return "/cgi-bin/mmpay-bin/tenpay/ts_verifyreg";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\a\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */