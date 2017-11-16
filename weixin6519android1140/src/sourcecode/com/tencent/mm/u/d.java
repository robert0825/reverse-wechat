package com.tencent.mm.u;

import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import junit.framework.Assert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  implements c
{
  private JSONObject fXL;
  
  public d()
  {
    GMTrace.i(20819182878720L, 155115);
    this.fXL = new JSONObject();
    GMTrace.o(20819182878720L, 155115);
  }
  
  public d(String paramString)
  {
    GMTrace.i(20819317096448L, 155116);
    try
    {
      this.fXL = new JSONObject(paramString);
      GMTrace.o(20819317096448L, 155116);
      return;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  d(JSONObject paramJSONObject)
  {
    GMTrace.i(20819451314176L, 155117);
    Assert.assertNotNull(paramJSONObject);
    this.fXL = paramJSONObject;
    GMTrace.o(20819451314176L, 155117);
  }
  
  public final c a(String paramString, double paramDouble)
  {
    GMTrace.i(20819853967360L, 155120);
    try
    {
      this.fXL.put(paramString, paramDouble);
      GMTrace.o(20819853967360L, 155120);
      return this;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final c eA(String paramString)
  {
    GMTrace.i(20823075192832L, 155144);
    try
    {
      paramString = this.fXL.getJSONObject(paramString);
      if (paramString == null)
      {
        GMTrace.o(20823075192832L, 155144);
        return null;
      }
      paramString = new d(paramString);
      GMTrace.o(20823075192832L, 155144);
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final c eB(String paramString)
  {
    GMTrace.i(20823209410560L, 155145);
    paramString = this.fXL.optJSONObject(paramString);
    if (paramString == null)
    {
      GMTrace.o(20823209410560L, 155145);
      return null;
    }
    paramString = new d(paramString);
    GMTrace.o(20823209410560L, 155145);
    return paramString;
  }
  
  public final String ex(String paramString)
  {
    GMTrace.i(20820525056000L, 155125);
    if (paramString == null) {
      throw new f("Names must be non-null");
    }
    GMTrace.o(20820525056000L, 155125);
    return paramString;
  }
  
  public final a ey(String paramString)
  {
    GMTrace.i(20822806757376L, 155142);
    try
    {
      paramString = this.fXL.getJSONArray(paramString);
      if (paramString == null)
      {
        GMTrace.o(20822806757376L, 155142);
        return null;
      }
      paramString = new b(paramString);
      GMTrace.o(20822806757376L, 155142);
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final a ez(String paramString)
  {
    GMTrace.i(20822940975104L, 155143);
    paramString = this.fXL.optJSONArray(paramString);
    if (paramString == null)
    {
      GMTrace.o(20822940975104L, 155143);
      return null;
    }
    paramString = new b(paramString);
    GMTrace.o(20822940975104L, 155143);
    return paramString;
  }
  
  public final c f(String paramString, long paramLong)
  {
    GMTrace.i(20820122402816L, 155122);
    try
    {
      this.fXL.put(paramString, paramLong);
      GMTrace.o(20820122402816L, 155122);
      return this;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final Object get(String paramString)
  {
    GMTrace.i(20821061926912L, 155129);
    try
    {
      paramString = this.fXL.get(paramString);
      if ((paramString instanceof JSONObject))
      {
        paramString = new d((JSONObject)paramString);
        GMTrace.o(20821061926912L, 155129);
        return paramString;
      }
      if ((paramString instanceof JSONArray))
      {
        paramString = new b((JSONArray)paramString);
        GMTrace.o(20821061926912L, 155129);
        return paramString;
      }
      GMTrace.o(20821061926912L, 155129);
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final boolean getBoolean(String paramString)
  {
    GMTrace.i(20821330362368L, 155131);
    try
    {
      boolean bool = this.fXL.getBoolean(paramString);
      GMTrace.o(20821330362368L, 155131);
      return bool;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final double getDouble(String paramString)
  {
    GMTrace.i(20821598797824L, 155133);
    try
    {
      double d = this.fXL.getDouble(paramString);
      GMTrace.o(20821598797824L, 155133);
      return d;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final int getInt(String paramString)
  {
    GMTrace.i(20821867233280L, 155135);
    try
    {
      int i = this.fXL.getInt(paramString);
      GMTrace.o(20821867233280L, 155135);
      return i;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final long getLong(String paramString)
  {
    GMTrace.i(20822135668736L, 155137);
    try
    {
      long l = this.fXL.getLong(paramString);
      GMTrace.o(20822135668736L, 155137);
      return l;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final String getString(String paramString)
  {
    GMTrace.i(20822404104192L, 155139);
    try
    {
      paramString = this.fXL.getString(paramString);
      GMTrace.o(20822404104192L, 155139);
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final boolean has(String paramString)
  {
    GMTrace.i(20820927709184L, 155128);
    boolean bool = this.fXL.has(paramString);
    GMTrace.o(20820927709184L, 155128);
    return bool;
  }
  
  public final boolean isNull(String paramString)
  {
    GMTrace.i(20820793491456L, 155127);
    boolean bool = this.fXL.isNull(paramString);
    GMTrace.o(20820793491456L, 155127);
    return bool;
  }
  
  public final c k(String paramString, Object paramObject)
  {
    GMTrace.i(20820256620544L, 155123);
    try
    {
      this.fXL.put(paramString, paramObject);
      GMTrace.o(20820256620544L, 155123);
      return this;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final c k(String paramString, boolean paramBoolean)
  {
    GMTrace.i(20819719749632L, 155119);
    try
    {
      this.fXL.put(paramString, paramBoolean);
      GMTrace.o(20819719749632L, 155119);
      return this;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final Iterator<String> keys()
  {
    GMTrace.i(20823343628288L, 155146);
    Iterator localIterator = this.fXL.keys();
    GMTrace.o(20823343628288L, 155146);
    return localIterator;
  }
  
  public final c l(String paramString, Object paramObject)
  {
    GMTrace.i(20820390838272L, 155124);
    try
    {
      this.fXL.put(paramString, paramObject);
      GMTrace.o(20820390838272L, 155124);
      return this;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final int length()
  {
    GMTrace.i(20819585531904L, 155118);
    int i = this.fXL.length();
    GMTrace.o(20819585531904L, 155118);
    return i;
  }
  
  public final Object opt(String paramString)
  {
    GMTrace.i(20821196144640L, 155130);
    try
    {
      paramString = this.fXL.get(paramString);
      if ((paramString instanceof JSONObject))
      {
        paramString = new d((JSONObject)paramString);
        GMTrace.o(20821196144640L, 155130);
        return paramString;
      }
      if ((paramString instanceof JSONArray))
      {
        paramString = new b((JSONArray)paramString);
        GMTrace.o(20821196144640L, 155130);
        return paramString;
      }
      GMTrace.o(20821196144640L, 155130);
      return paramString;
    }
    catch (JSONException paramString)
    {
      GMTrace.o(20821196144640L, 155130);
    }
    return null;
  }
  
  public final boolean optBoolean(String paramString, boolean paramBoolean)
  {
    GMTrace.i(20821464580096L, 155132);
    paramBoolean = this.fXL.optBoolean(paramString, paramBoolean);
    GMTrace.o(20821464580096L, 155132);
    return paramBoolean;
  }
  
  public final double optDouble(String paramString, double paramDouble)
  {
    GMTrace.i(20821733015552L, 155134);
    paramDouble = this.fXL.optDouble(paramString, paramDouble);
    GMTrace.o(20821733015552L, 155134);
    return paramDouble;
  }
  
  public final int optInt(String paramString, int paramInt)
  {
    GMTrace.i(20822001451008L, 155136);
    paramInt = this.fXL.optInt(paramString, paramInt);
    GMTrace.o(20822001451008L, 155136);
    return paramInt;
  }
  
  public final long optLong(String paramString, long paramLong)
  {
    GMTrace.i(20822269886464L, 155138);
    paramLong = this.fXL.optLong(paramString, paramLong);
    GMTrace.o(20822269886464L, 155138);
    return paramLong;
  }
  
  public final String optString(String paramString)
  {
    GMTrace.i(20822538321920L, 155140);
    paramString = this.fXL.optString(paramString);
    GMTrace.o(20822538321920L, 155140);
    return paramString;
  }
  
  public final String optString(String paramString1, String paramString2)
  {
    GMTrace.i(20822672539648L, 155141);
    paramString1 = this.fXL.optString(paramString1, paramString2);
    GMTrace.o(20822672539648L, 155141);
    return paramString1;
  }
  
  public final Object remove(String paramString)
  {
    GMTrace.i(20820659273728L, 155126);
    paramString = this.fXL.remove(paramString);
    GMTrace.o(20820659273728L, 155126);
    return paramString;
  }
  
  public final c s(String paramString, int paramInt)
  {
    GMTrace.i(20819988185088L, 155121);
    try
    {
      this.fXL.put(paramString, paramInt);
      GMTrace.o(20819988185088L, 155121);
      return this;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final String toString()
  {
    GMTrace.i(20823477846016L, 155147);
    String str = this.fXL.toString();
    GMTrace.o(20823477846016L, 155147);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\u\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */