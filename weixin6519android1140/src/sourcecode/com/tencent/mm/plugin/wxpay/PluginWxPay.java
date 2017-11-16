package com.tencent.mm.plugin.wxpay;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.c;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.plugin.wallet_core.model.n;

public class PluginWxPay
  extends com.tencent.mm.kernel.b.d
  implements com.tencent.mm.plugin.wxpay.a.a
{
  public PluginWxPay()
  {
    GMTrace.i(20875151671296L, 155532);
    GMTrace.o(20875151671296L, 155532);
  }
  
  public void configure(e parame)
  {
    GMTrace.i(20875688542208L, 155536);
    if (parame.eR(""))
    {
      pin(new com.tencent.mm.y.p(com.tencent.mm.plugin.aa.b.class));
      pin(new com.tencent.mm.y.p(com.tencent.mm.plugin.collect.a.a.class));
      pin(new com.tencent.mm.y.p(com.tencent.mm.plugin.luckymoney.a.a.class));
      pin(new com.tencent.mm.y.p(com.tencent.mm.plugin.mall.a.d.class));
      pin(new com.tencent.mm.y.p(k.class));
      pin(new com.tencent.mm.y.p(com.tencent.mm.plugin.order.a.b.class));
      pin(new com.tencent.mm.y.p(com.tencent.mm.plugin.product.a.a.class));
      pin(new com.tencent.mm.y.p(com.tencent.mm.plugin.recharge.a.a.class));
      pin(new com.tencent.mm.y.p(com.tencent.mm.plugin.remittance.a.b.class));
      pin(new com.tencent.mm.y.p(com.tencent.mm.plugin.wallet.a.p.class));
      pin(new com.tencent.mm.y.p(n.class));
      pin(new com.tencent.mm.y.p(com.tencent.mm.plugin.wallet_index.a.a.class));
      pin(new com.tencent.mm.y.p(com.tencent.mm.plugin.wallet_payu.a.d.class));
      pin(new com.tencent.mm.y.p(com.tencent.mm.plugin.wxcredit.a.class));
      pin(new com.tencent.mm.y.p(com.tencent.mm.plugin.fingerprint.a.class));
      pin(new com.tencent.mm.y.p(com.tencent.mm.plugin.wallet_ecard.a.class));
    }
    GMTrace.o(20875688542208L, 155536);
  }
  
  public void dependency()
  {
    GMTrace.i(20875554324480L, 155535);
    GMTrace.o(20875554324480L, 155535);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(20875822759936L, 155537);
    if (parame.eR(""))
    {
      c.PU("wallet");
      c.PU("mall");
      c.PU("wxcredit");
      c.PU("offline");
      c.PU("recharge");
      c.PU("wallet_index");
      c.PU("order");
      c.PU("product");
      c.PU("remittance");
      c.PU("collect");
      c.PU("wallet_payu");
      c.PU("luckymoney");
      c.PU("fingerprint");
    }
    GMTrace.o(20875822759936L, 155537);
  }
  
  public void installed()
  {
    GMTrace.i(20875420106752L, 155534);
    alias(com.tencent.mm.plugin.wxpay.a.a.class);
    GMTrace.o(20875420106752L, 155534);
  }
  
  public String name()
  {
    GMTrace.i(20875285889024L, 155533);
    GMTrace.o(20875285889024L, 155533);
    return "plugin-wxpay";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wxpay\PluginWxPay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */