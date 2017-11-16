package com.tencent.mm.plugin.offline.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.wallet_core.g.a.h
{
  public String TAG;
  
  public b(boolean paramBoolean)
  {
    GMTrace.i(19263867846656L, 143527);
    this.TAG = "MicroMsg.NetSceneOfflineAckMsg";
    HashMap localHashMap = new HashMap();
    localHashMap.put("ack_key", a.aWq());
    localHashMap.put("req_key", a.aWr());
    localHashMap.put("paymsg_type", a.aWs());
    localHashMap.put("transactionid", a.aWt());
    localHashMap.put("network", a.getNetworkType(ab.getContext()));
    if (k.nAn)
    {
      str = "1";
      localHashMap.put("processed", str);
      if (!a.aWu()) {
        break label219;
      }
      str = "1";
      label143:
      localHashMap.put("is_pos_enabled", str);
      if (!paramBoolean) {
        break label225;
      }
    }
    label219:
    label225:
    for (String str = "pull";; str = "push")
    {
      localHashMap.put("channel", str);
      localHashMap.put("timestamp", System.currentTimeMillis() / 1000L);
      x(localHashMap);
      GMTrace.o(19263867846656L, 143527);
      return;
      str = "0";
      break;
      str = "0";
      break label143;
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(16592666624000L, 123625);
    if (paramInt == 0)
    {
      w.v(this.TAG, "response ok");
      g.ork.a(135L, 68L, 1L, true);
      paramInt = paramJSONObject.optInt("poll_time") * 1000;
      if (paramInt > 0)
      {
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vya, Integer.valueOf(paramInt));
      }
      GMTrace.o(16592666624000L, 123625);
      return;
    }
    w.v(this.TAG, "response fail");
    g.ork.a(135L, 69L, 1L, true);
    GMTrace.o(16592666624000L, 123625);
  }
  
  public final int aoD()
  {
    GMTrace.i(16592800841728L, 123626);
    GMTrace.o(16592800841728L, 123626);
    return 1230;
  }
  
  public final String getUri()
  {
    GMTrace.i(16592935059456L, 123627);
    GMTrace.o(16592935059456L, 123627);
    return "/cgi-bin/mmpay-bin/tenpay/offlineackmsg";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */