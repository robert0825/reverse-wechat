package com.tencent.mm.plugin.wallet_payu.bind.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends a
{
  public String eMJ;
  public String rtm;
  
  public b(String paramString1, String paramString2)
  {
    GMTrace.i(7916698468352L, 58984);
    this.rtm = paramString1;
    this.eMJ = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("bind_serial", paramString1);
    localHashMap.put("payu_reference", paramString2);
    x(localHashMap);
    GMTrace.o(7916698468352L, 58984);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7916966903808L, 58986);
    GMTrace.o(7916966903808L, 58986);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7916832686080L, 58985);
    GMTrace.o(7916832686080L, 58985);
    return 6;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\bind\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */