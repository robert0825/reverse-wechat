package c.t.m.g;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

final class ax
  implements Runnable
{
  ax(aw paramaw) {}
  
  public final void run()
  {
    Object localObject1 = o.b();
    aw localaw = this.a;
    Object localObject2 = this.a.a.a((String)localObject1);
    try
    {
      if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (!ce.a((byte[])localObject2)))
      {
        localObject2 = new JSONObject(new String((byte[])localObject2));
        localObject1 = new p((String)localObject1);
        ((JSONObject)localObject2).getString("ipInfo");
        localObject2 = ((JSONObject)localObject2).optJSONObject("resultMap");
        if (localObject2 != null)
        {
          Iterator localIterator = ((JSONObject)localObject2).keys();
          while (localIterator.hasNext())
          {
            JSONArray localJSONArray = ((JSONObject)localObject2).optJSONArray((String)localIterator.next());
            if (localJSONArray != null) {
              aw.a((p)localObject1, localJSONArray);
            }
          }
        }
        localaw.b = ((p)localObject1);
        return;
      }
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */