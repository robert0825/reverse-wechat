package com.tencent.mm.plugin.appbrand.jsapi.base;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.n.c;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class d
  extends a
{
  public d()
  {
    GMTrace.i(10464553598976L, 77967);
    GMTrace.o(10464553598976L, 77967);
  }
  
  protected static float[] i(JSONObject paramJSONObject)
  {
    GMTrace.i(20368077094912L, 151754);
    try
    {
      JSONObject localJSONObject = new JSONObject(paramJSONObject.optString("position"));
      float f1 = c.a(localJSONObject, "left", 0.0F);
      float f2 = c.a(localJSONObject, "top", 0.0F);
      float f3 = c.a(localJSONObject, "width", 0.0F);
      float f4 = c.a(localJSONObject, "height", 0.0F);
      float f5 = paramJSONObject.optInt("zIndex", 0);
      GMTrace.o(20368077094912L, 151754);
      return new float[] { f1, f2, f3, f4, f5 };
    }
    catch (Exception paramJSONObject)
    {
      GMTrace.o(20368077094912L, 151754);
    }
    return null;
  }
  
  protected static int j(JSONObject paramJSONObject)
  {
    GMTrace.i(17842770542592L, 132939);
    for (int i = -1;; i = 0)
    {
      try
      {
        boolean bool = paramJSONObject.getBoolean("hide");
        if (!bool) {
          continue;
        }
        i = 4;
      }
      catch (JSONException paramJSONObject)
      {
        for (;;) {}
      }
      GMTrace.o(17842770542592L, 132939);
      return i;
    }
  }
  
  public int h(JSONObject paramJSONObject)
  {
    GMTrace.i(10464822034432L, 77969);
    throw new JSONException("viewId do not exist, override the method getViewId(data).");
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\base\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */