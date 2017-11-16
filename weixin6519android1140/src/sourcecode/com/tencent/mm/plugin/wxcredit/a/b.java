package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends h
{
  public String name;
  public String skr;
  public boolean sks;
  public String token;
  
  public b(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(8988427026432L, 66969);
    this.sks = true;
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("bank_type", paramString2);
    localHashMap.put("check_pwd_scene", String.valueOf(paramInt));
    x(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("check_pwd_scene", String.valueOf(paramInt));
    ap(paramString1);
    GMTrace.o(8988427026432L, 66969);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(8988695461888L, 66971);
    w.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(8988695461888L, 66971);
      return;
    }
    this.token = paramJSONObject.optString("session_key");
    if ("1".equals(paramJSONObject.optString("all_info")))
    {
      this.sks = false;
      GMTrace.o(8988695461888L, 66971);
      return;
    }
    this.sks = true;
    this.name = paramJSONObject.optString("name");
    this.skr = paramJSONObject.optString("cre_id");
    GMTrace.o(8988695461888L, 66971);
  }
  
  public final int aoD()
  {
    GMTrace.i(8988561244160L, 66970);
    GMTrace.o(8988561244160L, 66970);
    return 63;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */