package com.tencent.mm.plugin.offline.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.wallet_core.g.a.h
{
  public String nAw;
  public int nAx;
  public String nAy;
  
  public d()
  {
    GMTrace.i(15374909177856L, 114552);
    HashMap localHashMap = new HashMap();
    com.tencent.mm.kernel.h.xz();
    Object localObject = com.tencent.mm.kernel.h.xy().xh().get(w.a.vyb, null);
    if (localObject != null) {
      localHashMap.put("ack_key", (String)localObject);
    }
    localHashMap.put("timestamp", System.currentTimeMillis());
    x(localHashMap);
    GMTrace.o(15374909177856L, 114552);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(15375311831040L, 114555);
    if (paramInt == 0)
    {
      g.ork.a(135L, 56L, 1L, true);
      this.nAw = paramJSONObject.optString("appmsg");
      this.nAx = (paramJSONObject.optInt("poll_time") * 1000);
      this.nAy = paramJSONObject.optString("ack_key");
      if (this.nAx > 0)
      {
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vya, Integer.valueOf(this.nAx));
      }
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vyb, this.nAy);
      GMTrace.o(15375311831040L, 114555);
      return;
    }
    g.ork.a(135L, 57L, 1L, true);
    GMTrace.o(15375311831040L, 114555);
  }
  
  public final boolean aVn()
  {
    GMTrace.i(15375446048768L, 114556);
    GMTrace.o(15375446048768L, 114556);
    return false;
  }
  
  public final int aoD()
  {
    GMTrace.i(15375043395584L, 114553);
    GMTrace.o(15375043395584L, 114553);
    return 1981;
  }
  
  public final String getUri()
  {
    GMTrace.i(15375177613312L, 114554);
    GMTrace.o(15375177613312L, 114554);
    return "/cgi-bin/mmpay-bin/tenpay/offlinegetmsg";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */