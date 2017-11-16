package com.tencent.mm.plugin.wallet.pay.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;

public final class h
  extends b
{
  public h(Authen paramAuthen, Orders paramOrders, boolean paramBoolean)
  {
    super(paramAuthen, paramOrders, paramBoolean);
    GMTrace.i(7783822917632L, 57994);
    GMTrace.o(7783822917632L, 57994);
  }
  
  public final int Bb()
  {
    GMTrace.i(7784091353088L, 57996);
    GMTrace.o(7784091353088L, 57996);
    return 1659;
  }
  
  public final String getUri()
  {
    GMTrace.i(7783957135360L, 57995);
    GMTrace.o(7783957135360L, 57995);
    return "/cgi-bin/mmpay-bin/tenpay/sns_tf_authen";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\a\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */