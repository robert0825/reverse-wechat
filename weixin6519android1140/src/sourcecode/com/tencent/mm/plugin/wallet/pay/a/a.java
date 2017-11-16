package com.tencent.mm.plugin.wallet.pay.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet.pay.a.a.b;
import com.tencent.mm.plugin.wallet.pay.a.a.h;
import com.tencent.mm.plugin.wallet.pay.a.c.c;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public static b a(Authen paramAuthen, Orders paramOrders, boolean paramBoolean)
  {
    GMTrace.i(7777380466688L, 57946);
    if ((paramAuthen == null) || (paramOrders == null))
    {
      w.i("MicroMsg.CgiManager", "empty authen or orders");
      GMTrace.o(7777380466688L, 57946);
      return null;
    }
    PayInfo localPayInfo = paramAuthen.oek;
    String str1 = "";
    if (localPayInfo != null)
    {
      w.i("MicroMsg.CgiManager", "get reqKey from payInfo");
      str1 = localPayInfo.eHG;
    }
    String str2 = str1;
    if (bg.nm(str1))
    {
      str2 = str1;
      if (paramOrders != null)
      {
        w.i("MicroMsg.CgiManager", "get reqKey from orders");
        str2 = paramOrders.eHG;
      }
    }
    if (bg.nm(str2))
    {
      w.i("MicroMsg.CgiManager", "empty reqKey!");
      paramAuthen = new b(paramAuthen, paramOrders, paramBoolean);
      GMTrace.o(7777380466688L, 57946);
      return paramAuthen;
    }
    w.i("MicroMsg.CgiManager", "authen reqKey: %s", new Object[] { str2 });
    if ((localPayInfo != null) && (paramOrders != null)) {
      w.d("MicroMsg.CgiManager", "reqKey: %s, %s", new Object[] { localPayInfo.eHG, paramOrders.eHG });
    }
    w.i("MicroMsg.CgiManager", "authen go new split cgi");
    if (str2.startsWith("sns_aa_"))
    {
      paramAuthen = new com.tencent.mm.plugin.wallet.pay.a.a.a(paramAuthen, paramOrders, paramBoolean);
      GMTrace.o(7777380466688L, 57946);
      return paramAuthen;
    }
    if (str2.startsWith("sns_tf_"))
    {
      paramAuthen = new h(paramAuthen, paramOrders, paramBoolean);
      GMTrace.o(7777380466688L, 57946);
      return paramAuthen;
    }
    if (str2.startsWith("sns_ff_"))
    {
      paramAuthen = new com.tencent.mm.plugin.wallet.pay.a.a.d(paramAuthen, paramOrders, paramBoolean);
      GMTrace.o(7777380466688L, 57946);
      return paramAuthen;
    }
    if (str2.startsWith("ts_"))
    {
      paramAuthen = new com.tencent.mm.plugin.wallet.pay.a.a.e(paramAuthen, paramOrders, paramBoolean);
      GMTrace.o(7777380466688L, 57946);
      return paramAuthen;
    }
    if (str2.startsWith("sns_"))
    {
      paramAuthen = new com.tencent.mm.plugin.wallet.pay.a.a.g(paramAuthen, paramOrders, paramBoolean);
      GMTrace.o(7777380466688L, 57946);
      return paramAuthen;
    }
    if (str2.startsWith("offline_"))
    {
      paramAuthen = new com.tencent.mm.plugin.wallet.pay.a.a.f(paramAuthen, paramOrders, paramBoolean);
      GMTrace.o(7777380466688L, 57946);
      return paramAuthen;
    }
    paramAuthen = new b(paramAuthen, paramOrders, paramBoolean);
    GMTrace.o(7777380466688L, 57946);
    return paramAuthen;
  }
  
  public static com.tencent.mm.plugin.wallet.pay.a.c.e a(o paramo, Orders paramOrders)
  {
    GMTrace.i(7777514684416L, 57947);
    if ((paramo == null) || (paramOrders == null))
    {
      w.e("MicroMsg.CgiManager", "empty verify or orders");
      GMTrace.o(7777514684416L, 57947);
      return null;
    }
    PayInfo localPayInfo = paramo.oek;
    String str1 = "";
    if (localPayInfo != null)
    {
      w.i("MicroMsg.CgiManager", "get reqKey from payInfo");
      str1 = localPayInfo.eHG;
    }
    String str2 = str1;
    if (bg.nm(str1))
    {
      w.i("MicroMsg.CgiManager", "get reqKey from orders");
      str2 = paramOrders.eHG;
    }
    if (bg.nm(str2))
    {
      w.i("MicroMsg.CgiManager", "empty reqKey!");
      paramo = new com.tencent.mm.plugin.wallet.pay.a.c.e(paramo, paramOrders);
      GMTrace.o(7777514684416L, 57947);
      return paramo;
    }
    if (localPayInfo != null) {
      w.d("MicroMsg.CgiManager", "reqKey: %s, %s", new Object[] { localPayInfo.eHG, paramOrders.eHG });
    }
    w.i("MicroMsg.CgiManager", "verify reqKey: %s", new Object[] { str2 });
    w.i("MicroMsg.CgiManager", "verify go new split cgi");
    if (str2.startsWith("sns_aa_"))
    {
      paramo = new com.tencent.mm.plugin.wallet.pay.a.c.a(paramo, paramOrders);
      GMTrace.o(7777514684416L, 57947);
      return paramo;
    }
    if (str2.startsWith("sns_tf_"))
    {
      paramo = new com.tencent.mm.plugin.wallet.pay.a.c.g(paramo, paramOrders);
      GMTrace.o(7777514684416L, 57947);
      return paramo;
    }
    if (str2.startsWith("sns_ff_"))
    {
      paramo = new c(paramo, paramOrders);
      GMTrace.o(7777514684416L, 57947);
      return paramo;
    }
    if (str2.startsWith("ts_"))
    {
      paramo = new com.tencent.mm.plugin.wallet.pay.a.c.d(paramo, paramOrders);
      GMTrace.o(7777514684416L, 57947);
      return paramo;
    }
    if (str2.startsWith("sns_"))
    {
      paramo = new com.tencent.mm.plugin.wallet.pay.a.c.f(paramo, paramOrders);
      GMTrace.o(7777514684416L, 57947);
      return paramo;
    }
    paramo = new com.tencent.mm.plugin.wallet.pay.a.c.e(paramo, paramOrders);
    GMTrace.o(7777514684416L, 57947);
    return paramo;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */