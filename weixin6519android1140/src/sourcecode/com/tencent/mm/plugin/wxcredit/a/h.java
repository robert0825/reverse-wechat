package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h
  extends com.tencent.mm.wallet_core.g.a.h
{
  public h(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(8987353284608L, 66961);
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
    GMTrace.o(8987353284608L, 66961);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(8987621720064L, 66963);
    w.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    GMTrace.o(8987621720064L, 66963);
  }
  
  public final int aoD()
  {
    GMTrace.i(8987487502336L, 66962);
    GMTrace.o(8987487502336L, 66962);
    return 66;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */