package c.t.m.g;

import org.json.JSONException;
import org.json.JSONObject;

final class do
{
  public double a;
  public double b;
  public double c;
  public float d;
  public String e;
  public String f;
  
  do() {}
  
  public do(JSONObject paramJSONObject)
  {
    try
    {
      this.a = paramJSONObject.getDouble("latitude");
      this.b = paramJSONObject.getDouble("longitude");
      this.c = paramJSONObject.getDouble("altitude");
      this.d = ((float)paramJSONObject.getDouble("accuracy"));
      this.e = paramJSONObject.optString("name");
      this.f = paramJSONObject.optString("addr");
      return;
    }
    catch (JSONException paramJSONObject)
    {
      throw paramJSONObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */