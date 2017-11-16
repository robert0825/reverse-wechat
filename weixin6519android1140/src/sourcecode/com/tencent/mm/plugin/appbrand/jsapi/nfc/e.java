package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends JsApiAppBrandNFCBase
{
  public static final int CTRL_INDEX = 353;
  public static final String NAME = "stopHCE";
  
  public e()
  {
    GMTrace.i(20713419309056L, 154327);
    GMTrace.o(20713419309056L, 154327);
  }
  
  public static void a(j paramj, int paramInt, String paramString)
  {
    GMTrace.i(20713687744512L, 154329);
    w.i("MicroMsg.JsApiNFCStartHCE", "alvinluo stopHCE callback result: %s", new Object[] { paramString });
    if (paramj != null) {
      paramj.v(paramInt, paramString);
    }
    GMTrace.o(20713687744512L, 154329);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(20713553526784L, 154328);
    a(new JsApiAppBrandNFCBase.a()
    {
      public final void z(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(20717848494080L, 154360);
        Object localObject = new HashMap();
        ((Map)localObject).put("errCode", Integer.valueOf(paramAnonymousInt));
        if (paramAnonymousInt == 0)
        {
          paramAnonymousString = e.this;
          localObject = paramj;
          paramAnonymousInt = paramInt;
          HCEEventLogic.qK(((j)localObject).hyD);
          HCEEventLogic.a(null);
          HCEEventLogic.c(((j)localObject).hyD, 13, null);
          HashMap localHashMap = new HashMap(2);
          localHashMap.put("errCode", Integer.valueOf(0));
          e.a((j)localObject, paramAnonymousInt, paramAnonymousString.d("ok", localHashMap));
          GMTrace.o(20717848494080L, 154360);
          return;
        }
        e.a(paramj, paramInt, e.this.d("fail: " + paramAnonymousString, (Map)localObject));
        GMTrace.o(20717848494080L, 154360);
      }
    });
    GMTrace.o(20713553526784L, 154328);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\nfc\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */