package com.tencent.mm.plugin.wallet.pay.a.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.o;

public final class a
  extends e
{
  public a(o paramo, Orders paramOrders)
  {
    super(paramo, paramOrders);
    GMTrace.i(7780064821248L, 57966);
    GMTrace.o(7780064821248L, 57966);
  }
  
  public final int Bb()
  {
    GMTrace.i(7780333256704L, 57968);
    GMTrace.o(7780333256704L, 57968);
    return 1675;
  }
  
  public final String getUri()
  {
    GMTrace.i(7780199038976L, 57967);
    GMTrace.o(7780199038976L, 57967);
    return "/cgi-bin/mmpay-bin/tenpay/sns_aa_verify";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\a\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */