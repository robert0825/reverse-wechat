package com.tencent.mm.plugin.wallet.pay.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.pluginsdk.wallet.PayInfo;

public final class f
  extends b
{
  public f(Authen paramAuthen, Orders paramOrders, boolean paramBoolean)
  {
    super(paramAuthen, paramOrders, paramBoolean);
    GMTrace.i(7784225570816L, 57997);
    GMTrace.o(7784225570816L, 57997);
  }
  
  public final int Bb()
  {
    GMTrace.i(7784494006272L, 57999);
    GMTrace.o(7784494006272L, 57999);
    return 1972;
  }
  
  public final boolean aVo()
  {
    GMTrace.i(7784628224000L, 58000);
    if (this.qYD == null)
    {
      GMTrace.o(7784628224000L, 58000);
      return true;
    }
    if (this.qYD.oek.tIK == 1)
    {
      GMTrace.o(7784628224000L, 58000);
      return true;
    }
    GMTrace.o(7784628224000L, 58000);
    return false;
  }
  
  public final String getUri()
  {
    GMTrace.i(7784359788544L, 57998);
    GMTrace.o(7784359788544L, 57998);
    return "/cgi-bin/mmpay-bin/tenpay/offlinepayauthen";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\a\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */