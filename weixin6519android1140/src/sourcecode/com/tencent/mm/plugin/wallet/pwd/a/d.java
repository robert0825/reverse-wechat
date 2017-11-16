package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.r;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends h
  implements k
{
  public JSONObject raC;
  
  public d(boolean paramBoolean, String paramString1, String paramString2)
  {
    GMTrace.i(19545590857728L, 145626);
    HashMap localHashMap = new HashMap();
    w.d("MicroMsg.NetSceneTenpayQueryBasicSecurityInfo", "cpuId: %s, uid: %s", new Object[] { paramString1, paramString2 });
    localHashMap.put("is_root", "0");
    if (paramBoolean) {}
    for (String str = "1";; str = "0")
    {
      localHashMap.put("is_device_open_touch", str);
      localHashMap.put("cpu_id", paramString1);
      localHashMap.put("app_uid", paramString2);
      x(localHashMap);
      GMTrace.o(19545590857728L, 145626);
      return;
    }
  }
  
  public final int Bb()
  {
    GMTrace.i(19546127728640L, 145630);
    GMTrace.o(19546127728640L, 145630);
    return 1669;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19545725075456L, 145627);
    this.fUd = parame1;
    int i = super.a(parame, parame1);
    GMTrace.o(19545725075456L, 145627);
    return i;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(19546261946368L, 145631);
    w.i("MicroMsg.NetSceneTenpayQueryBasicSecurityInfo", "alvinluo errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    if ((paramInt == 0) && (paramJSONObject != null))
    {
      w.v("MicroMsg.NetSceneTenpayQueryBasicSecurityInfo", "alvinluo json: %s", new Object[] { paramJSONObject.toString() });
      this.raC = paramJSONObject;
      r.clT().ab(this.raC);
    }
    GMTrace.o(19546261946368L, 145631);
  }
  
  public final int aoD()
  {
    GMTrace.i(19545993510912L, 145629);
    GMTrace.o(19545993510912L, 145629);
    return 0;
  }
  
  public final String getUri()
  {
    GMTrace.i(19545859293184L, 145628);
    GMTrace.o(19545859293184L, 145628);
    return "/cgi-bin/mmpay-bin/tenpay/paysecurity";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pwd\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */