package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class i
  extends h
{
  public BindCardOrder rcj;
  
  public i(com.tencent.mm.plugin.wallet_core.model.o paramo)
  {
    this(paramo, -1);
    GMTrace.i(7030324592640L, 52380);
    GMTrace.o(7030324592640L, 52380);
  }
  
  public i(com.tencent.mm.plugin.wallet_core.model.o paramo, int paramInt)
  {
    GMTrace.i(7030458810368L, 52381);
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    a(paramo.oek, localHashMap1, localHashMap2);
    localHashMap1.put("flag", paramo.flag);
    if ("2".equals(paramo.flag)) {
      localHashMap1.put("passwd", paramo.riF);
    }
    localHashMap1.put("verify_code", paramo.riG);
    localHashMap1.put("token", paramo.token);
    if ((paramo.oek != null) && (!bg.nm(paramo.oek.eHG))) {
      localHashMap1.put("req_key", paramo.oek.eHG);
    }
    if (paramInt >= 0)
    {
      localHashMap1.put("realname_scene", String.valueOf(paramInt));
      w.i("MicroMsg.NetSenceTenPayBase", "realname_scene=%d", new Object[] { Integer.valueOf(paramInt) });
    }
    if (!bg.nm(paramo.nDt)) {
      localHashMap1.put("bank_type", paramo.nDt);
    }
    if (com.tencent.mm.wallet_core.c.o.clM())
    {
      localHashMap2.put("uuid_for_bindcard", com.tencent.mm.wallet_core.c.o.clO());
      localHashMap2.put("bindcard_scene", com.tencent.mm.wallet_core.c.o.clN());
    }
    x(localHashMap1);
    ap(localHashMap2);
    GMTrace.o(7030458810368L, 52381);
  }
  
  public final int Bb()
  {
    GMTrace.i(7030995681280L, 52385);
    GMTrace.o(7030995681280L, 52385);
    return 472;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7030727245824L, 52383);
    w.i("test", "test");
    this.rcj = new BindCardOrder();
    this.rcj.O(paramJSONObject);
    GMTrace.o(7030727245824L, 52383);
  }
  
  public final int aoD()
  {
    GMTrace.i(7030593028096L, 52382);
    GMTrace.o(7030593028096L, 52382);
    return 13;
  }
  
  public final String getUri()
  {
    GMTrace.i(7030861463552L, 52384);
    GMTrace.o(7030861463552L, 52384);
    return "/cgi-bin/mmpay-bin/tenpay/bindverify";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */