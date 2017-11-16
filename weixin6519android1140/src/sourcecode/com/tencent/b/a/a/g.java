package com.tencent.b.a.a;

import org.json.JSONException;
import org.json.JSONObject;

final class g
{
  String aGO = null;
  String aKJ = null;
  String aKK = "0";
  long aKL = 0L;
  
  static g aT(String paramString)
  {
    g localg = new g();
    if (s.aU(paramString)) {}
    try
    {
      paramString = new JSONObject(paramString);
      if (!paramString.isNull("ui")) {
        localg.aGO = paramString.getString("ui");
      }
      if (!paramString.isNull("mc")) {
        localg.aKJ = paramString.getString("mc");
      }
      if (!paramString.isNull("mid")) {
        localg.aKK = paramString.getString("mid");
      }
      if (!paramString.isNull("ts")) {
        localg.aKL = paramString.getLong("ts");
      }
      return localg;
    }
    catch (JSONException paramString) {}
    return localg;
  }
  
  private JSONObject ok()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      s.a(localJSONObject, "ui", this.aGO);
      s.a(localJSONObject, "mc", this.aKJ);
      s.a(localJSONObject, "mid", this.aKK);
      localJSONObject.put("ts", this.aKL);
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return localJSONObject;
  }
  
  final int a(g paramg)
  {
    if (paramg == null) {}
    do
    {
      do
      {
        return 1;
        if ((!s.aV(this.aKK)) || (!s.aV(paramg.aKK))) {
          break;
        }
        if (this.aKK.equals(paramg.aKK)) {
          return 0;
        }
      } while (this.aKL >= paramg.aKL);
      return -1;
    } while (s.aV(this.aKK));
    return -1;
  }
  
  public final String toString()
  {
    return ok().toString();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\b\a\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */