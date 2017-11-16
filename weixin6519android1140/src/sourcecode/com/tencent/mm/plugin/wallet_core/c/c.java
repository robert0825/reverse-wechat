package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.d.d;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.model.q;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.wallet_core.g.a.h
{
  public c()
  {
    GMTrace.i(7028713979904L, 52368);
    n.byB().fTZ.eZ("WalletBulletin", "delete from WalletBulletin");
    x(new HashMap());
    GMTrace.o(7028713979904L, 52368);
  }
  
  public final int Bb()
  {
    GMTrace.i(7029116633088L, 52371);
    GMTrace.o(7029116633088L, 52371);
    return 1679;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7029250850816L, 52372);
    w.i("MicroMsg.NetSceneGetBannerInfo", "NetSceneGetBannerInfo errCode = " + paramInt + " " + paramJSONObject);
    if (paramInt == 0)
    {
      q.S(paramJSONObject);
      long l = paramJSONObject.optLong("banner_update_interval", 0L);
      w.i("MicroMsg.NetSceneGetBannerInfo", "update_interval=" + l);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vts, Long.valueOf(l));
      paramString = paramJSONObject.optJSONObject("lbs_info");
      if (paramString != null)
      {
        JSONArray localJSONArray = paramString.optJSONArray("config_array");
        if ((localJSONArray != null) && (localJSONArray.length() > 0))
        {
          com.tencent.mm.plugin.wallet_core.model.h localh = com.tencent.mm.plugin.wallet_core.model.h.byo();
          if (localJSONArray != null)
          {
            w.d("MicroMsg.GpsReportHelper", localJSONArray.toString());
            localh.rgx = localJSONArray;
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xy().xh().a(w.a.vuj, localJSONArray.toString());
          }
        }
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vuk, paramString.optString("title"));
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vul, paramString.optString("content"));
      }
      paramJSONObject = paramJSONObject.optJSONObject("realname_info");
      if (paramJSONObject != null)
      {
        paramString = paramJSONObject.optString("title");
        paramJSONObject = paramJSONObject.optString("balance_title");
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vum, paramString);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vun, paramJSONObject);
      }
    }
    GMTrace.o(7029250850816L, 52372);
  }
  
  public final int aoD()
  {
    GMTrace.i(7028848197632L, 52369);
    GMTrace.o(7028848197632L, 52369);
    return 1679;
  }
  
  public final String getUri()
  {
    GMTrace.i(7028982415360L, 52370);
    GMTrace.o(7028982415360L, 52370);
    return "/cgi-bin/mmpay-bin/tenpay/getbannerinfo";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */