package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h
  extends com.tencent.mm.wallet_core.g.a.h
{
  public h(String paramString1, String paramString2, String paramString3, Profession paramProfession)
  {
    GMTrace.i(6840674942976L, 50967);
    w.d("MicroMsg.NetSceneTenpaySetUserExInfo", "country: %s, province: %s, city: %s", new Object[] { paramString1, paramString2, paramString3 });
    HashMap localHashMap = new HashMap();
    if (!bg.nm(paramString1)) {
      localHashMap.put("user_country", paramString1);
    }
    if (!bg.nm(paramString2)) {
      localHashMap.put("user_province", paramString2);
    }
    if (!bg.nm(paramString3)) {
      localHashMap.put("user_city", paramString3);
    }
    if (paramProfession != null)
    {
      w.d("MicroMsg.NetSceneTenpaySetUserExInfo", "name: %s, type: %s", new Object[] { paramProfession.rdP, Integer.valueOf(paramProfession.rdQ) });
      localHashMap.put("profession_name", paramProfession.rdP);
      localHashMap.put("profession_type", String.valueOf(paramProfession.rdQ));
    }
    x(localHashMap);
    GMTrace.o(6840674942976L, 50967);
  }
  
  public final int Bb()
  {
    GMTrace.i(6841211813888L, 50971);
    GMTrace.o(6841211813888L, 50971);
    return 1978;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6840943378432L, 50969);
    w.i("MicroMsg.NetSceneTenpaySetUserExInfo", "errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    GMTrace.o(6840943378432L, 50969);
  }
  
  public final int aoD()
  {
    GMTrace.i(6840809160704L, 50968);
    GMTrace.o(6840809160704L, 50968);
    return 1978;
  }
  
  public final String getUri()
  {
    GMTrace.i(6841077596160L, 50970);
    GMTrace.o(6841077596160L, 50970);
    return "/cgi-bin/mmpay-bin/tenpay/setuserexinfo";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\id_verify\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */