package c.t.m.g;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class bq
  extends bi
{
  private static boolean a = false;
  
  public final void a(be parambe)
  {
    Object localObject3 = new bh();
    Object localObject2 = new bg();
    Object localObject1 = new bf();
    try
    {
      if ((ce.a(((bg)localObject2).b)) || (!a))
      {
        parambe.a.put("needUpdateState", Integer.valueOf(1));
        a = true;
      }
      for (;;)
      {
        if (ce.a(((bg)localObject2).b))
        {
          JSONObject localJSONObject = new JSONObject();
          localJSONObject.put("model", ((bh)localObject3).a);
          localJSONObject.put("osVersion", ((bh)localObject3).b);
          localJSONObject.put("imei", ((bh)localObject3).c);
          localJSONObject.put("imsi", ((bh)localObject3).d);
          localJSONObject.put("pseudoId", ((bh)localObject3).e);
          parambe.a.put("RegistDeviceInfo", localJSONObject);
        }
        localObject3 = new JSONObject();
        ((JSONObject)localObject3).put("platform", ((bg)localObject2).a);
        ((JSONObject)localObject3).put("deviceId", ((bg)localObject2).b);
        ((JSONObject)localObject3).put("sdkVersion", ((bg)localObject2).c);
        parambe.a.put("BindDeviceInfo", localObject3);
        localObject2 = new JSONObject();
        ((JSONObject)localObject2).put("bundle", ((bf)localObject1).a);
        ((JSONObject)localObject2).put("verCode", ((bf)localObject1).b);
        ((JSONObject)localObject2).put("verName", ((bf)localObject1).c);
        ((JSONObject)localObject2).put("appId", ((bf)localObject1).e);
        ((JSONObject)localObject2).put("uuid", ((bf)localObject1).d);
        localObject1 = new JSONArray();
        ((JSONArray)localObject1).put(localObject2);
        parambe.a.put("AppState", localObject1);
        localObject1 = bz.a(o.g());
        parambe.a.put("netType", localObject1);
        localObject1 = bc.a(o.j().intValue());
        parambe.a.put("oper", localObject1);
        return;
        parambe.a.put("needUpdateState", Integer.valueOf(0));
      }
      return;
    }
    catch (Exception parambe) {}
  }
  
  public final void a(JSONObject paramJSONObject)
  {
    try
    {
      String str1 = paramJSONObject.optString("result");
      boolean bool = TextUtils.isEmpty(str1);
      if (!bool) {
        try
        {
          if (Integer.parseInt(str1) == 1002)
          {
            bz.a("");
            return;
          }
        }
        catch (Throwable localThrowable) {}
      }
      String str2 = paramJSONObject.optString("deviceId");
      if (!TextUtils.isEmpty(str2))
      {
        String str3 = bz.a();
        if ((!TextUtils.isEmpty(str2)) && (!str2.equals(str3))) {
          bz.a(str2);
        }
      }
      for (;;)
      {
        paramJSONObject = paramJSONObject.optString("oper");
        if (TextUtils.isEmpty(paramJSONObject)) {
          break;
        }
        bc.a().a(o.b(), paramJSONObject);
        return;
        bz.a("");
      }
      return;
    }
    catch (Throwable paramJSONObject) {}
  }
  
  public final String c()
  {
    return "state";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */