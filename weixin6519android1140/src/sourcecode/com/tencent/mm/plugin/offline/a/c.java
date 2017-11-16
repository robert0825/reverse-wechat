package com.tencent.mm.plugin.offline.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends h
{
  public c(String paramString)
  {
    GMTrace.i(15374372306944L, 114548);
    HashMap localHashMap = new HashMap();
    localHashMap.put("req_key", paramString);
    x(localHashMap);
    GMTrace.o(15374372306944L, 114548);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(15374774960128L, 114551);
    w.i("NetSceneOfflineCancelPay", "errcode=" + paramInt + ";errmsg=" + paramString);
    GMTrace.o(15374774960128L, 114551);
  }
  
  public final int aoD()
  {
    GMTrace.i(15374506524672L, 114549);
    GMTrace.o(15374506524672L, 114549);
    return 1385;
  }
  
  public final String getUri()
  {
    GMTrace.i(15374640742400L, 114550);
    GMTrace.o(15374640742400L, 114550);
    return "/cgi-bin/mmpay-bin/tenpay/offlinecancelpay";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */