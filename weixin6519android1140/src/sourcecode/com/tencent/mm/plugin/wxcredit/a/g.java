package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g
  extends h
{
  public String ePK;
  
  public g(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(8991245598720L, 66990);
    this.ePK = null;
    HashMap localHashMap = new HashMap();
    localHashMap.put("verify_code", paramString1);
    localHashMap.put("session_key", paramString2);
    localHashMap.put("passwd", paramString3);
    localHashMap.put("bind_serialno", paramString4);
    localHashMap.put("bank_type", paramString5);
    x(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("banktype", paramString5);
    ap(paramString1);
    GMTrace.o(8991245598720L, 66990);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(8991514034176L, 66992);
    w.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(8991514034176L, 66992);
      return;
    }
    this.ePK = paramJSONObject.optString("app_username");
    GMTrace.o(8991514034176L, 66992);
  }
  
  public final int aoD()
  {
    GMTrace.i(8991379816448L, 66991);
    GMTrace.o(8991379816448L, 66991);
    return 65;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */