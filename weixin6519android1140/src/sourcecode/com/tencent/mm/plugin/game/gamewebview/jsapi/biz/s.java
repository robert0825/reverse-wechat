package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class s
  extends a
{
  public static final int CTRL_BYTE = 16;
  public static final String NAME = "getNetworkType";
  
  public s()
  {
    GMTrace.i(17029947981824L, 126883);
    GMTrace.o(17029947981824L, 126883);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17030082199552L, 126884);
    w.i("MicroMsg.GameJsApiGetNetworkType", "invoke");
    paramJSONObject = paramd.getContext();
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.GameJsApiGetNetworkType", "context is null");
      GMTrace.o(17030082199552L, 126884);
      return;
    }
    if (!am.isConnected(paramJSONObject))
    {
      w.i("MicroMsg.GameJsApiGetNetworkType", "getNetworkType, not connected");
      paramd.v(paramInt, a.d("network_type:fail", null));
      GMTrace.o(17030082199552L, 126884);
      return;
    }
    int i = am.getNetType(paramJSONObject);
    w.i("MicroMsg.GameJsApiGetNetworkType", "getNetworkType, type = " + i);
    HashMap localHashMap = new HashMap();
    if (am.isWifi(paramJSONObject))
    {
      w.i("MicroMsg.GameJsApiGetNetworkType", "getNetworkType, wifi");
      paramd.v(paramInt, a.d("network_type:wifi", null));
      GMTrace.o(17030082199552L, 126884);
      return;
    }
    if (am.is2G(paramJSONObject))
    {
      w.i("MicroMsg.GameJsApiGetNetworkType", "getNetworkType, 2g");
      localHashMap.put("subtype", "2g");
    }
    for (;;)
    {
      paramd.v(paramInt, d("network_type:wwan", localHashMap));
      GMTrace.o(17030082199552L, 126884);
      return;
      if (am.is3G(paramJSONObject))
      {
        w.i("MicroMsg.GameJsApiGetNetworkType", "getNetworkType, 3g");
        localHashMap.put("subtype", "3g");
      }
      else if (am.is4G(paramJSONObject))
      {
        w.i("MicroMsg.GameJsApiGetNetworkType", "getNetworkType, 4g");
        localHashMap.put("subtype", "4g");
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */