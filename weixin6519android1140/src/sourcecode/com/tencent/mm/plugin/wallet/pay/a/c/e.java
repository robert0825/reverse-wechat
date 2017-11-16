package com.tencent.mm.plugin.wallet.pay.a.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.e.b;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class e
  extends i
{
  private int onk;
  public Orders qYC;
  protected com.tencent.mm.plugin.wallet_core.model.o qYM;
  
  public e(com.tencent.mm.plugin.wallet_core.model.o paramo, Orders paramOrders)
  {
    GMTrace.i(7778856861696L, 57957);
    this.qYC = null;
    this.onk = -1;
    this.qYC = paramOrders;
    this.qYM = paramo;
    List localList = paramOrders.rhv;
    if (localList.size() > 0) {
      localObject = ((Orders.Commodity)localList.get(0)).eRP;
    }
    if (paramo.oek == null)
    {
      w.e("MicroMsg.NetSceneTenpayPayVertify", "empty payInfo");
      GMTrace.o(7778856861696L, 57957);
      return;
    }
    this.onk = paramo.oek.ePL;
    int i = paramo.oek.ePH;
    a(paramOrders.eHG, (String)localObject, paramo.oek.ePL, i, paramo.nDt, paramo.nDu);
    paramOrders = new HashMap();
    localObject = new HashMap();
    paramOrders.put("flag", paramo.flag);
    paramOrders.put("passwd", paramo.riF);
    if (!bg.nm(paramo.riF)) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.NetSceneTenpayPayVertify", "hy: has pwd: %b", new Object[] { Boolean.valueOf(bool) });
      a(paramo.oek, paramOrders, (Map)localObject, bool);
      paramOrders.put("verify_code", paramo.riG);
      paramOrders.put("token", paramo.token);
      paramOrders.put("bank_type", paramo.nDt);
      paramOrders.put("bind_serial", paramo.nDu);
      paramOrders.put("arrive_type", paramo.rel);
      paramOrders.put("default_favorcomposedid", paramo.reo);
      paramOrders.put("favorcomposedid", paramo.rep);
      if (com.tencent.mm.wallet_core.c.o.clM())
      {
        ((Map)localObject).put("uuid_for_bindcard", com.tencent.mm.wallet_core.c.o.clO());
        ((Map)localObject).put("bindcard_scene", com.tencent.mm.wallet_core.c.o.clN());
      }
      x(paramOrders);
      ap((Map)localObject);
      GMTrace.o(7778856861696L, 57957);
      return;
    }
  }
  
  public int Bb()
  {
    GMTrace.i(7779393732608L, 57961);
    if (this.onk == 11)
    {
      GMTrace.o(7779393732608L, 57961);
      return 1607;
    }
    if (this.onk == 21)
    {
      GMTrace.o(7779393732608L, 57961);
      return 1606;
    }
    GMTrace.o(7779393732608L, 57961);
    return 462;
  }
  
  public void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7779125297152L, 57959);
    super.a(paramInt, paramString, paramJSONObject);
    if (paramInt != 0)
    {
      GMTrace.o(7779125297152L, 57959);
      return;
    }
    paramString = paramJSONObject.optString("bind_serial");
    w.d("MicroMsg.NetSceneTenpayPayVertify", "Pay Success! saving bind_serial:" + paramString);
    if ("1".equals(paramJSONObject.optString("pay_flag")))
    {
      this.qZD = true;
      this.qYC = Orders.a(paramJSONObject, this.qYC);
    }
    for (;;)
    {
      w.i("MicroMsg.NetSceneTenpayPayVertify", "mPayScene:" + this.onk);
      if (this.onk != 39) {
        break;
      }
      w.i("MicroMsg.NetSceneTenpayPayVertify", "it's the sns scene, parse the sns pay data");
      b.V(paramJSONObject);
      GMTrace.o(7779125297152L, 57959);
      return;
      this.qZD = false;
    }
    w.i("MicroMsg.NetSceneTenpayPayVertify", "it's not the sns scene");
    GMTrace.o(7779125297152L, 57959);
  }
  
  public int aoD()
  {
    GMTrace.i(7778991079424L, 57958);
    GMTrace.o(7778991079424L, 57958);
    return 1;
  }
  
  public final boolean bxj()
  {
    GMTrace.i(7779527950336L, 57962);
    if ((this.onk == 11) || (this.onk == 21))
    {
      GMTrace.o(7779527950336L, 57962);
      return true;
    }
    GMTrace.o(7779527950336L, 57962);
    return false;
  }
  
  public String getUri()
  {
    GMTrace.i(7779259514880L, 57960);
    if (this.onk == 11)
    {
      GMTrace.o(7779259514880L, 57960);
      return "/cgi-bin/mmpay-bin/tenpay/saveverify";
    }
    if (this.onk == 21)
    {
      GMTrace.o(7779259514880L, 57960);
      return "/cgi-bin/mmpay-bin/tenpay/fetchverify";
    }
    GMTrace.o(7779259514880L, 57960);
    return "/cgi-bin/mmpay-bin/tenpay/verify";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\a\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */