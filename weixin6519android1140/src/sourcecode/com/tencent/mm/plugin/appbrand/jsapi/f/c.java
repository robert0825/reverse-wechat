package com.tencent.mm.plugin.appbrand.jsapi.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.pluginsdk.wallet.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 86;
  public static final String NAME = "bindPaymentCard";
  
  public c()
  {
    GMTrace.i(14427466235904L, 107493);
    GMTrace.o(14427466235904L, 107493);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(14427600453632L, 107494);
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(14427600453632L, 107494);
      return;
    }
    MMActivity localMMActivity = a(paramj);
    if (localMMActivity == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(14427600453632L, 107494);
      return;
    }
    try
    {
      paramJSONObject.put("appId", paramj.hyD);
      a locala = a.ijo;
      paramj = new a.3(locala, new b.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, Map<String, Object> paramAnonymousMap)
        {
          GMTrace.i(20740799725568L, 154531);
          switch (paramAnonymousInt1)
          {
          default: 
            paramj.v(paramInt, c.this.d("fail", null));
            GMTrace.o(20740799725568L, 154531);
            return;
          }
          paramj.v(paramInt, c.this.d("ok", null));
          GMTrace.o(20740799725568L, 154531);
        }
      });
      paramJSONObject = new f(paramJSONObject);
      paramJSONObject.ePM = 4;
      g.b(localMMActivity, paramJSONObject, locala.hashCode() & 0xFFFF, paramj);
      GMTrace.o(14427600453632L, 107494);
      return;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiBindPaymentCard", paramJSONObject.getMessage());
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(14427600453632L, 107494);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\f\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */