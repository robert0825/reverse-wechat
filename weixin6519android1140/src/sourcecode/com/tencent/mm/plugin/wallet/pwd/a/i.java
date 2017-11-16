package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class i
  extends h
{
  public i(String paramString)
  {
    GMTrace.i(19544785551360L, 145620);
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString);
    x(localHashMap);
    GMTrace.o(19544785551360L, 145620);
  }
  
  public final int Bb()
  {
    GMTrace.i(19545322422272L, 145624);
    GMTrace.o(19545322422272L, 145624);
    return 1304;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19545456640000L, 145625);
    this.fUd = parame1;
    int i = super.a(parame, parame1);
    GMTrace.o(19545456640000L, 145625);
    return i;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(19545188204544L, 145623);
    if (paramJSONObject != null) {}
    for (paramJSONObject = paramJSONObject.toString();; paramJSONObject = "null")
    {
      w.v("MicroMsg.NetSceneTouchLockVerifyByPwd", "alvinluo errCode: %d, errMsg: %s, json: %s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject });
      GMTrace.o(19545188204544L, 145623);
      return;
    }
  }
  
  public final int aoD()
  {
    GMTrace.i(19545053986816L, 145622);
    GMTrace.o(19545053986816L, 145622);
    return 0;
  }
  
  public final String getUri()
  {
    GMTrace.i(19544919769088L, 145621);
    GMTrace.o(19544919769088L, 145621);
    return "/cgi-bin/mmpay-bin/tenpay/touchlockauthen";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pwd\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */