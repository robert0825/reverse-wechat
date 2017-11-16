package com.tencent.mm.plugin.wallet.pay.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;

public final class e
  extends b
{
  public e(Authen paramAuthen, Orders paramOrders, boolean paramBoolean)
  {
    super(paramAuthen, paramOrders, paramBoolean);
    GMTrace.i(7787983667200L, 58025);
    GMTrace.o(7787983667200L, 58025);
  }
  
  public final int Bb()
  {
    GMTrace.i(7788252102656L, 58027);
    GMTrace.o(7788252102656L, 58027);
    return 1552;
  }
  
  public final String getUri()
  {
    GMTrace.i(7788117884928L, 58026);
    GMTrace.o(7788117884928L, 58026);
    return "/cgi-bin/mmpay-bin/tenpay/ts_authen";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\a\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */