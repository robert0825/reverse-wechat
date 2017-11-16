package com.tencent.mm.wallet_core.e.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.n;
import java.util.HashMap;
import org.json.JSONObject;

public final class b
  extends a
{
  public b()
  {
    GMTrace.i(1529276792832L, 11394);
    x(new HashMap());
    GMTrace.o(1529276792832L, 11394);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(1529545228288L, 11396);
    w.d("Micromsg.NetScenePayUTimeSeed", " errCode: " + paramInt + " errMsg :" + paramString);
    paramString = paramJSONObject.optString("time_stamp");
    if (!bg.nm(paramString)) {
      n.setTimeStamp(paramString);
    }
    GMTrace.o(1529545228288L, 11396);
  }
  
  public final int bxZ()
  {
    GMTrace.i(1529411010560L, 11395);
    GMTrace.o(1529411010560L, 11395);
    return 28;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\e\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */