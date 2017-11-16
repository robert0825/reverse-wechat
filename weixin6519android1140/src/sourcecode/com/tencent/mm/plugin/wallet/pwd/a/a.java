package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends h
{
  public a(String paramString)
  {
    GMTrace.i(19546396164096L, 145632);
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString);
    x(localHashMap);
    GMTrace.o(19546396164096L, 145632);
  }
  
  public final int Bb()
  {
    GMTrace.i(19546664599552L, 145634);
    GMTrace.o(19546664599552L, 145634);
    return 1321;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(19546933035008L, 145636);
    w.i("MicroMsg.NetSceneCloseWalletLock", "alvinluo close wallet lock errCode: %d, errMsg: %s, json: %s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject });
    GMTrace.o(19546933035008L, 145636);
  }
  
  public final int aoD()
  {
    GMTrace.i(19546530381824L, 145633);
    GMTrace.o(19546530381824L, 145633);
    return 0;
  }
  
  public final String getUri()
  {
    GMTrace.i(19546798817280L, 145635);
    GMTrace.o(19546798817280L, 145635);
    return "/cgi-bin/mmpay-bin/tenpay/closewalletlock";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pwd\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */