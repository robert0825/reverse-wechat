package c.t.m.g;

import android.os.Handler;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class bk
  extends bi
{
  bj a = new bj("HttpSchedulerHandler");
  
  public final void a()
  {
    l.j().post(new bl(this, null, null));
  }
  
  public final void a(be parambe)
  {
    try
    {
      localJSONObject2 = new JSONObject();
      Object localObject = this.a;
      o.e();
      localObject = ((bj)localObject).a(o.b());
      if (!ce.a((byte[])localObject))
      {
        localObject = new JSONObject(new String((byte[])localObject));
        if (localObject != null)
        {
          localObject = ((JSONObject)localObject).optJSONObject("resultMap");
          if (localObject != null)
          {
            Iterator localIterator = ((JSONObject)localObject).keys();
            while (localIterator.hasNext())
            {
              String str = (String)localIterator.next();
              JSONArray localJSONArray = ((JSONObject)localObject).optJSONArray(str);
              if (localJSONArray != null)
              {
                JSONObject localJSONObject3 = new JSONObject();
                int i = 0;
                while (i < localJSONArray.length())
                {
                  JSONObject localJSONObject4 = localJSONArray.getJSONObject(i);
                  localJSONObject3.put(localJSONObject4.optString("unit"), localJSONObject4.optString("schedulecode"));
                  i += 1;
                }
                localJSONObject2.put(str, localJSONObject3);
              }
            }
          }
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          localJSONObject1 = new JSONObject();
          localJSONObject1.put(l.b(), new JSONObject());
          parambe.a.put("directScheduleCodes", localJSONObject1);
          return;
        }
        catch (Exception parambe)
        {
          JSONObject localJSONObject2;
          return;
        }
        localJSONObject2.put(l.b(), new JSONObject());
        parambe.a.put("directScheduleCodes", localJSONObject2);
        return;
        localJSONObject2.put(l.b(), new JSONObject());
        continue;
        JSONObject localJSONObject1 = null;
      }
    }
  }
  
  public final void a(JSONObject paramJSONObject)
  {
    try
    {
      paramJSONObject = paramJSONObject.optJSONObject("AccessScheduleRsp");
      if (paramJSONObject != null)
      {
        paramJSONObject = paramJSONObject.toString();
        if (!ce.a(paramJSONObject))
        {
          paramJSONObject = paramJSONObject.getBytes();
          if (!ce.a(paramJSONObject))
          {
            String str = o.b();
            this.a.a(str, paramJSONObject);
            l.j().post(new bl(this, str, paramJSONObject));
          }
        }
      }
      return;
    }
    catch (Throwable paramJSONObject) {}
  }
  
  public final String c()
  {
    return "accessscheduler";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */