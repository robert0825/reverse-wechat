package com.tencent.mm.plugin.wallet_payu.pay.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.List;

public final class d
{
  public static Orders a(Orders paramOrders, String paramString1, String paramString2, int paramInt, String paramString3)
  {
    GMTrace.i(7974277873664L, 59413);
    if ((paramOrders == null) || (paramOrders.rhv == null) || (paramOrders.rhv.size() <= 0))
    {
      w.d("MicroMsg.OrdersWrapper", "hy: params error");
      GMTrace.o(7974277873664L, 59413);
      return paramOrders;
    }
    Iterator localIterator = paramOrders.rhv.iterator();
    if (localIterator.hasNext())
    {
      Orders.Commodity localCommodity = (Orders.Commodity)localIterator.next();
      localCommodity.nEn = paramInt;
      if (paramString1.equals("1")) {}
      for (String str = "2";; str = "1")
      {
        localCommodity.nEk = str;
        localCommodity.nEl = paramString2;
        localCommodity.nEp = paramString3;
        break;
      }
    }
    GMTrace.o(7974277873664L, 59413);
    return paramOrders;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pay\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */