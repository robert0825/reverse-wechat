package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends JsApiAppBrandNFCBase
{
  public static final int CTRL_INDEX = 354;
  public static final String NAME = "sendHCEMessage";
  
  public c()
  {
    GMTrace.i(20718922235904L, 154368);
    GMTrace.o(20718922235904L, 154368);
  }
  
  public static void a(j paramj, int paramInt, String paramString)
  {
    GMTrace.i(20719190671360L, 154370);
    w.i("MicroMsg.JsApiNFCSendHCEResponseCommand", "alvinluo sendHCEMessage callback json: %s", new Object[] { paramString });
    if (paramj != null) {
      paramj.v(paramInt, paramString);
    }
    GMTrace.o(20719190671360L, 154370);
  }
  
  public final void a(final j paramj, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(20719056453632L, 154369);
    super.a(paramj, paramJSONObject, paramInt);
    a(new JsApiAppBrandNFCBase.a()
    {
      public final void z(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(20714493050880L, 154335);
        Object localObject1 = new HashMap();
        ((Map)localObject1).put("errCode", Integer.valueOf(paramAnonymousInt));
        if (paramAnonymousInt == 0)
        {
          paramAnonymousString = c.this;
          localObject1 = paramj;
          paramAnonymousInt = paramInt;
          Object localObject2 = paramJSONObject;
          HashMap localHashMap = new HashMap();
          localObject2 = ((JSONObject)localObject2).optString("data");
          if (bg.nm((String)localObject2))
          {
            localHashMap.put("errCode", Integer.valueOf(13005));
            c.a((j)localObject1, paramAnonymousInt, paramAnonymousString.d("fail", localHashMap));
            GMTrace.o(20714493050880L, 154335);
            return;
          }
          Bundle localBundle = new Bundle();
          localBundle.putString("key_apdu_command", (String)localObject2);
          HCEEventLogic.c(((j)localObject1).hyD, 32, localBundle);
          localHashMap.put("errCode", Integer.valueOf(0));
          ((j)localObject1).v(paramAnonymousInt, paramAnonymousString.d("ok", localHashMap));
          GMTrace.o(20714493050880L, 154335);
          return;
        }
        c.a(paramj, paramInt, c.this.d("fail: " + paramAnonymousString, (Map)localObject1));
        GMTrace.o(20714493050880L, 154335);
      }
    });
    GMTrace.o(20719056453632L, 154369);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\nfc\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */