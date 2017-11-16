package com.tencent.b.a.a;

import org.json.JSONException;
import org.json.JSONObject;

final class a
{
  public static String aKp = "ts";
  public static String aKq = "times";
  public static String aKr = "mfreq";
  public static String aKs = "mdays";
  long aKl = 0L;
  int aKm = 0;
  int aKn = 100;
  int aKo = 3;
  
  a() {}
  
  a(String paramString)
  {
    if (!s.aU(paramString)) {}
    for (;;)
    {
      return;
      try
      {
        paramString = new JSONObject(paramString);
        if (!paramString.isNull(aKp)) {
          this.aKl = paramString.getLong(aKp);
        }
        if (!paramString.isNull(aKr)) {
          this.aKn = paramString.getInt(aKr);
        }
        if (!paramString.isNull(aKq)) {
          this.aKm = paramString.getInt(aKq);
        }
        if (!paramString.isNull(aKs))
        {
          this.aKo = paramString.getInt(aKs);
          return;
        }
      }
      catch (JSONException paramString) {}
    }
  }
  
  public final String toString()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(aKp, this.aKl);
      localJSONObject.put(aKq, this.aKm);
      localJSONObject.put(aKr, this.aKn);
      localJSONObject.put(aKs, this.aKo);
      return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\b\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */