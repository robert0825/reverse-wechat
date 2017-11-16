package com.tencent.mm.plugin.offline.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class p
  extends h
{
  public p(String paramString)
  {
    GMTrace.i(6199114203136L, 46187);
    HashMap localHashMap = new HashMap();
    localHashMap.put("device_id", com.tencent.mm.compatible.d.p.ta());
    localHashMap.put("passwd", paramString);
    x(localHashMap);
    GMTrace.o(6199114203136L, 46187);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6199382638592L, 46189);
    GMTrace.o(6199382638592L, 46189);
  }
  
  public final int aoD()
  {
    GMTrace.i(6199248420864L, 46188);
    GMTrace.o(6199248420864L, 46188);
    return 51;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */