package com.tencent.mm.plugin.address.e;

import android.util.Log;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.o.a.b;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
{
  public static String a(b paramb)
  {
    GMTrace.i(18471312162816L, 137622);
    JSONObject localJSONObject = new JSONObject();
    if (paramb == null)
    {
      paramb = localJSONObject.toString();
      GMTrace.o(18471312162816L, 137622);
      return paramb;
    }
    try
    {
      localJSONObject.put("type", paramb.type);
      if ((paramb.type != null) && (paramb.type.equals("1")))
      {
        localJSONObject.put("title", paramb.mhR);
        localJSONObject.put("taxNumber", "");
        localJSONObject.put("companyAddress", "");
        localJSONObject.put("telephone", "");
        localJSONObject.put("bankName", "");
        localJSONObject.put("bankAccount", "");
      }
      for (;;)
      {
        paramb = localJSONObject.toString();
        GMTrace.o(18471312162816L, 137622);
        return paramb;
        localJSONObject.put("title", paramb.title);
        if (paramb.mhS == null) {
          break;
        }
        localJSONObject.put("taxNumber", paramb.mhS);
        if (paramb.mhY == null) {
          break label274;
        }
        localJSONObject.put("companyAddress", paramb.mhY);
        if (paramb.mhW == null) {
          break label286;
        }
        localJSONObject.put("telephone", paramb.mhW);
        if (paramb.mhU == null) {
          break label298;
        }
        localJSONObject.put("bankName", paramb.mhU);
        if (paramb.mhT == null) {
          break label310;
        }
        localJSONObject.put("bankAccount", paramb.mhT);
      }
    }
    catch (JSONException paramb)
    {
      for (;;)
      {
        w.e("MicroMsg.InvoiceUtil", "put json value error : %s", new Object[] { Log.getStackTraceString(paramb) });
        continue;
        localJSONObject.put("taxNumber", "");
        continue;
        label274:
        localJSONObject.put("companyAddress", "");
        continue;
        label286:
        localJSONObject.put("telephone", "");
        continue;
        label298:
        localJSONObject.put("bankName", "");
        continue;
        label310:
        localJSONObject.put("bankAccount", "");
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\e\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */