package c.t.m.g;

import android.os.Bundle;
import com.tencent.map.geolocation.TencentPoi;
import java.util.ArrayList;
import java.util.Iterator;
import org.eclipse.jdt.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class dl
{
  public int a;
  public final ArrayList<TencentPoi> b = new ArrayList();
  public dq c;
  
  dl() {}
  
  public dl(JSONObject paramJSONObject)
  {
    this.a = paramJSONObject.optInt("stat");
    if (paramJSONObject.has("subnation")) {
      this.c = new dq(paramJSONObject.optJSONObject("subnation"));
    }
    for (;;)
    {
      paramJSONObject = paramJSONObject.optJSONArray("poilist");
      if (paramJSONObject != null) {
        try
        {
          int j = paramJSONObject.length();
          int i = 0;
          for (;;)
          {
            if (i < j)
            {
              dp localdp = new dp(paramJSONObject.getJSONObject(i));
              this.b.add(localdp);
              i += 1;
              continue;
              if (paramJSONObject.has("results"))
              {
                this.c = a(paramJSONObject.optJSONArray("results"));
                break;
              }
              this.c = dq.a;
              new StringBuilder("DetailsData: unknown json ").append(paramJSONObject.toString());
            }
          }
        }
        catch (JSONException paramJSONObject) {}
      }
    }
  }
  
  private static dq a(@Nullable JSONArray paramJSONArray)
  {
    int i = 2;
    if (paramJSONArray == null) {
      localObject1 = null;
    }
    dq localdq;
    int j;
    Object localObject2;
    do
    {
      return (dq)localObject1;
      localdq = dq.a(dq.a);
      j = paramJSONArray.length();
      if (j > 0)
      {
        localObject1 = paramJSONArray.optJSONObject(0);
        localdq.b = ((JSONObject)localObject1).optString("n");
        localdq.e = ((JSONObject)localObject1).optString("p");
        localdq.f = ((JSONObject)localObject1).optString("c");
        localdq.g = ((JSONObject)localObject1).optString("d");
        localdq.d = ((JSONObject)localObject1).optString("adcode");
      }
      if (j > 1)
      {
        localObject1 = paramJSONArray.optJSONObject(1);
        localObject2 = ((JSONObject)localObject1).optString("address_name");
        localdq.m.putString("addrdesp.name", (String)localObject2);
        localObject2 = ((JSONObject)localObject1).optJSONObject("landmark");
        localObject1 = ((JSONObject)localObject1).optJSONObject("second_landmark");
        if (localObject2 != null) {
          localdq.m.putParcelable("addrdesp.landmark", new dk((JSONObject)localObject2));
        }
        if (localObject1 != null) {
          localdq.m.putParcelable("addrdesp.second_landmark", new dk((JSONObject)localObject1));
        }
      }
      localObject1 = localdq;
    } while (j <= 2);
    Object localObject1 = new ArrayList();
    if (i < j)
    {
      localObject2 = new dk(paramJSONArray.optJSONObject(i));
      ((ArrayList)localObject1).add(localObject2);
      if ("ST".equals(((dk)localObject2).b)) {
        localdq.j = ((dk)localObject2).a;
      }
      for (;;)
      {
        i += 1;
        break;
        if ("ST_NO".equals(((dk)localObject2).b)) {
          localdq.k = ((dk)localObject2).a;
        }
      }
    }
    localdq.m.putParcelableArrayList("addrdesp.results", (ArrayList)localObject1);
    return localdq;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("DetailsData{");
    localStringBuilder.append("subnation=").append(this.c).append(",");
    localStringBuilder.append("poilist=[");
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext()) {
      localStringBuilder.append((TencentPoi)localIterator.next()).append(",");
    }
    localStringBuilder.append("]");
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */