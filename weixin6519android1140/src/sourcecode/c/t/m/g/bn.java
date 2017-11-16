package c.t.m.g;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

public final class bn
  extends bi
{
  z a = new z();
  
  public bn()
  {
    String str = l.a().getSharedPreferences("Halley_Cloud_Param_Content_" + l.b() + "_for_SettingsHandler", 0).getString("halley_cloud_param_content", "");
    if (!TextUtils.isEmpty(str)) {}
    try
    {
      this.a.a(str);
      return;
    }
    catch (Throwable localThrowable)
    {
      l.a().getSharedPreferences("Halley_Cloud_Param_Content_" + l.b() + "_for_SettingsHandler", 0).edit().putString("halley_cloud_param_content", "").commit();
    }
  }
  
  public final void a(be parambe)
  {
    String str = this.a.c();
    parambe.a.put("confVersion", str);
  }
  
  public final void a(JSONObject paramJSONObject)
  {
    try
    {
      paramJSONObject = paramJSONObject.optJSONObject("Setting");
      if (paramJSONObject != null)
      {
        paramJSONObject = paramJSONObject.optString("data");
        if (!TextUtils.isEmpty(paramJSONObject))
        {
          this.a.a(paramJSONObject);
          paramJSONObject = this.a.a.toString();
          l.a().getSharedPreferences("Halley_Cloud_Param_Content_" + l.b() + "_for_SettingsHandler", 0).edit().putString("halley_cloud_param_content", paramJSONObject).commit();
        }
      }
      return;
    }
    catch (Throwable paramJSONObject) {}finally
    {
      l.j().post(new bo(this));
    }
  }
  
  public final void b()
  {
    l.j().post(new bo(this));
  }
  
  public final String c()
  {
    return "settings";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */