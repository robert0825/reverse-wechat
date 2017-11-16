package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class m
  extends h
{
  public m(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(7027371802624L, 52358);
    HashMap localHashMap = new HashMap();
    try
    {
      localHashMap.put("appid", URLEncoder.encode(paramString1, "UTF-8"));
      localHashMap.put("timestamp", URLEncoder.encode(paramString2, "UTF-8"));
      localHashMap.put("noncestr", URLEncoder.encode(paramString3, "UTF-8"));
      localHashMap.put("package", URLEncoder.encode(paramString4, "UTF-8"));
      localHashMap.put("sign", URLEncoder.encode(paramString5, "UTF-8"));
      x(localHashMap);
      w.d("MicroMsg.NetSceneTenpayF2fJsapiCheck", "package: %s, sign: %s", new Object[] { paramString4, paramString5 });
      GMTrace.o(7027371802624L, 52358);
      return;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      w.printErrStackTrace("MicroMsg.NetSceneTenpayF2fJsapiCheck", paramString1, "", new Object[0]);
      GMTrace.o(7027371802624L, 52358);
    }
  }
  
  public final int Bb()
  {
    GMTrace.i(7027774455808L, 52361);
    GMTrace.o(7027774455808L, 52361);
    return 1973;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7027908673536L, 52362);
    w.d("MicroMsg.NetSceneTenpayF2fJsapiCheck", "errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    GMTrace.o(7027908673536L, 52362);
  }
  
  public final int aoD()
  {
    GMTrace.i(7027506020352L, 52359);
    GMTrace.o(7027506020352L, 52359);
    return 0;
  }
  
  public final String getUri()
  {
    GMTrace.i(7027640238080L, 52360);
    GMTrace.o(7027640238080L, 52360);
    return "/cgi-bin/mmpay-bin/f2frcvdlistjsapicheck";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */