package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.o;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class j
  extends h
{
  public String rcp;
  private int scene;
  public String token;
  
  public j(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(7033008947200L, 52400);
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("req_key", paramString2);
    if (paramInt == 6) {
      localHashMap.put("time_stamp", System.currentTimeMillis());
    }
    x(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("check_pwd_scene", String.valueOf(paramInt));
    if (o.clM())
    {
      paramString1.put("uuid_for_bindcard", o.clO());
      paramString1.put("bindcard_scene", o.clN());
    }
    ap(paramString1);
    this.scene = paramInt;
    GMTrace.o(7033008947200L, 52400);
  }
  
  public final int Bb()
  {
    GMTrace.i(7033411600384L, 52403);
    GMTrace.o(7033411600384L, 52403);
    return 476;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7033277382656L, 52402);
    w.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if ((this.scene == 6) || (this.scene == 8))
    {
      this.token = paramJSONObject.optString("usertoken");
      this.rcp = paramJSONObject.optString("token_type");
    }
    GMTrace.o(7033277382656L, 52402);
  }
  
  public final int aoD()
  {
    GMTrace.i(7033143164928L, 52401);
    GMTrace.o(7033143164928L, 52401);
    return 18;
  }
  
  public final String getUri()
  {
    GMTrace.i(7033545818112L, 52404);
    GMTrace.o(7033545818112L, 52404);
    return "/cgi-bin/mmpay-bin/tenpay/checkpwd";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */