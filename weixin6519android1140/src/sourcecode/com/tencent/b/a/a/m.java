package com.tencent.b.a.a;

import android.content.Context;
import android.util.DisplayMetrics;
import org.json.JSONArray;
import org.json.JSONObject;

final class m
{
  private int aKV = 0;
  private JSONObject aKW = null;
  protected Context context = null;
  
  m(Context paramContext, JSONObject paramJSONObject)
  {
    this.context = paramContext;
    this.aKV = ((int)(System.currentTimeMillis() / 1000L));
    this.aKW = paramJSONObject;
  }
  
  final JSONObject on()
  {
    JSONObject localJSONObject1 = new JSONObject();
    for (;;)
    {
      try
      {
        localJSONObject1.put("ky", "AVF4T76RVR81");
        localJSONObject1.put("et", 2);
        localJSONObject1.put("ts", this.aKV);
        localJSONObject1.put("si", this.aKV);
        s.a(localJSONObject1, "ui", s.W(this.context));
        s.a(localJSONObject1, "mc", s.X(this.context));
        localObject1 = i.S(this.context).om();
        if (s.aV((String)localObject1))
        {
          localJSONObject1.put("mid", localObject1);
          localObject1 = new b(this.context);
          localJSONObject2 = new JSONObject();
        }
      }
      catch (Throwable localThrowable1)
      {
        Object localObject1;
        JSONObject localJSONObject2;
        return localJSONObject1;
      }
      try
      {
        if (b.aKt != null)
        {
          b.a locala = b.aKt;
          localJSONObject2.put("sr", locala.aKy.widthPixels + "*" + locala.aKy.heightPixels);
          s.a(localJSONObject2, "av", locala.aKw);
          s.a(localJSONObject2, "ch", locala.aKC);
          s.a(localJSONObject2, "mf", locala.aKA);
          s.a(localJSONObject2, "sv", locala.aKx);
          s.a(localJSONObject2, "ov", Integer.toString(locala.aKz));
          localJSONObject2.put("os", 1);
          s.a(localJSONObject2, "op", locala.aKD);
          s.a(localJSONObject2, "lg", locala.aKB);
          s.a(localJSONObject2, "md", locala.model);
          s.a(localJSONObject2, "tz", locala.timezone);
          if (locala.aKF != 0) {
            localJSONObject2.put("jb", locala.aKF);
          }
          s.a(localJSONObject2, "sd", locala.aKE);
          s.a(localJSONObject2, "apn", locala.packageName);
          if (s.V(locala.ctx))
          {
            localObject2 = new JSONObject();
            s.a((JSONObject)localObject2, "bs", s.Y(locala.ctx));
            s.a((JSONObject)localObject2, "ss", s.Z(locala.ctx));
            if (((JSONObject)localObject2).length() > 0) {
              s.a(localJSONObject2, "wf", ((JSONObject)localObject2).toString());
            }
          }
          Object localObject2 = s.aa(locala.ctx);
          if ((localObject2 != null) && (((JSONArray)localObject2).length() > 0)) {
            s.a(localJSONObject2, "wflist", ((JSONArray)localObject2).toString());
          }
          s.a(localJSONObject2, "ram", locala.aKG);
          s.a(localJSONObject2, "rom", locala.aKH);
          s.a(localJSONObject2, "im", locala.imsi);
        }
        s.a(localJSONObject2, "cn", ((b)localObject1).aKv);
        if (((b)localObject1).aKu != null) {
          localJSONObject2.put("tn", ((b)localObject1).aKu);
        }
        localJSONObject1.put("ev", localJSONObject2);
      }
      catch (Throwable localThrowable2)
      {
        continue;
      }
      if (this.aKW == null) {
        break;
      }
      localJSONObject1.put("ext", this.aKW);
      return localJSONObject1;
      localJSONObject1.put("mid", "0");
    }
    return localJSONObject1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\b\a\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */