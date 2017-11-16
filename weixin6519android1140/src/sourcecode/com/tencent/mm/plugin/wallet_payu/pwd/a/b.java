package com.tencent.mm.plugin.wallet_payu.pwd.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends a
{
  public b(String paramString1, String paramString2)
  {
    GMTrace.i(7954145214464L, 59263);
    HashMap localHashMap = new HashMap();
    localHashMap.put("old_pin", paramString1);
    localHashMap.put("new_pin", paramString2);
    x(localHashMap);
    GMTrace.o(7954145214464L, 59263);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7954413649920L, 59265);
    GMTrace.o(7954413649920L, 59265);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7954279432192L, 59264);
    GMTrace.o(7954279432192L, 59264);
    return 2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pwd\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */