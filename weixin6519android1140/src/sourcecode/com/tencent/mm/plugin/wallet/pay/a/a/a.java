package com.tencent.mm.plugin.wallet.pay.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;

public final class a
  extends b
{
  public a(Authen paramAuthen, Orders paramOrders, boolean paramBoolean)
  {
    super(paramAuthen, paramOrders, paramBoolean);
    GMTrace.i(7787581014016L, 58022);
    GMTrace.o(7787581014016L, 58022);
  }
  
  public final int Bb()
  {
    GMTrace.i(7787849449472L, 58024);
    GMTrace.o(7787849449472L, 58024);
    return 1527;
  }
  
  public final String getUri()
  {
    GMTrace.i(7787715231744L, 58023);
    GMTrace.o(7787715231744L, 58023);
    return "/cgi-bin/mmpay-bin/tenpay/sns_aa_authen";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */