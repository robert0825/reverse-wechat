package com.tencent.mm.plugin.appbrand.dynamic.e;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends c
{
  public d()
  {
    super("onNetworkStatusChange");
    GMTrace.i(17727074861056L, 132077);
    GMTrace.o(17727074861056L, 132077);
  }
  
  d(int paramInt)
  {
    super("onNetworkStatusChange", paramInt);
    GMTrace.i(19923547979776L, 148442);
    GMTrace.o(19923547979776L, 148442);
  }
  
  public final JSONObject on()
  {
    GMTrace.i(17727209078784L, 132078);
    Object localObject = new HashMap();
    Context localContext = ab.getContext();
    boolean bool = am.isConnected(localContext);
    ((HashMap)localObject).put("isConnected", Boolean.valueOf(bool));
    if (!bool) {
      ((HashMap)localObject).put("networkType", "none");
    }
    for (;;)
    {
      localObject = new JSONObject((Map)localObject);
      GMTrace.o(17727209078784L, 132078);
      return (JSONObject)localObject;
      if (am.is2G(localContext)) {
        ((HashMap)localObject).put("networkType", "2g");
      } else if (am.is3G(localContext)) {
        ((HashMap)localObject).put("networkType", "3g");
      } else if (am.is4G(localContext)) {
        ((HashMap)localObject).put("networkType", "4g");
      } else if (am.isWifi(localContext)) {
        ((HashMap)localObject).put("networkType", "wifi");
      } else {
        ((HashMap)localObject).put("networkType", "unknown");
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */