package com.tencent.mm.plugin.wallet.pay.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class c
  extends b
{
  private boolean qYH;
  private boolean qYI;
  private boolean qYJ;
  
  public c(Authen paramAuthen, Orders paramOrders, boolean paramBoolean)
  {
    super(paramAuthen, paramOrders);
    GMTrace.i(18426617659392L, 137289);
    this.qYJ = paramBoolean;
    bxk();
    GMTrace.o(18426617659392L, 137289);
  }
  
  private void bxk()
  {
    GMTrace.i(18426751877120L, 137290);
    this.qYH = false;
    p.bxd();
    if ((p.bxe().rjy != null) && (this.qYD.oek != null) && (!this.qYJ))
    {
      if ((this.qYD.oek.ePL != 31) && (this.qYD.oek.ePL != 32) && (this.qYD.oek.ePL != 33) && (this.qYD.oek.ePL != 42) && (this.qYD.oek.ePL != 37)) {
        break label173;
      }
      this.qYH = true;
    }
    for (;;)
    {
      w.i("MicroMsg.NetSceneTenpayBalanceBindAuthen", "isLqtSns: %s, isLqtTs: %s, isBalance: %s", new Object[] { Boolean.valueOf(this.qYH), Boolean.valueOf(this.qYI), Boolean.valueOf(this.qYJ) });
      GMTrace.o(18426751877120L, 137290);
      return;
      label173:
      this.qYI = true;
    }
  }
  
  public final int Bb()
  {
    GMTrace.i(7787044143104L, 58018);
    bxk();
    if (this.qYH)
    {
      GMTrace.o(7787044143104L, 58018);
      return 1274;
    }
    if (this.qYI)
    {
      GMTrace.o(7787044143104L, 58018);
      return 1259;
    }
    GMTrace.o(7787044143104L, 58018);
    return 1600;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(18426886094848L, 137291);
    if (this.qYH) {
      g.ork.a(663L, 24L, 1L, false);
    }
    for (;;)
    {
      int i = super.a(parame, parame1);
      GMTrace.o(18426886094848L, 137291);
      return i;
      if (this.qYI) {
        g.ork.a(663L, 20L, 1L, false);
      }
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(18427020312576L, 137292);
    super.a(paramInt, paramString, paramJSONObject);
    if (paramInt != 0)
    {
      if (this.qYH)
      {
        g.ork.a(663L, 25L, 1L, false);
        GMTrace.o(18427020312576L, 137292);
        return;
      }
      if (this.qYI) {
        g.ork.a(663L, 21L, 1L, false);
      }
    }
    GMTrace.o(18427020312576L, 137292);
  }
  
  public final int aoD()
  {
    GMTrace.i(7786775707648L, 58016);
    GMTrace.o(7786775707648L, 58016);
    return 120;
  }
  
  public final String getUri()
  {
    GMTrace.i(7786909925376L, 58017);
    bxk();
    if (this.qYH)
    {
      GMTrace.o(7786909925376L, 58017);
      return "/cgi-bin/mmpay-bin/tenpay/snslqtpaybindauthen";
    }
    if (this.qYI)
    {
      GMTrace.o(7786909925376L, 58017);
      return "/cgi-bin/mmpay-bin/tenpay/lqtpaybindauthen";
    }
    GMTrace.o(7786909925376L, 58017);
    return "/cgi-bin/mmpay-bin/tenpay/banpaybindauthen";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */