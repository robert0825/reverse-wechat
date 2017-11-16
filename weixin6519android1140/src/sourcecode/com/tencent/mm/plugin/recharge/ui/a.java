package com.tencent.mm.plugin.recharge.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.recharge.model.MallRechargeProduct;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.List;

public final class a
{
  public static MallRechargeProduct bj(List<MallRechargeProduct> paramList)
  {
    GMTrace.i(7877372674048L, 58691);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      MallRechargeProduct localMallRechargeProduct = (MallRechargeProduct)localIterator.next();
      if ((localMallRechargeProduct.isDefault) && (localMallRechargeProduct.isValid()))
      {
        w.d("MicroMsg.MallRechargeLogic", "find the defaultProduct");
        GMTrace.o(7877372674048L, 58691);
        return localMallRechargeProduct;
      }
    }
    w.d("MicroMsg.MallRechargeLogic", "products.get(0)");
    paramList = (MallRechargeProduct)paramList.get(0);
    GMTrace.o(7877372674048L, 58691);
    return paramList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */