package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class q
  extends h
{
  public JSONObject mXK;
  public String rcA;
  
  public q(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong)
  {
    GMTrace.i(16143305670656L, 120277);
    this.rcA = "";
    this.rcA = paramString1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("activity_id", paramString1);
    localHashMap.put("award_id", paramString2);
    localHashMap.put("send_record_id", paramString3);
    localHashMap.put("user_record_id", paramString4);
    localHashMap.put("req_key", paramString5);
    localHashMap.put("transaction_id", paramString6);
    localHashMap.put("activity_mch_id", String.valueOf(paramLong));
    x(localHashMap);
    GMTrace.o(16143305670656L, 120277);
  }
  
  public final int Bb()
  {
    GMTrace.i(7024284794880L, 52335);
    GMTrace.o(7024284794880L, 52335);
    return 1979;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7024419012608L, 52336);
    w.i("MicroMsg.NetSceneTenpayQueryPayaward", "errcode %s errmsg %s json %s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject });
    this.mXK = paramJSONObject;
    GMTrace.o(7024419012608L, 52336);
  }
  
  public final boolean aVo()
  {
    GMTrace.i(7024553230336L, 52337);
    GMTrace.o(7024553230336L, 52337);
    return false;
  }
  
  public final int aoD()
  {
    GMTrace.i(7024016359424L, 52333);
    GMTrace.o(7024016359424L, 52333);
    return 1979;
  }
  
  public final String getUri()
  {
    GMTrace.i(7024150577152L, 52334);
    GMTrace.o(7024150577152L, 52334);
    return "/cgi-bin/mmpay-bin/tenpay/querypayaward";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */