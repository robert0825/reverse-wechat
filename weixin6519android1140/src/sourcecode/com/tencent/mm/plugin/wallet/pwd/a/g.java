package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g
  extends h
{
  public g(String paramString1, String paramString2)
  {
    GMTrace.i(18433060110336L, 137337);
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap1.put("resetpwd_token", paramString2);
    localHashMap1.put("passwd", paramString1);
    x(localHashMap1);
    ap(localHashMap2);
    GMTrace.o(18433060110336L, 137337);
  }
  
  public final int Bb()
  {
    GMTrace.i(18433328545792L, 137339);
    GMTrace.o(18433328545792L, 137339);
    return 1371;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(18433194328064L, 137338);
    w.d("MicroMsg.NetSceneTenpayResetPwdByToken", " json %s", new Object[] { paramJSONObject.toString() });
    GMTrace.o(18433194328064L, 137338);
  }
  
  public final int aoD()
  {
    GMTrace.i(18433462763520L, 137340);
    GMTrace.o(18433462763520L, 137340);
    return 1371;
  }
  
  public final String getUri()
  {
    GMTrace.i(18433596981248L, 137341);
    GMTrace.o(18433596981248L, 137341);
    return "/cgi-bin/mmpay-bin/tenpay/resetpwdbytoken";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pwd\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */