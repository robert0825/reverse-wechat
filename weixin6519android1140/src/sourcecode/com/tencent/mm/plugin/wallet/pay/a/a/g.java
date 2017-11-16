package com.tencent.mm.plugin.wallet.pay.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;

public final class g
  extends b
{
  public g(Authen paramAuthen, Orders paramOrders, boolean paramBoolean)
  {
    super(paramAuthen, paramOrders, paramBoolean);
    GMTrace.i(7786238836736L, 58012);
    GMTrace.o(7786238836736L, 58012);
  }
  
  public final int Bb()
  {
    GMTrace.i(7786507272192L, 58014);
    GMTrace.o(7786507272192L, 58014);
    return 1664;
  }
  
  public final String getUri()
  {
    GMTrace.i(7786373054464L, 58013);
    GMTrace.o(7786373054464L, 58013);
    return "/cgi-bin/mmpay-bin/tenpay/sns_authen";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\a\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */