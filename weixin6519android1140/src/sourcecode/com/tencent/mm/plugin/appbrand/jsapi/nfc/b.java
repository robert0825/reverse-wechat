package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends JsApiAppBrandNFCBase
{
  public static final int CTRL_INDEX = 358;
  public static final String NAME = "getHCEState";
  
  public b()
  {
    GMTrace.i(20710734954496L, 154307);
    GMTrace.o(20710734954496L, 154307);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(20710869172224L, 154308);
    super.a(paramj, paramJSONObject, paramInt);
    a(new JsApiAppBrandNFCBase.a()
    {
      public final void z(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(20709526994944L, 154298);
        w.i("MicroMsg.JsApiGetHCEState", "alvinluo checkIsSupport onResult errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
        HashMap localHashMap = new HashMap();
        localHashMap.put("errCode", Integer.valueOf(paramAnonymousInt));
        if (paramAnonymousInt == 0)
        {
          paramj.v(paramInt, b.this.d("ok", localHashMap));
          GMTrace.o(20709526994944L, 154298);
          return;
        }
        paramj.v(paramInt, b.this.d("fail " + paramAnonymousString, localHashMap));
        GMTrace.o(20709526994944L, 154298);
      }
    });
    GMTrace.o(20710869172224L, 154308);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\nfc\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */