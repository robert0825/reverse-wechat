package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends h
{
  public a(int paramInt)
  {
    GMTrace.i(6844969910272L, 50999);
    HashMap localHashMap = new HashMap();
    localHashMap.put("scene", String.valueOf(paramInt));
    x(localHashMap);
    GMTrace.o(6844969910272L, 50999);
  }
  
  public final int Bb()
  {
    GMTrace.i(6845372563456L, 51002);
    GMTrace.o(6845372563456L, 51002);
    return 1584;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6845238345728L, 51001);
    w.i("MicroMsg.NetSceneAgreeDisclaimer", "errCode = " + paramInt + ";errMsg = " + paramString);
    GMTrace.o(6845238345728L, 51001);
  }
  
  public final int aoD()
  {
    GMTrace.i(6845104128000L, 51000);
    GMTrace.o(6845104128000L, 51000);
    return 1584;
  }
  
  public final String getUri()
  {
    GMTrace.i(6845506781184L, 51003);
    GMTrace.o(6845506781184L, 51003);
    return "/cgi-bin/mmpay-bin/tenpay/realnamesetduty";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\id_verify\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */