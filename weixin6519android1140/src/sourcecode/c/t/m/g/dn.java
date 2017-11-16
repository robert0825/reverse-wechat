package c.t.m.g;

import org.json.JSONException;
import org.json.JSONObject;

final class dn
{
  public String a;
  public String b;
  public int c;
  
  dn() {}
  
  public dn(JSONObject paramJSONObject)
  {
    try
    {
      this.a = paramJSONObject.getString("bid");
      this.b = paramJSONObject.getString("floor");
      this.c = paramJSONObject.getInt("type");
      return;
    }
    catch (JSONException paramJSONObject)
    {
      throw paramJSONObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\dn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */