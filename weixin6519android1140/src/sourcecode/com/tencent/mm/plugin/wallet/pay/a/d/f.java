package com.tencent.mm.plugin.wallet.pay.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.e.b;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class f
  extends i
{
  private int onk;
  public Orders qYC;
  
  public f(o paramo, Orders paramOrders)
  {
    GMTrace.i(7781406998528L, 57976);
    this.qYC = null;
    this.onk = -1;
    this.qYC = paramOrders;
    if (paramo.oek != null)
    {
      this.onk = paramo.oek.ePL;
      i = paramo.oek.ePH;
    }
    List localList = paramOrders.rhv;
    if (localList.size() > 0) {
      localObject = ((Orders.Commodity)localList.get(0)).eRP;
    }
    a(paramOrders.eHG, (String)localObject, this.onk, i, paramo.nDt, paramo.nDu);
    paramOrders = new HashMap();
    localObject = new HashMap();
    if (!bg.nm(paramo.riF)) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.NetSceneTenpayVertifyReg", "hy: has pwd: %b", new Object[] { Boolean.valueOf(bool) });
      a(paramo.oek, paramOrders, (Map)localObject, bool);
      paramOrders.put("flag", paramo.flag);
      paramOrders.put("passwd", paramo.riF);
      paramOrders.put("verify_code", paramo.riG);
      paramOrders.put("token", paramo.token);
      paramOrders.put("favorcomposedid", paramo.rep);
      paramOrders.put("default_favorcomposedid", paramo.reo);
      x(paramOrders);
      ap((Map)localObject);
      GMTrace.o(7781406998528L, 57976);
      return;
    }
  }
  
  public int Bb()
  {
    GMTrace.i(7781943869440L, 57980);
    if (this.onk == 11)
    {
      GMTrace.o(7781943869440L, 57980);
      return 1684;
    }
    if (this.onk == 21)
    {
      GMTrace.o(7781943869440L, 57980);
      return 1608;
    }
    GMTrace.o(7781943869440L, 57980);
    return 474;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7781675433984L, 57978);
    super.a(paramInt, paramString, paramJSONObject);
    if (paramInt != 0)
    {
      GMTrace.o(7781675433984L, 57978);
      return;
    }
    paramString = paramJSONObject.optString("bind_serial");
    w.d("MicroMsg.NetSceneTenpayVertifyReg", "Pay Success! saving bind_serial:" + paramString);
    if ("1".equals(paramJSONObject.optString("pay_flag")))
    {
      this.qZD = true;
      this.qYC = Orders.a(paramJSONObject, this.qYC);
    }
    for (;;)
    {
      w.i("MicroMsg.NetSceneTenpayVertifyReg", "mPayScene:" + this.onk);
      if (this.onk != 39) {
        break;
      }
      w.i("MicroMsg.NetSceneTenpayVertifyReg", "it's the sns scene, parse the sns pay data");
      b.V(paramJSONObject);
      GMTrace.o(7781675433984L, 57978);
      return;
      this.qZD = false;
    }
    w.i("MicroMsg.NetSceneTenpayVertifyReg", "it's not the sns scene");
    GMTrace.o(7781675433984L, 57978);
  }
  
  public final int aoD()
  {
    GMTrace.i(7781541216256L, 57977);
    GMTrace.o(7781541216256L, 57977);
    return 16;
  }
  
  public final boolean bxj()
  {
    GMTrace.i(7782078087168L, 57981);
    if ((this.onk == 11) || (this.onk == 21))
    {
      GMTrace.o(7782078087168L, 57981);
      return true;
    }
    GMTrace.o(7782078087168L, 57981);
    return false;
  }
  
  public String getUri()
  {
    GMTrace.i(7781809651712L, 57979);
    if (this.onk == 11)
    {
      GMTrace.o(7781809651712L, 57979);
      return "/cgi-bin/mmpay-bin/tenpay/saveverifyreg";
    }
    if (this.onk == 21)
    {
      GMTrace.o(7781809651712L, 57979);
      return "/cgi-bin/mmpay-bin/tenpay/fetchverifyreg";
    }
    GMTrace.o(7781809651712L, 57979);
    return "/cgi-bin/mmpay-bin/tenpay/verifyreg";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\a\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */