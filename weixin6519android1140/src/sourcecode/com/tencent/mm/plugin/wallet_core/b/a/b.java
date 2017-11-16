package com.tencent.mm.plugin.wallet_core.b.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends h
{
  public BindCardOrder rcj;
  
  public b(com.tencent.mm.plugin.wallet_core.model.o paramo)
  {
    this(paramo, -1);
    GMTrace.i(6829132218368L, 50881);
    GMTrace.o(6829132218368L, 50881);
  }
  
  public b(com.tencent.mm.plugin.wallet_core.model.o paramo, int paramInt)
  {
    GMTrace.i(6829266436096L, 50882);
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap1.put("flag", paramo.flag);
    localHashMap1.put("passwd", paramo.riF);
    localHashMap1.put("verify_code", paramo.riG);
    localHashMap1.put("token", paramo.token);
    if (paramo.riH) {}
    for (String str = "1";; str = "0")
    {
      localHashMap1.put("bind_flag", str);
      if (paramInt > 0)
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
      a(paramo.oek, localHashMap1, localHashMap2);
      x(localHashMap1);
      ap(localHashMap2);
      GMTrace.o(6829266436096L, 50882);
      return;
    }
  }
  
  public final int Bb()
  {
    GMTrace.i(6829803307008L, 50886);
    GMTrace.o(6829803307008L, 50886);
    return 475;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6829534871552L, 50884);
    this.rcj = new BindCardOrder();
    this.rcj.O(paramJSONObject);
    GMTrace.o(6829534871552L, 50884);
  }
  
  public final int aoD()
  {
    GMTrace.i(6829400653824L, 50883);
    GMTrace.o(6829400653824L, 50883);
    return 17;
  }
  
  public final String getUri()
  {
    GMTrace.i(6829669089280L, 50885);
    GMTrace.o(6829669089280L, 50885);
    return "/cgi-bin/mmpay-bin/tenpay/bindverifyreg";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */