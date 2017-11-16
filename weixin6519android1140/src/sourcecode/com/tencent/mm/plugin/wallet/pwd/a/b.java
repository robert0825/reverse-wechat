package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends h
{
  public b(String paramString1, String paramString2)
  {
    GMTrace.i(7737652019200L, 57650);
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("new_passwd", paramString2);
    localHashMap.put("new_rpasswd", paramString2);
    x(localHashMap);
    GMTrace.o(7737652019200L, 57650);
  }
  
  public final int Bb()
  {
    GMTrace.i(7738188890112L, 57654);
    GMTrace.o(7738188890112L, 57654);
    return 468;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7737920454656L, 57652);
    w.d("Micromsg.NetSceneTenpayChangePwd", "errCode " + paramInt + " errMsg: " + paramString);
    GMTrace.o(7737920454656L, 57652);
  }
  
  public final int aoD()
  {
    GMTrace.i(7737786236928L, 57651);
    GMTrace.o(7737786236928L, 57651);
    return 9;
  }
  
  public final String getUri()
  {
    GMTrace.i(7738054672384L, 57653);
    GMTrace.o(7738054672384L, 57653);
    return "/cgi-bin/mmpay-bin/tenpay/changepwd";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pwd\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */