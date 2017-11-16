package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.go;
import com.tencent.mm.g.a.go.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class v
{
  static void a(go paramgo)
  {
    GMTrace.i(12624519495680L, 94060);
    paramgo = paramgo.eJG.eJB;
    w.d("MicroMsg.GameJsapiProcessor", "writeMsg param=%s", new Object[] { paramgo });
    if (paramgo != null)
    {
      try
      {
        paramgo = new JSONObject(paramgo);
        if ((paramgo.isNull("type")) || (bg.getInt(paramgo.optString("type"), 0) == 0))
        {
          new JSONArray();
          paramgo = paramgo.getJSONArray("localIdList");
          int j = paramgo.length();
          long[] arrayOfLong = new long[j];
          int i = 0;
          while (i < j)
          {
            arrayOfLong[i] = paramgo.getLong(i);
            i += 1;
          }
          SubCoreGameCenter.aGf().e(arrayOfLong);
          GMTrace.o(12624519495680L, 94060);
          return;
        }
        if (bg.getInt(paramgo.optString("type"), 0) == 65536)
        {
          SubCoreGameCenter.aGf().eZ("GameRawMessage", "update GameRawMessage set isRead=1 where 1=1");
          GMTrace.o(12624519495680L, 94060);
          return;
        }
      }
      catch (JSONException paramgo)
      {
        w.w("MicroMsg.GameJsapiProcessor", "JSONException : %s", new Object[] { paramgo.getMessage() });
        GMTrace.o(12624519495680L, 94060);
        return;
      }
      GMTrace.o(12624519495680L, 94060);
      return;
    }
    GMTrace.o(12624519495680L, 94060);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */