package com.tencent.mm.wallet_core.g.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.n;
import java.util.HashMap;
import org.json.JSONObject;

public final class l
  extends h
{
  public l()
  {
    GMTrace.i(1524176519168L, 11356);
    x(new HashMap());
    GMTrace.o(1524176519168L, 11356);
  }
  
  public final int Bb()
  {
    GMTrace.i(1524713390080L, 11360);
    GMTrace.o(1524713390080L, 11360);
    return 477;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(1524444954624L, 11358);
    w.d("Micromsg.NetSceneTenpayTimeSeed", " errCode: " + paramInt + " errMsg :" + paramString);
    paramString = paramJSONObject.optString("time_stamp");
    if (!bg.nm(paramString))
    {
      n.setTimeStamp(paramString);
      GMTrace.o(1524444954624L, 11358);
      return;
    }
    w.w("Micromsg.NetSceneTenpayTimeSeed", "hy: no timeseed. use local timeseed");
    n.setTimeStamp(System.currentTimeMillis() / 1000L);
    GMTrace.o(1524444954624L, 11358);
  }
  
  public final int aoD()
  {
    GMTrace.i(1524310736896L, 11357);
    GMTrace.o(1524310736896L, 11357);
    return 19;
  }
  
  public final String getUri()
  {
    GMTrace.i(1524579172352L, 11359);
    GMTrace.o(1524579172352L, 11359);
    return "/cgi-bin/mmpay-bin/tenpay/timeseed";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\g\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */