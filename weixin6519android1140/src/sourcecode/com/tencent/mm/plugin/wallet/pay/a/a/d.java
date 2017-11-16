package com.tencent.mm.plugin.wallet.pay.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;

public final class d
  extends b
{
  public d(Authen paramAuthen, Orders paramOrders, boolean paramBoolean)
  {
    super(paramAuthen, paramOrders, paramBoolean);
    GMTrace.i(7787178360832L, 58019);
    GMTrace.o(7787178360832L, 58019);
  }
  
  public final int Bb()
  {
    GMTrace.i(7787446796288L, 58021);
    GMTrace.o(7787446796288L, 58021);
    return 1536;
  }
  
  public final String getUri()
  {
    GMTrace.i(7787312578560L, 58020);
    GMTrace.o(7787312578560L, 58020);
    return "/cgi-bin/mmpay-bin/tenpay/sns_ff_authen";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */