package com.tencent.mm.plugin.wallet.pay.a.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.o;

public final class d
  extends e
{
  public d(o paramo, Orders paramOrders)
  {
    super(paramo, paramOrders);
    GMTrace.i(7779662168064L, 57963);
    GMTrace.o(7779662168064L, 57963);
  }
  
  public final int Bb()
  {
    GMTrace.i(7779930603520L, 57965);
    GMTrace.o(7779930603520L, 57965);
    return 1699;
  }
  
  public final String getUri()
  {
    GMTrace.i(7779796385792L, 57964);
    GMTrace.o(7779796385792L, 57964);
    return "/cgi-bin/mmpay-bin/tenpay/ts_verify";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\a\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */