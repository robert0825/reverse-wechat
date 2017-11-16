package com.tencent.mm.plugin.appbrand.jsapi.e;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;
import org.json.JSONObject;

public final class k
  extends a
{
  public static final int CTRL_INDEX = 22;
  public static final String NAME = "sendSocketMessage";
  
  public k()
  {
    GMTrace.i(18241799847936L, 135912);
    GMTrace.o(18241799847936L, 135912);
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(18241934065664L, 135913);
    com.tencent.mm.plugin.appbrand.h.j localj = com.tencent.mm.plugin.appbrand.h.k.YU().rA(paramj.hyD);
    if (localj != null)
    {
      String str = paramJSONObject.optString("data");
      if (str != null) {
        try
        {
          if (paramJSONObject.optBoolean("isBuffer"))
          {
            paramJSONObject = ByteBuffer.wrap(Base64.decode(str.getBytes("utf-8"), 2));
            com.tencent.mm.plugin.appbrand.h.j.a(localj.ry("0"), paramJSONObject);
          }
          for (;;)
          {
            paramj.v(paramInt, d("ok", null));
            GMTrace.o(18241934065664L, 135913);
            return;
            com.tencent.mm.plugin.appbrand.h.j.a(localj.ry("0"), str);
          }
          paramj.v(paramInt, d("fail:message is null or nil", null));
        }
        catch (Exception paramJSONObject)
        {
          w.e("MicroMsg.JsApiSendSocketMessage", "sendSocketMessage error : %s", new Object[] { paramJSONObject });
          paramj.v(paramInt, d("fail", null));
          GMTrace.o(18241934065664L, 135913);
          return;
        }
      }
      GMTrace.o(18241934065664L, 135913);
      return;
    }
    paramj.v(paramInt, d("fail:webSocket is not connected", null));
    GMTrace.o(18241934065664L, 135913);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\e\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */