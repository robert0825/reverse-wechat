package com.tencent.mm.plugin.wallet_payu.pwd.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends a
{
  public String eMJ;
  public String ruW;
  public String ruX;
  
  public d(String paramString1, String paramString2)
  {
    GMTrace.i(7956561133568L, 59281);
    this.ruW = paramString1;
    this.ruX = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("payu_reference", paramString1);
    localHashMap.put("new_pin", paramString2);
    x(localHashMap);
    GMTrace.o(7956561133568L, 59281);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7956829569024L, 59283);
    this.eMJ = paramJSONObject.optString("payu_reference");
    GMTrace.o(7956829569024L, 59283);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7956695351296L, 59282);
    GMTrace.o(7956695351296L, 59282);
    return 19;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pwd\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */