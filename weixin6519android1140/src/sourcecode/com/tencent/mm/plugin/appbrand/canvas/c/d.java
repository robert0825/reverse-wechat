package com.tencent.mm.plugin.appbrand.canvas.c;

import android.graphics.Path;
import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
{
  private Map<String, a> hOe;
  
  public d()
  {
    GMTrace.i(10206989778944L, 76048);
    this.hOe = new HashMap();
    a(new g());
    a(new e());
    a(new f());
    a(new h());
    a(new c());
    a(new b());
    a(new i());
    GMTrace.o(10206989778944L, 76048);
  }
  
  private void a(a parama)
  {
    GMTrace.i(10207258214400L, 76050);
    this.hOe.put(parama.getMethod(), parama);
    GMTrace.o(10207258214400L, 76050);
  }
  
  public final Path d(JSONArray paramJSONArray)
  {
    GMTrace.i(10207123996672L, 76049);
    Path localPath = new Path();
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
    {
      GMTrace.o(10207123996672L, 76049);
      return localPath;
    }
    int i = 0;
    while (i < paramJSONArray.length())
    {
      Object localObject2 = paramJSONArray.optJSONObject(i);
      if (localObject2 != null)
      {
        Object localObject1 = ((JSONObject)localObject2).optString("method");
        localObject2 = ((JSONObject)localObject2).optJSONArray("data");
        localObject1 = (a)this.hOe.get(localObject1);
        if (localObject1 != null) {
          ((a)localObject1).a(localPath, (JSONArray)localObject2);
        }
      }
      i += 1;
    }
    GMTrace.o(10207123996672L, 76049);
    return localPath;
  }
  
  private static final class a
  {
    public static d hOf;
    
    static
    {
      GMTrace.i(20001528479744L, 149023);
      hOf = new d();
      GMTrace.o(20001528479744L, 149023);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */