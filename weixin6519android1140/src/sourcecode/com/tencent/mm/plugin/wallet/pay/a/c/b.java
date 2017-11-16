package com.tencent.mm.plugin.wallet.pay.a.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class b
  extends e
{
  private boolean qYH;
  private boolean qYI;
  
  public b(o paramo, Orders paramOrders)
  {
    super(paramo, paramOrders);
    GMTrace.i(7780601692160L, 57970);
    this.qYH = false;
    bxk();
    GMTrace.o(7780601692160L, 57970);
  }
  
  private void bxk()
  {
    GMTrace.i(18426215006208L, 137286);
    this.qYH = false;
    p.bxd();
    if ((p.bxe().rjy != null) && (this.qYM.oek != null))
    {
      String str = this.qYM.nDt;
      p.bxd();
      if (str.equals(p.bxe().rjy.field_bankcardType))
      {
        if ((this.qYM.oek.ePL != 31) && (this.qYM.oek.ePL != 32) && (this.qYM.oek.ePL != 33) && (this.qYM.oek.ePL != 42) && (this.qYM.oek.ePL != 37)) {
          break label184;
        }
        this.qYH = true;
      }
    }
    for (;;)
    {
      w.i("MicroMsg.NetSceneTenpayPayVertify", "isLqtSns: %s, isLqtTs: %s", new Object[] { Boolean.valueOf(this.qYH), Boolean.valueOf(this.qYI) });
      GMTrace.o(18426215006208L, 137286);
      return;
      label184:
      this.qYI = true;
    }
  }
  
  public final int Bb()
  {
    GMTrace.i(7780735909888L, 57971);
    bxk();
    if (this.qYH)
    {
      GMTrace.o(7780735909888L, 57971);
      return 1281;
    }
    if (this.qYI)
    {
      GMTrace.o(7780735909888L, 57971);
      return 1305;
    }
    GMTrace.o(7780735909888L, 57971);
    return 1601;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(18426349223936L, 137287);
    if (this.qYH) {
      g.ork.a(663L, 26L, 1L, false);
    }
    for (;;)
    {
      int i = super.a(parame, parame1);
      GMTrace.o(18426349223936L, 137287);
      return i;
      if (this.qYI) {
        g.ork.a(663L, 22L, 1L, false);
      }
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(18426483441664L, 137288);
    super.a(paramInt, paramString, paramJSONObject);
    if (paramInt != 0)
    {
      if (this.qYH)
      {
        g.ork.a(663L, 27L, 1L, false);
        GMTrace.o(18426483441664L, 137288);
        return;
      }
      if (this.qYI) {
        g.ork.a(663L, 23L, 1L, false);
      }
    }
    GMTrace.o(18426483441664L, 137288);
  }
  
  public final int aoD()
  {
    GMTrace.i(7780467474432L, 57969);
    GMTrace.o(7780467474432L, 57969);
    return 121;
  }
  
  public final String getUri()
  {
    GMTrace.i(7780870127616L, 57972);
    bxk();
    if (this.qYH)
    {
      GMTrace.o(7780870127616L, 57972);
      return "/cgi-bin/mmpay-bin/tenpay/snslqtpaybindverify";
    }
    if (this.qYI)
    {
      GMTrace.o(7780870127616L, 57972);
      return "/cgi-bin/mmpay-bin/tenpay/lqtpaybindverify";
    }
    GMTrace.o(7780870127616L, 57972);
    return "/cgi-bin/mmpay-bin/tenpay/banpaybindverify";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\a\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */